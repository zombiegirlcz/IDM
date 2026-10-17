package dej;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationSummary;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionWithdrawalSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f113523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionRefund f113524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimSubscriptionCancellationSummary f113525c;
    public final EsimSubscriptionWithdrawalSummary d;

    public d3(t1 subscription, EsimSubscriptionRefund esimSubscriptionRefund, EsimSubscriptionCancellationSummary esimSubscriptionCancellationSummary, EsimSubscriptionWithdrawalSummary esimSubscriptionWithdrawalSummary) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f113523a = subscription;
        this.f113524b = esimSubscriptionRefund;
        this.f113525c = esimSubscriptionCancellationSummary;
        this.d = esimSubscriptionWithdrawalSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f113523a, d3Var.f113523a) && Intrinsics.f(this.f113524b, d3Var.f113524b) && Intrinsics.f(this.f113525c, d3Var.f113525c) && Intrinsics.f(this.d, d3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f113523a.hashCode() * 31;
        EsimSubscriptionRefund esimSubscriptionRefund = this.f113524b;
        int iHashCode2 = (iHashCode + (esimSubscriptionRefund == null ? 0 : esimSubscriptionRefund.hashCode())) * 31;
        EsimSubscriptionCancellationSummary esimSubscriptionCancellationSummary = this.f113525c;
        int iHashCode3 = (iHashCode2 + (esimSubscriptionCancellationSummary == null ? 0 : esimSubscriptionCancellationSummary.hashCode())) * 31;
        EsimSubscriptionWithdrawalSummary esimSubscriptionWithdrawalSummary = this.d;
        return iHashCode3 + (esimSubscriptionWithdrawalSummary != null ? esimSubscriptionWithdrawalSummary.hashCode() : 0);
    }
}
