package com.revolut.chat.domain.model.rate;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/domain/model/rate/ChatRateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "UnableToCloseInitiatedByAgentTicket", "Lcom/revolut/chat/domain/model/rate/ChatRateException$UnableToCloseInitiatedByAgentTicket;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatRateException extends IllegalStateException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/domain/model/rate/ChatRateException$UnableToCloseInitiatedByAgentTicket;", "Lcom/revolut/chat/domain/model/rate/ChatRateException;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnableToCloseInitiatedByAgentTicket extends ChatRateException {
        public UnableToCloseInitiatedByAgentTicket() {
            super(0);
        }
    }

    public /* synthetic */ ChatRateException(int i) {
        this();
    }

    private ChatRateException() {
    }
}
