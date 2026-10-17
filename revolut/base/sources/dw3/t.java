package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.CreditApplicationAgreementsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements xki.c, iq3.d, z44.a, w44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationAgreementsFlowContract$InputData f119794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119795c;
    public final t d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119797h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119798j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119801n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119806t;
    public final e4m.e u;
    public final e4m.e v;

    public t(c1 c1Var, iq3.a aVar, ViewController viewController, CreditApplicationAgreementsFlowContract$InputData creditApplicationAgreementsFlowContract$InputData) {
        this.f119795c = c1Var;
        this.f119793a = aVar;
        this.f119794b = creditApplicationAgreementsFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 3;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119796g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119797h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditApplicationAgreementsFlowContract$InputData));
        int i2 = 3;
        this.f119798j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119799l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119800m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119801n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119802p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119803q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119804r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119805s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f119806t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // z44.a
    public final y7 b() {
        return new y7(this.f119795c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119805s.get(), (yji.n) this.f119806t.get(), (yji.n) this.f119802p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119797h.get(), (yji.d) this.f119804r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119795c, this.d, 1);
    }

    @Override // w44.a
    public final t7 s() {
        return new t7(this.f119795c, this.d, 5);
    }
}
