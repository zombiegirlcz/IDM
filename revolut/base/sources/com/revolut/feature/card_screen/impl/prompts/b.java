package com.revolut.feature.card_screen.impl.prompts;

import aii.u;
import com.revolut.feature.card_screen.api.navigation.CardPromptsFlowDestination;
import com.revolut.feature.card_screen.impl.prompts.CardPromptFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CardPromptsFlowDestination.LocationSecurityPrompt) {
            return new CardPromptFlow(new CardPromptFlowContract$InputData.AskLocationSecurityPrompt(((CardPromptsFlowDestination.LocationSecurityPrompt) destination).getF65345a()));
        }
        if (destination instanceof CardPromptsFlowDestination.MerchantRedirectPrompt) {
            return new CardPromptFlow(new CardPromptFlowContract$InputData.MerchantRedirectPrompt(((CardPromptsFlowDestination.MerchantRedirectPrompt) destination).getF65346a()));
        }
        if (!(destination instanceof CardPromptsFlowDestination.SwitchToCreditCard)) {
            return null;
        }
        CardPromptsFlowDestination.SwitchToCreditCard switchToCreditCard = (CardPromptsFlowDestination.SwitchToCreditCard) destination;
        return new CardPromptFlow(new CardPromptFlowContract$InputData.SwitchToNewCreditCard(switchToCreditCard.getF65347a(), switchToCreditCard.getF65348b(), switchToCreditCard.getF65349c()));
    }
}
