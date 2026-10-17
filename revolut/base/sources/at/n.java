package at;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f8967a;

    public n(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f8967a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f8967a, ((n) obj2).f8967a);
    }

    public final int hashCode() {
        return this.f8967a.hashCode();
    }
}
