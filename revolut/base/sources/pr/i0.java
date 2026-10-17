package pr;

import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes17.dex */
public final class i0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f238850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f238851c;
    public BiometricVerificationManualInputContract$InputData d;
    public final Object e;

    public /* synthetic */ i0(q qVar, Object obj2, int i) {
        this.f238849a = i;
        this.f238850b = qVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f238849a) {
            case 0:
                this.f238851c = viewController;
                break;
            default:
                this.f238851c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f238849a) {
            case 0:
                vc.s.h(this.f238851c, ViewController.class);
                vc.s.h(this.d, BiometricVerificationManualInputContract$InputData.class);
                return new j0(this.f238850b, (d0) this.e, this.d);
            default:
                vc.s.h(this.f238851c, ViewController.class);
                vc.s.h(this.d, BiometricVerificationManualInputContract$InputData.class);
                return new j0(this.f238850b, (u) this.e, this.d);
        }
    }
}
