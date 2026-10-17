package us6;

import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f282736c;
    public FreelancerPaymentProcessingFeesContract$InputData d;
    public final Object e;

    public /* synthetic */ r1(q qVar, Object obj2, int i) {
        this.f282734a = i;
        this.f282735b = qVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f282734a) {
            case 0:
                this.f282736c = baseScreen;
                break;
            case 1:
                this.f282736c = baseScreen;
                break;
            default:
                this.f282736c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f282734a) {
            case 0:
                vc.s.h(this.f282736c, BaseScreen.class);
                vc.s.h(this.d, FreelancerPaymentProcessingFeesContract$InputData.class);
                return new s1(this.f282735b, (m) this.e, this.d);
            case 1:
                vc.s.h(this.f282736c, BaseScreen.class);
                vc.s.h(this.d, FreelancerPaymentProcessingFeesContract$InputData.class);
                return new s1(this.f282735b, (p0) this.e, this.d);
            default:
                vc.s.h(this.f282736c, BaseScreen.class);
                vc.s.h(this.d, FreelancerPaymentProcessingFeesContract$InputData.class);
                return new s1(this.f282735b, (h) this.e, this.d);
        }
    }
}
