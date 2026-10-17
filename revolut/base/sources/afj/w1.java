package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class w1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4509c;
    public EsimMobilePlanBillingScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w1(b bVar, Object obj2, int i) {
        this.f4507a = i;
        this.f4508b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4507a) {
            case 0:
                this.f4509c = viewController;
                break;
            default:
                this.f4509c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4507a) {
            case 0:
                vc.s.h(this.f4509c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanBillingScreenContract$InputData.class);
                return new x1(this.f4508b, (q0) this.e, this.d);
            default:
                vc.s.h(this.f4509c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanBillingScreenContract$InputData.class);
                return new x1(this.f4508b, (m) this.e, this.d);
        }
    }
}
