package k1i;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import hha.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f180281a;

    public k(ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f180281a = navigationCommandsDispatcher;
    }

    @Override // k1i.c
    public final efm.b b() {
        u.Companion.getClass();
        return this.f180281a.a(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature(u.f, xfa.b.FX_LIMIT_PITCH, null, false, 1020)));
    }
}
