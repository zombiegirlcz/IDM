package ulm;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g1 {
    public static h1 a(String protocol) throws IOException {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        h1 h1Var = h1.HTTP_1_0;
        if (protocol.equals(h1Var.protocol)) {
            return h1Var;
        }
        h1 h1Var2 = h1.HTTP_1_1;
        if (protocol.equals(h1Var2.protocol)) {
            return h1Var2;
        }
        h1 h1Var3 = h1.H2_PRIOR_KNOWLEDGE;
        if (protocol.equals(h1Var3.protocol)) {
            return h1Var3;
        }
        h1 h1Var4 = h1.HTTP_2;
        if (protocol.equals(h1Var4.protocol)) {
            return h1Var4;
        }
        h1 h1Var5 = h1.SPDY_3;
        if (protocol.equals(h1Var5.protocol)) {
            return h1Var5;
        }
        h1 h1Var6 = h1.QUIC;
        if (protocol.equals(h1Var6.protocol)) {
            return h1Var6;
        }
        h1 h1Var7 = h1.HTTP_3;
        if (kotlin.text.a0.H(protocol, h1Var7.protocol, false)) {
            return h1Var7;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }
}
