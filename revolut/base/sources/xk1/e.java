package xk1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationSummary f306596a;

    public e(ApmPaymentAuthorisationSummary authorisation) {
        Intrinsics.checkNotNullParameter(authorisation, "authorisation");
        this.f306596a = authorisation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f306596a, ((e) obj2).f306596a);
    }

    public final int hashCode() {
        return this.f306596a.hashCode();
    }
}
