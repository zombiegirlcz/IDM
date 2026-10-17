package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class u2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4472c;
    public EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u2(b bVar, Object obj2, int i) {
        this.f4470a = i;
        this.f4471b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4470a) {
            case 0:
                this.f4472c = viewController;
                break;
            case 1:
                this.f4472c = viewController;
                break;
            default:
                this.f4472c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4470a) {
            case 0:
                vc.s.h(this.f4472c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class);
                return new v2(this.f4471b, (e0) this.e, this.d);
            case 1:
                vc.s.h(this.f4472c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class);
                return new v2(this.f4471b, (b0) this.e, this.d);
            default:
                vc.s.h(this.f4472c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class);
                return new v2(this.f4471b, (n0) this.e, this.d);
        }
    }
}
