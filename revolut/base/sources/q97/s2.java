package q97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s2 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oih.j f243785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f243786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.i f243787c;
    public final ybl.l d;

    public s2(t97.c productCellProvider, oih.j wealthStocksAccountCommandProvider, xoj.a featuresInteractor, ybl.i productGroupAvailabilityInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f243785a = wealthStocksAccountCommandProvider;
        this.f243786b = featuresInteractor;
        this.f243787c = productGroupAvailabilityInteractor;
        this.d = tradingConfigInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.STOCKS;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarL = ((cpj.b) this.f243786b).l(yoj.c.WEALTH_TRADING);
        jhi.b bVarE = mo3.a.e(((ael.h0) this.f243787c).b(cfl.p.BONDS), new q92.f(29), new q2(0));
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r map = te0.w.m(rVarL, rd0.e.c(bVarE, gVar), rd0.e.c(mo3.a.g(ybl.l.d(this.d), null, new q2(1), 1), gVar)).distinctUntilChanged().map(new h2(7, new l1(this, 11)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        ufm.i iVar = new ufm.i(oih.j.a(this.f243785a, null, null, 3), new h2(6, new l1(10)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
