package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class h2 implements xki.c, iq3.d, qy4.a, uy4.a, gz4.a, oy4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DirectDebitContract$InputData f118855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118856c;
    public final h2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118858h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118859j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118862n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118867t;
    public final e4m.e u;
    public final e4m.e v;

    public h2(c1 c1Var, iq3.a aVar, ViewController viewController, DirectDebitContract$InputData directDebitContract$InputData) {
        this.f118856c = c1Var;
        this.f118854a = aVar;
        this.f118855b = directDebitContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f118857g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f118858h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(directDebitContract$InputData));
        int i2 = 13;
        this.f118859j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f118860l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f118861m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f118862n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f118863p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f118864q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f118865r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f118866s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f118867t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
        this.v = e4m.b.b(new h1(c1Var, this, 15, i2));
    }

    @Override // gz4.a
    public final l4 b() {
        return new l4(this.f118856c, this.d, 0);
    }

    @Override // uy4.a
    public final n c() {
        return new n(this.f118856c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118866s.get(), (yji.n) this.f118867t.get(), (yji.n) this.f118863p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118858h.get(), (yji.d) this.f118865r.get());
    }

    @Override // oy4.a
    public final c2 j() {
        return new c2(this.f118856c, this.d, 0);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f118856c, this.d, 19);
    }

    @Override // qy4.a
    public final e2 s() {
        return new e2(this.f118856c, this.d, 0);
    }
}
