package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class q1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4404c;
    public EsimMobilePlanCancellationTermsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ q1(b bVar, Object obj2, int i) {
        this.f4402a = i;
        this.f4403b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4402a) {
            case 0:
                this.f4404c = viewController;
                break;
            default:
                this.f4404c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4402a) {
            case 0:
                vc.s.h(this.f4404c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanCancellationTermsScreenContract$InputData.class);
                return new r1(this.f4403b, (p) this.e, this.d);
            default:
                vc.s.h(this.f4404c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanCancellationTermsScreenContract$InputData.class);
                return new r1(this.f4403b, (q) this.e, this.d);
        }
    }
}
