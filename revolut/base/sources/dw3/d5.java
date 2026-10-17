package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class d5 implements pg4.a {
    public final e4m.e A;
    public final e4m.e B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq3.a f118568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final agk.a f118569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanSubscribeFlowContract$InputData f118570c;
    public final c1 d;
    public final d5 e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118572h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118573j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f118574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f118575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f118576n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f118577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f118578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f118579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f118580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f118581t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f118582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f118583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f118584y;
    public final e4m.e z;

    public d5(c1 c1Var, iq3.a aVar, agk.a aVar2, ViewController viewController, PlanSubscribeFlowContract$InputData planSubscribeFlowContract$InputData) {
        this.d = c1Var;
        this.f118568a = aVar;
        this.f118569b = aVar2;
        this.f118570c = planSubscribeFlowContract$InputData;
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.f118571g = e4m.b.b(new g3(c1Var, this, 2, i));
        this.f118572h = e4m.b.b(new g3(c1Var, this, 1, i));
        this.i = e4m.b.b(new g3(c1Var, this, 0, i));
        this.f118573j = e4m.b.b(e4m.c.a(planSubscribeFlowContract$InputData));
        this.k = e4m.b.b(new g3(c1Var, this, 7, i));
        this.f118574l = e4m.b.b(new g3(c1Var, this, 6, i));
        this.f118575m = e4m.b.b(new g3(c1Var, this, 10, i));
        this.f118576n = e4m.b.b(new g3(c1Var, this, 11, i));
        this.o = e4m.b.b(new g3(c1Var, this, 9, i));
        this.f118577p = e4m.b.b(new g3(c1Var, this, 8, i));
        this.f118578q = e4m.b.b(new g3(c1Var, this, 5, i));
        this.f118579r = e4m.b.b(new g3(c1Var, this, 4, i));
        this.f118580s = e4m.b.b(new g3(c1Var, this, 3, i));
        this.f118581t = e4m.b.b(new g3(c1Var, this, 12, i));
        this.u = e4m.b.b(new g3(c1Var, this, 15, i));
        this.v = e4m.b.b(new g3(c1Var, this, 16, i));
        this.f118582w = e4m.b.b(new g3(c1Var, this, 17, i));
        this.f118583x = e4m.b.b(new g3(c1Var, this, 14, i));
        this.f118584y = e4m.b.b(new g3(c1Var, this, 18, i));
        this.z = e4m.b.b(new g3(c1Var, this, 13, i));
        this.A = e4m.b.b(new g3(c1Var, this, 19, i));
        this.B = e4m.b.b(new g3(c1Var, this, 20, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
        builderBuilderWithExpectedSize.add(this.f118581t.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.z.get());
        builderBuilderWithExpectedSize.add(this.A.get());
        builderBuilderWithExpectedSize.add(this.f118578q.get());
        return j6.a.g(this.f118574l, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f118580s.get());
    }

    @Override // iq3.d
    public final iq3.b q() {
        return new q7(this.d, this.e, 10);
    }
}
