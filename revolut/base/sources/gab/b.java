package gab;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142131b;

    public b(String juniorId, String parentPricingPlanId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(parentPricingPlanId, "parentPricingPlanId");
        this.f142130a = juniorId;
        this.f142131b = parentPricingPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f142130a, bVar.f142130a) && Intrinsics.f(this.f142131b, bVar.f142131b);
    }

    public final int hashCode() {
        return this.f142131b.hashCode() + (this.f142130a.hashCode() * 31);
    }
}
