package com.revolut.feature.card_payment_method.impl.declaration;

import aii.u;
import com.revolut.feature.card_payment_method.api.declaration.LinkCardToPocketNavigationDestination;
import com.revolut.feature.card_payment_method.api.declaration.PaymentMethodInfoNavigationDestination;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodNavigationDestination;
import com.revolut.feature.card_payment_method.impl.declaration.CardPaymentMethodFeatureStep;
import com.revolut.feature.card_payment_method.impl.flows.link_card.flow.LinkCardFlow;
import com.revolut.feature.card_payment_method.impl.flows.selector.flow.CardPaymentMethodSelectorFlow;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.info.CardPaymentMethodInfoScreen;
import com.revolut.kompot.FeatureFlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nhi.c;
import ohi.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b {
    @Override // ohi.b
    public final com.revolut.kompot.navigable.a a(FeatureFlowStep featureFlowStep, g flowModel) {
        CardPaymentMethodFeatureStep step = (CardPaymentMethodFeatureStep) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (step instanceof CardPaymentMethodFeatureStep.SelectPaymentMethod) {
            return new CardPaymentMethodSelectorFlow(((CardPaymentMethodFeatureStep.SelectPaymentMethod) step).getF65255a());
        }
        if (step instanceof CardPaymentMethodFeatureStep.LinkCardToPocket) {
            return new LinkCardFlow(((CardPaymentMethodFeatureStep.LinkCardToPocket) step).getF65254a());
        }
        if (step instanceof CardPaymentMethodFeatureStep.Info) {
            return new CardPaymentMethodInfoScreen(((CardPaymentMethodFeatureStep.Info) step).getF65253a());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ohi.b
    public final c c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof SelectPaymentMethodNavigationDestination) {
            return new c(new CardPaymentMethodFeatureStep.SelectPaymentMethod(((SelectPaymentMethodNavigationDestination) destination).f65250b));
        }
        if (destination instanceof PaymentMethodInfoNavigationDestination) {
            return new c(new CardPaymentMethodFeatureStep.Info(((PaymentMethodInfoNavigationDestination) destination).f65243b));
        }
        if (destination instanceof LinkCardToPocketNavigationDestination) {
            return new c(new CardPaymentMethodFeatureStep.LinkCardToPocket(((LinkCardToPocketNavigationDestination) destination).f65240b));
        }
        return null;
    }
}
