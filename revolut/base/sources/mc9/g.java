package mc9;

import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ESignatureDetails f204315a;

    public g(ESignatureDetails eSignature) {
        Intrinsics.checkNotNullParameter(eSignature, "eSignature");
        this.f204315a = eSignature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f204315a, ((g) obj2).f204315a);
    }

    public final int hashCode() {
        return this.f204315a.hashCode();
    }
}
