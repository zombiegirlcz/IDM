package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v2 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EmergencyPaymentFlowContract$InputData f119969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119970c;
    public final v2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119972h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119973j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119976n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119981t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119983x;

    public v2(c1 c1Var, iq3.a aVar, ViewController viewController, EmergencyPaymentFlowContract$InputData emergencyPaymentFlowContract$InputData) {
        this.f119970c = c1Var;
        this.f119968a = aVar;
        this.f119969b = emergencyPaymentFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119971g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119972h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(emergencyPaymentFlowContract$InputData));
        int i2 = 22;
        this.f119973j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119974l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119975m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119976n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119977p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119978q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119979r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119980s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119981t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 16, i2));
        this.v = e4m.b.b(new h1(c1Var, this, 17, i2));
        this.f119982w = e4m.b.b(new h1(c1Var, this, 15, i2));
        this.f119983x = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119980s.get(), (yji.n) this.f119981t.get(), (yji.n) this.f119977p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119972h.get(), (yji.d) this.f119979r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119970c, this.d, 14);
    }
}
