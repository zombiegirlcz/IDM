package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.MortgageValuationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j4 implements xki.c, iq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f119031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MortgageValuationFlowContract$InputData f119032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f119033c;
    public final j4 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119035h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f119036j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f119037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f119038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f119039n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f119040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f119041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f119042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f119043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f119044t;

    public j4(c1 c1Var, iq3.a aVar, ViewController viewController, MortgageValuationFlowContract$InputData mortgageValuationFlowContract$InputData) {
        this.f119033c = c1Var;
        this.f119031a = aVar;
        this.f119032b = mortgageValuationFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 17;
        this.f = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f119034g = e4m.b.b(new g3(c1Var, this, 1, i));
        this.f119035h = e4m.b.b(new g3(c1Var, this, 0, i));
        this.i = e4m.b.b(new g3(c1Var, this, 7, i));
        this.f119036j = e4m.b.b(new g3(c1Var, this, 6, i));
        this.k = e4m.b.b(new g3(c1Var, this, 10, i));
        this.f119037l = e4m.b.b(new g3(c1Var, this, 11, i));
        this.f119038m = e4m.b.b(new g3(c1Var, this, 9, i));
        this.f119039n = e4m.b.b(new g3(c1Var, this, 8, i));
        this.o = e4m.b.b(new g3(c1Var, this, 5, i));
        this.f119040p = e4m.b.b(new g3(c1Var, this, 4, i));
        this.f119041q = e4m.b.b(new g3(c1Var, this, 3, i));
        this.f119042r = e4m.b.b(new g3(c1Var, this, 12, i));
        this.f119043s = e4m.b.b(new g3(c1Var, this, 13, i));
        this.f119044t = e4m.b.b(new g3(c1Var, this, 14, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119042r.get(), (yji.n) this.f119043s.get(), (yji.n) this.o.get(), (yji.n) this.f119036j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f119035h.get(), (yji.d) this.f119041q.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.f119033c, this.d, 14);
    }
}
