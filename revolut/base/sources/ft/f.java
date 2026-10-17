package ft;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f137745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationDocument f137746b;

    public f(BiometricVerificationDocument biometricVerificationDocument, List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f137745a = documents;
        this.f137746b = biometricVerificationDocument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137745a, fVar.f137745a) && Intrinsics.f(this.f137746b, fVar.f137746b);
    }

    public final int hashCode() {
        int iHashCode = this.f137745a.hashCode() * 31;
        BiometricVerificationDocument biometricVerificationDocument = this.f137746b;
        return iHashCode + (biometricVerificationDocument == null ? 0 : biometricVerificationDocument.hashCode());
    }
}
