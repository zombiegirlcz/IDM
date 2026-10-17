package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsDashboardContract$InputData f238448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f238450c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f238452h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f238453j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f238454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f238455m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f238456n;

    public k(n nVar, l lVar, ViewController viewController, AnalyticsDashboardContract$InputData analyticsDashboardContract$InputData) {
        this.f238449b = nVar;
        this.f238450c = lVar;
        this.f238448a = analyticsDashboardContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        this.e = e4m.b.b(new j(nVar, lVar, this, 1, i));
        this.f = e4m.b.b(new j(nVar, lVar, this, 3, i));
        this.f238451g = e4m.b.b(new j(nVar, lVar, this, 2, i));
        this.f238452h = e4m.b.b(new j(nVar, lVar, this, 0, i));
        this.i = e4m.b.b(nVar.O0);
        this.f238453j = e4m.b.b(new j(nVar, lVar, this, 6, i));
        this.k = e4m.b.b(new j(nVar, lVar, this, 5, i));
        this.f238454l = e4m.b.b(new j(nVar, lVar, this, 7, i));
        this.f238455m = e4m.b.b(new j(nVar, lVar, this, 8, i));
        this.f238456n = e4m.b.b(new j(nVar, lVar, this, 4, i));
    }

    public final wnd.d b() {
        n nVar = this.f238449b;
        je6.h hVarC = ((xf6.t) nVar.g0).c();
        vc.s.j(hVarC);
        g6e.b bVarA = nVar.f238491h0.a();
        vc.s.j(bVarA);
        rnd.i iVarJ = this.f238450c.j();
        gte.a aVarB = nVar.f238482a.b();
        vc.s.j(aVarB);
        return new wnd.d(hVarC, bVarA, iVarJ, aVarB);
    }

    public final rul.e c() {
        rnd.v0 v0VarS = this.f238450c.s();
        n nVar = this.f238449b;
        g6e.d dVarB = nVar.F.b();
        vc.s.j(dVarB);
        return new rul.e(new xnd.a(v0VarS, dVarB, nVar.f.b()), (xnd.s) nVar.P0.get());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f238451g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f238452h.get());
    }
}
