package com.revolut.feature.card_payment_method.impl.flows.selector.flow;

import aii.q;
import b43.b;
import b43.c;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreen;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreenContract$InputData;
import com.revolut.feature.card_payment_method.impl.flows.selector.flow.CardPaymentMethodSelectorFlowContract$Step;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.info.CardPaymentMethodInfoScreen;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FinishCommand;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements n43.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SelectPaymentMethodInputData f65288t;

    public a(SelectPaymentMethodInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f65288t = inputData;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardPaymentMethodSelectorFlowContract$Step step = (CardPaymentMethodSelectorFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardPaymentMethodSelectorFlowContract$Step.Info) {
            return new CardPaymentMethodInfoScreen(((CardPaymentMethodSelectorFlowContract$Step.Info) step).f65283a);
        }
        if (step instanceof CardPaymentMethodSelectorFlowContract$Step.Selector) {
            SelectorScreen selectorScreen = new SelectorScreen(((CardPaymentMethodSelectorFlowContract$Step.Selector) step).f65284a);
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: n43.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_payment_method.impl.flows.selector.flow.a f212287b;

                {
                    this.f212287b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            b43.b output = (b43.b) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof b43.a;
                            com.revolut.feature.card_payment_method.impl.flows.selector.flow.a aVar = this.f212287b;
                            if (z) {
                                aVar.C1(new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("EXTRA_SELECTED_CARD_BINDING_STRATEGY", ((b43.a) output).f12158a)), null, 4)));
                            } else if (output instanceof b.a) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c cVar = (c) output;
                                aVar.E2(new CardPaymentMethodSelectorFlowContract$Step.SubaccountLinkDetails(cVar.f12160a, cVar.f12161b, cVar.f12162c, cVar.d), true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            q it8 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f212287b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            selectorScreen.H = function1;
            return selectorScreen;
        }
        if (!(step instanceof CardPaymentMethodSelectorFlowContract$Step.SubaccountLinkDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        CardPaymentMethodSelectorFlowContract$Step.SubaccountLinkDetails subaccountLinkDetails = (CardPaymentMethodSelectorFlowContract$Step.SubaccountLinkDetails) step;
        LinkCardDetailsReviewScreen linkCardDetailsReviewScreen = new LinkCardDetailsReviewScreen(new LinkCardDetailsReviewScreenContract$InputData(subaccountLinkDetails.f65285a, subaccountLinkDetails.f65286b, subaccountLinkDetails.f65287c, subaccountLinkDetails.d));
        final int i2 = 1;
        Function1 block = new Function1(this) { // from class: n43.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.card_payment_method.impl.flows.selector.flow.a f212287b;

            {
                this.f212287b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        b43.b output = (b43.b) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof b43.a;
                        com.revolut.feature.card_payment_method.impl.flows.selector.flow.a aVar = this.f212287b;
                        if (z) {
                            aVar.C1(new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("EXTRA_SELECTED_CARD_BINDING_STRATEGY", ((b43.a) output).f12158a)), null, 4)));
                        } else if (output instanceof b.a) {
                            aVar.I2();
                        } else {
                            if (!(output instanceof c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c cVar = (c) output;
                            aVar.E2(new CardPaymentMethodSelectorFlowContract$Step.SubaccountLinkDetails(cVar.f12160a, cVar.f12161b, cVar.f12162c, cVar.d), true, null, false);
                        }
                        return Unit.f186387a;
                    default:
                        q it8 = (q) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f212287b.I2();
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block, "block");
        linkCardDetailsReviewScreen.H = block;
        return linkCardDetailsReviewScreen;
    }

    @Override // dki.g
    public final /* bridge */ /* synthetic */ FlowState x2() {
        return CardPaymentMethodSelectorFlowContract$State.f65282a;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return new CardPaymentMethodSelectorFlowContract$Step.Selector(this.f65288t);
    }
}
