package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanLimitsBottomSheet$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanLimitsBottomSheet$InputData f161248a;

    public h(PlanLimitsBottomSheet$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161248a = inputData;
    }

    public final PlanLimitsBottomSheet$InputData b() {
        return this.f161248a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f161248a, ((h) obj2).f161248a);
    }

    public final int hashCode() {
        return this.f161248a.hashCode();
    }
}
