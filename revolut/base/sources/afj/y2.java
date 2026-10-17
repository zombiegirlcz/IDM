package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class y2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4543c;
    public EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ y2(b bVar, Object obj2, int i) {
        this.f4541a = i;
        this.f4542b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4541a) {
            case 0:
                this.f4543c = viewController;
                break;
            case 1:
                this.f4543c = viewController;
                break;
            default:
                this.f4543c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4541a) {
            case 0:
                vc.s.h(this.f4543c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.class);
                return new z2(this.f4542b, (e0) this.e, this.d);
            case 1:
                vc.s.h(this.f4543c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.class);
                return new z2(this.f4542b, (b0) this.e, this.d);
            default:
                vc.s.h(this.f4543c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.class);
                return new z2(this.f4542b, (n0) this.e, this.d);
        }
    }
}
