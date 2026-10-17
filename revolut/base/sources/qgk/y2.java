package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class y2 implements nlk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f246336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanCancelFeaturesScreenContract$InputData f246337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246338c;
    public final x d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246340h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246341j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f246342l;

    public y2(i0 i0Var, x xVar, ViewController viewController, PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData) {
        this.f246338c = i0Var;
        this.d = xVar;
        this.f246336a = viewController;
        this.f246337b = planCancelFeaturesScreenContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.f = e4m.b.b(new p1(i0Var, this, 2, i));
        this.f246339g = e4m.b.b(new p1(i0Var, this, 1, i));
        this.f246340h = e4m.b.b(new p1(i0Var, this, 0, i));
        this.i = e4m.b.b(new p1(i0Var, this, 5, i));
        this.f246341j = e4m.b.b(new p1(i0Var, this, 4, i));
        this.k = e4m.b.b(new p1(i0Var, this, 6, i));
        this.f246342l = e4m.b.b(new p1(i0Var, this, 3, i));
    }

    @Override // nlk.b
    public final mlk.x a() {
        return (mlk.x) this.f246342l.get();
    }

    public final dnk.l b() {
        return new dnk.l(this.f246338c.e.g(), 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.f246318m.get(), (yji.d) this.f246340h.get());
    }

    @Override // nlk.b
    public final j60.a k() {
        return (j60.a) this.f246339g.get();
    }
}
