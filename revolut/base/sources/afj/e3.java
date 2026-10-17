package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class e3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4228c;
    public EsimInstallBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ e3(b bVar, Object obj2, int i) {
        this.f4226a = i;
        this.f4227b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4226a) {
            case 0:
                this.f4228c = viewController;
                break;
            case 1:
                this.f4228c = viewController;
                break;
            default:
                this.f4228c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4226a) {
            case 0:
                vc.s.h(this.f4228c, ViewController.class);
                vc.s.h(this.d, EsimInstallBottomSheetScreenContract$InputData.class);
                return new f3(this.f4227b, (t0) this.e, this.d);
            case 1:
                vc.s.h(this.f4228c, ViewController.class);
                vc.s.h(this.d, EsimInstallBottomSheetScreenContract$InputData.class);
                return new f3(this.f4227b, (p) this.e, this.d);
            default:
                vc.s.h(this.f4228c, ViewController.class);
                vc.s.h(this.d, EsimInstallBottomSheetScreenContract$InputData.class);
                return new f3(this.f4227b, (n) this.e, this.d);
        }
    }
}
