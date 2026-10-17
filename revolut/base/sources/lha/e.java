package lha;

import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanCancelScreenConfig f195201a;

    public e(PricingPlanCancelScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f195201a = screenConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f195201a, ((e) obj2).f195201a);
    }

    public final int hashCode() {
        return this.f195201a.hashCode();
    }
}
