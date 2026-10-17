package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class k3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4320c;
    public EsimSubscriptionDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ k3(b bVar, Object obj2, int i) {
        this.f4318a = i;
        this.f4319b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4318a) {
            case 0:
                this.f4320c = viewController;
                break;
            default:
                this.f4320c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4318a) {
            case 0:
                vc.s.h(this.f4320c, ViewController.class);
                vc.s.h(this.d, EsimSubscriptionDetailsScreenContract$InputData.class);
                return new l3(this.f4319b, (x0) this.e, this.d);
            default:
                vc.s.h(this.f4320c, ViewController.class);
                vc.s.h(this.d, EsimSubscriptionDetailsScreenContract$InputData.class);
                return new l3(this.f4319b, (m) this.e, this.d);
        }
    }
}
