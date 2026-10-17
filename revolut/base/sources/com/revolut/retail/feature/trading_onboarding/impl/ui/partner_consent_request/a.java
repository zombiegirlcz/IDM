package com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request;

import aii.q;
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
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestFlowContract$Step;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.consent_request.ConsentRequestScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.ManualConsentScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.manual_consent.ManualConsentScreenContract$InputData;
import d67.p;
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
import r0l.b;
import r0l.c;
import s0l.g;
import t0l.e;
import t0l.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g implements c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig f104268t;
    public final r0l.a u;
    public final PartnerConsentRequestFlowContract$Step.ConsentExplanation v;

    public a(TradingOnboardingFeatureConfig onboardingConfig, r0l.a consentRequestDialogsFactory) {
        Intrinsics.checkNotNullParameter(onboardingConfig, "onboardingConfig");
        Intrinsics.checkNotNullParameter(consentRequestDialogsFactory, "consentRequestDialogsFactory");
        this.f104268t = onboardingConfig;
        this.u = consentRequestDialogsFactory;
        this.v = PartnerConsentRequestFlowContract$Step.ConsentExplanation.f104265a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PartnerConsentRequestFlowContract$Step step = (PartnerConsentRequestFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean zF = Intrinsics.f(step, PartnerConsentRequestFlowContract$Step.RequestConsent.f104267a);
        TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig = this.f104268t;
        if (zF) {
            ConsentRequestScreen consentRequestScreen = new ConsentRequestScreen(new ConsentRequestScreenContract$InputData(tradingOnboardingFeatureConfig));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: r0l.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a f250806b;

                {
                    this.f250806b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            s0l.g outputData = (s0l.g) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF2 = Intrinsics.f(outputData, g.a.f258982a);
                            com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar = this.f250806b;
                            if (zF2) {
                                aVar.I2();
                            } else if (Intrinsics.f(outputData, g.b.f258983a)) {
                                aVar.G2(q.f5292a);
                            } else {
                                if (!Intrinsics.f(outputData, g.c.f258984a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(PartnerConsentRequestFlowContract$Step.ManualConsent.f104266a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            f outputData2 = (f) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF3 = Intrinsics.f(outputData2, t0l.d.f267043a);
                            com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar2 = this.f250806b;
                            if (zF3) {
                                aVar2.I2();
                            } else {
                                if (!Intrinsics.f(outputData2, e.f267044a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.G2(q.f5292a);
                            }
                            return Unit.f186387a;
                        default:
                            u outputData3 = (u) obj2;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            if (!(outputData3 instanceof p) && !Intrinsics.f(outputData3, r.f111463a)) {
                                boolean zF4 = Intrinsics.f(outputData3, d67.q.f111462a);
                                com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar3 = this.f250806b;
                                if (zF4) {
                                    aVar3.I2();
                                } else if (Intrinsics.f(outputData3, s.f111464a)) {
                                    aVar3.E2(PartnerConsentRequestFlowContract$Step.RequestConsent.f104267a, true, null, false);
                                } else {
                                    if (!Intrinsics.f(outputData3, t.f111465a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.E2(PartnerConsentRequestFlowContract$Step.ManualConsent.f104266a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            consentRequestScreen.H = function1;
            return consentRequestScreen;
        }
        if (Intrinsics.f(step, PartnerConsentRequestFlowContract$Step.ManualConsent.f104266a)) {
            ManualConsentScreen manualConsentScreen = new ManualConsentScreen(new ManualConsentScreenContract$InputData(tradingOnboardingFeatureConfig));
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: r0l.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a f250806b;

                {
                    this.f250806b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            s0l.g outputData = (s0l.g) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean zF2 = Intrinsics.f(outputData, g.a.f258982a);
                            com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar = this.f250806b;
                            if (zF2) {
                                aVar.I2();
                            } else if (Intrinsics.f(outputData, g.b.f258983a)) {
                                aVar.G2(q.f5292a);
                            } else {
                                if (!Intrinsics.f(outputData, g.c.f258984a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(PartnerConsentRequestFlowContract$Step.ManualConsent.f104266a, false, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            f outputData2 = (f) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF3 = Intrinsics.f(outputData2, t0l.d.f267043a);
                            com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar2 = this.f250806b;
                            if (zF3) {
                                aVar2.I2();
                            } else {
                                if (!Intrinsics.f(outputData2, e.f267044a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.G2(q.f5292a);
                            }
                            return Unit.f186387a;
                        default:
                            u outputData3 = (u) obj2;
                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                            if (!(outputData3 instanceof p) && !Intrinsics.f(outputData3, r.f111463a)) {
                                boolean zF4 = Intrinsics.f(outputData3, d67.q.f111462a);
                                com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar3 = this.f250806b;
                                if (zF4) {
                                    aVar3.I2();
                                } else if (Intrinsics.f(outputData3, s.f111464a)) {
                                    aVar3.E2(PartnerConsentRequestFlowContract$Step.RequestConsent.f104267a, true, null, false);
                                } else {
                                    if (!Intrinsics.f(outputData3, t.f111465a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.E2(PartnerConsentRequestFlowContract$Step.ManualConsent.f104266a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            manualConsentScreen.H = function12;
            return manualConsentScreen;
        }
        if (!Intrinsics.f(step, PartnerConsentRequestFlowContract$Step.ConsentExplanation.f104265a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((b) this.u).getClass();
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("CONSENT_EXPLANATION_PROMPT_LIST_ID", new TextLocalisedClause(R$string.trading_onboarding_partner_consent_request_prompt_title, null, null, 14), new TextLocalisedClause(R$string.trading_onboarding_partner_consent_request_prompt_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D100", null, null, null, 30), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_onboarding_partner_consent_request_prompt_primary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_onboarding_partner_consent_request_prompt_link, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.o, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, 2095536), null, false, false, null, 30));
        final int i3 = 2;
        Function1 block = new Function1(this) { // from class: r0l.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a f250806b;

            {
                this.f250806b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        s0l.g outputData = (s0l.g) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean zF2 = Intrinsics.f(outputData, g.a.f258982a);
                        com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar = this.f250806b;
                        if (zF2) {
                            aVar.I2();
                        } else if (Intrinsics.f(outputData, g.b.f258983a)) {
                            aVar.G2(q.f5292a);
                        } else {
                            if (!Intrinsics.f(outputData, g.c.f258984a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.E2(PartnerConsentRequestFlowContract$Step.ManualConsent.f104266a, false, null, false);
                        }
                        return Unit.f186387a;
                    case 1:
                        f outputData2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        boolean zF3 = Intrinsics.f(outputData2, t0l.d.f267043a);
                        com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar2 = this.f250806b;
                        if (zF3) {
                            aVar2.I2();
                        } else {
                            if (!Intrinsics.f(outputData2, e.f267044a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.G2(q.f5292a);
                        }
                        return Unit.f186387a;
                    default:
                        u outputData3 = (u) obj2;
                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                        if (!(outputData3 instanceof p) && !Intrinsics.f(outputData3, r.f111463a)) {
                            boolean zF4 = Intrinsics.f(outputData3, d67.q.f111462a);
                            com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.a aVar3 = this.f250806b;
                            if (zF4) {
                                aVar3.I2();
                            } else if (Intrinsics.f(outputData3, s.f111464a)) {
                                aVar3.E2(PartnerConsentRequestFlowContract$Step.RequestConsent.f104267a, true, null, false);
                            } else {
                                if (!Intrinsics.f(outputData3, t.f111465a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.E2(PartnerConsentRequestFlowContract$Step.ManualConsent.f104266a, true, null, false);
                            }
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
        return new PartnerConsentRequestFlowContract$State();
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
