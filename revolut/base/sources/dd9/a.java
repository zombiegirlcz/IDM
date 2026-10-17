package dd9;

import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.c1;
import dw3.s2;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f113119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ESignOtpScreenContract$InputData f113120c;
    public final Object d;
    public final Object e;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f113118a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f113118a) {
            case 0:
                this.f113119b = viewController;
                break;
            case 1:
                this.f113119b = viewController;
                break;
            default:
                this.f113119b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f113118a) {
            case 0:
                s.h(this.f113119b, ViewController.class);
                s.h(this.f113120c, ESignOtpScreenContract$InputData.class);
                return new b((e) this.d, (f) this.e, this.f113120c);
            case 1:
                s.h(this.f113119b, ViewController.class);
                s.h(this.f113120c, ESignOtpScreenContract$InputData.class);
                return new b((c1) this.d, (s2) this.e, this.f113120c);
            default:
                s.h(this.f113119b, ViewController.class);
                s.h(this.f113120c, ESignOtpScreenContract$InputData.class);
                return new qc9.a((qc9.c) this.d, (qc9.d) this.e, this.f113120c);
        }
    }
}
