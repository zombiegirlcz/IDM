package xf6;

import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f304908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BrPaymentExpiryDateUpdateScreenContract$InputData f304909c;
    public final Object d;
    public final Object e;

    public /* synthetic */ k(Object obj2, Object obj3, int i) {
        this.f304907a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304907a) {
            case 0:
                this.f304908b = viewController;
                break;
            case 1:
                this.f304908b = viewController;
                break;
            default:
                this.f304908b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304907a) {
            case 0:
                vc.s.h(this.f304908b, ViewController.class);
                vc.s.h(this.f304909c, BrPaymentExpiryDateUpdateScreenContract$InputData.class);
                return new g3((t) this.d, (m) this.e, this.f304909c);
            case 1:
                vc.s.h(this.f304908b, ViewController.class);
                vc.s.h(this.f304909c, BrPaymentExpiryDateUpdateScreenContract$InputData.class);
                return new g3((w2) this.d, (a3) this.e, this.f304909c);
            default:
                vc.s.h(this.f304908b, ViewController.class);
                vc.s.h(this.f304909c, BrPaymentExpiryDateUpdateScreenContract$InputData.class);
                return new g3((w2) this.d, (u2) this.e, this.f304909c);
        }
    }
}
