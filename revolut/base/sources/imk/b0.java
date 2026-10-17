package imk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanBottomSheetDescriptor.BottomSheet f162499b;

    public b0(String id10, PricingPlanBottomSheetDescriptor.BottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f162498a = id10;
        this.f162499b = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f162498a, b0Var.f162498a) && Intrinsics.f(this.f162499b, b0Var.f162499b);
    }

    public final int hashCode() {
        return this.f162499b.hashCode() + (this.f162498a.hashCode() * 31);
    }
}
