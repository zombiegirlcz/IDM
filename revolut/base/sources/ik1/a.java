package ik1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationSummary f161867a;

    public a(ApmPaymentAuthorisationSummary authorisation) {
        Intrinsics.checkNotNullParameter(authorisation, "authorisation");
        this.f161867a = authorisation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f161867a, ((a) obj2).f161867a);
    }

    public final int hashCode() {
        return this.f161867a.hashCode();
    }
}
