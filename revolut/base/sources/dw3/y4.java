package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.PaymentFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y4 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentFlowContract$InputData f120207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120208c;
    public final y4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120210h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120211j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120214n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120219t;
    public final e4m.e u;

    public y4(c1 c1Var, iq3.a aVar, ViewController viewController, PaymentFlowContract$InputData paymentFlowContract$InputData) {
        this.f120208c = c1Var;
        this.f120206a = aVar;
        this.f120207b = paymentFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f120209g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f120210h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(paymentFlowContract$InputData));
        int i2 = 25;
        this.f120211j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f120212l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f120213m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f120214n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f120215p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f120216q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f120217r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f120218s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f120219t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120218s.get(), (yji.n) this.f120219t.get(), (yji.n) this.f120215p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120210h.get(), (yji.d) this.f120217r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f120208c, this.d, 17);
    }
}
