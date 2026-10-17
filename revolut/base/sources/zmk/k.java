package zmk;

import cli.y;
import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements b {
    public final q06.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ajk.b f323611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f323612q;

    public k(cli.n stateMapper, PlanPageBottomSheetContract$InputData inputData, q06.l deeplinkRouter, ajk.b outOfAppNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.o = deeplinkRouter;
        this.f323611p = outOfAppNavigationProvider;
        this.f323612q = mra.d.b(this, new a(inputData.f103616a, inputData.f103618c), stateMapper, null, false, 12);
    }

    public final void I2(Object obj2) {
        PricingPlanTextDescriptor.Action action = obj2 instanceof PricingPlanTextDescriptor.Action ? (PricingPlanTextDescriptor.Action) obj2 : null;
        if (action == null) {
            return;
        }
        if (!(action instanceof PricingPlanTextDescriptor.Action.UrlNavigation)) {
            throw new NoWhenBranchMatchedException();
        }
        l2(new j(this, (PricingPlanTextDescriptor.Action.UrlNavigation) action, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f323612q;
    }
}
