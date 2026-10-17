package ft;

import aii.r;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocument f137749a;

    public j(BiometricVerificationDocument document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f137749a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f137749a, ((j) obj2).f137749a);
    }

    public final int hashCode() {
        return this.f137749a.hashCode();
    }
}
