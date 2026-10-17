package oai;

import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheetContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f223722c;
    public EmailVerificationOtpBottomSheetContract$InputData d;

    public /* synthetic */ j0(i0 i0Var, Object obj2, int i) {
        this.f223720a = i;
        this.f223721b = i0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f223720a) {
            case 0:
                this.f223722c = viewController;
                break;
            default:
                this.f223722c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f223720a) {
            case 0:
                vc.s.h(this.f223722c, ViewController.class);
                vc.s.h(this.d, EmailVerificationOtpBottomSheetContract$InputData.class);
                return new k0(this.f223721b, this.d, 0);
            default:
                vc.s.h(this.f223722c, ViewController.class);
                vc.s.h(this.d, EmailVerificationOtpBottomSheetContract$InputData.class);
                return new k0(this.f223721b, this.d, 1);
        }
    }
}
