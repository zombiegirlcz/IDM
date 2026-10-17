package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsDetailsContract$InputData f238472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f238474c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f238476h;

    public m(n nVar, l lVar, AnalyticsDetailsContract$InputData analyticsDetailsContract$InputData) {
        this.f238473b = nVar;
        this.f238474c = lVar;
        this.f238472a = analyticsDetailsContract$InputData;
        this.d = e4m.b.b(new j(nVar, lVar, this, 1, 1));
        int i = 1;
        this.e = e4m.b.b(new j(nVar, lVar, this, 0, i));
        this.f = e4m.b.b(new j(nVar, lVar, this, 3, i));
        this.f238475g = e4m.b.b(new j(nVar, lVar, this, 4, i));
        this.f238476h = e4m.b.b(new j(nVar, lVar, this, 2, i));
    }

    public final lnd.z b() {
        n nVar = this.f238473b;
        cmd.a aVarG = nVar.f238489g.g();
        vc.s.j(aVarG);
        thf.l lVarF = nVar.f238490h.f();
        vc.s.j(lVarF);
        return new lnd.z(aVarG, new qpd.s(lVarF, new j9l.a()), new kgm.c(new lnd.p0(), new j9l.a()), new jnd.k(new jnd.e()));
    }

    public final lnd.o0 c() {
        n nVar = this.f238473b;
        cmd.a aVarG = nVar.f238489g.g();
        vc.s.j(aVarG);
        return new lnd.o0(aVarG, nVar.k(), new lnd.p0(), new jnd.k(new jnd.e()));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    public final cod.f j() {
        l80.e eVarH = this.f238473b.d.h();
        vc.s.j(eVarH);
        return new cod.f(new zq.a(eVarH, new lnd.p0()), new knd.o0(), new lnd.p0(), new jnd.e());
    }
}
