package zt;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationNfcFlowContract$AuthData f324993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationDocumentStepFlowContract$Step.Camera f324994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324995c;
    public final BiometricVerificationDocument d;
    public final boolean e;

    public c(BiometricVerificationNfcFlowContract$AuthData authData, BiometricVerificationDocumentStepFlowContract$Step.Camera cameraStep, boolean z, BiometricVerificationDocument document, boolean z3) {
        Intrinsics.checkNotNullParameter(authData, "authData");
        Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f324993a = authData;
        this.f324994b = cameraStep;
        this.f324995c = z;
        this.d = document;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f324993a, cVar.f324993a) && Intrinsics.f(this.f324994b, cVar.f324994b) && this.f324995c == cVar.f324995c && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + j6.a.c((this.f324994b.hashCode() + (this.f324993a.hashCode() * 31)) * 31, 31, this.f324995c)) * 31);
    }
}
