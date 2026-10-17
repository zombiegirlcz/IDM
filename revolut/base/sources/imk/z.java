package imk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanBottomSheetDescriptor.BottomSheet f162559b;

    public z(String id10, PricingPlanBottomSheetDescriptor.BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f162558a = id10;
        this.f162559b = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f162558a, zVar.f162558a) && Intrinsics.f(this.f162559b, zVar.f162559b);
    }

    public final int hashCode() {
        return this.f162559b.hashCode() + (this.f162558a.hashCode() * 31);
    }
}
