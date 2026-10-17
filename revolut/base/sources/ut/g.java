package ut;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f283000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiometricVerificationDocument f283002c;

    public g(wi0.b currentCountry, List documents, BiometricVerificationDocument biometricVerificationDocument) {
        Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f283000a = currentCountry;
        this.f283001b = documents;
        this.f283002c = biometricVerificationDocument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f283000a, gVar.f283000a) && Intrinsics.f(this.f283001b, gVar.f283001b) && Intrinsics.f(this.f283002c, gVar.f283002c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f283000a.f297794a.hashCode() * 31, 31, this.f283001b);
        BiometricVerificationDocument biometricVerificationDocument = this.f283002c;
        return iD + (biometricVerificationDocument == null ? 0 : biometricVerificationDocument.hashCode());
    }
}
