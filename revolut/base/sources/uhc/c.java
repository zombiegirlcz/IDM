package uhc;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.api.RewardsApi$FeatureToggles$RentAndBills;
import com.revolut.feature.rewards.api.RewardsApi$FeatureToggles$SubscriptionsInGlobalSearch;
import com.revolut.feature.rewards.api.navigation.ConciergeAlbertineDestination;
import com.revolut.feature.rewards.api.navigation.ConciergeAlbertineRedeemDestination;
import com.revolut.feature.rewards.api.navigation.ExternalRewardRegistration;
import com.revolut.feature.rewards.api.navigation.PerkAccessDestination;
import com.revolut.feature.rewards.api.navigation.PerkDetailsDestination;
import com.revolut.feature.rewards.api.navigation.RentAndBillsDestination;
import com.revolut.feature.rewards.api.navigation.RentAndBillsRevPointsEarnedDestination;
import com.revolut.feature.rewards.api.navigation.RentAndBillsSelectPaymentDestination;
import com.revolut.feature.rewards.impl.ui.concierge.flow.ConciergeAlbertineFlow;
import com.revolut.feature.rewards.impl.ui.concierge.flow.ConciergeAlbertineFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlow;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.partnerships.PartnershipsConciergeAlbertineRedeemFlow;
import com.revolut.feature.rewards.impl.ui.perkaccess.PerkAccessFlow;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlow;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlow;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f280219a;

    public c(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f280219a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return v.k(RewardsApi$FeatureToggles$RentAndBills.f84764c, RewardsApi$FeatureToggles$SubscriptionsInGlobalSearch.f84765c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ExternalRewardRegistration) {
            ExternalRewardRegistration externalRewardRegistration = (ExternalRewardRegistration) destination;
            return new RewardRegistrationFlow(new RewardRegistrationFlowContract$InputData(externalRewardRegistration.f84889a, externalRewardRegistration.f84890b));
        }
        if (destination instanceof ConciergeAlbertineDestination) {
            return new ConciergeAlbertineFlow(new ConciergeAlbertineFlowContract$InputData(((ConciergeAlbertineDestination) destination).f84887a));
        }
        if (destination instanceof ConciergeAlbertineRedeemDestination) {
            return new PartnershipsConciergeAlbertineRedeemFlow();
        }
        if (destination instanceof RentAndBillsDestination) {
            return new RentAndBillsFlow(new RentAndBillsFlowContract$InputData(0));
        }
        if (destination instanceof RentAndBillsSelectPaymentDestination) {
            RentAndBillsSelectPaymentDestination rentAndBillsSelectPaymentDestination = (RentAndBillsSelectPaymentDestination) destination;
            return new RentAndBillsFlow(new RentAndBillsFlowContract$InputData(new RentAndBillsFlowContract$Step.SelectPayment(rentAndBillsSelectPaymentDestination.f84898a, rentAndBillsSelectPaymentDestination.f84899b)));
        }
        if (destination instanceof RentAndBillsRevPointsEarnedDestination) {
            return new RentAndBillsFlow(new RentAndBillsFlowContract$InputData(new RentAndBillsFlowContract$Step.RevPointsEarnedPrompt(((RentAndBillsRevPointsEarnedDestination) destination).f84897a)));
        }
        if (!(destination instanceof PerkDetailsDestination)) {
            if (!(destination instanceof PerkAccessDestination)) {
                return null;
            }
            PerkAccessDestination perkAccessDestination = (PerkAccessDestination) destination;
            return new PerkAccessFlow(new uic.b(perkAccessDestination.f84891a, perkAccessDestination.f84892b));
        }
        PerkDetailsDestination perkDetailsDestination = (PerkDetailsDestination) destination;
        return new PerkDetailsFlow(new PerkDetailsFlowContract$InputData(perkDetailsDestination.d, perkDetailsDestination.f84893a, perkDetailsDestination.f84894b, perkDetailsDestination.f84895c, perkDetailsDestination.e, perkDetailsDestination.f));
    }

    @Override // aii.p
    public final Set h() {
        return this.f280219a;
    }
}
