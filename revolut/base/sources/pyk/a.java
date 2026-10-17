package pyk;

import aii.p;
import aii.q;
import aii.r;
import aii.u;
import android.os.Parcelable;
import com.google.common.collect.ImmutableSet;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$FreeStocksNavigation;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$TradingFatcaSkipIntro;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$TradingOnboardingBackendFlowKompotWrapper;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$TradingOnboardingNationalIdentifiersKompotMigration;
import com.revolut.retail.feature.trading_onboarding.api.navigation.PartnerGivingConsentDestination;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingResultFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.cfd_onboarding.CfdOnboardingDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.flow.GiaOnboardingFailedFlowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.FreeStocksDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.InvestmentGoalsFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.InvestmentGoalsFlowContract$InvestmentGoalsDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityContract$KycDetailsNationalityDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.kompot.TradingOnboardingBackendFlowController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowContract$OnboardingWorkflowDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.PartnerGivingConsentFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.PartnerGivingConsentFlowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptScreenContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_prompts.PartnerConsentPromptsScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestFlow;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestFlowContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning.RiskWarningContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning.RiskWarningController;
import dki.g;
import gc0.c;
import grl.k9;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oyk.d;
import oyk.e;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f240853a;

    public a(e tradingOnboardingResultScreenFactory, ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(tradingOnboardingResultScreenFactory, "tradingOnboardingResultScreenFactory");
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f240853a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return v.k(TradingOnboardingRevampApi$Toggles$FreeStocksNavigation.f104067c, TradingOnboardingRevampApi$Toggles$TradingFatcaSkipIntro.f104068c, TradingOnboardingRevampApi$Toggles$TradingOnboardingBackendFlowKompotWrapper.f104069c, TradingOnboardingRevampApi$Toggles$TradingOnboardingNationalIdentifiersKompotMigration.f104070c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PartnerConsentRequestDestination) {
            PartnerConsentRequestDestination partnerConsentRequestDestination = (PartnerConsentRequestDestination) destination;
            PartnerConsentRequestFlowContract$InputData inputData = new PartnerConsentRequestFlowContract$InputData(partnerConsentRequestDestination.f104261b);
            final NaviCommand naviCommand = partnerConsentRequestDestination.f104262c;
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            final int i = 2;
            return c.a(new PartnerConsentRequestFlow(inputData), new qii.a() { // from class: c0l.g
                @Override // qii.a
                public final void a(r rVar, qii.b wrapperFlowModel) {
                    switch (i) {
                        case 0:
                            c output = (c) rVar;
                            Intrinsics.checkNotNullParameter(output, "output");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            FinishCommand finishCommand = output.f20295a ? new FinishCommand(null, null, null, 7) : null;
                            NaviCommand naviCommandC = naviCommand;
                            if (finishCommand != null) {
                                naviCommandC = com.revolut.retail.core.navigation.a.c(finishCommand, naviCommandC);
                            }
                            if (naviCommandC != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommandC));
                                return;
                            }
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand)));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand2 = naviCommand;
                            if (naviCommand2 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand2));
                                return;
                            }
                            return;
                        case 3:
                            a2b.d result = (a2b.d) rVar;
                            Intrinsics.checkNotNullParameter(result, "result");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            int i2 = ryk.a.f258429a[result.ordinal()];
                            if (i2 == 1) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand)));
                                return;
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                wrapperFlowModel.J2();
                                return;
                            }
                        default:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand3 = naviCommand;
                            if (naviCommand3 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand3));
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (destination instanceof PartnerGivingConsentDestination) {
            return new PartnerGivingConsentFlow(new PartnerGivingConsentFlowContract$InputData(((PartnerGivingConsentDestination) destination).f104098b));
        }
        if (destination instanceof PartnerConsentPromptDestination) {
            return new PartnerConsentPromptsScreen(new PartnerConsentPromptScreenContract$InputData(((PartnerConsentPromptDestination) destination).f104256b));
        }
        if (destination instanceof KycDetailsNationalityContract$KycDetailsNationalityDestination) {
            return new KycDetailsNationalityFlow((KycDetailsNationalityContract$InputData) ((KycDetailsNationalityContract$KycDetailsNationalityDestination) destination).f98300a);
        }
        if (destination instanceof InvestmentGoalsFlowContract$InvestmentGoalsDestination) {
            return new InvestmentGoalsFlow();
        }
        final int i2 = 0;
        if (destination instanceof TradingOnboardingResultFeatureConfig.TradingOnboardingResultDestination.Failed) {
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.wealth_trading_onboarding_prompt_failed_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_onboarding_prompt_failed_description, null, null, 14), null, b.c("3D151", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.wealth_trading_onboarding_prompt_failed_cta, null, null, 14), null, false, null, null, null, false, 16776140));
            d block = new d(fullScreenPromptScreen, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            fullScreenPromptScreen.H = block;
            return fullScreenPromptScreen;
        }
        if (destination instanceof OnboardingOtpDialogDestination) {
            return new OnboardingOtpDialogScreen((OnboardingOtpDialogScreenContract$InputData) ((OnboardingOtpDialogDestination) destination).f98300a);
        }
        if (destination instanceof OnboardingWorkflowContract$OnboardingWorkflowDestination) {
            OnboardingWorkflowContract$OnboardingWorkflowDestination onboardingWorkflowContract$OnboardingWorkflowDestination = (OnboardingWorkflowContract$OnboardingWorkflowDestination) destination;
            OnboardingWorkflowContract$InputData inputData2 = new OnboardingWorkflowContract$InputData(onboardingWorkflowContract$OnboardingWorkflowDestination.f104239b, onboardingWorkflowContract$OnboardingWorkflowDestination.f104240c);
            final NaviCommand naviCommand2 = onboardingWorkflowContract$OnboardingWorkflowDestination.d;
            Intrinsics.checkNotNullParameter(inputData2, "inputData");
            final int i3 = 1;
            return c.b(new OnboardingWorkflowFlow(inputData2), new qii.a() { // from class: c0l.g
                @Override // qii.a
                public final void a(r rVar, qii.b wrapperFlowModel) {
                    switch (i3) {
                        case 0:
                            c output = (c) rVar;
                            Intrinsics.checkNotNullParameter(output, "output");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            FinishCommand finishCommand = output.f20295a ? new FinishCommand(null, null, null, 7) : null;
                            NaviCommand naviCommandC = naviCommand2;
                            if (finishCommand != null) {
                                naviCommandC = com.revolut.retail.core.navigation.a.c(finishCommand, naviCommandC);
                            }
                            if (naviCommandC != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommandC));
                                return;
                            }
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand2)));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand22 = naviCommand2;
                            if (naviCommand22 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand22));
                                return;
                            }
                            return;
                        case 3:
                            a2b.d result = (a2b.d) rVar;
                            Intrinsics.checkNotNullParameter(result, "result");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            int i22 = ryk.a.f258429a[result.ordinal()];
                            if (i22 == 1) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand2)));
                                return;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                wrapperFlowModel.J2();
                                return;
                            }
                        default:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand3 = naviCommand2;
                            if (naviCommand3 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand3));
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (destination instanceof GiaOnboardingFailedFlowContract$Destination) {
            return new GiaOnboardingFailedFlow((GiaOnboardingFailedFlowContract$InputData) ((GiaOnboardingFailedFlowContract$Destination) destination).f98300a);
        }
        if (destination instanceof RiskWarningContract$Destination) {
            RiskWarningContract$Destination riskWarningContract$Destination = (RiskWarningContract$Destination) destination;
            TradingOnboardingFeatureConfig onboardingLaunchingConfig = riskWarningContract$Destination.f104278b;
            final NaviCommand naviCommand3 = riskWarningContract$Destination.f104279c;
            Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
            final int i5 = 4;
            return c.b(new RiskWarningController(onboardingLaunchingConfig.getE()), new qii.a() { // from class: c0l.g
                @Override // qii.a
                public final void a(r rVar, qii.b wrapperFlowModel) {
                    switch (i5) {
                        case 0:
                            c output = (c) rVar;
                            Intrinsics.checkNotNullParameter(output, "output");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            FinishCommand finishCommand = output.f20295a ? new FinishCommand(null, null, null, 7) : null;
                            NaviCommand naviCommandC = naviCommand3;
                            if (finishCommand != null) {
                                naviCommandC = com.revolut.retail.core.navigation.a.c(finishCommand, naviCommandC);
                            }
                            if (naviCommandC != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommandC));
                                return;
                            }
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand3)));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand22 = naviCommand3;
                            if (naviCommand22 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand22));
                                return;
                            }
                            return;
                        case 3:
                            a2b.d result = (a2b.d) rVar;
                            Intrinsics.checkNotNullParameter(result, "result");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            int i22 = ryk.a.f258429a[result.ordinal()];
                            if (i22 == 1) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand3)));
                                return;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                wrapperFlowModel.J2();
                                return;
                            }
                        default:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand32 = naviCommand3;
                            if (naviCommand32 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand32));
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (destination instanceof TradingOnboardingBackendFlowContract$Destination) {
            TradingOnboardingBackendFlowContract$Configuration config = ((TradingOnboardingBackendFlowContract$Destination) destination).f104229b;
            Intrinsics.checkNotNullParameter(config, "config");
            AnalyticsProduct analyticsProductH = config.getF104226c().d;
            if (analyticsProductH == null) {
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            }
            return c.b(new TradingOnboardingBackendFlowController(config, analyticsProductH), new an4.b(config, 5));
        }
        if (destination instanceof NationalIdentifiersFlowContract$Destination) {
            NationalIdentifiersFlowContract$Destination nationalIdentifiersFlowContract$Destination = (NationalIdentifiersFlowContract$Destination) destination;
            TradingOnboardingFeatureConfig onboardingLaunchingConfig2 = nationalIdentifiersFlowContract$Destination.f104210b;
            final NaviCommand naviCommand4 = nationalIdentifiersFlowContract$Destination.f104211c;
            Intrinsics.checkNotNullParameter(onboardingLaunchingConfig2, "onboardingLaunchingConfig");
            return c.b(new NationalIdentifiersFlow(onboardingLaunchingConfig2.getE()), new qii.a() { // from class: c0l.g
                @Override // qii.a
                public final void a(r rVar, qii.b wrapperFlowModel) {
                    switch (i2) {
                        case 0:
                            c output = (c) rVar;
                            Intrinsics.checkNotNullParameter(output, "output");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            FinishCommand finishCommand = output.f20295a ? new FinishCommand(null, null, null, 7) : null;
                            NaviCommand naviCommandC = naviCommand4;
                            if (finishCommand != null) {
                                naviCommandC = com.revolut.retail.core.navigation.a.c(finishCommand, naviCommandC);
                            }
                            if (naviCommandC != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommandC));
                                return;
                            }
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand4)));
                            return;
                        case 2:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand22 = naviCommand4;
                            if (naviCommand22 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand22));
                                return;
                            }
                            return;
                        case 3:
                            a2b.d result = (a2b.d) rVar;
                            Intrinsics.checkNotNullParameter(result, "result");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            int i22 = ryk.a.f258429a[result.ordinal()];
                            if (i22 == 1) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand4)));
                                return;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                wrapperFlowModel.J2();
                                return;
                            }
                        default:
                            Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                            Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                            NaviCommand naviCommand32 = naviCommand4;
                            if (naviCommand32 != null) {
                                knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand32));
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (!(destination instanceof CfdOnboardingDestination)) {
            if (destination instanceof TradingOnboardingOpenDocumentFlowContract$Destination) {
                return new TradingOnboardingOpenDocumentFlow(((TradingOnboardingOpenDocumentFlowContract$Destination) destination).f104150b);
            }
            if (destination instanceof FreeStocksDestination) {
                return new SelectFreeStocksScreen();
            }
            return null;
        }
        CfdOnboardingDestination cfdOnboardingDestination = (CfdOnboardingDestination) destination;
        AnalyticsProduct analyticsProduct = cfdOnboardingDestination.f104143a;
        final NaviCommand naviCommand5 = cfdOnboardingDestination.f104144b;
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        ViewController viewControllerE1 = flowModel.e1(new a2b.c(analyticsProduct));
        final int i6 = 3;
        return c.b(viewControllerE1, new qii.a() { // from class: c0l.g
            @Override // qii.a
            public final void a(r rVar, qii.b wrapperFlowModel) {
                switch (i6) {
                    case 0:
                        c output = (c) rVar;
                        Intrinsics.checkNotNullParameter(output, "output");
                        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                        FinishCommand finishCommand = output.f20295a ? new FinishCommand(null, null, null, 7) : null;
                        NaviCommand naviCommandC = naviCommand5;
                        if (finishCommand != null) {
                            naviCommandC = com.revolut.retail.core.navigation.a.c(finishCommand, naviCommandC);
                        }
                        if (naviCommandC != null) {
                            knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommandC));
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                        knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand5)));
                        return;
                    case 2:
                        Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                        NaviCommand naviCommand22 = naviCommand5;
                        if (naviCommand22 != null) {
                            knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand22));
                            return;
                        }
                        return;
                    case 3:
                        a2b.d result = (a2b.d) rVar;
                        Intrinsics.checkNotNullParameter(result, "result");
                        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                        int i22 = ryk.a.f258429a[result.ordinal()];
                        if (i22 == 1) {
                            knm.b.j(wrapperFlowModel.l1(), u0.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), naviCommand5)));
                            return;
                        } else {
                            if (i22 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            wrapperFlowModel.J2();
                            return;
                        }
                    default:
                        Intrinsics.checkNotNullParameter((q) rVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
                        NaviCommand naviCommand32 = naviCommand5;
                        if (naviCommand32 != null) {
                            knm.b.j(wrapperFlowModel.l1(), u0.b(naviCommand32));
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // aii.p
    public final Set h() {
        return this.f240853a;
    }
}
