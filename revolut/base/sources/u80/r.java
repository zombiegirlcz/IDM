package u80;

import d9.e1;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r {
    private r() {
    }

    public static k a(String currencyCode, double d, boolean z, qd0.b languageProvider, int i) {
        if ((i & 64) != 0) {
            languageProvider = ((l70.e) l70.c.Companion.c()).n();
        }
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(currencyCode);
        int iP = cp5.d.p(bVarA);
        BigDecimal bigDecimalM = e1.M(new BigDecimal(String.valueOf(d)), 4, 6);
        if (iP <= 2) {
            iP = 4;
        }
        k.Companion.getClass();
        k kVarA = j.a(languageProvider);
        kVarA.q((long) (Math.pow(10.0d, bigDecimalM.scale()) * bigDecimalM.doubleValue()));
        kVarA.f278047b = xi0.b.a(bVarA, Integer.valueOf(bigDecimalM.scale()));
        if (z) {
            kVarA.f278054n = true;
        }
        kVarA.e = cp5.d.z(bVarA) ? iP : 4;
        return kVarA;
    }
}
