package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.GlobalPlanSubscriptionPreview$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalPlanSubscriptionPreview$InputData f161231a;

    public a(GlobalPlanSubscriptionPreview$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161231a = inputData;
    }

    public final GlobalPlanSubscriptionPreview$InputData b() {
        return this.f161231a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f161231a, ((a) obj2).f161231a);
    }

    public final int hashCode() {
        return this.f161231a.f102860a.hashCode();
    }
}
