package lhk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscription f195347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f195348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lha.g f195349c;
    public final n d;
    public final nha.c e;

    public i0(PricingPlanSubscription oldSubscription, hha.d newPlan, lha.g gVar, n subscribeActionResult, nha.c cVar) {
        Intrinsics.checkNotNullParameter(oldSubscription, "oldSubscription");
        Intrinsics.checkNotNullParameter(newPlan, "newPlan");
        Intrinsics.checkNotNullParameter(subscribeActionResult, "subscribeActionResult");
        this.f195347a = oldSubscription;
        this.f195348b = newPlan;
        this.f195349c = gVar;
        this.d = subscribeActionResult;
        this.e = cVar;
    }

    @Override // xfk.a
    public final /* bridge */ /* synthetic */ zfk.b a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f195347a, i0Var.f195347a) && Intrinsics.f(this.f195348b, i0Var.f195348b) && Intrinsics.f(this.f195349c, i0Var.f195349c) && Intrinsics.f(this.d, i0Var.d) && Intrinsics.f(this.e, i0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f195348b.hashCode() + (this.f195347a.hashCode() * 31)) * 31;
        lha.g gVar = this.f195349c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        nha.c cVar = this.e;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
