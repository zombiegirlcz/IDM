package igk;

import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;

/* JADX INFO: loaded from: classes11.dex */
public interface q {
    static FeatureCommand a(ajk.f fVar, PricingPlanUpdateSource.Dynamic dynamic) {
        return new FeatureCommand(new KompotPricingPlanFeatureConfig.PlanCancel(dynamic, 1));
    }
}
