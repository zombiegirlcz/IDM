package afj;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.EsimAutoRenewalInfoScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f4549c;
    public EsimAutoRenewalInfoScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ z0(b bVar, Object obj2, int i) {
        this.f4547a = i;
        this.f4548b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4547a) {
            case 0:
                this.f4549c = viewController;
                break;
            default:
                this.f4549c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4547a) {
            case 0:
                vc.s.h(this.f4549c, ViewController.class);
                vc.s.h(this.d, EsimAutoRenewalInfoScreenContract$InputData.class);
                return new a1(this.f4548b, (c) this.e, this.d);
            default:
                vc.s.h(this.f4549c, ViewController.class);
                vc.s.h(this.d, EsimAutoRenewalInfoScreenContract$InputData.class);
                return new a1(this.f4548b, (m) this.e, this.d);
        }
    }
}
