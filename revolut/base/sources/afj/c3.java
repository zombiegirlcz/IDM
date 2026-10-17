package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.EsimAlreadyInstalledBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class c3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4196c;
    public EsimAlreadyInstalledBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ c3(b bVar, Object obj2, int i) {
        this.f4194a = i;
        this.f4195b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4194a) {
            case 0:
                this.f4196c = viewController;
                break;
            default:
                this.f4196c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4194a) {
            case 0:
                vc.s.h(this.f4196c, ViewController.class);
                vc.s.h(this.d, EsimAlreadyInstalledBottomSheetScreenContract$InputData.class);
                return new d3(this.f4195b, (p) this.e, this.d);
            default:
                vc.s.h(this.f4196c, ViewController.class);
                vc.s.h(this.d, EsimAlreadyInstalledBottomSheetScreenContract$InputData.class);
                return new d3(this.f4195b, (t0) this.e, this.d);
        }
    }
}
