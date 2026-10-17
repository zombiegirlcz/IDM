package ut;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocument f283006a;

    public k(BiometricVerificationDocument document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f283006a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f283006a, ((k) obj2).f283006a);
    }

    public final int hashCode() {
        return this.f283006a.hashCode();
    }
}
