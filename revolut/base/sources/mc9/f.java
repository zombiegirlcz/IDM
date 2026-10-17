package mc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignatureDetails f204314a;

    public f(ESignatureDetails eSignature) {
        Intrinsics.checkNotNullParameter(eSignature, "eSignature");
        this.f204314a = eSignature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f204314a, ((f) obj2).f204314a);
    }

    public final int hashCode() {
        return this.f204314a.hashCode();
    }
}
