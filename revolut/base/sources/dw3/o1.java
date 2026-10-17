package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.CreditPlanSelectionFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o1 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPlanSelectionFlowContract$InputData f119396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119397c;
    public final o1 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119399h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119400j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119403n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119408t;
    public final e4m.e u;

    public o1(c1 c1Var, iq3.a aVar, ViewController viewController, CreditPlanSelectionFlowContract$InputData creditPlanSelectionFlowContract$InputData) {
        this.f119397c = c1Var;
        this.f119395a = aVar;
        this.f119396b = creditPlanSelectionFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.f = e4m.b.b(new h1(c1Var, this, 2, i));
        this.f119398g = e4m.b.b(new h1(c1Var, this, 1, i));
        this.f119399h = e4m.b.b(new h1(c1Var, this, 0, i));
        this.i = e4m.b.b(e4m.c.a(creditPlanSelectionFlowContract$InputData));
        int i2 = 5;
        this.f119400j = e4m.b.b(new h1(c1Var, this, 7, i2));
        this.k = e4m.b.b(new h1(c1Var, this, 6, i2));
        this.f119401l = e4m.b.b(new h1(c1Var, this, 10, i2));
        this.f119402m = e4m.b.b(new h1(c1Var, this, 11, i2));
        this.f119403n = e4m.b.b(new h1(c1Var, this, 9, i2));
        this.o = e4m.b.b(new h1(c1Var, this, 8, i2));
        this.f119404p = e4m.b.b(new h1(c1Var, this, 5, i2));
        this.f119405q = e4m.b.b(new h1(c1Var, this, 4, i2));
        this.f119406r = e4m.b.b(new h1(c1Var, this, 3, i2));
        this.f119407s = e4m.b.b(new h1(c1Var, this, 12, i2));
        this.f119408t = e4m.b.b(new h1(c1Var, this, 13, i2));
        this.u = e4m.b.b(new h1(c1Var, this, 14, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119407s.get(), (yji.n) this.f119408t.get(), (yji.n) this.f119404p.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119399h.get(), (yji.d) this.f119406r.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119397c, this.d, 9);
    }
}
