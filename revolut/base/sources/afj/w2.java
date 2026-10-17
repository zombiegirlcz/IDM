package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class w2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4512c;
    public EsimPickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w2(b bVar, Object obj2, int i) {
        this.f4510a = i;
        this.f4511b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4510a) {
            case 0:
                this.f4512c = viewController;
                break;
            default:
                this.f4512c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4510a) {
            case 0:
                vc.s.h(this.f4512c, ViewController.class);
                vc.s.h(this.d, EsimPickerScreenContract$InputData.class);
                return new x2(this.f4511b, (b0) this.e, this.d);
            default:
                vc.s.h(this.f4512c, ViewController.class);
                vc.s.h(this.d, EsimPickerScreenContract$InputData.class);
                return new x2(this.f4511b, (n0) this.e, this.d);
        }
    }
}
