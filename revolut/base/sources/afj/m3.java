package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class m3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4349c;
    public EsimRefundReasonScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ m3(b bVar, Object obj2, int i) {
        this.f4347a = i;
        this.f4348b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4347a) {
            case 0:
                this.f4349c = viewController;
                break;
            default:
                this.f4349c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4347a) {
            case 0:
                vc.s.h(this.f4349c, ViewController.class);
                vc.s.h(this.d, EsimRefundReasonScreenContract$InputData.class);
                return new n3(this.f4348b, (p) this.e, this.d);
            default:
                vc.s.h(this.f4349c, ViewController.class);
                vc.s.h(this.d, EsimRefundReasonScreenContract$InputData.class);
                return new n3(this.f4348b, (t0) this.e, this.d);
        }
    }
}
