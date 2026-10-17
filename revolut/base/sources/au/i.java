package au;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$Step.Camera f9118a;

    public i(BiometricVerificationDocumentStepFlowContract$Step.Camera cameraStep) {
        Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
        this.f9118a = cameraStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f9118a, ((i) obj2).f9118a);
    }

    public final int hashCode() {
        return this.f9118a.hashCode();
    }
}
