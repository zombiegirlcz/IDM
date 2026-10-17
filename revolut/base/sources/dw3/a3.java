package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExpiredApplicationLazyFlowContract$InputData f118250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118251c;
    public final a3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118253h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118254j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118257n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118262t;
    public final e4m.e u;

    public a3(c1 c1Var, iq3.a aVar, ViewController viewController, ExpiredApplicationLazyFlowContract$InputData expiredApplicationLazyFlowContract$InputData) {
        this.f118251c = c1Var;
        this.f118249a = aVar;
        this.f118250b = expiredApplicationLazyFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 26;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f118252g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f118253h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(expiredApplicationLazyFlowContract$InputData));
        int i2 = 26;
        this.f118254j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f118255l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f118256m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f118257n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f118258p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f118259q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f118260r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f118261s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f118262t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118261s.get(), (yji.n) this.f118262t.get(), (yji.n) this.f118258p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118253h.get(), (yji.d) this.f118260r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118251c, this.d, 20);
    }
}
