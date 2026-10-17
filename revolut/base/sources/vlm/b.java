package vlm;

import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ulm.a0;
import ulm.a1;
import ulm.b1;
import ulm.v;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b {
    public static final Charset a(b1 b1Var) {
        if (b1Var != null) {
            a1 a1Var = b1.Companion;
            Charset charsetA = b1Var.a(null);
            if (charsetA != null) {
                return charsetA;
            }
        }
        return Charsets.UTF_8;
    }

    public static final Pair b(b1 b1Var) {
        Charset charset = Charsets.UTF_8;
        if (b1Var != null) {
            a1 a1Var = b1.Companion;
            Charset charsetA = b1Var.a(null);
            if (charsetA == null) {
                b1.Companion.getClass();
                b1Var = a1.b(b1Var + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        return new Pair(charset, b1Var);
    }

    public static final String[] c(a0 a0Var, String[] socketEnabledCipherSuites) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        String[] strArr = a0Var.f281064c;
        if (strArr == null) {
            return socketEnabledCipherSuites;
        }
        v.Companion.getClass();
        return h.t(strArr, socketEnabledCipherSuites, v.f281143b);
    }
}
