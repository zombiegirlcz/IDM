package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.LoanSelectionFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z3 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f120271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LoanSelectionFlowContract$InputData f120272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f120273c;
    public final z3 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120275h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120276j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f120277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f120278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f120279n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f120280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f120281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f120282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f120283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f120284t;
    public final e4m.e u;

    public z3(c1 c1Var, iq3.a aVar, ViewController viewController, LoanSelectionFlowContract$InputData loanSelectionFlowContract$InputData) {
        this.f120273c = c1Var;
        this.f120271a = aVar;
        this.f120272b = loanSelectionFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f120274g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f120275h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(loanSelectionFlowContract$InputData));
        int i2 = 9;
        this.f120276j = e4m.b.b(new g3(c1Var, this, 7, i2));
        this.k = e4m.b.b(new g3(c1Var, this, 6, i2));
        this.f120277l = e4m.b.b(new g3(c1Var, this, 10, i2));
        this.f120278m = e4m.b.b(new g3(c1Var, this, 11, i2));
        this.f120279n = e4m.b.b(new g3(c1Var, this, 9, i2));
        this.o = e4m.b.b(new g3(c1Var, this, 8, i2));
        this.f120280p = e4m.b.b(new g3(c1Var, this, 5, i2));
        this.f120281q = e4m.b.b(new g3(c1Var, this, 4, i2));
        this.f120282r = e4m.b.b(new g3(c1Var, this, 3, i2));
        this.f120283s = e4m.b.b(new g3(c1Var, this, 12, i2));
        this.f120284t = e4m.b.b(new g3(c1Var, this, 13, i2));
        this.u = e4m.b.b(new g3(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f120283s.get(), (yji.n) this.f120284t.get(), (yji.n) this.f120280p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f120275h.get(), (yji.d) this.f120282r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new n7(this.f120273c, this.d, 6);
    }
}
