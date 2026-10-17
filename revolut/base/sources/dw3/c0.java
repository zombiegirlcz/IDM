package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements xki.c, iq3.d, ki4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOrderingFlowContract$InputData f118404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118405c;
    public final c0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118407h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118408j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118411n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118416t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f118418x;

    public c0(c1 c1Var, iq3.a aVar, ViewController viewController, CardOrderingFlowContract$InputData cardOrderingFlowContract$InputData) {
        this.f118405c = c1Var;
        this.f118403a = aVar;
        this.f118404b = cardOrderingFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118406g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118407h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(cardOrderingFlowContract$InputData));
        int i2 = 11;
        this.f118408j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f118409l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f118410m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f118411n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f118412p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f118413q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f118414r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f118415s = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.f118416t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.f118417w = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f118418x = e4m.b.b(new dmc.b0(c1Var, this, 17, i2));
    }

    @Override // ki4.a
    public final g9 b() {
        return new g9(this.f118405c, this.d, 3);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.v.get(), (yji.n) this.f118417w.get(), (yji.n) this.f118412p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118407h.get(), (yji.d) this.f118414r.get(), (yji.d) this.u.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f118405c, this.d, 15);
    }
}
