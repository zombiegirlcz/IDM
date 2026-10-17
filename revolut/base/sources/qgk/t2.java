package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class t2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f246246c;
    public PlanDowngradeFeesAndTermsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ t2(i0 i0Var, Object obj2, int i) {
        this.f246244a = i;
        this.f246245b = i0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f246244a) {
            case 0:
                this.f246246c = viewController;
                break;
            case 1:
                this.f246246c = viewController;
                break;
            case 2:
                this.f246246c = viewController;
                break;
            case 3:
                this.f246246c = viewController;
                break;
            default:
                this.f246246c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f246244a) {
            case 0:
                vc.s.h(this.f246246c, ViewController.class);
                vc.s.h(this.d, PlanDowngradeFeesAndTermsScreenContract$InputData.class);
                return new u2(this.f246245b, (a1) this.e, this.f246246c, this.d);
            case 1:
                vc.s.h(this.f246246c, ViewController.class);
                vc.s.h(this.d, PlanDowngradeFeesAndTermsScreenContract$InputData.class);
                return new u2(this.f246245b, (p0) this.e, this.f246246c, this.d);
            case 2:
                vc.s.h(this.f246246c, ViewController.class);
                vc.s.h(this.d, PlanDowngradeFeesAndTermsScreenContract$InputData.class);
                return new v2(this.f246245b, (x) this.e, this.f246246c, this.d);
            case 3:
                vc.s.h(this.f246246c, ViewController.class);
                vc.s.h(this.d, PlanDowngradeFeesAndTermsScreenContract$InputData.class);
                return new u2(this.f246245b, (e0) this.e, this.f246246c, this.d);
            default:
                vc.s.h(this.f246246c, ViewController.class);
                vc.s.h(this.d, PlanDowngradeFeesAndTermsScreenContract$InputData.class);
                return new u2(this.f246245b, (j) this.e, this.f246246c, this.d);
        }
    }
}
