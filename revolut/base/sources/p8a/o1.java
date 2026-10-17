package p8a;

import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class o1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f234048c;
    public TokenVerificationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o1(d0 d0Var, Object obj2, int i) {
        this.f234046a = i;
        this.f234047b = d0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f234046a) {
            case 0:
                this.f234048c = viewController;
                break;
            default:
                this.f234048c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f234046a) {
            case 0:
                vc.s.h(this.f234048c, ViewController.class);
                vc.s.h(this.d, TokenVerificationScreenContract$InputData.class);
                return new p1(this.f234047b, (x0) this.e, this.d);
            default:
                vc.s.h(this.f234048c, ViewController.class);
                vc.s.h(this.d, TokenVerificationScreenContract$InputData.class);
                return new p1(this.f234047b, (f) this.e, this.d);
        }
    }
}
