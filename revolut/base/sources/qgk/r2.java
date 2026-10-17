package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class r2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f246219c;
    public PlanDowngradeBlockScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ r2(i0 i0Var, Object obj2, int i) {
        this.f246217a = i;
        this.f246218b = i0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f246217a) {
            case 0:
                this.f246219c = viewController;
                break;
            default:
                this.f246219c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f246217a) {
            case 0:
                vc.s.h(this.f246219c, ViewController.class);
                vc.s.h(this.d, PlanDowngradeBlockScreenContract$InputData.class);
                return new s2(this.f246218b, (e0) this.e, this.d);
            default:
                vc.s.h(this.f246219c, ViewController.class);
                vc.s.h(this.d, PlanDowngradeBlockScreenContract$InputData.class);
                return new w2(this.f246218b, (x) this.e, this.d);
        }
    }
}
