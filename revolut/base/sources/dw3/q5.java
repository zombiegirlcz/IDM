package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class q5 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RejectedLazyFlowContract$InputData f119584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119585c;
    public final q5 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119587h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119588j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119591n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119596t;
    public final e4m.e u;

    public q5(c1 c1Var, iq3.a aVar, ViewController viewController, RejectedLazyFlowContract$InputData rejectedLazyFlowContract$InputData) {
        this.f119585c = c1Var;
        this.f119583a = aVar;
        this.f119584b = rejectedLazyFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119586g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119587h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(rejectedLazyFlowContract$InputData));
        int i2 = 5;
        this.f119588j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f119589l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f119590m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f119591n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f119592p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f119593q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f119594r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f119595s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f119596t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119595s.get(), (yji.n) this.f119596t.get(), (yji.n) this.f119592p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119587h.get(), (yji.d) this.f119594r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119585c, this.d, 23);
    }
}
