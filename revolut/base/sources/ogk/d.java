package ogk;

import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.retail.feature.plan_referrals.api.PlanReferralsApi$Toggles;
import com.revolut.retail.feature.plan_referrals.api.navigation.PlanReferralsDestination$Claim;
import com.revolut.retail.feature.plan_referrals.api.navigation.PlanReferralsDestination$Sender;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenId;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.CancelStudentBenefitsFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.CheckoutPlanSelectionFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.FamilyPlanInvitationFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.GraduateStudentFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.GraduateStudentFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$BillingOptionHandlingMode;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.PlanChangeFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.PlanKeepFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_keep.PlanKeepFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsSenderFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_selection.PlanSelectionFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.PlanSwitchToAnnualFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.PlanSwitchToAnnualEntryFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.cancel_downgrade.CancelDowngradeScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$HigherThan$Current;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter$With$Id;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.PlanPartnersFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.PlanPartnersFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.upgrade_to_metal.UpgradeToMetalAtCostOfPremiumPromptDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.upgrade_to_metal.UpgradeToMetalAtCostOfPremiumScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.flow.PlanHubV2Flow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.flow.PlanHubV2FlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_management.flow.PlanManagementFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_preview.PlanPreviewScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreenContract$InputData;
import hha.w0;
import igk.e0;
import igk.f0;
import igk.g0;
import igk.h;
import igk.h0;
import igk.i0;
import igk.j0;
import igk.k0;
import igk.l;
import igk.l0;
import igk.m0;
import igk.n;
import igk.s;
import igk.w;
import igk.x;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f225193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ajk.b f225194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f225195c;

    public d(ImmutableSet deeplinkGateways, e purposeToFilterMapper, ajk.b premiumOutOfAppNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(purposeToFilterMapper, "purposeToFilterMapper");
        Intrinsics.checkNotNullParameter(premiumOutOfAppNavigationProvider, "premiumOutOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f225193a = deeplinkGateways;
        this.f225194b = premiumOutOfAppNavigationProvider;
        this.f225195c = featureToggleInteractor;
    }

    public final boolean a() {
        return this.f225195c.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c);
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.a aVar;
        PlanSelection planTier;
        PlanFilter planFilterA;
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof w) {
            w wVar = (w) descriptor;
            x xVarB = wVar.b();
            g0 g0VarC = xVarB.c();
            if (g0VarC instanceof e0) {
                planTier = PlanSelection.Default.f103355a;
            } else {
                if (!(g0VarC instanceof f0)) {
                    throw new NoWhenBranchMatchedException();
                }
                planTier = new PlanSelection.PlanTier(((f0) g0VarC).a());
            }
            k0 k0VarB = xVarB.b();
            if (k0VarB instanceof i0) {
                planFilterA = PlanFilter.NoFilter.f103390a;
            } else if (k0VarB instanceof j0) {
                planFilterA = new PlanFilter$With$Id(((j0) k0VarB).a());
            } else {
                if (!(k0VarB instanceof h0)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanFilter.Companion companion = PlanFilter.INSTANCE;
                PlanFilter[] planFilterArr = {PlanFilter.Current.f103385a, PlanFilter$HigherThan$Current.f103386a};
                companion.getClass();
                planFilterA = PlanFilter.Companion.a(planFilterArr);
            }
            PlanFilter planFilter = planFilterA;
            xfa.b bVarD = xVarB.d();
            l0 l0VarE = xVarB.e();
            if (l0VarE == null || (textLocalisedClause = l0VarE.a()) == null) {
                textLocalisedClause = new TextLocalisedClause(R$string.plan_selection_title, null, null, 14);
            }
            l0 l0VarE2 = xVarB.e();
            Integer numB = l0VarE2 != null ? l0VarE2.b() : null;
            l0 l0VarE3 = xVarB.e();
            return wVar.a(new PlanSelectionFlow(new nik.c(planFilter, planTier, bVarD, new nik.d(textLocalisedClause, numB, l0VarE3 != null ? l0VarE3.c() : false), xVarB.a())));
        }
        if (descriptor instanceof igk.e) {
            igk.e eVar = (igk.e) descriptor;
            return eVar.a(new PlanCancelFeaturesScreen(new PlanCancelFeaturesScreenContract$InputData(eVar.b().getF102913a(), a())));
        }
        if (descriptor instanceof l) {
            l lVar = (l) descriptor;
            return lVar.a(new PlanGiftBenefitsScreen(new PlanGiftBenefitsScreenContract$InputData(lVar.b().getF102955a(), lVar.b().getF102956b())));
        }
        if (descriptor instanceof n) {
            n nVar = (n) descriptor;
            return nVar.a(new PlanGiftSendingFlow(new PlanGiftSendingFlowContract$InputData(nVar.b().getF102957a(), nVar.b().getF102958b())));
        }
        if (descriptor instanceof igk.g) {
            igk.g gVar = (igk.g) descriptor;
            return gVar.a(new PlanDocumentsBottomSheetScreen(new PlanDocumentsBottomSheetScreenContract$InputData(new PlanDocumentsBottomSheetScreenContract$TitleConfig.Custom(gVar.b().getF102918a()), gVar.b().getF102919b())));
        }
        if (descriptor instanceof h) {
            h hVar = (h) descriptor;
            return hVar.a(new PricingPlanBottomSheetBEDrivenScreen(new PricingPlanBottomSheetBEDrivenScreenContract$InputData(new PricingPlanBottomSheetDescriptor.BottomSheet(hVar.b().getF102920a(), hVar.b().getF102921b(), 4), false)));
        }
        if (descriptor instanceof igk.a) {
            igk.a aVar2 = (igk.a) descriptor;
            return aVar2.a(new PlanPreviewScreen(new PlanPreviewScreenContract$InputData(aVar2.b().getF102860a())));
        }
        if (descriptor instanceof m0) {
            m0 m0Var = (m0) descriptor;
            return m0Var.a(new PlanSingleOfferScreen(new PlanSingleOfferScreenContract$InputData(m0Var.b())));
        }
        if (!(descriptor instanceof s)) {
            super.c(descriptor);
            return null;
        }
        s sVar = (s) descriptor;
        PricingPlanOfferPrompt.Available availableB = sVar.b();
        int i = c.f225192a[sVar.c().ordinal()];
        if (i == 1) {
            aVar = com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.a.BOTTOM_SHEET;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.a.FULL_SCREEN;
        }
        return sVar.a(new PlanOfferFlow(new PlanOfferFlowContract$InputData.ByPrompt(availableB, aVar)));
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(PlanReferralsApi$Toggles.a(), d0.E0(PricingPlansApi$Toggles.a(), PricingPlansUiApi$Toggles.a()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        StudentFlowContract$InputData.Mode verificationCode;
        gmk.g gVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PlanReferralsDestination$Sender) {
            return new PlanReferralsSenderFlow(new PlanReferralsSenderFlowContract$InputData(((PlanReferralsDestination$Sender) destination).getF102520a()));
        }
        if (destination instanceof PlanReferralsDestination$Claim) {
            return new PlanReferralsClaimFlow(new PlanReferralsClaimFlowContract$InputData(((PlanReferralsDestination$Claim) destination).getF102519a()));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.PlanSettingsDestination) {
            return new PlanManagementFlow();
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.WhatsNewInPlanDestination) {
            return gc0.c.b(new PricingPlanBEDrivenScreen(new PricingPlanBEDrivenScreenContract$InputData(new PricingPlanScreenId("whats_new"), a())), new b(7));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.PlanTemplateScreenDestination) {
            return gc0.c.b(new PricingPlanBEDrivenScreen(new PricingPlanBEDrivenScreenContract$InputData(((KompotPricingPlanFeatureConfig.PlanTemplateScreenDestination) destination).getF102889a(), a())), new b(7));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.BottomSheetDestination) {
            return gc0.c.b(new PricingPlanBottomSheetBEDrivenScreen(new PricingPlanBottomSheetBEDrivenScreenContract$InputData(((KompotPricingPlanFeatureConfig.BottomSheetDestination) destination).getF102861a(), a())), new b(0));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.SavingsAccountsBottomSheetDestination) {
            PlanBottomSheetDeeplinkNavigation.SavingsAccounts f102890a = ((KompotPricingPlanFeatureConfig.SavingsAccountsBottomSheetDestination) destination).getF102890a();
            if (Intrinsics.f(f102890a, PlanBottomSheetDeeplinkNavigation.SavingsAccounts.MMF.f102907a)) {
                gVar = gmk.g.MMF;
            } else {
                if (!Intrinsics.f(f102890a, PlanBottomSheetDeeplinkNavigation.SavingsAccounts.Savings.f102908a)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = gmk.g.SAVINGS;
            }
            return gc0.c.b(new PlanSavingsAccountsScreen(new PlanSavingsAccountsScreenContract$InputData(gVar)), new b(1));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.PlanCancelDestination) {
            KompotPricingPlanFeatureConfig.PlanCancelDestination planCancelDestination = (KompotPricingPlanFeatureConfig.PlanCancelDestination) destination;
            return gc0.c.b(new PlanCancelFlow(new PlanCancelFlowContract$InputData(planCancelDestination.getF102874b(), planCancelDestination.getF102875c())), new b(2));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.PlanPartnersDestination) {
            return new PlanPartnersFlow(new PlanPartnersFlowContract$InputData(a()));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.PlanHubV2Destination) {
            return new PlanHubV2Flow(new PlanHubV2FlowContract$InputData(a()));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.FamilyPlanDestination) {
            return new FamilyPlanFlow(new vgk.c(((KompotPricingPlanFeatureConfig.FamilyPlanDestination) destination).getF102863a(), a.b.f102992a));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.FamilyPlanAddMemberDestination) {
            return new FamilyPlanFlow(new vgk.c(((KompotPricingPlanFeatureConfig.FamilyPlanAddMemberDestination) destination).getF102862a(), a.C0630a.f102991a));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.FamilyPlanInvitationDestination) {
            KompotPricingPlanFeatureConfig.FamilyPlanInvitationDestination familyPlanInvitationDestination = (KompotPricingPlanFeatureConfig.FamilyPlanInvitationDestination) destination;
            return new FamilyPlanInvitationFlow(new zgk.d(familyPlanInvitationDestination.getF102867b(), familyPlanInvitationDestination.getF102866a()));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.KeepPlanDestination) {
            return new PlanKeepFlow(new PlanKeepFlowContract$InputData(((KompotPricingPlanFeatureConfig.KeepPlanDestination) destination).getF102868a()));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.PlanDowngradeDestination) {
            KompotPricingPlanFeatureConfig.PlanDowngradeDestination planDowngradeDestination = (KompotPricingPlanFeatureConfig.PlanDowngradeDestination) destination;
            return new PlanDowngradeFlow(new PlanDowngradeFlowContract$InputData(planDowngradeDestination.getF102876a(), planDowngradeDestination.getF102877b(), a()));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.SwitchToAnnualBillingFlow) {
            KompotPricingPlanFeatureConfig.SwitchToAnnualBillingFlow switchToAnnualBillingFlow = (KompotPricingPlanFeatureConfig.SwitchToAnnualBillingFlow) destination;
            return new PlanSwitchToAnnualFlow(new oik.c(switchToAnnualBillingFlow.getF102900a(), switchToAnnualBillingFlow.getF102901b(), switchToAnnualBillingFlow.getF102902c()));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.PlanSwitchToAnnualEntryDestination) {
            return new PlanSwitchToAnnualEntryFlow();
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.StudentDestination) {
            KompotPricingPlanFeatureConfig.StudentDestination.Mode f102894a = ((KompotPricingPlanFeatureConfig.StudentDestination) destination).getF102894a();
            if (Intrinsics.f(f102894a, KompotPricingPlanFeatureConfig.StudentDestination.Mode.Default.f102895a)) {
                verificationCode = StudentFlowContract$InputData.Mode.Default.f103262a;
            } else if (f102894a instanceof KompotPricingPlanFeatureConfig.StudentDestination.Mode.VerificationCode) {
                verificationCode = new StudentFlowContract$InputData.Mode.VerificationCode(((KompotPricingPlanFeatureConfig.StudentDestination.Mode.VerificationCode) f102894a).getF102898a());
            } else if (Intrinsics.f(f102894a, KompotPricingPlanFeatureConfig.StudentDestination.Mode.Verification.f102897a)) {
                verificationCode = StudentFlowContract$InputData.Mode.Verification.f103264a;
            } else {
                if (!Intrinsics.f(f102894a, KompotPricingPlanFeatureConfig.StudentDestination.Mode.Status.f102896a)) {
                    throw new NoWhenBranchMatchedException();
                }
                verificationCode = StudentFlowContract$InputData.Mode.Status.f103263a;
            }
            return new StudentFlow(new StudentFlowContract$InputData(verificationCode));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.StudentGraduateActionDestination) {
            return new GraduateStudentFlow(new GraduateStudentFlowContract$InputData(false));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.StudentCancelActionDestination) {
            return new CancelStudentBenefitsFlow();
        }
        if (destination instanceof InternalPricingPlanFeatureConfig.PlanUpgrade.Destination) {
            InternalPricingPlanFeatureConfig.PlanUpgrade.Destination destination2 = (InternalPricingPlanFeatureConfig.PlanUpgrade.Destination) destination;
            return new PlanChangeFlow(new rhk.c(e.a(destination2.getF103346a()), destination2.getF103347b(), new rhk.e(3), destination2.getF103348c(), destination2.getD(), destination2.getE()));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination) {
            InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination internalPricingPlanFeatureConfig$InternalPlanSwitch$Destination = (InternalPricingPlanFeatureConfig$InternalPlanSwitch$Destination) destination;
            return new PlanChangeFlow(new rhk.c(new PlanFilter$With$Id(internalPricingPlanFeatureConfig$InternalPlanSwitch$Destination.getF103337a().getId()), PlanSelection.Default.f103355a, new rhk.e(3), internalPricingPlanFeatureConfig$InternalPlanSwitch$Destination.getF103338b(), PlanChangeSuccessActionStrategy.Quit.f102917a));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig.InternalPlanChange.Destination) {
            InternalPricingPlanFeatureConfig.InternalPlanChange.Destination destination3 = (InternalPricingPlanFeatureConfig.InternalPlanChange.Destination) destination;
            return new PlanChangeFlow(new rhk.c(PlanFilter.NoFilter.f103390a, destination3.getF103335b(), new rhk.e(new TextLocalisedClause(R$string.plan_change_title, null, null, 14), true), destination3.getF103334a(), destination3.getF103336c()));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig.InternalCheckoutPlanSelection.Destination) {
            InternalPricingPlanFeatureConfig.InternalCheckoutPlanSelection.Destination destination4 = (InternalPricingPlanFeatureConfig.InternalCheckoutPlanSelection.Destination) destination;
            return new CheckoutPlanSelectionFlow(new tgk.d(e.a(destination4.getF103324a()), destination4.getF103325b(), destination4.getF103326c(), destination4.getD(), destination4.getE(), destination4.getF(), destination4.getF103327g(), destination4.getF103328h()));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination) {
            InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination internalPricingPlanFeatureConfig$InternalPlanBenefits$Destination = (InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination) destination;
            return new PlanBenefitsScreen(new PlanBenefitsScreenContract$InputData(internalPricingPlanFeatureConfig$InternalPlanBenefits$Destination.getF103329a(), internalPricingPlanFeatureConfig$InternalPlanBenefits$Destination.getF103331c(), a(), 8));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination) {
            InternalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination internalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination = (InternalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination) destination;
            w0 f103339a = internalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination.getF103339a();
            return new PlanBillingPickerFlow(new PlanBillingPickerContract$InputData(new SelectedBillingPlan.Tier(f103339a), new PlanBillingPickerContract$Mode.Standalone(null, null, null), new PricingPlanAnalyticsSource.Predefined(xfa.b.PLANS_DEEPLINK), a(), PlanBillingPickerContract$BillingOptionHandlingMode.ExecuteActions, internalPricingPlanFeatureConfig$PlanBillingByTierDestination$Destination.getF103340b(), 16));
        }
        if (destination instanceof UpgradeToMetalAtCostOfPremiumPromptDestination) {
            return gc0.c.b(new UpgradeToMetalAtCostOfPremiumScreen(), new b(3));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig.RevPointsCardsBottomSheetDestination) {
            return gc0.c.b(new PlanRevPointsCardsScreen(new PlanRevPointsCardsScreenContract$InputData(((InternalPricingPlanFeatureConfig.RevPointsCardsBottomSheetDestination) destination).getF103349a())), new b(4));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig.CancelPlanDowngradeDestination) {
            return gc0.c.b(new CancelDowngradeScreen(), new b(5));
        }
        if (destination instanceof InternalPricingPlanFeatureConfig.PlanTerms) {
            InternalPricingPlanFeatureConfig.PlanTerms planTerms = (InternalPricingPlanFeatureConfig.PlanTerms) destination;
            return gc0.c.b(new PlanDurableTermsFlow(new PlanDurableTermsFlowContract$InputData(planTerms.getF103341a(), planTerms.getF103342b())), new b(6));
        }
        if (destination instanceof KompotPricingPlanFeatureConfig.OutOfAppNavigation) {
            return gc0.c.b(this.f225194b.a(((KompotPricingPlanFeatureConfig.OutOfAppNavigation) destination).getF102869a(), new ofa.n(13)), new ak3.a(destination, 1));
        }
        if (!(destination instanceof InternalPricingPlanFeatureDestination)) {
            return null;
        }
        InternalPricingPlanFeatureDestination internalPricingPlanFeatureDestination = (InternalPricingPlanFeatureDestination) destination;
        if (internalPricingPlanFeatureDestination instanceof InternalPricingPlanFeatureDestination.PlanOffer) {
            return new PlanOfferFlow(new PlanOfferFlowContract$InputData.ByOfferType(((InternalPricingPlanFeatureDestination.PlanOffer) internalPricingPlanFeatureDestination).getF103353a(), a()));
        }
        if (internalPricingPlanFeatureDestination instanceof InternalPricingPlanFeatureDestination.PromptOffer) {
            return new PlanOfferFlow(new PlanOfferFlowContract$InputData.ByPrompt(((InternalPricingPlanFeatureDestination.PromptOffer) internalPricingPlanFeatureDestination).getF103354a()));
        }
        if (!(internalPricingPlanFeatureDestination instanceof InternalPricingPlanFeatureDestination.PlanContextualSelection)) {
            throw new NoWhenBranchMatchedException();
        }
        InternalPricingPlanFeatureDestination.PlanContextualSelection planContextualSelection = (InternalPricingPlanFeatureDestination.PlanContextualSelection) internalPricingPlanFeatureDestination;
        return new PlanContextualSelectionFlow(new PlanContextualSelectionFlowContract$InputData(planContextualSelection.getF103350a(), planContextualSelection.getF103351b(), planContextualSelection.getF103352c(), planContextualSelection.getD()));
    }

    @Override // aii.p
    public final Set h() {
        return this.f225193a;
    }
}
