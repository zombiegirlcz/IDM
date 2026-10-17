package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.CreditAgreementsV2FlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z0 implements xki.c, iq3.d, w44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditAgreementsV2FlowContract$InputData f120251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120252c;
    public final z0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120254h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120255j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120258n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120263t;
    public final e4m.e u;

    public z0(c1 c1Var, iq3.a aVar, ViewController viewController, CreditAgreementsV2FlowContract$InputData creditAgreementsV2FlowContract$InputData) {
        this.f120252c = c1Var;
        this.f120250a = aVar;
        this.f120251b = creditAgreementsV2FlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f120253g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f120254h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditAgreementsV2FlowContract$InputData));
        int i2 = 25;
        this.f120255j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f120256l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f120257m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f120258n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f120259p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f120260q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f120261r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f120262s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f120263t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120262s.get(), (yji.n) this.f120263t.get(), (yji.n) this.f120259p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120254h.get(), (yji.d) this.f120261r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f120252c, this.d, 1);
    }

    @Override // w44.a
    public final t7 s() {
        return new t7(this.f120252c, this.d, 4);
    }
}
