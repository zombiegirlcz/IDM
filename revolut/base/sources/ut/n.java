package ut;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocument f283008a;

    public n(BiometricVerificationDocument document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f283008a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f283008a, ((n) obj2).f283008a);
    }

    public final int hashCode() {
        return this.f283008a.hashCode();
    }
}
