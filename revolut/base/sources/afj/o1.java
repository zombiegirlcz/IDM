package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class o1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4374c;
    public EsimInfoBottomSheetScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o1(b bVar, Object obj2, int i) {
        this.f4372a = i;
        this.f4373b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4372a) {
            case 0:
                this.f4374c = viewController;
                break;
            case 1:
                this.f4374c = viewController;
                break;
            case 2:
                this.f4374c = viewController;
                break;
            case 3:
                this.f4374c = viewController;
                break;
            default:
                this.f4374c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4372a) {
            case 0:
                vc.s.h(this.f4374c, ViewController.class);
                vc.s.h(this.d, EsimInfoBottomSheetScreenContract$InputData.class);
                return new p1(this.f4373b, (j) this.e, this.d);
            case 1:
                vc.s.h(this.f4374c, ViewController.class);
                vc.s.h(this.d, EsimInfoBottomSheetScreenContract$InputData.class);
                return new p1(this.f4373b, (q) this.e, this.d);
            case 2:
                vc.s.h(this.f4374c, ViewController.class);
                vc.s.h(this.d, EsimInfoBottomSheetScreenContract$InputData.class);
                return new p1(this.f4373b, (q0) this.e, this.d);
            case 3:
                vc.s.h(this.f4374c, ViewController.class);
                vc.s.h(this.d, EsimInfoBottomSheetScreenContract$InputData.class);
                return new p1(this.f4373b, (l) this.e, this.d);
            default:
                vc.s.h(this.f4374c, ViewController.class);
                vc.s.h(this.d, EsimInfoBottomSheetScreenContract$InputData.class);
                return new p1(this.f4373b, (m) this.e, this.d);
        }
    }
}
