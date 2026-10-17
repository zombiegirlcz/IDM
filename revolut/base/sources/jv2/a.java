package jv2;

import aii.u;
import com.revolut.feature.card.verification.api.navigation.CardPennyTopUpDestination;
import com.revolut.feature.card.verification.api.navigation.CardVerificationDestination;
import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlow;
import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlowContract$InputData;
import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlow;
import com.revolut.feature.card.verification.impl.flow.card_verification.CardVerificationFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CardVerificationDestination) {
            CardVerificationDestination cardVerificationDestination = (CardVerificationDestination) destination;
            return new CardVerificationFlow(new CardVerificationFlowContract$InputData(cardVerificationDestination.f64393a, cardVerificationDestination.f64394b));
        }
        if (!(destination instanceof CardPennyTopUpDestination)) {
            return null;
        }
        CardPennyTopUpDestination cardPennyTopUpDestination = (CardPennyTopUpDestination) destination;
        return new CardPennyTopUpFlow(new CardPennyTopUpFlowContract$InputData(cardPennyTopUpDestination.f64390a, cardPennyTopUpDestination.f64391b, cardPennyTopUpDestination.f64392c));
    }
}
