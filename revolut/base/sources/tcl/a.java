package tcl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final efl.c a(fdl.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar instanceof fdl.k) {
            fdl.k kVar = (fdl.k) lVar;
            return new efl.b(kVar.getSymbol(), kVar.getRef(), kVar.getValue().getQuantity());
        }
        if (!(lVar instanceof fdl.j)) {
            throw new NoWhenBranchMatchedException();
        }
        fdl.j jVar = (fdl.j) lVar;
        dj0.d dVarO = mo3.a.o(jVar.getValue());
        xi0.a aVar = xi0.b.Companion;
        String currencyCode = jVar.getCurrencyCode();
        aVar.getClass();
        return new efl.a(dVarO, xi0.a.a(currencyCode));
    }
}
