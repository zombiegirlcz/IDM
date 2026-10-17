package m84;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import coa.d;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.kd;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreenContract$ModalStep;
import com.revolut.feature.add_money.impl.flow.AddMoneyFlowContract$Step;
import com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.AddPayIdScreenContract$ModalStep;
import com.revolut.feature.apm.payid.impl.screen.createpayid.aliases.AliasesScreen;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.OutstandingDebtsV3FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.DebtsV3HubController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.DebtsV3HubControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.DebtTypeSelectorController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.DebtTypeSelectorControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.AddEvidenceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.AddEvidenceFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.type.EvidenceTypeSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.InsuranceScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.InsuranceScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.BigTileOfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.RegularOfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.DonationsAcceptTermsFlowContract$Step;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.institutions.IndiaNetBankingInstitutionsScreen;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.webview.IndiaNetBankingWebViewScreen;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.JuniorAddPhoneNumberFlowContract$Step;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreenContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreenContract$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.onboarding.impl.onboarding.pep.PoliticallyExposedPersonScreenContract$ModalStep;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlowContract$Step;
import com.revolut.feature.profile.impl.ui.profile.ProfileFlowContract$Step;
import com.revolut.feature.profile.impl.ui.profile.screens.about_us.AboutUsScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.app_settings.AppSettingsController;
import com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.AutoEarnRewardsController;
import com.revolut.feature.profile.impl.ui.profile.screens.general_settings.GeneralSettingsScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.NotificationCategoriesContract$InputData;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_categories.NotificationCategoriesViewController;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsContract$InputData;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingDetailsViewController;
import com.revolut.feature.profile.impl.ui.profile.screens.profile_account.ProfileAccountScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.public_experiments.PublicExperimentsScreen;
import com.revolut.feature.robo.impl.ui.flow.spare_change.MigratePortfolioSpareChangeFlowContract$Step;
import com.revolut.feature.tax_residency.impl.exemption.flows.main.TaxExemptionFlowContract$Step;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreen;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.exemption.ui.main.TaxExemptionScreen;
import com.revolut.feature_retail_user_declarations.gender.GenderInfoBottomSheetController;
import com.revolut.feature_retail_user_declarations.gender.GenderScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.terms_review.TermsReviewInputData;
import com.revolut.feature_retail_user_declarations.terms_review.flow.TermsReviewFlowContract$State;
import com.revolut.feature_retail_user_declarations.terms_review.flow.TermsReviewFlowContract$Step;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsController;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$ModalStep;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.EsimGetPlanFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreenContract$InputData;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.FamilyPlanManagementScreenContract$ModalStep;
import com.revolut.tracking.v3.CreditApplicationProductArticleContext;
import dej.c4;
import efm.r;
import ft3.d1;
import grl.k9;
import hs3.l0;
import igk.s;
import ip0.v7;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import lha.h;
import li8.n;
import m1i.t;
import ma2.p;
import mci.e;
import mh4.c0;
import mhd.p0;
import mj6.k;
import ml3.y;
import mlk.b0;
import n94.i;
import nm6.g;
import rna.f;
import ul8.f;
import vjj.m;
import vjj.o;
import vjj.q;
import vkm.j2;
import we6.z;
import wna.e;
import yki.l;
import zhm.f0;
import zhm.u;
import zhm.v;
import zp0.u;
import zp0.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f203426b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f203425a = i;
        this.f203426b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        k kVar = (k) this.f203426b;
        String listId = (String) obj2;
        so6.f item = (so6.f) obj3;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(item, "item");
        ne6.b bVar = kVar.f205934a;
        so6.d dVar = item.f264799c;
        String str = item.f264797a;
        if (dVar instanceof so6.c) {
            return ((hj6.a) bVar).f(((so6.c) dVar).f264793b, listId, str);
        }
        if (dVar instanceof so6.b) {
            return ((hj6.a) bVar).e(listId, str, ((so6.b) dVar).f264791b);
        }
        if (dVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return ((hj6.a) bVar).g(listId, str, item.f264798b);
    }

    private final Object b(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        hha.d dVar;
        final com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) this.f203426b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        final FamilyPlanManagementScreenContract$ModalStep step = (FamilyPlanManagementScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FamilyPlanManagementScreenContract$ModalStep.CancelInvitation) {
            h hVar = ((FamilyPlanManagementScreenContract$ModalStep.CancelInvitation) step).f103400a;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.family_plans_management_cancel_invite_sheet_title, null, null, 14);
            int i = R$string.family_plans_management_cancel_invite_sheet_subtitle;
            String str = hVar.f195210c.e;
            lw0.a aVar = new lw0.a(textLocalisedClause2, new TextLocalisedClause(i, u.c(str != null ? str : ""), null, 12), null, null, false, 28);
            aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.family_plans_management_cancel_invite_sheet_cancel_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.family_plans_management_cancel_invite_sheet_go_back_cta, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.Premium;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            final int i2 = 0;
            Function1 block = new Function1() { // from class: mkk.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    dii.g result = (dii.g) obj4;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof dii.e) {
                                lha.h hVar3 = ((FamilyPlanManagementScreenContract$ModalStep.CancelInvitation) step).f103400a;
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar2 = bVar;
                                bVar2.l2(new p0(bVar2, hVar3, null, 6), new yi5.b(26));
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof dii.e) {
                                lha.k kVar = ((FamilyPlanManagementScreenContract$ModalStep.RemoveMember) step).f103403a;
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar3 = bVar;
                                bVar3.l2(new p0(bVar3, kVar, null, 7), new yi5.b(26));
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            actionsBottomSheetController.H = block;
            return actionsBottomSheetController;
        }
        if (!(step instanceof FamilyPlanManagementScreenContract$ModalStep.RemoveMember)) {
            if (!(step instanceof FamilyPlanManagementScreenContract$ModalStep.MemberSlotCancellationWarning)) {
                throw new NoWhenBranchMatchedException();
            }
            FamilyPlanManagementScreenContract$ModalStep.MemberSlotCancellationWarning memberSlotCancellationWarning = (FamilyPlanManagementScreenContract$ModalStep.MemberSlotCancellationWarning) step;
            lha.k kVar = memberSlotCancellationWarning.f103401a;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(memberSlotCancellationWarning.f103402b);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            int i3 = R$string.family_plans_management_remove_member_slot_cancellation_warning_title;
            String str2 = kVar.e;
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(i3, u.c(str2 != null ? str2 : ""), null, 12), new TextLocalisedClause(R$string.family_plans_management_remove_member_slot_cancellation_warning_description, u.c(j.b(c7.Companion, oi0.d.W(instantOfEpochMilli), new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), null, 12), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, GlyphImageTint.WARNING.f59933a, null, 4)), null, false, 24);
            aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.family_plans_management_remove_member_slot_cancellation_warning_action_keep_member, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.family_plans_management_remove_member_slot_cancellation_warning_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var2 = k9.Premium;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar2, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            m98.k block2 = new m98.k(bVar, 28);
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController2.H = block2;
            return actionsBottomSheetController2;
        }
        FamilyPlanManagementScreenContract$ModalStep.RemoveMember removeMember = (FamilyPlanManagementScreenContract$ModalStep.RemoveMember) step;
        lha.k kVar2 = removeMember.f103403a;
        boolean z = removeMember.f103404b;
        TextLocalisedClause textLocalisedClause3 = z ? new TextLocalisedClause(R$string.family_plans_management_remove_member_sheet_title, null, null, 14) : new TextLocalisedClause(R$string.family_plans_management_change_member_sheet_title, null, null, 14);
        if (z) {
            int i5 = R$string.family_plans_management_remove_member_sheet_subtitle;
            String str3 = kVar2.e;
            textLocalisedClause = new TextLocalisedClause(i5, u.c(str3 != null ? str3 : ""), null, 12);
        } else {
            int i6 = R$string.family_plans_management_change_member_bottom_sheet_subtitle;
            String str4 = kVar2.e;
            String str5 = str4 != null ? str4 : "";
            PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) ((mkk.e) ((j2) bVar.f103416w.f22677a).getValue()).f206479a.getContent();
            textLocalisedClause = new TextLocalisedClause(i6, v.k(str5, (pricingPlanSubscription == null || (dVar = pricingPlanSubscription.f81129a) == null) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : dok.g.d(dVar, null)), null, 12);
        }
        lw0.a aVar3 = new lw0.a(textLocalisedClause3, textLocalisedClause, null, null, false, 28);
        aw0.h hVar4 = new aw0.h(false, new n6(z ? new TextLocalisedClause(R$string.family_plans_management_remove_member_sheet_remove_cta, null, null, 14) : new TextLocalisedClause(R$string.family_plans_management_remove_member_bottom_sheet_remove_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.family_plans_management_remove_member_sheet_go_back_cta, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var3 = k9.Premium;
        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar3, hVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
        final int i21 = 1;
        Function1 block3 = new Function1() { // from class: mkk.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                dii.g result = (dii.g) obj4;
                switch (i21) {
                    case 0:
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof dii.e) {
                            lha.h hVar32 = ((FamilyPlanManagementScreenContract$ModalStep.CancelInvitation) step).f103400a;
                            com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar2 = bVar;
                            bVar2.l2(new p0(bVar2, hVar32, null, 6), new yi5.b(26));
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof dii.e) {
                            lha.k kVar3 = ((FamilyPlanManagementScreenContract$ModalStep.RemoveMember) step).f103403a;
                            com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar3 = bVar;
                            bVar3.l2(new p0(bVar3, kVar3, null, 7), new yi5.b(26));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetController3.H = block3;
        return actionsBottomSheetController3;
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.a aVar = (com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.a) this.f203426b;
        l FlowCoordinator = (l) obj2;
        JuniorAddPhoneNumberFlowContract$Step step = (JuniorAddPhoneNumberFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof JuniorAddPhoneNumberFlowContract$Step.ContactPicker) {
            JuniorAddPhoneNumberFlowContract$Step.ContactPicker contactPicker = (JuniorAddPhoneNumberFlowContract$Step.ContactPicker) step;
            JuniorContactPickerScreen juniorContactPickerScreen = new JuniorContactPickerScreen(new JuniorContactPickerScreenContract$InputData(contactPicker.f77176a, contactPicker.f77177b));
            final int i = 0;
            Function1 block = new Function1() { // from class: ml8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            wl8.h result = (wl8.h) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C2(new em8.a(result.f298449a));
                            return Unit.f186387a;
                        default:
                            f result2 = (f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.C2(new em8.a(result2.f280905a));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            juniorContactPickerScreen.H = block;
            return juniorContactPickerScreen;
        }
        if (!(step instanceof JuniorAddPhoneNumberFlowContract$Step.AddPhoneNumber)) {
            throw new NoWhenBranchMatchedException();
        }
        JuniorAddPhoneNumberFlowContract$Step.AddPhoneNumber addPhoneNumber = (JuniorAddPhoneNumberFlowContract$Step.AddPhoneNumber) step;
        JuniorAddPhoneNumberScreen juniorAddPhoneNumberScreen = new JuniorAddPhoneNumberScreen(new JuniorAddPhoneNumberScreenContract$InputData(addPhoneNumber.f77174a, addPhoneNumber.f77175b));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: ml8.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        wl8.h result = (wl8.h) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.C2(new em8.a(result.f298449a));
                        return Unit.f186387a;
                    default:
                        f result2 = (f) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (result2 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.C2(new em8.a(result2.f280905a));
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        juniorAddPhoneNumberScreen.H = block2;
        return juniorAddPhoneNumberScreen;
    }

    private final Object d(Object obj2, Object obj3) {
        mm1.c cVar = (mm1.c) this.f203426b;
        mm1.d params = (mm1.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        cVar.getClass();
        r rVarFromCallable = r.fromCallable(new t(cVar, params, 3));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable.map(new b0(new y(params, 9), 7));
    }

    private final Object e(Object obj2, Object obj3) {
        final com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar = (com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b) this.f203426b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        IndiaNetBankingFlowContract$Step step = (IndiaNetBankingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, IndiaNetBankingFlowContract$Step.NetBankingApplications.f72927a)) {
            IndiaNetBankingFlowContract$InputData indiaNetBankingFlowContract$InputData = bVar.o;
            IndiaNetBankingInstitutionsScreen indiaNetBankingInstitutionsScreen = new IndiaNetBankingInstitutionsScreen(new nm6.f(indiaNetBankingFlowContract$InputData.f72924a, indiaNetBankingFlowContract$InputData.f72925b, indiaNetBankingFlowContract$InputData.d));
            final int i = 0;
            Function1 block = new Function1() { // from class: mm6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            nm6.h result = (nm6.h) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar2 = bVar;
                            bVar2.l2(new p0(bVar2, result, null, 14), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            pm6.e result2 = (pm6.e) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof pm6.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar3 = bVar;
                            if (bVar3.o.f72925b != null) {
                                bVar3.C2(d0.J(((pm6.d) result2).f237480a, "success=true", false) ? z.f296697a : we6.y.f296693a);
                                oki.h.D2(bVar3.f72933t);
                            } else {
                                bVar3.f72929p.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.IndiaNetBankingPayload(d0.J(((pm6.d) result2).f237480a, "success=true", false))))));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            indiaNetBankingInstitutionsScreen.H = block;
            return indiaNetBankingInstitutionsScreen;
        }
        if (!(step instanceof IndiaNetBankingFlowContract$Step.NetBankingWebView)) {
            throw new NoWhenBranchMatchedException();
        }
        IndiaNetBankingWebViewScreen indiaNetBankingWebViewScreen = new IndiaNetBankingWebViewScreen(new pm6.c(((IndiaNetBankingFlowContract$Step.NetBankingWebView) step).f72928a));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: mm6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        nm6.h result = (nm6.h) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!(result instanceof g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar2 = bVar;
                        bVar2.l2(new p0(bVar2, result, null, 14), new yi5.b(26));
                        return Unit.f186387a;
                    default:
                        pm6.e result2 = (pm6.e) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!(result2 instanceof pm6.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar3 = bVar;
                        if (bVar3.o.f72925b != null) {
                            bVar3.C2(d0.J(((pm6.d) result2).f237480a, "success=true", false) ? z.f296697a : we6.y.f296693a);
                            oki.h.D2(bVar3.f72933t);
                        } else {
                            bVar3.f72929p.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.IndiaNetBankingPayload(d0.J(((pm6.d) result2).f237480a, "success=true", false))))));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        indiaNetBankingWebViewScreen.H = block2;
        return indiaNetBankingWebViewScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.profile.impl.ui.close_account.c cVar = (com.revolut.feature.profile.impl.ui.close_account.c) this.f203426b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        SelfTerminationFlowContract$Step step = (SelfTerminationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SelfTerminationFlowContract$Step.Intro)) {
            if (!(step instanceof SelfTerminationFlowContract$Step.PlanOffer)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = cVar.e1(new s(((SelfTerminationFlowContract$Step.PlanOffer) step).f81356a));
            mma.c block = new mma.c(cVar, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        boolean z = ((SelfTerminationFlowContract$Step.Intro) step).f81355a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.intro_prompt_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(z ? com.revolut.feature.profile.impl.R$string.intro_prompt_subtitle_paid_plan : com.revolut.feature.profile.impl.R$string.intro_prompt_subtitle_standard_plan, null, null, 14);
        PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30), null);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        String str = null;
        String str2 = "SELF_TERMINATION_INTRO_PROMPT";
        PromptMarketingContentDelegate.Model.BackgroundType backgroundType = null;
        pd pdVar = null;
        ld ldVar = null;
        kd kdVar = null;
        id idVar = null;
        PromptMarketingContentDelegate.Model.Footer footer = null;
        Parcelable parcelable = null;
        String str3 = null;
        String str4 = null;
        Clause clause = null;
        PromptMarketingContentDelegate.Model.AnimationType animationType = null;
        AnimationRequest animationRequest = null;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model(str2, textLocalisedClause, textLocalisedClause2, mediaContent, backgroundType, pdVar, resourceImage, ldVar, kdVar, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(z ? com.revolut.feature.profile.impl.R$string.intro_prompt_action_downgrade : com.revolut.feature.profile.impl.R$string.intro_prompt_action_keep_account_open, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.intro_prompt_action_close_account, null, null, 14), (ResourceImage) (0 == true ? 1 : 0), (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, str, 54), idVar, footer, str, parcelable, str3, str4, clause, animationType, animationRequest, null, 2095536), null, false, false, null, 30));
        l3d.f block2 = new l3d.f(cVar, z, 6);
        Intrinsics.checkNotNullParameter(block2, "block");
        promptMarketingScreen.H = block2;
        return promptMarketingScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        mmc.d dVar = (mmc.d) this.f203426b;
        l FlowCoordinator = (l) obj2;
        MigratePortfolioSpareChangeFlowContract$Step it8 = (MigratePortfolioSpareChangeFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        ViewController viewControllerE1 = dVar.e1(new bwh.a(dVar.o.f207189b, yvh.h.WEALTH_PORTFOLIO));
        mk5.s block = new mk5.s(dVar, FlowCoordinator, 14);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object i(Object obj2, Object obj3) {
        final com.revolut.feature.profile.impl.ui.profile.a aVar = (com.revolut.feature.profile.impl.ui.profile.a) this.f203426b;
        l FlowCoordinator = (l) obj2;
        ProfileFlowContract$Step step = (ProfileFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, ProfileFlowContract$Step.ProfileMain.f81428a)) {
            ProfileScreen profileScreen = new ProfileScreen();
            final int i = 0;
            Function1 function1 = new Function1() { // from class: mna.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep notificationSettings;
                    switch (i) {
                        case 0:
                            yna.b0 output = (yna.b0) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zEquals = output.f315303a.equals(ProfileFlowContract$Step.Account.f81423a);
                            com.revolut.feature.profile.impl.ui.profile.a aVar2 = aVar;
                            if (zEquals) {
                                aVar2.l2(new e(aVar2, null, 14), new yi5.b(26));
                            }
                            oki.h.t2(aVar2, aVar2.f81432p, output.f315303a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            rna.f result = (rna.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!Intrinsics.f(result, f.a.f255537a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.profile.impl.ui.profile.a aVar3 = aVar;
                            oki.h.t2(aVar3, aVar3.f81432p, ProfileFlowContract$Step.ThemeCustomisation.f81431a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            d result2 = (d) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.profile.impl.ui.profile.a aVar4 = aVar;
                            oki.h.t2(aVar4, aVar4.f81432p, new ProfileFlowContract$Step.NotificationSettingDetails(result2.f25503a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            wna.e output2 = (wna.e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (output2 instanceof e.a) {
                                notificationSettings = ProfileFlowContract$Step.AboutUs.f81422a;
                            } else if (output2 instanceof e.b) {
                                notificationSettings = ProfileFlowContract$Step.AppSettings.f81424a;
                            } else if (output2 instanceof e.d) {
                                notificationSettings = new ProfileFlowContract$Step.NotificationSettings(new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notifications_title, null, null, 14));
                            } else if (output2 instanceof e.c) {
                                notificationSettings = ProfileFlowContract$Step.AutoEarnRewards.f81425a;
                            } else {
                                if (!(output2 instanceof e.C1651e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                notificationSettings = ProfileFlowContract$Step.PublicExperiments.f81429a;
                            }
                            FlowStep flowStep = notificationSettings;
                            com.revolut.feature.profile.impl.ui.profile.a aVar5 = aVar;
                            oki.h.t2(aVar5, aVar5.f81432p, flowStep, true, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            profileScreen.H = function1;
            return profileScreen;
        }
        if (Intrinsics.f(step, ProfileFlowContract$Step.Account.f81423a)) {
            return new ProfileAccountScreen();
        }
        if (Intrinsics.f(step, ProfileFlowContract$Step.AppSettings.f81424a)) {
            AppSettingsController appSettingsController = new AppSettingsController();
            final int i2 = 1;
            Function1 block = new Function1() { // from class: mna.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep notificationSettings;
                    switch (i2) {
                        case 0:
                            yna.b0 output = (yna.b0) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zEquals = output.f315303a.equals(ProfileFlowContract$Step.Account.f81423a);
                            com.revolut.feature.profile.impl.ui.profile.a aVar2 = aVar;
                            if (zEquals) {
                                aVar2.l2(new mci.e(aVar2, null, 14), new yi5.b(26));
                            }
                            oki.h.t2(aVar2, aVar2.f81432p, output.f315303a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            rna.f result = (rna.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!Intrinsics.f(result, f.a.f255537a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.profile.impl.ui.profile.a aVar3 = aVar;
                            oki.h.t2(aVar3, aVar3.f81432p, ProfileFlowContract$Step.ThemeCustomisation.f81431a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            d result2 = (d) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.profile.impl.ui.profile.a aVar4 = aVar;
                            oki.h.t2(aVar4, aVar4.f81432p, new ProfileFlowContract$Step.NotificationSettingDetails(result2.f25503a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            wna.e output2 = (wna.e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (output2 instanceof e.a) {
                                notificationSettings = ProfileFlowContract$Step.AboutUs.f81422a;
                            } else if (output2 instanceof e.b) {
                                notificationSettings = ProfileFlowContract$Step.AppSettings.f81424a;
                            } else if (output2 instanceof e.d) {
                                notificationSettings = new ProfileFlowContract$Step.NotificationSettings(new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notifications_title, null, null, 14));
                            } else if (output2 instanceof e.c) {
                                notificationSettings = ProfileFlowContract$Step.AutoEarnRewards.f81425a;
                            } else {
                                if (!(output2 instanceof e.C1651e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                notificationSettings = ProfileFlowContract$Step.PublicExperiments.f81429a;
                            }
                            FlowStep flowStep = notificationSettings;
                            com.revolut.feature.profile.impl.ui.profile.a aVar5 = aVar;
                            oki.h.t2(aVar5, aVar5.f81432p, flowStep, true, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            appSettingsController.H = block;
            return appSettingsController;
        }
        if (Intrinsics.f(step, ProfileFlowContract$Step.AutoEarnRewards.f81425a)) {
            return new AutoEarnRewardsController();
        }
        if (Intrinsics.f(step, ProfileFlowContract$Step.ThemeCustomisation.f81431a)) {
            em2.b.Companion.getClass();
            return aVar.e1(new cm2.h(null, em2.a.a(), null));
        }
        if (Intrinsics.f(step, ProfileFlowContract$Step.AboutUs.f81422a)) {
            return new AboutUsScreen();
        }
        if (Intrinsics.f(step, ProfileFlowContract$Step.PublicExperiments.f81429a)) {
            return new PublicExperimentsScreen();
        }
        if (step instanceof ProfileFlowContract$Step.NotificationSettings) {
            NotificationCategoriesViewController notificationCategoriesViewController = new NotificationCategoriesViewController(new NotificationCategoriesContract$InputData(((ProfileFlowContract$Step.NotificationSettings) step).f81427a));
            final int i3 = 2;
            Function1 block2 = new Function1() { // from class: mna.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    FlowStep notificationSettings;
                    switch (i3) {
                        case 0:
                            yna.b0 output = (yna.b0) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zEquals = output.f315303a.equals(ProfileFlowContract$Step.Account.f81423a);
                            com.revolut.feature.profile.impl.ui.profile.a aVar2 = aVar;
                            if (zEquals) {
                                aVar2.l2(new mci.e(aVar2, null, 14), new yi5.b(26));
                            }
                            oki.h.t2(aVar2, aVar2.f81432p, output.f315303a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            rna.f result = (rna.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!Intrinsics.f(result, f.a.f255537a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.profile.impl.ui.profile.a aVar3 = aVar;
                            oki.h.t2(aVar3, aVar3.f81432p, ProfileFlowContract$Step.ThemeCustomisation.f81431a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            d result2 = (d) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.profile.impl.ui.profile.a aVar4 = aVar;
                            oki.h.t2(aVar4, aVar4.f81432p, new ProfileFlowContract$Step.NotificationSettingDetails(result2.f25503a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            wna.e output2 = (wna.e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (output2 instanceof e.a) {
                                notificationSettings = ProfileFlowContract$Step.AboutUs.f81422a;
                            } else if (output2 instanceof e.b) {
                                notificationSettings = ProfileFlowContract$Step.AppSettings.f81424a;
                            } else if (output2 instanceof e.d) {
                                notificationSettings = new ProfileFlowContract$Step.NotificationSettings(new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notifications_title, null, null, 14));
                            } else if (output2 instanceof e.c) {
                                notificationSettings = ProfileFlowContract$Step.AutoEarnRewards.f81425a;
                            } else {
                                if (!(output2 instanceof e.C1651e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                notificationSettings = ProfileFlowContract$Step.PublicExperiments.f81429a;
                            }
                            FlowStep flowStep = notificationSettings;
                            com.revolut.feature.profile.impl.ui.profile.a aVar5 = aVar;
                            oki.h.t2(aVar5, aVar5.f81432p, flowStep, true, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            notificationCategoriesViewController.H = block2;
            return notificationCategoriesViewController;
        }
        if (step instanceof ProfileFlowContract$Step.NotificationSettingDetails) {
            return new NotificationSettingDetailsViewController(new NotificationSettingDetailsContract$InputData(((ProfileFlowContract$Step.NotificationSettingDetails) step).f81426a));
        }
        if (!Intrinsics.f(step, ProfileFlowContract$Step.Settings.f81430a)) {
            throw new NoWhenBranchMatchedException();
        }
        GeneralSettingsScreen generalSettingsScreen = new GeneralSettingsScreen();
        final int i5 = 3;
        Function1 block3 = new Function1() { // from class: mna.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                FlowStep notificationSettings;
                switch (i5) {
                    case 0:
                        yna.b0 output = (yna.b0) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean zEquals = output.f315303a.equals(ProfileFlowContract$Step.Account.f81423a);
                        com.revolut.feature.profile.impl.ui.profile.a aVar2 = aVar;
                        if (zEquals) {
                            aVar2.l2(new mci.e(aVar2, null, 14), new yi5.b(26));
                        }
                        oki.h.t2(aVar2, aVar2.f81432p, output.f315303a, true, null, false, 12);
                        return Unit.f186387a;
                    case 1:
                        rna.f result = (rna.f) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!Intrinsics.f(result, f.a.f255537a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.profile.impl.ui.profile.a aVar3 = aVar;
                        oki.h.t2(aVar3, aVar3.f81432p, ProfileFlowContract$Step.ThemeCustomisation.f81431a, true, null, false, 12);
                        return Unit.f186387a;
                    case 2:
                        d result2 = (d) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (result2 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.profile.impl.ui.profile.a aVar4 = aVar;
                        oki.h.t2(aVar4, aVar4.f81432p, new ProfileFlowContract$Step.NotificationSettingDetails(result2.f25503a), true, null, false, 12);
                        return Unit.f186387a;
                    default:
                        wna.e output2 = (wna.e) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (output2 instanceof e.a) {
                            notificationSettings = ProfileFlowContract$Step.AboutUs.f81422a;
                        } else if (output2 instanceof e.b) {
                            notificationSettings = ProfileFlowContract$Step.AppSettings.f81424a;
                        } else if (output2 instanceof e.d) {
                            notificationSettings = new ProfileFlowContract$Step.NotificationSettings(new TextLocalisedClause(com.revolut.feature.profile.impl.R$string.profile_notifications_title, null, null, 14));
                        } else if (output2 instanceof e.c) {
                            notificationSettings = ProfileFlowContract$Step.AutoEarnRewards.f81425a;
                        } else {
                            if (!(output2 instanceof e.C1651e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            notificationSettings = ProfileFlowContract$Step.PublicExperiments.f81429a;
                        }
                        FlowStep flowStep = notificationSettings;
                        com.revolut.feature.profile.impl.ui.profile.a aVar5 = aVar;
                        oki.h.t2(aVar5, aVar5.f81432p, flowStep, true, null, false, 12);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        generalSettingsScreen.H = block3;
        return generalSettingsScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object obj4;
        boolean zBooleanValue;
        ViewController bigTileOfferContentScreen;
        Object obj5;
        Object obj6;
        CdnImage cdnImageQ2;
        boolean z;
        int i = this.f203425a;
        int i2 = 20;
        int i3 = 16;
        boolean z3 = true;
        z3 = true;
        Double d = null;
        Clause clause = null;
        mv3.k kVar = null;
        Object obj7 = this.f203426b;
        switch (i) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.a) obj7;
                CreditInsuranceOfferFlowContract$Step step = (CreditInsuranceOfferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CreditInsuranceOfferFlowContract$Step.Insurance)) {
                    throw new NoWhenBranchMatchedException();
                }
                InsuranceScreen insuranceScreen = new InsuranceScreen(new InsuranceScreenContract$InputData(aVar.f67402p.f67400a));
                m11.h block = new m11.h(aVar, 25);
                Intrinsics.checkNotNullParameter(block, "block");
                insuranceScreen.H = block;
                return insuranceScreen;
            case 1:
                final com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e) obj7;
                OutstandingDebtsV3FlowContract$InputData outstandingDebtsV3FlowContract$InputData = eVar.f67518p;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                OutstandingDebtsV3FlowContract$Step step2 = (OutstandingDebtsV3FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof OutstandingDebtsV3FlowContract$Step.Intro) {
                    CreditPromptFlow creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(((OutstandingDebtsV3FlowContract$Step.Intro) step2).f67514a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_v3_intro_title, com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_v3_intro_description, com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_v3_intro_primary_button, com.revolut.feature.credit.core.R$string.credit_application_outstanding_debts_v3_intro_secondary_button), outstandingDebtsV3FlowContract$InputData.f67510a));
                    m11.h block2 = new m11.h(eVar, 29);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    creditPromptFlow.H = block2;
                    return creditPromptFlow;
                }
                if (step2 instanceof OutstandingDebtsV3FlowContract$Step.DebtsHub) {
                    DebtsV3HubController debtsV3HubController = new DebtsV3HubController(new DebtsV3HubControllerContract$InputData(outstandingDebtsV3FlowContract$InputData.f67510a.f66892b, ((OutstandingDebtsV3FlowContract$Step.DebtsHub) step2).f67513a));
                    Function1 block3 = new Function1() { // from class: m94.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i) {
                                case 0:
                                    i output = (i) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof n94.f;
                                    com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e eVar2 = eVar;
                                    if (z4) {
                                        c84.t.J2(eVar2, false, null, null, 7);
                                    } else {
                                        boolean z6 = output instanceof n94.e;
                                        yki.b bVar = LazyFlowCoordinator;
                                        if (z6) {
                                            oki.h.w2(bVar, OutstandingDebtsV3FlowContract$Step.TypeSelector.f67515a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else if (output instanceof n94.h) {
                                            n94.h hVar = (n94.h) output;
                                            oki.h.w2(bVar, new OutstandingDebtsV3FlowContract$Step.DebtDetails(hVar.f213569a, hVar.f213570b), ModalDestination.Style.POPUP.f98311a);
                                        } else {
                                            if (!(output instanceof n94.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar2.n2(new e(eVar2, null, 0), new whi.b(6));
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    j94.h output2 = (j94.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(eVar, LazyFlowCoordinator, new OutstandingDebtsV3FlowContract$Step.DebtsHub(output2.f172281a), false, TransitionAnimation.NONE.f98393a, false, 8);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    debtsV3HubController.H = block3;
                    obj4 = debtsV3HubController;
                } else {
                    if (step2 instanceof OutstandingDebtsV3FlowContract$Step.TypeSelector) {
                        my3.h hVar = eVar.f67520r;
                        if (hVar == null) {
                            Intrinsics.r("flowConfiguration");
                            throw null;
                        }
                        DebtTypeSelectorController debtTypeSelectorController = new DebtTypeSelectorController(new DebtTypeSelectorControllerContract$InputData(hVar.f210317c));
                        dph.c block4 = new dph.c(eVar, LazyFlowCoordinator, 17);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        debtTypeSelectorController.H = block4;
                        return debtTypeSelectorController;
                    }
                    if (!(step2 instanceof OutstandingDebtsV3FlowContract$Step.DebtDetails)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OutstandingDebtsV3FlowContract$Step.DebtDetails debtDetails = (OutstandingDebtsV3FlowContract$Step.DebtDetails) step2;
                    DebtDetailsController debtDetailsController = new DebtDetailsController(new DebtDetailsControllerContract$InputData(outstandingDebtsV3FlowContract$InputData.f67510a.f66892b, debtDetails.f67511a, debtDetails.f67512b));
                    final int i5 = 1;
                    Function1 block5 = new Function1() { // from class: m94.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i5) {
                                case 0:
                                    i output = (i) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof n94.f;
                                    com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow.e eVar2 = eVar;
                                    if (z4) {
                                        c84.t.J2(eVar2, false, null, null, 7);
                                    } else {
                                        boolean z6 = output instanceof n94.e;
                                        yki.b bVar = LazyFlowCoordinator;
                                        if (z6) {
                                            oki.h.w2(bVar, OutstandingDebtsV3FlowContract$Step.TypeSelector.f67515a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else if (output instanceof n94.h) {
                                            n94.h hVar2 = (n94.h) output;
                                            oki.h.w2(bVar, new OutstandingDebtsV3FlowContract$Step.DebtDetails(hVar2.f213569a, hVar2.f213570b), ModalDestination.Style.POPUP.f98311a);
                                        } else {
                                            if (!(output instanceof n94.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar2.n2(new e(eVar2, null, 0), new whi.b(6));
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    j94.h output2 = (j94.h) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(eVar, LazyFlowCoordinator, new OutstandingDebtsV3FlowContract$Step.DebtsHub(output2.f172281a), false, TransitionAnimation.NONE.f98393a, false, 8);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    debtDetailsController.H = block5;
                    obj4 = debtDetailsController;
                }
                return obj4;
            case 2:
                final com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar2 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) obj7;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoHoldingScreenContract$ModalStep step3 = (CryptoHoldingScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.StakeRisksDisclaimerDialog) {
                    return aVar2.e1(new nc5.g(((CryptoHoldingScreenContract$ModalStep.StakeRisksDisclaimerDialog) step3).f100005a));
                }
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.TiersRateDialog) {
                    return aVar2.f100016x.a(((CryptoHoldingScreenContract$ModalStep.TiersRateDialog) step3).f100007a);
                }
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.StakingRewardsDialog) {
                    return aVar2.e1(new nc5.f(((CryptoHoldingScreenContract$ModalStep.StakingRewardsDialog) step3).f100006a));
                }
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.AutoStakingDisableConfirmationDialog) {
                    ViewController viewControllerE1 = aVar2.e1(new nc5.d(((CryptoHoldingScreenContract$ModalStep.AutoStakingDisableConfirmationDialog) step3).f99999a));
                    m98.k block6 = new m98.k(aVar2, 1);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE1.H = block6;
                    return viewControllerE1;
                }
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.EarningScreen) {
                    return new CryptoEarningScreen(((CryptoHoldingScreenContract$ModalStep.EarningScreen) step3).f100001a);
                }
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.BalanceBreakdown) {
                    final ViewController viewControllerE12 = aVar2.e1(new fh5.a(new CryptoBalanceBreakdownInputData(((CryptoHoldingScreenContract$ModalStep.BalanceBreakdown) step3).f100000a, false)));
                    Function1 block7 = new Function1() { // from class: m9j.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i) {
                                case 0:
                                    fh5.d output = (fh5.d) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    viewControllerE12.k2(new ltf.b(aVar2, output, 24));
                                    break;
                                default:
                                    og5.d output2 = (og5.d) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    viewControllerE12.k2(new ltf.b(aVar2, output2, 23));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewControllerE12.H = block7;
                    return viewControllerE12;
                }
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.GiftAssetTransferInfo) {
                    CryptoHoldingScreenContract$ModalStep.GiftAssetTransferInfo giftAssetTransferInfo = (CryptoHoldingScreenContract$ModalStep.GiftAssetTransferInfo) step3;
                    final ViewController viewControllerE13 = aVar2.e1(new og5.a(new CryptoGiftAssetTransferInfoInputData(giftAssetTransferInfo.f100002a, giftAssetTransferInfo.f100003b)));
                    final int i6 = 1;
                    Function1 block8 = new Function1() { // from class: m9j.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i6) {
                                case 0:
                                    fh5.d output = (fh5.d) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    viewControllerE13.k2(new ltf.b(aVar2, output, 24));
                                    break;
                                default:
                                    og5.d output2 = (og5.d) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    viewControllerE13.k2(new ltf.b(aVar2, output2, 23));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    viewControllerE13.H = block8;
                    return viewControllerE13;
                }
                if (step3 instanceof CryptoHoldingScreenContract$ModalStep.RevXOrdersBreakdown) {
                    xi0.a aVar3 = xi0.b.Companion;
                    String str = ((CryptoHoldingScreenContract$ModalStep.RevXOrdersBreakdown) step3).f100004a;
                    aVar3.getClass();
                    return aVar2.e1(new t4c.c(xi0.a.a(str)));
                }
                if (!Intrinsics.f(step3, CryptoHoldingScreenContract$ModalStep.AutoEarnInfoDialog.f99998a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.f100015w.getClass();
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.crypto.asset_details.api.R$string.crypto_asset_details_section_investment_holding_auto_earn, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.crypto.asset_details.api.R$string.crypto_asset_details_section_investment_holding_auto_earn_info_description, null, null, 14), null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar4, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 3:
                m9l.g gVar = (m9l.g) obj7;
                m9l.g gVar2 = (m9l.g) obj3;
                Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                n9l.a aVar5 = gVar.f203839a;
                Double d5 = gVar.f203840b;
                if (d5 != null) {
                    d = d5;
                } else if (gVar2 != null) {
                    d = gVar2.f203840b;
                }
                return new m9l.g(aVar5, d);
            case 4:
                com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar6 = (com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a) obj7;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AddPayIdScreenContract$ModalStep step4 = (AddPayIdScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof AddPayIdScreenContract$ModalStep.ChooseAlias)) {
                    throw new NoWhenBranchMatchedException();
                }
                AliasesScreen aliasesScreen = new AliasesScreen(new oa2.f(((ma2.e) ((j2) aVar6.f62723r.f22677a).getValue()).f203922a));
                p block9 = new p(aVar6, 2);
                Intrinsics.checkNotNullParameter(block9, "block");
                aliasesScreen.H = block9;
                return aliasesScreen;
            case 5:
                final com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a) obj7;
                AddEvidenceFlowContract$InputData addEvidenceFlowContract$InputData = aVar7.f67700p;
                final l FlowCoordinator = (l) obj2;
                AddEvidenceFlowContract$Step step5 = (AddEvidenceFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof AddEvidenceFlowContract$Step.EvidenceTypeSelection) {
                    AddEvidenceFlowContract$Step.EvidenceTypeSelection evidenceTypeSelection = (AddEvidenceFlowContract$Step.EvidenceTypeSelection) step5;
                    EvidenceTypeSelectionScreen evidenceTypeSelectionScreen = new EvidenceTypeSelectionScreen(new EvidenceTypeSelectionScreenContract$InputData(evidenceTypeSelection.f67692a, evidenceTypeSelection.f67693b, addEvidenceFlowContract$InputData.f67690b));
                    Function1 block10 = new Function1() { // from class: mb4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i) {
                                case 0:
                                    ob4.i outputData = (ob4.i) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z4 = outputData instanceof ob4.g;
                                    com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar8 = aVar7;
                                    l lVar = FlowCoordinator;
                                    if (z4) {
                                        oki.h.t2(aVar8, lVar, new AddEvidenceFlowContract$Step.RevolutTransactionsSelection(((ob4.g) outputData).f223880a), true, null, false, 12);
                                    } else if (outputData instanceof ob4.h) {
                                        aVar8.I2(((ob4.h) outputData).f223881a);
                                    } else {
                                        if (!(outputData instanceof ob4.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ob4.f fVar = (ob4.f) outputData;
                                        oki.h.t2(aVar8, lVar, new AddEvidenceFlowContract$Step.LinkExternalAccount(fVar.f223877a, fVar.f223878b, fVar.f223879c), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    kb4.d outputData2 = (kb4.d) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar7, FlowCoordinator, new AddEvidenceFlowContract$Step.EvidenceTypeSelection(zv3.a.BACK, outputData2.f182518a), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    evidenceTypeSelectionScreen.H = block10;
                    return evidenceTypeSelectionScreen;
                }
                if (step5 instanceof AddEvidenceFlowContract$Step.RevolutTransactionsSelection) {
                    RevolutTransactionsSelectionScreen revolutTransactionsSelectionScreen = new RevolutTransactionsSelectionScreen(new RevolutTransactionsSelectionScreenContract$InputData(((AddEvidenceFlowContract$Step.RevolutTransactionsSelection) step5).f67699a));
                    baa.c block11 = new baa.c(aVar7, FlowCoordinator, 15);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    revolutTransactionsSelectionScreen.H = block11;
                    return revolutTransactionsSelectionScreen;
                }
                if (step5 instanceof AddEvidenceFlowContract$Step.LinkExternalAccount) {
                    ViewController viewControllerE14 = aVar7.e1(new com.revolut.feature.external_accounts.api.navigation.c(((AddEvidenceFlowContract$Step.LinkExternalAccount) step5).f67694a, null));
                    n block12 = new n(aVar7, 24, FlowCoordinator, step5);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE14.H = block12;
                    return viewControllerE14;
                }
                if (!(step5 instanceof AddEvidenceFlowContract$Step.MissingBank)) {
                    if (!(step5 instanceof AddEvidenceFlowContract$Step.EvidenceCategorySelection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EvidenceCategorySelectionScreen evidenceCategorySelectionScreen = new EvidenceCategorySelectionScreen(new EvidenceCategorySelectionScreenContract$InputData(((AddEvidenceFlowContract$Step.EvidenceCategorySelection) step5).f67691a));
                    final int i21 = 1;
                    Function1 block13 = new Function1() { // from class: mb4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i21) {
                                case 0:
                                    ob4.i outputData = (ob4.i) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z4 = outputData instanceof ob4.g;
                                    com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar8 = aVar7;
                                    l lVar = FlowCoordinator;
                                    if (z4) {
                                        oki.h.t2(aVar8, lVar, new AddEvidenceFlowContract$Step.RevolutTransactionsSelection(((ob4.g) outputData).f223880a), true, null, false, 12);
                                    } else if (outputData instanceof ob4.h) {
                                        aVar8.I2(((ob4.h) outputData).f223881a);
                                    } else {
                                        if (!(outputData instanceof ob4.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ob4.f fVar = (ob4.f) outputData;
                                        oki.h.t2(aVar8, lVar, new AddEvidenceFlowContract$Step.LinkExternalAccount(fVar.f223877a, fVar.f223878b, fVar.f223879c), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    kb4.d outputData2 = (kb4.d) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar7, FlowCoordinator, new AddEvidenceFlowContract$Step.EvidenceTypeSelection(zv3.a.BACK, outputData2.f182518a), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    evidenceCategorySelectionScreen.H = block13;
                    return evidenceCategorySelectionScreen;
                }
                int i22 = com.revolut.feature.credit.core.R$string.financial_evidence_bank_selection_cant_link_popup_title_v2;
                xu3.f fVar = ((AddEvidenceFlowContract$Step.MissingBank) step5).f67697a;
                lw0.a aVar8 = new lw0.a(new TextLocalisedClause(i22, u.c(fVar.f308892a), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_bank_selection_cant_link_popup_description_v2, u.c(fVar.f308893b), null, 12), null, null, false, 28);
                m6 m6Var = n6.Companion;
                aw0.h hVar2 = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_bank_selection_cant_link_popup_action_manual_upload_v2, u.c(fVar.d), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.financial_evidence_bank_selection_cant_link_popup_action_close_v2, u.c(fVar.f308894c), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar8, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), new AnalyticsContext(v7.m(addEvidenceFlowContract$InputData.f67690b, AnalyticsContext.INSTANCE)), null, 16));
                ma2.s block14 = new ma2.s(aVar7, step5, 1);
                Intrinsics.checkNotNullParameter(block14, "block");
                actionsBottomSheetController.H = block14;
                return actionsBottomSheetController;
            case 6:
                com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar9 = (com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a) obj7;
                DonationsAcceptTermsFlowContract$Step step6 = (DonationsAcceptTermsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof DonationsAcceptTermsFlowContract$Step.AcceptTerms)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(((DonationsAcceptTermsFlowContract$Step.AcceptTerms) step6).f72013a);
                lrk.h block15 = new lrk.h(1, aVar9, com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a.class, "handleAcceptTermsPromptResult", "handleAcceptTermsPromptResult(Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$Output;)V", 0, 20);
                Intrinsics.checkNotNullParameter(block15, "block");
                promptMarketingScreen.H = block15;
                return promptMarketingScreen;
            case 7:
                com.revolut.feature.onboarding.impl.onboarding.pep.a aVar10 = (com.revolut.feature.onboarding.impl.onboarding.pep.a) obj7;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PoliticallyExposedPersonScreenContract$ModalStep step7 = (PoliticallyExposedPersonScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, PoliticallyExposedPersonScreenContract$ModalStep.PepConfirmationDialog.f78470a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar11 = new lw0.a(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_pep_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_pep_dialog_subtitle, u.c(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_pep_dialog_learn_more, null, new Click(30, (Integer) null, (Object) null, "PEP_FAQ_CLAUSE_ID", false), 10)), null, 12), new lw0.b(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null), null, false, 24);
                aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_pep_dialog_button_accept, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var3 = frl.a.k;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar11, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var3, k9Var3), null, null, 24));
                m98.k block16 = new m98.k(aVar10, 9);
                Intrinsics.checkNotNullParameter(block16, "block");
                actionsBottomSheetController2.H = block16;
                return actionsBottomSheetController2;
            case 8:
                com.revolut.feature_retail_user_declarations.gender.a aVar12 = (com.revolut.feature_retail_user_declarations.gender.a) obj7;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                GenderScreenContract$ModalStep step8 = (GenderScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, GenderScreenContract$ModalStep.InfoDialog.f97652a)) {
                    return new GenderInfoBottomSheetController(aVar12.o.f97649a);
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                com.revolut.feature_retail_user_declarations.terms_review.flow.a aVar13 = (com.revolut.feature_retail_user_declarations.terms_review.flow.a) obj7;
                qki.d dVar = aVar13.f97746q;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                TermsReviewFlowContract$Step step9 = (TermsReviewFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof TermsReviewFlowContract$Step.ReadTerms)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str2 = ((TermsReviewFlowContract$Step.ReadTerms) step9).f97744a;
                int i32 = com.revolut.feature.user_declarations.shared.R$string.terms_terms_review_continue_title;
                TermsReviewInputData termsReviewInputData = aVar13.o;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i32, v.k(Integer.valueOf(((TermsReviewFlowContract$State) ((j2) dVar.f22677a).getValue()).f97743a + 1), Integer.valueOf(termsReviewInputData.f97742c.size())), null, 12);
                rbl.a aVar14 = (((TermsReviewFlowContract$State) ((j2) dVar.f22677a).getValue()).f97743a <= 0 && !termsReviewInputData.d) ? rbl.a.NONE : rbl.a.BACK;
                ReadTermsController readTermsController = new ReadTermsController(new ReadTermsControllerContract$InputData(str2, textLocalisedClause, aVar14));
                ma2.s block17 = new ma2.s(aVar13, LazyFlowCoordinator2, 7);
                Intrinsics.checkNotNullParameter(block17, "block");
                readTermsController.H = block17;
                return readTermsController;
            case 10:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar15 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a) obj7;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EditCatalogueProductEntryScreenContract$ModalStep it8 = (EditCatalogueProductEntryScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, EditCatalogueProductEntryScreenContract$ModalStep.DeleteConfirmation.f60795a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController actionsBottomSheetControllerB = aVar15.f60797q.b();
                m98.k block18 = new m98.k(aVar15, 15);
                Intrinsics.checkNotNullParameter(block18, "block");
                actionsBottomSheetControllerB.H = block18;
                return actionsBottomSheetControllerB;
            case 11:
                InputTextDelegate.Model data = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = MoneyInputController.T;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText innerEditText = field.getInnerEditText();
                u80.d dVar2 = (u80.d) ((MoneyInputController) obj7).Q.getValue();
                Object obj8 = data.P;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(innerEditText, (xi0.b) obj8, dVar2, null, null, false, false, 0, false, null, 1912);
            case 12:
                String key = (String) obj2;
                List data2 = (List) obj3;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(data2, "data");
                ne0.d dVar3 = ((mei.g) obj7).f204692b;
                dVar3.remove("TEMPORARILY_CLOSED_TILES");
                dVar3.f(key, data2);
                return Unit.f186387a;
            case 13:
                PodNomineeEditScreen podNomineeEditScreen = (PodNomineeEditScreen) obj7;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                KProperty[] kPropertyArr2 = PodNomineeEditScreen.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                if (Intrinsics.f(model.f52580a, "INPUT_DOB_ID")) {
                    return new w(null, field2.getInnerEditText(), u.a.f324146a, new m98.k(podNomineeEditScreen, i3), 488);
                }
                return null;
            case 14:
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) obj7;
                OfferV2FlowContract$InputData offerV2FlowContract$InputData = gVar3.f68150p;
                OfferV2FlowContract$Step step10 = (OfferV2FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof OfferV2FlowContract$Step.Initial) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.b();
                }
                if (step10 instanceof OfferV2FlowContract$Step.AnimatedIntro) {
                    AnimatedIntroScreen animatedIntroScreen = new AnimatedIntroScreen(new AnimatedIntroScreenContract$InputData(((OfferV2FlowContract$Step.AnimatedIntro) step10).f68098a, offerV2FlowContract$InputData.f68090b));
                    mf4.b0 block19 = new mf4.b0(gVar3, 4);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    animatedIntroScreen.H = block19;
                    obj6 = animatedIntroScreen;
                } else if (step10 instanceof OfferV2FlowContract$Step.Prompt) {
                    CreditPromptFlow creditPromptFlow2 = new CreditPromptFlow(new CreditPromptFlowContract$InputData(((OfferV2FlowContract$Step.Prompt) step10).f68114a, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.offer_v2_intro_title, com.revolut.feature.credit.core.R$string.offer_v2_intro_description, com.revolut.feature.credit.core.R$string.offer_v2_intro_primary_button, com.revolut.feature.credit.core.R$string.offer_v2_intro_secondary_button), offerV2FlowContract$InputData.f68090b));
                    mf4.b0 block20 = new mf4.b0(gVar3, 2);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    creditPromptFlow2.H = block20;
                    obj6 = creditPromptFlow2;
                } else {
                    if (!(step10 instanceof OfferV2FlowContract$Step.SelectType)) {
                        if (step10 instanceof OfferV2FlowContract$Step.ProductArticle) {
                            OfferV2FlowContract$Step.ProductArticle productArticle = (OfferV2FlowContract$Step.ProductArticle) step10;
                            cv3.c cVar = productArticle.f68111a;
                            ProductArticleParams productArticleParams = productArticle.f68112b;
                            SkipShownArticleBehaviour skipShownArticleBehaviour = productArticle.f68113c;
                            k9 value = k9.Credit;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                            Intrinsics.checkNotNullParameter(value, "value");
                            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                            wi0.b bVar = offerV2FlowContract$InputData.f68090b.f;
                            CreditApplicationPluginFlowContract$Configuration f67400a = offerV2FlowContract$InputData.getF67796a();
                            CreditApplicationProductArticleContext creditApplicationProductArticleContextA = zr3.c.a(bVar, new d1(f67400a.d, f67400a.e, null), offerV2FlowContract$InputData.f68090b.f66893c);
                            companion2.getClass();
                            ViewController viewControllerE15 = gVar3.e1(new ProductArticleDescriptor(productArticleParams, skipShownArticleBehaviour, false, new AnalyticsProduct.Retail(value), new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationProductArticleContextA)), false, 32));
                            ma2.s block21 = new ma2.s(gVar3, cVar, 12);
                            Intrinsics.checkNotNullParameter(block21, "block");
                            viewControllerE15.H = block21;
                            return viewControllerE15;
                        }
                        if (step10 instanceof OfferV2FlowContract$Step.CreditToRefinance) {
                            cv3.d0 d0Var = ((OfferV2FlowContract$Step.CreditToRefinance) step10).f68104a;
                            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = offerV2FlowContract$InputData.f68090b;
                            OfferV2FlowContract$InputData.Config config = offerV2FlowContract$InputData.f68089a;
                            OfferV2FlowContract$InputData.Config.Intro intro = config instanceof OfferV2FlowContract$InputData.Config.Intro ? (OfferV2FlowContract$InputData.Config.Intro) config : null;
                            if ((intro != null ? intro.f68092a : null) != l0.CREDITS_TO_REFINANCE && gVar3.v.c()) {
                                z3 = false;
                            }
                            if (d0Var != null) {
                                List list = d0Var.e;
                                Long l2 = d0Var.f109249a;
                                if (l2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                long jLongValue = l2.longValue();
                                Long l3 = d0Var.f109250b;
                                if (l3 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                kVar = new mv3.k(list, jLongValue, l3.longValue(), d0Var.d);
                            }
                            CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = new CreditToRefinanceSelectionScreen(new CreditToRefinanceSelectionScreenContract$InputData(false, z3, kVar, creditApplicationPluginFlowContract$Configuration));
                            mf4.b0 block22 = new mf4.b0(gVar3, creditToRefinanceSelectionScreen);
                            Intrinsics.checkNotNullParameter(block22, "block");
                            creditToRefinanceSelectionScreen.H = block22;
                            obj5 = creditToRefinanceSelectionScreen;
                        } else {
                            if (step10 instanceof OfferV2FlowContract$Step.FinalOffer) {
                                int i33 = mf4.d0.d[((OfferV2FlowContract$Step.FinalOffer) step10).f68108a.ordinal()];
                                if (i33 == 1) {
                                    bigTileOfferContentScreen = new BigTileOfferContentScreen(new OfferContentScreenContract$InputData(offerV2FlowContract$InputData.f68090b, (cv3.s) null, (String) null, (Parcelable) null, (pf4.c) null, (zv3.a) null, 126));
                                } else if (i33 == 2) {
                                    bigTileOfferContentScreen = new TopItemOfferContentScreen(new OfferContentScreenContract$InputData(offerV2FlowContract$InputData.f68090b, (cv3.s) null, (String) null, (Parcelable) null, (pf4.c) null, (zv3.a) null, 126));
                                } else {
                                    if (i33 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bigTileOfferContentScreen = new RegularOfferContentScreen(new OfferContentScreenContract$InputData(offerV2FlowContract$InputData.f68090b, (cv3.s) null, (String) null, (Parcelable) null, (pf4.c) null, (zv3.a) null, 126));
                                }
                                ViewController viewController = bigTileOfferContentScreen;
                                mf4.b0 block23 = new mf4.b0(gVar3, i);
                                Intrinsics.checkNotNullParameter(block23, "block");
                                viewController.H = block23;
                                return viewController;
                            }
                            if (step10 instanceof OfferV2FlowContract$Step.Calculator) {
                                OfferV2FlowContract$Step.Calculator calculator = (OfferV2FlowContract$Step.Calculator) step10;
                                String str3 = calculator.f68099a;
                                Boolean bool = calculator.f68100b;
                                OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext = calculator.f68101c;
                                String strB = str3 == null ? cv3.y.EDIT_CALCULATOR.b() : str3;
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    OfferV2FlowContract$InputData.Config config2 = offerV2FlowContract$InputData.f68089a;
                                    OfferV2FlowContract$InputData.Config.Intro intro2 = config2 instanceof OfferV2FlowContract$InputData.Config.Intro ? (OfferV2FlowContract$InputData.Config.Intro) config2 : null;
                                    zBooleanValue = (intro2 != null ? intro2.f68092a : null) == l0.CALCULATOR ? 1 : 0;
                                }
                                CalculatorScreen calculatorScreen = new CalculatorScreen(new CalculatorScreenContract$InputData(strB, true, zBooleanValue, offerV2FlowContract$InputData.f68090b));
                                gVar3.a(calculatorScreen, new a83.z(gVar3, 6, offerV2FlowContract$OfferUpdateContext, str3));
                                return calculatorScreen;
                            }
                            if (step10 instanceof OfferV2FlowContract$Step.ChangeRepaymentDay) {
                                OfferV2FlowContract$Step.ChangeRepaymentDay changeRepaymentDay = (OfferV2FlowContract$Step.ChangeRepaymentDay) step10;
                                hu3.a aVar16 = changeRepaymentDay.f68102a;
                                OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext2 = changeRepaymentDay.f68103b;
                                ChangeRepaymentDayScreen changeRepaymentDayScreen = new ChangeRepaymentDayScreen(new ChangeRepaymentDayScreenContract$InputData(aVar16, offerV2FlowContract$InputData.f68090b));
                                n block24 = new n(gVar3, 27, offerV2FlowContract$OfferUpdateContext2, aVar16);
                                Intrinsics.checkNotNullParameter(block24, "block");
                                changeRepaymentDayScreen.H = block24;
                                return changeRepaymentDayScreen;
                            }
                            if (!(step10 instanceof OfferV2FlowContract$Step.Insurance)) {
                                if (!(step10 instanceof OfferV2FlowContract$Step.Document)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                OfferV2FlowContract$Step.Document document = (OfferV2FlowContract$Step.Document) step10;
                                return gVar3.f68154t.Z2(document.f68105a, document.f68106b, document.f68107c, document.d);
                            }
                            InsuranceScreen insuranceScreen2 = new InsuranceScreen(new InsuranceScreenContract$InputData(offerV2FlowContract$InputData.f68090b));
                            mf4.b0 block25 = new mf4.b0(gVar3, 5);
                            Intrinsics.checkNotNullParameter(block25, "block");
                            insuranceScreen2.H = block25;
                            obj5 = insuranceScreen2;
                        }
                        return obj5;
                    }
                    CreditOfferTypeSelectionScreen creditOfferTypeSelectionScreen = new CreditOfferTypeSelectionScreen(new CreditOfferTypeSelectionScreenContract$InputData(((OfferV2FlowContract$Step.SelectType) step10).f68115a, offerV2FlowContract$InputData.f68090b));
                    mf4.b0 block26 = new mf4.b0(gVar3, z3 ? 1 : 0);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    creditOfferTypeSelectionScreen.H = block26;
                    obj6 = creditOfferTypeSelectionScreen;
                }
                return obj6;
            case 15:
                final com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b) obj7;
                l FlowCoordinator2 = (l) obj2;
                EsimMobilePlanSubscriptionFlowContract$Step step11 = (EsimMobilePlanSubscriptionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.Subscription) {
                    EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen = new EsimMobilePlanDetailsScreen(new EsimMobilePlanDetailsScreenContract$InputData(bVar2.f100855r.f100827a));
                    final int i43 = 3;
                    Function1 block27 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i43) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block27, "block");
                    esimMobilePlanDetailsScreen.H = block27;
                    return esimMobilePlanDetailsScreen;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling) {
                    EsimMobilePlanBillingScreen esimMobilePlanBillingScreen = new EsimMobilePlanBillingScreen(new EsimMobilePlanBillingScreenContract$InputData(((EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling) step11).f100832a));
                    final int i59 = 5;
                    Function1 block28 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i59) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block28, "block");
                    esimMobilePlanBillingScreen.H = block28;
                    return esimMobilePlanBillingScreen;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments) {
                    return new EsimMobilePlanPaymentsScreen(new EsimMobilePlanPaymentsScreenContract$InputData(((EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments) step11).f100839a));
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices) {
                    return new EsimMobilePlanInvoicesScreen(new EsimMobilePlanInvoicesScreenContract$InputData(((EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices) step11).f100838a));
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation) {
                    EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation mobilePlanCancellation = (EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation) step11;
                    EsimMobilePlanCancellationFlow esimMobilePlanCancellationFlow = new EsimMobilePlanCancellationFlow(new EsimMobilePlanCancellationFlowContract$InputData(mobilePlanCancellation.f100833a, mobilePlanCancellation.f100834b, mobilePlanCancellation.f100835c, mobilePlanCancellation.d));
                    Function1 block29 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block29, "block");
                    esimMobilePlanCancellationFlow.H = block29;
                    return esimMobilePlanCancellationFlow;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout) {
                    EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout mobilePlanCheckout = (EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout) step11;
                    EsimGetPlanFlow esimGetPlanFlow = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.MobilePlanCheckout(mobilePlanCheckout.f100836a, mobilePlanCheckout.f100837b, null));
                    final int i66 = 4;
                    Function1 block30 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i66) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block30, "block");
                    esimGetPlanFlow.H = block30;
                    return esimGetPlanFlow;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation) {
                    EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation numberTransferConfirmation = (EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation) step11;
                    EsimMobilePlanNumberTransferConfirmationOrchestratorFlow esimMobilePlanNumberTransferConfirmationOrchestratorFlow = new EsimMobilePlanNumberTransferConfirmationOrchestratorFlow(new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData(numberTransferConfirmation.f100843a, numberTransferConfirmation.f100844b, numberTransferConfirmation.f100845c, numberTransferConfirmation.d));
                    final int i74 = 6;
                    Function1 block31 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i74) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block31, "block");
                    esimMobilePlanNumberTransferConfirmationOrchestratorFlow.H = block31;
                    return esimMobilePlanNumberTransferConfirmationOrchestratorFlow;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund) {
                    EsimRefundFlow esimRefundFlow = new EsimRefundFlow(new EsimRefundFlowContract$InputData(EsimRefundFlowContract$EsimSubscriptionsToRefund.AllAvailable.f100866a));
                    final int i92 = 2;
                    Function1 block32 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i92) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block32, "block");
                    esimRefundFlow.H = block32;
                    return esimRefundFlow;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.Help) {
                    EsimHelpFlow esimHelpFlow = new EsimHelpFlow(new EsimHelpFlowContract$InputData(((EsimMobilePlanSubscriptionFlowContract$Step.Help) step11).f100830a));
                    final int i96 = 7;
                    Function1 block33 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i96) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block33, "block");
                    esimHelpFlow.H = block33;
                    return esimHelpFlow;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.Instructions) {
                    return bVar2.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData(((EsimMobilePlanSubscriptionFlowContract$Step.Instructions) step11).f100831a, null)));
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.EsimHome) {
                    oki.h.r2(FlowCoordinator2);
                    return new EsimHomeFlow(new EsimHomeFlowContract$InputData(new EsimHomeFlowContract$InputData.InitialDestination.Subscriptions((EsimHomeFlowContract$InputData.InitialDestination.PreferredView) null, ((EsimMobilePlanSubscriptionFlowContract$Step.EsimHome) step11).f100828a, 5)));
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase) {
                    EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase numberPurchase = (EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase) step11;
                    EsimMobilePlanPhoneNumberPurchaseFlow esimMobilePlanPhoneNumberPurchaseFlow = new EsimMobilePlanPhoneNumberPurchaseFlow(new EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData(numberPurchase.f100840a, numberPurchase.f100841b, numberPurchase.f100842c));
                    ma2.s block34 = new ma2.s(bVar2, esimMobilePlanPhoneNumberPurchaseFlow, 15);
                    Intrinsics.checkNotNullParameter(block34, "block");
                    esimMobilePlanPhoneNumberPurchaseFlow.H = block34;
                    return esimMobilePlanPhoneNumberPurchaseFlow;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation) {
                    EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation numberTransferCreation = (EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation) step11;
                    EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen = new EsimMobilePlanNumberTransferScreen(new EsimMobilePlanNumberTransferScreenContract$InputData(numberTransferCreation.f100847b, numberTransferCreation.d));
                    n block35 = new n(bVar2, 28, FlowCoordinator2, step11);
                    Intrinsics.checkNotNullParameter(block35, "block");
                    esimMobilePlanNumberTransferScreen.H = block35;
                    return esimMobilePlanNumberTransferScreen;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade) {
                    EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade planUpgrade = (EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade) step11;
                    EsimGetPlanFlow esimGetPlanFlow2 = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.Purchase(null, null, new EsimGetPlanLaunchMode.PlanUpgrade(planUpgrade.f100851a, planUpgrade.f100852b), null, 11));
                    final int i99 = 4;
                    Function1 block36 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i99) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block36, "block");
                    esimGetPlanFlow2.H = block36;
                    return esimGetPlanFlow2;
                }
                if (step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.PlanChange) {
                    EsimMobilePlanSubscriptionFlowContract$Step.PlanChange planChange = (EsimMobilePlanSubscriptionFlowContract$Step.PlanChange) step11;
                    EsimGetPlanFlow esimGetPlanFlow3 = new EsimGetPlanFlow(new EsimGetPlanFlowContract$InputData.Purchase(null, null, new EsimGetPlanLaunchMode.PlanChange(planChange.f100849a, planChange.f100850b), null, 11));
                    final int i100 = 4;
                    Function1 block37 = new Function1() { // from class: mgj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i100) {
                                case 0:
                                    bgj.c output = (bgj.c) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                    oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 1:
                                    d67.u it9 = (d67.u) obj9;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    oki.h.D2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 2:
                                    pgj.d result = (pgj.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof pgj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                    oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z4 = output2 instanceof m;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                    if (z4) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.n) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.u) {
                                        vjj.u uVar = (vjj.u) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                    } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output2 instanceof vjj.p) {
                                        vjj.p pVar = (vjj.p) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                    } else if (output2 instanceof vjj.l) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                    } else if (output2 instanceof o) {
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                    } else if (output2 instanceof vjj.r) {
                                        yki.a aVar17 = bVar5.f100856s;
                                        vjj.r rVar = (vjj.r) output2;
                                        String str4 = rVar.f289780a;
                                        oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                    } else if (output2 instanceof q) {
                                        q qVar = (q) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                    } else if (output2 instanceof vjj.t) {
                                        vjj.t tVar = (vjj.t) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof vjj.s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vjj.s sVar = (vjj.s) output2;
                                        oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar2.f100856s);
                                    return Unit.f186387a;
                                case 5:
                                    fjj.p output4 = (fjj.p) obj9;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof fjj.n;
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                    if (z6) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                    } else if (output4 instanceof fjj.l) {
                                        fjj.l lVar = (fjj.l) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                    } else if (output4 instanceof fjj.m) {
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                    } else {
                                        if (!(output4 instanceof fjj.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        fjj.o oVar = (fjj.o) output4;
                                        oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                    if (zF) {
                                        oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof a.C0612a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((a.C0612a) result2).f100764a) {
                                            oki.h.r2(bVar7.f100856s);
                                            oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                        } else {
                                            bVar7.B2();
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    wfj.c result3 = (wfj.c) obj9;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof wfj.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                    oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block37, "block");
                    esimGetPlanFlow3.H = block37;
                    return esimGetPlanFlow3;
                }
                if (!(step11 instanceof EsimMobilePlanSubscriptionFlowContract$Step.Restricted)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(((EsimMobilePlanSubscriptionFlowContract$Step.Restricted) step11).f100853a);
                final int i101 = z3 ? 1 : 0;
                Function1 block38 = new Function1() { // from class: mgj.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i101) {
                            case 0:
                                bgj.c output = (bgj.c) obj9;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar3 = bVar2;
                                oki.h.t2(bVar3, bVar3.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(output.f15206a), false, null, false, 12);
                                return Unit.f186387a;
                            case 1:
                                d67.u it9 = (d67.u) obj9;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                oki.h.D2(bVar2.f100856s);
                                return Unit.f186387a;
                            case 2:
                                pgj.d result = (pgj.d) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof pgj.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar4 = bVar2;
                                oki.h.t2(bVar4, bVar4.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(((pgj.c) result).f235975a), false, null, false, 12);
                                return Unit.f186387a;
                            case 3:
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a output2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a) obj9;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z4 = output2 instanceof m;
                                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar5 = bVar2;
                                if (z4) {
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanBilling(((m) output2).f289772a), true, null, false, 12);
                                } else if (output2 instanceof vjj.n) {
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Help(((vjj.n) output2).f289773a), true, null, false, 12);
                                } else if (output2 instanceof vjj.u) {
                                    vjj.u uVar = (vjj.u) output2;
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCheckout(uVar.f289788a, uVar.f289789b), true, null, false, 12);
                                } else if (Intrinsics.f(output2, a.C0617a.f101205a)) {
                                    EsimInstructionType.INSTANCE.getClass();
                                    oki.h.w2(bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.Instructions("INSTALLATION"), ModalDestination.Style.POPUP.f98311a);
                                } else if (output2 instanceof vjj.p) {
                                    vjj.p pVar = (vjj.p) output2;
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(pVar.f289775a, lgj.e.MY_NUMBERS, pVar.f289776b), true, null, false, 12);
                                } else if (output2 instanceof vjj.l) {
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberPurchase(((vjj.l) output2).f289771a, lgj.e.ADD_NUMBER, null), true, null, false, 12);
                                } else if (output2 instanceof o) {
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((o) output2).f289774a), true, null, false, 12);
                                } else if (output2 instanceof vjj.r) {
                                    yki.a aVar17 = bVar5.f100856s;
                                    vjj.r rVar = (vjj.r) output2;
                                    String str4 = rVar.f289780a;
                                    oki.h.t2(bVar5, aVar17, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferCreation(rVar.d, rVar.f289782c, rVar.f289781b, str4), true, null, false, 12);
                                } else if (output2 instanceof q) {
                                    q qVar = (q) output2;
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.NumberTransferConfirmation(qVar.f289777a, qVar.f289778b, qVar.f289779c, qVar.d), true, null, false, 12);
                                } else if (output2 instanceof vjj.t) {
                                    vjj.t tVar = (vjj.t) output2;
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanUpgrade(tVar.f289786a, tVar.f289787b), true, null, false, 12);
                                } else {
                                    if (!(output2 instanceof vjj.s)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    vjj.s sVar = (vjj.s) output2;
                                    oki.h.t2(bVar5, bVar5.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(sVar.f289783a, sVar.f289784b, sVar.f289785c, sVar.d), true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 4:
                                com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a output3 = (com.revolut.retail.feature.esim.impl.ui.flows.get_plan.a) obj9;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                if (!Intrinsics.f(output3, a.C0610a.f100632a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.r2(bVar2.f100856s);
                                return Unit.f186387a;
                            case 5:
                                fjj.p output4 = (fjj.p) obj9;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                boolean z6 = output4 instanceof fjj.n;
                                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar6 = bVar2;
                                if (z6) {
                                    oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanPayments(((fjj.n) output4).f135664a), true, null, false, 12);
                                } else if (output4 instanceof fjj.l) {
                                    fjj.l lVar = (fjj.l) output4;
                                    oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanCancellation(lVar.f135660a, lVar.f135661b, lVar.f135662c, lVar.d), true, null, false, 12);
                                } else if (output4 instanceof fjj.m) {
                                    oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.MobilePlanInvoices(((fjj.m) output4).f135663a), true, null, false, 12);
                                } else {
                                    if (!(output4 instanceof fjj.o)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fjj.o oVar = (fjj.o) output4;
                                    oki.h.t2(bVar6, bVar6.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.PlanChange(oVar.f135665a, oVar.f135666b), true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 6:
                                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a result2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a) obj9;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean zF = Intrinsics.f(result2, a.b.f100765a);
                                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar7 = bVar2;
                                if (zF) {
                                    oki.h.t2(bVar7, bVar7.f100856s, new EsimMobilePlanSubscriptionFlowContract$Step.EsimHome(c4.ACTIVE), false, null, false, 12);
                                } else {
                                    if (!(result2 instanceof a.C0612a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (((a.C0612a) result2).f100764a) {
                                        oki.h.r2(bVar7.f100856s);
                                        oki.h.t2(bVar7, bVar7.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, false, null, false, 12);
                                    } else {
                                        bVar7.B2();
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                wfj.c result3 = (wfj.c) obj9;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (!(result3 instanceof wfj.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.b bVar8 = bVar2;
                                oki.h.t2(bVar8, bVar8.f100856s, EsimMobilePlanSubscriptionFlowContract$Step.EsimRefund.f100829a, true, null, false, 12);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block38, "block");
                promptMarketingScreen2.H = block38;
                return promptMarketingScreen2;
            case 16:
                com.revolut.feature.add_money.impl.flow.c cVar2 = (com.revolut.feature.add_money.impl.flow.c) obj7;
                AddMoneyFlowContract$Step step12 = (AddMoneyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof AddMoneyFlowContract$Step.BalancePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE16 = cVar2.e1(new g1j.a(((AddMoneyFlowContract$Step.BalancePicker) step12).f60916a, cVar2.f60920r));
                m98.k block39 = new m98.k(cVar2, i2);
                Intrinsics.checkNotNullParameter(block39, "block");
                viewControllerE16.H = block39;
                return viewControllerE16;
            case 17:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                m70.a.c(t0.f186434a);
                return new mh4.q((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), f0.f322471a, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.refinancing_offer_credit_to_selection_title, zhm.u.c(""), null, 12), null, null, null, false, ((mh4.k) obj7).f205393b ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow);
            case 18:
                dgc.i detailsLayout = (dgc.i) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(detailsLayout, "detailsLayout");
                ((mhc.b) obj7).f205482c.f("KEY_CONCIERGE_ALBERTINE_DETAILS_LAYOUT", detailsLayout);
                return Unit.f186387a;
            case 19:
                final com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) obj7;
                SpousalConsentInitiatorFlowContract$InputData spousalConsentInitiatorFlowContract$InputData = bVar3.f68442q;
                SpousalConsentInitiatorFlowContract$Step step13 = (SpousalConsentInitiatorFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof SpousalConsentInitiatorFlowContract$Step.Intro)) {
                    if (step13 instanceof SpousalConsentInitiatorFlowContract$Step.RequestConsent) {
                        RequestConsentScreen requestConsentScreen = new RequestConsentScreen(new RequestConsentScreenContract$InputData(spousalConsentInitiatorFlowContract$InputData.f68430a));
                        final int i102 = z3 ? 1 : 0;
                        Function1 function1 = new Function1() { // from class: mi4.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                switch (i102) {
                                    case 0:
                                        ni4.d result = (ni4.d) obj9;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean zF = Intrinsics.f(result, ni4.b.f215637a);
                                        com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar4 = bVar3;
                                        if (zF) {
                                            bVar4.K2(null);
                                        } else {
                                            if (!(result instanceof ni4.c)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar4.l2(new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.a(bVar4, result, null), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                    default:
                                        oi4.h result2 = (oi4.h) obj9;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean z4 = result2 instanceof oi4.g;
                                        com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar5 = bVar3;
                                        if (z4) {
                                            bVar5.l2(new p0(bVar5, (oi4.g) result2, null, 1), new yi5.b(26));
                                        } else {
                                            if (!(result2 instanceof oi4.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (((oi4.f) result2).f225437a) {
                                                bVar5.l2(new e(bVar5, null, 0), new yi5.b(26));
                                            } else {
                                                bVar5.K2(null);
                                            }
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(function1, "<set-?>");
                        requestConsentScreen.H = function1;
                        return requestConsentScreen;
                    }
                    if (!(step13 instanceof SpousalConsentInitiatorFlowContract$Step.ModalStep.Popup)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SpousalConsentInitiatorFlowContract$Step.ModalStep.Popup popup = (SpousalConsentInitiatorFlowContract$Step.ModalStep.Popup) step13;
                    SpousalConsentInitiatorPopupScreen spousalConsentInitiatorPopupScreen = new SpousalConsentInitiatorPopupScreen(new SpousalConsentInitiatorPopupScreenContract$InputData(popup.f68437a, popup.f68438b, spousalConsentInitiatorFlowContract$InputData.f68430a));
                    Function1 function12 = new Function1() { // from class: mi4.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i) {
                                case 0:
                                    ni4.d result = (ni4.d) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, ni4.b.f215637a);
                                    com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar4 = bVar3;
                                    if (zF) {
                                        bVar4.K2(null);
                                    } else {
                                        if (!(result instanceof ni4.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.l2(new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.a(bVar4, result, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    oi4.h result2 = (oi4.h) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z4 = result2 instanceof oi4.g;
                                    com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar5 = bVar3;
                                    if (z4) {
                                        bVar5.l2(new p0(bVar5, (oi4.g) result2, null, 1), new yi5.b(26));
                                    } else {
                                        if (!(result2 instanceof oi4.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (((oi4.f) result2).f225437a) {
                                            bVar5.l2(new e(bVar5, null, 0), new yi5.b(26));
                                        } else {
                                            bVar5.K2(null);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    spousalConsentInitiatorPopupScreen.H = function12;
                    return spousalConsentInitiatorPopupScreen;
                }
                SpousalConsentInitiatorIntroScreenConfig spousalConsentInitiatorIntroScreenConfig = ((SpousalConsentInitiatorFlowContract$Step.Intro) step13).f68436a;
                Clause f66399a = spousalConsentInitiatorIntroScreenConfig.getF66399a();
                Clause f66400b = spousalConsentInitiatorIntroScreenConfig.getF66400b();
                Clause f66401c = spousalConsentInitiatorIntroScreenConfig.getF66401c();
                boolean z4 = spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct;
                if (z4) {
                    clause = ((SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct) spousalConsentInitiatorIntroScreenConfig).d;
                } else if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline) {
                    clause = ((SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline) spousalConsentInitiatorIntroScreenConfig).d;
                } else if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse) {
                    clause = ((SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse) spousalConsentInitiatorIntroScreenConfig).d;
                } else if (!(spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent)) {
                    throw new NoWhenBranchMatchedException();
                }
                Clause clause2 = clause;
                boolean z6 = spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline;
                if (z6) {
                    cdnImageQ2 = com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b.Q2("3D064");
                } else if (z4) {
                    cdnImageQ2 = com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b.Q2("3D145");
                } else if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse) {
                    cdnImageQ2 = com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b.Q2("3D069");
                } else {
                    if (!(spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cdnImageQ2 = com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b.Q2("3D100");
                }
                CdnImage cdnImage = cdnImageQ2;
                if (z4) {
                    z = false;
                } else {
                    if (!z6 && !(spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse) && !(spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(ug4.a.b(f66399a, f66400b, spousalConsentInitiatorFlowContract$InputData.f68430a, z, cdnImage, f66401c, clause2, 15896));
                ma2.s block40 = new ma2.s(bVar3, spousalConsentInitiatorIntroScreenConfig, i2);
                Intrinsics.checkNotNullParameter(block40, "block");
                fullScreenPromptScreen.H = block40;
                return fullScreenPromptScreen;
            case 20:
                return a(obj2, obj3);
            case 21:
                mk5.m mVar = (mk5.m) obj7;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new mk5.p(f0.f322471a, mVar.d, mVar.f206189a, mVar.f206190b);
            case 22:
                return b(obj2, obj3);
            case 23:
                return c(obj2, obj3);
            case 24:
                return d(obj2, obj3);
            case 25:
                return e(obj2, obj3);
            case 26:
                return g(obj2, obj3);
            case 27:
                return h(obj2, obj3);
            case 28:
                return i(obj2, obj3);
            default:
                com.revolut.feature.tax_residency.impl.exemption.flows.main.a aVar17 = (com.revolut.feature.tax_residency.impl.exemption.flows.main.a) obj7;
                l FlowCoordinator3 = (l) obj2;
                TaxExemptionFlowContract$Step step14 = (TaxExemptionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof TaxExemptionFlowContract$Step.ExemptionInfo)) {
                    if (step14 instanceof TaxExemptionFlowContract$Step.EditAmount) {
                        return new LimitOrderAmountSelectorScreen(new LimitOrderAmountSelectorScreenContract$InputData(((TaxExemptionFlowContract$Step.EditAmount) step14).f89995a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TaxExemptionScreen taxExemptionScreen = new TaxExemptionScreen();
                mk5.s block41 = new mk5.s(aVar17, FlowCoordinator3, i3);
                Intrinsics.checkNotNullParameter(block41, "block");
                taxExemptionScreen.H = block41;
                return taxExemptionScreen;
        }
    }

    public /* synthetic */ e(c0 c0Var, mh4.k kVar) {
        this.f203425a = 17;
        this.f203426b = kVar;
    }
}
