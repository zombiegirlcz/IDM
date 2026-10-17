package ulm;

import java.io.IOException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q0 {
    public static r0 a(SSLSession sSLSession) throws IOException {
        Object objR;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        v vVarB = v.Companion.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        v1.Companion.getClass();
        v1 v1VarA = u1.a(protocol);
        try {
            objR = vlm.j.r(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objR = zhm.f0.f322471a;
        }
        return new r0(v1VarA, vVarB, vlm.j.r(sSLSession.getLocalCertificates()), new p0(objR, 0));
    }
}
