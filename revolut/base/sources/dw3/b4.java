package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class b4 implements xki.c, iq3.d {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ManualUnderwritingContract$InputData f118344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f118345c;
    public final b4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118347h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118348j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118351n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118356t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f118358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f118359y;
    public final e4m.e z;

    public b4(c1 c1Var, iq3.a aVar, ViewController viewController, ManualUnderwritingContract$InputData manualUnderwritingContract$InputData) {
        this.f118345c = c1Var;
        this.f118343a = aVar;
        this.f118344b = manualUnderwritingContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118346g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f118347h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(manualUnderwritingContract$InputData));
        int i2 = 11;
        this.f118348j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f118349l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f118350m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f118351n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f118352p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f118353q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f118354r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f118355s = e4m.b.b(new g3(c1Var, this, 14, i2));
        this.f118356t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.v = e4m.b.b(new g3(c1Var, this, 15, i2));
        this.f118357w = e4m.b.b(new g3(c1Var, this, 16, i2));
        this.f118358x = e4m.b.b(new g3(c1Var, this, 17, i2));
        this.f118359y = e4m.b.b(new g3(c1Var, this, 19, i2));
        this.z = e4m.b.b(new g3(c1Var, this, 20, i2));
        this.A = e4m.b.b(new g3(c1Var, this, 21, i2));
        this.B = e4m.b.b(new g3(c1Var, this, 18, i2));
        this.C = e4m.b.b(new g3(c1Var, this, 22, i2));
        this.D = e4m.b.b(new g3(c1Var, this, 23, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.v.get(), (yji.n) this.f118357w.get(), (yji.n) this.f118352p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f118347h.get(), (yji.d) this.f118354r.get(), (yji.d) this.u.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f118345c, this.d, 3);
    }
}
