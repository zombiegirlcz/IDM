package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w6 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpousalConsentPartnerFlowContract$InputData f120075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120076c;
    public final w6 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120078h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120079j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120082n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120087t;
    public final e4m.e u;

    public w6(c1 c1Var, iq3.a aVar, ViewController viewController, SpousalConsentPartnerFlowContract$InputData spousalConsentPartnerFlowContract$InputData) {
        this.f120076c = c1Var;
        this.f120074a = aVar;
        this.f120075b = spousalConsentPartnerFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f120077g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f120078h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(spousalConsentPartnerFlowContract$InputData));
        int i2 = 21;
        this.f120079j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f120080l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f120081m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f120082n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f120083p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f120084q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f120085r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f120086s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f120087t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120086s.get(), (yji.n) this.f120087t.get(), (yji.n) this.f120083p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120078h.get(), (yji.d) this.f120085r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f120076c, this.d, 16);
    }
}
