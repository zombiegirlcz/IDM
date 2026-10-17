package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.chart.ManagedPortfolioDetailsChartContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.fees.ManagedPortfolioDetailsFeesExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.ManagedPortfolioDetailsInvestmentsExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_summary.ManagedPortfolioPerformanceSummaryExtensionContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements xki.e {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;
    public final e4m.e K;
    public final e4m.e L;
    public final e4m.e M;
    public final e4m.e N;
    public final e4m.e O;
    public final e4m.e P;
    public final e4m.e Q;
    public final e4m.e R;
    public final e4m.e S;
    public final e4m.e T;
    public final e4m.e U;
    public final e4m.e V;
    public final e4m.e W;
    public final e4m.e X;
    public final e4m.e Y;
    public final e4m.e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlc.y f295138a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e4m.e f295139a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f295140b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final e4m.e f295141b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o6f.d f295142c;
    public final e4m.e c0;
    public final ManagedPortfolioDetailsChartContract$InputData d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final e4m.e f295143d0;
    public final t6f.l e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final e4m.e f295144e0;
    public final ManagedPortfolioDetailsAboutInfoExtensionContract$InputData f;
    public final e4m.e f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r6f.h f295145g;
    public final e4m.e g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ManagedPortfolioDetailsFeesExtensionContract$InputData f295146h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final e4m.e f295147h0;
    public final ManagedPortfolioDetailsInvestmentsExtensionContract$InputData i;
    public final e4m.e i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v6f.h f295148j;
    public final e4m.e j0;
    public final j6f.d k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final e4m.e f295149k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ManagedPortfolioDetailsAllocationContract$InputData f295150l;
    public final e4m.e l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g7f.f f295151m;
    public final e4m.e m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ManagedPortfolioDetailsControllerContract$InputData f295152n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final e4m.e f295153n0;
    public final b7f.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManagedPortfolioPerformanceExtensionContract$InputData f295154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e7f.h f295155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ManagedPortfolioPerformanceSummaryExtensionContract$InputData f295156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i7f.e f295157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a7f.f f295158t;
    public final h1h.f u;
    public final mkd.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f295159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f295160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f295161y;
    public final e4m.e z;

    public f(m mVar, ViewController viewController, ManagedPortfolioDetailsControllerContract$InputData managedPortfolioDetailsControllerContract$InputData, h1h.f fVar, jlc.y yVar, ManagedPortfolioDetailsChartContract$InputData managedPortfolioDetailsChartContract$InputData, o6f.d dVar, ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData, j6f.d dVar2, ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData, t6f.l lVar, ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData, r6f.h hVar, ManagedPortfolioDetailsInvestmentsExtensionContract$InputData managedPortfolioDetailsInvestmentsExtensionContract$InputData, v6f.h hVar2, a7f.f fVar2, i6f.q qVar, i7f.e eVar, ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData, b7f.f fVar3, ManagedPortfolioPerformanceSummaryExtensionContract$InputData managedPortfolioPerformanceSummaryExtensionContract$InputData, e7f.h hVar3, fnc.l lVar2) {
        this.f295159w = mVar;
        this.f295138a = yVar;
        this.f295140b = viewController;
        this.f295142c = dVar;
        this.d = managedPortfolioDetailsChartContract$InputData;
        this.e = lVar;
        this.f = managedPortfolioDetailsAboutInfoExtensionContract$InputData;
        this.f295145g = hVar;
        this.f295146h = managedPortfolioDetailsFeesExtensionContract$InputData;
        this.i = managedPortfolioDetailsInvestmentsExtensionContract$InputData;
        this.f295148j = hVar2;
        this.k = dVar2;
        this.f295150l = managedPortfolioDetailsAllocationContract$InputData;
        this.f295151m = qVar;
        this.f295152n = managedPortfolioDetailsControllerContract$InputData;
        this.o = fVar3;
        this.f295154p = managedPortfolioPerformanceExtensionContract$InputData;
        this.f295155q = hVar3;
        this.f295156r = managedPortfolioPerformanceSummaryExtensionContract$InputData;
        this.f295157s = eVar;
        this.f295158t = fVar2;
        this.u = fVar;
        this.v = lVar2;
        this.f295160x = v1.c.m(mVar, this, 1);
        this.f295161y = v1.c.m(mVar, this, 0);
        this.z = v1.c.m(mVar, this, 2);
        this.A = v1.c.m(mVar, this, 3);
        this.B = v1.c.m(mVar, this, 5);
        int i = 9;
        this.C = e4m.b.b(new vzc.j(mVar, this, 4, i));
        this.D = v1.c.m(mVar, this, 7);
        this.E = e4m.b.b(new vzc.j(mVar, this, 6, i));
        this.F = v1.c.m(mVar, this, 9);
        this.G = e4m.b.b(new vzc.j(mVar, this, 8, i));
        this.H = v1.c.m(mVar, this, 11);
        this.I = e4m.b.b(new vzc.j(mVar, this, 10, i));
        this.J = v1.c.m(mVar, this, 13);
        this.K = e4m.b.b(new vzc.j(mVar, this, 12, i));
        this.L = v1.c.m(mVar, this, 15);
        this.M = e4m.b.b(new vzc.j(mVar, this, 14, i));
        this.N = v1.c.m(mVar, this, 17);
        this.O = e4m.b.b(new vzc.j(mVar, this, 16, i));
        this.P = v1.c.m(mVar, this, 19);
        this.Q = e4m.b.b(new vzc.j(mVar, this, 18, i));
        this.R = v1.c.m(mVar, this, 22);
        this.S = v1.c.m(mVar, this, 21);
        this.T = e4m.b.b(new vzc.j(mVar, this, 20, i));
        this.U = v1.c.m(mVar, this, 25);
        this.V = v1.c.m(mVar, this, 26);
        this.W = v1.c.m(mVar, this, 24);
        this.X = e4m.b.b(new vzc.j(mVar, this, 23, i));
        this.Y = v1.c.m(mVar, this, 27);
        this.Z = e4m.b.b(e4m.c.a(fVar));
        this.f295139a0 = v1.c.m(mVar, this, 29);
        this.f295141b0 = v1.c.m(mVar, this, 28);
        this.c0 = v1.c.m(mVar, this, 30);
        this.f295143d0 = v1.c.m(mVar, this, 31);
        this.f295144e0 = v1.c.m(mVar, this, 32);
        int i2 = 9;
        this.f0 = e4m.b.b(new vzc.j(mVar, this, 34, i2));
        this.g0 = e4m.b.b(new vzc.j(mVar, this, 35, i2));
        this.f295147h0 = e4m.b.b(new vzc.j(mVar, this, 36, i2));
        this.i0 = v1.c.m(mVar, this, 38);
        this.j0 = e4m.b.b(new vzc.j(mVar, this, 37, i2));
        this.f295149k0 = e4m.b.b(e4m.c.a(viewController));
        this.l0 = v1.c.m(mVar, this, 39);
        this.m0 = v1.c.m(mVar, this, 40);
        this.f295153n0 = e4m.b.b(new vzc.j(mVar, this, 33, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.c0.get(), (yji.n) this.f295143d0.get(), dw3.l.m((d1h.e) this.A.get()), (yji.n) this.f295144e0.get(), (yji.n) this.B.get(), (yji.n) this.D.get(), (yji.n) this.F.get(), (yji.n) this.H.get(), (yji.n) this.J.get(), (yji.n) this.L.get(), (yji.n) this.N.get(), (yji.n) this.P.get(), (yji.n) this.S.get(), (yji.n) this.W.get(), (yji.n) this.R.get(), (yji.n) this.f295139a0.get());
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f295161y.get();
        gah.f fVarA = ((u8h.b) this.f295159w.f295191c).a();
        vc.s.j(fVarA);
        return ImmutableSet.of(dVar, dw3.l.l(fVarA, (d1h.j) this.z.get(), (d1h.e) this.A.get()), (yji.d) this.C.get(), (yji.d) this.E.get(), (yji.d) this.G.get(), (yji.d) this.I.get(), (yji.d) this.K.get(), (yji.d) this.M.get(), (yji.d) this.O.get(), (yji.d) this.Q.get(), (yji.d) this.T.get(), (yji.d) this.X.get(), (yji.d) this.Y.get(), (yji.d) this.f295141b0.get());
    }
}
