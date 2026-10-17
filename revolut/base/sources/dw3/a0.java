package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BirthPlaceRootFlowContract$InputData f118227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118228c;
    public final a0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118230h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118231j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118234n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118239t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118240w;

    public a0(c1 c1Var, iq3.a aVar, ViewController viewController, BirthPlaceRootFlowContract$InputData birthPlaceRootFlowContract$InputData) {
        this.f118228c = c1Var;
        this.f118226a = aVar;
        this.f118227b = birthPlaceRootFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118229g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118230h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(birthPlaceRootFlowContract$InputData));
        int i2 = 9;
        this.f118231j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f118232l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f118233m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f118234n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f118235p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f118236q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f118237r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f118238s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f118239t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f118240w = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118238s.get(), (yji.n) this.f118239t.get(), (yji.n) this.f118235p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118230h.get(), (yji.d) this.f118237r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f118228c, this.d, 5);
    }
}
