package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class p5 implements xki.c, iq3.d, nh4.a, gf4.a, d64.c, f54.a {
    public final e4m.e A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RefinancingOfferFlowContract$InputData f119512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119513c;
    public final p5 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119515h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119516j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119519n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119524t;
    public final e4m.e u;
    public final g5 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f119527y;
    public final e4m.e z;

    public p5(c1 c1Var, iq3.a aVar, ViewController viewController, RefinancingOfferFlowContract$InputData refinancingOfferFlowContract$InputData) {
        this.f119513c = c1Var;
        this.f119511a = aVar;
        this.f119512b = refinancingOfferFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119514g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119515h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(refinancingOfferFlowContract$InputData));
        int i2 = 4;
        this.f119516j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f119517l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f119518m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f119519n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f119520p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f119521q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f119522r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f119523s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f119524t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 16, i2));
        g5 g5Var = new g5(c1Var, this, 15, i2);
        this.v = g5Var;
        this.f119525w = e4m.b.b(g5Var);
        this.f119526x = e4m.b.b(this.v);
        this.f119527y = e4m.b.b(new g5(c1Var, this, 14, i2));
        this.z = e4m.b.b(this.v);
        this.A = e4m.b.b(this.v);
    }

    @Override // nh4.a
    public final e9 B() {
        return new e9(this.f119513c, this.d, 1);
    }

    @Override // d64.c
    public final e8 b() {
        return new e8(this.f119513c, this.d, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119523s.get(), (yji.n) this.f119524t.get(), (yji.n) this.f119520p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119515h.get(), (yji.d) this.f119522r.get());
    }

    @Override // gf4.a
    public final y8 j() {
        return new y8(this.f119513c, this.d, 1);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119513c, this.d, 5);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f119513c, this.d, 1);
    }
}
