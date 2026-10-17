package wgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f297337a;

    public g(hha.d pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f297337a = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f297337a, ((g) obj2).f297337a);
    }

    public final int hashCode() {
        return this.f297337a.hashCode();
    }
}
