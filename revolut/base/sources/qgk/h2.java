package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class h2 implements qhk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f245999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f246000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlanBillingPickerContract$InputData f246001c;

    public h2(i0 i0Var) {
        this.f245999a = i0Var;
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        this.f246000b = viewController;
        return this;
    }

    @Override // xki.b
    public final xki.c build() {
        vc.s.h(this.f246000b, ViewController.class);
        vc.s.h(this.f246001c, PlanBillingPickerContract$InputData.class);
        return new i2(this.f245999a, new qhk.d(), this.f246001c);
    }

    @Override // qhk.a
    public final qhk.a r(PlanBillingPickerContract$InputData planBillingPickerContract$InputData) {
        planBillingPickerContract$InputData.getClass();
        this.f246001c = planBillingPickerContract$InputData;
        return this;
    }
}
