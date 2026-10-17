package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.trading_onboarding.api.navigation.PartnerGivingConsentDestination;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.PartnerGivingConsentFlowContract$Step;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreen;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0l.b;
import o0l.d;
import p0l.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0l.a f104251t;
    public final PartnerGivingConsentFlowContract$Step u;

    public a(o0l.a givingConsentDialogsFactory, PartnerGivingConsentDestination.Configuration configuration) {
        Intrinsics.checkNotNullParameter(givingConsentDialogsFactory, "givingConsentDialogsFactory");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f104251t = givingConsentDialogsFactory;
        this.u = configuration.f104099a instanceof PartnerGivingConsentDestination.StartAction.ShowPrompt ? PartnerGivingConsentFlowContract$Step.ConsentExplanation.f104249a : PartnerGivingConsentFlowContract$Step.PowerOfAttorney.f104250a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PartnerGivingConsentFlowContract$Step step = (PartnerGivingConsentFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, PartnerGivingConsentFlowContract$Step.PowerOfAttorney.f104250a)) {
            PowerOfAttorneyScreen powerOfAttorneyScreen = new PowerOfAttorneyScreen();
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: o0l.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.a f221255b;

                {
                    this.f221255b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            f result = (f) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof f.b;
                            com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.a aVar = this.f221255b;
                            if (!z && !(result instanceof f.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                            return Unit.f186387a;
                        default:
                            u outputData = (u) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF = Intrinsics.f(outputData, q.f111462a);
                            com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.a aVar2 = this.f221255b;
                            if (zF) {
                                aVar2.I2();
                            } else if (Intrinsics.f(outputData, s.f111464a)) {
                                aVar2.E2(PartnerGivingConsentFlowContract$Step.PowerOfAttorney.f104250a, false, null, false);
                            } else if (!(outputData instanceof p) && !Intrinsics.f(outputData, t.f111465a) && !Intrinsics.f(outputData, r.f111463a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            powerOfAttorneyScreen.H = function1;
            return powerOfAttorneyScreen;
        }
        if (!Intrinsics.f(step, PartnerGivingConsentFlowContract$Step.ConsentExplanation.f104249a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((b) this.f104251t).getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_prompt_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_prompt_description_new, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_prompt_next_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        Object[] objArr = 0 == true ? 1 : 0;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("EXPLANATION_PROMPT_ID", textLocalisedClause, textLocalisedClause2, new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D299", null, null, null, 30), null), null, null, resourceImage, objArr, null, button, null, null, null, "EXPLANATION_PROMPT_ID", null, null, null, null, null, null, null, 2088368), null, false, false, null, 30));
        final int i2 = 1;
        Function1 block = new Function1(this) { // from class: o0l.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.a f221255b;

            {
                this.f221255b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        f result = (f) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof f.b;
                        com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.a aVar = this.f221255b;
                        if (!z && !(result instanceof f.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.I2();
                        return Unit.f186387a;
                    default:
                        u outputData = (u) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean zF = Intrinsics.f(outputData, q.f111462a);
                        com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.a aVar2 = this.f221255b;
                        if (zF) {
                            aVar2.I2();
                        } else if (Intrinsics.f(outputData, s.f111464a)) {
                            aVar2.E2(PartnerGivingConsentFlowContract$Step.PowerOfAttorney.f104250a, false, null, false);
                        } else if (!(outputData instanceof p) && !Intrinsics.f(outputData, t.f111465a) && !Intrinsics.f(outputData, r.f111463a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block, "block");
        promptMarketingScreen.H = block;
        return promptMarketingScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return new PartnerGivingConsentFlowContract$State();
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
