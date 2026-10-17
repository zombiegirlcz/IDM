package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class n4 implements xki.c, iq3.d, ef4.a, gf4.a, d64.c, f54.a, w44.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfferFlowContract$InputData f119338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119339c;
    public final n4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119341h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119342j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119343l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119345n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119350t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119351w;

    public n4(c1 c1Var, iq3.a aVar, ViewController viewController, OfferFlowContract$InputData offerFlowContract$InputData) {
        this.f119339c = c1Var;
        this.f119337a = aVar;
        this.f119338b = offerFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119340g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119341h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(offerFlowContract$InputData));
        int i2 = 19;
        this.f119342j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119343l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119344m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119345n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119346p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119347q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119348r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119349s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f119350t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 16, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 15, i2));
        this.f119351w = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // d64.c
    public final e8 b() {
        return new e8(this.f119339c, this.d, 1);
    }

    @Override // ef4.a
    public final s8 c() {
        return new s8(this.f119339c, this.d, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119349s.get(), (yji.n) this.f119350t.get(), (yji.n) this.f119346p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119341h.get(), (yji.d) this.f119348r.get());
    }

    @Override // gf4.a
    public final y8 j() {
        return new y8(this.f119339c, this.d, 0);
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119339c, this.d, 8);
    }

    @Override // w44.a
    public final t7 s() {
        return new t7(this.f119339c, this.d, 0);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f119339c, this.d, 2);
    }
}
