package p8a;

import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class k1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f234009c;
    public PixQrCodeAddressScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ k1(d0 d0Var, Object obj2, int i) {
        this.f234007a = i;
        this.f234008b = d0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f234007a) {
            case 0:
                this.f234009c = viewController;
                break;
            default:
                this.f234009c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f234007a) {
            case 0:
                vc.s.h(this.f234009c, ViewController.class);
                vc.s.h(this.d, PixQrCodeAddressScreenContract$InputData.class);
                return new l1(this.f234008b, (y) this.e, this.d);
            default:
                vc.s.h(this.f234009c, ViewController.class);
                vc.s.h(this.d, PixQrCodeAddressScreenContract$InputData.class);
                return new l1(this.f234008b, (k0) this.e, this.d);
        }
    }
}
