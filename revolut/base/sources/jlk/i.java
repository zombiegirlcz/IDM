package jlk;

import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanCancelScreenConfig f175855a;

    public i(PricingPlanCancelScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f175855a = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f175855a, ((i) obj2).f175855a);
    }

    public final int hashCode() {
        return this.f175855a.hashCode();
    }
}
