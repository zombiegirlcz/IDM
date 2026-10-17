package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s0 implements xki.c, iq3.d, of4.a, f54.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditAddonFlowContract$InputData f119710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119711c;
    public final s0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119713h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119714j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119717n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119721s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119722t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f119723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f119724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f119725y;

    public s0(c1 c1Var, iq3.a aVar, ViewController viewController, CreditAddonFlowContract$InputData creditAddonFlowContract$InputData) {
        this.f119711c = c1Var;
        this.f119709a = aVar;
        this.f119710b = creditAddonFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f119712g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f119713h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditAddonFlowContract$InputData));
        int i2 = 22;
        this.f119714j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f119715l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f119716m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f119717n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f119718p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f119719q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f119720r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f119721s = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.f119722t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.f119723w = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f119724x = e4m.b.b(new dmc.b0(c1Var, this, 18, i2));
        this.f119725y = e4m.b.b(new dmc.b0(c1Var, this, 17, i2));
    }

    @Override // of4.a
    public final w8 b() {
        return new w8(this.f119711c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.v.get(), (yji.n) this.f119723w.get(), (yji.n) this.f119718p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119713h.get(), (yji.d) this.f119720r.get(), (yji.d) this.u.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119711c, this.d, 5);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f119711c, this.d, 0);
    }
}
