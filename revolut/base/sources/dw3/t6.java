package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class t6 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpinnerLazyFlowContract$InputData f119851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119852c;
    public final t6 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119854h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119855j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119858n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119863t;
    public final e4m.e u;

    public t6(c1 c1Var, iq3.a aVar, ViewController viewController, SpinnerLazyFlowContract$InputData spinnerLazyFlowContract$InputData) {
        this.f119852c = c1Var;
        this.f119850a = aVar;
        this.f119851b = spinnerLazyFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119853g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119854h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(spinnerLazyFlowContract$InputData));
        int i2 = 18;
        this.f119855j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f119856l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f119857m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f119858n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f119859p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f119860q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f119861r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f119862s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f119863t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119862s.get(), (yji.n) this.f119863t.get(), (yji.n) this.f119859p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119854h.get(), (yji.d) this.f119861r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119852c, this.d, 18);
    }
}
