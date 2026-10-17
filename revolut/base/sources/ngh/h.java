package ngh;

import ael.d0;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends oki.h implements dli.b {
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f215170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f215171q;

    public h(d0 stocksInteractor, com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates.a stateMapper, f inputData) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = stocksInteractor;
        this.f215170p = inputData;
        this.f215171q = mra.d.b(this, new d(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, nim.a.v(rd0.e.b(this.o.a(this.f215170p.f215166a, false)), new nd8.i(21)), null, null, new naf.j(this, null, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f215171q;
    }
}
