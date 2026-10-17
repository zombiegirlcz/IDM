package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_price_breakdown.EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4317c;
    public EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ k2(b bVar, Object obj2, int i) {
        this.f4315a = i;
        this.f4316b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4315a) {
            case 0:
                this.f4317c = viewController;
                break;
            default:
                this.f4317c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4315a) {
            case 0:
                vc.s.h(this.f4317c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.class);
                return new l2(this.f4316b, (k0) this.e, this.d);
            default:
                vc.s.h(this.f4317c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.class);
                return new l2(this.f4316b, (q) this.e, this.d);
        }
    }
}
