package aem;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f3713a = a1m.e.a("io.ktor.client.plugins.HttpTimeout");

    static {
        a1m.e.m("HttpTimeout", c1.f3704a, new d(8));
    }

    public static final SocketTimeoutException a(fem.e request, IOException iOException) {
        Object obj2;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb6 = new StringBuilder("Socket timeout has expired [url=");
        sb6.append(request.f134660a);
        sb6.append(", socket_timeout=");
        b1 b1Var = (b1) request.a();
        if (b1Var == null || (obj2 = b1Var.f3697c) == null) {
            obj2 = "unknown";
        }
        sb6.append(obj2);
        sb6.append("] ms");
        String message = sb6.toString();
        Intrinsics.checkNotNullParameter(message, "message");
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(message);
        socketTimeoutException.initCause(iOException);
        return socketTimeoutException;
    }
}
