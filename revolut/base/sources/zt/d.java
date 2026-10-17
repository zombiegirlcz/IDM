package zt;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$Step.Camera f324996a;

    public d(BiometricVerificationDocumentStepFlowContract$Step.Camera cameraStep) {
        Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
        this.f324996a = cameraStep;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f324996a, ((d) obj2).f324996a);
    }

    public final int hashCode() {
        return this.f324996a.hashCode();
    }
}
