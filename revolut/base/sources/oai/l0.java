package oai;

import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f223734c;
    public EmailVerificationOtpScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ l0(i0 i0Var, Object obj2, int i) {
        this.f223732a = i;
        this.f223733b = i0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f223732a) {
            case 0:
                this.f223734c = viewController;
                break;
            default:
                this.f223734c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f223732a) {
            case 0:
                vc.s.h(this.f223734c, ViewController.class);
                vc.s.h(this.d, EmailVerificationOtpScreenContract$InputData.class);
                return new m0(this.f223733b, (l) this.e, this.d);
            default:
                vc.s.h(this.f223734c, ViewController.class);
                vc.s.h(this.d, EmailVerificationOtpScreenContract$InputData.class);
                return new m0(this.f223733b, (i) this.e, this.d);
        }
    }
}
