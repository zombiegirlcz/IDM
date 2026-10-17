package uhc;

import android.content.Context;
import com.revolut.feature.rewards.api.RewardsApi$FeatureToggles$RentAndBills;
import com.revolut.feature.rewards.api.RewardsApi$FeatureToggles$SubscriptionsInGlobalSearch;
import com.revolut.feature.rewards.api.navigation.PerkDetailsDestination;
import com.revolut.feature.rewards.api.navigation.RewardsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof RewardsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        RewardsFeatureConfig config = (RewardsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof RewardsFeatureConfig.RewardDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        RewardsFeatureConfig.RewardDetails rewardDetails = (RewardsFeatureConfig.RewardDetails) config;
        navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PerkDetailsDestination(rewardDetails.e, rewardDetails.f84900a, rewardDetails.f84901b, rewardDetails.f84902c, rewardDetails.d, rewardDetails.f), false, (Integer) null, 0, 61)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(RewardsApi$FeatureToggles$RentAndBills.f84764c, RewardsApi$FeatureToggles$SubscriptionsInGlobalSearch.f84765c);
    }
}
