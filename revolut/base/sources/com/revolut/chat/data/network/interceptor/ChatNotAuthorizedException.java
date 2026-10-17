package com.revolut.chat.data.network.interceptor;

import a10.b;
import com.revolut.core.network.exceptions.HandledNetworkException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/chat/data/network/interceptor/ChatNotAuthorizedException;", "Lcom/revolut/core/network/exceptions/HandledNetworkException;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatNotAuthorizedException extends HandledNetworkException {
    public ChatNotAuthorizedException(String str) {
        super(b.t(str, "requestInfo", "Chat token is not available for ", str), 2);
    }
}
