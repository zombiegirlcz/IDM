package pfa;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogk.f f235542a;

    public a(ogk.f pricingPlanKompotDestinationProvider) {
        Intrinsics.checkNotNullParameter(pricingPlanKompotDestinationProvider, "pricingPlanKompotDestinationProvider");
        this.f235542a = pricingPlanKompotDestinationProvider;
    }

    public static PricingPlanFeatureConfig.PlanSelection a() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        return new PricingPlanFeatureConfig.PlanSelection(true, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var));
    }
}
