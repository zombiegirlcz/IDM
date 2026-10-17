package i69;

import aii.q;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import c55.z;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.backend_flow.impl.flow.BackendFlowContract$Step;
import com.revolut.core.backend_flow.impl.internal_flow.InternalBackendFlow;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.core.api.ApmToggles$PixApmMigration;
import com.revolut.feature.apm.multibanco.impl.ui.pending.MultibancoPendingPaymentFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreenContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.pending.prompt.PendingPaymentPromptScreen;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.card_screen.impl.kompot.reactivate.ReactivateCardScreenContract$ModalStep;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.select_store.CashTopUpSelectStoreFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.select_store.CashTopUpSelectStoreScreen;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.HowItWorksScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.HowItWorksScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.mapper.LoanRepaymentBreakdownExplainerFactory$ExplainerDialog;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.LoanPaymentManagementFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.LoanPaymentManagementFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.ReviewPaymentControllerContract$ModalStep;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.CryptoBalanceBreakdownContract$ModalStep;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.MtaDeclineScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.MtaDeclineScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreenContract$InputData;
import com.revolut.feature.junior.isa.api.navigation.JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership;
import com.revolut.feature.masav.impl.ui.review.MasavDirectDebitReviewScreenContract$ModalStep;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.FormPaymentFlowContract$Step;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreen;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeyStatus;
import com.revolut.feature.pix.api.navigation.PixPortabilityNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixPortabilityNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.flow.alias_deletion.AliasDeletionContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_deletion.AliasDeletionFlow;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationFlow;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoContract$InputData;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoFlow;
import com.revolut.feature.pix.impl.flow.copy_paste.PixCopyPasteFlow;
import com.revolut.feature.pix.impl.flow.pix_area.PixAreaFlowContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.PixAreaFlowContract$Step;
import com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.PixAddTrustedAccountScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.alias_details.AliasDetailsScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.screens.disputes.PixDisputesScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.review_trusted_account.ReviewTrustedAccountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.PixTrustedListScreen;
import com.revolut.feature.pix.impl.flow.qr.PixQrCodeFlow;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestFlow;
import com.revolut.feature.pix.impl.flow.transfer.PixTransferFlow;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$ModalStep;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker.ReservationDatePickerScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerScreen;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlow;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$InputData;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreen;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreen;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreen;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreen;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$InputData;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$ModalStep;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderScreen;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreen;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreenContract$InputData;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import com.revolut.feature.store.api.navigation.StoreDestination;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.TrustedMerchantsFlowContract$Step;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsContract$InputData;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsController;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.list.TrustedMerchantsListController;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Step;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlow;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$ModalStep;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersController;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.InstrumentsCollectionFiltersControllerContract$InputData;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.cash_selector.CashHoldingsSelectorScreen;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreen;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation.CashHoldingFundsExplanationScreenContract$InputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$ModalStep;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowInputData;
import com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.CollectCitizenshipFlow;
import com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.CollectCitizenshipFlowContract$InputData;
import com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.SubmitCitizenshipFlowContract$Step;
import com.revolut.feature_retail_user_declarations.employer.EmployerInputData;
import com.revolut.feature_retail_user_declarations.employer.flow.EmployerFlowContract$Step;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerController;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerControllerContract$InputData;
import com.revolut.feature_retail_user_declarations.risk_assessment.flow.RiskAssessmentFlowContract$Step;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskAssessmentScreen;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskAssessmentScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtp;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.sso.impl.ui.consolidation.ContinueWithIdentityFlowContract$Step;
import com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreen;
import fmg.n0;
import grl.k9;
import j82.j;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import maa.k;
import oc3.m;
import oki.h;
import qc3.g;
import taa.g;
import til.m;
import vaa.l;
import vaa.n;
import vaa.o;
import vaa.p;
import vaa.r;
import vaa.s;
import vaa.t;
import vaa.u;
import vaa.v;
import vaa.w;
import vaa.x;
import vaa.y;
import vkm.j2;
import yca.i;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f158902b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f158901a = i;
        this.f158902b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.insurance_car.impl.ui.flow.mta_review.c cVar = (com.revolut.feature.insurance_car.impl.ui.flow.mta_review.c) this.f158902b;
        yki.l FlowCoordinator = (yki.l) obj2;
        MtaReviewFlowContract$Step step = (MtaReviewFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof MtaReviewFlowContract$Step.Review)) {
            if (step instanceof MtaReviewFlowContract$Step.Decline) {
                return new MtaDeclineScreen(new MtaDeclineScreenContract$InputData(((MtaReviewFlowContract$Step.Decline) step).f75385a));
            }
            throw new NoWhenBranchMatchedException();
        }
        MtaReviewFlowContract$Step.Review review = (MtaReviewFlowContract$Step.Review) step;
        MtaReviewFlowContract$InputData mtaReviewFlowContract$InputData = cVar.o;
        MtaReviewScreen mtaReviewScreen = new MtaReviewScreen(new MtaReviewScreenContract$InputData(mtaReviewFlowContract$InputData.f75382a, mtaReviewFlowContract$InputData.f75383b, review.f75387b, review.f75386a));
        com.revolut.feature.insurance_car.impl.ui.flow.mta_review.b bVar = new com.revolut.feature.insurance_car.impl.ui.flow.mta_review.b(1, 0, com.revolut.feature.insurance_car.impl.ui.flow.mta_review.c.class, cVar, "handleReviewScreenResult", "handleReviewScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/mta/review/MtaReviewScreenContract$OutputData;)V");
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        mtaReviewScreen.H = bVar;
        return mtaReviewScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object pixQrRequestFlow;
        CollectDepositInfoFlow collectDepositInfoFlow;
        ShopsCarouselDetailsScreen shopsCarouselDetailsScreen;
        ViewController viewControllerE1;
        int i = this.f158901a;
        final int i2 = 3;
        int i3 = 14;
        Object[] objArr = 0;
        final int i5 = 2;
        final int i6 = 0;
        final int i21 = 1;
        Object obj4 = this.f158902b;
        switch (i) {
            case 0:
                com.revolut.feature.masav.impl.ui.review.a aVar = (com.revolut.feature.masav.impl.ui.review.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MasavDirectDebitReviewScreenContract$ModalStep step = (MasavDirectDebitReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof MasavDirectDebitReviewScreenContract$ModalStep.PocketSelector)) {
                    throw new NoWhenBranchMatchedException();
                }
                io3.d dVar = ((MasavDirectDebitReviewScreenContract$ModalStep.PocketSelector) step).f78127a;
                l2j.a aVar2 = aVar.o;
                String str = dVar.f163145a;
                xi0.a aVar3 = xi0.b.Companion;
                String str2 = dVar.f163147c;
                aVar3.getClass();
                CurrencyChooserFlow currencyChooserFlowA = aVar2.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(str, xi0.a.a(str2), io3.l.CURRENT, (Set) null, (Set) null, y0.b(k1j.a.POCKETS), (TextLocalisedClause) null, false, (Integer) null, (Set) null, 1976)));
                i30.a aVar4 = new i30.a(aVar, 17);
                Intrinsics.checkNotNullParameter(aVar4, "<set-?>");
                currencyChooserFlowA.J = aVar4;
                return currencyChooserFlowA;
            case 1:
                LoanPaymentManagementFlowContract$InputData loanPaymentManagementFlowContract$InputData = (LoanPaymentManagementFlowContract$InputData) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                LoanPaymentManagementFlowContract$Step step2 = (LoanPaymentManagementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof LoanPaymentManagementFlowContract$Step.Manage) {
                    return new LoanManageRepaymentsController(new LoanManageRepaymentsControllerContract$InputData(loanPaymentManagementFlowContract$InputData.f70469a));
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                final com.revolut.feature.apm.multibanco.impl.ui.pending.a aVar5 = (com.revolut.feature.apm.multibanco.impl.ui.pending.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                MultibancoPendingPaymentFlowContract$Step step3 = (MultibancoPendingPaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof MultibancoPendingPaymentFlowContract$Step.Confirmation) {
                    PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = new PendingPaymentConfirmationScreen(new PendingPaymentConfirmationScreenContract$InputData(((MultibancoPendingPaymentFlowContract$Step.Confirmation) step3).f62618a));
                    Function1 block = new Function1() { // from class: i82.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    j outputData = (j) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, j.a.f172091a);
                                    com.revolut.feature.apm.multibanco.impl.ui.pending.a aVar6 = aVar5;
                                    if (zF) {
                                        h.t2(aVar6, aVar6.f62620p, MultibancoPendingPaymentFlowContract$Step.Prompt.f62619a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, j.c.f172093a) && !Intrinsics.f(outputData, j.b.f172092a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.C2(q.f5292a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter((q) obj5, "outputData");
                                    aVar5.C2(q.f5292a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    pendingPaymentConfirmationScreen.H = block;
                    return pendingPaymentConfirmationScreen;
                }
                if (!(step3 instanceof MultibancoPendingPaymentFlowContract$Step.Prompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                PendingPaymentPromptScreen pendingPaymentPromptScreen = new PendingPaymentPromptScreen();
                Function1 block2 = new Function1() { // from class: i82.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i21) {
                            case 0:
                                j outputData = (j) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean zF = Intrinsics.f(outputData, j.a.f172091a);
                                com.revolut.feature.apm.multibanco.impl.ui.pending.a aVar6 = aVar5;
                                if (zF) {
                                    h.t2(aVar6, aVar6.f62620p, MultibancoPendingPaymentFlowContract$Step.Prompt.f62619a, false, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(outputData, j.c.f172093a) && !Intrinsics.f(outputData, j.b.f172092a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar6.C2(q.f5292a);
                                }
                                return Unit.f186387a;
                            default:
                                Intrinsics.checkNotNullParameter((q) obj5, "outputData");
                                aVar5.C2(q.f5292a);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                pendingPaymentPromptScreen.H = block2;
                return pendingPaymentPromptScreen;
            case 3:
                com.revolut.feature.card_screen.impl.kompot.reactivate.b bVar = (com.revolut.feature.card_screen.impl.kompot.reactivate.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReactivateCardScreenContract$ModalStep step4 = (ReactivateCardScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof ReactivateCardScreenContract$ModalStep.ShowConfirmationDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                ReactivateCardConfirmationBottomSheetScreen reactivateCardConfirmationBottomSheetScreen = new ReactivateCardConfirmationBottomSheetScreen(new ReactivateCardConfirmationBottomSheetContract$InputData(((ReactivateCardScreenContract$ModalStep.ShowConfirmationDialog) step4).f65488a));
                i30.a block3 = new i30.a(bVar, 27);
                Intrinsics.checkNotNullParameter(block3, "block");
                reactivateCardConfirmationBottomSheetScreen.H = block3;
                return reactivateCardConfirmationBottomSheetScreen;
            case 4:
                z zVar = ((com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a) obj4).f70569q;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReviewPaymentControllerContract$ModalStep step5 = (ReviewPaymentControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof ReviewPaymentControllerContract$ModalStep.ExplainerDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                LoanRepaymentBreakdownExplainerFactory$ExplainerDialog loanRepaymentBreakdownExplainerFactory$ExplainerDialog = ((ReviewPaymentControllerContract$ModalStep.ExplainerDialog) step5).f70567a;
                if (loanRepaymentBreakdownExplainerFactory$ExplainerDialog instanceof LoanRepaymentBreakdownExplainerFactory$ExplainerDialog.BreakageFee) {
                    return zVar.c(((LoanRepaymentBreakdownExplainerFactory$ExplainerDialog.BreakageFee) loanRepaymentBreakdownExplainerFactory$ExplainerDialog).f70311a);
                }
                if (loanRepaymentBreakdownExplainerFactory$ExplainerDialog instanceof LoanRepaymentBreakdownExplainerFactory$ExplainerDialog.EarlyRepaymentAmount) {
                    return zVar.e();
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                ia0.f fVar = (ia0.f) obj4;
                BackendFlowContract$Step step6 = (BackendFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                InternalBackendFlow internalBackendFlow = new InternalBackendFlow(step6.f51230a);
                i4g.g block4 = new i4g.g(1, fVar, ia0.f.class, "postResult", "postResult(Lcom/revolut/kompot/common/IOData$Output;)V", 0, 6);
                Intrinsics.checkNotNullParameter(block4, "block");
                internalBackendFlow.H = block4;
                return internalBackendFlow;
            case 6:
                final com.revolut.feature.pix.impl.flow.pix_area.a aVar6 = (com.revolut.feature.pix.impl.flow.pix_area.a) obj4;
                PixAreaFlowContract$InputData pixAreaFlowContract$InputData = aVar6.o;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                PixAreaFlowContract$Step step7 = (PixAreaFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof PixAreaFlowContract$Step.ProductArticle) {
                    iaa.f fVar2 = ((PixAreaFlowContract$Step.ProductArticle) step7).f80652a;
                    Function1 block5 = new Function1() { // from class: iaa.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    yja.b it8 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar6.B2();
                                    return Unit.f186387a;
                                default:
                                    raa.f result = (raa.f) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, raa.d.f252796a);
                                    com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                    if (zF) {
                                        aVar7.C1(new ChatFlowDestination(new ChatTarget.ChatList(ChatListFilter.PastRequests.f51037a, (TicketCreationContext) null, (String) null, 12), true));
                                    } else {
                                        if (!Intrinsics.f(result, raa.e.f252797a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        m mVar = aVar7.f80660q;
                                        Map mapK = r0.k(new Pair(ib.b.Flow, "SECURITY_HUB_FRAUD_REPORTING"), new Pair("country", "BR"));
                                        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                                        k9 k9Var = k9.Payments;
                                        companion.getClass();
                                        aVar7.C1(m.a(mVar, new WorkflowConfiguration.CreateWorkflow(mapK, AnalyticsProduct.Companion.b(k9Var), 46), null, 6));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    ViewController viewControllerE12 = aVar6.e1(new ProductArticleDescriptor(fVar2.a(), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE12.H = block5;
                    return viewControllerE12;
                }
                if (Intrinsics.f(step7, PixAreaFlowContract$Step.PixArea.f80649a)) {
                    PixAreaScreen pixAreaScreen = new PixAreaScreen(new vaa.k(pixAreaFlowContract$InputData.f80642a));
                    Function1 block6 = new Function1() { // from class: iaa.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    y it8 = (y) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    boolean zF = Intrinsics.f(it8, w.f287217a);
                                    com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                    yki.b bVar2 = LazyFlowCoordinator;
                                    if (zF) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.TrustedList.f80658a, true, null, false, 12);
                                    } else if (Intrinsics.f(it8, u.f287215a)) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.Send.f80656a, true, null, false, 12);
                                    } else if (Intrinsics.f(it8, vaa.m.f287207a)) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.CopyPaste.f80645a, true, null, false, 12);
                                    } else {
                                        boolean zF2 = Intrinsics.f(it8, n.f287208a);
                                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                        if (zF2) {
                                            h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(null), bottom_dialog);
                                        } else if (Intrinsics.f(it8, o.f287209a)) {
                                            h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(AliasRegistrationType.RandomKey.f80393a), bottom_dialog);
                                        } else if (Intrinsics.f(it8, vaa.q.f287211a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.PixAutomatico.f80650a, true, null, false, 12);
                                        } else if (it8 instanceof s) {
                                            h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.QrRequest(((s) it8).f287213a), true, null, false, 12);
                                        } else if (Intrinsics.f(it8, t.f287214a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, r.f287212a)) {
                                            h.w2(bVar2, PixAreaFlowContract$Step.PixDisputes.f80651a, bottom_dialog);
                                        } else if (it8 instanceof x) {
                                            PixKey pixKey = ((x) it8).f287218a;
                                            if (pixKey.getF80406b() instanceof PixKeyStatus.UnderPortability) {
                                                aVar7.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixPortabilityNavigation$Destination(new PixPortabilityNavigation$InputData.Details(aVar7.o.f80642a, pixKey)), yhi.b.SOLID, (Integer) null, 12))));
                                            }
                                        } else if (it8 instanceof p) {
                                            aVar7.C1(u0.c(((uz9.a) aVar7.f80659p).a(new ChatTransferRecipient.BeneficiaryRecipient(((p) it8).f287210a, null), null)));
                                        } else if (it8 instanceof v) {
                                            h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.ProductArticle(((v) it8).f287216a), true, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(it8, l.f287204a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.w2(bVar2, PixAreaFlowContract$Step.MyAliases.f80647a, bottom_dialog);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    taa.h result = (taa.h) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, g.f269298a)) {
                                        h.w2(LazyFlowCoordinator, new PixAreaFlowContract$Step.NewKey(null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result instanceof taa.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar8 = aVar6;
                                        f8a.a aVar9 = aVar8.f80661r;
                                        AccountId accountId = aVar8.o.f80642a;
                                        PixKey pixKey2 = ((taa.f) result).f269297a;
                                        s8a.e eVar = (s8a.e) aVar9;
                                        eVar.getClass();
                                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                                        Intrinsics.checkNotNullParameter(pixKey2, "key");
                                        n8a.o oVar = eVar.f260947a;
                                        oVar.getClass();
                                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                                        Intrinsics.checkNotNullParameter(pixKey2, "pixKey");
                                        ue0.c cVar = oVar.f213341b;
                                        String strA = vca.a.a(accountId);
                                        if (strA == null) {
                                            strA = "personal";
                                        }
                                        z9h.n.l(String.class, cVar, "FAVORITE_KEY_".concat(strA), pixKey2.getF80405a());
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    paa.g result2 = (paa.g) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof paa.e;
                                    yki.b bVar3 = LazyFlowCoordinator;
                                    if (z) {
                                        h.w2(bVar3, new PixAreaFlowContract$Step.AliasDeletion(((paa.e) result2).f234461a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result2 instanceof paa.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, bVar3, new PixAreaFlowContract$Step.QrRequest(((paa.f) result2).f234462a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    dba.f it9 = (dba.f) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (!Intrinsics.f(it9, dba.f.f112696a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar6, LazyFlowCoordinator, PixAreaFlowContract$Step.AddTrustedAccount.f80643a, true, null, false, 12);
                                    return Unit.f186387a;
                                case 4:
                                    k result3 = (k) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar6, LazyFlowCoordinator, new PixAreaFlowContract$Step.TransferInputKey(result3.f203982a), true, null, false, 12);
                                    return Unit.f186387a;
                                case 5:
                                    yca.k result4 = (yca.k) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z3 = result4 instanceof yca.j;
                                    com.revolut.feature.pix.impl.flow.pix_area.a aVar10 = aVar6;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z3) {
                                        h.t2(aVar10, bVar4, new PixAreaFlowContract$Step.ReviewTrustedAccount(((yca.j) result4).f312584a), true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar10, bVar4, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yaa.e result5 = (yaa.e) obj5;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (!Intrinsics.f(result5, yaa.e.f311999a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    yki.b bVar5 = LazyFlowCoordinator;
                                    h.r2(bVar5);
                                    h.t2(aVar6, bVar5, PixAreaFlowContract$Step.TrustedList.f80658a, false, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    pixAreaScreen.H = block6;
                    return pixAreaScreen;
                }
                if (step7 instanceof PixAreaFlowContract$Step.MyAliases) {
                    MyAliasesScreen myAliasesScreen = new MyAliasesScreen(new MyAliasesScreenContract$InputData(true, null));
                    Function1 block7 = new Function1() { // from class: iaa.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    y it8 = (y) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    boolean zF = Intrinsics.f(it8, w.f287217a);
                                    com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                    yki.b bVar2 = LazyFlowCoordinator;
                                    if (zF) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.TrustedList.f80658a, true, null, false, 12);
                                    } else if (Intrinsics.f(it8, u.f287215a)) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.Send.f80656a, true, null, false, 12);
                                    } else if (Intrinsics.f(it8, vaa.m.f287207a)) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.CopyPaste.f80645a, true, null, false, 12);
                                    } else {
                                        boolean zF2 = Intrinsics.f(it8, n.f287208a);
                                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                        if (zF2) {
                                            h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(null), bottom_dialog);
                                        } else if (Intrinsics.f(it8, o.f287209a)) {
                                            h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(AliasRegistrationType.RandomKey.f80393a), bottom_dialog);
                                        } else if (Intrinsics.f(it8, vaa.q.f287211a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.PixAutomatico.f80650a, true, null, false, 12);
                                        } else if (it8 instanceof s) {
                                            h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.QrRequest(((s) it8).f287213a), true, null, false, 12);
                                        } else if (Intrinsics.f(it8, t.f287214a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, r.f287212a)) {
                                            h.w2(bVar2, PixAreaFlowContract$Step.PixDisputes.f80651a, bottom_dialog);
                                        } else if (it8 instanceof x) {
                                            PixKey pixKey = ((x) it8).f287218a;
                                            if (pixKey.getF80406b() instanceof PixKeyStatus.UnderPortability) {
                                                aVar7.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixPortabilityNavigation$Destination(new PixPortabilityNavigation$InputData.Details(aVar7.o.f80642a, pixKey)), yhi.b.SOLID, (Integer) null, 12))));
                                            }
                                        } else if (it8 instanceof p) {
                                            aVar7.C1(u0.c(((uz9.a) aVar7.f80659p).a(new ChatTransferRecipient.BeneficiaryRecipient(((p) it8).f287210a, null), null)));
                                        } else if (it8 instanceof v) {
                                            h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.ProductArticle(((v) it8).f287216a), true, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(it8, l.f287204a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.w2(bVar2, PixAreaFlowContract$Step.MyAliases.f80647a, bottom_dialog);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    taa.h result = (taa.h) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, g.f269298a)) {
                                        h.w2(LazyFlowCoordinator, new PixAreaFlowContract$Step.NewKey(null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result instanceof taa.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar8 = aVar6;
                                        f8a.a aVar9 = aVar8.f80661r;
                                        AccountId accountId = aVar8.o.f80642a;
                                        PixKey pixKey2 = ((taa.f) result).f269297a;
                                        s8a.e eVar = (s8a.e) aVar9;
                                        eVar.getClass();
                                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                                        Intrinsics.checkNotNullParameter(pixKey2, "key");
                                        n8a.o oVar = eVar.f260947a;
                                        oVar.getClass();
                                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                                        Intrinsics.checkNotNullParameter(pixKey2, "pixKey");
                                        ue0.c cVar = oVar.f213341b;
                                        String strA = vca.a.a(accountId);
                                        if (strA == null) {
                                            strA = "personal";
                                        }
                                        z9h.n.l(String.class, cVar, "FAVORITE_KEY_".concat(strA), pixKey2.getF80405a());
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    paa.g result2 = (paa.g) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof paa.e;
                                    yki.b bVar3 = LazyFlowCoordinator;
                                    if (z) {
                                        h.w2(bVar3, new PixAreaFlowContract$Step.AliasDeletion(((paa.e) result2).f234461a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result2 instanceof paa.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, bVar3, new PixAreaFlowContract$Step.QrRequest(((paa.f) result2).f234462a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    dba.f it9 = (dba.f) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (!Intrinsics.f(it9, dba.f.f112696a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar6, LazyFlowCoordinator, PixAreaFlowContract$Step.AddTrustedAccount.f80643a, true, null, false, 12);
                                    return Unit.f186387a;
                                case 4:
                                    k result3 = (k) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar6, LazyFlowCoordinator, new PixAreaFlowContract$Step.TransferInputKey(result3.f203982a), true, null, false, 12);
                                    return Unit.f186387a;
                                case 5:
                                    yca.k result4 = (yca.k) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z3 = result4 instanceof yca.j;
                                    com.revolut.feature.pix.impl.flow.pix_area.a aVar10 = aVar6;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z3) {
                                        h.t2(aVar10, bVar4, new PixAreaFlowContract$Step.ReviewTrustedAccount(((yca.j) result4).f312584a), true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar10, bVar4, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yaa.e result5 = (yaa.e) obj5;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (!Intrinsics.f(result5, yaa.e.f311999a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    yki.b bVar5 = LazyFlowCoordinator;
                                    h.r2(bVar5);
                                    h.t2(aVar6, bVar5, PixAreaFlowContract$Step.TrustedList.f80658a, false, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    myAliasesScreen.H = block7;
                    return myAliasesScreen;
                }
                if (step7 instanceof PixAreaFlowContract$Step.ManageAlias) {
                    AliasDetailsScreen aliasDetailsScreen = new AliasDetailsScreen(new AliasDetailsScreenContract$InputData(((PixAreaFlowContract$Step.ManageAlias) step7).f80646a));
                    Function1 block8 = new Function1() { // from class: iaa.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    y it8 = (y) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    boolean zF = Intrinsics.f(it8, w.f287217a);
                                    com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                    yki.b bVar2 = LazyFlowCoordinator;
                                    if (zF) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.TrustedList.f80658a, true, null, false, 12);
                                    } else if (Intrinsics.f(it8, u.f287215a)) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.Send.f80656a, true, null, false, 12);
                                    } else if (Intrinsics.f(it8, vaa.m.f287207a)) {
                                        h.t2(aVar7, bVar2, PixAreaFlowContract$Step.CopyPaste.f80645a, true, null, false, 12);
                                    } else {
                                        boolean zF2 = Intrinsics.f(it8, n.f287208a);
                                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                        if (zF2) {
                                            h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(null), bottom_dialog);
                                        } else if (Intrinsics.f(it8, o.f287209a)) {
                                            h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(AliasRegistrationType.RandomKey.f80393a), bottom_dialog);
                                        } else if (Intrinsics.f(it8, vaa.q.f287211a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.PixAutomatico.f80650a, true, null, false, 12);
                                        } else if (it8 instanceof s) {
                                            h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.QrRequest(((s) it8).f287213a), true, null, false, 12);
                                        } else if (Intrinsics.f(it8, t.f287214a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, r.f287212a)) {
                                            h.w2(bVar2, PixAreaFlowContract$Step.PixDisputes.f80651a, bottom_dialog);
                                        } else if (it8 instanceof x) {
                                            PixKey pixKey = ((x) it8).f287218a;
                                            if (pixKey.getF80406b() instanceof PixKeyStatus.UnderPortability) {
                                                aVar7.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixPortabilityNavigation$Destination(new PixPortabilityNavigation$InputData.Details(aVar7.o.f80642a, pixKey)), yhi.b.SOLID, (Integer) null, 12))));
                                            }
                                        } else if (it8 instanceof p) {
                                            aVar7.C1(u0.c(((uz9.a) aVar7.f80659p).a(new ChatTransferRecipient.BeneficiaryRecipient(((p) it8).f287210a, null), null)));
                                        } else if (it8 instanceof v) {
                                            h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.ProductArticle(((v) it8).f287216a), true, null, false, 12);
                                        } else {
                                            if (!Intrinsics.f(it8, l.f287204a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.w2(bVar2, PixAreaFlowContract$Step.MyAliases.f80647a, bottom_dialog);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    taa.h result = (taa.h) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, g.f269298a)) {
                                        h.w2(LazyFlowCoordinator, new PixAreaFlowContract$Step.NewKey(null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result instanceof taa.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar8 = aVar6;
                                        f8a.a aVar9 = aVar8.f80661r;
                                        AccountId accountId = aVar8.o.f80642a;
                                        PixKey pixKey2 = ((taa.f) result).f269297a;
                                        s8a.e eVar = (s8a.e) aVar9;
                                        eVar.getClass();
                                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                                        Intrinsics.checkNotNullParameter(pixKey2, "key");
                                        n8a.o oVar = eVar.f260947a;
                                        oVar.getClass();
                                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                                        Intrinsics.checkNotNullParameter(pixKey2, "pixKey");
                                        ue0.c cVar = oVar.f213341b;
                                        String strA = vca.a.a(accountId);
                                        if (strA == null) {
                                            strA = "personal";
                                        }
                                        z9h.n.l(String.class, cVar, "FAVORITE_KEY_".concat(strA), pixKey2.getF80405a());
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    paa.g result2 = (paa.g) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof paa.e;
                                    yki.b bVar3 = LazyFlowCoordinator;
                                    if (z) {
                                        h.w2(bVar3, new PixAreaFlowContract$Step.AliasDeletion(((paa.e) result2).f234461a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(result2 instanceof paa.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, bVar3, new PixAreaFlowContract$Step.QrRequest(((paa.f) result2).f234462a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    dba.f it9 = (dba.f) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (!Intrinsics.f(it9, dba.f.f112696a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar6, LazyFlowCoordinator, PixAreaFlowContract$Step.AddTrustedAccount.f80643a, true, null, false, 12);
                                    return Unit.f186387a;
                                case 4:
                                    k result3 = (k) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar6, LazyFlowCoordinator, new PixAreaFlowContract$Step.TransferInputKey(result3.f203982a), true, null, false, 12);
                                    return Unit.f186387a;
                                case 5:
                                    yca.k result4 = (yca.k) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z3 = result4 instanceof yca.j;
                                    com.revolut.feature.pix.impl.flow.pix_area.a aVar10 = aVar6;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z3) {
                                        h.t2(aVar10, bVar4, new PixAreaFlowContract$Step.ReviewTrustedAccount(((yca.j) result4).f312584a), true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar10, bVar4, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yaa.e result5 = (yaa.e) obj5;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    if (!Intrinsics.f(result5, yaa.e.f311999a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    yki.b bVar5 = LazyFlowCoordinator;
                                    h.r2(bVar5);
                                    h.t2(aVar6, bVar5, PixAreaFlowContract$Step.TrustedList.f80658a, false, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    aliasDetailsScreen.H = block8;
                    return aliasDetailsScreen;
                }
                if (step7 instanceof PixAreaFlowContract$Step.AliasDeletion) {
                    pixQrRequestFlow = new AliasDeletionFlow(new AliasDeletionContract$InputData(pixAreaFlowContract$InputData.f80642a, ((PixAreaFlowContract$Step.AliasDeletion) step7).f80644a));
                } else {
                    if (Intrinsics.f(step7, PixAreaFlowContract$Step.TrustedList.f80658a)) {
                        PixTrustedListScreen pixTrustedListScreen = new PixTrustedListScreen();
                        Function1 block9 = new Function1() { // from class: iaa.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i2) {
                                    case 0:
                                        y it8 = (y) obj5;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        boolean zF = Intrinsics.f(it8, w.f287217a);
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                        yki.b bVar2 = LazyFlowCoordinator;
                                        if (zF) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.TrustedList.f80658a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, u.f287215a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.Send.f80656a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, vaa.m.f287207a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.CopyPaste.f80645a, true, null, false, 12);
                                        } else {
                                            boolean zF2 = Intrinsics.f(it8, n.f287208a);
                                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                            if (zF2) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(null), bottom_dialog);
                                            } else if (Intrinsics.f(it8, o.f287209a)) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(AliasRegistrationType.RandomKey.f80393a), bottom_dialog);
                                            } else if (Intrinsics.f(it8, vaa.q.f287211a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.PixAutomatico.f80650a, true, null, false, 12);
                                            } else if (it8 instanceof s) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.QrRequest(((s) it8).f287213a), true, null, false, 12);
                                            } else if (Intrinsics.f(it8, t.f287214a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                            } else if (Intrinsics.f(it8, r.f287212a)) {
                                                h.w2(bVar2, PixAreaFlowContract$Step.PixDisputes.f80651a, bottom_dialog);
                                            } else if (it8 instanceof x) {
                                                PixKey pixKey = ((x) it8).f287218a;
                                                if (pixKey.getF80406b() instanceof PixKeyStatus.UnderPortability) {
                                                    aVar7.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixPortabilityNavigation$Destination(new PixPortabilityNavigation$InputData.Details(aVar7.o.f80642a, pixKey)), yhi.b.SOLID, (Integer) null, 12))));
                                                }
                                            } else if (it8 instanceof p) {
                                                aVar7.C1(u0.c(((uz9.a) aVar7.f80659p).a(new ChatTransferRecipient.BeneficiaryRecipient(((p) it8).f287210a, null), null)));
                                            } else if (it8 instanceof v) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.ProductArticle(((v) it8).f287216a), true, null, false, 12);
                                            } else {
                                                if (!Intrinsics.f(it8, l.f287204a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.w2(bVar2, PixAreaFlowContract$Step.MyAliases.f80647a, bottom_dialog);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        taa.h result = (taa.h) obj5;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, g.f269298a)) {
                                            h.w2(LazyFlowCoordinator, new PixAreaFlowContract$Step.NewKey(null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result instanceof taa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.pix.impl.flow.pix_area.a aVar8 = aVar6;
                                            f8a.a aVar9 = aVar8.f80661r;
                                            AccountId accountId = aVar8.o.f80642a;
                                            PixKey pixKey2 = ((taa.f) result).f269297a;
                                            s8a.e eVar = (s8a.e) aVar9;
                                            eVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "key");
                                            n8a.o oVar = eVar.f260947a;
                                            oVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "pixKey");
                                            ue0.c cVar = oVar.f213341b;
                                            String strA = vca.a.a(accountId);
                                            if (strA == null) {
                                                strA = "personal";
                                            }
                                            z9h.n.l(String.class, cVar, "FAVORITE_KEY_".concat(strA), pixKey2.getF80405a());
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        paa.g result2 = (paa.g) obj5;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean z = result2 instanceof paa.e;
                                        yki.b bVar3 = LazyFlowCoordinator;
                                        if (z) {
                                            h.w2(bVar3, new PixAreaFlowContract$Step.AliasDeletion(((paa.e) result2).f234461a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result2 instanceof paa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar6, bVar3, new PixAreaFlowContract$Step.QrRequest(((paa.f) result2).f234462a), false, null, false, 14);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        dba.f it9 = (dba.f) obj5;
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        if (!Intrinsics.f(it9, dba.f.f112696a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, PixAreaFlowContract$Step.AddTrustedAccount.f80643a, true, null, false, 12);
                                        return Unit.f186387a;
                                    case 4:
                                        k result3 = (k) obj5;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, new PixAreaFlowContract$Step.TransferInputKey(result3.f203982a), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 5:
                                        yca.k result4 = (yca.k) obj5;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        boolean z3 = result4 instanceof yca.j;
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar10 = aVar6;
                                        yki.b bVar4 = LazyFlowCoordinator;
                                        if (z3) {
                                            h.t2(aVar10, bVar4, new PixAreaFlowContract$Step.ReviewTrustedAccount(((yca.j) result4).f312584a), true, null, false, 12);
                                        } else {
                                            if (!(result4 instanceof i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar10, bVar4, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        yaa.e result5 = (yaa.e) obj5;
                                        Intrinsics.checkNotNullParameter(result5, "result");
                                        if (!Intrinsics.f(result5, yaa.e.f311999a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yki.b bVar5 = LazyFlowCoordinator;
                                        h.r2(bVar5);
                                        h.t2(aVar6, bVar5, PixAreaFlowContract$Step.TrustedList.f80658a, false, null, false, 12);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block9, "block");
                        pixTrustedListScreen.H = block9;
                        return pixTrustedListScreen;
                    }
                    if (Intrinsics.f(step7, PixAreaFlowContract$Step.AddTrustedAccount.f80643a)) {
                        PixAddTrustedAccountScreen pixAddTrustedAccountScreen = new PixAddTrustedAccountScreen();
                        final int i22 = 4;
                        Function1 block10 = new Function1() { // from class: iaa.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i22) {
                                    case 0:
                                        y it8 = (y) obj5;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        boolean zF = Intrinsics.f(it8, w.f287217a);
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                        yki.b bVar2 = LazyFlowCoordinator;
                                        if (zF) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.TrustedList.f80658a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, u.f287215a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.Send.f80656a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, vaa.m.f287207a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.CopyPaste.f80645a, true, null, false, 12);
                                        } else {
                                            boolean zF2 = Intrinsics.f(it8, n.f287208a);
                                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                            if (zF2) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(null), bottom_dialog);
                                            } else if (Intrinsics.f(it8, o.f287209a)) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(AliasRegistrationType.RandomKey.f80393a), bottom_dialog);
                                            } else if (Intrinsics.f(it8, vaa.q.f287211a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.PixAutomatico.f80650a, true, null, false, 12);
                                            } else if (it8 instanceof s) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.QrRequest(((s) it8).f287213a), true, null, false, 12);
                                            } else if (Intrinsics.f(it8, t.f287214a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                            } else if (Intrinsics.f(it8, r.f287212a)) {
                                                h.w2(bVar2, PixAreaFlowContract$Step.PixDisputes.f80651a, bottom_dialog);
                                            } else if (it8 instanceof x) {
                                                PixKey pixKey = ((x) it8).f287218a;
                                                if (pixKey.getF80406b() instanceof PixKeyStatus.UnderPortability) {
                                                    aVar7.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixPortabilityNavigation$Destination(new PixPortabilityNavigation$InputData.Details(aVar7.o.f80642a, pixKey)), yhi.b.SOLID, (Integer) null, 12))));
                                                }
                                            } else if (it8 instanceof p) {
                                                aVar7.C1(u0.c(((uz9.a) aVar7.f80659p).a(new ChatTransferRecipient.BeneficiaryRecipient(((p) it8).f287210a, null), null)));
                                            } else if (it8 instanceof v) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.ProductArticle(((v) it8).f287216a), true, null, false, 12);
                                            } else {
                                                if (!Intrinsics.f(it8, l.f287204a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.w2(bVar2, PixAreaFlowContract$Step.MyAliases.f80647a, bottom_dialog);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        taa.h result = (taa.h) obj5;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, g.f269298a)) {
                                            h.w2(LazyFlowCoordinator, new PixAreaFlowContract$Step.NewKey(null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result instanceof taa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.pix.impl.flow.pix_area.a aVar8 = aVar6;
                                            f8a.a aVar9 = aVar8.f80661r;
                                            AccountId accountId = aVar8.o.f80642a;
                                            PixKey pixKey2 = ((taa.f) result).f269297a;
                                            s8a.e eVar = (s8a.e) aVar9;
                                            eVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "key");
                                            n8a.o oVar = eVar.f260947a;
                                            oVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "pixKey");
                                            ue0.c cVar = oVar.f213341b;
                                            String strA = vca.a.a(accountId);
                                            if (strA == null) {
                                                strA = "personal";
                                            }
                                            z9h.n.l(String.class, cVar, "FAVORITE_KEY_".concat(strA), pixKey2.getF80405a());
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        paa.g result2 = (paa.g) obj5;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean z = result2 instanceof paa.e;
                                        yki.b bVar3 = LazyFlowCoordinator;
                                        if (z) {
                                            h.w2(bVar3, new PixAreaFlowContract$Step.AliasDeletion(((paa.e) result2).f234461a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result2 instanceof paa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar6, bVar3, new PixAreaFlowContract$Step.QrRequest(((paa.f) result2).f234462a), false, null, false, 14);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        dba.f it9 = (dba.f) obj5;
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        if (!Intrinsics.f(it9, dba.f.f112696a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, PixAreaFlowContract$Step.AddTrustedAccount.f80643a, true, null, false, 12);
                                        return Unit.f186387a;
                                    case 4:
                                        k result3 = (k) obj5;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, new PixAreaFlowContract$Step.TransferInputKey(result3.f203982a), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 5:
                                        yca.k result4 = (yca.k) obj5;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        boolean z3 = result4 instanceof yca.j;
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar10 = aVar6;
                                        yki.b bVar4 = LazyFlowCoordinator;
                                        if (z3) {
                                            h.t2(aVar10, bVar4, new PixAreaFlowContract$Step.ReviewTrustedAccount(((yca.j) result4).f312584a), true, null, false, 12);
                                        } else {
                                            if (!(result4 instanceof i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar10, bVar4, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        yaa.e result5 = (yaa.e) obj5;
                                        Intrinsics.checkNotNullParameter(result5, "result");
                                        if (!Intrinsics.f(result5, yaa.e.f311999a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yki.b bVar5 = LazyFlowCoordinator;
                                        h.r2(bVar5);
                                        h.t2(aVar6, bVar5, PixAreaFlowContract$Step.TrustedList.f80658a, false, null, false, 12);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block10, "block");
                        pixAddTrustedAccountScreen.H = block10;
                        return pixAddTrustedAccountScreen;
                    }
                    if (step7 instanceof PixAreaFlowContract$Step.TransferInputKey) {
                        if (((jte.d) aVar6.f80662s).c(ApmToggles$PixApmMigration.f61799c) && ((PixAreaFlowContract$Step.TransferInputKey) step7).f80657a == g8a.t.SEND) {
                            return new PixTransferFlow(new PixTransferNavigation$InputData.NewContact(0));
                        }
                        PixTransferInputKeyScreen pixTransferInputKeyScreen = new PixTransferInputKeyScreen(new PixTransferInputKeyScreenContract$InputData(((PixAreaFlowContract$Step.TransferInputKey) step7).f80657a));
                        final int i32 = 5;
                        Function1 block11 = new Function1() { // from class: iaa.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i32) {
                                    case 0:
                                        y it8 = (y) obj5;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        boolean zF = Intrinsics.f(it8, w.f287217a);
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                        yki.b bVar2 = LazyFlowCoordinator;
                                        if (zF) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.TrustedList.f80658a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, u.f287215a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.Send.f80656a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, vaa.m.f287207a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.CopyPaste.f80645a, true, null, false, 12);
                                        } else {
                                            boolean zF2 = Intrinsics.f(it8, n.f287208a);
                                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                            if (zF2) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(null), bottom_dialog);
                                            } else if (Intrinsics.f(it8, o.f287209a)) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(AliasRegistrationType.RandomKey.f80393a), bottom_dialog);
                                            } else if (Intrinsics.f(it8, vaa.q.f287211a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.PixAutomatico.f80650a, true, null, false, 12);
                                            } else if (it8 instanceof s) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.QrRequest(((s) it8).f287213a), true, null, false, 12);
                                            } else if (Intrinsics.f(it8, t.f287214a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                            } else if (Intrinsics.f(it8, r.f287212a)) {
                                                h.w2(bVar2, PixAreaFlowContract$Step.PixDisputes.f80651a, bottom_dialog);
                                            } else if (it8 instanceof x) {
                                                PixKey pixKey = ((x) it8).f287218a;
                                                if (pixKey.getF80406b() instanceof PixKeyStatus.UnderPortability) {
                                                    aVar7.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixPortabilityNavigation$Destination(new PixPortabilityNavigation$InputData.Details(aVar7.o.f80642a, pixKey)), yhi.b.SOLID, (Integer) null, 12))));
                                                }
                                            } else if (it8 instanceof p) {
                                                aVar7.C1(u0.c(((uz9.a) aVar7.f80659p).a(new ChatTransferRecipient.BeneficiaryRecipient(((p) it8).f287210a, null), null)));
                                            } else if (it8 instanceof v) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.ProductArticle(((v) it8).f287216a), true, null, false, 12);
                                            } else {
                                                if (!Intrinsics.f(it8, l.f287204a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.w2(bVar2, PixAreaFlowContract$Step.MyAliases.f80647a, bottom_dialog);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        taa.h result = (taa.h) obj5;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, g.f269298a)) {
                                            h.w2(LazyFlowCoordinator, new PixAreaFlowContract$Step.NewKey(null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result instanceof taa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.pix.impl.flow.pix_area.a aVar8 = aVar6;
                                            f8a.a aVar9 = aVar8.f80661r;
                                            AccountId accountId = aVar8.o.f80642a;
                                            PixKey pixKey2 = ((taa.f) result).f269297a;
                                            s8a.e eVar = (s8a.e) aVar9;
                                            eVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "key");
                                            n8a.o oVar = eVar.f260947a;
                                            oVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "pixKey");
                                            ue0.c cVar = oVar.f213341b;
                                            String strA = vca.a.a(accountId);
                                            if (strA == null) {
                                                strA = "personal";
                                            }
                                            z9h.n.l(String.class, cVar, "FAVORITE_KEY_".concat(strA), pixKey2.getF80405a());
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        paa.g result2 = (paa.g) obj5;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean z = result2 instanceof paa.e;
                                        yki.b bVar3 = LazyFlowCoordinator;
                                        if (z) {
                                            h.w2(bVar3, new PixAreaFlowContract$Step.AliasDeletion(((paa.e) result2).f234461a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result2 instanceof paa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar6, bVar3, new PixAreaFlowContract$Step.QrRequest(((paa.f) result2).f234462a), false, null, false, 14);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        dba.f it9 = (dba.f) obj5;
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        if (!Intrinsics.f(it9, dba.f.f112696a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, PixAreaFlowContract$Step.AddTrustedAccount.f80643a, true, null, false, 12);
                                        return Unit.f186387a;
                                    case 4:
                                        k result3 = (k) obj5;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, new PixAreaFlowContract$Step.TransferInputKey(result3.f203982a), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 5:
                                        yca.k result4 = (yca.k) obj5;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        boolean z3 = result4 instanceof yca.j;
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar10 = aVar6;
                                        yki.b bVar4 = LazyFlowCoordinator;
                                        if (z3) {
                                            h.t2(aVar10, bVar4, new PixAreaFlowContract$Step.ReviewTrustedAccount(((yca.j) result4).f312584a), true, null, false, 12);
                                        } else {
                                            if (!(result4 instanceof i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar10, bVar4, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        yaa.e result5 = (yaa.e) obj5;
                                        Intrinsics.checkNotNullParameter(result5, "result");
                                        if (!Intrinsics.f(result5, yaa.e.f311999a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yki.b bVar5 = LazyFlowCoordinator;
                                        h.r2(bVar5);
                                        h.t2(aVar6, bVar5, PixAreaFlowContract$Step.TrustedList.f80658a, false, null, false, 12);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block11, "block");
                        pixTransferInputKeyScreen.H = block11;
                        return pixTransferInputKeyScreen;
                    }
                    if (step7 instanceof PixAreaFlowContract$Step.ReviewTrustedAccount) {
                        ReviewTrustedAccountScreen reviewTrustedAccountScreen = new ReviewTrustedAccountScreen(new ReviewTrustedAccountScreenContract$InputData(((PixAreaFlowContract$Step.ReviewTrustedAccount) step7).f80655a));
                        final int i33 = 6;
                        Function1 block12 = new Function1() { // from class: iaa.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i33) {
                                    case 0:
                                        y it8 = (y) obj5;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        boolean zF = Intrinsics.f(it8, w.f287217a);
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                        yki.b bVar2 = LazyFlowCoordinator;
                                        if (zF) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.TrustedList.f80658a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, u.f287215a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.Send.f80656a, true, null, false, 12);
                                        } else if (Intrinsics.f(it8, vaa.m.f287207a)) {
                                            h.t2(aVar7, bVar2, PixAreaFlowContract$Step.CopyPaste.f80645a, true, null, false, 12);
                                        } else {
                                            boolean zF2 = Intrinsics.f(it8, n.f287208a);
                                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                            if (zF2) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(null), bottom_dialog);
                                            } else if (Intrinsics.f(it8, o.f287209a)) {
                                                h.w2(bVar2, new PixAreaFlowContract$Step.NewKey(AliasRegistrationType.RandomKey.f80393a), bottom_dialog);
                                            } else if (Intrinsics.f(it8, vaa.q.f287211a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.PixAutomatico.f80650a, true, null, false, 12);
                                            } else if (it8 instanceof s) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.QrRequest(((s) it8).f287213a), true, null, false, 12);
                                            } else if (Intrinsics.f(it8, t.f287214a)) {
                                                h.t2(aVar7, bVar2, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                            } else if (Intrinsics.f(it8, r.f287212a)) {
                                                h.w2(bVar2, PixAreaFlowContract$Step.PixDisputes.f80651a, bottom_dialog);
                                            } else if (it8 instanceof x) {
                                                PixKey pixKey = ((x) it8).f287218a;
                                                if (pixKey.getF80406b() instanceof PixKeyStatus.UnderPortability) {
                                                    aVar7.C1(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(new PixPortabilityNavigation$Destination(new PixPortabilityNavigation$InputData.Details(aVar7.o.f80642a, pixKey)), yhi.b.SOLID, (Integer) null, 12))));
                                                }
                                            } else if (it8 instanceof p) {
                                                aVar7.C1(u0.c(((uz9.a) aVar7.f80659p).a(new ChatTransferRecipient.BeneficiaryRecipient(((p) it8).f287210a, null), null)));
                                            } else if (it8 instanceof v) {
                                                h.t2(aVar7, bVar2, new PixAreaFlowContract$Step.ProductArticle(((v) it8).f287216a), true, null, false, 12);
                                            } else {
                                                if (!Intrinsics.f(it8, l.f287204a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.w2(bVar2, PixAreaFlowContract$Step.MyAliases.f80647a, bottom_dialog);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        taa.h result = (taa.h) obj5;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, g.f269298a)) {
                                            h.w2(LazyFlowCoordinator, new PixAreaFlowContract$Step.NewKey(null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result instanceof taa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            com.revolut.feature.pix.impl.flow.pix_area.a aVar8 = aVar6;
                                            f8a.a aVar9 = aVar8.f80661r;
                                            AccountId accountId = aVar8.o.f80642a;
                                            PixKey pixKey2 = ((taa.f) result).f269297a;
                                            s8a.e eVar = (s8a.e) aVar9;
                                            eVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "key");
                                            n8a.o oVar = eVar.f260947a;
                                            oVar.getClass();
                                            Intrinsics.checkNotNullParameter(accountId, "accountId");
                                            Intrinsics.checkNotNullParameter(pixKey2, "pixKey");
                                            ue0.c cVar = oVar.f213341b;
                                            String strA = vca.a.a(accountId);
                                            if (strA == null) {
                                                strA = "personal";
                                            }
                                            z9h.n.l(String.class, cVar, "FAVORITE_KEY_".concat(strA), pixKey2.getF80405a());
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        paa.g result2 = (paa.g) obj5;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        boolean z = result2 instanceof paa.e;
                                        yki.b bVar3 = LazyFlowCoordinator;
                                        if (z) {
                                            h.w2(bVar3, new PixAreaFlowContract$Step.AliasDeletion(((paa.e) result2).f234461a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            if (!(result2 instanceof paa.f)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar6, bVar3, new PixAreaFlowContract$Step.QrRequest(((paa.f) result2).f234462a), false, null, false, 14);
                                        }
                                        return Unit.f186387a;
                                    case 3:
                                        dba.f it9 = (dba.f) obj5;
                                        Intrinsics.checkNotNullParameter(it9, "it");
                                        if (!Intrinsics.f(it9, dba.f.f112696a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, PixAreaFlowContract$Step.AddTrustedAccount.f80643a, true, null, false, 12);
                                        return Unit.f186387a;
                                    case 4:
                                        k result3 = (k) obj5;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar6, LazyFlowCoordinator, new PixAreaFlowContract$Step.TransferInputKey(result3.f203982a), true, null, false, 12);
                                        return Unit.f186387a;
                                    case 5:
                                        yca.k result4 = (yca.k) obj5;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        boolean z3 = result4 instanceof yca.j;
                                        com.revolut.feature.pix.impl.flow.pix_area.a aVar10 = aVar6;
                                        yki.b bVar4 = LazyFlowCoordinator;
                                        if (z3) {
                                            h.t2(aVar10, bVar4, new PixAreaFlowContract$Step.ReviewTrustedAccount(((yca.j) result4).f312584a), true, null, false, 12);
                                        } else {
                                            if (!(result4 instanceof i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar10, bVar4, PixAreaFlowContract$Step.QrScan.f80654a, true, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        yaa.e result5 = (yaa.e) obj5;
                                        Intrinsics.checkNotNullParameter(result5, "result");
                                        if (!Intrinsics.f(result5, yaa.e.f311999a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yki.b bVar5 = LazyFlowCoordinator;
                                        h.r2(bVar5);
                                        h.t2(aVar6, bVar5, PixAreaFlowContract$Step.TrustedList.f80658a, false, null, false, 12);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block12, "block");
                        reviewTrustedAccountScreen.H = block12;
                        return reviewTrustedAccountScreen;
                    }
                    if (step7 instanceof PixAreaFlowContract$Step.Send) {
                        return new PixTransferFlow(PixTransferNavigation$InputData.Send.f80530a);
                    }
                    if (step7 instanceof PixAreaFlowContract$Step.CopyPaste) {
                        return new PixCopyPasteFlow();
                    }
                    if (step7 instanceof PixAreaFlowContract$Step.NewKey) {
                        pixQrRequestFlow = new AliasRegistrationFlow(new AliasRegistrationContract$InputData(pixAreaFlowContract$InputData.f80642a, ((PixAreaFlowContract$Step.NewKey) step7).f80648a));
                    } else {
                        if (step7 instanceof PixAreaFlowContract$Step.PixAutomatico) {
                            return new PixAutomaticoFlow(new PixAutomaticoContract$InputData(null));
                        }
                        if (!(step7 instanceof PixAreaFlowContract$Step.QrRequest)) {
                            if (step7 instanceof PixAreaFlowContract$Step.QrScan) {
                                return new PixQrCodeFlow();
                            }
                            if (!(step7 instanceof PixAreaFlowContract$Step.PixDisputes)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            PixDisputesScreen pixDisputesScreen = new PixDisputesScreen();
                            Function1 block13 = new Function1() { // from class: iaa.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i21) {
                                        case 0:
                                            yja.b it8 = (yja.b) obj5;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            aVar6.B2();
                                            return Unit.f186387a;
                                        default:
                                            raa.f result = (raa.f) obj5;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean zF = Intrinsics.f(result, raa.d.f252796a);
                                            com.revolut.feature.pix.impl.flow.pix_area.a aVar7 = aVar6;
                                            if (zF) {
                                                aVar7.C1(new ChatFlowDestination(new ChatTarget.ChatList(ChatListFilter.PastRequests.f51037a, (TicketCreationContext) null, (String) null, 12), true));
                                            } else {
                                                if (!Intrinsics.f(result, raa.e.f252797a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                m mVar = aVar7.f80660q;
                                                Map mapK = r0.k(new Pair(ib.b.Flow, "SECURITY_HUB_FRAUD_REPORTING"), new Pair("country", "BR"));
                                                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                                                k9 k9Var = k9.Payments;
                                                companion.getClass();
                                                aVar7.C1(m.a(mVar, new WorkflowConfiguration.CreateWorkflow(mapK, AnalyticsProduct.Companion.b(k9Var), 46), null, 6));
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block13, "block");
                            pixDisputesScreen.H = block13;
                            return pixDisputesScreen;
                        }
                        pixQrRequestFlow = new PixQrRequestFlow(new PixQrRequestContract$InputData(pixAreaFlowContract$InputData.f80642a, ((PixAreaFlowContract$Step.QrRequest) step7).f80653a, null));
                    }
                }
                return pixQrRequestFlow;
            case 7:
                com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a aVar7 = (com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                CompositeAddMoneyFlowContract$Step step8 = (CompositeAddMoneyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (iah.g.f160028a[step8.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                CompositeAddMoneyFlowContract$Input compositeAddMoneyFlowContract$Input = aVar7.o;
                if (compositeAddMoneyFlowContract$Input instanceof CompositeAddMoneyFlowContract$Input.CreateDeposit) {
                    CompositeAddMoneyFlowContract$Input.CreateDeposit createDeposit = (CompositeAddMoneyFlowContract$Input.CreateDeposit) compositeAddMoneyFlowContract$Input;
                    collectDepositInfoFlow = new CollectDepositInfoFlow(new CollectDepositInfoFlowContract$Input(createDeposit.f95540a, createDeposit.f95541b, createDeposit.d, null, createDeposit.f95542c, null, null, 8));
                } else {
                    if (!(compositeAddMoneyFlowContract$Input instanceof CompositeAddMoneyFlowContract$Input.UpdateRecurringDeposit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CompositeAddMoneyFlowContract$Input.UpdateRecurringDeposit updateRecurringDeposit = (CompositeAddMoneyFlowContract$Input.UpdateRecurringDeposit) compositeAddMoneyFlowContract$Input;
                    PortfolioRecurringOrder portfolioRecurringOrder = updateRecurringDeposit.f95544b;
                    collectDepositInfoFlow = new CollectDepositInfoFlow(new CollectDepositInfoFlowContract$Input(new TransferSubjectId.Portfolio(portfolioRecurringOrder.f104650b), updateRecurringDeposit.f95543a, portfolioRecurringOrder.i.f115082a, new RecurringDepositSchedule(portfolioRecurringOrder.f104652g, portfolioRecurringOrder.e), null, portfolioRecurringOrder.f104649a, portfolioRecurringOrder.f104651c, 16));
                }
                i9e.a block14 = new i9e.a(aVar7, 7);
                Intrinsics.checkNotNullParameter(block14, "block");
                collectDepositInfoFlow.H = block14;
                return collectDepositInfoFlow;
            case 8:
                com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a aVar8 = (com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a) obj4;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                SubmitCitizenshipFlowContract$Step step9 = (SubmitCitizenshipFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, SubmitCitizenshipFlowContract$Step.OpenCitizenship.f97525a)) {
                    throw new NoWhenBranchMatchedException();
                }
                SubmitCitizenshipFlowInputData submitCitizenshipFlowInputData = aVar8.o;
                CollectCitizenshipFlow collectCitizenshipFlow = new CollectCitizenshipFlow(new CollectCitizenshipFlowContract$InputData(submitCitizenshipFlowInputData.f97499c, submitCitizenshipFlowInputData.d, submitCitizenshipFlowInputData.e, submitCitizenshipFlowInputData.f97498b, submitCitizenshipFlowInputData.f, submitCitizenshipFlowInputData.f97500g, submitCitizenshipFlowInputData.f97501h, submitCitizenshipFlowInputData.i, submitCitizenshipFlowInputData.f97502j, submitCitizenshipFlowInputData.k, submitCitizenshipFlowInputData.f97503l));
                i9e.a block15 = new i9e.a(aVar8, 8);
                Intrinsics.checkNotNullParameter(block15, "block");
                collectCitizenshipFlow.H = block15;
                return collectCitizenshipFlow;
            case 9:
                com.revolut.feature_retail_user_declarations.employer.flow.a aVar9 = (com.revolut.feature_retail_user_declarations.employer.flow.a) obj4;
                yki.l FlowCoordinator5 = (yki.l) obj2;
                EmployerFlowContract$Step step10 = (EmployerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!Intrinsics.f(step10, EmployerFlowContract$Step.Employer.f97637a)) {
                    throw new NoWhenBranchMatchedException();
                }
                EmployerInputData employerInputData = aVar9.o;
                EmployerController employerController = new EmployerController(new EmployerControllerContract$InputData(employerInputData.f97634a, employerInputData.f97635b ? rbl.a.BACK : rbl.a.NONE, employerInputData.f97636c, employerInputData.d));
                i9e.a block16 = new i9e.a(aVar9, 10);
                Intrinsics.checkNotNullParameter(block16, "block");
                employerController.H = block16;
                return employerController;
            case 10:
                final com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar10 = (com.revolut.feature.cash_topup.impl.ui.flow.select_store.a) obj4;
                final yki.l FlowCoordinator6 = (yki.l) obj2;
                CashTopUpSelectStoreFlowContract$Step step11 = (CashTopUpSelectStoreFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof CashTopUpSelectStoreFlowContract$Step.LocationPermissions) {
                    PermissionsFlow permissionsFlow = new PermissionsFlow(zhm.u.c(new PermissionsFlowContract$Permission("android.permission.ACCESS_FINE_LOCATION", aVar10.f65674p.a(), 10)));
                    Function1 function1 = new Function1() { // from class: ic3.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    com.revolut.kompot.common.flow.permissions.a result = (com.revolut.kompot.common.flow.permissions.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof sii.c) && !(result instanceof sii.d)) {
                                        if (!Intrinsics.f(result, a.C0596a.f98352a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar10, FlowCoordinator6, CashTopUpSelectStoreFlowContract$Step.SelectStore.f65673a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    qc3.g result2 = (qc3.g) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof g.a;
                                    yki.l lVar = FlowCoordinator6;
                                    if (z) {
                                        h.D2(lVar);
                                    } else {
                                        boolean z3 = result2 instanceof qc3.h;
                                        com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar11 = aVar10;
                                        if (z3) {
                                            aVar11.C2(new d(((qc3.h) result2).f244545a));
                                        } else {
                                            if (!(result2 instanceof g.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar11, lVar, CashTopUpSelectStoreFlowContract$Step.Map.f65672a, true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    oc3.m result3 = (oc3.m) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof oc3.j;
                                    com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar12 = aVar10;
                                    if (z4) {
                                        h.t2(aVar12, FlowCoordinator6, new CashTopUpSelectStoreFlowContract$Step.Details(((oc3.j) result3).f224069a), true, null, false, 12);
                                    } else if (result3 instanceof oc3.l) {
                                        aVar12.C2(new d(((oc3.l) result3).f224071a));
                                    } else if (result3 instanceof oc3.k) {
                                        IllegalStateException illegalStateException = new IllegalStateException("received unexpected result NavigationButtonClicked");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    } else if (result3 instanceof oc3.i) {
                                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("received unexpected result DepositCashClicked(locationId=", ((oc3.i) result3).f224068a, ")"));
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    } else {
                                        if (!(result3 instanceof m.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException3 = new IllegalStateException("received unexpected result ShowBarcode");
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    permissionsFlow.J = function1;
                    return permissionsFlow;
                }
                if (step11 instanceof CashTopUpSelectStoreFlowContract$Step.SelectStore) {
                    CashTopUpSelectStoreScreen cashTopUpSelectStoreScreen = new CashTopUpSelectStoreScreen(new qc3.f(aVar10.o.f160206a));
                    Function1 block17 = new Function1() { // from class: ic3.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    com.revolut.kompot.common.flow.permissions.a result = (com.revolut.kompot.common.flow.permissions.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof sii.c) && !(result instanceof sii.d)) {
                                        if (!Intrinsics.f(result, a.C0596a.f98352a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar10, FlowCoordinator6, CashTopUpSelectStoreFlowContract$Step.SelectStore.f65673a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    qc3.g result2 = (qc3.g) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof g.a;
                                    yki.l lVar = FlowCoordinator6;
                                    if (z) {
                                        h.D2(lVar);
                                    } else {
                                        boolean z3 = result2 instanceof qc3.h;
                                        com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar11 = aVar10;
                                        if (z3) {
                                            aVar11.C2(new d(((qc3.h) result2).f244545a));
                                        } else {
                                            if (!(result2 instanceof g.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar11, lVar, CashTopUpSelectStoreFlowContract$Step.Map.f65672a, true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    oc3.m result3 = (oc3.m) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof oc3.j;
                                    com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar12 = aVar10;
                                    if (z4) {
                                        h.t2(aVar12, FlowCoordinator6, new CashTopUpSelectStoreFlowContract$Step.Details(((oc3.j) result3).f224069a), true, null, false, 12);
                                    } else if (result3 instanceof oc3.l) {
                                        aVar12.C2(new d(((oc3.l) result3).f224071a));
                                    } else if (result3 instanceof oc3.k) {
                                        IllegalStateException illegalStateException = new IllegalStateException("received unexpected result NavigationButtonClicked");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    } else if (result3 instanceof oc3.i) {
                                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("received unexpected result DepositCashClicked(locationId=", ((oc3.i) result3).f224068a, ")"));
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    } else {
                                        if (!(result3 instanceof m.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException3 = new IllegalStateException("received unexpected result ShowBarcode");
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    cashTopUpSelectStoreScreen.H = block17;
                    return cashTopUpSelectStoreScreen;
                }
                if (step11 instanceof CashTopUpSelectStoreFlowContract$Step.Map) {
                    CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = new CashTopUpLocationsMapScreen(new CashTopUpLocationsMapScreenContract$InputData(cb3.a.EU_FLOW, ub3.k.OnlySelectLocation));
                    Function1 function12 = new Function1() { // from class: ic3.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    com.revolut.kompot.common.flow.permissions.a result = (com.revolut.kompot.common.flow.permissions.a) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof sii.c) && !(result instanceof sii.d)) {
                                        if (!Intrinsics.f(result, a.C0596a.f98352a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar10, FlowCoordinator6, CashTopUpSelectStoreFlowContract$Step.SelectStore.f65673a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    qc3.g result2 = (qc3.g) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof g.a;
                                    yki.l lVar = FlowCoordinator6;
                                    if (z) {
                                        h.D2(lVar);
                                    } else {
                                        boolean z3 = result2 instanceof qc3.h;
                                        com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar11 = aVar10;
                                        if (z3) {
                                            aVar11.C2(new d(((qc3.h) result2).f244545a));
                                        } else {
                                            if (!(result2 instanceof g.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h.t2(aVar11, lVar, CashTopUpSelectStoreFlowContract$Step.Map.f65672a, true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    oc3.m result3 = (oc3.m) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z4 = result3 instanceof oc3.j;
                                    com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar12 = aVar10;
                                    if (z4) {
                                        h.t2(aVar12, FlowCoordinator6, new CashTopUpSelectStoreFlowContract$Step.Details(((oc3.j) result3).f224069a), true, null, false, 12);
                                    } else if (result3 instanceof oc3.l) {
                                        aVar12.C2(new d(((oc3.l) result3).f224071a));
                                    } else if (result3 instanceof oc3.k) {
                                        IllegalStateException illegalStateException = new IllegalStateException("received unexpected result NavigationButtonClicked");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    } else if (result3 instanceof oc3.i) {
                                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("received unexpected result DepositCashClicked(locationId=", ((oc3.i) result3).f224068a, ")"));
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    } else {
                                        if (!(result3 instanceof m.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException3 = new IllegalStateException("received unexpected result ShowBarcode");
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    cashTopUpLocationsMapScreen.H = function12;
                    return cashTopUpLocationsMapScreen;
                }
                if (!(step11 instanceof CashTopUpSelectStoreFlowContract$Step.Details)) {
                    throw new NoWhenBranchMatchedException();
                }
                CashTopUpDetailsScreen cashTopUpDetailsScreen = new CashTopUpDetailsScreen(new CashTopUpDetailsScreenContract$InputData(((CashTopUpSelectStoreFlowContract$Step.Details) step11).f65670a, ub3.k.OnlySelectLocation));
                i9e.a aVar11 = new i9e.a(aVar10, 11);
                Intrinsics.checkNotNullParameter(aVar11, "<set-?>");
                cashTopUpDetailsScreen.H = aVar11;
                return cashTopUpDetailsScreen;
            case 11:
                ic4.a aVar12 = (ic4.a) obj4;
                yki.l FlowCoordinator7 = (yki.l) obj2;
                HowItWorksFlowContract$Step it8 = (HowItWorksFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                HowItWorksScreen howItWorksScreen = new HowItWorksScreen(new HowItWorksScreenContract$InputData(aVar12.f160211p.f67788a));
                i9e.a block18 = new i9e.a(aVar12, 12);
                Intrinsics.checkNotNullParameter(block18, "block");
                howItWorksScreen.H = block18;
                return howItWorksScreen;
            case 12:
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar13 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InstrumentsCollectionControllerContract$ModalStep step12 = (InstrumentsCollectionControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!Intrinsics.f(step12, InstrumentsCollectionControllerContract$ModalStep.Filters.f95603a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InstrumentsCollectionControllerContract$InputData instrumentsCollectionControllerContract$InputData = aVar13.o;
                cli.y yVar = aVar13.A;
                InstrumentsCollectionType instrumentsCollectionType = instrumentsCollectionControllerContract$InputData.f95602a;
                List list = (List) ((ich.l) ((j2) yVar.f22677a).getValue()).f160276h.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                InstrumentsCollectionFiltersController instrumentsCollectionFiltersController = new InstrumentsCollectionFiltersController(new InstrumentsCollectionFiltersControllerContract$InputData(instrumentsCollectionType, list, ((ich.l) ((j2) yVar.f22677a).getValue()).i));
                ich.r block19 = new ich.r(aVar13, i21);
                Intrinsics.checkNotNullParameter(block19, "block");
                instrumentsCollectionFiltersController.H = block19;
                return instrumentsCollectionFiltersController;
            case 13:
                com.revolut.feature_retail_user_declarations.risk_assessment.flow.a aVar14 = (com.revolut.feature_retail_user_declarations.risk_assessment.flow.a) obj4;
                yki.l FlowCoordinator8 = (yki.l) obj2;
                RiskAssessmentFlowContract$Step step13 = (RiskAssessmentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator8, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof RiskAssessmentFlowContract$Step.RiskAssessment)) {
                    throw new NoWhenBranchMatchedException();
                }
                RiskAssessmentScreen riskAssessmentScreen = new RiskAssessmentScreen(new RiskAssessmentScreenContract$InputData(aVar14.o.f97728b ? rbl.a.BACK : rbl.a.NONE));
                i9e.a block20 = new i9e.a(aVar14, 16);
                Intrinsics.checkNotNullParameter(block20, "block");
                riskAssessmentScreen.H = block20;
                return riskAssessmentScreen;
            case 14:
                final com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar15 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReservationCreationScreenContract$ModalStep step14 = (ReservationCreationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof ReservationCreationScreenContract$ModalStep.DatePicker) {
                    ReservationDatePickerScreen reservationDatePickerScreen = new ReservationDatePickerScreen(((ReservationCreationScreenContract$ModalStep.DatePicker) step14).f82856a);
                    Function1 block21 = new Function1() { // from class: ieb.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    jeb.b result = (jeb.b) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    LocalDate date = result.f173250a;
                                    Intrinsics.checkNotNullParameter(date, "date");
                                    com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar16 = aVar15;
                                    cli.y yVar2 = aVar16.v;
                                    i iVar = ((g) ((j2) yVar2.f22677a).getValue()).f160687g;
                                    if (iVar != null && !Intrinsics.f(iVar.f160690a, date)) {
                                        aVar16.H2(yVar2, new i25.e(iVar, date, 18));
                                        aVar16.J2();
                                    }
                                    break;
                                case 1:
                                    oeb.b result2 = (oeb.b) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    LocalTime time = result2.f224571a;
                                    Intrinsics.checkNotNullParameter(time, "time");
                                    com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar17 = aVar15;
                                    cli.y yVar3 = aVar17.v;
                                    i iVar2 = ((g) ((j2) yVar3.f22677a).getValue()).f160687g;
                                    if (iVar2 != null && !Intrinsics.f(iVar2.f160691b, time)) {
                                        aVar17.H2(yVar3, new i25.e(iVar2, time, 19));
                                        aVar17.J2();
                                    }
                                    break;
                                default:
                                    meb.b result3 = (meb.b) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    int i43 = result3.f204641a;
                                    com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar18 = aVar15;
                                    cli.y yVar4 = aVar18.v;
                                    i iVar3 = ((g) ((j2) yVar4.f22677a).getValue()).f160687g;
                                    if (iVar3 != null && iVar3.f160692c != i43) {
                                        aVar18.H2(yVar4, new abf.n(iVar3, i43, 12));
                                        aVar18.J2();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    reservationDatePickerScreen.H = block21;
                    return reservationDatePickerScreen;
                }
                if (step14 instanceof ReservationCreationScreenContract$ModalStep.TimePicker) {
                    ReservationTimePickerScreen reservationTimePickerScreen = new ReservationTimePickerScreen(((ReservationCreationScreenContract$ModalStep.TimePicker) step14).f82858a);
                    Function1 block22 = new Function1() { // from class: ieb.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    jeb.b result = (jeb.b) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    LocalDate date = result.f173250a;
                                    Intrinsics.checkNotNullParameter(date, "date");
                                    com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar16 = aVar15;
                                    cli.y yVar2 = aVar16.v;
                                    i iVar = ((g) ((j2) yVar2.f22677a).getValue()).f160687g;
                                    if (iVar != null && !Intrinsics.f(iVar.f160690a, date)) {
                                        aVar16.H2(yVar2, new i25.e(iVar, date, 18));
                                        aVar16.J2();
                                    }
                                    break;
                                case 1:
                                    oeb.b result2 = (oeb.b) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    LocalTime time = result2.f224571a;
                                    Intrinsics.checkNotNullParameter(time, "time");
                                    com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar17 = aVar15;
                                    cli.y yVar3 = aVar17.v;
                                    i iVar2 = ((g) ((j2) yVar3.f22677a).getValue()).f160687g;
                                    if (iVar2 != null && !Intrinsics.f(iVar2.f160691b, time)) {
                                        aVar17.H2(yVar3, new i25.e(iVar2, time, 19));
                                        aVar17.J2();
                                    }
                                    break;
                                default:
                                    meb.b result3 = (meb.b) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    int i43 = result3.f204641a;
                                    com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar18 = aVar15;
                                    cli.y yVar4 = aVar18.v;
                                    i iVar3 = ((g) ((j2) yVar4.f22677a).getValue()).f160687g;
                                    if (iVar3 != null && iVar3.f160692c != i43) {
                                        aVar18.H2(yVar4, new abf.n(iVar3, i43, 12));
                                        aVar18.J2();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    reservationTimePickerScreen.H = block22;
                    return reservationTimePickerScreen;
                }
                if (!(step14 instanceof ReservationCreationScreenContract$ModalStep.PartySizePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                PartySizePickerScreen partySizePickerScreen = new PartySizePickerScreen(((ReservationCreationScreenContract$ModalStep.PartySizePicker) step14).f82857a);
                Function1 block23 = new Function1() { // from class: ieb.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i5) {
                            case 0:
                                jeb.b result = (jeb.b) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                LocalDate date = result.f173250a;
                                Intrinsics.checkNotNullParameter(date, "date");
                                com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar16 = aVar15;
                                cli.y yVar2 = aVar16.v;
                                i iVar = ((g) ((j2) yVar2.f22677a).getValue()).f160687g;
                                if (iVar != null && !Intrinsics.f(iVar.f160690a, date)) {
                                    aVar16.H2(yVar2, new i25.e(iVar, date, 18));
                                    aVar16.J2();
                                }
                                break;
                            case 1:
                                oeb.b result2 = (oeb.b) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                LocalTime time = result2.f224571a;
                                Intrinsics.checkNotNullParameter(time, "time");
                                com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar17 = aVar15;
                                cli.y yVar3 = aVar17.v;
                                i iVar2 = ((g) ((j2) yVar3.f22677a).getValue()).f160687g;
                                if (iVar2 != null && !Intrinsics.f(iVar2.f160691b, time)) {
                                    aVar17.H2(yVar3, new i25.e(iVar2, time, 19));
                                    aVar17.J2();
                                }
                                break;
                            default:
                                meb.b result3 = (meb.b) obj5;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                int i43 = result3.f204641a;
                                com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar18 = aVar15;
                                cli.y yVar4 = aVar18.v;
                                i iVar3 = ((g) ((j2) yVar4.f22677a).getValue()).f160687g;
                                if (iVar3 != null && iVar3.f160692c != i43) {
                                    aVar18.H2(yVar4, new abf.n(iVar3, i43, 12));
                                    aVar18.J2();
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block23, "block");
                partySizePickerScreen.H = block23;
                return partySizePickerScreen;
            case 15:
                igf.g gVar = (igf.g) obj4;
                ali.b PagerCoordinator = (ali.b) obj2;
                TransactionDetailsPagerFlowContract$DetailsPage item = (TransactionDetailsPagerFlowContract$DetailsPage) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(item, "item");
                UnifiedTransaction unifiedTransaction = item.f91896a;
                if (unifiedTransaction instanceof UnifiedTransaction.Standard) {
                    k71.i iVarP = ofm.q.P(((UnifiedTransaction.Standard) unifiedTransaction).f94574a);
                    TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = gVar.o;
                    return gVar.e1(new rhf.f(iVarP, transactionDetailsPagerFlowContract$InputData.d, transactionDetailsPagerFlowContract$InputData.e));
                }
                if (!(unifiedTransaction instanceof UnifiedTransaction.Invest)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvestTransaction transaction = ((UnifiedTransaction.Invest) unifiedTransaction).f94571a;
                ugc.a aVar16 = gVar.f161191q;
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                oc.f fVar3 = (oc.f) aVar16.f279998b;
                WealthAccountType accountType = transaction.getF85125a().b();
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                return gVar.e1(fVar3.a(accountType).a().a(transaction));
            case 16:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b) obj4;
                EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData = bVar2.o;
                EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step step15 = (EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.PortabilityInstruction) {
                    EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.PortabilityInstruction portabilityInstruction = (EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.PortabilityInstruction) step15;
                    String str3 = portabilityInstruction.f100778c;
                    Pair pair = new Pair("phoneNumber", bVar2.f100781p.a(portabilityInstruction.f100777b));
                    EsimGiftRecipient esimGiftRecipient = esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100774g;
                    BackendFlowInput.Source.Remote remote = new BackendFlowInput.Source.Remote(str3, foh.i.q(pair, new Pair("receiverName", esimGiftRecipient != null ? esimGiftRecipient.d : null)));
                    BackendFlowApiEndpoints.INSTANCE.getClass();
                    return bVar2.e1(new n90.a(new BackendFlowInput(remote, null, null, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f == hgj.c.DEFAULT ? BackendFlowNavigationIcon.BackArrow.f63285a : BackendFlowNavigationIcon.Cross.f63286a, false, BackendFlowApiEndpoints.Companion.a(str3), 54)));
                }
                if (!(step15 instanceof EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.NumberTransferConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str4 = esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100771a;
                String str5 = esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100772b;
                EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100773c;
                EsimMobilePlanOtpNumberTransferConfirmationScreen esimMobilePlanOtpNumberTransferConfirmationScreen = new EsimMobilePlanOtpNumberTransferConfirmationScreen(new EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData(esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.d, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100774g, esimPhoneNumberPortingOtp, esimPhoneNumberPortingOtp.f100361b != null ? hgj.c.DEFAULT : esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f, str4, str5, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.e));
                i9e.a block24 = new i9e.a(bVar2, 25);
                Intrinsics.checkNotNullParameter(block24, "block");
                esimMobilePlanOtpNumberTransferConfirmationScreen.H = block24;
                return esimMobilePlanOtpNumberTransferConfirmationScreen;
            case 17:
                com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a aVar17 = (com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoBalanceBreakdownContract$ModalStep step16 = (CryptoBalanceBreakdownContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof CryptoBalanceBreakdownContract$ModalStep.LockedUnstake) {
                    return aVar17.e1(new nc5.e(((CryptoBalanceBreakdownContract$ModalStep.LockedUnstake) step16).f70877a));
                }
                if (step16 instanceof CryptoBalanceBreakdownContract$ModalStep.OpenOrders) {
                    xi0.a aVar18 = xi0.b.Companion;
                    String str6 = ((CryptoBalanceBreakdownContract$ModalStep.OpenOrders) step16).f70878a;
                    aVar18.getClass();
                    return aVar17.e1(new t4c.b(xi0.a.a(str6)));
                }
                if (!(step16 instanceof CryptoBalanceBreakdownContract$ModalStep.LockedGift)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str7 = ((CryptoBalanceBreakdownContract$ModalStep.LockedGift) step16).f70876a;
                xi0.b.Companion.getClass();
                ViewController viewControllerE13 = aVar17.e1(new og5.a(new CryptoGiftAssetTransferInfoInputData(xi0.a.a(str7), false)));
                i9e.a block25 = new i9e.a(aVar17, 26);
                Intrinsics.checkNotNullParameter(block25, "block");
                viewControllerE13.H = block25;
                return viewControllerE13;
            case 18:
                com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.a aVar19 = (com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.a) obj4;
                yki.l FlowCoordinator9 = (yki.l) obj2;
                FormPaymentFlowContract$Step step17 = (FormPaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator9, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof FormPaymentFlowContract$Step.Amount) {
                    FormPaymentFlowContract$Step.Amount amount = (FormPaymentFlowContract$Step.Amount) step17;
                    FormAmountScreen formAmountScreen = new FormAmountScreen(amount.f78782a);
                    i25.e block26 = new i25.e(aVar19, amount, 23);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    formAmountScreen.H = block26;
                    return formAmountScreen;
                }
                if (!(step17 instanceof FormPaymentFlowContract$Step.Review)) {
                    throw new NoWhenBranchMatchedException();
                }
                FormReviewScreen formReviewScreen = new FormReviewScreen(((FormPaymentFlowContract$Step.Review) step17).f78783a);
                i9e.a block27 = new i9e.a(aVar19, 27);
                Intrinsics.checkNotNullParameter(block27, "block");
                formReviewScreen.H = block27;
                return formReviewScreen;
            case 19:
                com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar20 = (com.revolut.feature.credit.application.plugins.impl.ui.spinner.a) obj4;
                yki.l FlowCoordinator10 = (yki.l) obj2;
                SpinnerFlowContract$Step step18 = (SpinnerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator10, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (step18 instanceof SpinnerFlowContract$Step.Spinner) {
                    SpinnerScreen spinnerScreen = new SpinnerScreen(new SpinnerScreenContract$InputData(((SpinnerFlowContract$Step.Spinner) step18).f68412a, aVar20.f68420p.d));
                    ii4.b block28 = new ii4.b(aVar20, i6);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    spinnerScreen.H = block28;
                    return spinnerScreen;
                }
                if (step18 instanceof SpinnerFlowContract$Step.StatusDialog) {
                    return new LayoutViewerScreen(R$layout.screen_transparent);
                }
                if (!(step18 instanceof SpinnerFlowContract$Step.ModalStep.TimeoutStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                SpinnerFlowContract$Step.ModalStep.TimeoutStep timeoutStep = (SpinnerFlowContract$Step.ModalStep.TimeoutStep) step18;
                return aVar20.f68423s.a(aVar20, timeoutStep.f68410a, timeoutStep.f68411b, new fi7.s(2, aVar20, com.revolut.feature.credit.application.plugins.impl.ui.spinner.a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 18));
            case 20:
                com.revolut.feature.credit.application.plugins.impl.ui.spinner.b controller = (com.revolut.feature.credit.application.plugins.impl.ui.spinner.b) obj4;
                SpinnerLazyFlowContract$Step step19 = (SpinnerLazyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (!(step19 instanceof SpinnerLazyFlowContract$Step.Timeout)) {
                    throw new NoWhenBranchMatchedException();
                }
                be4.d dVar2 = controller.f68427r;
                SpinnerLazyFlowContract$Step.Timeout timeout = (SpinnerLazyFlowContract$Step.Timeout) step19;
                WaitingPopupScreenConfig config = timeout.f68416a;
                w0 w0Var = timeout.f68417b;
                fi7.s tillFinish = new fi7.s(2, controller, com.revolut.feature.credit.application.plugins.impl.ui.spinner.b.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 19);
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(tillFinish, "tillFinish");
                boolean zAreNotificationsEnabled = dVar2.f14676a.f299516a.areNotificationsEnabled();
                ActionsBottomSheetController actionsBottomSheetControllerA = be4.a.a(config, w0Var, zAreNotificationsEnabled);
                md6.s.E(actionsBottomSheetControllerA, tillFinish, true, new be4.c(controller, objArr == true ? 1 : 0, i6), new be4.b(zAreNotificationsEnabled, controller, dVar2, i21));
                return actionsBottomSheetControllerA;
            case 21:
                final com.revolut.feature.shops.impl.flow.session.c cVar = (com.revolut.feature.shops.impl.flow.session.c) obj4;
                ShopsSessionFlowContract$Step step20 = (ShopsSessionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step20, "step");
                if (step20 instanceof ShopsSessionFlowContract$Step.Home) {
                    ShopsCombinedHomeScreen shopsCombinedHomeScreen = new ShopsCombinedHomeScreen(new ShopsCombinedHomeScreenContract$InputData(((ShopsSessionFlowContract$Step.Home) step20).f87109a));
                    Function1 block29 = new Function1() { // from class: iid.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    yid.m result = (yid.m) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof yid.k;
                                    com.revolut.feature.shops.impl.flow.session.c cVar2 = cVar;
                                    if (z) {
                                        cVar2.C1(new ExternalDestination.Browser(((yid.k) result).f314311a, null));
                                    } else {
                                        if (!(result instanceof yid.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(cVar2, cVar2.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    kjd.h result2 = (kjd.h) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ShopsCampaignOffer shopsCampaignOffer = result2.f184376a;
                                    com.revolut.feature.shops.impl.flow.session.c cVar3 = cVar;
                                    if (cVar3.f87120r.F0()) {
                                        cVar3.C1(new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(shopsCampaignOffer.d, null, BrandDetailTab.Earn.f88609a, null), 2));
                                    } else {
                                        h.w2(cVar3.f87121s, new ShopsSessionFlowContract$Step.CampaignCheckout(shopsCampaignOffer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    ajd.i result3 = (ajd.i) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ajd.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar.C1(new ExternalDestination.Browser(result3.f5545a, null));
                                    return Unit.f186387a;
                                default:
                                    fjd.t result4 = (fjd.t) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z3 = result4 instanceof fjd.p;
                                    com.revolut.feature.shops.impl.flow.session.c cVar4 = cVar;
                                    if (z3) {
                                        fjd.p pVar = (fjd.p) result4;
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.CarouselDetails(pVar.f135589a, pVar.f135590b), true, null, false, 12);
                                    } else if (result4 instanceof fjd.r) {
                                        fjd.r rVar = (fjd.r) result4;
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.PurchaseDetails(rVar.f135592a, rVar.f135593b), true, null, false, 12);
                                    } else if (result4 instanceof fjd.s) {
                                        h.t2(cVar4, cVar4.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof fjd.q)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.MapView(((fjd.q) result4).f135591a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block29, "block");
                    shopsCombinedHomeScreen.H = block29;
                    return shopsCombinedHomeScreen;
                }
                if (step20 instanceof ShopsSessionFlowContract$Step.CarouselDetails) {
                    ShopsSessionFlowContract$Step.CarouselDetails carouselDetails = (ShopsSessionFlowContract$Step.CarouselDetails) step20;
                    shopsCarouselDetailsScreen = new ShopsCarouselDetailsScreen(new ShopsCarouselDetailsScreenContract$InputData(carouselDetails.f87106b, carouselDetails.f87105a, true, yid.j.GRID));
                    Function1 block30 = new Function1() { // from class: iid.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    yid.m result = (yid.m) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof yid.k;
                                    com.revolut.feature.shops.impl.flow.session.c cVar2 = cVar;
                                    if (z) {
                                        cVar2.C1(new ExternalDestination.Browser(((yid.k) result).f314311a, null));
                                    } else {
                                        if (!(result instanceof yid.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(cVar2, cVar2.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    kjd.h result2 = (kjd.h) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ShopsCampaignOffer shopsCampaignOffer = result2.f184376a;
                                    com.revolut.feature.shops.impl.flow.session.c cVar3 = cVar;
                                    if (cVar3.f87120r.F0()) {
                                        cVar3.C1(new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(shopsCampaignOffer.d, null, BrandDetailTab.Earn.f88609a, null), 2));
                                    } else {
                                        h.w2(cVar3.f87121s, new ShopsSessionFlowContract$Step.CampaignCheckout(shopsCampaignOffer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    ajd.i result3 = (ajd.i) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ajd.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar.C1(new ExternalDestination.Browser(result3.f5545a, null));
                                    return Unit.f186387a;
                                default:
                                    fjd.t result4 = (fjd.t) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z3 = result4 instanceof fjd.p;
                                    com.revolut.feature.shops.impl.flow.session.c cVar4 = cVar;
                                    if (z3) {
                                        fjd.p pVar = (fjd.p) result4;
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.CarouselDetails(pVar.f135589a, pVar.f135590b), true, null, false, 12);
                                    } else if (result4 instanceof fjd.r) {
                                        fjd.r rVar = (fjd.r) result4;
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.PurchaseDetails(rVar.f135592a, rVar.f135593b), true, null, false, 12);
                                    } else if (result4 instanceof fjd.s) {
                                        h.t2(cVar4, cVar4.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof fjd.q)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.MapView(((fjd.q) result4).f135591a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block30, "block");
                    shopsCarouselDetailsScreen.H = block30;
                } else {
                    if (!(step20 instanceof ShopsSessionFlowContract$Step.PurchaseDetails)) {
                        if (step20 instanceof ShopsSessionFlowContract$Step.Search) {
                            ShopsCombinedSearchScreen shopsCombinedSearchScreen = new ShopsCombinedSearchScreen();
                            Function1 function13 = new Function1() { // from class: iid.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i5) {
                                        case 0:
                                            yid.m result = (yid.m) obj5;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z = result instanceof yid.k;
                                            com.revolut.feature.shops.impl.flow.session.c cVar2 = cVar;
                                            if (z) {
                                                cVar2.C1(new ExternalDestination.Browser(((yid.k) result).f314311a, null));
                                            } else {
                                                if (!(result instanceof yid.l)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(cVar2, cVar2.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            kjd.h result2 = (kjd.h) obj5;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            if (result2 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            ShopsCampaignOffer shopsCampaignOffer = result2.f184376a;
                                            com.revolut.feature.shops.impl.flow.session.c cVar3 = cVar;
                                            if (cVar3.f87120r.F0()) {
                                                cVar3.C1(new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(shopsCampaignOffer.d, null, BrandDetailTab.Earn.f88609a, null), 2));
                                            } else {
                                                h.w2(cVar3.f87121s, new ShopsSessionFlowContract$Step.CampaignCheckout(shopsCampaignOffer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            ajd.i result3 = (ajd.i) obj5;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (!(result3 instanceof ajd.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar.C1(new ExternalDestination.Browser(result3.f5545a, null));
                                            return Unit.f186387a;
                                        default:
                                            fjd.t result4 = (fjd.t) obj5;
                                            Intrinsics.checkNotNullParameter(result4, "result");
                                            boolean z3 = result4 instanceof fjd.p;
                                            com.revolut.feature.shops.impl.flow.session.c cVar4 = cVar;
                                            if (z3) {
                                                fjd.p pVar = (fjd.p) result4;
                                                h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.CarouselDetails(pVar.f135589a, pVar.f135590b), true, null, false, 12);
                                            } else if (result4 instanceof fjd.r) {
                                                fjd.r rVar = (fjd.r) result4;
                                                h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.PurchaseDetails(rVar.f135592a, rVar.f135593b), true, null, false, 12);
                                            } else if (result4 instanceof fjd.s) {
                                                h.t2(cVar4, cVar4.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                            } else {
                                                if (!(result4 instanceof fjd.q)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.MapView(((fjd.q) result4).f135591a), true, null, false, 12);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(function13, "<set-?>");
                            shopsCombinedSearchScreen.H = function13;
                            return shopsCombinedSearchScreen;
                        }
                        if (step20 instanceof ShopsSessionFlowContract$Step.MapView) {
                            ShopsMapViewScreen shopsMapViewScreen = new ShopsMapViewScreen(new ShopsMapViewScreenContract$InputData(((ShopsSessionFlowContract$Step.MapView) step20).f87110a));
                            Function1 block31 = new Function1() { // from class: iid.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    switch (i21) {
                                        case 0:
                                            yid.m result = (yid.m) obj5;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z = result instanceof yid.k;
                                            com.revolut.feature.shops.impl.flow.session.c cVar2 = cVar;
                                            if (z) {
                                                cVar2.C1(new ExternalDestination.Browser(((yid.k) result).f314311a, null));
                                            } else {
                                                if (!(result instanceof yid.l)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(cVar2, cVar2.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            kjd.h result2 = (kjd.h) obj5;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            if (result2 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            ShopsCampaignOffer shopsCampaignOffer = result2.f184376a;
                                            com.revolut.feature.shops.impl.flow.session.c cVar3 = cVar;
                                            if (cVar3.f87120r.F0()) {
                                                cVar3.C1(new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(shopsCampaignOffer.d, null, BrandDetailTab.Earn.f88609a, null), 2));
                                            } else {
                                                h.w2(cVar3.f87121s, new ShopsSessionFlowContract$Step.CampaignCheckout(shopsCampaignOffer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            ajd.i result3 = (ajd.i) obj5;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (!(result3 instanceof ajd.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar.C1(new ExternalDestination.Browser(result3.f5545a, null));
                                            return Unit.f186387a;
                                        default:
                                            fjd.t result4 = (fjd.t) obj5;
                                            Intrinsics.checkNotNullParameter(result4, "result");
                                            boolean z3 = result4 instanceof fjd.p;
                                            com.revolut.feature.shops.impl.flow.session.c cVar4 = cVar;
                                            if (z3) {
                                                fjd.p pVar = (fjd.p) result4;
                                                h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.CarouselDetails(pVar.f135589a, pVar.f135590b), true, null, false, 12);
                                            } else if (result4 instanceof fjd.r) {
                                                fjd.r rVar = (fjd.r) result4;
                                                h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.PurchaseDetails(rVar.f135592a, rVar.f135593b), true, null, false, 12);
                                            } else if (result4 instanceof fjd.s) {
                                                h.t2(cVar4, cVar4.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                            } else {
                                                if (!(result4 instanceof fjd.q)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.MapView(((fjd.q) result4).f135591a), true, null, false, 12);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block31, "block");
                            shopsMapViewScreen.H = block31;
                            return shopsMapViewScreen;
                        }
                        if (step20 instanceof ShopsSessionFlowContract$Step.CampaignCheckout) {
                            return new ShopsCampaignCheckoutScreen(new ShopsCampaignCheckoutScreenContract$InputData(((ShopsSessionFlowContract$Step.CampaignCheckout) step20).f87104a));
                        }
                        if (step20 instanceof ShopsSessionFlowContract$Step.FullScreenPrompt) {
                            ShopsSessionFlowContract$Step.FullScreenPrompt fullScreenPrompt = (ShopsSessionFlowContract$Step.FullScreenPrompt) step20;
                            return new ShopsPromptScreen(new ShopsPromptScreenContract$InputData(fullScreenPrompt.f87107a, fullScreenPrompt.f87108b));
                        }
                        if (step20 instanceof ShopsSessionFlowContract$Step.Onboarding) {
                            return cVar.e1(new ProductArticleDescriptor(((ShopsSessionFlowContract$Step.Onboarding) step20).f87111a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                        }
                        if (step20 instanceof ShopsSessionFlowContract$Step.AuctionBid) {
                            ShopsSessionFlowContract$Step.AuctionBid auctionBid = (ShopsSessionFlowContract$Step.AuctionBid) step20;
                            return new ShopsBidFlow(new ShopsBidFlowContract$InputData(auctionBid.f87102a, auctionBid.f87103b));
                        }
                        if (!(step20 instanceof ShopsSessionFlowContract$Step.OptIn)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str8 = ((ShopsSessionFlowContract$Step.OptIn) step20).f87112a;
                        ViewController viewControllerE14 = cVar.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.Shops.f84003a, false, 6)));
                        i25.e block32 = new i25.e(cVar, str8, 28);
                        Intrinsics.checkNotNullParameter(block32, "block");
                        viewControllerE14.H = block32;
                        return viewControllerE14;
                    }
                    ShopsSessionFlowContract$Step.PurchaseDetails purchaseDetails = (ShopsSessionFlowContract$Step.PurchaseDetails) step20;
                    shopsCarouselDetailsScreen = new ShopsCarouselDetailsScreen(new ShopsCarouselDetailsScreenContract$InputData(purchaseDetails.f87114b, purchaseDetails.f87113a, false, yid.j.LIST));
                    Function1 block33 = new Function1() { // from class: iid.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    yid.m result = (yid.m) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof yid.k;
                                    com.revolut.feature.shops.impl.flow.session.c cVar2 = cVar;
                                    if (z) {
                                        cVar2.C1(new ExternalDestination.Browser(((yid.k) result).f314311a, null));
                                    } else {
                                        if (!(result instanceof yid.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(cVar2, cVar2.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    kjd.h result2 = (kjd.h) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ShopsCampaignOffer shopsCampaignOffer = result2.f184376a;
                                    com.revolut.feature.shops.impl.flow.session.c cVar3 = cVar;
                                    if (cVar3.f87120r.F0()) {
                                        cVar3.C1(new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(shopsCampaignOffer.d, null, BrandDetailTab.Earn.f88609a, null), 2));
                                    } else {
                                        h.w2(cVar3.f87121s, new ShopsSessionFlowContract$Step.CampaignCheckout(shopsCampaignOffer), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    ajd.i result3 = (ajd.i) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof ajd.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar.C1(new ExternalDestination.Browser(result3.f5545a, null));
                                    return Unit.f186387a;
                                default:
                                    fjd.t result4 = (fjd.t) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z3 = result4 instanceof fjd.p;
                                    com.revolut.feature.shops.impl.flow.session.c cVar4 = cVar;
                                    if (z3) {
                                        fjd.p pVar = (fjd.p) result4;
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.CarouselDetails(pVar.f135589a, pVar.f135590b), true, null, false, 12);
                                    } else if (result4 instanceof fjd.r) {
                                        fjd.r rVar = (fjd.r) result4;
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.PurchaseDetails(rVar.f135592a, rVar.f135593b), true, null, false, 12);
                                    } else if (result4 instanceof fjd.s) {
                                        h.t2(cVar4, cVar4.f87121s, ShopsSessionFlowContract$Step.Search.f87115a, true, null, false, 12);
                                    } else {
                                        if (!(result4 instanceof fjd.q)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(cVar4, cVar4.f87121s, new ShopsSessionFlowContract$Step.MapView(((fjd.q) result4).f135591a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block33, "block");
                    shopsCarouselDetailsScreen.H = block33;
                }
                return shopsCarouselDetailsScreen;
            case 22:
                final com.revolut.feature.shops.impl.ui.items_details.b bVar3 = (com.revolut.feature.shops.impl.ui.items_details.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ShopsItemsDetailsScreenContract$ModalStep step21 = (ShopsItemsDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step21, "step");
                if (!Intrinsics.f(step21, ShopsItemsDetailsScreenContract$ModalStep.Shipped.f87210a)) {
                    if (!(step21 instanceof ShopsItemsDetailsScreenContract$ModalStep.Confirmation)) {
                        if (Intrinsics.f(step21, ShopsItemsDetailsScreenContract$ModalStep.ReturnOptions.f87209a)) {
                            return bVar3.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("returning-a-rev-points-exclusive-item-kPhi")), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    ShopsCancelOrderScreen shopsCancelOrderScreen = new ShopsCancelOrderScreen(((ShopsItemsDetailsScreenContract$ModalStep.Confirmation) step21).f87208a);
                    Function1 block34 = new Function1() { // from class: ijd.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    dii.g result = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, dii.e.f115068a)) {
                                        oki.h.v2(bVar3.f87216t, ShopsItemsDetailsScreenContract$ModalStep.ReturnOptions.f87209a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                    }
                                    break;
                                default:
                                    q it9 = (q) obj5;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    mii.k kVar = new mii.k("shops_order_cancelled", new TextLocalisedClause(R$string.shops_screens_cancel_order_success, null, null, 14), null, null, null, 28);
                                    com.revolut.feature.shops.impl.ui.items_details.b bVar4 = bVar3;
                                    bVar4.X1(kVar);
                                    bVar4.B2();
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block34, "block");
                    shopsCancelOrderScreen.H = block34;
                    return shopsCancelOrderScreen;
                }
                lw0.a aVar21 = new lw0.a(new TextLocalisedClause(R$string.shops_screens_order_shipped_title, null, null, 14), null, null, null, false, 30);
                dii.i iVar = new dii.i(new TextLocalisedClause(R$string.shops_screens_order_shipped_description, null, null, 14));
                k9 value = k9.Shops;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar21, new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.shops_screens_order_shipped_return_options, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), new AnalyticsProduct.Retail(value), null, iVar, 8));
                Function1 block35 = new Function1() { // from class: ijd.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i6) {
                            case 0:
                                dii.g result = (dii.g) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (Intrinsics.f(result, dii.e.f115068a)) {
                                    oki.h.v2(bVar3.f87216t, ShopsItemsDetailsScreenContract$ModalStep.ReturnOptions.f87209a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                }
                                break;
                            default:
                                q it9 = (q) obj5;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                mii.k kVar = new mii.k("shops_order_cancelled", new TextLocalisedClause(R$string.shops_screens_cancel_order_success, null, null, 14), null, null, null, 28);
                                com.revolut.feature.shops.impl.ui.items_details.b bVar4 = bVar3;
                                bVar4.X1(kVar);
                                bVar4.B2();
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block35, "block");
                actionsBottomSheetController.H = block35;
                return actionsBottomSheetController;
            case 23:
                com.revolut.feature.trusted_merchants.impl.ui.kompot.a aVar22 = (com.revolut.feature.trusted_merchants.impl.ui.kompot.a) obj4;
                yki.l FlowCoordinator11 = (yki.l) obj2;
                TrustedMerchantsFlowContract$Step step22 = (TrustedMerchantsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator11, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step22, "step");
                if (!Intrinsics.f(step22, TrustedMerchantsFlowContract$Step.MerchantList.f94422a)) {
                    if (step22 instanceof TrustedMerchantsFlowContract$Step.MerchantDetails) {
                        return new TrustedMerchantDetailsController(new TrustedMerchantDetailsContract$InputData(((TrustedMerchantsFlowContract$Step.MerchantDetails) step22).f94421a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TrustedMerchantsListController trustedMerchantsListController = new TrustedMerchantsListController();
                ijg.c block36 = new ijg.c(aVar22, FlowCoordinator11, i6);
                Intrinsics.checkNotNullParameter(block36, "block");
                trustedMerchantsListController.H = block36;
                return trustedMerchantsListController;
            case 24:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar4 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanCancellationScreenContract$ModalStep step23 = (EsimMobilePlanCancellationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step23, "step");
                if (!(step23 instanceof EsimMobilePlanCancellationScreenContract$ModalStep.CancellationTerms)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimMobilePlanCancellationScreenContract$ModalStep.CancellationTerms cancellationTerms = (EsimMobilePlanCancellationScreenContract$ModalStep.CancellationTerms) step23;
                Long l2 = cancellationTerms.f101113g;
                EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo = new EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo(Long.valueOf(l2 != null ? l2.longValue() : 0L), cancellationTerms.f101112c, cancellationTerms.d, cancellationTerms.f101114h, cancellationTerms.e, cancellationTerms.f);
                Instant instant = cancellationTerms.i;
                EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo scheduled = instant != null ? new EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo.Scheduled(instant) : new EsimMobilePlanCancellationTermsScreenContract$CancellationTimeInfo.Immediate(false, cancellationTerms.k, cancellationTerms.f101116l);
                EsimMobilePlanCancellationScreenContract$InputData esimMobilePlanCancellationScreenContract$InputData = bVar4.o;
                EsimMobilePlanCancellationTermsScreen esimMobilePlanCancellationTermsScreen = new EsimMobilePlanCancellationTermsScreen(new EsimMobilePlanCancellationTermsScreenContract$InputData(esimMobilePlanCancellationScreenContract$InputData.f101107b, cancellationTerms.f101110a, cancellationTerms.f101111b, esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo, scheduled, esimMobilePlanCancellationScreenContract$InputData.f, cancellationTerms.f101117m));
                ijj.m block37 = new ijj.m(bVar4, i21);
                Intrinsics.checkNotNullParameter(block37, "block");
                esimMobilePlanCancellationTermsScreen.H = block37;
                return esimMobilePlanCancellationTermsScreen;
            case 25:
                com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.c cVar2 = (com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.c) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                CashHoldingsInfoFlowContract$ModalStep step24 = (CashHoldingsInfoFlowContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step24, "step");
                cVar2.f96020q = step24.getClass().getName();
                int i43 = 24;
                if (step24 instanceof CashHoldingsInfoFlowContract$ModalStep.AvailableExplanation) {
                    CashHoldingsInfoFlowContract$ModalStep.AvailableExplanation availableExplanation = (CashHoldingsInfoFlowContract$ModalStep.AvailableExplanation) step24;
                    CashHoldingFundsExplanationScreen cashHoldingFundsExplanationScreen = new CashHoldingFundsExplanationScreen(new CashHoldingFundsExplanationScreenContract$InputData(availableExplanation.f96007a, availableExplanation.f96008b, availableExplanation.f96009c));
                    ilh.c block38 = new ilh.c(cVar2, i21);
                    Intrinsics.checkNotNullParameter(block38, "block");
                    cashHoldingFundsExplanationScreen.H = block38;
                    cashHoldingFundsExplanationScreen.l2(new i1d.b(cVar2, step24, i43));
                    return cashHoldingFundsExplanationScreen;
                }
                if (step24 instanceof CashHoldingsInfoFlowContract$ModalStep.AvailableToWithdraw) {
                    CashHoldingsInfoFlowContract$ModalStep.AvailableToWithdraw availableToWithdraw = (CashHoldingsInfoFlowContract$ModalStep.AvailableToWithdraw) step24;
                    TradingAccount tradingAccount = availableToWithdraw.f96011b;
                    viewControllerE1 = cVar2.e1(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal ? new JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor(JuniorIsaAccountOwnership.Personal.f76736a, t98.e.WITHDRAW) : tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian ? new JisaCashHoldingAvailableToWithdrawInfoDialogDescriptor(new JuniorIsaAccountOwnership.Custodian(((TradingAccount.TaxAdvantage.JIsa.Custodian) tradingAccount).f105237n.f105176b), t98.e.WITHDRAW) : new qih.b(availableToWithdraw.f96010a, tradingAccount, new TradingLegalEntityInformation(availableToWithdraw.f96012c)));
                    dph.c block39 = new dph.c(cVar2, LazyFlowCoordinator2, i3);
                    Intrinsics.checkNotNullParameter(block39, "block");
                    viewControllerE1.H = block39;
                    viewControllerE1.l2(new i1d.b(cVar2, step24, i43));
                } else {
                    if (step24 instanceof CashHoldingsInfoFlowContract$ModalStep.Selector) {
                        CashHoldingsInfoFlowContract$ModalStep.Selector selector = (CashHoldingsInfoFlowContract$ModalStep.Selector) step24;
                        CashHoldingsSelectorScreen cashHoldingsSelectorScreen = new CashHoldingsSelectorScreen(new CashHoldingSelectorInputData(selector.f96013a, selector.f96015c, qih.a.AVAILABLE_TO_WITHDRAW));
                        ilh.c block40 = new ilh.c(cVar2, i5);
                        Intrinsics.checkNotNullParameter(block40, "block");
                        cashHoldingsSelectorScreen.H = block40;
                        cashHoldingsSelectorScreen.l2(new i1d.b(cVar2, step24, i43));
                        return cashHoldingsSelectorScreen;
                    }
                    if (!(step24 instanceof CashHoldingsInfoFlowContract$ModalStep.UnsettledCash)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CashHoldingsInfoFlowContract$ModalStep.UnsettledCash unsettledCash = (CashHoldingsInfoFlowContract$ModalStep.UnsettledCash) step24;
                    viewControllerE1 = cVar2.e1(new qih.d(unsettledCash.f96016a, unsettledCash.f96017b));
                    dph.c block41 = new dph.c(cVar2, LazyFlowCoordinator2, 15);
                    Intrinsics.checkNotNullParameter(block41, "block");
                    viewControllerE1.H = block41;
                    viewControllerE1.l2(new i1d.b(cVar2, step24, i43));
                }
                return viewControllerE1;
            case 26:
                return a(obj2, obj3);
            case 27:
                fmg.p adoptionJourney = (fmg.p) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(adoptionJourney, "adoptionJourney");
                ((img.d) obj4).f162447c.f("ADOPTION_JOURNEY_KEY", adoptionJourney);
                return Unit.f186387a;
            case 28:
                n0 userChecklist = (n0) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(userChecklist, "userChecklist");
                ((img.g) obj4).d.f("USER_CHECKLIST_KEY", userChecklist);
                return Unit.f186387a;
            default:
                com.revolut.sso.impl.ui.consolidation.b bVar5 = (com.revolut.sso.impl.ui.consolidation.b) obj4;
                ContinueWithIdentityFlowContract$Step step25 = (ContinueWithIdentityFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step25, "step");
                if (!(step25 instanceof ContinueWithIdentityFlowContract$Step.ShowContinueWithRevolut)) {
                    throw new NoWhenBranchMatchedException();
                }
                ContinueWithIdentityFlowContract$Step.ShowContinueWithRevolut showContinueWithRevolut = (ContinueWithIdentityFlowContract$Step.ShowContinueWithRevolut) step25;
                ContinueWithRevolutScreen continueWithRevolutScreen = new ContinueWithRevolutScreen(showContinueWithRevolut.f106481a);
                ijg.c block42 = new ijg.c(showContinueWithRevolut, bVar5, 13);
                Intrinsics.checkNotNullParameter(block42, "block");
                continueWithRevolutScreen.H = block42;
                return continueWithRevolutScreen;
        }
    }
}
