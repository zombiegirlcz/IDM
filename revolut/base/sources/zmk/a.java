package zmk;

import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlansDashboardLayout$PlanPageLayout$BottomSheet f323600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleBadgeModel f323601b;

    public a(PlansDashboardLayout$PlanPageLayout$BottomSheet bottomSheet, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f323600a = bottomSheet;
        this.f323601b = circleBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f323600a, aVar.f323600a) && Intrinsics.f(this.f323601b, aVar.f323601b);
    }

    public final int hashCode() {
        int iHashCode = this.f323600a.hashCode() * 31;
        CircleBadgeModel circleBadgeModel = this.f323601b;
        return iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }
}
