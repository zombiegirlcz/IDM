package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class j2 implements alk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2 f246071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f246072c;
    public PlanBillingPickerScreenContract$InputData d;

    public j2(i0 i0Var, i2 i2Var) {
        this.f246070a = i0Var;
        this.f246071b = i2Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f246072c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f246072c, ViewController.class);
        vc.s.h(this.d, PlanBillingPickerScreenContract$InputData.class);
        return new k2(this.f246070a, this.f246071b, this.d);
    }

    @Override // alk.a
    public final alk.a h(PlanBillingPickerScreenContract$InputData planBillingPickerScreenContract$InputData) {
        planBillingPickerScreenContract$InputData.getClass();
        this.d = planBillingPickerScreenContract$InputData;
        return this;
    }
}
