package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class s2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4439c;
    public EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ s2(b bVar, Object obj2, int i) {
        this.f4437a = i;
        this.f4438b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4437a) {
            case 0:
                this.f4439c = viewController;
                break;
            default:
                this.f4439c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4437a) {
            case 0:
                vc.s.h(this.f4439c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.class);
                return new t2(this.f4438b, (b0) this.e, this.d);
            default:
                vc.s.h(this.f4439c, ViewController.class);
                vc.s.h(this.d, EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.class);
                return new t2(this.f4438b, (n0) this.e, this.d);
        }
    }
}
