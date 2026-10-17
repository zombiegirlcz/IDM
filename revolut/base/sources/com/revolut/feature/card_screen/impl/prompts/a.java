package com.revolut.feature.card_screen.impl.prompts;

import com.revolut.feature.card_screen.impl.prompts.CardPromptFlowContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.CardPromptFlowContract$Step;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptController;
import com.revolut.feature.card_screen.impl.prompts.location_security.AskLocationSecurityPromptScreenContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.merchant_redirect.MerchantRedirectPromptController;
import com.revolut.feature.card_screen.impl.prompts.merchant_redirect.MerchantRedirectPromptScreenContract$InputData;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreen;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u83.j;
import w83.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements s83.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CardPromptFlowContract$Step f65511t;
    public final CardPromptFlowContract$State u;

    public a(CardPromptFlowContract$InputData inputData) {
        CardPromptFlowContract$Step switchToNewCreditCard;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof CardPromptFlowContract$InputData.AskLocationSecurityPrompt) {
            switchToNewCreditCard = new CardPromptFlowContract$Step.AskLocationSecurityPrompt(((CardPromptFlowContract$InputData.AskLocationSecurityPrompt) inputData).f65500a);
        } else if (inputData instanceof CardPromptFlowContract$InputData.MerchantRedirectPrompt) {
            switchToNewCreditCard = new CardPromptFlowContract$Step.MerchantRedirectPrompt(((CardPromptFlowContract$InputData.MerchantRedirectPrompt) inputData).f65501a);
        } else {
            if (!(inputData instanceof CardPromptFlowContract$InputData.SwitchToNewCreditCard)) {
                throw new NoWhenBranchMatchedException();
            }
            CardPromptFlowContract$InputData.SwitchToNewCreditCard switchToNewCreditCard2 = (CardPromptFlowContract$InputData.SwitchToNewCreditCard) inputData;
            switchToNewCreditCard = new CardPromptFlowContract$Step.SwitchToNewCreditCard(switchToNewCreditCard2.f65502a, switchToNewCreditCard2.f65503b, switchToNewCreditCard2.f65504c);
        }
        this.f65511t = switchToNewCreditCard;
        this.u = new CardPromptFlowContract$State(0);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CardPromptFlowContract$Step step = (CardPromptFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardPromptFlowContract$Step.AskLocationSecurityPrompt) {
            AskLocationSecurityPromptController askLocationSecurityPromptController = new AskLocationSecurityPromptController(new AskLocationSecurityPromptScreenContract$InputData(((CardPromptFlowContract$Step.AskLocationSecurityPrompt) step).f65506a));
            final int i = 0;
            Function1 block = new Function1(this) { // from class: s83.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_screen.impl.prompts.a f260881b;

                {
                    this.f260881b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            j it8 = (j) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f260881b.I2();
                            break;
                        default:
                            h it9 = (h) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            this.f260881b.I2();
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            askLocationSecurityPromptController.H = block;
            return askLocationSecurityPromptController;
        }
        if (step instanceof CardPromptFlowContract$Step.MerchantRedirectPrompt) {
            MerchantRedirectPromptController merchantRedirectPromptController = new MerchantRedirectPromptController(new MerchantRedirectPromptScreenContract$InputData(((CardPromptFlowContract$Step.MerchantRedirectPrompt) step).f65507a));
            final int i2 = 1;
            Function1 block2 = new Function1(this) { // from class: s83.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.card_screen.impl.prompts.a f260881b;

                {
                    this.f260881b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            j it8 = (j) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f260881b.I2();
                            break;
                        default:
                            h it9 = (h) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            this.f260881b.I2();
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            merchantRedirectPromptController.H = block2;
            return merchantRedirectPromptController;
        }
        if (!(step instanceof CardPromptFlowContract$Step.SwitchToNewCreditCard)) {
            throw new NoWhenBranchMatchedException();
        }
        CardPromptFlowContract$Step.SwitchToNewCreditCard switchToNewCreditCard = (CardPromptFlowContract$Step.SwitchToNewCreditCard) step;
        SwitchToNewCreditCardPromptScreen switchToNewCreditCardPromptScreen = new SwitchToNewCreditCardPromptScreen(new SwitchToNewCreditCardPromptScreenContract$InputData(switchToNewCreditCard.f65508a, switchToNewCreditCard.f65509b));
        s31.a block3 = new s31.a(this, step, 15);
        Intrinsics.checkNotNullParameter(block3, "block");
        switchToNewCreditCardPromptScreen.H = block3;
        return switchToNewCreditCardPromptScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f65511t;
    }
}
