package pr;

import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class u implements xki.c, eu.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$InputData f238895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f238896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f238897c;
    public final u d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238898g;

    public u(q qVar, ViewController viewController, BiometricVerificationDocumentStepFlowContract$InputData biometricVerificationDocumentStepFlowContract$InputData) {
        this.f238897c = qVar;
        this.f238895a = biometricVerificationDocumentStepFlowContract$InputData;
        this.f238896b = viewController;
        int i = 12;
        this.e = e4m.b.b(new ppd.i0(qVar, this, 2, i));
        this.f = e4m.b.b(new ppd.i0(qVar, this, 1, i));
        this.f238898g = e4m.b.b(new ppd.i0(qVar, this, 0, i));
    }

    @Override // eu.a
    public final i0 b() {
        return new i0(this.f238897c, this.d, 1);
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
