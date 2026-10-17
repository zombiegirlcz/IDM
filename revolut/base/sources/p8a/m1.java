package p8a;

import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class m1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f234029c;
    public PixQrCodeMoneyBreakdownScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ m1(d0 d0Var, Object obj2, int i) {
        this.f234027a = i;
        this.f234028b = d0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f234027a) {
            case 0:
                this.f234029c = viewController;
                break;
            default:
                this.f234029c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f234027a) {
            case 0:
                vc.s.h(this.f234029c, ViewController.class);
                vc.s.h(this.d, PixQrCodeMoneyBreakdownScreenContract$InputData.class);
                return new n1(this.f234028b, (y) this.e, this.d);
            default:
                vc.s.h(this.f234029c, ViewController.class);
                vc.s.h(this.d, PixQrCodeMoneyBreakdownScreenContract$InputData.class);
                return new n1(this.f234028b, (k0) this.e, this.d);
        }
    }
}
