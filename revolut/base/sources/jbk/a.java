package jbk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kbk.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f172651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanSubscription f172652b;

    public a(PricingPlanSubscription newSubscription, f claimingResult) {
        Intrinsics.checkNotNullParameter(claimingResult, "claimingResult");
        Intrinsics.checkNotNullParameter(newSubscription, "newSubscription");
        this.f172651a = claimingResult;
        this.f172652b = newSubscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f172651a, aVar.f172651a) && Intrinsics.f(this.f172652b, aVar.f172652b);
    }

    public final int hashCode() {
        return this.f172652b.hashCode() + (this.f172651a.hashCode() * 31);
    }
}
