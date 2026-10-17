package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.EsimRefundInfoBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class g3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4262c;
    public EsimRefundInfoBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ g3(b bVar, Object obj2, int i) {
        this.f4260a = i;
        this.f4261b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4260a) {
            case 0:
                this.f4262c = viewController;
                break;
            case 1:
                this.f4262c = viewController;
                break;
            default:
                this.f4262c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4260a) {
            case 0:
                vc.s.h(this.f4262c, ViewController.class);
                vc.s.h(this.d, EsimRefundInfoBottomSheetScreenContract$InputData.class);
                return new h3(this.f4261b, (t0) this.e, this.d);
            case 1:
                vc.s.h(this.f4262c, ViewController.class);
                vc.s.h(this.d, EsimRefundInfoBottomSheetScreenContract$InputData.class);
                return new h3(this.f4261b, (p) this.e, this.d);
            default:
                vc.s.h(this.f4262c, ViewController.class);
                vc.s.h(this.d, EsimRefundInfoBottomSheetScreenContract$InputData.class);
                return new h3(this.f4261b, (x0) this.e, this.d);
        }
    }
}
