package fmm;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f136496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f136497b;

    public p(o socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f136496a = socketAdapterFactory;
    }

    @Override // fmm.q
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f136496a.a(sslSocket);
    }

    @Override // fmm.q
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        q qVarD = d(sslSocket);
        if (qVarD != null) {
            return qVarD.b(sslSocket);
        }
        return null;
    }

    @Override // fmm.q
    public final void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        q qVarD = d(sslSocket);
        if (qVarD != null) {
            qVarD.c(sslSocket, str, protocols);
        }
    }

    public final synchronized q d(SSLSocket sSLSocket) {
        try {
            if (this.f136497b == null && this.f136496a.a(sSLSocket)) {
                this.f136497b = this.f136496a.c(sSLSocket);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f136497b;
    }

    @Override // fmm.q
    public final boolean isSupported() {
        return true;
    }
}
