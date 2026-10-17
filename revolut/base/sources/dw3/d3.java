package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.FailureRootFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FailureRootFlowContract$InputData f118552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118553c;
    public final d3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118555h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118556j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118559n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118564t;
    public final e4m.e u;

    public d3(c1 c1Var, iq3.a aVar, ViewController viewController, FailureRootFlowContract$InputData failureRootFlowContract$InputData) {
        this.f118553c = c1Var;
        this.f118551a = aVar;
        this.f118552b = failureRootFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f118554g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f118555h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(failureRootFlowContract$InputData));
        int i2 = 28;
        this.f118556j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f118557l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f118558m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f118559n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f118560p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f118561q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f118562r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f118563s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f118564t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118563s.get(), (yji.n) this.f118564t.get(), (yji.n) this.f118560p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118555h.get(), (yji.d) this.f118562r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f118553c, this.d, 25);
    }
}
