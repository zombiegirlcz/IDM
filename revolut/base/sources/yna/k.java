package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f315356a;

    public k(w pricingPlanData) {
        Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
        this.f315356a = pricingPlanData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f315356a, ((k) obj2).f315356a);
    }

    public final int hashCode() {
        return this.f315356a.hashCode();
    }
}
