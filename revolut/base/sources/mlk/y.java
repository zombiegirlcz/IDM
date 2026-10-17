package mlk;

import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$BottomSheet f207033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleBadgeModel f207034b;

    public y(PlansDashboardLayout$PlanPageLayout$BottomSheet bottomSheet, CircleIconBadge circleIconBadge) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f207033a = bottomSheet;
        this.f207034b = circleIconBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f207033a, yVar.f207033a) && Intrinsics.f(this.f207034b, yVar.f207034b);
    }

    public final int hashCode() {
        int iHashCode = this.f207033a.hashCode() * 31;
        CircleBadgeModel circleBadgeModel = this.f207034b;
        return iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }
}
