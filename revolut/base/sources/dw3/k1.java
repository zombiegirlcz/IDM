package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k1 implements xki.c, iq3.d, pc4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditInsuranceOfferFlowContract$InputData f119069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119070c;
    public final k1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119072h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119073j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119076n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119081t;
    public final e4m.e u;
    public final e4m.e v;

    public k1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditInsuranceOfferFlowContract$InputData creditInsuranceOfferFlowContract$InputData) {
        this.f119070c = c1Var;
        this.f119068a = aVar;
        this.f119069b = creditInsuranceOfferFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119071g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119072h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditInsuranceOfferFlowContract$InputData));
        int i2 = 1;
        this.f119073j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119074l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119075m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119076n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119077p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119078q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119079r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119080s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119081t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 15, i2));
        this.v = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119080s.get(), (yji.n) this.f119081t.get(), (yji.n) this.f119077p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119072h.get(), (yji.d) this.f119079r.get());
    }

    @Override // pc4.a
    public final m8 j() {
        return new m8(this.f119070c, this.d, 0);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119070c, this.d, 14);
    }
}
