package xs;

import aii.r;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f308378a;

    public c(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f308378a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f308378a, ((c) obj2).f308378a);
    }

    public final int hashCode() {
        return this.f308378a.hashCode();
    }
}
