package vk1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationSummary f289854a;

    public j(ApmPaymentAuthorisationSummary authorisation) {
        Intrinsics.checkNotNullParameter(authorisation, "authorisation");
        this.f289854a = authorisation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f289854a, ((j) obj2).f289854a);
    }

    public final int hashCode() {
        return this.f289854a.hashCode();
    }
}
