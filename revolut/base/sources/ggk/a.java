package ggk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f143698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.i f143699c;
    public final lha.p d;
    public final PricingPlanSubscription e;

    public a(String familyPlanId, hha.d individualPlan, hha.i iVar, lha.p subscribeInfo, PricingPlanSubscription subscription) {
        Intrinsics.checkNotNullParameter(familyPlanId, "familyPlanId");
        Intrinsics.checkNotNullParameter(individualPlan, "individualPlan");
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f143697a = familyPlanId;
        this.f143698b = individualPlan;
        this.f143699c = iVar;
        this.d = subscribeInfo;
        this.e = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f143697a, aVar.f143697a) && Intrinsics.f(this.f143698b, aVar.f143698b) && this.f143699c == aVar.f143699c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f143698b.hashCode() + (this.f143697a.hashCode() * 31)) * 31;
        hha.i iVar = this.f143699c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31);
    }
}
