package p8a;

import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class i1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233990c;
    public PixQrCodeAdditionalInformationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ i1(d0 d0Var, Object obj2, int i) {
        this.f233988a = i;
        this.f233989b = d0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f233988a) {
            case 0:
                this.f233990c = viewController;
                break;
            default:
                this.f233990c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f233988a) {
            case 0:
                vc.s.h(this.f233990c, ViewController.class);
                vc.s.h(this.d, PixQrCodeAdditionalInformationScreenContract$InputData.class);
                return new j1(this.f233989b, (y) this.e, this.d);
            default:
                vc.s.h(this.f233990c, ViewController.class);
                vc.s.h(this.d, PixQrCodeAdditionalInformationScreenContract$InputData.class);
                return new j1(this.f233989b, (k0) this.e, this.d);
        }
    }
}
