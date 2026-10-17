package zbk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbk.f f320956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanSubscription f320957b;

    public d(PricingPlanSubscription giftedSubscription, kbk.f planGiftingClaimingResult) {
        Intrinsics.checkNotNullParameter(planGiftingClaimingResult, "planGiftingClaimingResult");
        Intrinsics.checkNotNullParameter(giftedSubscription, "giftedSubscription");
        this.f320956a = planGiftingClaimingResult;
        this.f320957b = giftedSubscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f320956a, dVar.f320956a) && Intrinsics.f(this.f320957b, dVar.f320957b);
    }

    public final int hashCode() {
        return this.f320957b.hashCode() + (this.f320956a.hashCode() * 31);
    }
}
