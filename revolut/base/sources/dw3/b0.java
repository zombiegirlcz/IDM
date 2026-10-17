package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 implements xki.c, iq3.d, d64.c, f54.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CalculatorFlowContract$InputData f118303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118304c;
    public final b0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118306h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118307j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118310n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118315t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118316w;

    public b0(c1 c1Var, iq3.a aVar, ViewController viewController, CalculatorFlowContract$InputData calculatorFlowContract$InputData) {
        this.f118304c = c1Var;
        this.f118302a = aVar;
        this.f118303b = calculatorFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.f = e4m.b.b(new dmc.b0(c1Var, this, 2, i));
        this.f118305g = e4m.b.b(new dmc.b0(c1Var, this, 1, i));
        this.f118306h = e4m.b.b(new dmc.b0(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(calculatorFlowContract$InputData));
        int i2 = 10;
        this.f118307j = e4m.b.b(new dmc.b0(c1Var, this, 7, i2));
        this.k = e4m.b.b(new dmc.b0(c1Var, this, 6, i2));
        this.f118308l = e4m.b.b(new dmc.b0(c1Var, this, 10, i2));
        this.f118309m = e4m.b.b(new dmc.b0(c1Var, this, 11, i2));
        this.f118310n = e4m.b.b(new dmc.b0(c1Var, this, 9, i2));
        this.o = e4m.b.b(new dmc.b0(c1Var, this, 8, i2));
        this.f118311p = e4m.b.b(new dmc.b0(c1Var, this, 5, i2));
        this.f118312q = e4m.b.b(new dmc.b0(c1Var, this, 4, i2));
        this.f118313r = e4m.b.b(new dmc.b0(c1Var, this, 3, i2));
        this.f118314s = e4m.b.b(new dmc.b0(c1Var, this, 12, i2));
        this.f118315t = e4m.b.b(new dmc.b0(c1Var, this, 13, i2));
        this.u = e4m.b.b(new dmc.b0(c1Var, this, 14, i2));
        this.v = e4m.b.b(new dmc.b0(c1Var, this, 16, i2));
        this.f118316w = e4m.b.b(new dmc.b0(c1Var, this, 15, i2));
    }

    @Override // d64.c
    public final e8 b() {
        return new e8(this.f118304c, this.d, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118314s.get(), (yji.n) this.f118315t.get(), (yji.n) this.f118311p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118306h.get(), (yji.d) this.f118313r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f118304c, this.d, 4);
    }

    @Override // f54.a
    public final w7 y() {
        return new w7(this.f118304c, this.d, 9);
    }
}
