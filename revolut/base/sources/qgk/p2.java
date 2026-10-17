package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class p2 implements alk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f246194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f246195c;
    public ViewController d;
    public PlanBillingPickerScreenContract$InputData e;

    public p2(i0 i0Var, k0 k0Var, g2 g2Var) {
        this.f246193a = i0Var;
        this.f246194b = k0Var;
        this.f246195c = g2Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.d = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.d, ViewController.class);
        vc.s.h(this.e, PlanBillingPickerScreenContract$InputData.class);
        return new k2(this.f246193a, this.f246194b, this.f246195c, this.e);
    }

    @Override // alk.a
    public final alk.a h(PlanBillingPickerScreenContract$InputData planBillingPickerScreenContract$InputData) {
        planBillingPickerScreenContract$InputData.getClass();
        this.e = planBillingPickerScreenContract$InputData;
        return this;
    }
}
