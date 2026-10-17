package skk;

import com.revolut.feature.rewards.api.navigation.RewardsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static FeatureCommand a(String perkId) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        return new FeatureCommand(new RewardsFeatureConfig.RewardDetails(perkId, hgc.a.PlanHub.a(), 28));
    }

    public static FeatureCommand b() {
        return new FeatureCommand(new KompotPricingPlanFeatureConfig.PlanPartners(null));
    }
}
