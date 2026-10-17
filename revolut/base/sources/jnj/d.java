package jnj;

import cli.j;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundIneligibilityDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionRefundIneligibilityDetails f176813a;

    public d(EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails) {
        this.f176813a = esimSubscriptionRefundIneligibilityDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f176813a, ((d) obj2).f176813a);
    }

    public final int hashCode() {
        EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails = this.f176813a;
        if (esimSubscriptionRefundIneligibilityDetails == null) {
            return 0;
        }
        return esimSubscriptionRefundIneligibilityDetails.hashCode();
    }
}
