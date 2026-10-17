package gcd;

import kotlin.jvm.internal.Intrinsics;
import ncd.h;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f142411b;

    public d(String pricingPlanId, h savingsProductAccountType) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(savingsProductAccountType, "savingsProductAccountType");
        this.f142410a = pricingPlanId;
        this.f142411b = savingsProductAccountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f142410a, dVar.f142410a) && this.f142411b == dVar.f142411b;
    }

    public final int hashCode() {
        return this.f142411b.hashCode() + (this.f142410a.hashCode() * 31);
    }
}
