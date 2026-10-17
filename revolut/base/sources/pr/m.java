package pr;

import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.BiometricVerificationActiveLivenessStepFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationActiveLivenessStepFlowContract$InputData f238859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f238860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f238861c;
    public final m d = this;
    public final e4m.e e;
    public final e4m.e f;

    public m(q qVar, ViewController viewController, BiometricVerificationActiveLivenessStepFlowContract$InputData biometricVerificationActiveLivenessStepFlowContract$InputData) {
        this.f238861c = qVar;
        this.f238859a = biometricVerificationActiveLivenessStepFlowContract$InputData;
        this.f238860b = viewController;
        int i = 11;
        this.e = e4m.b.b(new ppd.i0(qVar, this, 1, i));
        this.f = e4m.b.b(new ppd.i0(qVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
