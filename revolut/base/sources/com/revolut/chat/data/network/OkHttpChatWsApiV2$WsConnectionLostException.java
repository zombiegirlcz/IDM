package com.revolut.chat.data.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/chat/data/network/OkHttpChatWsApiV2$WsConnectionLostException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OkHttpChatWsApiV2$WsConnectionLostException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50996a;

    public OkHttpChatWsApiV2$WsConnectionLostException() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OkHttpChatWsApiV2$WsConnectionLostException) && Intrinsics.f(this.f50996a, ((OkHttpChatWsApiV2$WsConnectionLostException) obj2).f50996a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f50996a;
    }

    public final int hashCode() {
        return this.f50996a.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpChatWsApiV2$WsConnectionLostException(int i) {
        super("ws connection loss");
        Intrinsics.checkNotNullParameter("ws connection loss", "message");
        this.f50996a = "ws connection loss";
    }
}
