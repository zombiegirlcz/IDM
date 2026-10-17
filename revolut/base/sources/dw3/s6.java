package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class s6 implements xki.c, iq3.d, ki4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpinnerFlowContract$InputData f119774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119775c;
    public final s6 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119777h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119778j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119781n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119786t;
    public final e4m.e u;

    public s6(c1 c1Var, iq3.a aVar, ViewController viewController, SpinnerFlowContract$InputData spinnerFlowContract$InputData) {
        this.f119775c = c1Var;
        this.f119773a = aVar;
        this.f119774b = spinnerFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 17;
        this.f = e4m.b.b(new g5(c1Var, this, 2, i));
        this.f119776g = e4m.b.b(new g5(c1Var, this, 1, i));
        this.f119777h = e4m.b.b(new g5(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(spinnerFlowContract$InputData));
        int i2 = 17;
        this.f119778j = e4m.b.b(new g5(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g5(c1Var, this, 6, i2));
        this.f119779l = e4m.b.b(new g5(c1Var, this, 10, i2));
        this.f119780m = e4m.b.b(new g5(c1Var, this, 11, i2));
        this.f119781n = e4m.b.b(new g5(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g5(c1Var, this, 8, i2));
        this.f119782p = e4m.b.b(new g5(c1Var, this, 5, i2));
        this.f119783q = e4m.b.b(new g5(c1Var, this, 4, i2));
        this.f119784r = e4m.b.b(new g5(c1Var, this, 3, i2));
        this.f119785s = e4m.b.b(new g5(c1Var, this, 12, i2));
        this.f119786t = e4m.b.b(new g5(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g5(c1Var, this, 14, i2));
    }

    @Override // ki4.a
    public final g9 b() {
        return new g9(this.f119775c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119785s.get(), (yji.n) this.f119786t.get(), (yji.n) this.f119782p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119777h.get(), (yji.d) this.f119784r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new k7(this.f119775c, this.d, 17);
    }
}
