package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExpiredApplicationRootFlowContract$InputData f118330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118331c;
    public final b3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118333h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118334j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118337n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118342t;
    public final e4m.e u;

    public b3(c1 c1Var, iq3.a aVar, ViewController viewController, ExpiredApplicationRootFlowContract$InputData expiredApplicationRootFlowContract$InputData) {
        this.f118331c = c1Var;
        this.f118329a = aVar;
        this.f118330b = expiredApplicationRootFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f118332g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f118333h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(expiredApplicationRootFlowContract$InputData));
        int i2 = 27;
        this.f118334j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f118335l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f118336m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f118337n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f118338p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f118339q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f118340r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f118341s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f118342t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118341s.get(), (yji.n) this.f118342t.get(), (yji.n) this.f118338p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118333h.get(), (yji.d) this.f118340r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118331c, this.d, 2);
    }
}
