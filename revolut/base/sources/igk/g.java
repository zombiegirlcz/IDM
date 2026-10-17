package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanDocumentsBottomSheet$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDocumentsBottomSheet$InputData f161247a;

    public g(PlanDocumentsBottomSheet$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161247a = inputData;
    }

    public final PlanDocumentsBottomSheet$InputData b() {
        return this.f161247a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f161247a, ((g) obj2).f161247a);
    }

    public final int hashCode() {
        return this.f161247a.hashCode();
    }
}
