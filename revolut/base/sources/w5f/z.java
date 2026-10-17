package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.fees.ManagedPortfolioDetailsFeesExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.strategy_overview.StrategyOverviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements xki.e {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlc.e f295253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1h.j f295254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7f.f f295255c;
    public final ManagedPortfolioPerformanceExtensionContract$InputData d;
    public final j6f.d e;
    public final ManagedPortfolioDetailsAllocationContract$InputData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r6f.h f295256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ManagedPortfolioDetailsFeesExtensionContract$InputData f295257h;
    public final StrategyOverviewScreenContract$InputData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f295258j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f295259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f295260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f295261n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f295262p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f295263q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f295264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f295265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f295266t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f295267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f295268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f295269y;
    public final e4m.e z;

    public z(m mVar, ViewController viewController, StrategyOverviewScreenContract$InputData strategyOverviewScreenContract$InputData, jlc.e eVar, ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData, b7f.f fVar, ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData, j6f.d dVar, ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData, r6f.h hVar, d1h.j jVar) {
        this.f295258j = mVar;
        this.f295253a = eVar;
        this.f295254b = jVar;
        this.f295255c = fVar;
        this.d = managedPortfolioPerformanceExtensionContract$InputData;
        this.e = dVar;
        this.f = managedPortfolioDetailsAllocationContract$InputData;
        this.f295256g = hVar;
        this.f295257h = managedPortfolioDetailsFeesExtensionContract$InputData;
        this.i = strategyOverviewScreenContract$InputData;
        this.k = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.f295259l = e4m.b.b(new vzc.j(mVar, this, 3, i));
        this.f295260m = e4m.b.b(new vzc.j(mVar, this, 2, i));
        this.f295261n = e4m.b.b(new vzc.j(mVar, this, 1, i));
        this.o = e4m.b.b(new vzc.j(mVar, this, 0, i));
        this.f295262p = e4m.b.b(new vzc.j(mVar, this, 4, i));
        this.f295263q = e4m.b.b(new vzc.j(mVar, this, 5, i));
        this.f295264r = e4m.b.b(new vzc.j(mVar, this, 7, i));
        this.f295265s = e4m.b.b(new vzc.j(mVar, this, 6, i));
        this.f295266t = e4m.b.b(new vzc.j(mVar, this, 9, i));
        this.u = e4m.b.b(new vzc.j(mVar, this, 8, i));
        this.v = e4m.b.b(new vzc.j(mVar, this, 11, i));
        this.f295267w = e4m.b.b(new vzc.j(mVar, this, 10, i));
        this.f295268x = e4m.b.b(new vzc.j(mVar, this, 12, i));
        this.f295269y = e4m.b.b(new vzc.j(mVar, this, 14, i));
        this.z = e4m.b.b(new vzc.j(mVar, this, 15, i));
        this.A = e4m.b.b(new vzc.j(mVar, this, 16, i));
        this.B = e4m.b.b(new vzc.j(mVar, this, 18, i));
        this.C = e4m.b.b(new vzc.j(mVar, this, 17, i));
        this.D = e4m.b.b(new vzc.j(mVar, this, 13, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f295268x.get(), dw3.l.m((d1h.e) this.f295262p.get()), (yji.n) this.f295264r.get(), (yji.n) this.f295266t.get(), (yji.n) this.v.get());
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.o.get();
        gah.f fVarA = ((u8h.b) this.f295258j.f295191c).a();
        vc.s.j(fVarA);
        return ImmutableSet.of(dVar, dw3.l.l(fVarA, this.f295254b, (d1h.e) this.f295262p.get()), (yji.d) this.f295263q.get(), (yji.d) this.f295265s.get(), (yji.d) this.u.get(), (yji.d) this.f295267w.get(), new yji.d[0]);
    }
}
