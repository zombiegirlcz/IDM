package io.ktor.client.network.sockets;

import java.io.IOException;
import java.net.ConnectException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Ljava/net/ConnectException;", "ktor-client-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectTimeoutException extends ConnectException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOException f163025a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectTimeoutException(String message, IOException iOException) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f163025a = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f163025a;
    }
}
