package t43;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lim.q;
import nkm.y;
import q2j.v;
import s06.e;

/* JADX INFO: loaded from: classes21.dex */
public final class c {
    public final nkm.c a(q pockets, List selectedPocketIds, xi0.b baseCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(selectedPocketIds, "selectedPocketIds");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return y.F(y.n(pockets, new e(this, 23, baseCurrency, selectedPocketIds)), new v(new v(new b(z, selectedPocketIds, 0), 9), 8));
    }
}
