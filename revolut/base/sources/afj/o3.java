package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class o3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4380c;
    public EsimRefundScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o3(b bVar, Object obj2, int i) {
        this.f4378a = i;
        this.f4379b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4378a) {
            case 0:
                this.f4380c = viewController;
                break;
            case 1:
                this.f4380c = viewController;
                break;
            default:
                this.f4380c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4378a) {
            case 0:
                vc.s.h(this.f4380c, ViewController.class);
                vc.s.h(this.d, EsimRefundScreenContract$InputData.class);
                return new p3(this.f4379b, (t0) this.e, this.d);
            case 1:
                vc.s.h(this.f4380c, ViewController.class);
                vc.s.h(this.d, EsimRefundScreenContract$InputData.class);
                return new p3(this.f4379b, (p) this.e, this.d);
            default:
                vc.s.h(this.f4380c, ViewController.class);
                vc.s.h(this.d, EsimRefundScreenContract$InputData.class);
                return new p3(this.f4379b, (x0) this.e, this.d);
        }
    }
}
