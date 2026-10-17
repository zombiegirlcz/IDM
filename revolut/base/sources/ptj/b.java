package ptj;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHub;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHubEligibility;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHubWidget;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$ShowRewardsHubConfetti;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubChallengeHistoryDestination;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubCollectionDestination;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubDestination;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubDetailsDestination;
import com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.RewardsHubFlow;
import com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.RewardsHubFlowContract$Step;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f239778a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f239778a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return v.k(RewardsHubApi$Toggles$RewardsHub.f99247c, RewardsHubApi$Toggles$RewardsHubWidget.f99249c, RewardsHubApi$Toggles$ShowRewardsHubConfetti.f99250c, RewardsHubApi$Toggles$RewardsHubEligibility.f99248c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RewardsHubDetailsDestination) {
            return new RewardsHubFlow(new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(((RewardsHubDetailsDestination) destination).f99256a)));
        }
        if (destination instanceof RewardsHubCollectionDestination) {
            return new RewardsHubFlow(new RewardsHubFlowContract$Step.RewardsHubCollection(((RewardsHubCollectionDestination) destination).f99254a));
        }
        if (destination instanceof RewardsHubDestination) {
            return new RewardsHubFlow(RewardsHubFlowContract$Step.RewardsHubHome.f101571a);
        }
        if (destination instanceof RewardsHubChallengeHistoryDestination) {
            return new RewardsHubFlow(new RewardsHubFlowContract$Step.RewardsHubChallengeHistory(((RewardsHubChallengeHistoryDestination) destination).f99253a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f239778a;
    }
}
