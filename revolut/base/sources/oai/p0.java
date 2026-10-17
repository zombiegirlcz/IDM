package oai;

import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f223757c;
    public EmailVerificationPromptContract$InputData d;
    public final Object e;

    public /* synthetic */ p0(i0 i0Var, Object obj2, int i) {
        this.f223755a = i;
        this.f223756b = i0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f223755a) {
            case 0:
                this.f223757c = viewController;
                break;
            default:
                this.f223757c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f223755a) {
            case 0:
                vc.s.h(this.f223757c, ViewController.class);
                vc.s.h(this.d, EmailVerificationPromptContract$InputData.class);
                return new q0(this.f223756b, (k) this.e, this.d);
            default:
                vc.s.h(this.f223757c, ViewController.class);
                vc.s.h(this.d, EmailVerificationPromptContract$InputData.class);
                return new q0(this.f223756b, (i) this.e, this.d);
        }
    }
}
