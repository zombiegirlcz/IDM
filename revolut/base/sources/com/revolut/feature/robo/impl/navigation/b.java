package com.revolut.feature.robo.impl.navigation;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.robo.api.navigation.RoboFeatureConfig;
import com.revolut.feature.robo.impl.navigation.RoboInternalDestination;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlow;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Input;
import com.revolut.feature.robo.impl.ui.flow.spare_change.MigratePortfolioSpareChangeFlow;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_strategy_information.PortfolioStrategyInformationScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreen;
import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreenContract$Input;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsController;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsControllerContract$Input;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final omc.c f85096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pmc.b f85097b;

    public b(omc.c roboOnboardingFailedScreenFactory, pmc.b roboPreonboardingTopupCancelledScreenFactory, a controllerFactory) {
        Intrinsics.checkNotNullParameter(roboOnboardingFailedScreenFactory, "roboOnboardingFailedScreenFactory");
        Intrinsics.checkNotNullParameter(roboPreonboardingTopupCancelledScreenFactory, "roboPreonboardingTopupCancelledScreenFactory");
        Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
        this.f85096a = roboOnboardingFailedScreenFactory;
        this.f85097b = roboPreonboardingTopupCancelledScreenFactory;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof clc.a)) {
            return null;
        }
        clc.a aVar = (clc.a) descriptor;
        return aVar.a(new RoboTransactionDetailsController(new RoboTransactionDetailsControllerContract$Input(aVar.b())));
    }

    @Override // nte.a
    public final List e() {
        return RoboApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof RoboFeatureConfig.RoboDestination)) {
            if (!(destination instanceof RoboInternalDestination)) {
                return null;
            }
            RoboInternalDestination roboInternalDestination = (RoboInternalDestination) destination;
            if (roboInternalDestination instanceof RoboInternalDestination.TransactionDetailsDestination) {
                return new RoboTransactionDetailsController(((RoboInternalDestination.TransactionDetailsDestination) roboInternalDestination).getF85095b());
            }
            if (roboInternalDestination instanceof RoboInternalDestination.MigratePortfolioSpareChangeDestination) {
                RoboInternalDestination.MigratePortfolioSpareChangeDestination migratePortfolioSpareChangeDestination = (RoboInternalDestination.MigratePortfolioSpareChangeDestination) roboInternalDestination;
                return new MigratePortfolioSpareChangeFlow(new mmc.b(migratePortfolioSpareChangeDestination.getF85091a(), migratePortfolioSpareChangeDestination.getF85092b()));
            }
            if (roboInternalDestination instanceof RoboInternalDestination.SetPortfolioSpareChangeDestination) {
                return gc0.c.b(a.c((RoboInternalDestination.SetPortfolioSpareChangeDestination) roboInternalDestination), new ask.a(3));
            }
            if (roboInternalDestination instanceof RoboInternalDestination.ManageGoalDestination) {
                return gc0.c.b(a.a(((RoboInternalDestination.ManageGoalDestination) roboInternalDestination).getF85090a()), new ask.a(4));
            }
            if (roboInternalDestination instanceof RoboInternalDestination.PortfolioDetailsDestination) {
                return gc0.c.b(a.b(((RoboInternalDestination.PortfolioDetailsDestination) roboInternalDestination).getF85093a()), new ask.a(5));
            }
            throw new NoWhenBranchMatchedException();
        }
        RoboFeatureConfig.RoboDestination roboDestination = (RoboFeatureConfig.RoboDestination) destination;
        if (roboDestination instanceof RoboFeatureConfig.EditPortfolioDestination) {
            return new SettingsScreen(new SettingsScreenContract$Input(((RoboFeatureConfig.EditPortfolioDestination) roboDestination).getF85052a()));
        }
        if (roboDestination instanceof RoboFeatureConfig.OnboardingDestination) {
            RoboFeatureConfig.OnboardingDestination onboardingDestination = (RoboFeatureConfig.OnboardingDestination) roboDestination;
            return new OnboardingFlow(new OnboardingFlowContract$Input(onboardingDestination.getF85055a(), onboardingDestination.getF85056b(), onboardingDestination.getF85057c()));
        }
        if (roboDestination instanceof RoboFeatureConfig.TransactionDetailsDestination) {
            return new RoboTransactionDetailsController(new RoboTransactionDetailsControllerContract$Input(((RoboFeatureConfig.TransactionDetailsDestination) roboDestination).getF85062a()));
        }
        if (roboDestination instanceof RoboFeatureConfig.OnboardingFailedPromptDestination) {
            final PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("prompt-robo-onboarding-failed", new TextLocalisedClause(R$string.wealth_robo_onboarding_prompt_failed_title, null, null, 14), new TextLocalisedClause(((jte.d) this.f85096a.f226812a).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_strategies_onboarding_prompt_failed_description : R$string.wealth_robo_onboarding_prompt_failed_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30)), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.wealth_robo_common_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
            final int i = 0;
            Function1 block = new Function1() { // from class: omc.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    d67.u it8 = (d67.u) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            knm.b.j(promptMarketingScreen, u0.b(new FinishCommand(null, null, null, 7)));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            knm.b.j(promptMarketingScreen, u0.b(new FinishCommand(null, null, null, 7)));
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            promptMarketingScreen.H = block;
            return promptMarketingScreen;
        }
        if (!(roboDestination instanceof RoboFeatureConfig.PreonboardingTopupCancelledPromptDestination)) {
            if (roboDestination instanceof RoboFeatureConfig.PortfolioStrategyInformationDestination) {
                return new PortfolioStrategyInformationScreen(new PortfolioStrategyInformationScreenContract$Input(((RoboFeatureConfig.PortfolioStrategyInformationDestination) roboDestination).getF85060a()));
            }
            throw new NoWhenBranchMatchedException();
        }
        final PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("prompt-robo-topup-cancelled", new TextLocalisedClause(((jte.d) this.f85097b.f237548a).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_strategies_onboarding_prompt_topup_cancelled_title : R$string.wealth_robo_onboarding_prompt_topup_cancelled_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_onboarding_prompt_topup_cancelled_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D302", null, null, null, 30)), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.wealth_robo_common_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: omc.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                d67.u it8 = (d67.u) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        knm.b.j(promptMarketingScreen2, u0.b(new FinishCommand(null, null, null, 7)));
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        knm.b.j(promptMarketingScreen2, u0.b(new FinishCommand(null, null, null, 7)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        promptMarketingScreen2.H = block2;
        return promptMarketingScreen2;
    }
}
