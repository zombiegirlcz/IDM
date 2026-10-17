package z5b;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsTerminationFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.account_linking.CobrandedCardsAccountLinkingFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.CobrandedCardsOrderCardFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.order_card.CobrandedCardsOrderCardFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_switch.CobrandedCardsPlanSwitchFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.termination.CobrandedCardsTerminationFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.billing.CobrandedCardsBillingScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof s5b.b)) {
            return null;
        }
        s5b.b bVar = (s5b.b) descriptor;
        return bVar.a(new CobrandedCardsTerminationFlow(new CobrandedCardsTerminationFlowContract$InputData(bVar.f260055a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CobrandedCardsFeatureConfig.CardSelectionDestination.PostActivation) {
            return new CobrandedCardsPostActivationFlow(new CobrandedCardsPostActivationFlowContract$InputData.PostActivation(((CobrandedCardsFeatureConfig.CardSelectionDestination.PostActivation) destination).f82498a));
        }
        if (destination instanceof CobrandedCardsFeatureConfig.CardSelectionDestination.Default) {
            CobrandedCardsFeatureConfig.CardSelectionDestination.Default r3 = (CobrandedCardsFeatureConfig.CardSelectionDestination.Default) destination;
            return new CobrandedCardsPostActivationFlow(new CobrandedCardsPostActivationFlowContract$InputData.Default(r3.f82496a, r3.f82497b));
        }
        if (destination instanceof CobrandedCardsFeatureConfig.PlanHubDestination) {
            return new CobrandedCardsPlanHubFlow(new CobrandedCardsPlanHubFlowContract$InputData(((CobrandedCardsFeatureConfig.PlanHubDestination) destination).f82504a));
        }
        if (destination instanceof CobrandedCardsFeatureConfig.PlanHubBillingDestination) {
            return new CobrandedCardsBillingScreen();
        }
        if (destination instanceof CobrandedCardsFeatureConfig.PlanSwitchDestination) {
            return new CobrandedCardsPlanSwitchFlow();
        }
        if (destination instanceof CobrandedCardsFeatureConfig.OrderCardDestination) {
            return new CobrandedCardsOrderCardFlow(new CobrandedCardsOrderCardFlowContract$InputData(((CobrandedCardsFeatureConfig.OrderCardDestination) destination).f82499a));
        }
        if (destination instanceof CobrandedCardsFeatureConfig.PlanAdditionalValueDestination) {
            return new CobrandedCardsAdditionalValueScreen(CobrandedCardsAdditionalValueScreenContract$InputData.CurrentPlan.f82550a);
        }
        if (destination instanceof CobrandedCardsFeatureConfig.AccountLinkingDestination) {
            return new CobrandedCardsAccountLinkingFlow();
        }
        return null;
    }
}
