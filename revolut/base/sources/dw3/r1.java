package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r1 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditWorkflowContract$InputData f119627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119628c;
    public final r1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119630h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119631j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119634n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119639t;
    public final e4m.e u;

    public r1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditWorkflowContract$InputData creditWorkflowContract$InputData) {
        this.f119628c = c1Var;
        this.f119626a = aVar;
        this.f119627b = creditWorkflowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119629g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119630h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditWorkflowContract$InputData));
        int i2 = 6;
        this.f119631j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119632l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119633m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119634n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119635p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119636q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119637r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119638s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119639t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119638s.get(), (yji.n) this.f119639t.get(), (yji.n) this.f119635p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119630h.get(), (yji.d) this.f119637r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f119628c, this.d, 27);
    }
}
