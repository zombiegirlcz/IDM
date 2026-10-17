package com.revolut.feature_cards_kompot_flows_impl.flow;

import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreen;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreen;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreen;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData;
import com.revolut.feature.card_label.ui.screen.card_label_screen.a;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import com.revolut.feature_cards_kompot_flows_impl.flow.CardDetailsFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FinishCommand;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wv2.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g implements jwh.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardDetailsFlowContract$Step f96650t;
    public final CardDetailsFlowContract$State u;

    public a(CardDetailsFlowDestination.InputData inputData, gte.a featureToggleInteractor) {
        CardDetailsFlowContract$Step changeCardLabel;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        CardDetailsFlowDestination.StartType startType = inputData.f96627a;
        if (startType instanceof CardDetailsFlowDestination.StartType.ShowPin) {
            CardDetailsFlowDestination.StartType.ShowPin showPin = (CardDetailsFlowDestination.StartType.ShowPin) startType;
            changeCardLabel = new CardDetailsFlowContract$Step.ShowPin(new ShowCardPinScreenContract$InputData(showPin.f96630a, showPin.d, showPin.f96632c));
        } else if (startType instanceof CardDetailsFlowDestination.StartType.ShowPinWithCtaImmediately) {
            CardDetailsFlowDestination.StartType.ShowPinWithCtaImmediately showPinWithCtaImmediately = (CardDetailsFlowDestination.StartType.ShowPinWithCtaImmediately) startType;
            changeCardLabel = new CardDetailsFlowContract$Step.ShowPinWithCta(new ShowCardPinWithCtaScreenContract$InputData.ViewPinImmediately(showPinWithCtaImmediately.f96636a, showPinWithCtaImmediately.f96637b, showPinWithCtaImmediately.f96638c));
        } else if (startType instanceof CardDetailsFlowDestination.StartType.ShowPinWithCtaAfterClick) {
            CardDetailsFlowDestination.StartType.ShowPinWithCtaAfterClick showPinWithCtaAfterClick = (CardDetailsFlowDestination.StartType.ShowPinWithCtaAfterClick) startType;
            changeCardLabel = new CardDetailsFlowContract$Step.ShowPinWithCta(new ShowCardPinWithCtaScreenContract$InputData.ViewPinAfterCtaClick(showPinWithCtaAfterClick.f96633a, showPinWithCtaAfterClick.f96634b, showPinWithCtaAfterClick.f96635c, showPinWithCtaAfterClick.d, showPinWithCtaAfterClick.e));
        } else {
            if (!(startType instanceof CardDetailsFlowDestination.StartType.ChangeCardLabel)) {
                throw new NoWhenBranchMatchedException();
            }
            CardDetailsFlowDestination.StartType.ChangeCardLabel changeCardLabel2 = (CardDetailsFlowDestination.StartType.ChangeCardLabel) startType;
            changeCardLabel = new CardDetailsFlowContract$Step.ChangeCardLabel(new CardLabelScreenContract$InputData(new CardLabelScreenContract$InputData.CardInfo.Id(changeCardLabel2.f96628a), changeCardLabel2.f96629b, null, new CardLabelScreenContract$InputData.InputTextFieldConfiguration(null, null), true));
        }
        this.f96650t = changeCardLabel;
        this.u = new CardDetailsFlowContract$State();
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardDetailsFlowContract$Step step = (CardDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardDetailsFlowContract$Step.ShowPin) {
            ShowCardPinScreen showCardPinScreen = new ShowCardPinScreen(((CardDetailsFlowContract$Step.ShowPin) step).f96648a);
            final int i = 0;
            Function1 block = new Function1(this) { // from class: jwh.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature_cards_kompot_flows_impl.flow.a f179009b;

                {
                    this.f179009b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            e output = (e) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f179009b.C1(new BridgeDestination(Intrinsics.f(output, e.b.f300274a) ? new FinishCommand(-1, null, null, 6) : new FinishCommand(null, null, null, 7)));
                            break;
                        case 1:
                            com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a it8 = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f179009b.I2();
                            break;
                        default:
                            com.revolut.feature.card_label.ui.screen.card_label_screen.a output2 = (com.revolut.feature.card_label.ui.screen.card_label_screen.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            this.f179009b.C1(new BridgeDestination(Intrinsics.f(output2, a.C0462a.f64768a) ? new FinishCommand(-1, null, null, 6) : new FinishCommand(null, null, null, 7)));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            showCardPinScreen.H = block;
            return showCardPinScreen;
        }
        if (step instanceof CardDetailsFlowContract$Step.ShowPinWithCta) {
            ShowCardPinWithCtaScreen showCardPinWithCtaScreen = new ShowCardPinWithCtaScreen(((CardDetailsFlowContract$Step.ShowPinWithCta) step).f96649a);
            final int i2 = 1;
            Function1 block2 = new Function1(this) { // from class: jwh.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature_cards_kompot_flows_impl.flow.a f179009b;

                {
                    this.f179009b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            e output = (e) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f179009b.C1(new BridgeDestination(Intrinsics.f(output, e.b.f300274a) ? new FinishCommand(-1, null, null, 6) : new FinishCommand(null, null, null, 7)));
                            break;
                        case 1:
                            com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a it8 = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f179009b.I2();
                            break;
                        default:
                            com.revolut.feature.card_label.ui.screen.card_label_screen.a output2 = (com.revolut.feature.card_label.ui.screen.card_label_screen.a) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            this.f179009b.C1(new BridgeDestination(Intrinsics.f(output2, a.C0462a.f64768a) ? new FinishCommand(-1, null, null, 6) : new FinishCommand(null, null, null, 7)));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            showCardPinWithCtaScreen.H = block2;
            return showCardPinWithCtaScreen;
        }
        if (!(step instanceof CardDetailsFlowContract$Step.ChangeCardLabel)) {
            throw new NoWhenBranchMatchedException();
        }
        CardLabelScreen cardLabelScreen = new CardLabelScreen(((CardDetailsFlowContract$Step.ChangeCardLabel) step).f96647a);
        final int i3 = 2;
        Function1 function1 = new Function1(this) { // from class: jwh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature_cards_kompot_flows_impl.flow.a f179009b;

            {
                this.f179009b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        e output = (e) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        this.f179009b.C1(new BridgeDestination(Intrinsics.f(output, e.b.f300274a) ? new FinishCommand(-1, null, null, 6) : new FinishCommand(null, null, null, 7)));
                        break;
                    case 1:
                        com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a it8 = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.a) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f179009b.I2();
                        break;
                    default:
                        com.revolut.feature.card_label.ui.screen.card_label_screen.a output2 = (com.revolut.feature.card_label.ui.screen.card_label_screen.a) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        this.f179009b.C1(new BridgeDestination(Intrinsics.f(output2, a.C0462a.f64768a) ? new FinishCommand(-1, null, null, 6) : new FinishCommand(null, null, null, 7)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        cardLabelScreen.H = function1;
        return cardLabelScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f96650t;
    }
}
