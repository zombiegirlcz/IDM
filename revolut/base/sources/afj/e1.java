package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_info_bottom_sheet.EsimCommonInfoBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class e1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4222c;
    public EsimCommonInfoBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ e1(b bVar, Object obj2, int i) {
        this.f4220a = i;
        this.f4221b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4220a) {
            case 0:
                this.f4222c = viewController;
                break;
            case 1:
                this.f4222c = viewController;
                break;
            case 2:
                this.f4222c = viewController;
                break;
            default:
                this.f4222c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4220a) {
            case 0:
                vc.s.h(this.f4222c, ViewController.class);
                vc.s.h(this.d, EsimCommonInfoBottomSheetScreenContract$InputData.class);
                return new f1(this.f4221b, (j) this.e, this.d);
            case 1:
                vc.s.h(this.f4222c, ViewController.class);
                vc.s.h(this.d, EsimCommonInfoBottomSheetScreenContract$InputData.class);
                return new f1(this.f4221b, (q) this.e, this.d);
            case 2:
                vc.s.h(this.f4222c, ViewController.class);
                vc.s.h(this.d, EsimCommonInfoBottomSheetScreenContract$InputData.class);
                return new f1(this.f4221b, (k0) this.e, this.d);
            default:
                vc.s.h(this.f4222c, ViewController.class);
                vc.s.h(this.d, EsimCommonInfoBottomSheetScreenContract$InputData.class);
                return new f1(this.f4221b, (m) this.e, this.d);
        }
    }
}
