package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class a3 implements nlk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f245882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f245883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlanCancelFeaturesScreenContract$InputData f245884c;

    public a3(i0 i0Var) {
        this.f245882a = i0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f245883b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f245883b, ViewController.class);
        vc.s.h(this.f245884c, PlanCancelFeaturesScreenContract$InputData.class);
        return new z2(this.f245882a, this.f245883b, this.f245884c);
    }

    @Override // nlk.a
    public final nlk.a r(PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData) {
        planCancelFeaturesScreenContract$InputData.getClass();
        this.f245884c = planCancelFeaturesScreenContract$InputData;
        return this;
    }
}
