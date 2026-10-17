package oai;

import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f223745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f223746c;
    public EmailVerificationCooldownBottomSheetContract$InputData d;

    public /* synthetic */ n0(i0 i0Var, Object obj2, int i) {
        this.f223744a = i;
        this.f223745b = i0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f223744a) {
            case 0:
                this.f223746c = viewController;
                break;
            case 1:
                this.f223746c = viewController;
                break;
            case 2:
                this.f223746c = viewController;
                break;
            case 3:
                this.f223746c = viewController;
                break;
            default:
                this.f223746c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f223744a) {
            case 0:
                vc.s.h(this.f223746c, ViewController.class);
                vc.s.h(this.d, EmailVerificationCooldownBottomSheetContract$InputData.class);
                return new o0(this.f223745b, this.d, 0);
            case 1:
                vc.s.h(this.f223746c, ViewController.class);
                vc.s.h(this.d, EmailVerificationCooldownBottomSheetContract$InputData.class);
                return new o0(this.f223745b, this.d, 1);
            case 2:
                vc.s.h(this.f223746c, ViewController.class);
                vc.s.h(this.d, EmailVerificationCooldownBottomSheetContract$InputData.class);
                return new o0(this.f223745b, this.d, 2);
            case 3:
                vc.s.h(this.f223746c, ViewController.class);
                vc.s.h(this.d, EmailVerificationCooldownBottomSheetContract$InputData.class);
                return new o0(this.f223745b, this.d, 3);
            default:
                vc.s.h(this.f223746c, ViewController.class);
                vc.s.h(this.d, EmailVerificationCooldownBottomSheetContract$InputData.class);
                return new o0(this.f223745b, this.d, 4);
        }
    }

    public /* synthetic */ n0(i0 i0Var, Object obj2, q0 q0Var, int i) {
        this.f223744a = i;
        this.f223745b = i0Var;
    }
}
