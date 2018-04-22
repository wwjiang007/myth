/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one or more
 *  * contributor license agreements.  See the NOTICE file distributed with
 *  * this work for additional information regarding copyright ownership.
 *  * The ASF licenses this file to You under the Apache License, Version 2.0
 *  * (the "License"); you may not use this file except in compliance with
 *  * the License.  You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.github.myth.core.disruptor.translator;


import com.github.myth.annotation.Myth;
import com.github.myth.common.bean.entity.MythTransaction;
import com.github.myth.core.disruptor.event.MythTransactionEvent;
import com.lmax.disruptor.EventTranslatorOneArg;

/**
 * <p>Description: .</p>
 *
 * @author xiaoyu(Myth)
 * @version 1.0
 * @date 2018/3/5 11:54
 * @since JDK 1.8
 */
public class MythTransactionEventTranslator implements EventTranslatorOneArg<MythTransactionEvent, MythTransaction> {

    private int type;

    public MythTransactionEventTranslator(int type) {
        this.type = type;
    }

    @Override
    public void translateTo(MythTransactionEvent mythTransactionEvent, long l,
                            MythTransaction mythTransaction) {
        mythTransactionEvent.setMythTransaction(mythTransaction);
        mythTransactionEvent.setType(type);
    }
}
