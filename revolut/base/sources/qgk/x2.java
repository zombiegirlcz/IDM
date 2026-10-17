package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class x2 implements nlk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f246326c;
    public PlanCancelFeaturesScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x2(i0 i0Var, Object obj2, int i) {
        this.f246324a = i;
        this.f246325b = i0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f246324a) {
            case 0:
                this.f246326c = viewController;
                break;
            default:
                this.f246326c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f246324a) {
            case 0:
                vc.s.h(this.f246326c, ViewController.class);
                vc.s.h(this.d, PlanCancelFeaturesScreenContract$InputData.class);
                return new y2(this.f246325b, (x) this.e, this.f246326c, this.d);
            default:
                vc.s.h(this.f246326c, ViewController.class);
                vc.s.h(this.d, PlanCancelFeaturesScreenContract$InputData.class);
                return new z2(this.f246325b, (e0) this.e, this.f246326c, this.d);
        }
    }

    @Override // nlk.a
    public final nlk.a r(PlanCancelFeaturesScreenContract$InputData planCancelFeaturesScreenContract$InputData) {
        switch (this.f246324a) {
            case 0:
                planCancelFeaturesScreenContract$InputData.getClass();
                this.d = planCancelFeaturesScreenContract$InputData;
                break;
            default:
                planCancelFeaturesScreenContract$InputData.getClass();
                this.d = planCancelFeaturesScreenContract$InputData;
                break;
        }
        return this;
    }
}
