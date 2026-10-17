package m1i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface k extends e0m.d, c2i.j {
    static pfm.n P(k kVar, xi0.b currency, String str, wd6.i iVar, int i) {
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            iVar = null;
        }
        g1i.d0 d0Var = (g1i.d0) kVar;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return d0Var.R3(new ael.s(2, currency, d0Var, str, iVar, z));
    }
}
