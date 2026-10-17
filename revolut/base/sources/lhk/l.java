package lhk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscription f195356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbk.f f195357b;

    public l(PricingPlanSubscription subscription, kbk.f giftResult) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(giftResult, "giftResult");
        this.f195356a = subscription;
        this.f195357b = giftResult;
    }

    @Override // lhk.n
    public final PricingPlanSubscription a() {
        return this.f195356a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f195356a, lVar.f195356a) && Intrinsics.f(this.f195357b, lVar.f195357b);
    }

    public final int hashCode() {
        return this.f195357b.hashCode() + (this.f195356a.hashCode() * 31);
    }
}
