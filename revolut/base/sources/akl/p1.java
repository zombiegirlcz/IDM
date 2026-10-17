package akl;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes12.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak0.a f6072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak0.c f6073b;

    public p1(ak0.a instrumentationTestDecorator, ak0.c loggingDecorator) {
        Intrinsics.checkNotNullParameter(instrumentationTestDecorator, "instrumentationTestDecorator");
        Intrinsics.checkNotNullParameter(loggingDecorator, "loggingDecorator");
        this.f6072a = instrumentationTestDecorator;
        this.f6073b = loggingDecorator;
    }

    public final OkHttpClient a(SocketFactory socketFactory) {
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        OkHttpClient.a aVar = new OkHttpClient.a();
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        if (socketFactory instanceof SSLSocketFactory) {
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
        }
        if (!socketFactory.equals(aVar.f226079p)) {
            aVar.E = null;
        }
        aVar.f226079p = socketFactory;
        this.f6072a.a(aVar);
        this.f6073b.a(aVar);
        return new OkHttpClient(aVar);
    }
}
