package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class i3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4292c;
    public EsimNonRefundableBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ i3(b bVar, Object obj2, int i) {
        this.f4290a = i;
        this.f4291b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4290a) {
            case 0:
                this.f4292c = viewController;
                break;
            case 1:
                this.f4292c = viewController;
                break;
            case 2:
                this.f4292c = viewController;
                break;
            default:
                this.f4292c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4290a) {
            case 0:
                vc.s.h(this.f4292c, ViewController.class);
                vc.s.h(this.d, EsimNonRefundableBottomSheetScreenContract$InputData.class);
                return new j3(this.f4291b, (x0) this.e, this.d);
            case 1:
                vc.s.h(this.f4292c, ViewController.class);
                vc.s.h(this.d, EsimNonRefundableBottomSheetScreenContract$InputData.class);
                return new j3(this.f4291b, (t0) this.e, this.d);
            case 2:
                vc.s.h(this.f4292c, ViewController.class);
                vc.s.h(this.d, EsimNonRefundableBottomSheetScreenContract$InputData.class);
                return new j3(this.f4291b, (p) this.e, this.d);
            default:
                vc.s.h(this.f4292c, ViewController.class);
                vc.s.h(this.d, EsimNonRefundableBottomSheetScreenContract$InputData.class);
                return new j3(this.f4291b, (m) this.e, this.d);
        }
    }
}
