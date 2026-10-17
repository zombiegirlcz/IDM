package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class v2 implements klk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDowngradeFeesAndTermsScreenContract$InputData f246294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f246295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246296c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246298h;

    public v2(i0 i0Var, x xVar, ViewController viewController, PlanDowngradeFeesAndTermsScreenContract$InputData planDowngradeFeesAndTermsScreenContract$InputData) {
        this.f246295b = xVar;
        this.f246294a = planDowngradeFeesAndTermsScreenContract$InputData;
        this.f246296c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new p1(i0Var, this, 2, i));
        this.e = e4m.b.b(new p1(i0Var, this, 1, i));
        this.f = e4m.b.b(new p1(i0Var, this, 0, i));
        this.f246297g = e4m.b.b(new p1(i0Var, this, 4, i));
        this.f246298h = e4m.b.b(new p1(i0Var, this, 3, i));
    }

    @Override // klk.a
    public final jlk.k a() {
        return (jlk.k) this.f246298h.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246295b.f246318m.get(), (yji.d) this.f.get());
    }

    @Override // klk.a
    public final j60.a k() {
        return (j60.a) this.e.get();
    }
}
