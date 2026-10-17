package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HowItWorksFlowContract$InputData f119262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119263c;
    public final m3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119265h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119266j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119269n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119274t;
    public final e4m.e u;

    public m3(c1 c1Var, iq3.a aVar, ViewController viewController, HowItWorksFlowContract$InputData howItWorksFlowContract$InputData) {
        this.f119263c = c1Var;
        this.f119261a = aVar;
        this.f119262b = howItWorksFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119264g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119265h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(howItWorksFlowContract$InputData));
        int i2 = 4;
        this.f119266j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f119267l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f119268m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f119269n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f119270p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f119271q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f119272r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f119273s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f119274t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119273s.get(), (yji.n) this.f119274t.get(), (yji.n) this.f119270p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119265h.get(), (yji.d) this.f119272r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119263c, this.d, 23);
    }
}
