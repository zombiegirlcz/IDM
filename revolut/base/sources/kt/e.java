package kt;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$Step.NfcReader f189486a;

    public e(BiometricVerificationDocumentStepFlowContract$Step.NfcReader step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f189486a = step;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f189486a, ((e) obj2).f189486a);
    }

    public final int hashCode() {
        return this.f189486a.hashCode();
    }
}
