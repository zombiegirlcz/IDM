package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d1 implements xki.c, iq3.d, rk4.a, xk4.a, ok4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardApplicationAutopayFlowContract$InputData f118535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118536c;
    public final d1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118538h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118539j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118542n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118543p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118547t;
    public final e4m.e u;
    public final e4m.e v;

    public d1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditCardApplicationAutopayFlowContract$InputData creditCardApplicationAutopayFlowContract$InputData) {
        this.f118536c = c1Var;
        this.f118534a = aVar;
        this.f118535b = creditCardApplicationAutopayFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118537g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118538h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditCardApplicationAutopayFlowContract$InputData));
        int i2 = 28;
        this.f118539j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f118540l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f118541m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f118542n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f118543p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f118544q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f118545r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f118546s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f118547t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
    }

    @Override // rk4.a
    public final z5 c() {
        return new z5(this.f118536c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118546s.get(), (yji.n) this.f118547t.get(), (yji.n) this.f118543p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118538h.get(), (yji.d) this.f118545r.get());
    }

    @Override // xk4.a
    public final k6 j() {
        return new k6(this.f118536c, this.d, 0);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118536c, this.d, 0);
    }

    @Override // ok4.a
    public final k9 s() {
        return new k9(this.f118536c, this.d, 0);
    }
}
