package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanCancelFeatures$InputData f161242a;

    public e(PlanCancelFeatures$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161242a = inputData;
    }

    public final PlanCancelFeatures$InputData b() {
        return this.f161242a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f161242a, ((e) obj2).f161242a);
    }

    public final int hashCode() {
        return this.f161242a.f102913a.hashCode();
    }
}
