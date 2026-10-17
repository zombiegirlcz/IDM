package us6;

import com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees.FreelancerAcquiringPaymentFeesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f282662c;
    public FreelancerAcquiringPaymentFeesScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ p1(q qVar, Object obj2, int i) {
        this.f282660a = i;
        this.f282661b = qVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f282660a) {
            case 0:
                this.f282662c = viewController;
                break;
            default:
                this.f282662c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f282660a) {
            case 0:
                vc.s.h(this.f282662c, ViewController.class);
                vc.s.h(this.d, FreelancerAcquiringPaymentFeesScreenContract$InputData.class);
                return new q1(this.f282661b, (m) this.e, this.d);
            default:
                vc.s.h(this.f282662c, ViewController.class);
                vc.s.h(this.d, FreelancerAcquiringPaymentFeesScreenContract$InputData.class);
                return new q1(this.f282661b, (h) this.e, this.d);
        }
    }
}
