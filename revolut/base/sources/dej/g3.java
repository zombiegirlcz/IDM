package dej;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundIneligibilityDetails;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f113541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f113542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f113543c;
    public final EsimSubscriptionRefundIneligibilityDetails d;

    public g3(f3 state, Instant instant, h2 h2Var, EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f113541a = state;
        this.f113542b = instant;
        this.f113543c = h2Var;
        this.d = esimSubscriptionRefundIneligibilityDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return this.f113541a == g3Var.f113541a && Intrinsics.f(this.f113542b, g3Var.f113542b) && Intrinsics.f(this.f113543c, g3Var.f113543c) && Intrinsics.f(this.d, g3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f113541a.hashCode() * 31;
        Instant instant = this.f113542b;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        h2 h2Var = this.f113543c;
        int iHashCode3 = (iHashCode2 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails = this.d;
        return iHashCode3 + (esimSubscriptionRefundIneligibilityDetails != null ? esimSubscriptionRefundIneligibilityDetails.hashCode() : 0);
    }
}
