package xf6;

import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f304920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BrPaymentLimitsUpdateScreenContract$InputData f304921c;
    public final Object d;
    public final Object e;

    public /* synthetic */ l(Object obj2, Object obj3, int i) {
        this.f304919a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304919a) {
            case 0:
                this.f304920b = viewController;
                break;
            case 1:
                this.f304920b = viewController;
                break;
            default:
                this.f304920b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304919a) {
            case 0:
                vc.s.h(this.f304920b, ViewController.class);
                vc.s.h(this.f304921c, BrPaymentLimitsUpdateScreenContract$InputData.class);
                return new e3((t) this.d, (m) this.e, this.f304921c);
            case 1:
                vc.s.h(this.f304920b, ViewController.class);
                vc.s.h(this.f304921c, BrPaymentLimitsUpdateScreenContract$InputData.class);
                return new e3((w2) this.d, (a3) this.e, this.f304921c);
            default:
                vc.s.h(this.f304920b, ViewController.class);
                vc.s.h(this.f304921c, BrPaymentLimitsUpdateScreenContract$InputData.class);
                return new e3((w2) this.d, (u2) this.e, this.f304921c);
        }
    }
}
