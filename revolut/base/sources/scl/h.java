package scl;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import c12.x;
import cfl.f0;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.alipay.impl.ui.PaymentFlowContract$Step;
import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlow;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.EditLabelScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.edit_label.EditLabelScreenContract$InputData;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreenContract$ModalStep;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.BlikTermsAcceptanceFlowContract$Step;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.a;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.intro.IntroScreen;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreen;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.terms.TermsScreenContract$InputData;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.apm.spin.impl.ui.SpinFlowContract$Step;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreen;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreenContract$InputData;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreen;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.UpiIntentPaymentFlowContract$Step;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreen;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreenContract$InputData;
import com.revolut.feature.backend_driven_limits.api.model.ActionDetailedInfo;
import com.revolut.feature.backend_driven_limits.api.model.ActionDetailedInfoItem;
import com.revolut.feature.backend_driven_limits.api.model.RestrictedAmount;
import com.revolut.feature.backend_driven_limits.api.model.RestrictedFundItem;
import com.revolut.feature.backend_driven_limits.api.model.RestrictedFundsDetailedInfo;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.RestrictionsScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$ModalStep;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.PseFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request.PsePendingPaymentExtension$Parcel;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreen;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlowContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_activation.InsuranceCoverageActivationScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.eligible_cards.InsuranceEligibleCardsScreenContract$InputData;
import com.revolut.feature.junior_consent.api.navigation.ConsentTypeId;
import com.revolut.feature.junior_profile.impl.ui.flow.details.JuniorProfileDetailsFlowContract$Step;
import com.revolut.feature.junior_profile.impl.ui.screen.details.JuniorProfileDetailsScreen;
import com.revolut.feature.junior_profile.impl.ui.screen.gender.JuniorProfileGenderScreen;
import com.revolut.feature.junior_profile.impl.ui.screen.mail.JuniorProfileMailScreen;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.payees.impl.ui.OwnerType;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlowContract$FlowPagerItem;
import com.revolut.feature.payees.impl.ui.payees_overview.junior.JuniorPayeesOverviewScreen;
import com.revolut.feature.payees.impl.ui.payees_overview.personal.PayeesOverviewScreen;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$State;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$Step;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreen;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreenContract$InputData;
import com.revolut.feature.profile.impl.ui.details.email.confirm.EmailConfirmationScreen;
import com.revolut.feature.profile.impl.ui.details.email.confirm.EmailConfirmationScreenContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptController;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow.SlotManagerPromptFlowContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow.SlotManagerPromptFlowContract$Step;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$BudgetPickerAccount;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$DashboardUserData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ModalStep;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$InputData;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$State;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$Step;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreen;
import com.revolut.feature.transfer_reasons.impl.ui.amount_allocation.TransferReasonsAmountAllocationScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreen;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreenContract$InputData;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$ModalStep;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import com.revolut.feature_retail_user_declarations.email.navigation.EmailFlowDescriptor;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.PlanRewardsRevealFlowContract$InputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.PlanRewardsRevealFlowContract$Step;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreen;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.CancelStudentBenefitsFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$BillingOptionHandlingMode;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.PlanContextualSelectionFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.youTransactor.uCube.rpc.Constants;
import do3.q;
import grl.k9;
import htf.i;
import htf.j;
import htf.m;
import htf.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import oki.h;
import org.jmrtd.lds.LDSFile;
import rnb.u;
import sbb.w;
import sdi.k;
import smd.s;
import so1.r;
import ss4.z;
import tu1.e;
import udk.e;
import udk.f;
import udk.g;
import vkm.j2;
import vu1.e;
import xsf.o;
import yki.l;
import zhm.d0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f261771b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f261770a = i;
        this.f261771b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f261771b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        IncomeSorterReviewContract$ModalStep step = (IncomeSorterReviewContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof IncomeSorterReviewContract$ModalStep.ExecuteSorter) {
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.analytics_income_sorter_manual_execution_updated_sheet_title, null, null, 14), null, null, null, false, 30);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.analytics_income_sorter_manual_execution_updated_sheet_cta_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.analytics_income_sorter_manual_execution_updated_sheet_cta_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.Analytics;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            k block = new k(iVar, (IncomeSorterReviewContract$ModalStep.ExecuteSorter) step, 18);
            Intrinsics.checkNotNullParameter(block, "block");
            actionsBottomSheetController.H = block;
            return actionsBottomSheetController;
        }
        if (step instanceof IncomeSorterReviewContract$ModalStep.ActiveSorterConflict) {
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.analytics_income_sorter_details_submit_matching_sorter_title, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_details_submit_matching_sorter_description, null, null, 14), null, null, false, 28);
            aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.analytics_income_sorter_details_submit_matching_sorter_primary_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.analytics_income_sorter_details_submit_matching_sorter_secondary_cta, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var2 = k9.Analytics;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar2, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            k block2 = new k(iVar, (IncomeSorterReviewContract$ModalStep.ActiveSorterConflict) step, 20);
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController2.H = block2;
            return actionsBottomSheetController2;
        }
        if (!(step instanceof IncomeSorterReviewContract$ModalStep.CryptoLearnMoreDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        wi0.b bVarY = q.y(iVar.o.f265050a);
        if (!com.bumptech.glide.d.p(bVarY)) {
            bVarY = null;
        }
        iVar.f87869t.getClass();
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.analytics_income_sorter_submit_common_disclaimer_learn_more, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_disclaimer_crypto_buy_description_volatility, v.k(new TextLocalisedClause(R$string.analytics_income_sorter_disclaimer_crypto_buy_description_link, null, new Click(30, (Integer) null, (Object) null, "CRYPTO_LEARN_MORE_INSURANCE_LINK_ID", false), 10), new TextLocalisedClause(R$string.analytics_income_sorter_disclaimer_crypto_buy_description_terms, null, new Click(30, (Integer) null, (Object) null, "CRYPTO_LEARN_MORE_TERMS_LINK_ID", false), 10)), null, 12), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var3 = k9.Analytics;
        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar3, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
        k block3 = new k(iVar, bVarY, 19);
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetController3.H = block3;
        return actionsBottomSheetController3;
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar = (com.revolut.feature.transfer_reasons.impl.flow.refund.b) this.f261771b;
        TransferReasonsRefundFlowContract$InputData transferReasonsRefundFlowContract$InputData = bVar.f92367q;
        qki.d dVar = bVar.f92370t;
        final l FlowCoordinator = (l) obj2;
        TransferReasonsRefundFlowContract$Step step = (TransferReasonsRefundFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, TransferReasonsRefundFlowContract$Step.SelectTransaction.f92364a)) {
            TransferReasonsTransactionsScreen transferReasonsTransactionsScreen = new TransferReasonsTransactionsScreen(new TransferReasonsTransactionsScreenContract$InputData(transferReasonsRefundFlowContract$InputData.f92354b, transferReasonsRefundFlowContract$InputData.f92353a));
            u block = new u(1, bVar, com.revolut.feature.transfer_reasons.impl.flow.refund.b.class, "handleSelectedTransaction", "handleSelectedTransaction(Lcom/revolut/feature/transfer_reasons/impl/ui/transactions/TransferReasonsTransactionsScreenContract$OutputData;)V", 0, 29);
            Intrinsics.checkNotNullParameter(block, "block");
            transferReasonsTransactionsScreen.H = block;
            return transferReasonsTransactionsScreen;
        }
        if (step instanceof TransferReasonsRefundFlowContract$Step.AmountAllocation) {
            TransferReasonsAmountAllocationScreen transferReasonsAmountAllocationScreen = new TransferReasonsAmountAllocationScreen(new TransferReasonsAmountAllocationScreenContract$InputData(transferReasonsRefundFlowContract$InputData.f92353a, d0.d1(((TransferReasonsRefundFlowContract$State) ((j2) dVar.f22677a).getValue()).f92358c), ((TransferReasonsRefundFlowContract$State) ((j2) dVar.f22677a).getValue()).e));
            final int i = 0;
            Function1 block2 = new Function1() { // from class: ssf.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            dtf.f result = (dtf.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar2 = bVar;
                            bVar2.H2(bVar2.f92370t, new qsf.d(result, 1));
                            bVar2.I2();
                            return Unit.f186387a;
                        default:
                            o result2 = (o) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar3 = bVar;
                            bVar3.H2(bVar3.f92370t, new qsf.c(result2, 1));
                            bVar3.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            transferReasonsAmountAllocationScreen.H = block2;
            return transferReasonsAmountAllocationScreen;
        }
        if (step instanceof TransferReasonsRefundFlowContract$Step.ReasonsList) {
            TransferReasonsRefundFlowContract$Step.ReasonsList reasonsList = (TransferReasonsRefundFlowContract$Step.ReasonsList) step;
            TransferReasonsScreen transferReasonsScreen = new TransferReasonsScreen(new TransferReasonsScreenContract$InputData(reasonsList.f92361a, reasonsList.f92362b, ((TransferReasonsRefundFlowContract$State) ((j2) dVar.f22677a).getValue()).f92357b, transferReasonsRefundFlowContract$InputData.f92355c), dVar.B(new z(2)), dVar.B(new z(4)));
            final int i2 = 0;
            Function1 block3 = new Function1() { // from class: ssf.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar2 = bVar;
                            qki.d dVar2 = bVar2.f92370t;
                            n result = (n) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof htf.k;
                            l lVar = FlowCoordinator;
                            if (z) {
                                h.t2(bVar2, lVar, new TransferReasonsRefundFlowContract$Step.ReasonsSearch(((htf.k) result).f155372a), true, null, false, 12);
                            } else if (result instanceof m) {
                                m mVar = (m) result;
                                bVar2.H2(dVar2, new s06.e(mVar.f155374a, 15, bVar2, mVar.f155375b));
                            } else if (result instanceof i) {
                                bVar2.H2(dVar2, new z(3));
                            } else if (result instanceof j) {
                                h.t2(bVar2, lVar, new TransferReasonsRefundFlowContract$Step.AdditionalInfoStep(((j) result).f155371a), true, null, false, 12);
                            } else {
                                if (!(result instanceof htf.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.I2();
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar3 = bVar;
                            qki.d dVar3 = bVar3.f92370t;
                            ntf.m result2 = (ntf.m) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof ntf.j) {
                                h.t2(bVar3, FlowCoordinator, new TransferReasonsRefundFlowContract$Step.AdditionalInfoStep(((ntf.j) result2).f219026a), true, null, false, 12);
                            } else if (result2 instanceof ntf.i) {
                                bVar3.H2(dVar3, new z(3));
                            } else if (result2 instanceof ntf.k) {
                                bVar3.I2();
                            } else {
                                if (!(result2 instanceof ntf.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ntf.l lVar2 = (ntf.l) result2;
                                bVar3.H2(dVar3, new s06.e(lVar2.f219028a, 15, bVar3, lVar2.f219029b));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            transferReasonsScreen.H = block3;
            return transferReasonsScreen;
        }
        if (!(step instanceof TransferReasonsRefundFlowContract$Step.ReasonsSearch)) {
            if (!(step instanceof TransferReasonsRefundFlowContract$Step.AdditionalInfoStep)) {
                throw new NoWhenBranchMatchedException();
            }
            TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen = new TransferReasonsAdditionalInfoScreen(new TransferReasonsAdditionalInfoScreenContract$InputData(transferReasonsRefundFlowContract$InputData.f92353a, ((TransferReasonsRefundFlowContract$Step.AdditionalInfoStep) step).f92359a, ((TransferReasonsRefundFlowContract$State) ((j2) dVar.f22677a).getValue()).d));
            final int i3 = 1;
            Function1 block4 = new Function1() { // from class: ssf.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            dtf.f result = (dtf.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar2 = bVar;
                            bVar2.H2(bVar2.f92370t, new qsf.d(result, 1));
                            bVar2.I2();
                            return Unit.f186387a;
                        default:
                            o result2 = (o) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar3 = bVar;
                            bVar3.H2(bVar3.f92370t, new qsf.c(result2, 1));
                            bVar3.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            transferReasonsAdditionalInfoScreen.H = block4;
            return transferReasonsAdditionalInfoScreen;
        }
        TransferReasons transferReasons = ((TransferReasonsRefundFlowContract$State) ((j2) dVar.f22677a).getValue()).f92356a;
        if (transferReasons == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        TransferReasonsSearchScreen transferReasonsSearchScreen = new TransferReasonsSearchScreen(new TransferReasonsSearchScreenContract$InputData(transferReasons.f92438a, ((TransferReasonsRefundFlowContract$Step.ReasonsSearch) step).f92363a, transferReasonsRefundFlowContract$InputData.f92355c), dVar.B(new z(2)));
        final int i5 = 1;
        Function1 block5 = new Function1() { // from class: ssf.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i5) {
                    case 0:
                        com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar2 = bVar;
                        qki.d dVar2 = bVar2.f92370t;
                        n result = (n) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof htf.k;
                        l lVar = FlowCoordinator;
                        if (z) {
                            h.t2(bVar2, lVar, new TransferReasonsRefundFlowContract$Step.ReasonsSearch(((htf.k) result).f155372a), true, null, false, 12);
                        } else if (result instanceof m) {
                            m mVar = (m) result;
                            bVar2.H2(dVar2, new s06.e(mVar.f155374a, 15, bVar2, mVar.f155375b));
                        } else if (result instanceof i) {
                            bVar2.H2(dVar2, new z(3));
                        } else if (result instanceof j) {
                            h.t2(bVar2, lVar, new TransferReasonsRefundFlowContract$Step.AdditionalInfoStep(((j) result).f155371a), true, null, false, 12);
                        } else {
                            if (!(result instanceof htf.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.I2();
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.transfer_reasons.impl.flow.refund.b bVar3 = bVar;
                        qki.d dVar3 = bVar3.f92370t;
                        ntf.m result2 = (ntf.m) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (result2 instanceof ntf.j) {
                            h.t2(bVar3, FlowCoordinator, new TransferReasonsRefundFlowContract$Step.AdditionalInfoStep(((ntf.j) result2).f219026a), true, null, false, 12);
                        } else if (result2 instanceof ntf.i) {
                            bVar3.H2(dVar3, new z(3));
                        } else if (result2 instanceof ntf.k) {
                            bVar3.I2();
                        } else {
                            if (!(result2 instanceof ntf.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ntf.l lVar2 = (ntf.l) result2;
                            bVar3.H2(dVar3, new s06.e(lVar2.f219028a, 15, bVar3, lVar2.f219029b));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block5, "block");
        transferReasonsSearchScreen.H = block5;
        return transferReasonsSearchScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar = (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) this.f261771b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CreditCardRepayPaymentReviewScreenContract$ModalStep step = (CreditCardRepayPaymentReviewScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditCardRepayPaymentReviewScreenContract$ModalStep.BalancePicker) {
            ViewController viewControllerE1 = aVar.e1(new g1j.a(((CreditCardRepayPaymentReviewScreenContract$ModalStep.BalancePicker) step).f69616a, aVar.f69619q));
            su4.m block = new su4.m(aVar, 2);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof CreditCardRepayPaymentReviewScreenContract$ModalStep.ExchangedAmount)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData = ((CreditCardRepayPaymentReviewScreenContract$ModalStep.ExchangedAmount) step).f69617a;
        su4.b bVar = aVar.f69622t;
        OrderQuote quote = creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.e;
        xi0.b fromCurrency = creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.f69611a;
        xi0.b toCurrency = creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.f69612b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Amount amount = quote.d;
        if (amount == null) {
            amount = quote.f104754c;
        }
        Amount amount2 = quote.f;
        if (amount2 == null) {
            amount2 = quote.e;
        }
        Amount amount3 = quote.f104755g.f104731a.f104722a;
        dj0.d dVarA = u80.q.a(amount.f104717a, fromCurrency);
        dj0.d dVarA2 = u80.q.a(amount2.f104717a, toCurrency);
        dj0.d dVarA3 = u80.q.a(amount3.f104717a, fromCurrency);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_title, null, null, 14);
        List listK = v.k(new BottomSheet.Item.CellItem("amount_we_collect", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_exchanged_amount, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_exchanged_amount_value, zhm.u.c(sx4.f.b(3, null, null, dVarA2)), null, 12), null, false, null, 0, SyslogConstants.LOG_CLOCK), new BottomSheet.Item.CellItem("fees", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_fees, null, null, 14), dVarA3.f115082a == 0 ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_fees_no_fees, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_fees_value, zhm.u.c(sx4.f.b(3, null, null, dVarA3)), null, 12), null, false, null, 0, SyslogConstants.LOG_CLOCK), new BottomSheet.Item.CellItem("exchanged_amount", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_value, zhm.u.c(sx4.f.b(3, null, null, dVarA)), null, 12), null, false, null, 0, SyslogConstants.LOG_CLOCK), new BottomSheet.Item.CellItem("exchange_rate", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_exchange_rate, null, null, 14), bVar.f265638a.a(quote, false), null, true, null, 0, 104));
        BottomSheet.ActionItem actionItem = new BottomSheet.ActionItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_repay_payment_review_section_payment_breakdown_exchanged_amount_dialog_button, null, null, 14), null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController actionsBottomSheetControllerB = BottomSheet.b(textLocalisedClause, null, null, listK, actionItem, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), Constants.TAG_GPI_VERSION);
        aVar.a(actionsBottomSheetControllerB, new qce.b(aVar, creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData, 19));
        return actionsBottomSheetControllerB;
    }

    /* JADX WARN: Type inference failed for: r1v188, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object planBenefitsScreen;
        WarningCircleBadge warningCircleBadge;
        int i;
        Pair pair;
        String str;
        int i2 = this.f261770a;
        boolean z = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z6 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z29 = true;
        final int i3 = 0;
        Object obj4 = this.f261771b;
        switch (i2) {
            case 0:
                UUID id10 = (UUID) obj2;
                f0 domain = (f0) obj3;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((j) obj4).f261772a.f(i.a(j.Companion, id10), domain);
                return Unit.f186387a;
            case 1:
                final com.revolut.feature.apm.spin.impl.ui.b bVar = (com.revolut.feature.apm.spin.impl.ui.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SpinFlowContract$Step step = (SpinFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof SpinFlowContract$Step.Intro) {
                    ViewController viewControllerE1 = bVar.e1(new ProductArticleDescriptor(com.revolut.feature.apm.spin.impl.ui.b.f62871t, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                    final int i5 = 2;
                    Function1 block = new Function1() { // from class: sd2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    c12.j it8 = (c12.j) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(bVar.f62874r);
                                    return Unit.f186387a;
                                case 1:
                                    ud2.i result = (ud2.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.apm.spin.impl.ui.b bVar2 = bVar;
                                    h.t2(bVar2, bVar2.f62874r, SpinFlowContract$Step.Settings.f62870a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    int i6 = e.f261807a[outputData.ordinal()];
                                    com.revolut.feature.apm.spin.impl.ui.b bVar3 = bVar;
                                    if (i6 == 1 || i6 == 2 || i6 == 3) {
                                        h.t2(bVar3, bVar3.f62874r, bVar3.f62875s, false, null, false, 12);
                                    } else {
                                        if (i6 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(bVar3.f62874r);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerE1.H = block;
                    return viewControllerE1;
                }
                if (step instanceof SpinFlowContract$Step.NewContact) {
                    ViewController viewControllerE12 = bVar.e1(bVar.o.a(null));
                    Function1 block2 = new Function1() { // from class: sd2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    c12.j it8 = (c12.j) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(bVar.f62874r);
                                    return Unit.f186387a;
                                case 1:
                                    ud2.i result = (ud2.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.apm.spin.impl.ui.b bVar2 = bVar;
                                    h.t2(bVar2, bVar2.f62874r, SpinFlowContract$Step.Settings.f62870a, false, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    int i6 = e.f261807a[outputData.ordinal()];
                                    com.revolut.feature.apm.spin.impl.ui.b bVar3 = bVar;
                                    if (i6 == 1 || i6 == 2 || i6 == 3) {
                                        h.t2(bVar3, bVar3.f62874r, bVar3.f62875s, false, null, false, 12);
                                    } else {
                                        if (i6 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(bVar3.f62874r);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE12.H = block2;
                    return viewControllerE12;
                }
                if (step instanceof SpinFlowContract$Step.RecipientsList) {
                    return bVar.e1(new x(new ApmRecipientListInputData(ApmSpin.f61827c, hrf.f.OUTGOING, new TextLocalisedClause(com.revolut.feature.apm.spin.api.R$string.spin_contact_selector_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_select_contact_search_placeholder, null, null, 14), zhm.u.c(new IconNavBarMenuItem("SETTINGS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_action_settings, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION))), bVar.f62872p));
                }
                if (step instanceof SpinFlowContract$Step.Settings) {
                    return new SpinSettingsScreen();
                }
                if (!(step instanceof SpinFlowContract$Step.Deregister)) {
                    throw new NoWhenBranchMatchedException();
                }
                SpinDeregisterPromptScreen spinDeregisterPromptScreen = new SpinDeregisterPromptScreen(new SpinDeregisterPromptScreenContract$InputData(((SpinFlowContract$Step.Deregister) step).f62866a));
                final boolean z31 = z ? 1 : 0;
                Function1 block3 = new Function1() { // from class: sd2.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (z31) {
                            case 0:
                                c12.j it8 = (c12.j) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                h.D2(bVar.f62874r);
                                return Unit.f186387a;
                            case 1:
                                ud2.i result = (ud2.i) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                com.revolut.feature.apm.spin.impl.ui.b bVar2 = bVar;
                                h.t2(bVar2, bVar2.f62874r, SpinFlowContract$Step.Settings.f62870a, false, null, false, 12);
                                return Unit.f186387a;
                            default:
                                yja.b outputData = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                int i6 = e.f261807a[outputData.ordinal()];
                                com.revolut.feature.apm.spin.impl.ui.b bVar3 = bVar;
                                if (i6 == 1 || i6 == 2 || i6 == 3) {
                                    h.t2(bVar3, bVar3.f62874r, bVar3.f62875s, false, null, false, 12);
                                } else {
                                    if (i6 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(bVar3.f62874r);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block3, "block");
                spinDeregisterPromptScreen.H = block3;
                return spinDeregisterPromptScreen;
            case 2:
                bgi.a pageParams = (bgi.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pageParams, "pageParams");
                return ((sdg.a) obj4).f261872a.b(pageParams);
            case 3:
                final com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.a aVar = (com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.a) obj4;
                l FlowCoordinator = (l) obj2;
                PlanRewardsRevealFlowContract$Step step2 = (PlanRewardsRevealFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, PlanRewardsRevealFlowContract$Step.Reveal.f102573a)) {
                    PlanRewardsRevealFlowContract$InputData planRewardsRevealFlowContract$InputData = aVar.o;
                    PlanRewardsRevealScreen planRewardsRevealScreen = new PlanRewardsRevealScreen(new PlanRewardsRevealScreenContract$InputData(planRewardsRevealFlowContract$InputData.f102570a, planRewardsRevealFlowContract$InputData.f102571b));
                    Function1 block4 = new Function1() { // from class: sdk.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.a aVar2 = aVar;
                                    yki.a aVar3 = aVar2.f102575q;
                                    udk.h result = (udk.h) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, e.f279255a)) {
                                        h.D2(aVar3);
                                    } else if (result instanceof f) {
                                        aVar2.l2(new w(aVar2, result, null, 5), new yi5.b(26));
                                    } else {
                                        if (!(result instanceof g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(aVar3, new PlanRewardsRevealFlowContract$Step.ProductArticle(((g) result).f279257a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b result2 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    int i6 = d.f261936a[result2.ordinal()];
                                    if (i6 != 1 && i6 != 2 && i6 != 3) {
                                        if (i6 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(aVar.f102575q);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    planRewardsRevealScreen.H = block4;
                    return planRewardsRevealScreen;
                }
                if (!(step2 instanceof PlanRewardsRevealFlowContract$Step.ProductArticle)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE13 = aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(((PlanRewardsRevealFlowContract$Step.ProductArticle) step2).f102572a)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                final boolean z41 = z3 ? 1 : 0;
                Function1 block5 = new Function1() { // from class: sdk.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (z41) {
                            case 0:
                                com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.a aVar2 = aVar;
                                yki.a aVar3 = aVar2.f102575q;
                                udk.h result = (udk.h) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (Intrinsics.f(result, e.f279255a)) {
                                    h.D2(aVar3);
                                } else if (result instanceof f) {
                                    aVar2.l2(new w(aVar2, result, null, 5), new yi5.b(26));
                                } else {
                                    if (!(result instanceof g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(aVar3, new PlanRewardsRevealFlowContract$Step.ProductArticle(((g) result).f279257a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                }
                                return Unit.f186387a;
                            default:
                                yja.b result2 = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                int i6 = d.f261936a[result2.ordinal()];
                                if (i6 != 1 && i6 != 2 && i6 != 3) {
                                    if (i6 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(aVar.f102575q);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block5, "block");
                viewControllerE13.H = block5;
                return viewControllerE13;
            case 4:
                we3.d overview = (we3.d) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(overview, "overview");
                ((se3.c) obj4).f262096b.f("category_boosts_overview", overview);
                return Unit.f186387a;
            case 5:
                sef.f fVar = (sef.f) obj4;
                Throwable th10 = (Throwable) obj2;
                Function1 defaultItemsFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItemsFactory, "defaultItemsFactory");
                return th10 != null ? (List) defaultItemsFactory.invoke(new iii.d(12, null, true, true, null)) : sef.i.b(fVar.f262188b);
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new sek.n(iii.c.b(null, null, 6, false), sek.u.b(), ((sek.u) obj4).a());
            case 7:
                com.revolut.feature.apm.upi.impl.flow.intent_payment.a aVar2 = (com.revolut.feature.apm.upi.impl.flow.intent_payment.a) obj4;
                l FlowCoordinator2 = (l) obj2;
                UpiIntentPaymentFlowContract$Step step3 = (UpiIntentPaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof UpiIntentPaymentFlowContract$Step.Review)) {
                    throw new NoWhenBranchMatchedException();
                }
                UpiIntentPaymentReviewScreen upiIntentPaymentReviewScreen = new UpiIntentPaymentReviewScreen(new UpiIntentPaymentReviewScreenContract$InputData(aVar2.o.f62980a));
                e block6 = new e(aVar2, 15);
                Intrinsics.checkNotNullParameter(block6, "block");
                upiIntentPaymentReviewScreen.H = block6;
                return upiIntentPaymentReviewScreen;
            case 8:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new pf4.u((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), ((qf4.g) obj4).f245241b.b(), false, null, false, SyslogConstants.LOG_CLOCK);
            case 9:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a aVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.cancel_student_benefits.a) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                CancelStudentBenefitsFlowContract$Step step4 = (CancelStudentBenefitsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!Intrinsics.f(step4, CancelStudentBenefitsFlowContract$Step.Confirmation.f102972a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.student_plans_cancel_benefits_confirm_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.student_plans_cancel_benefits_confirm_description, null, null, 14), null, null, false, 28);
                m6 m6Var = n6.Companion;
                aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.student_plans_cancel_benefits_confirm_keep_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.student_plans_cancel_benefits_confirm_cancel_cta, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                k9 k9Var = k9.Premium;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar4, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                e block7 = new e(aVar3, 18);
                Intrinsics.checkNotNullParameter(block7, "block");
                actionsBottomSheetController.H = block7;
                return actionsBottomSheetController;
            case 10:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a aVar5 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_contextual_selection.a) obj4;
                l FlowCoordinator3 = (l) obj2;
                PlanContextualSelectionFlowContract$Step step5 = (PlanContextualSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof PlanContextualSelectionFlowContract$Step.PlanSelection) {
                    PlanContextualSelectionFlowContract$Step.PlanSelection planSelection = (PlanContextualSelectionFlowContract$Step.PlanSelection) step5;
                    PlanContextualSelectionScreen planContextualSelectionScreen = new PlanContextualSelectionScreen(new PlanContextualSelectionScreenContract$InputData(planSelection.f103148a, planSelection.f103149b, planSelection.f103150c, planSelection.d));
                    k block8 = new k(aVar5, FlowCoordinator3, 4);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    planContextualSelectionScreen.H = block8;
                    return planContextualSelectionScreen;
                }
                if (step5 instanceof PlanContextualSelectionFlowContract$Step.PlanBenefits) {
                    planBenefitsScreen = new PlanBenefitsScreen(new PlanBenefitsScreenContract$InputData((PlanBenefitsScreenContract$PlanReference) new PlanBenefitsScreenContract$PlanReference.Id(((PlanContextualSelectionFlowContract$Step.PlanBenefits) step5).f103146a), new PlanBenefitsScreenContract$UIConfig(false), false, 8));
                } else {
                    if (step5 instanceof PlanContextualSelectionFlowContract$Step.PlanDocuments) {
                        return new PlanDocumentsBottomSheetScreen(new PlanDocumentsBottomSheetScreenContract$InputData(PlanDocumentsBottomSheetScreenContract$TitleConfig.NoTitle.f103524a, ((PlanContextualSelectionFlowContract$Step.PlanDocuments) step5).f103147a));
                    }
                    if (!(step5 instanceof PlanContextualSelectionFlowContract$Step.BillingPicker)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PlanContextualSelectionFlowContract$Step.BillingPicker billingPicker = (PlanContextualSelectionFlowContract$Step.BillingPicker) step5;
                    PlanBillingPickerFlow planBillingPickerFlow = new PlanBillingPickerFlow(new PlanBillingPickerContract$InputData((SelectedBillingPlan) new SelectedBillingPlan.PlanId(billingPicker.f103143a), new PlanBillingPickerContract$Mode.Standalone(billingPicker.f103144b, billingPicker.f103145c, billingPicker.d), aVar5.o.f103140a, false, (PlanBillingPickerContract$BillingOptionHandlingMode) null, (String) null, 48));
                    shk.c block9 = new shk.c(aVar5, i3);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    planBillingPickerFlow.H = block9;
                    planBenefitsScreen = planBillingPickerFlow;
                }
                return planBenefitsScreen;
            case 11:
                com.revolut.feature.junior_profile.impl.ui.flow.details.a aVar6 = (com.revolut.feature.junior_profile.impl.ui.flow.details.a) obj4;
                sj8.c cVar = aVar6.o;
                l FlowCoordinator4 = (l) obj2;
                JuniorProfileDetailsFlowContract$Step step6 = (JuniorProfileDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof JuniorProfileDetailsFlowContract$Step.Details) {
                    JuniorProfileDetailsScreen juniorProfileDetailsScreen = new JuniorProfileDetailsScreen(new wj8.i(cVar.f263687a));
                    u block10 = new u(1, aVar6, com.revolut.feature.junior_profile.impl.ui.flow.details.a.class, "handleDetailsScreenResult", "handleDetailsScreenResult(Lcom/revolut/feature/junior_profile/impl/ui/screen/details/JuniorProfileDetailsScreenContract$Output;)V", 0, 26);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    juniorProfileDetailsScreen.H = block10;
                    return juniorProfileDetailsScreen;
                }
                if (step6 instanceof JuniorProfileDetailsFlowContract$Step.UpdateMail) {
                    return new JuniorProfileMailScreen(new ak8.f(cVar.f263687a));
                }
                if (step6 instanceof JuniorProfileDetailsFlowContract$Step.UpdateGender) {
                    return new JuniorProfileGenderScreen(new yj8.d(cVar.f263687a));
                }
                if (step6 instanceof JuniorProfileDetailsFlowContract$Step.UpdatePersonalDataManagementConsent) {
                    return aVar6.e1(new zc8.b(cVar.f263687a, new ConsentTypeId.DataManagementConsentId(((JuniorProfileDetailsFlowContract$Step.UpdatePersonalDataManagementConsent) step6).f77136a, zc8.a.PROFILE), LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/onboarding/animations", "phone_verification"), false, false, new LottieImage.ColorOverride.TintedWithAttr(R$attr.uikit_colorAccentNeutral), null, 222)));
                }
                if (!(step6 instanceof JuniorProfileDetailsFlowContract$Step.Workflow)) {
                    throw new NoWhenBranchMatchedException();
                }
                til.m mVar = aVar6.f77138p;
                String str2 = ((JuniorProfileDetailsFlowContract$Step.Workflow) step6).f77137a;
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var2 = k9.Junior;
                companion.getClass();
                WorkflowFlow workflowFlowB = til.m.b(mVar, new WorkflowConfiguration.Workflow(str2, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var2), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), new WorkflowFlowType.Regular(0), null, 60);
                e block11 = new e(aVar6, 19);
                Intrinsics.checkNotNullParameter(block11, "block");
                workflowFlowB.H = block11;
                return workflowFlowB;
            case 12:
                final com.revolut.feature.alipay.impl.ui.a aVar7 = (com.revolut.feature.alipay.impl.ui.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                PaymentFlowContract$Step step7 = (PaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof PaymentFlowContract$Step.Confirmation) {
                    tk1.c cVar2 = aVar7.f61067p;
                    ApmPaymentAuthorisationSummary pendingAction = ((PaymentFlowContract$Step.Confirmation) step7).f61064a;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
                    ViewController viewControllerE14 = aVar7.e1(new tak.a(new PendingPaymentContract$InputData.Apm(pendingAction, true), cVar2));
                    final boolean z49 = z4 ? 1 : 0;
                    Function1 block12 = new Function1() { // from class: sk1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (z49) {
                                case 0:
                                    vk1.k result = (vk1.k) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z54 = result instanceof vk1.j;
                                    com.revolut.feature.alipay.impl.ui.a aVar8 = aVar7;
                                    if (z54) {
                                        h.t2(aVar8, aVar8.f61069r, new PaymentFlowContract$Step.Confirmation(((vk1.j) result).f289854a), false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, vk1.i.f289853a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(aVar8.f61069r);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(aVar7.f61069r);
                                    return Unit.f186387a;
                                default:
                                    yja.b result2 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    int i6 = d.f263755a[result2.ordinal()];
                                    com.revolut.feature.alipay.impl.ui.a aVar9 = aVar7;
                                    if (i6 != 1) {
                                        PaymentFlowContract$Step.QR qr10 = PaymentFlowContract$Step.QR.f61066a;
                                        if (i6 == 2) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Not found product article for Alipay product article");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                            h.t2(aVar9, aVar9.f61069r, qr10, false, null, false, 12);
                                        } else {
                                            if (i6 != 3 && i6 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar9, aVar9.f61069r, qr10, false, null, false, 12);
                                        }
                                    } else {
                                        h.D2(aVar9.f61069r);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE14.H = block12;
                    return viewControllerE14;
                }
                if (Intrinsics.f(step7, PaymentFlowContract$Step.ProductArticle.f61065a)) {
                    ViewController viewControllerE15 = aVar7.e1(new ProductArticleDescriptor(aVar7.f61068q, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                    final int i6 = 2;
                    Function1 block13 = new Function1() { // from class: sk1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    vk1.k result = (vk1.k) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z54 = result instanceof vk1.j;
                                    com.revolut.feature.alipay.impl.ui.a aVar8 = aVar7;
                                    if (z54) {
                                        h.t2(aVar8, aVar8.f61069r, new PaymentFlowContract$Step.Confirmation(((vk1.j) result).f289854a), false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, vk1.i.f289853a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(aVar8.f61069r);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(aVar7.f61069r);
                                    return Unit.f186387a;
                                default:
                                    yja.b result2 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    int i66 = d.f263755a[result2.ordinal()];
                                    com.revolut.feature.alipay.impl.ui.a aVar9 = aVar7;
                                    if (i66 != 1) {
                                        PaymentFlowContract$Step.QR qr10 = PaymentFlowContract$Step.QR.f61066a;
                                        if (i66 == 2) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Not found product article for Alipay product article");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                            h.t2(aVar9, aVar9.f61069r, qr10, false, null, false, 12);
                                        } else {
                                            if (i66 != 3 && i66 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar9, aVar9.f61069r, qr10, false, null, false, 12);
                                        }
                                    } else {
                                        h.D2(aVar9.f61069r);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    viewControllerE15.H = block13;
                    return viewControllerE15;
                }
                if (!Intrinsics.f(step7, PaymentFlowContract$Step.QR.f61066a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AlipayPlusQrFlow alipayPlusQrFlow = new AlipayPlusQrFlow();
                Function1 block14 = new Function1() { // from class: sk1.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i3) {
                            case 0:
                                vk1.k result = (vk1.k) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z54 = result instanceof vk1.j;
                                com.revolut.feature.alipay.impl.ui.a aVar8 = aVar7;
                                if (z54) {
                                    h.t2(aVar8, aVar8.f61069r, new PaymentFlowContract$Step.Confirmation(((vk1.j) result).f289854a), false, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(result, vk1.i.f289853a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(aVar8.f61069r);
                                }
                                return Unit.f186387a;
                            case 1:
                                PendingPaymentContract$OutputData it8 = (PendingPaymentContract$OutputData) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                h.D2(aVar7.f61069r);
                                return Unit.f186387a;
                            default:
                                yja.b result2 = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                int i66 = d.f263755a[result2.ordinal()];
                                com.revolut.feature.alipay.impl.ui.a aVar9 = aVar7;
                                if (i66 != 1) {
                                    PaymentFlowContract$Step.QR qr10 = PaymentFlowContract$Step.QR.f61066a;
                                    if (i66 == 2) {
                                        IllegalStateException illegalStateException = new IllegalStateException("Not found product article for Alipay product article");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                        h.t2(aVar9, aVar9.f61069r, qr10, false, null, false, 12);
                                    } else {
                                        if (i66 != 3 && i66 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar9, aVar9.f61069r, qr10, false, null, false, 12);
                                    }
                                } else {
                                    h.D2(aVar9.f61069r);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block14, "block");
                alipayPlusQrFlow.H = block14;
                return alipayPlusQrFlow;
            case 13:
                com.revolut.feature.external_accounts.impl.ui.colombia.pse.a aVar8 = (com.revolut.feature.external_accounts.impl.ui.colombia.pse.a) obj4;
                l FlowCoordinator5 = (l) obj2;
                PseFlowContract$Step step8 = (PseFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof PseFlowContract$Step.AuthorisationRequest)) {
                    if (step8 instanceof PseFlowContract$Step.VerificationCode) {
                        return new PseVerificationCodeScreen(new PseVerificationCodeScreenContract$InputData(((PseFlowContract$Step.VerificationCode) step8).f72720a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE16 = aVar8.e1(new tak.a(new PendingPaymentContract$InputData.Apm(new PsePendingPaymentExtension$Parcel(((PseFlowContract$Step.AuthorisationRequest) step8).f72719a), true, null, false), aVar8.o));
                e block15 = new e(aVar8, 21);
                Intrinsics.checkNotNullParameter(block15, "block");
                viewControllerE16.H = block15;
                return viewControllerE16;
            case 14:
                sl2.b bVar2 = ((com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d) obj4).f63217q;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RestrictionsScreenContract$ModalStep step9 = (RestrictionsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof RestrictionsScreenContract$ModalStep.RestrictedFundsStep)) {
                    if (!(step9 instanceof RestrictionsScreenContract$ModalStep.RestrictedActionStep)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionDetailedInfo detailedInfo = ((RestrictionsScreenContract$ModalStep.RestrictedActionStep) step9).f63208a;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(detailedInfo, "detailedInfo");
                    TextClause textClause = new TextClause(detailedInfo.f63192a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str3 = detailedInfo.f63193b;
                    lw0.a aVar9 = new lw0.a(textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
                    aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var3 = k9.FinCrime;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3);
                    ArrayList arrayList = detailedInfo.f63194c;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(new TextClause(((ActionDetailedInfoItem) it8.next()).f63195a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    }
                    return new ActionsBottomSheetController(new dii.a(aVar9, eVar, retailH, null, new dii.h(arrayList2), 8));
                }
                RestrictedFundsDetailedInfo detailedInfo2 = ((RestrictionsScreenContract$ModalStep.RestrictedFundsStep) step9).f63209a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(detailedInfo2, "detailedInfo");
                TextClause textClause2 = new TextClause(detailedInfo2.f63201a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = detailedInfo2.f63202b;
                lw0.a aVar10 = new lw0.a(textClause2, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 value = k9.FinCrime;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ArrayList<RestrictedFundItem> arrayList3 = detailedInfo2.f63203c;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                for (RestrictedFundItem restrictedFundItem : arrayList3) {
                    TextClause textClause3 = new TextClause(restrictedFundItem.f63198a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    CurrencyImage currencyImage = new CurrencyImage(restrictedFundItem.f63199b, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                    int i21 = sl2.a.f264085a[restrictedFundItem.f63200c.ordinal()];
                    if (i21 == 1) {
                        warningCircleBadge = new WarningCircleBadge(dw0.a.Locked);
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        warningCircleBadge = null;
                    }
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(currencyImage, warningCircleBadge, null, false, null, false, 60);
                    RestrictedAmount restrictedAmount = restrictedFundItem.d;
                    long j2 = restrictedAmount.f63196a;
                    xi0.a aVar11 = xi0.b.Companion;
                    String str5 = restrictedAmount.f63197b;
                    aVar11.getClass();
                    MoneyClause moneyClause = new MoneyClause(new dj0.d(j2, xi0.a.a(str5)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    RestrictedAmount restrictedAmount2 = restrictedFundItem.e;
                    arrayList4.add(new eii.l((Clause) textClause3, (TextLocalisedClause) null, image40, false, moneyClause, restrictedAmount2 != null ? new MoneyClause(new dj0.d(restrictedAmount2.f63196a, xi0.a.a(restrictedAmount2.f63197b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, (Object) null, 808));
                }
                return new RowActionsBottomSheetController(new eii.c(aVar10, eVar2, arrayList4, new AnalyticsProduct.Retail(value), null));
            case 15:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                ql3.c codes = (ql3.c) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(codes, "codes");
                return ((sl3.u) obj4).f264134c.getRemoteContactsData(codes);
            case 16:
                com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow.a aVar12 = (com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow.a) obj4;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                SlotManagerPromptFlowContract$Step step10 = (SlotManagerPromptFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!Intrinsics.f(step10, SlotManagerPromptFlowContract$Step.PromptBottomSheet.f87381a)) {
                    throw new NoWhenBranchMatchedException();
                }
                SlotManagerPromptFlowContract$InputData slotManagerPromptFlowContract$InputData = aVar12.o;
                SlotManagerPromptController slotManagerPromptController = new SlotManagerPromptController(new SlotManagerPromptControllerContract$InputData(slotManagerPromptFlowContract$InputData.f87379a, slotManagerPromptFlowContract$InputData.f87380b));
                slotManagerPromptController.l2(new dld.c(aVar12, LazyFlowCoordinator4, 9));
                return slotManagerPromptController;
            case 17:
                final com.revolut.feature.payees.impl.ui.payees_overview.flow.c cVar3 = (com.revolut.feature.payees.impl.ui.payees_overview.flow.c) obj4;
                ali.b PagerCoordinator = (ali.b) obj2;
                PayeesOverviewFlowContract$FlowPagerItem item = (PayeesOverviewFlowContract$FlowPagerItem) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof PayeesOverviewFlowContract$FlowPagerItem.CurrentUser) {
                    PayeesOverviewScreen payeesOverviewScreen = new PayeesOverviewScreen(new wm9.h());
                    Function1 block16 = new Function1() { // from class: sm9.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    rm9.e it9 = (rm9.e) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    cVar3.C2(it9);
                                    return Unit.f186387a;
                                default:
                                    um9.g it10 = (um9.g) obj5;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    com.revolut.feature.payees.impl.ui.payees_overview.flow.c cVar4 = cVar3;
                                    cVar4.getClass();
                                    if (it10 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar4.C2(new rm9.a(new OwnerType.Junior(it10.f281273a, it10.f281274b)));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    payeesOverviewScreen.H = block16;
                    return payeesOverviewScreen;
                }
                if (!(item instanceof PayeesOverviewFlowContract$FlowPagerItem.Junior)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorPayeesOverviewScreen juniorPayeesOverviewScreen = new JuniorPayeesOverviewScreen(new um9.f(((PayeesOverviewFlowContract$FlowPagerItem.Junior) item).f79006a));
                final boolean z54 = z6 ? 1 : 0;
                Function1 block17 = new Function1() { // from class: sm9.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (z54) {
                            case 0:
                                rm9.e it9 = (rm9.e) obj5;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                cVar3.C2(it9);
                                return Unit.f186387a;
                            default:
                                um9.g it10 = (um9.g) obj5;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                com.revolut.feature.payees.impl.ui.payees_overview.flow.c cVar4 = cVar3;
                                cVar4.getClass();
                                if (it10 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar4.C2(new rm9.a(new OwnerType.Junior(it10.f281273a, it10.f281274b)));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block17, "block");
                juniorPayeesOverviewScreen.H = block17;
                return juniorPayeesOverviewScreen;
            case 18:
                com.revolut.feature.profile.impl.ui.details.email.c cVar4 = (com.revolut.feature.profile.impl.ui.details.email.c) obj4;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                VerifyEmailFlowContract$Step step11 = (VerifyEmailFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (Intrinsics.f(step11, VerifyEmailFlowContract$Step.ConfirmationInProgress.f81380a)) {
                    String str6 = cVar4.o.f81377a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    EmailConfirmationScreen emailConfirmationScreen = new EmailConfirmationScreen(new EmailConfirmationScreenContract$InputData(str6));
                    sma.d block18 = new sma.d(cVar4, z11 ? 1 : 0);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    emailConfirmationScreen.H = block18;
                    return emailConfirmationScreen;
                }
                if (!(step11 instanceof VerifyEmailFlowContract$Step.Email)) {
                    if (!(step11 instanceof VerifyEmailFlowContract$Step.CheckEmail)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str7 = ((VerifyEmailFlowContract$Step.CheckEmail) step11).f81379a;
                    CheckInboxScreen checkInboxScreen = new CheckInboxScreen(new CheckInboxScreenContract$InputData(((VerifyEmailFlowContract$State) ((j2) cVar4.u.f22677a).getValue()).f81378a, str7));
                    k block19 = new k(cVar4, str7, 9);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    checkInboxScreen.H = block19;
                    return checkInboxScreen;
                }
                VerifyEmailFlowContract$Step.Email email = (VerifyEmailFlowContract$Step.Email) step11;
                wi0.b bVar3 = email.f81381a;
                k9 k9Var4 = k9.Profile;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                AnalyticsProduct.Retail retailH2 = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.profile_email, null, null, 14);
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause textClause4 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause5 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                sma.c cVar5 = email.f81383c;
                int i22 = sma.e.f264404a[cVar5.ordinal()];
                if (i22 == 1) {
                    i = R.string.profile_details_email_button_verify;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.profile_details_email_button_change;
                }
                ViewController viewControllerE17 = cVar4.e1(new EmailFlowDescriptor(new EmailFlowInputData(retailH2, new EmailFlowInputData.EmailScreenItemData(textLocalisedClause, textClause4, textClause5, new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R.string.profile_personal_details_email_subtitle, null, null, 14), rbl.a.CLOSE), new EmailFlowInputData.PrefillEmailData(email.f81382b, cVar5 == sma.c.VERIFY, false), bVar3, false, false, false)));
                sma.d block20 = new sma.d(cVar4, i3);
                Intrinsics.checkNotNullParameter(block20, "block");
                viewControllerE17.H = block20;
                return viewControllerE17;
            case 19:
                CategoryBudgetsController categoryBudgetsController = (CategoryBudgetsController) obj4;
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                MaskedTextInputEditText field = (MaskedTextInputEditText) obj3;
                KProperty[] kPropertyArr = CategoryBudgetsController.V;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.u;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsContract.CategoryRow");
                smd.i iVar = (smd.i) obj5;
                xi0.b bVar4 = iVar.f264421b;
                u80.d dVar = (u80.d) categoryBudgetsController.N.getValue();
                s sVar = new s();
                sVar.f264432a = categoryBudgetsController;
                sVar.f264433b = iVar;
                return new zp0.d(field, bVar4, dVar, null, sVar, true, true, 0, false, null, 1928);
            case 20:
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b bVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AnalyticsDashboardContract$ModalStep step12 = (AnalyticsDashboardContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof AnalyticsDashboardContract$ModalStep.BudgetAccountPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar13 = new lw0.a(new TextLocalisedClause(R$string.analytics_dashboard_section_tools_budget_setup_bottom_sheet_title_revamp, null, null, 14), null, null, null, false, 30);
                AnalyticsDashboardContract$ModalStep.BudgetAccountPicker budgetAccountPicker = (AnalyticsDashboardContract$ModalStep.BudgetAccountPicker) step12;
                ArrayList<AnalyticsDashboardContract$BudgetPickerAccount> arrayList5 = budgetAccountPicker.f87524a;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                for (AnalyticsDashboardContract$BudgetPickerAccount account : arrayList5) {
                    wnd.b bVar6 = bVar5.f87543w;
                    AnalyticsDashboardContract$DashboardUserData analyticsDashboardContract$DashboardUserData = budgetAccountPicker.f87525b;
                    bVar6.getClass();
                    Intrinsics.checkNotNullParameter(account, "account");
                    AccountId accountId = account.f87516a;
                    if (Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
                        pair = new Pair(Integer.valueOf(R$string.analytics_dashboard_section_tools_budget_setup_bottom_sheet_personal), new RowDelegate.Model.MainImage.Image40(new UserAvatarImage((analyticsDashboardContract$DashboardUserData == null || (str = analyticsDashboardContract$DashboardUserData.f87522a) == null) ? null : new UserNamePlaceholder.Default(str, UserNamePlaceholder.PlaceholderSize.Default.f60052a), null, null, 6), null, null, false, null, false, 62));
                    } else {
                        if (!(accountId instanceof AccountId.Joint)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = new Pair(Integer.valueOf(R$string.analytics_dashboard_section_tools_budget_setup_bottom_sheet_joint), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_joint, R$attr.uikit_colorOnAccent, R$attr.uikit_colorPurple), null, null, false, null, false, 62));
                    }
                    arrayList6.add(new eii.l((Clause) new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), account.f87518c, (RowDelegate.Model.MainImage) pair.f186386b, true, false, (RowDelegate.Model.c) new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false), (Object) account, 168));
                }
                k9 k9Var5 = k9.Analytics;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar13, null, arrayList6, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null));
                sl5.a block21 = new sl5.a(bVar5, 5);
                Intrinsics.checkNotNullParameter(block21, "block");
                rowActionsBottomSheetController.H = block21;
                return rowActionsBottomSheetController;
            case 21:
                com.revolut.feature.wealth.ui.impl.transfer_picker.e eVar3 = (com.revolut.feature.wealth.ui.impl.transfer_picker.e) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WealthTransferPickerControllerContract$ModalStep step13 = (WealthTransferPickerControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof WealthTransferPickerControllerContract$ModalStep.CashHoldingDeactivatedBorrowedFundsExplanation)) {
                    throw new NoWhenBranchMatchedException();
                }
                mlh.a aVar14 = eVar3.o;
                WealthTransferPickerControllerContract$ModalStep.CashHoldingDeactivatedBorrowedFundsExplanation cashHoldingDeactivatedBorrowedFundsExplanation = (WealthTransferPickerControllerContract$ModalStep.CashHoldingDeactivatedBorrowedFundsExplanation) step13;
                xi0.b bVar7 = cashHoldingDeactivatedBorrowedFundsExplanation.f96059a;
                xi0.b bVar8 = cashHoldingDeactivatedBorrowedFundsExplanation.f96060b;
                aVar14.getClass();
                return mlh.a.a(bVar7, bVar8);
            case 22:
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar15 = (com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BPayReviewScreenContract$ModalStep step14 = (BPayReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof BPayReviewScreenContract$ModalStep.EditLabel)) {
                    throw new NoWhenBranchMatchedException();
                }
                EditLabelScreen editLabelScreen = new EditLabelScreen(new EditLabelScreenContract$InputData(((BPayReviewScreenContract$ModalStep.EditLabel) step14).f61237a));
                r block22 = new r(aVar15, z12 ? 1 : 0);
                Intrinsics.checkNotNullParameter(block22, "block");
                editLabelScreen.H = block22;
                return editLabelScreen;
            case 23:
                return a(obj2, obj3);
            case 24:
                List documents = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(documents, "documents");
                ((sre.k) obj4).f265205c.f("USER_DOCUMENTS_KEY", documents);
                return Unit.f186387a;
            case 25:
                CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = (CreditCardInstalmentRepayChooseAmountScreen) obj4;
                CenteredAmountDelegate.Model model2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = CreditCardInstalmentRepayChooseAmountScreen.X;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj6 = model2.f51981p;
                xi0.b bVar9 = obj6 instanceof xi0.b ? (xi0.b) obj6 : null;
                if (bVar9 != null) {
                    return new zp0.d(field2.getEditText(), bVar9, (u80.d) creditCardInstalmentRepayChooseAmountScreen.O.getValue(), null, null, false, false, 0, false, null, 1944);
                }
                return null;
            case 26:
                return b(obj2, obj3);
            case 27:
                final com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c cVar6 = (com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c) obj4;
                l FlowCoordinator6 = (l) obj2;
                BlikTermsAcceptanceFlowContract$Step step15 = (BlikTermsAcceptanceFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof BlikTermsAcceptanceFlowContract$Step.Intro) {
                    IntroScreen introScreen = new IntroScreen();
                    Function1 block23 = new Function1() { // from class: su1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    tu1.e termsResult = (tu1.e) obj7;
                                    Intrinsics.checkNotNullParameter(termsResult, "termsResult");
                                    boolean zF = Intrinsics.f(termsResult, e.a.f274517a);
                                    com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c cVar7 = cVar6;
                                    if (zF) {
                                        cVar7.C2(a.C0455a.f61690a);
                                    } else {
                                        if (!Intrinsics.f(termsResult, e.b.f274518a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (cVar7.o.f61687a.isEmpty()) {
                                            cVar7.l2(new com.revolut.feature.apm.blik.impl.ui.terms_acceptance.b(cVar7, null), new yi5.b(26));
                                        } else {
                                            h.t2(cVar7, cVar7.f61694r, BlikTermsAcceptanceFlowContract$Step.TermsScreen.f61689a, false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    vu1.e result = (vu1.e) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, e.a.f292194a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c cVar8 = cVar6;
                                    cVar8.l2(new com.revolut.feature.apm.blik.impl.ui.terms_acceptance.b(cVar8, null), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    introScreen.H = block23;
                    return introScreen;
                }
                if (!(step15 instanceof BlikTermsAcceptanceFlowContract$Step.TermsScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                TermsScreen termsScreen = new TermsScreen(new TermsScreenContract$InputData(cVar6.o.f61687a));
                final boolean z74 = z29 ? 1 : 0;
                Function1 block24 = new Function1() { // from class: su1.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (z74) {
                            case 0:
                                tu1.e termsResult = (tu1.e) obj7;
                                Intrinsics.checkNotNullParameter(termsResult, "termsResult");
                                boolean zF = Intrinsics.f(termsResult, e.a.f274517a);
                                com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c cVar7 = cVar6;
                                if (zF) {
                                    cVar7.C2(a.C0455a.f61690a);
                                } else {
                                    if (!Intrinsics.f(termsResult, e.b.f274518a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (cVar7.o.f61687a.isEmpty()) {
                                        cVar7.l2(new com.revolut.feature.apm.blik.impl.ui.terms_acceptance.b(cVar7, null), new yi5.b(26));
                                    } else {
                                        h.t2(cVar7, cVar7.f61694r, BlikTermsAcceptanceFlowContract$Step.TermsScreen.f61689a, false, null, false, 12);
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                vu1.e result = (vu1.e) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (!Intrinsics.f(result, e.a.f292194a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c cVar8 = cVar6;
                                cVar8.l2(new com.revolut.feature.apm.blik.impl.ui.terms_acceptance.b(cVar8, null), new yi5.b(26));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block24, "block");
                termsScreen.H = block24;
                return termsScreen;
            case 28:
                return c(obj2, obj3);
            default:
                com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.a aVar16 = (com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.a) obj4;
                InsuranceCoverageActivationFlowContract$InputData insuranceCoverageActivationFlowContract$InputData = aVar16.o;
                l FlowCoordinator7 = (l) obj2;
                InsuranceCoverageActivationFlowContract$Step step16 = (InsuranceCoverageActivationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof InsuranceCoverageActivationFlowContract$Step.CoverageActivation)) {
                    if (step16 instanceof InsuranceCoverageActivationFlowContract$Step.EligibleCards) {
                        return new InsuranceEligibleCardsScreen(new InsuranceEligibleCardsScreenContract$InputData(insuranceCoverageActivationFlowContract$InputData.f76054b, insuranceCoverageActivationFlowContract$InputData.f76055c));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                InsuranceCoverageActivationScreen insuranceCoverageActivationScreen = new InsuranceCoverageActivationScreen(new InsuranceCoverageActivationScreenContract$InputData(insuranceCoverageActivationFlowContract$InputData.f76053a, insuranceCoverageActivationFlowContract$InputData.f76054b, insuranceCoverageActivationFlowContract$InputData.f76055c));
                k block25 = new k(aVar16, FlowCoordinator7, 27);
                Intrinsics.checkNotNullParameter(block25, "block");
                insuranceCoverageActivationScreen.H = block25;
                return insuranceCoverageActivationScreen;
        }
    }

    public /* synthetic */ h(sef.i iVar, sef.f fVar) {
        this.f261770a = 5;
        this.f261771b = fVar;
    }
}
