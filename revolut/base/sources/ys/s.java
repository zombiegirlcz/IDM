package ys;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class s implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f316361a;

    public s(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f316361a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f316361a, ((s) obj2).f316361a);
    }

    public final int hashCode() {
        return this.f316361a.hashCode();
    }
}
