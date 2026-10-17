package kc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignatureDetails f182673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182674b;

    public f(ESignatureDetails signatureDetails, String str) {
        Intrinsics.checkNotNullParameter(signatureDetails, "signatureDetails");
        this.f182673a = signatureDetails;
        this.f182674b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f182673a, fVar.f182673a) && Intrinsics.f(this.f182674b, fVar.f182674b);
    }

    public final int hashCode() {
        int iHashCode = this.f182673a.hashCode() * 31;
        String str = this.f182674b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
