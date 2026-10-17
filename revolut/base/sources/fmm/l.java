package fmm;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements o {
    @Override // fmm.o
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        n.Companion.getClass();
        return n.f136495b && Conscrypt.isConscrypt(sslSocket);
    }

    @Override // fmm.o
    public final q c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new n();
    }
}
