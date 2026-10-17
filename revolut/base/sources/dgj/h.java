package dgj;

import am6.d;
import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aw0.n6;
import aw0.o9;
import bn4.z;
import br4.n;
import br4.o;
import br4.p;
import br4.q;
import br4.r;
import br4.s;
import br4.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import com.revolut.feature.contacts.api.navigation.BlockUserBottomSheetInputData;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreenContract$ModalStep;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.block_user.BlockUserBottomSheetController;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeScreenContract$ModalStep;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsRootFlow;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayRootFlow;
import com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket.PickerBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlow;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.CreditCardCancellationFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.CreditCardCancellationEntryFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlow;
import com.revolut.feature.credit.card.impl.ui.cancellation.flow.withdrawal.CreditCardWithdrawalFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreen;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.flow.CreditCardDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.flow.CreditCardDetailsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesController;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.limit_hub.flow.CreditCardLimitHubFlow;
import com.revolut.feature.credit.card.impl.ui.limit_hub.flow.CreditCardLimitHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreen;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlow;
import com.revolut.feature.credit.card.impl.ui.statement.flow.CreditCardStatementFlowContract$InputData;
import com.revolut.feature.credit.core.ui.CreditItemsListController;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.BrazilConsentDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.BrazilInboundConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.BrazilInboundConsentDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.OpenFinanceScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.OpenFinanceScreenContract$Output;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.OpenFinanceFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$OutputData;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.consent.ConsentScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_onboarding.impl.R$plurals;
import com.revolut.feature.junior_onboarding.impl.ui.creation.JuniorCreationFlow;
import com.revolut.feature.junior_onboarding.impl.ui.onboarding.JuniorOnboardingFlowContract$Step;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$ModalStep;
import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationController;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.PaymentFlowContract$Step;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.amount.PaymentAmountScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.review.PaymentReviewScreen;
import com.revolut.feature.pix.api.navigation.PixAutomaticoNavigation$Destination;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreenContract$ModalStep;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog.CustomRatingBottomSheetContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.dialog.CustomRatingBottomSheetController;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.CustomRatingFlowContract$Step;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.budget.BudgetFlow;
import com.revolut.feature.spending_analytics.impl.ui.budget.BudgetFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.AccountPickerController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.AnalyticsDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlowContract$Step;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreen;
import com.revolut.feature.tax_residency.impl.screens.prefetch.TaxResidencyPrefetchDataScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.user_declarations.shared.flows.pep.PepFlowContract$Step;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list.PersonsListScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.flows.screener.ScreenerRedesignFlowContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.flows.screener.ScreenerRedesignFlowContract$Step;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.result.ScreenerResultScreen;
import com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.WealthProtectionSsoAnimationFlowContract$InputData;
import com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.WealthProtectionSsoAnimationFlowContract$Step;
import com.revolut.feature.wealth_protection.sso.animation.impl.ui.screen.WealthProtectionSsoAnimationScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutUpdatedInvoice;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.EsimMobilePlanCheckoutFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.EsimMobilePlanCheckoutFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_info_bottom_sheet.EsimCommonInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_info_bottom_sheet.EsimCommonInfoBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_price_breakdown.EsimMobilePlanPhoneNumberPriceBreakdownScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_price_breakdown.EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_rev_points_info.EsimMobilePlanRevPointsInfoScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$DomainState;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_block.PlanDowngradeBlockScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.PlanDowngradeReasonScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreenContract$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlowContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlowContract$Step;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.ConnectedAppDetailsScreen;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.details.ConnectedAppDetailsScreenContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.revoke_access.ConnectedAppRevokeAccessBottomSheet;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.revoke_access.ConnectedAppRevokeAccessBottomSheetContract$InputData;
import cp4.k0;
import d27.g0;
import dce.l0;
import dce.s0;
import dcl.m0;
import dmj.e0;
import dnc.x;
import dx4.c1;
import dx4.c2;
import dx4.e2;
import dx4.f2;
import eh9.g;
import grl.k9;
import igk.f;
import ilk.f;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import oki.h;
import olk.f;
import ste.e;
import tn6.h;
import vkm.j2;
import w6c.j;
import xoh.k;
import yki.l;
import zh9.u0;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zp0.y;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114708b;

    public /* synthetic */ h(x xVar, dnc.i iVar) {
        this.f114707a = 13;
        this.f114708b = iVar;
    }

    private final Object a(Object obj2, Object obj3) {
        Pair pair;
        qzi.i iVar;
        com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.b) this.f114708b;
        gte.a aVar = bVar.f87599q;
        l FlowCoordinator = (l) obj2;
        AnalyticsDashboardFlowContract$Step step = (AnalyticsDashboardFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AnalyticsDashboardFlowContract$Step.Dashboard) {
            return new AnalyticsDashboardController(((AnalyticsDashboardFlowContract$Step.Dashboard) step).f87589a);
        }
        if (Intrinsics.f(step, AnalyticsDashboardFlowContract$Step.AccountPicker.f87578a)) {
            return new AccountPickerController();
        }
        if (Intrinsics.f(step, AnalyticsDashboardFlowContract$Step.Settings.f87591a)) {
            return new SettingsController();
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.AnalyticsDetails) {
            return new AnalyticsDetailsController(((AnalyticsDashboardFlowContract$Step.AnalyticsDetails) step).f87581a);
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.BudgetCreation) {
            if (!((jte.d) aVar).c(AnalyticsFeatureApi$Toggles.BudgetRevamp.f87391c)) {
                return bVar.e1(new rzi.a(((AnalyticsDashboardFlowContract$Step.BudgetCreation) step).f87582a));
            }
            AccountId accountId = ((AnalyticsDashboardFlowContract$Step.BudgetCreation) step).f87582a;
            if (accountId instanceof AccountId.Joint) {
                iVar = qzi.i.Joint;
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar = qzi.i.Personal;
            }
            return new BudgetFlow(new BudgetFlowContract$InputData.SetupBudget(iVar));
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.BudgetSetupAccountPicker) {
            ArrayList<AccountId> arrayList = ((AnalyticsDashboardFlowContract$Step.BudgetSetupAccountPicker) step).f87584a;
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.analytics_dashboard_section_tools_budget_setup_bottom_sheet_title, null, null, 14), null, null, null, false, 30);
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (AccountId accountId2 : arrayList) {
                if (Intrinsics.f(accountId2, AccountId.Personal.f51414a)) {
                    pair = new Pair(Integer.valueOf(R$string.analytics_dashboard_section_tools_budget_setup_bottom_sheet_personal), Integer.valueOf(R$drawable.uikit_icn_24_coins));
                } else {
                    if (!(accountId2 instanceof AccountId.Joint)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(Integer.valueOf(R$string.analytics_dashboard_section_tools_budget_setup_bottom_sheet_joint), Integer.valueOf(R$drawable.uikit_icn_24_joint));
                }
                Clause clause = null;
                boolean z = true;
                boolean z3 = false;
                arrayList2.add(new eii.l(new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), clause, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(((Number) pair.f186386b).intValue(), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), z, z3, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false), accountId2, 168));
            }
            k9 k9Var = k9.Analytics;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, null, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
            e0 block = new e0(bVar, 9);
            Intrinsics.checkNotNullParameter(block, "block");
            rowActionsBottomSheetController.H = block;
            return rowActionsBottomSheetController;
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.BudgetOverview) {
            return ((jte.d) aVar).c(AnalyticsFeatureApi$Toggles.BudgetRevamp.f87391c) ? new BudgetFlow(new BudgetFlowContract$InputData.ViewBudget(((AnalyticsDashboardFlowContract$Step.BudgetOverview) step).f87583a)) : bVar.e1(new rzi.b(((AnalyticsDashboardFlowContract$Step.BudgetOverview) step).f87583a));
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.IncomeSorter) {
            return new IncomeSorterFlow(new IncomeSorterFlowContract$InputData(IncomeSorterFlowContract$InputData.InitialScreen.IncomeSortersList.f87782a));
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.TotalWealth) {
            AnalyticsDashboardFlowContract$Step.TotalWealth totalWealth = (AnalyticsDashboardFlowContract$Step.TotalWealth) step;
            return new TotalWealthFlow(new TotalWealthFlowContract$InputData.Direct(totalWealth.f87593a, totalWealth.f87594b, null, null));
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.Trips) {
            return new TripsFlow(new TripsFlowContract$InputData.List(null));
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.AddAsset) {
            return new TotalWealthFlow(new TotalWealthFlowContract$InputData.AddOtherAsset(((AnalyticsDashboardFlowContract$Step.AddAsset) step).f87579a));
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.AddTrip) {
            return new TripsFlow(TripsFlowContract$InputData.AddTrip.f87610a);
        }
        if (step instanceof AnalyticsDashboardFlowContract$Step.SpareChange) {
            return bVar.e1(new ipg.c(((AnalyticsDashboardFlowContract$Step.SpareChange) step).f87592a));
        }
        if (!(step instanceof AnalyticsDashboardFlowContract$Step.CustomPeriodSelect)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsDashboardFlowContract$Step.CustomPeriodSelect customPeriodSelect = (AnalyticsDashboardFlowContract$Step.CustomPeriodSelect) step;
        List list = customPeriodSelect.f87585a;
        LocalDate localDate = customPeriodSelect.f87587c;
        LocalDate localDate2 = customPeriodSelect.d;
        LocalDate localDate3 = customPeriodSelect.e;
        boolean z4 = customPeriodSelect.f;
        kge.d dVar = bVar.f87598p;
        yld.d screenType = customPeriodSelect.f87586b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        return new CustomPeriodSelectController(new CustomPeriodSelectContract$InputData(list, localDate, localDate2, localDate3, z4, screenType.toString(), customPeriodSelect.f87588g));
    }

    private final Object b(Object obj2, Object obj3) {
        a5h.g gVar = (a5h.g) this.f114708b;
        k0 key = (k0) obj2;
        CreditCardSecurityDeposit details = (CreditCardSecurityDeposit) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(details, "details");
        ((xx4.d) gVar.f1407c).b(key, details);
        return Unit.f186387a;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.wealth_discovery.impl.screener.flows.screener.a aVar = (com.revolut.feature.wealth_discovery.impl.screener.flows.screener.a) this.f114708b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        ScreenerRedesignFlowContract$Step step = (ScreenerRedesignFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, ScreenerRedesignFlowContract$Step.Filters.f96185a)) {
            ScreenerRedesignFlowContract$Input screenerRedesignFlowContract$Input = aVar.o;
            ScreenerAllFiltersFlow screenerAllFiltersFlow = new ScreenerAllFiltersFlow(new ScreenerAllFiltersFlowContract$InputData(screenerRedesignFlowContract$Input.f96182a, screenerRedesignFlowContract$Input.f96183b, k.WITH_TABS));
            dph.c block = new dph.c(aVar, LazyFlowCoordinator, 0);
            Intrinsics.checkNotNullParameter(block, "block");
            screenerAllFiltersFlow.H = block;
            return screenerAllFiltersFlow;
        }
        if (!(step instanceof ScreenerRedesignFlowContract$Step.Result)) {
            if (step instanceof ScreenerRedesignFlowContract$Step.Collections) {
                return new ScreenerAllCollectionsRedesignScreen();
            }
            throw new NoWhenBranchMatchedException();
        }
        ScreenerRedesignFlowContract$Step.Result result = (ScreenerRedesignFlowContract$Step.Result) step;
        ScreenerResultScreen screenerResultScreen = new ScreenerResultScreen(new nqh.e(result.f96186a, result.f96187b, null, null, true));
        doe.c block2 = new doe.c(aVar, LazyFlowCoordinator, 3);
        Intrinsics.checkNotNullParameter(block2, "block");
        screenerResultScreen.H = block2;
        return screenerResultScreen;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a aVar = (com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a) this.f114708b;
        ConnectedAppDetailsFlowContract$InputData connectedAppDetailsFlowContract$InputData = aVar.o;
        l FlowCoordinator = (l) obj2;
        ConnectedAppDetailsFlowContract$Step step = (ConnectedAppDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ConnectedAppDetailsFlowContract$Step.Details) {
            ConnectedAppDetailsScreen connectedAppDetailsScreen = new ConnectedAppDetailsScreen(new ConnectedAppDetailsScreenContract$InputData(connectedAppDetailsFlowContract$InputData.f106716a));
            final int i = 1;
            Function1 block = new Function1() { // from class: dpl.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            hpl.b result = (hpl.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!Intrinsics.f(result, hpl.b.f154576a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a aVar2 = aVar;
                            aVar2.l2(new cq6.k(aVar2, null, 26), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            epl.d result2 = (epl.d) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!Intrinsics.f(result2, epl.d.f128205a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.w2(aVar.f106721r, ConnectedAppDetailsFlowContract$Step.RevokeAccess.f106718a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            connectedAppDetailsScreen.H = block;
            return connectedAppDetailsScreen;
        }
        if (!(step instanceof ConnectedAppDetailsFlowContract$Step.RevokeAccess)) {
            throw new NoWhenBranchMatchedException();
        }
        ConnectedAppRevokeAccessBottomSheet connectedAppRevokeAccessBottomSheet = new ConnectedAppRevokeAccessBottomSheet(new ConnectedAppRevokeAccessBottomSheetContract$InputData(connectedAppDetailsFlowContract$InputData.f106716a));
        final int i2 = 0;
        Function1 block2 = new Function1() { // from class: dpl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        hpl.b result = (hpl.b) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (!Intrinsics.f(result, hpl.b.f154576a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.a aVar2 = aVar;
                        aVar2.l2(new cq6.k(aVar2, null, 26), new yi5.b(26));
                        return Unit.f186387a;
                    default:
                        epl.d result2 = (epl.d) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!Intrinsics.f(result2, epl.d.f128205a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h.w2(aVar.f106721r, ConnectedAppDetailsFlowContract$Step.RevokeAccess.f106718a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        connectedAppRevokeAccessBottomSheet.H = block2;
        return connectedAppRevokeAccessBottomSheet;
    }

    private final Object e(Object obj2, Object obj3) {
        int i;
        int i2;
        com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a aVar = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.entry.a) this.f114708b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CreditCardCancellationEntryFlowContract$Step step = (CreditCardCancellationEntryFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CreditCardCancellationEntryFlowContract$Step.BlockedScreen)) {
            if (step instanceof CreditCardCancellationEntryFlowContract$Step.CancellationFlow) {
                CreditCardCancellationEntryFlowContract$Step.CancellationFlow cancellationFlow = (CreditCardCancellationEntryFlowContract$Step.CancellationFlow) step;
                return new CreditCardCancellationFlow(new CreditCardCancellationFlowContract$InputData(cancellationFlow.f69138a, cancellationFlow.f69139b, cancellationFlow.f69140c, cancellationFlow.d, cancellationFlow.e, cancellationFlow.f, cancellationFlow.f69141g));
            }
            if (step instanceof CreditCardCancellationEntryFlowContract$Step.WithdrawalFlow) {
                return new CreditCardWithdrawalFlow(new CreditCardWithdrawalFlowContract$InputData(((CreditCardCancellationEntryFlowContract$Step.WithdrawalFlow) step).f69143a));
            }
            if (!(step instanceof CreditCardCancellationEntryFlowContract$Step.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.f69148t.getClass();
            ActionsBottomSheetController actionsBottomSheetControllerA = vt4.a.a();
            dph.c block = new dph.c(aVar, LazyFlowCoordinator, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            actionsBottomSheetControllerA.H = block;
            return actionsBottomSheetControllerA;
        }
        CreditCardCancellationEntryFlowContract$Step.BlockedScreen blockedScreen = (CreditCardCancellationEntryFlowContract$Step.BlockedScreen) step;
        hl4.a reason = blockedScreen.f69136a;
        wi0.b countryCode = blockedScreen.f69137b;
        aVar.f69145q.getClass();
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        int[] iArr = zp4.a.f324168a;
        int i3 = iArr[reason.ordinal()];
        if (i3 == 1) {
            i = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_pending_transactions_title;
        } else if (i3 == 2) {
            i = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_active_installment_plan_title;
        } else if (i3 == 3) {
            i = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_stamp_duty_not_paid_title;
        } else if (i3 == 4) {
            i = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_facility_overdue_title;
        } else {
            if (i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.credit.core.R$string.credit_common_error_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i5 = iArr[reason.ordinal()];
        if (i5 == 1) {
            wi0.b.Companion.getClass();
            i2 = Intrinsics.f(countryCode, wi0.b.f297756l) ? com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_pending_transactions_description_au_with_link : com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_pending_transactions_description;
        } else if (i5 == 2) {
            i2 = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_active_installment_plan_description;
        } else if (i5 == 3) {
            i2 = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_stamp_duty_not_paid_description;
        } else if (i5 == 4) {
            i2 = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_facility_overdue_description;
        } else {
            if (i5 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = com.revolut.feature.credit.core.R$string.credit_error_generic;
        }
        HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(i2, (List) null, (Integer) null, (Object) null, 30);
        GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        hl4.a aVar2 = hl4.a.STAMP_DUTY_NOT_PAID;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause, htmlLocalisedClause, glyphImage, null, null, resourceImage, null, new PromptMarketingContentDelegate.Model.Button((Clause) (reason == aVar2 ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_continue, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14)), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), reason == aVar2 ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_stamp_duty_not_paid_keep_my_card, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54) : null, null, null, null, null, null, 65112));
        doe.c block2 = new doe.c(reason, aVar, 4);
        Intrinsics.checkNotNullParameter(block2, "block");
        promptMarketingScreen.H = block2;
        return promptMarketingScreen;
    }

    private final Object g(Object obj2, Object obj3) {
        final com.revolut.feature.credit.card.impl.ui.details.flow.a aVar = (com.revolut.feature.credit.card.impl.ui.details.flow.a) this.f114708b;
        CreditCardDetailsFlowContract$InputData creditCardDetailsFlowContract$InputData = aVar.o;
        final l FlowCoordinator = (l) obj2;
        CreditCardDetailsFlowContract$Step step = (CreditCardDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditCardDetailsFlowContract$Step.Details) {
            CreditCardDetailsScreen creditCardDetailsScreen = new CreditCardDetailsScreen(new CreditCardDetailsScreenContract$InputData(creditCardDetailsFlowContract$InputData.f69252a));
            final int i = 0;
            Function1 block = new Function1() { // from class: dr4.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            t output = (t) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof o;
                            com.revolut.feature.credit.card.impl.ui.details.flow.a aVar2 = aVar;
                            l lVar = FlowCoordinator;
                            if (z) {
                                h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.CreditCardLimitHub.f69254a, true, null, false, 12);
                            } else if (output instanceof s) {
                                h.t2(aVar2, lVar, new CreditCardDetailsFlowContract$Step.Statements(((s) output).f17921a), true, null, false, 12);
                            } else if (output instanceof n) {
                                if (((n) output).f17916a) {
                                    h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.Autopay.f69253a, true, null, false, 12);
                                } else {
                                    h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.SetupAutopay.f69259a, true, null, false, 12);
                                }
                            } else if (output instanceof q) {
                                h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.DocumentsRatesInfo.f69257a, true, null, false, 12);
                            } else if (output instanceof r) {
                                h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.Repay.f69258a, true, null, false, 12);
                            } else {
                                if (!(output instanceof p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar2, lVar, new CreditCardDetailsFlowContract$Step.Description(((p) output).f17918a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        default:
                            up4.b result = (up4.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof up4.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.t2(aVar, FlowCoordinator, CreditCardDetailsFlowContract$Step.Autopay.f69253a, false, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            creditCardDetailsScreen.H = block;
            return creditCardDetailsScreen;
        }
        if (step instanceof CreditCardDetailsFlowContract$Step.CreditCardLimitHub) {
            return new CreditCardLimitHubFlow(new CreditCardLimitHubFlowContract$InputData(creditCardDetailsFlowContract$InputData.f69252a));
        }
        if (step instanceof CreditCardDetailsFlowContract$Step.Statements) {
            return ((CreditCardDetailsFlowContract$Step.Statements) step).f69260a ? new CreditCardStatementFlow(new CreditCardStatementFlowContract$InputData(creditCardDetailsFlowContract$InputData.f69252a)) : new CreditCardStatementScreen(new CreditCardStatementScreenContract$InputData(creditCardDetailsFlowContract$InputData.f69252a));
        }
        if (step instanceof CreditCardDetailsFlowContract$Step.SetupAutopay) {
            CreditCardSetupAutopayRootFlow creditCardSetupAutopayRootFlow = new CreditCardSetupAutopayRootFlow(new CreditCardSetupAutopayFlowContract$InputData.Create(creditCardDetailsFlowContract$InputData.f69252a, up4.c.PostResult));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: dr4.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            t output = (t) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof o;
                            com.revolut.feature.credit.card.impl.ui.details.flow.a aVar2 = aVar;
                            l lVar = FlowCoordinator;
                            if (z) {
                                h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.CreditCardLimitHub.f69254a, true, null, false, 12);
                            } else if (output instanceof s) {
                                h.t2(aVar2, lVar, new CreditCardDetailsFlowContract$Step.Statements(((s) output).f17921a), true, null, false, 12);
                            } else if (output instanceof n) {
                                if (((n) output).f17916a) {
                                    h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.Autopay.f69253a, true, null, false, 12);
                                } else {
                                    h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.SetupAutopay.f69259a, true, null, false, 12);
                                }
                            } else if (output instanceof q) {
                                h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.DocumentsRatesInfo.f69257a, true, null, false, 12);
                            } else if (output instanceof r) {
                                h.t2(aVar2, lVar, CreditCardDetailsFlowContract$Step.Repay.f69258a, true, null, false, 12);
                            } else {
                                if (!(output instanceof p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(aVar2, lVar, new CreditCardDetailsFlowContract$Step.Description(((p) output).f17918a), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        default:
                            up4.b result = (up4.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (!(result instanceof up4.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h.t2(aVar, FlowCoordinator, CreditCardDetailsFlowContract$Step.Autopay.f69253a, false, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            creditCardSetupAutopayRootFlow.H = block2;
            return creditCardSetupAutopayRootFlow;
        }
        if (step instanceof CreditCardDetailsFlowContract$Step.Autopay) {
            return new CreditCardAutopaySettingsRootFlow(new CreditCardAutopaySettingsFlowContract$InputData(creditCardDetailsFlowContract$InputData.f69252a, tp4.a.Back));
        }
        if (step instanceof CreditCardDetailsFlowContract$Step.DocumentsRatesInfo) {
            return new CreditCardDocumentsRatesController(new CreditCardDocumentsRatesScreenContract$InputData(creditCardDetailsFlowContract$InputData.f69252a));
        }
        if (step instanceof CreditCardDetailsFlowContract$Step.Repay) {
            return new CreditCardRepayFlow(new CreditCardRepayFlowContract$InputData(null, creditCardDetailsFlowContract$InputData.f69252a));
        }
        if (step instanceof CreditCardDetailsFlowContract$Step.Description) {
            return new CreditCardDescriptionScreen(new CreditCardDescriptionScreenContract$InputData.Local(((CreditCardDetailsFlowContract$Step.Description) step).f69255a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.a aVar = (com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.a) this.f114708b;
        l FlowCoordinator = (l) obj2;
        WealthProtectionSsoAnimationFlowContract$Step step = (WealthProtectionSsoAnimationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof WealthProtectionSsoAnimationFlowContract$Step.Animation) {
            return new WealthProtectionSsoAnimationScreen();
        }
        if (!(step instanceof WealthProtectionSsoAnimationFlowContract$Step.Sso)) {
            throw new NoWhenBranchMatchedException();
        }
        WealthProtectionSsoAnimationFlowContract$InputData wealthProtectionSsoAnimationFlowContract$InputData = aVar.o;
        ViewController viewControllerE1 = aVar.e1(new djl.b(wealthProtectionSsoAnimationFlowContract$InputData.f96293a, wealthProtectionSsoAnimationFlowContract$InputData.f96294b, wealthProtectionSsoAnimationFlowContract$InputData.f96295c, cjl.s.REGIONAL, djl.c.POST_RESULT));
        e0 block = new e0(aVar, 22);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        EsimMobilePlanCheckoutScreenContract$InputData changePlan;
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        boolean z;
        RowDelegate.Model.MainImage.Image24 image24;
        Image imageT1;
        ConsentScreen consentScreen;
        int i = this.f114707a;
        int i2 = 10;
        final int i3 = 3;
        DigitsKeyListener digitsKeyListener = null;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object obj4 = this.f114708b;
        switch (i) {
            case 0:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                EsimMobilePlanCheckoutFlowContract$Step step = (EsimMobilePlanCheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof EsimMobilePlanCheckoutFlowContract$Step.Checkout)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimMobilePlanCheckoutFlowContract$InputData esimMobilePlanCheckoutFlowContract$InputData = bVar.o;
                if (esimMobilePlanCheckoutFlowContract$InputData instanceof EsimMobilePlanCheckoutFlowContract$InputData.PurchaseNewPlan) {
                    EsimMobilePlanCheckoutFlowContract$InputData.PurchaseNewPlan purchaseNewPlan = (EsimMobilePlanCheckoutFlowContract$InputData.PurchaseNewPlan) esimMobilePlanCheckoutFlowContract$InputData;
                    changePlan = new EsimMobilePlanCheckoutScreenContract$InputData.PurchaseNewPlan(purchaseNewPlan.f100712a, purchaseNewPlan.f100713b, purchaseNewPlan.f100714c, purchaseNewPlan.d);
                } else if (esimMobilePlanCheckoutFlowContract$InputData instanceof EsimMobilePlanCheckoutFlowContract$InputData.ResubscribeToMobilePlanSubscription) {
                    EsimMobilePlanCheckoutFlowContract$InputData.ResubscribeToMobilePlanSubscription resubscribeToMobilePlanSubscription = (EsimMobilePlanCheckoutFlowContract$InputData.ResubscribeToMobilePlanSubscription) esimMobilePlanCheckoutFlowContract$InputData;
                    changePlan = new EsimMobilePlanCheckoutScreenContract$InputData.ReSubscribeToMobilePlanSubscription(resubscribeToMobilePlanSubscription.f100715a, resubscribeToMobilePlanSubscription.f100716b, resubscribeToMobilePlanSubscription.f100717c, null);
                } else {
                    if (!(esimMobilePlanCheckoutFlowContract$InputData instanceof EsimMobilePlanCheckoutFlowContract$InputData.ChangePlan)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimMobilePlanCheckoutFlowContract$InputData.ChangePlan changePlan2 = (EsimMobilePlanCheckoutFlowContract$InputData.ChangePlan) esimMobilePlanCheckoutFlowContract$InputData;
                    changePlan = new EsimMobilePlanCheckoutScreenContract$InputData.ChangePlan(changePlan2.f100709a, changePlan2.f100710b, null);
                }
                EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen = new EsimMobilePlanCheckoutScreen(changePlan);
                i block = new i(bVar, 1);
                Intrinsics.checkNotNullParameter(block, "block");
                esimMobilePlanCheckoutScreen.H = block;
                return esimMobilePlanCheckoutScreen;
            case 1:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RefinancingAccountDetailsHomeScreenContract$ModalStep step2 = (RefinancingAccountDetailsHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof RefinancingAccountDetailsHomeScreenContract$ModalStep.Confirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = com.revolut.feature.credit.core.R$string.refinancing_account_details_home_modal_info_title;
                f2 modal = ((RefinancingAccountDetailsHomeScreenContract$ModalStep.Confirmation) step2).f68254a;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i5, u.c(new TextClause(modal.f120589a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.refinancing_account_details_home_modal_info_primary_button, u.c(new TextClause(modal.f120591c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                aVar.f68257r.getClass();
                Intrinsics.checkNotNullParameter(modal, "modal");
                ArrayList arrayList = modal.f120590b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    ArrayList<c2> arrayList3 = ((e2) it9.next()).f120581a;
                    ArrayList arrayList4 = new ArrayList(w.t(arrayList3, i2));
                    for (c2 c2Var : arrayList3) {
                        String str = c2Var.f120563b;
                        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_constructor_info_item_row_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        String str2 = c2Var.f120564c;
                        if (str2 != null) {
                            it8 = it9;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_constructor_info_item_row_description, u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        } else {
                            it8 = it9;
                            textLocalisedClause = null;
                        }
                        c1 c1Var = c2Var.f120562a;
                        if (c1Var == null || (imageT1 = c1Var.T1()) == null) {
                            z = false;
                            image24 = null;
                        } else {
                            z = false;
                            image24 = new RowDelegate.Model.MainImage.Image24(imageT1, z, z, 6);
                        }
                        arrayList4.add(new RowDelegate.Model(str, image24, textLocalisedClause4, null, 0, textLocalisedClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                        it9 = it8;
                        z3 = z;
                    }
                    yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                    a0.x(arrayList4, arrayList2);
                    it9 = it9;
                    i2 = 10;
                }
                CreditItemsListController creditItemsListController = new CreditItemsListController(new yx4.c(textLocalisedClause2, textLocalisedClause3, arrayList2));
                dh4.n block2 = new dh4.n(aVar, 1);
                Intrinsics.checkNotNullParameter(block2, "block");
                creditItemsListController.H = block2;
                return creditItemsListController;
            case 2:
                final com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar2 = (com.revolut.feature.pay_bills_taxes.impl.ui_payment.a) obj4;
                PaymentFlowContract$Step step3 = (PaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof PaymentFlowContract$Step.Amount) {
                    PaymentAmountScreen paymentAmountScreen = new PaymentAmountScreen(((PaymentFlowContract$Step.Amount) step3).f78756a);
                    final Object[] objArr10 = objArr == true ? 1 : 0;
                    Function1 block3 = new Function1() { // from class: dh9.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (objArr10) {
                                case 0:
                                    g output = (g) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof eh9.c;
                                    com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar3 = aVar2;
                                    if (z4) {
                                        aVar3.C2(ef9.b.f125292a);
                                    } else if (output instanceof eh9.f) {
                                        eh9.f fVar = (eh9.f) output;
                                        aVar3.l2(new s0(aVar3, fVar.f125778a, fVar.f125779b, null, 5), new yi5.b(26));
                                    } else if (output instanceof eh9.d) {
                                        BillPaymentNavigation$InputData billPaymentNavigation$InputData = aVar3.o;
                                        eh9.d dVar = (eh9.d) output;
                                        h.t2(aVar3, aVar3.f78761s, new PaymentFlowContract$Step.Review(new PaymentReviewContract$InputData(billPaymentNavigation$InputData.f78670a, dVar.f125774a, dVar.f125775b, billPaymentNavigation$InputData.f, billPaymentNavigation$InputData.d.f, dVar.f125776c)), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                                    } else {
                                        if (!(output instanceof eh9.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar3.l2(new cq6.k(aVar3, null, 18), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    th9.g output2 = (th9.g) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z6 = output2 instanceof th9.c;
                                    com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar4 = aVar2;
                                    if (z6) {
                                        PaymentData paymentData = ((th9.c) output2).f271331a;
                                        BillPaymentNavigation$InputData billPaymentNavigation$InputData2 = aVar4.o;
                                        h.t2(aVar4, aVar4.f78761s, new PaymentFlowContract$Step.Amount(new PaymentAmountContract$InputData.WithTransferData(paymentData, billPaymentNavigation$InputData2.f78670a, billPaymentNavigation$InputData2.d, billPaymentNavigation$InputData2.e, true, false, false, false)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else if (output2 instanceof th9.f) {
                                        th9.f fVar2 = (th9.f) output2;
                                        aVar4.l2(new s0(aVar4, fVar2.f271334a, fVar2.f271335b, null, 5), new yi5.b(26));
                                    } else if (output2 instanceof th9.e) {
                                        aVar4.l2(new cq6.k(aVar4, null, 18), new yi5.b(26));
                                    } else {
                                        if (!(output2 instanceof th9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(aVar4.f78761s);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    paymentAmountScreen.H = block3;
                    return paymentAmountScreen;
                }
                if (!(step3 instanceof PaymentFlowContract$Step.Review)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentReviewScreen paymentReviewScreen = new PaymentReviewScreen(((PaymentFlowContract$Step.Review) step3).f78757a);
                final int i6 = 1;
                Function1 block4 = new Function1() { // from class: dh9.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i6) {
                            case 0:
                                g output = (g) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z4 = output instanceof eh9.c;
                                com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar3 = aVar2;
                                if (z4) {
                                    aVar3.C2(ef9.b.f125292a);
                                } else if (output instanceof eh9.f) {
                                    eh9.f fVar = (eh9.f) output;
                                    aVar3.l2(new s0(aVar3, fVar.f125778a, fVar.f125779b, null, 5), new yi5.b(26));
                                } else if (output instanceof eh9.d) {
                                    BillPaymentNavigation$InputData billPaymentNavigation$InputData = aVar3.o;
                                    eh9.d dVar = (eh9.d) output;
                                    h.t2(aVar3, aVar3.f78761s, new PaymentFlowContract$Step.Review(new PaymentReviewContract$InputData(billPaymentNavigation$InputData.f78670a, dVar.f125774a, dVar.f125775b, billPaymentNavigation$InputData.f, billPaymentNavigation$InputData.d.f, dVar.f125776c)), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                                } else {
                                    if (!(output instanceof eh9.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.l2(new cq6.k(aVar3, null, 18), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                th9.g output2 = (th9.g) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z6 = output2 instanceof th9.c;
                                com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar4 = aVar2;
                                if (z6) {
                                    PaymentData paymentData = ((th9.c) output2).f271331a;
                                    BillPaymentNavigation$InputData billPaymentNavigation$InputData2 = aVar4.o;
                                    h.t2(aVar4, aVar4.f78761s, new PaymentFlowContract$Step.Amount(new PaymentAmountContract$InputData.WithTransferData(paymentData, billPaymentNavigation$InputData2.f78670a, billPaymentNavigation$InputData2.d, billPaymentNavigation$InputData2.e, true, false, false, false)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                } else if (output2 instanceof th9.f) {
                                    th9.f fVar2 = (th9.f) output2;
                                    aVar4.l2(new s0(aVar4, fVar2.f271334a, fVar2.f271335b, null, 5), new yi5.b(26));
                                } else if (output2 instanceof th9.e) {
                                    aVar4.l2(new cq6.k(aVar4, null, 18), new yi5.b(26));
                                } else {
                                    if (!(output2 instanceof th9.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(aVar4.f78761s);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                paymentReviewScreen.H = block4;
                return paymentReviewScreen;
            case 3:
                di7.a params = (di7.a) obj2;
                List collections = (List) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(collections, "collections");
                ((di7.e) obj4).f114940a.f(params.a(), collections);
                return Unit.f186387a;
            case 4:
                com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar2 = (com.revolut.feature.junior_onboarding.impl.ui.onboarding.b) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                JuniorOnboardingFlowContract$Step step4 = (JuniorOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof JuniorOnboardingFlowContract$Step.OnboardingProductArticle)) {
                    if (step4 instanceof JuniorOnboardingFlowContract$Step.LimitReachedMaxGuardianAccount) {
                        return bVar2.K2(new TextLocalisedQuantityClause(R$plurals.rev_u18_accounts_limit_max_guardian_account_count_subtitle, Integer.valueOf(((JuniorOnboardingFlowContract$Step.LimitReachedMaxGuardianAccount) step4).f76998a), (List) null, (Style) null, 28));
                    }
                    if (step4 instanceof JuniorOnboardingFlowContract$Step.LimitReachedMaxTotalAccount) {
                        return bVar2.K2(new TextLocalisedQuantityClause(R$plurals.rev_u18_accounts_limit_max_total_account_count_subtitle, Integer.valueOf(((JuniorOnboardingFlowContract$Step.LimitReachedMaxTotalAccount) step4).f76999a), (List) null, (Style) null, 28));
                    }
                    if (step4 instanceof JuniorOnboardingFlowContract$Step.CreateJuniorAccount) {
                        return new JuniorCreationFlow();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ProductArticleParams productArticleParams = ((JuniorOnboardingFlowContract$Step.OnboardingProductArticle) step4).f77000a;
                k9 value = k9.Junior;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ViewController viewControllerE1 = bVar2.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, new AnalyticsProduct.Retail(value), null, false, 48));
                cn7.c block5 = new cn7.c(1, bVar2, com.revolut.feature.junior_onboarding.impl.ui.onboarding.b.class, "handleOnboardingProductArticleResult", "handleOnboardingProductArticleResult(Lcom/revolut/feature/product_article/api/flow/ProductArticleFlowContract$OutputData;)V", 0, 27);
                Intrinsics.checkNotNullParameter(block5, "block");
                viewControllerE1.H = block5;
                return viewControllerE1;
            case 5:
                final com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar = (com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d) obj4;
                final l FlowCoordinator = (l) obj2;
                final OpenFinanceFlowContract$Step step5 = (OpenFinanceFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof OpenFinanceFlowContract$Step.OpenFinance) {
                    OpenFinanceScreen openFinanceScreen = new OpenFinanceScreen();
                    final Object[] objArr11 = objArr3 == true ? 1 : 0;
                    Function1 block6 = new Function1() { // from class: dk6.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (objArr11) {
                                case 0:
                                    OpenFinanceScreenContract$Output result = (OpenFinanceScreenContract$Output) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result instanceof OpenFinanceScreenContract$Output.ConsentsGroupClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                    l lVar = FlowCoordinator;
                                    if (z4) {
                                        OpenFinanceScreenContract$Output.ConsentsGroupClicked consentsGroupClicked = (OpenFinanceScreenContract$Output.ConsentsGroupClicked) result;
                                        oki.h.t2(dVar2, lVar, new OpenFinanceFlowContract$Step.Consents(consentsGroupClicked.f72652a, consentsGroupClicked.f72653b), true, null, false, 12);
                                    } else if (result instanceof OpenFinanceScreenContract$Output.LinkedAccountsGroupClicked) {
                                        oki.h.t2(dVar2, lVar, new OpenFinanceFlowContract$Step.LinkedAccounts(((OpenFinanceScreenContract$Output.LinkedAccountsGroupClicked) result).f72654a), true, null, false, 12);
                                    } else if (result instanceof OpenFinanceScreenContract$Output.TransactionClicked) {
                                        dVar2.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((OpenFinanceScreenContract$Output.TransactionClicked) result).f72656a.f272581b), null, null, null, 126))));
                                    } else {
                                        if (!(result instanceof OpenFinanceScreenContract$Output.PixAutomaticoConsentsClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar2.C1(PixAutomaticoNavigation$Destination.f80501c);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    BrazilConsentsScreenContract$OutputData result2 = (BrazilConsentsScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z6 = result2 instanceof BrazilConsentsScreenContract$OutputData.OutboundConsentClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                    if (z6) {
                                        BrazilConsentsScreenContract$OutputData.OutboundConsentClicked outboundConsentClicked = (BrazilConsentsScreenContract$OutputData.OutboundConsentClicked) result2;
                                        oki.h.t2(dVar3, FlowCoordinator, new OpenFinanceFlowContract$Step.ConsentDetails(outboundConsentClicked.f72556a, false, outboundConsentClicked.f72557b), true, null, false, 12);
                                    } else if (result2 instanceof BrazilConsentsScreenContract$OutputData.InboundConsentClicked) {
                                        BrazilConsentsScreenContract$OutputData.InboundConsentClicked inboundConsentClicked = (BrazilConsentsScreenContract$OutputData.InboundConsentClicked) result2;
                                        oki.h.t2(dVar3, dVar3.f72691r, new OpenFinanceFlowContract$Step.InboundConsentDetails(inboundConsentClicked.f72554a, inboundConsentClicked.f72555b), true, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof BrazilConsentsScreenContract$OutputData.RevokeClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilConsentsScreenContract$OutputData.RevokeClicked revokeClicked = (BrazilConsentsScreenContract$OutputData.RevokeClicked) result2;
                                        oki.h.w2(dVar3.f72691r, new OpenFinanceFlowContract$Step.RevokeDialog(revokeClicked.f72559b, revokeClicked.f72558a, revokeClicked.f72560c, false), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    BrazilLinkedAccountsScreenContract$OutputData result3 = (BrazilLinkedAccountsScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z11 = result3 instanceof BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                    if (z11) {
                                        BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked linkedAccountClicked = (BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked) result3;
                                        oki.h.t2(dVar4, FlowCoordinator, new OpenFinanceFlowContract$Step.ConsentDetails(linkedAccountClicked.f72643a, true, linkedAccountClicked.f72644b), true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked revokeClicked2 = (BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked) result3;
                                        oki.h.w2(dVar4.f72691r, new OpenFinanceFlowContract$Step.RevokeDialog(revokeClicked2.f72646b, revokeClicked2.f72645a, revokeClicked2.f72647c, true), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    openFinanceScreen.H = block6;
                    return openFinanceScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.Consents) {
                    OpenFinanceFlowContract$Step.Consents consents = (OpenFinanceFlowContract$Step.Consents) step5;
                    BrazilConsentsScreen brazilConsentsScreen = new BrazilConsentsScreen(new BrazilConsentsScreenContract$InputData(consents.f72662a, consents.f72663b));
                    final int i21 = 1;
                    Function1 block7 = new Function1() { // from class: dk6.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    OpenFinanceScreenContract$Output result = (OpenFinanceScreenContract$Output) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result instanceof OpenFinanceScreenContract$Output.ConsentsGroupClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                    l lVar = FlowCoordinator;
                                    if (z4) {
                                        OpenFinanceScreenContract$Output.ConsentsGroupClicked consentsGroupClicked = (OpenFinanceScreenContract$Output.ConsentsGroupClicked) result;
                                        oki.h.t2(dVar2, lVar, new OpenFinanceFlowContract$Step.Consents(consentsGroupClicked.f72652a, consentsGroupClicked.f72653b), true, null, false, 12);
                                    } else if (result instanceof OpenFinanceScreenContract$Output.LinkedAccountsGroupClicked) {
                                        oki.h.t2(dVar2, lVar, new OpenFinanceFlowContract$Step.LinkedAccounts(((OpenFinanceScreenContract$Output.LinkedAccountsGroupClicked) result).f72654a), true, null, false, 12);
                                    } else if (result instanceof OpenFinanceScreenContract$Output.TransactionClicked) {
                                        dVar2.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((OpenFinanceScreenContract$Output.TransactionClicked) result).f72656a.f272581b), null, null, null, 126))));
                                    } else {
                                        if (!(result instanceof OpenFinanceScreenContract$Output.PixAutomaticoConsentsClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar2.C1(PixAutomaticoNavigation$Destination.f80501c);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    BrazilConsentsScreenContract$OutputData result2 = (BrazilConsentsScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z6 = result2 instanceof BrazilConsentsScreenContract$OutputData.OutboundConsentClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                    if (z6) {
                                        BrazilConsentsScreenContract$OutputData.OutboundConsentClicked outboundConsentClicked = (BrazilConsentsScreenContract$OutputData.OutboundConsentClicked) result2;
                                        oki.h.t2(dVar3, FlowCoordinator, new OpenFinanceFlowContract$Step.ConsentDetails(outboundConsentClicked.f72556a, false, outboundConsentClicked.f72557b), true, null, false, 12);
                                    } else if (result2 instanceof BrazilConsentsScreenContract$OutputData.InboundConsentClicked) {
                                        BrazilConsentsScreenContract$OutputData.InboundConsentClicked inboundConsentClicked = (BrazilConsentsScreenContract$OutputData.InboundConsentClicked) result2;
                                        oki.h.t2(dVar3, dVar3.f72691r, new OpenFinanceFlowContract$Step.InboundConsentDetails(inboundConsentClicked.f72554a, inboundConsentClicked.f72555b), true, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof BrazilConsentsScreenContract$OutputData.RevokeClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilConsentsScreenContract$OutputData.RevokeClicked revokeClicked = (BrazilConsentsScreenContract$OutputData.RevokeClicked) result2;
                                        oki.h.w2(dVar3.f72691r, new OpenFinanceFlowContract$Step.RevokeDialog(revokeClicked.f72559b, revokeClicked.f72558a, revokeClicked.f72560c, false), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    BrazilLinkedAccountsScreenContract$OutputData result3 = (BrazilLinkedAccountsScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z11 = result3 instanceof BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                    if (z11) {
                                        BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked linkedAccountClicked = (BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked) result3;
                                        oki.h.t2(dVar4, FlowCoordinator, new OpenFinanceFlowContract$Step.ConsentDetails(linkedAccountClicked.f72643a, true, linkedAccountClicked.f72644b), true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked revokeClicked2 = (BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked) result3;
                                        oki.h.w2(dVar4.f72691r, new OpenFinanceFlowContract$Step.RevokeDialog(revokeClicked2.f72646b, revokeClicked2.f72645a, revokeClicked2.f72647c, true), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    brazilConsentsScreen.H = block7;
                    return brazilConsentsScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.LinkedAccounts) {
                    BrazilLinkedAccountsScreen brazilLinkedAccountsScreen = new BrazilLinkedAccountsScreen(new BrazilLinkedAccountsScreenContract$InputData(((OpenFinanceFlowContract$Step.LinkedAccounts) step5).f72678a));
                    final int i22 = 2;
                    Function1 block8 = new Function1() { // from class: dk6.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    OpenFinanceScreenContract$Output result = (OpenFinanceScreenContract$Output) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result instanceof OpenFinanceScreenContract$Output.ConsentsGroupClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                    l lVar = FlowCoordinator;
                                    if (z4) {
                                        OpenFinanceScreenContract$Output.ConsentsGroupClicked consentsGroupClicked = (OpenFinanceScreenContract$Output.ConsentsGroupClicked) result;
                                        oki.h.t2(dVar2, lVar, new OpenFinanceFlowContract$Step.Consents(consentsGroupClicked.f72652a, consentsGroupClicked.f72653b), true, null, false, 12);
                                    } else if (result instanceof OpenFinanceScreenContract$Output.LinkedAccountsGroupClicked) {
                                        oki.h.t2(dVar2, lVar, new OpenFinanceFlowContract$Step.LinkedAccounts(((OpenFinanceScreenContract$Output.LinkedAccountsGroupClicked) result).f72654a), true, null, false, 12);
                                    } else if (result instanceof OpenFinanceScreenContract$Output.TransactionClicked) {
                                        dVar2.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((OpenFinanceScreenContract$Output.TransactionClicked) result).f72656a.f272581b), null, null, null, 126))));
                                    } else {
                                        if (!(result instanceof OpenFinanceScreenContract$Output.PixAutomaticoConsentsClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar2.C1(PixAutomaticoNavigation$Destination.f80501c);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    BrazilConsentsScreenContract$OutputData result2 = (BrazilConsentsScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z6 = result2 instanceof BrazilConsentsScreenContract$OutputData.OutboundConsentClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                    if (z6) {
                                        BrazilConsentsScreenContract$OutputData.OutboundConsentClicked outboundConsentClicked = (BrazilConsentsScreenContract$OutputData.OutboundConsentClicked) result2;
                                        oki.h.t2(dVar3, FlowCoordinator, new OpenFinanceFlowContract$Step.ConsentDetails(outboundConsentClicked.f72556a, false, outboundConsentClicked.f72557b), true, null, false, 12);
                                    } else if (result2 instanceof BrazilConsentsScreenContract$OutputData.InboundConsentClicked) {
                                        BrazilConsentsScreenContract$OutputData.InboundConsentClicked inboundConsentClicked = (BrazilConsentsScreenContract$OutputData.InboundConsentClicked) result2;
                                        oki.h.t2(dVar3, dVar3.f72691r, new OpenFinanceFlowContract$Step.InboundConsentDetails(inboundConsentClicked.f72554a, inboundConsentClicked.f72555b), true, null, false, 12);
                                    } else {
                                        if (!(result2 instanceof BrazilConsentsScreenContract$OutputData.RevokeClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilConsentsScreenContract$OutputData.RevokeClicked revokeClicked = (BrazilConsentsScreenContract$OutputData.RevokeClicked) result2;
                                        oki.h.w2(dVar3.f72691r, new OpenFinanceFlowContract$Step.RevokeDialog(revokeClicked.f72559b, revokeClicked.f72558a, revokeClicked.f72560c, false), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    BrazilLinkedAccountsScreenContract$OutputData result3 = (BrazilLinkedAccountsScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z11 = result3 instanceof BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                    if (z11) {
                                        BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked linkedAccountClicked = (BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked) result3;
                                        oki.h.t2(dVar4, FlowCoordinator, new OpenFinanceFlowContract$Step.ConsentDetails(linkedAccountClicked.f72643a, true, linkedAccountClicked.f72644b), true, null, false, 12);
                                    } else {
                                        if (!(result3 instanceof BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked revokeClicked2 = (BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked) result3;
                                        oki.h.w2(dVar4.f72691r, new OpenFinanceFlowContract$Step.RevokeDialog(revokeClicked2.f72646b, revokeClicked2.f72645a, revokeClicked2.f72647c, true), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    brazilLinkedAccountsScreen.H = block8;
                    return brazilLinkedAccountsScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.ConsentDetails) {
                    OpenFinanceFlowContract$Step.ConsentDetails consentDetails = (OpenFinanceFlowContract$Step.ConsentDetails) step5;
                    BrazilConsentDetailsScreen brazilConsentDetailsScreen = new BrazilConsentDetailsScreen(new BrazilConsentDetailsScreenContract$InputData(consentDetails.f72659a, consentDetails.f72660b));
                    g0 block9 = new g0(dVar, 19, FlowCoordinator, step5);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    brazilConsentDetailsScreen.H = block9;
                    return brazilConsentDetailsScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.LimitUpdate) {
                    OpenFinanceFlowContract$Step.LimitUpdate limitUpdate = (OpenFinanceFlowContract$Step.LimitUpdate) step5;
                    final int i32 = 1;
                    BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = new BrPaymentLimitsUpdateScreen(new BrPaymentLimitsUpdateScreenContract$InputData(limitUpdate.f72676c, limitUpdate.f72677g, true));
                    Function1 block10 = new Function1() { // from class: dk6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i32) {
                                case 0:
                                    dii.g outputData = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        OpenFinanceFlowContract$Step.InboundRevokeDialog inboundRevokeDialog = (OpenFinanceFlowContract$Step.InboundRevokeDialog) step5;
                                        String str3 = inboundRevokeDialog.f72672b;
                                        boolean z4 = inboundRevokeDialog.f72673c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                        dVar2.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.c(dVar2, z4, str3, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.LimitUpdate limitUpdate2 = (OpenFinanceFlowContract$Step.LimitUpdate) step5;
                                    String str4 = limitUpdate2.f72674a;
                                    boolean z6 = limitUpdate2.d;
                                    ArrayList<OpenBankingBrazilPayment.EditableMoneyField> arrayList5 = limitUpdate2.e;
                                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                    for (OpenBankingBrazilPayment.EditableMoneyField editableMoneyFieldA : arrayList5) {
                                        if (Intrinsics.f(editableMoneyFieldA.f72402a, limitUpdate2.f72675b)) {
                                            editableMoneyFieldA = OpenBankingBrazilPayment.EditableMoneyField.a(editableMoneyFieldA, ((BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated) result).f72621a);
                                        }
                                        arrayList6.add(editableMoneyFieldA);
                                    }
                                    OpenBankingBrazilPayment.EditableDateField editableDateField = limitUpdate2.f;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                    dVar3.l2(new h(dVar3, str4, z6, false, arrayList6, editableDateField, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.ExpiryDateUpdate expiryDateUpdate = (OpenFinanceFlowContract$Step.ExpiryDateUpdate) step5;
                                    String str5 = expiryDateUpdate.f72666a;
                                    boolean z11 = expiryDateUpdate.f72667b;
                                    ArrayList arrayList7 = expiryDateUpdate.d;
                                    OpenBankingBrazilPayment.EditableDateField editableDateFieldA = OpenBankingBrazilPayment.EditableDateField.a(expiryDateUpdate.f72668c, ((BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated) result2).f72715a);
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                    dVar4.l2(new h(dVar4, str5, z11, true, arrayList7, editableDateFieldA, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    am6.d result3 = (am6.d) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, d.a.f6289a)) {
                                        if (!(result3 instanceof d.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        OpenFinanceFlowContract$Step.RevokeDialog revokeDialog = (OpenFinanceFlowContract$Step.RevokeDialog) step5;
                                        String str6 = revokeDialog.f72681b;
                                        boolean z12 = revokeDialog.f72682c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar5 = dVar;
                                        dVar5.l2(new z(dVar5, revokeDialog.d, str6, z12, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.e result4 = (ste.e) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof e.a)) {
                                        if (!(result4 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar6 = dVar;
                                        dVar6.l2(new d3i.g(dVar6, step5, null, 25), new yi5.b(26));
                                        dVar6.X1(new mii.k("ID_TOAST_ALIAS_SAVED", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_mandate_details_update_message_toast_title, null, null, 14), null, null, null, 28));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    brPaymentLimitsUpdateScreen.H = block10;
                    return brPaymentLimitsUpdateScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.ExpiryDateUpdate) {
                    BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen = new BrPaymentExpiryDateUpdateScreen(new BrPaymentExpiryDateUpdateScreenContract$InputData(((OpenFinanceFlowContract$Step.ExpiryDateUpdate) step5).f72668c.f72401b, null));
                    final int i33 = 2;
                    Function1 block11 = new Function1() { // from class: dk6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i33) {
                                case 0:
                                    dii.g outputData = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        OpenFinanceFlowContract$Step.InboundRevokeDialog inboundRevokeDialog = (OpenFinanceFlowContract$Step.InboundRevokeDialog) step5;
                                        String str3 = inboundRevokeDialog.f72672b;
                                        boolean z4 = inboundRevokeDialog.f72673c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                        dVar2.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.c(dVar2, z4, str3, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.LimitUpdate limitUpdate2 = (OpenFinanceFlowContract$Step.LimitUpdate) step5;
                                    String str4 = limitUpdate2.f72674a;
                                    boolean z6 = limitUpdate2.d;
                                    ArrayList<OpenBankingBrazilPayment.EditableMoneyField> arrayList5 = limitUpdate2.e;
                                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                    for (OpenBankingBrazilPayment.EditableMoneyField editableMoneyFieldA : arrayList5) {
                                        if (Intrinsics.f(editableMoneyFieldA.f72402a, limitUpdate2.f72675b)) {
                                            editableMoneyFieldA = OpenBankingBrazilPayment.EditableMoneyField.a(editableMoneyFieldA, ((BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated) result).f72621a);
                                        }
                                        arrayList6.add(editableMoneyFieldA);
                                    }
                                    OpenBankingBrazilPayment.EditableDateField editableDateField = limitUpdate2.f;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                    dVar3.l2(new h(dVar3, str4, z6, false, arrayList6, editableDateField, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.ExpiryDateUpdate expiryDateUpdate = (OpenFinanceFlowContract$Step.ExpiryDateUpdate) step5;
                                    String str5 = expiryDateUpdate.f72666a;
                                    boolean z11 = expiryDateUpdate.f72667b;
                                    ArrayList arrayList7 = expiryDateUpdate.d;
                                    OpenBankingBrazilPayment.EditableDateField editableDateFieldA = OpenBankingBrazilPayment.EditableDateField.a(expiryDateUpdate.f72668c, ((BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated) result2).f72715a);
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                    dVar4.l2(new h(dVar4, str5, z11, true, arrayList7, editableDateFieldA, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    am6.d result3 = (am6.d) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, d.a.f6289a)) {
                                        if (!(result3 instanceof d.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        OpenFinanceFlowContract$Step.RevokeDialog revokeDialog = (OpenFinanceFlowContract$Step.RevokeDialog) step5;
                                        String str6 = revokeDialog.f72681b;
                                        boolean z12 = revokeDialog.f72682c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar5 = dVar;
                                        dVar5.l2(new z(dVar5, revokeDialog.d, str6, z12, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.e result4 = (ste.e) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof e.a)) {
                                        if (!(result4 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar6 = dVar;
                                        dVar6.l2(new d3i.g(dVar6, step5, null, 25), new yi5.b(26));
                                        dVar6.X1(new mii.k("ID_TOAST_ALIAS_SAVED", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_mandate_details_update_message_toast_title, null, null, 14), null, null, null, 28));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    brPaymentExpiryDateUpdateScreen.H = block11;
                    return brPaymentExpiryDateUpdateScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.RevokeDialog) {
                    RevokeConsentBottomSheetScreen revokeConsentBottomSheetScreen = new RevokeConsentBottomSheetScreen(new RevokeConsentBottomSheetScreenContract$InputData(((OpenFinanceFlowContract$Step.RevokeDialog) step5).f72680a));
                    Function1 block12 = new Function1() { // from class: dk6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    dii.g outputData = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        OpenFinanceFlowContract$Step.InboundRevokeDialog inboundRevokeDialog = (OpenFinanceFlowContract$Step.InboundRevokeDialog) step5;
                                        String str3 = inboundRevokeDialog.f72672b;
                                        boolean z4 = inboundRevokeDialog.f72673c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                        dVar2.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.c(dVar2, z4, str3, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.LimitUpdate limitUpdate2 = (OpenFinanceFlowContract$Step.LimitUpdate) step5;
                                    String str4 = limitUpdate2.f72674a;
                                    boolean z6 = limitUpdate2.d;
                                    ArrayList<OpenBankingBrazilPayment.EditableMoneyField> arrayList5 = limitUpdate2.e;
                                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                    for (OpenBankingBrazilPayment.EditableMoneyField editableMoneyFieldA : arrayList5) {
                                        if (Intrinsics.f(editableMoneyFieldA.f72402a, limitUpdate2.f72675b)) {
                                            editableMoneyFieldA = OpenBankingBrazilPayment.EditableMoneyField.a(editableMoneyFieldA, ((BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated) result).f72621a);
                                        }
                                        arrayList6.add(editableMoneyFieldA);
                                    }
                                    OpenBankingBrazilPayment.EditableDateField editableDateField = limitUpdate2.f;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                    dVar3.l2(new h(dVar3, str4, z6, false, arrayList6, editableDateField, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.ExpiryDateUpdate expiryDateUpdate = (OpenFinanceFlowContract$Step.ExpiryDateUpdate) step5;
                                    String str5 = expiryDateUpdate.f72666a;
                                    boolean z11 = expiryDateUpdate.f72667b;
                                    ArrayList arrayList7 = expiryDateUpdate.d;
                                    OpenBankingBrazilPayment.EditableDateField editableDateFieldA = OpenBankingBrazilPayment.EditableDateField.a(expiryDateUpdate.f72668c, ((BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated) result2).f72715a);
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                    dVar4.l2(new h(dVar4, str5, z11, true, arrayList7, editableDateFieldA, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    am6.d result3 = (am6.d) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, d.a.f6289a)) {
                                        if (!(result3 instanceof d.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        OpenFinanceFlowContract$Step.RevokeDialog revokeDialog = (OpenFinanceFlowContract$Step.RevokeDialog) step5;
                                        String str6 = revokeDialog.f72681b;
                                        boolean z12 = revokeDialog.f72682c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar5 = dVar;
                                        dVar5.l2(new z(dVar5, revokeDialog.d, str6, z12, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.e result4 = (ste.e) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof e.a)) {
                                        if (!(result4 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar6 = dVar;
                                        dVar6.l2(new d3i.g(dVar6, step5, null, 25), new yi5.b(26));
                                        dVar6.X1(new mii.k("ID_TOAST_ALIAS_SAVED", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_mandate_details_update_message_toast_title, null, null, 14), null, null, null, 28));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    revokeConsentBottomSheetScreen.H = block12;
                    return revokeConsentBottomSheetScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.InboundConsentDetails) {
                    BrazilInboundConsentDetailsScreen brazilInboundConsentDetailsScreen = new BrazilInboundConsentDetailsScreen(new BrazilInboundConsentDetailsScreenContract$InputData(((OpenFinanceFlowContract$Step.InboundConsentDetails) step5).f72669a));
                    m0 block13 = new m0(dVar, FlowCoordinator, step5);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    brazilInboundConsentDetailsScreen.H = block13;
                    return brazilInboundConsentDetailsScreen;
                }
                if (step5 instanceof OpenFinanceFlowContract$Step.EditAlias) {
                    OpenFinanceFlowContract$Step.EditAlias editAlias = (OpenFinanceFlowContract$Step.EditAlias) step5;
                    ViewController viewControllerE12 = dVar.e1(new ste.f(new EditStoredMethodLabelDescriptor$InputData(editAlias.f72664a, "", editAlias.f72665b, null, ste.d.Brazil)));
                    final int i43 = 4;
                    Function1 block14 = new Function1() { // from class: dk6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i43) {
                                case 0:
                                    dii.g outputData = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        OpenFinanceFlowContract$Step.InboundRevokeDialog inboundRevokeDialog = (OpenFinanceFlowContract$Step.InboundRevokeDialog) step5;
                                        String str3 = inboundRevokeDialog.f72672b;
                                        boolean z4 = inboundRevokeDialog.f72673c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                        dVar2.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.c(dVar2, z4, str3, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.LimitUpdate limitUpdate2 = (OpenFinanceFlowContract$Step.LimitUpdate) step5;
                                    String str4 = limitUpdate2.f72674a;
                                    boolean z6 = limitUpdate2.d;
                                    ArrayList<OpenBankingBrazilPayment.EditableMoneyField> arrayList5 = limitUpdate2.e;
                                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                    for (OpenBankingBrazilPayment.EditableMoneyField editableMoneyFieldA : arrayList5) {
                                        if (Intrinsics.f(editableMoneyFieldA.f72402a, limitUpdate2.f72675b)) {
                                            editableMoneyFieldA = OpenBankingBrazilPayment.EditableMoneyField.a(editableMoneyFieldA, ((BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated) result).f72621a);
                                        }
                                        arrayList6.add(editableMoneyFieldA);
                                    }
                                    OpenBankingBrazilPayment.EditableDateField editableDateField = limitUpdate2.f;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                    dVar3.l2(new h(dVar3, str4, z6, false, arrayList6, editableDateField, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 2:
                                    BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.ExpiryDateUpdate expiryDateUpdate = (OpenFinanceFlowContract$Step.ExpiryDateUpdate) step5;
                                    String str5 = expiryDateUpdate.f72666a;
                                    boolean z11 = expiryDateUpdate.f72667b;
                                    ArrayList arrayList7 = expiryDateUpdate.d;
                                    OpenBankingBrazilPayment.EditableDateField editableDateFieldA = OpenBankingBrazilPayment.EditableDateField.a(expiryDateUpdate.f72668c, ((BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated) result2).f72715a);
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                    dVar4.l2(new h(dVar4, str5, z11, true, arrayList7, editableDateFieldA, null), new yi5.b(26));
                                    return Unit.f186387a;
                                case 3:
                                    am6.d result3 = (am6.d) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!Intrinsics.f(result3, d.a.f6289a)) {
                                        if (!(result3 instanceof d.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        OpenFinanceFlowContract$Step.RevokeDialog revokeDialog = (OpenFinanceFlowContract$Step.RevokeDialog) step5;
                                        String str6 = revokeDialog.f72681b;
                                        boolean z12 = revokeDialog.f72682c;
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar5 = dVar;
                                        dVar5.l2(new z(dVar5, revokeDialog.d, str6, z12, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    ste.e result4 = (ste.e) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (!(result4 instanceof e.a)) {
                                        if (!(result4 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar6 = dVar;
                                        dVar6.l2(new d3i.g(dVar6, step5, null, 25), new yi5.b(26));
                                        dVar6.X1(new mii.k("ID_TOAST_ALIAS_SAVED", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_mandate_details_update_message_toast_title, null, null, 14), null, null, null, 28));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    viewControllerE12.H = block14;
                    return viewControllerE12;
                }
                if (!(step5 instanceof OpenFinanceFlowContract$Step.InboundRevokeDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                mj6.l lVar = dVar.f72690q;
                String thirdPartyTitle = ((OpenFinanceFlowContract$Step.InboundRevokeDialog) step5).f72671a;
                k9 value2 = k9.OpenBanking;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value2);
                lVar.getClass();
                Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_revoke_sheet_title, u.c(thirdPartyTitle), null, 12), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_revoke_sheet_subtitle, u.c(thirdPartyTitle), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_revoke_sheet_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_revoke_sheet_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, null, null, 24));
                final Object[] objArr12 = objArr2 == true ? 1 : 0;
                Function1 block15 = new Function1() { // from class: dk6.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (objArr12) {
                            case 0:
                                dii.g outputData = (dii.g) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof dii.e) {
                                    OpenFinanceFlowContract$Step.InboundRevokeDialog inboundRevokeDialog = (OpenFinanceFlowContract$Step.InboundRevokeDialog) step5;
                                    String str3 = inboundRevokeDialog.f72672b;
                                    boolean z4 = inboundRevokeDialog.f72673c;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar2 = dVar;
                                    dVar2.l2(new com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.c(dVar2, z4, str3, null), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 1:
                                BrPaymentLimitsUpdateScreenContract$OutputData result = (BrPaymentLimitsUpdateScreenContract$OutputData) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!(result instanceof BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                OpenFinanceFlowContract$Step.LimitUpdate limitUpdate2 = (OpenFinanceFlowContract$Step.LimitUpdate) step5;
                                String str4 = limitUpdate2.f72674a;
                                boolean z6 = limitUpdate2.d;
                                ArrayList<OpenBankingBrazilPayment.EditableMoneyField> arrayList5 = limitUpdate2.e;
                                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                                for (OpenBankingBrazilPayment.EditableMoneyField editableMoneyFieldA : arrayList5) {
                                    if (Intrinsics.f(editableMoneyFieldA.f72402a, limitUpdate2.f72675b)) {
                                        editableMoneyFieldA = OpenBankingBrazilPayment.EditableMoneyField.a(editableMoneyFieldA, ((BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated) result).f72621a);
                                    }
                                    arrayList6.add(editableMoneyFieldA);
                                }
                                OpenBankingBrazilPayment.EditableDateField editableDateField = limitUpdate2.f;
                                com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar3 = dVar;
                                dVar3.l2(new h(dVar3, str4, z6, false, arrayList6, editableDateField, null), new yi5.b(26));
                                return Unit.f186387a;
                            case 2:
                                BrPaymentExpiryDateUpdateScreenContract$OutputData result2 = (BrPaymentExpiryDateUpdateScreenContract$OutputData) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (!(result2 instanceof BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                OpenFinanceFlowContract$Step.ExpiryDateUpdate expiryDateUpdate = (OpenFinanceFlowContract$Step.ExpiryDateUpdate) step5;
                                String str5 = expiryDateUpdate.f72666a;
                                boolean z11 = expiryDateUpdate.f72667b;
                                ArrayList arrayList7 = expiryDateUpdate.d;
                                OpenBankingBrazilPayment.EditableDateField editableDateFieldA = OpenBankingBrazilPayment.EditableDateField.a(expiryDateUpdate.f72668c, ((BrPaymentExpiryDateUpdateScreenContract$OutputData.DateUpdated) result2).f72715a);
                                com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar4 = dVar;
                                dVar4.l2(new h(dVar4, str5, z11, true, arrayList7, editableDateFieldA, null), new yi5.b(26));
                                return Unit.f186387a;
                            case 3:
                                am6.d result3 = (am6.d) obj5;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (!Intrinsics.f(result3, d.a.f6289a)) {
                                    if (!(result3 instanceof d.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OpenFinanceFlowContract$Step.RevokeDialog revokeDialog = (OpenFinanceFlowContract$Step.RevokeDialog) step5;
                                    String str6 = revokeDialog.f72681b;
                                    boolean z12 = revokeDialog.f72682c;
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar5 = dVar;
                                    dVar5.l2(new z(dVar5, revokeDialog.d, str6, z12, null, 1), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                ste.e result4 = (ste.e) obj5;
                                Intrinsics.checkNotNullParameter(result4, "result");
                                if (!(result4 instanceof e.a)) {
                                    if (!(result4 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d dVar6 = dVar;
                                    dVar6.l2(new d3i.g(dVar6, step5, null, 25), new yi5.b(26));
                                    dVar6.X1(new mii.k("ID_TOAST_ALIAS_SAVED", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_mandate_details_update_message_toast_title, null, null, 14), null, null, null, 28));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block15, "block");
                actionsBottomSheetController.H = block15;
                return actionsBottomSheetController;
            case 6:
                com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a aVar3 = (com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SavingsChallengeSetUpScreenContract$ModalStep step6 = (SavingsChallengeSetUpScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof SavingsChallengeSetUpScreenContract$ModalStep.PrizeDrawEntries)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.f83197p.getClass();
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_onboarding_sheet_entries_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_onboarding_sheet_entries_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, yjb.c.a(), null, null, 55);
                k9 k9Var = k9.Savings;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar4, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            case 7:
                com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.a aVar5 = (com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                CustomRatingFlowContract$Step step7 = (CustomRatingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, CustomRatingFlowContract$Step.BottomDialog.f87358a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomRatingBottomSheetController customRatingBottomSheetController = new CustomRatingBottomSheetController(new CustomRatingBottomSheetContract$InputData(aVar5.o.f87357a));
                customRatingBottomSheetController.l2(new dld.c(aVar5, LazyFlowCoordinator3, objArr4 == true ? 1 : 0));
                return customRatingBottomSheetController;
            case 8:
                final com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e) obj4;
                PlanCancelFlowContract$Step step8 = (PlanCancelFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof PlanCancelFlowContract$Step.Features) {
                    PlanCancelFeaturesScreen planCancelFeaturesScreen = new PlanCancelFeaturesScreen(new PlanCancelFeaturesScreenContract$InputData(PlanCancelFeatures$CancelReason.StandardPlan.f102912a, eVar2.z.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c)));
                    final Object[] objArr13 = objArr5 == true ? 1 : 0;
                    Function1 block16 = new Function1() { // from class: dlk.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (objArr13) {
                                case 0:
                                    igk.f output = (igk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof f.a;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar3 = eVar2;
                                    if (z4) {
                                        eVar3.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output instanceof f.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.l2(new k(eVar3, new e(eVar3, 0), null, 0), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ilk.f output2 = (ilk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar4 = eVar2;
                                    e eVar5 = new e(eVar4, 1);
                                    qki.d dVar2 = eVar4.A;
                                    if (output2 instanceof ilk.e) {
                                        eVar4.H2(dVar2, new l0(output2, 26));
                                        int i59 = f.f115784a[((ilk.e) output2).f162254a.ordinal()];
                                        if (i59 == 1) {
                                            oki.h.t2(eVar4, eVar4.C, PlanCancelFlowContract$Step.ChatWithSupport.f103485a, true, null, false, 12);
                                        } else if (i59 != 2) {
                                            eVar5.invoke();
                                        } else {
                                            eVar4.l2(new k(eVar4, eVar5, null, 1), new yi5.b(26));
                                        }
                                    } else {
                                        if (!Intrinsics.f(output2, f.a.f162255a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar4.H2(dVar2, new dkk.m(25));
                                        eVar5.invoke();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.full_screen_prompt.c output3 = (com.revolut.feature.full_screen_prompt.c) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof d67.h) && !Intrinsics.f(output3, c.b.f74505a)) {
                                        boolean zF = Intrinsics.f(output3, c.C0497c.f74506a);
                                        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar6 = eVar2;
                                        if (zF) {
                                            eVar6.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                        } else if (output3 instanceof c.a) {
                                            eVar6.C.e(false);
                                        } else {
                                            if (!Intrinsics.f(output3, c.d.f74507a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar6.L2(t.CHAT_CLOSE);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    olk.f output4 = (olk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof olk.g;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar7 = eVar2;
                                    if (z6) {
                                        eVar7.H2(eVar7.A, new l0(output4, 25));
                                        eVar7.l2(new g(eVar7, null, 2), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(output4, f.a.f226441a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar7.C2(a.C0637a.f103489a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    glk.j output5 = (glk.j) obj5;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean zF2 = Intrinsics.f(output5, glk.h.f144720a);
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar8 = eVar2;
                                    if (zF2) {
                                        eVar8.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output5 instanceof glk.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar8.C1(foh.i.i(((glk.i) output5).f144721a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    planCancelFeaturesScreen.H = block16;
                    return planCancelFeaturesScreen;
                }
                if (step8 instanceof PlanCancelFlowContract$Step.DowngradeReason) {
                    PlanDowngradeReasonScreen planDowngradeReasonScreen = new PlanDowngradeReasonScreen();
                    final int i59 = 1;
                    Function1 function1 = new Function1() { // from class: dlk.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i59) {
                                case 0:
                                    igk.f output = (igk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof f.a;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar3 = eVar2;
                                    if (z4) {
                                        eVar3.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output instanceof f.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.l2(new k(eVar3, new e(eVar3, 0), null, 0), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ilk.f output2 = (ilk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar4 = eVar2;
                                    e eVar5 = new e(eVar4, 1);
                                    qki.d dVar2 = eVar4.A;
                                    if (output2 instanceof ilk.e) {
                                        eVar4.H2(dVar2, new l0(output2, 26));
                                        int i592 = f.f115784a[((ilk.e) output2).f162254a.ordinal()];
                                        if (i592 == 1) {
                                            oki.h.t2(eVar4, eVar4.C, PlanCancelFlowContract$Step.ChatWithSupport.f103485a, true, null, false, 12);
                                        } else if (i592 != 2) {
                                            eVar5.invoke();
                                        } else {
                                            eVar4.l2(new k(eVar4, eVar5, null, 1), new yi5.b(26));
                                        }
                                    } else {
                                        if (!Intrinsics.f(output2, f.a.f162255a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar4.H2(dVar2, new dkk.m(25));
                                        eVar5.invoke();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.full_screen_prompt.c output3 = (com.revolut.feature.full_screen_prompt.c) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof d67.h) && !Intrinsics.f(output3, c.b.f74505a)) {
                                        boolean zF = Intrinsics.f(output3, c.C0497c.f74506a);
                                        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar6 = eVar2;
                                        if (zF) {
                                            eVar6.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                        } else if (output3 instanceof c.a) {
                                            eVar6.C.e(false);
                                        } else {
                                            if (!Intrinsics.f(output3, c.d.f74507a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar6.L2(t.CHAT_CLOSE);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    olk.f output4 = (olk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof olk.g;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar7 = eVar2;
                                    if (z6) {
                                        eVar7.H2(eVar7.A, new l0(output4, 25));
                                        eVar7.l2(new g(eVar7, null, 2), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(output4, f.a.f226441a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar7.C2(a.C0637a.f103489a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    glk.j output5 = (glk.j) obj5;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean zF2 = Intrinsics.f(output5, glk.h.f144720a);
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar8 = eVar2;
                                    if (zF2) {
                                        eVar8.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output5 instanceof glk.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar8.C1(foh.i.i(((glk.i) output5).f144721a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    planDowngradeReasonScreen.H = function1;
                    return planDowngradeReasonScreen;
                }
                if (step8 instanceof PlanCancelFlowContract$Step.ChatWithSupport) {
                    eVar2.f103499p.getClass();
                    TextLocalisedClause title = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_downgrade_get_help_title, null, null, 14);
                    TextLocalisedClause description = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_downgrade_get_help_subtitle, null, null, 14);
                    CdnImage image = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D023", null, null, null, 30);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_downgrade_get_help_action_speak_to_support, null, null, 14);
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_downgrade_get_help_action_end_subscription, null, null, 14);
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(image, "image");
                    FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, title, description, null, image, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, textLocalisedClause5, textLocalisedClause6, true, null, null, null, false, 16741324));
                    final int i66 = 2;
                    Function1 block17 = new Function1() { // from class: dlk.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i66) {
                                case 0:
                                    igk.f output = (igk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof f.a;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar3 = eVar2;
                                    if (z4) {
                                        eVar3.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output instanceof f.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.l2(new k(eVar3, new e(eVar3, 0), null, 0), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ilk.f output2 = (ilk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar4 = eVar2;
                                    e eVar5 = new e(eVar4, 1);
                                    qki.d dVar2 = eVar4.A;
                                    if (output2 instanceof ilk.e) {
                                        eVar4.H2(dVar2, new l0(output2, 26));
                                        int i592 = f.f115784a[((ilk.e) output2).f162254a.ordinal()];
                                        if (i592 == 1) {
                                            oki.h.t2(eVar4, eVar4.C, PlanCancelFlowContract$Step.ChatWithSupport.f103485a, true, null, false, 12);
                                        } else if (i592 != 2) {
                                            eVar5.invoke();
                                        } else {
                                            eVar4.l2(new k(eVar4, eVar5, null, 1), new yi5.b(26));
                                        }
                                    } else {
                                        if (!Intrinsics.f(output2, f.a.f162255a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar4.H2(dVar2, new dkk.m(25));
                                        eVar5.invoke();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.full_screen_prompt.c output3 = (com.revolut.feature.full_screen_prompt.c) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof d67.h) && !Intrinsics.f(output3, c.b.f74505a)) {
                                        boolean zF = Intrinsics.f(output3, c.C0497c.f74506a);
                                        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar6 = eVar2;
                                        if (zF) {
                                            eVar6.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                        } else if (output3 instanceof c.a) {
                                            eVar6.C.e(false);
                                        } else {
                                            if (!Intrinsics.f(output3, c.d.f74507a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar6.L2(t.CHAT_CLOSE);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    olk.f output4 = (olk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof olk.g;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar7 = eVar2;
                                    if (z6) {
                                        eVar7.H2(eVar7.A, new l0(output4, 25));
                                        eVar7.l2(new g(eVar7, null, 2), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(output4, f.a.f226441a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar7.C2(a.C0637a.f103489a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    glk.j output5 = (glk.j) obj5;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean zF2 = Intrinsics.f(output5, glk.h.f144720a);
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar8 = eVar2;
                                    if (zF2) {
                                        eVar8.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output5 instanceof glk.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar8.C1(foh.i.i(((glk.i) output5).f144721a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    fullScreenPromptScreen.H = block17;
                    return fullScreenPromptScreen;
                }
                if (step8 instanceof PlanCancelFlowContract$Step.Feedback) {
                    iha.a aVar6 = ((PlanCancelFlowContract$DomainState) ((j2) eVar2.A.f22677a).getValue()).f103480a;
                    PlanCancelFlowContract$InputData planCancelFlowContract$InputData = eVar2.o;
                    PlanCancelFeedbackScreen planCancelFeedbackScreen = new PlanCancelFeedbackScreen(new PlanCancelFeedbackScreenContract$InputData(aVar6, planCancelFlowContract$InputData.f103482a, planCancelFlowContract$InputData.f103483b));
                    Function1 block18 = new Function1() { // from class: dlk.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    igk.f output = (igk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof f.a;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar3 = eVar2;
                                    if (z4) {
                                        eVar3.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output instanceof f.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar3.l2(new k(eVar3, new e(eVar3, 0), null, 0), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ilk.f output2 = (ilk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar4 = eVar2;
                                    e eVar5 = new e(eVar4, 1);
                                    qki.d dVar2 = eVar4.A;
                                    if (output2 instanceof ilk.e) {
                                        eVar4.H2(dVar2, new l0(output2, 26));
                                        int i592 = f.f115784a[((ilk.e) output2).f162254a.ordinal()];
                                        if (i592 == 1) {
                                            oki.h.t2(eVar4, eVar4.C, PlanCancelFlowContract$Step.ChatWithSupport.f103485a, true, null, false, 12);
                                        } else if (i592 != 2) {
                                            eVar5.invoke();
                                        } else {
                                            eVar4.l2(new k(eVar4, eVar5, null, 1), new yi5.b(26));
                                        }
                                    } else {
                                        if (!Intrinsics.f(output2, f.a.f162255a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar4.H2(dVar2, new dkk.m(25));
                                        eVar5.invoke();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.full_screen_prompt.c output3 = (com.revolut.feature.full_screen_prompt.c) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof d67.h) && !Intrinsics.f(output3, c.b.f74505a)) {
                                        boolean zF = Intrinsics.f(output3, c.C0497c.f74506a);
                                        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar6 = eVar2;
                                        if (zF) {
                                            eVar6.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                        } else if (output3 instanceof c.a) {
                                            eVar6.C.e(false);
                                        } else {
                                            if (!Intrinsics.f(output3, c.d.f74507a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar6.L2(t.CHAT_CLOSE);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    olk.f output4 = (olk.f) obj5;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof olk.g;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar7 = eVar2;
                                    if (z6) {
                                        eVar7.H2(eVar7.A, new l0(output4, 25));
                                        eVar7.l2(new g(eVar7, null, 2), new yi5.b(26));
                                    } else {
                                        if (!Intrinsics.f(output4, f.a.f226441a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar7.C2(a.C0637a.f103489a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    glk.j output5 = (glk.j) obj5;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean zF2 = Intrinsics.f(output5, glk.h.f144720a);
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar8 = eVar2;
                                    if (zF2) {
                                        eVar8.C2(a.C0637a.f103489a);
                                    } else {
                                        if (!(output5 instanceof glk.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar8.C1(foh.i.i(((glk.i) output5).f144721a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    planCancelFeedbackScreen.H = block18;
                    return planCancelFeedbackScreen;
                }
                if (!(step8 instanceof PlanCancelFlowContract$Step.Block)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanDowngradeBlockScreen planDowngradeBlockScreen = new PlanDowngradeBlockScreen(new PlanDowngradeBlockScreenContract$InputData(((PlanCancelFlowContract$Step.Block) step8).f103484a));
                final int i74 = 4;
                Function1 block19 = new Function1() { // from class: dlk.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i74) {
                            case 0:
                                igk.f output = (igk.f) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z4 = output instanceof f.a;
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar3 = eVar2;
                                if (z4) {
                                    eVar3.C2(a.C0637a.f103489a);
                                } else {
                                    if (!(output instanceof f.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar3.l2(new k(eVar3, new e(eVar3, 0), null, 0), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            case 1:
                                ilk.f output2 = (ilk.f) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar4 = eVar2;
                                e eVar5 = new e(eVar4, 1);
                                qki.d dVar2 = eVar4.A;
                                if (output2 instanceof ilk.e) {
                                    eVar4.H2(dVar2, new l0(output2, 26));
                                    int i592 = f.f115784a[((ilk.e) output2).f162254a.ordinal()];
                                    if (i592 == 1) {
                                        oki.h.t2(eVar4, eVar4.C, PlanCancelFlowContract$Step.ChatWithSupport.f103485a, true, null, false, 12);
                                    } else if (i592 != 2) {
                                        eVar5.invoke();
                                    } else {
                                        eVar4.l2(new k(eVar4, eVar5, null, 1), new yi5.b(26));
                                    }
                                } else {
                                    if (!Intrinsics.f(output2, f.a.f162255a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar4.H2(dVar2, new dkk.m(25));
                                    eVar5.invoke();
                                }
                                return Unit.f186387a;
                            case 2:
                                com.revolut.feature.full_screen_prompt.c output3 = (com.revolut.feature.full_screen_prompt.c) obj5;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                if (!(output3 instanceof d67.h) && !Intrinsics.f(output3, c.b.f74505a)) {
                                    boolean zF = Intrinsics.f(output3, c.C0497c.f74506a);
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar6 = eVar2;
                                    if (zF) {
                                        eVar6.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                                    } else if (output3 instanceof c.a) {
                                        eVar6.C.e(false);
                                    } else {
                                        if (!Intrinsics.f(output3, c.d.f74507a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar6.L2(t.CHAT_CLOSE);
                                    }
                                }
                                return Unit.f186387a;
                            case 3:
                                olk.f output4 = (olk.f) obj5;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                boolean z6 = output4 instanceof olk.g;
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar7 = eVar2;
                                if (z6) {
                                    eVar7.H2(eVar7.A, new l0(output4, 25));
                                    eVar7.l2(new g(eVar7, null, 2), new yi5.b(26));
                                } else {
                                    if (!Intrinsics.f(output4, f.a.f226441a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar7.C2(a.C0637a.f103489a);
                                }
                                return Unit.f186387a;
                            default:
                                glk.j output5 = (glk.j) obj5;
                                Intrinsics.checkNotNullParameter(output5, "output");
                                boolean zF2 = Intrinsics.f(output5, glk.h.f144720a);
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.e eVar8 = eVar2;
                                if (zF2) {
                                    eVar8.C2(a.C0637a.f103489a);
                                } else {
                                    if (!(output5 instanceof glk.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    eVar8.C1(foh.i.i(((glk.i) output5).f144721a));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                planDowngradeBlockScreen.H = block19;
                return planDowngradeBlockScreen;
            case 9:
                com.revolut.feature.contacts.impl.ui.contact.screen.details.a aVar7 = (com.revolut.feature.contacts.impl.ui.contact.screen.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ContactDetailsScreenContract$ModalStep step9 = (ContactDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (Intrinsics.f(step9, ContactDetailsScreenContract$ModalStep.ChangeBackgroundDialog.f66005a)) {
                    return aVar7.D.Z2(((hm3.c) aVar7.u).a(aVar7.o.f66002a));
                }
                if (Intrinsics.f(step9, ContactDetailsScreenContract$ModalStep.DeleteChatDialog.f66006a)) {
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(aVar7.E.a());
                    dm3.o block20 = new dm3.o(aVar7, 1);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    rowActionsBottomSheetController.H = block20;
                    return rowActionsBottomSheetController;
                }
                if (!(step9 instanceof ContactDetailsScreenContract$ModalStep.BlockUnblockDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                ContactDetailsScreenContract$ModalStep.BlockUnblockDialog blockUnblockDialog = (ContactDetailsScreenContract$ModalStep.BlockUnblockDialog) step9;
                BlockUserBottomSheetController blockUserBottomSheetController = new BlockUserBottomSheetController(new BlockUserBottomSheetInputData(blockUnblockDialog.f66003a, blockUnblockDialog.f66004b));
                dm3.o block21 = new dm3.o(aVar7, 2);
                Intrinsics.checkNotNullParameter(block21, "block");
                blockUserBottomSheetController.H = block21;
                return blockUserBottomSheetController;
            case 10:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new dmb.l(null, (List) defaultErrorItems.invoke(new iii.d(12, null, false, true, null)), dmb.p.a((dmb.p) obj4, false, null, 3), null, 19);
            case 11:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep step10 = (EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.RevPayPocketSelection) {
                    ViewController viewControllerE13 = cVar.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(u6c.t.ESIM_MOBILE_PLANS, ((EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.RevPayPocketSelection) step10).f101376a, (PaymentMethod) ((dmj.a0) ((j2) cVar.z.f22677a).getValue()).e.getContent(), null, null, null, w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912)));
                    e0 block22 = new e0((Object) cVar, (int) (objArr6 == true ? 1 : 0));
                    Intrinsics.checkNotNullParameter(block22, "block");
                    viewControllerE13.H = block22;
                    return viewControllerE13;
                }
                if (step10 instanceof EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.ExchangeBreakdown) {
                    EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData esimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData = ((EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.ExchangeBreakdown) step10).f101373a;
                    Quote quote = esimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData.f101370b.f100196a;
                    if (quote == null) {
                        throw new IllegalStateException("EsimMobilePlanPhoneNumberCheckoutScreenModel: quote is missing when the exchange breakdown dialog is requested to be opened");
                    }
                    com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar3 = esimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData.f101369a;
                    return cVar.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(quote, esimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData.f101370b.f100198c, j.EXCHANGE, eVar3 != null ? new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(eVar3, null) : PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Empty.f84440a)));
                }
                if (step10 instanceof EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.RevPointsInfo) {
                    return new EsimMobilePlanRevPointsInfoScreen();
                }
                if (step10 instanceof EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.PhoneNumberPriceBreakdown) {
                    EsimPhoneNumberCheckoutUpdatedInvoice esimPhoneNumberCheckoutUpdatedInvoice = ((EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.PhoneNumberPriceBreakdown) step10).f101375a.d;
                    return new EsimMobilePlanPhoneNumberPriceBreakdownScreen(new EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData(esimPhoneNumberCheckoutUpdatedInvoice.f100327c, esimPhoneNumberCheckoutUpdatedInvoice.f100325a.f100321a, esimPhoneNumberCheckoutUpdatedInvoice.f100326b, esimPhoneNumberCheckoutUpdatedInvoice.d.f100321a));
                }
                if (Intrinsics.f(step10, EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.PayNowInfo.f101374a)) {
                    return new EsimCommonInfoBottomSheetScreen(new EsimCommonInfoBottomSheetScreenContract$InputData(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_phone_number_checkout_prorated_price_bottom_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_phone_number_checkout_prorated_price_bottom_sheet_subtitle, null, null, 14)));
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                final com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar2 = (com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d) obj4;
                oe6.a aVar8 = dVar2.o;
                le6.c cVar2 = dVar2.f73018r;
                LinkAccountFlowContract$InputData linkAccountFlowContract$InputData = dVar2.f73020t;
                final l FlowCoordinator2 = (l) obj2;
                final LinkAccountFlowContract$Step step11 = (LinkAccountFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof LinkAccountFlowContract$Step.Branches) {
                    ExternalInstitution externalInstitution = ((LinkAccountFlowContract$Step.Branches) step11).f72999a;
                    BranchesScreen branchesScreen = new BranchesScreen(new BranchesScreenContract$InputData(new TextClause(externalInstitution.f66108b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_selection_title, null, null, 14), externalInstitution.f66107a, true));
                    dn6.h block23 = new dn6.h(step11, dVar2, FlowCoordinator2);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    branchesScreen.H = block23;
                    return branchesScreen;
                }
                if (step11 instanceof LinkAccountFlowContract$Step.Consent) {
                    consentScreen = new ConsentScreen(new tn6.g(linkAccountFlowContract$InputData.f, ((xg6.j) aVar8).a(((LinkAccountFlowContract$Step.Consent) step11).f73000a.f66107a)));
                    final Object[] objArr14 = objArr8 == true ? 1 : 0;
                    Function1 block24 = new Function1() { // from class: dn6.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (objArr14) {
                                case 0:
                                    tn6.h result = (tn6.h) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, h.a.f272316a);
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar3 = dVar2;
                                    if (zF) {
                                        LinkAccountFlowContract$Step.Consent consent = (LinkAccountFlowContract$Step.Consent) step11;
                                        dVar3.n2(new s0(dVar3, consent.f73000a, consent.f73001b, null, 8), new whi.b(6));
                                    } else {
                                        if (!Intrinsics.f(result, h.b.f272317a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar3.B2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a result2 = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z4 = result2 instanceof zn6.i;
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar4 = dVar2;
                                    if (z4) {
                                        dVar4.J2(((zn6.i) result2).f323676a, ((LinkAccountFlowContract$Step.ReviewAccountLinkingDetails) step11).f73009b);
                                    } else if (result2 instanceof zn6.j) {
                                        dVar4.C2(new f(((zn6.j) result2).f323677a));
                                    } else if (Intrinsics.f(result2, a.C0485a.f73058a)) {
                                        oki.h.w2(dVar4.f73021w, LinkAccountFlowContract$Step.InstitutionOffLineErrorDialog.f73006a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!Intrinsics.f(result2, a.b.f73059a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar4.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    consentScreen.H = block24;
                } else {
                    if (!(step11 instanceof LinkAccountFlowContract$Step.ConsentForPreselectedInstitution)) {
                        if (step11 instanceof LinkAccountFlowContract$Step.ReviewAccountLinkingDetails) {
                            LinkAccountFlowContract$Step.ReviewAccountLinkingDetails reviewAccountLinkingDetails = (LinkAccountFlowContract$Step.ReviewAccountLinkingDetails) step11;
                            ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen = new ReviewAccountLinkingDetailsScreen(new ReviewAccountLinkingDetailsScreenContract$InputData(reviewAccountLinkingDetails.f73008a, reviewAccountLinkingDetails.f73009b, reviewAccountLinkingDetails.f73010c, reviewAccountLinkingDetails.d));
                            final int i92 = 1;
                            Function1 block25 = new Function1() { // from class: dn6.i
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i92) {
                                        case 0:
                                            tn6.h result = (tn6.h) obj5;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean zF = Intrinsics.f(result, h.a.f272316a);
                                            com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar3 = dVar2;
                                            if (zF) {
                                                LinkAccountFlowContract$Step.Consent consent = (LinkAccountFlowContract$Step.Consent) step11;
                                                dVar3.n2(new s0(dVar3, consent.f73000a, consent.f73001b, null, 8), new whi.b(6));
                                            } else {
                                                if (!Intrinsics.f(result, h.b.f272317a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                dVar3.B2();
                                            }
                                            return Unit.f186387a;
                                        default:
                                            com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a result2 = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a) obj5;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            boolean z4 = result2 instanceof zn6.i;
                                            com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar4 = dVar2;
                                            if (z4) {
                                                dVar4.J2(((zn6.i) result2).f323676a, ((LinkAccountFlowContract$Step.ReviewAccountLinkingDetails) step11).f73009b);
                                            } else if (result2 instanceof zn6.j) {
                                                dVar4.C2(new f(((zn6.j) result2).f323677a));
                                            } else if (Intrinsics.f(result2, a.C0485a.f73058a)) {
                                                oki.h.w2(dVar4.f73021w, LinkAccountFlowContract$Step.InstitutionOffLineErrorDialog.f73006a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            } else {
                                                if (!Intrinsics.f(result2, a.b.f73059a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                dVar4.B2();
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block25, "block");
                            reviewAccountLinkingDetailsScreen.H = block25;
                            return reviewAccountLinkingDetailsScreen;
                        }
                        if (step11 instanceof LinkAccountFlowContract$Step.Institutions) {
                            InstitutionsListScreen institutionsListScreen = new InstitutionsListScreen(new xn6.f(linkAccountFlowContract$InputData.e, linkAccountFlowContract$InputData.f72992c ? oe6.d.f224553a : oe6.b.f224551a, linkAccountFlowContract$InputData.f72995j));
                            final Object[] objArr15 = objArr7 == true ? 1 : 0;
                            Function1 block26 = new Function1() { // from class: dn6.j
                                /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invoke(java.lang.Object r9) {
                                    /*
                                        Method dump skipped, instruction units count: 242
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: dn6.j.invoke(java.lang.Object):java.lang.Object");
                                }
                            };
                            Intrinsics.checkNotNullParameter(block26, "block");
                            institutionsListScreen.H = block26;
                            return institutionsListScreen;
                        }
                        if (step11 instanceof LinkAccountFlowContract$Step.InstitutionOffLineErrorDialog) {
                            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController2 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.b) cVar2).c(linkAccountFlowContract$InputData.f72994h));
                            baa.c block27 = new baa.c(dVar2, FlowCoordinator2, 6);
                            Intrinsics.checkNotNullParameter(block27, "block");
                            actionsBottomSheetController2.H = block27;
                            return actionsBottomSheetController2;
                        }
                        if (step11 instanceof LinkAccountFlowContract$Step.InstitutionAlreadyLinkErrorDialog) {
                            com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController3 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.b) cVar2).a(((LinkAccountFlowContract$Step.InstitutionAlreadyLinkErrorDialog) step11).f73003a, linkAccountFlowContract$InputData.f72994h));
                            final int i96 = 1;
                            Function1 block28 = new Function1() { // from class: dn6.j
                                /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
                                @Override // kotlin.jvm.functions.Function1
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invoke(java.lang.Object r9) {
                                    /*
                                        Method dump skipped, instruction units count: 242
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: dn6.j.invoke(java.lang.Object):java.lang.Object");
                                }
                            };
                            Intrinsics.checkNotNullParameter(block28, "block");
                            actionsBottomSheetController3.H = block28;
                            return actionsBottomSheetController3;
                        }
                        if (!(step11 instanceof LinkAccountFlowContract$Step.InstitutionLinkLimitErrorDialog)) {
                            if (step11 instanceof LinkAccountFlowContract$Step.InstitutionNotAvailableDialog) {
                                return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.a) dVar2.f73019s).b(((LinkAccountFlowContract$Step.InstitutionNotAvailableDialog) step11).f73005a, linkAccountFlowContract$InputData.f72994h));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController4 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(((fn6.b) cVar2).b(((LinkAccountFlowContract$Step.InstitutionLinkLimitErrorDialog) step11).f73004a, linkAccountFlowContract$InputData.f72994h));
                        baa.c block29 = new baa.c(dVar2, FlowCoordinator2, 7);
                        Intrinsics.checkNotNullParameter(block29, "block");
                        actionsBottomSheetController4.H = block29;
                        return actionsBottomSheetController4;
                    }
                    consentScreen = new ConsentScreen(new tn6.g(linkAccountFlowContract$InputData.f, ((xg6.j) aVar8).a(((LinkAccountFlowContract$Step.ConsentForPreselectedInstitution) step11).f73002a.f72996a)));
                    dn6.h block30 = new dn6.h(dVar2, FlowCoordinator2, step11);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    consentScreen.H = block30;
                }
                return consentScreen;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(new FullScreenStateDelegate.Model("errorDelegate", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, (dnc.i) obj4, false, 0, 0, 32196));
            case 14:
                BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = (BankAccountSwitchingFormScreen) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText view = (InputText) obj3;
                KProperty[] kPropertyArr = BankAccountSwitchingFormScreen.U;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(view, "view");
                Object obj5 = model.P;
                com.revolut.feature.bank_account_switching.impl.ui.form.domain.e eVar4 = obj5 instanceof com.revolut.feature.bank_account_switching.impl.ui.form.domain.e ? (com.revolut.feature.bank_account_switching.impl.ui.form.domain.e) obj5 : null;
                Integer num = eVar4 != null ? eVar4.f63945h : null;
                fo2.s sVar = obj5 instanceof fo2.s ? (fo2.s) obj5 : null;
                String strA = sVar != null ? sVar.a() : null;
                if (strA == null) {
                    return null;
                }
                String str3 = model.f52580a;
                MaskedTextInputEditText innerEditText = view.getInnerEditText();
                abf.c cVar3 = new abf.c(bankAccountSwitchingFormScreen, model, 19);
                if (num != null && num.intValue() == 2) {
                    digitsKeyListener = DigitsKeyListener.getInstance("1234567890- ");
                }
                return new y(innerEditText, null, strA, cVar3, str3, digitsKeyListener, false, 66);
            case 15:
                com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar3 = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                JuniorAppAccessControllerContract$ModalStep step12 = (JuniorAppAccessControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof JuniorAppAccessControllerContract$ModalStep.PersonalDataManagementConsent) {
                    return dVar3.e1(new zc8.b(dVar3.o.f77277a, new ConsentTypeId.DataManagementConsentId(((JuniorAppAccessControllerContract$ModalStep.PersonalDataManagementConsent) step12).f77279a, zc8.a.QR_CODE), new LottieImage(uc0.b.a("mobile/youth/animations", "u18_icon"), R$attr.uikit_colorAccentNeutral, 222)));
                }
                if (!(step12 instanceof JuniorAppAccessControllerContract$ModalStep.InvitationSharingProductArticle)) {
                    if (!(step12 instanceof JuniorAppAccessControllerContract$ModalStep.PhoneRemovalConfirmation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    JuniorAppAccessControllerContract$ModalStep.PhoneRemovalConfirmation phoneRemovalConfirmation = (JuniorAppAccessControllerContract$ModalStep.PhoneRemovalConfirmation) step12;
                    PhoneRemovalConfirmationController phoneRemovalConfirmationController = new PhoneRemovalConfirmationController(new ro8.e(phoneRemovalConfirmation.f77280a, phoneRemovalConfirmation.f77281b, phoneRemovalConfirmation.f77282c));
                    dkm.a block31 = new dkm.a(1, dVar3, com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d.class, "handlePhoneRemovalResult", "handlePhoneRemovalResult(Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationControllerContract$OutputData;)V", 0, 3);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    phoneRemovalConfirmationController.H = block31;
                    return phoneRemovalConfirmationController;
                }
                ProductArticleParams productArticleParams2 = ((JuniorAppAccessControllerContract$ModalStep.InvitationSharingProductArticle) step12).f77278a;
                k9 value3 = k9.Junior;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value3, "value");
                ViewController viewControllerE14 = dVar3.e1(new ProductArticleDescriptor(productArticleParams2, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, new AnalyticsProduct.Retail(value3), null, false, 48));
                e0 block32 = new e0(dVar3, ModalCoordinator5);
                Intrinsics.checkNotNullParameter(block32, "block");
                viewControllerE14.H = block32;
                return viewControllerE14;
            case 16:
                return a(obj2, obj3);
            case 17:
                com.revolut.feature.tax_residency.impl.flows.single_tin.c cVar4 = (com.revolut.feature.tax_residency.impl.flows.single_tin.c) obj4;
                SingleTinCollectionFlowContract$InputData singleTinCollectionFlowContract$InputData = cVar4.o;
                SingleTinCollectionFlowContract$Step step13 = (SingleTinCollectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof SingleTinCollectionFlowContract$Step.PrefetchData) {
                    TaxResidencyPrefetchDataScreen taxResidencyPrefetchDataScreen = new TaxResidencyPrefetchDataScreen(new TaxResidencyPrefetchDataScreenContract$InputData(singleTinCollectionFlowContract$InputData.f90048a, false, true));
                    doe.c cVar5 = new doe.c(cVar4, taxResidencyPrefetchDataScreen);
                    Intrinsics.checkNotNullParameter(cVar5, "<set-?>");
                    taxResidencyPrefetchDataScreen.H = cVar5;
                    return taxResidencyPrefetchDataScreen;
                }
                if (step13 instanceof SingleTinCollectionFlowContract$Step.TinInput) {
                    SingleTinCollectionFlowContract$Step.TinInput tinInput = (SingleTinCollectionFlowContract$Step.TinInput) step13;
                    wi0.b bVar3 = tinInput.f90055a;
                    zme.l lVar2 = tinInput.d;
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    AnalyticsProduct analyticsProduct2 = singleTinCollectionFlowContract$InputData.f90049b;
                    m70.a.c(t0.f186434a);
                    TaxNumberInputScreen taxNumberInputScreen = new TaxNumberInputScreen(new TaxNumberInputScreenContract$InputData(bVar3, lVar2, false, resourceImage, false, analyticsProduct2, true, ""));
                    doe.c cVar6 = new doe.c(tinInput, cVar4, objArr9 == true ? 1 : 0);
                    Intrinsics.checkNotNullParameter(cVar6, "<set-?>");
                    taxNumberInputScreen.H = cVar6;
                    return taxNumberInputScreen;
                }
                if (!(step13 instanceof SingleTinCollectionFlowContract$Step.Submit)) {
                    throw new NoWhenBranchMatchedException();
                }
                SingleTinCollectionFlowContract$Step.Submit submit = (SingleTinCollectionFlowContract$Step.Submit) step13;
                wi0.b bVar4 = submit.f90052a;
                ArrayList arrayList5 = submit.f90054c;
                List list = submit.f90053b;
                f0 f0Var = f0.f322471a;
                SubmitTaxResidencyFlow submitTaxResidencyFlow = new SubmitTaxResidencyFlow(new SubmitTaxResidencyFlowContract$InputData(bVar4, (List) arrayList5, list, (List) f0Var, (List) f0Var, true, submit.d, 64));
                e0 e0Var = new e0(cVar4, i2);
                Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
                submitTaxResidencyFlow.J = e0Var;
                return submitTaxResidencyFlow;
            case 18:
                com.revolut.feature.user_declarations.shared.flows.pep.a aVar9 = (com.revolut.feature.user_declarations.shared.flows.pep.a) obj4;
                PepFlowContract$Step step14 = (PepFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof PepFlowContract$Step.PersonsList)) {
                    throw new NoWhenBranchMatchedException();
                }
                PepFlowControllerDescriptor$InputData pepFlowControllerDescriptor$InputData = aVar9.o;
                PersonsListScreen personsListScreen = new PersonsListScreen(new PersonsListScreenContract$InputData(pepFlowControllerDescriptor$InputData.f105064b, pepFlowControllerDescriptor$InputData.f105065c));
                e0 block33 = new e0(aVar9, 11);
                Intrinsics.checkNotNullParameter(block33, "block");
                personsListScreen.H = block33;
                return personsListScreen;
            case 19:
                cp4.l key = (cp4.l) obj2;
                ql4.a availability = (ql4.a) obj3;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(availability, "availability");
                ((dp4.q) obj4).f116681b.b(key, availability);
                return Unit.f186387a;
            case 20:
                cp4.n key2 = (cp4.n) obj2;
                List details = (List) obj3;
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(details, "details");
                ((dp4.r) obj4).f116685b.b(key2, details);
                return Unit.f186387a;
            case 21:
                cp4.r key3 = (cp4.r) obj2;
                nl4.e feeWaiverProgress = (nl4.e) obj3;
                Intrinsics.checkNotNullParameter(key3, "key");
                Intrinsics.checkNotNullParameter(feeWaiverProgress, "feeWaiverProgress");
                ((dp4.s) obj4).f116690b.b(key3, feeWaiverProgress);
                return Unit.f186387a;
            case 22:
                cp4.t key4 = (cp4.t) obj2;
                ol4.a content = (ol4.a) obj3;
                Intrinsics.checkNotNullParameter(key4, "key");
                Intrinsics.checkNotNullParameter(content, "content");
                ((dp4.t) obj4).f116695b.b(key4, content);
                return Unit.f186387a;
            case 23:
                return b(obj2, obj3);
            case 24:
                return c(obj2, obj3);
            case 25:
                return d(obj2, obj3);
            case 26:
                return e(obj2, obj3);
            case 27:
                return g(obj2, obj3);
            case 28:
                return h(obj2, obj3);
            default:
                com.revolut.feature.credit.card.impl.ui.instalment.term.b bVar5 = (com.revolut.feature.credit.card.impl.ui.instalment.term.b) obj4;
                gs4.i iVar = bVar5.f69523p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InstalmentTermScreenContract$ModalStep step15 = (InstalmentTermScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof InstalmentTermScreenContract$ModalStep.InterestInfo) {
                    return iVar.b(bVar5.I2().d);
                }
                if (step15 instanceof InstalmentTermScreenContract$ModalStep.AprInfo) {
                    return iVar.a(bVar5.I2().d);
                }
                if (step15 instanceof InstalmentTermScreenContract$ModalStep.TransactionsOverview) {
                    return bVar5.f69525r.a(bVar5.I2().e);
                }
                if (!(step15 instanceof InstalmentTermScreenContract$ModalStep.SelectTerm)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar10 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_anticipation_select_instalment_select_instalment, null, null, 14), null, null, null, false, 30);
                yp4.a aVar11 = new yp4.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_select, null, null, 14));
                List<ql4.s> list2 = bVar5.I2().f117364a;
                ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
                for (ql4.s sVar2 : list2) {
                    int i99 = com.revolut.feature.credit.core.R$plurals.credit_card_statement_financing_setup_dialog_select_instalments_item;
                    int i100 = sVar2.f247179a;
                    arrayList6.add(new yp4.b(new TextLocalisedQuantityClause(i99, Integer.valueOf(i100), v.k(Integer.valueOf(i100), sx4.f.b(3, null, null, sVar2.f247182g.f247176a)), (Style) null, 24), Integer.valueOf(i100)));
                }
                PickerBottomSheetController pickerBottomSheetController = new PickerBottomSheetController(new yp4.c(aVar10, aVar11, arrayList6, bVar5.I2().f117364a.indexOf(bVar5.I2().f117365b)));
                e0 block34 = new e0(ModalCoordinator6, bVar5);
                Intrinsics.checkNotNullParameter(block34, "block");
                pickerBottomSheetController.H = block34;
                return pickerBottomSheetController;
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f114707a = i;
        this.f114708b = obj2;
    }
}
