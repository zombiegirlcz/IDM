package a8e;

import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends bji.b implements g {
    public final u6e.b u;
    public final d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, u6e.b subaccountAvailableCurrenciesInterractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(subaccountAvailableCurrenciesInterractor, "subaccountAvailableCurrenciesInterractor");
        this.u = subaccountAvailableCurrenciesInterractor;
        this.v = new d(v.k(c.FIAT, c.COMMODITY));
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.v;
    }
}
