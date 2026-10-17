package pt;

import aii.r;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentType f239562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f239563b;

    public l(BiometricVerificationDocumentType selectedDocumentType, wi0.b selectedCountry) {
        Intrinsics.checkNotNullParameter(selectedDocumentType, "selectedDocumentType");
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        this.f239562a = selectedDocumentType;
        this.f239563b = selectedCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f239562a, lVar.f239562a) && Intrinsics.f(this.f239563b, lVar.f239563b);
    }

    public final int hashCode() {
        return this.f239563b.f297794a.hashCode() + (this.f239562a.hashCode() * 31);
    }
}
