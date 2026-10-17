package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class f2 implements qhk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f245954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f245955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f245956c;
    public PlanBillingPickerContract$InputData d;

    public f2(i0 i0Var, k0 k0Var) {
        this.f245954a = i0Var;
        this.f245955b = k0Var;
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        this.f245956c = viewController;
        return this;
    }

    @Override // xki.b
    public final xki.c build() {
        vc.s.h(this.f245956c, ViewController.class);
        vc.s.h(this.d, PlanBillingPickerContract$InputData.class);
        return new g2(this.f245954a, this.f245955b, new qhk.d(), this.d);
    }

    @Override // qhk.a
    public final qhk.a r(PlanBillingPickerContract$InputData planBillingPickerContract$InputData) {
        planBillingPickerContract$InputData.getClass();
        this.d = planBillingPickerContract$InputData;
        return this;
    }
}
