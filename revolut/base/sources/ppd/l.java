package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements xki.c, drd.b, asd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsDashboardFlowContract$InputData f238465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f238467c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f238469h;
    public final e4m.e i;

    public l(n nVar, AnalyticsDashboardFlowContract$InputData analyticsDashboardFlowContract$InputData) {
        this.f238466b = nVar;
        this.f238465a = analyticsDashboardFlowContract$InputData;
        int i = 23;
        this.d = e4m.b.b(new pa6.f(nVar, this, 1, i));
        this.e = e4m.b.b(new pa6.f(nVar, this, 0, i));
        this.f = e4m.b.b(new pa6.f(nVar, this, 2, i));
        this.f238468g = e4m.b.b(new pa6.f(nVar, this, 3, i));
        this.f238469h = e4m.b.b(new pa6.f(nVar, this, 4, i));
        this.i = e4m.b.b(new pa6.f(nVar, this, 5, i));
    }

    @Override // drd.b
    public final drd.a b() {
        return new g1(this.f238466b, this.f238467c);
    }

    @Override // asd.a
    public final j1 c() {
        return new j1(this.f238466b, this.f238467c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }

    public final rnd.i j() {
        gte.a aVarB = this.f238466b.f238482a.b();
        vc.s.j(aVarB);
        return new rnd.i(aVarB);
    }

    public final kge.d q() {
        izi.a aVar = this.f238466b.f238484b;
        eqj.d dVarA = ((dqj.r) aVar).a();
        vc.s.j(dVarA);
        kzi.a aVarB = ((dqj.r) aVar).b();
        vc.s.j(aVarB);
        return new kge.d(dVarA, aVarB);
    }

    public final rnd.v0 s() {
        n nVar = this.f238466b;
        toh.d dVarA = nVar.f238505t.a();
        djb.n nVarA = nVar.f238492j.a();
        vc.s.j(nVarA);
        elb.b bVarE = ((blb.e) nVar.M).e();
        hj8.a aVarA = nVar.f238485b0.a();
        vc.s.j(aVarA);
        te8.r rVarB = nVar.c0.b();
        vc.s.j(rVarB);
        return new rnd.v0(dVarA, nVarA, bVarE, aVarA, rVarB, nVar.f238487d0.a(), nVar.f238494l.c(), nVar.f238488e0.i());
    }
}
