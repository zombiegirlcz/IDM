package k3k;

import a0.d;
import android.os.Parcelable;
import android.view.View;
import aw0.m6;
import aw0.n6;
import bba.i;
import bba.j;
import c64.l;
import c64.m;
import c64.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.ApmTransferFlow;
import com.revolut.feature.apm.core.ui.impl.ui.transfer_wrapper.ApmTransferWrapperFlowContract$Step;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreenContract$ModalStep;
import com.revolut.feature.apm.payid.impl.screen.area.intro.PayIdIntroArticleKey;
import com.revolut.feature.apm.upi.impl.qr.screens.amount.InputAmountScreen;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.credit.application.plugins.api.models.CreditOfferParcel;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.prompt.CreditPromptInputData;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.LoanSelectionFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanController;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.select_loan.SelectLoanControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$State;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$Step;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentContract$InputData;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.consent.RecoveryPhraseConsentScreen;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreenContract$InputData;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$State;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData;
import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreenContract$InputData;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.SecretAccountsFlowContract$Step;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.SecretAccountsRootScreen;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.CreateSecretPhraseScreen;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.passcode.PasscodeScreenContract$HeaderMode;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode;
import com.revolut.feature.passcode.PasscodeScreenContract$WallpaperBackground;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$Step;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.api.model.PixBeneficiary;
import com.revolut.feature.pix.api.model.PixQrCodeAmount;
import com.revolut.feature.pix.api.model.PixQrCodeBill;
import com.revolut.feature.pix.api.model.PixQrCodeChange;
import com.revolut.feature.pix.api.model.PixQrCodeCreditor;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeMoneyBreakdown;
import com.revolut.feature.pix.api.model.PixQrCodeParty;
import com.revolut.feature.pix.impl.ApmTransferDestinationPix;
import com.revolut.feature.pix.impl.flow.pix_area.screens.send.PixSendScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.PixQrCodeTransactionFlow;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.PixQrCodeTransactionFlowContract$Step;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.money_breakdown.PixQrCodeMoneyBreakdownScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.review.PixQrCodeTransactionReviewScreen;
import com.revolut.feature.pix.impl.flow.transfer.PixTransferFlowContract$Step;
import com.revolut.feature.pix.impl.flow.transfer.screen.new_contact.PixNewContactScreen;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rewards.api.model.rewards.ActivationNotice;
import com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetContract$InputData;
import com.revolut.feature.rewards.impl.ui.details.bottomsheet.RewardBottomSheetScreen;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$Step;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import com.revolut.feature.rewards.impl.ui.details.status.expired.PerkDetailsExpiredPerkScreen;
import com.revolut.feature.rewards.impl.ui.details.status.optin.PerkDetailsOptInScreen;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeContract$InputData;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeScreen;
import com.revolut.feature.rewards.impl.ui.subscription.cancel.CancelSubscriptionScreen;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsContract$InputData;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsScreen;
import com.revolut.feature.rewards.impl.ui.subscription.check.ExistingSubscriptionCheckScreen;
import com.revolut.feature.subaccount.impl.ui.invite.flow.VaultInviteFlowContract$Step;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreen;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.invite.screen.decline.VaultInvitationDeclineInvitationScreen;
import com.revolut.feature.subaccount.impl.ui.invite.screen.decline.VaultInvitationDeclineScreenContract$InputData;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$Step;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_segments.TravelMilesFlightSegmentsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_segments.TravelMilesFlightSegmentsScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerControllerContract$InputData;
import com.revolut.feature_retail_user_declarations.employer.screen.EmployerControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyInfo;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.business_details.EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferEntryFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferEntryFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferNavigatingEntryFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.BankTransferFlow;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.utils.PinCodeHinter;
import ff4.o;
import ff4.p;
import ff4.q;
import grl.k9;
import ip0.yc0;
import ix0.h1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import k50.a2;
import k50.j4;
import k50.o2;
import k50.v0;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mlj.f;
import plj.g;
import plj.h;
import qca.k;
import s7a.a0;
import s7a.c0;
import s7a.z;
import vkm.j2;
import x2k.e;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180776b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f180775a = i;
        this.f180776b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object a(Object obj2, Object obj3) {
        InputAmountScreen inputAmountScreen = (InputAmountScreen) this.f180776b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        InputAmountScreen.Companion aVar = InputAmountScreen.INSTANCE;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        Object obj4 = data.f51981p;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
        return new zp0.d(editText, ((yof.b) obj4).f315672a, (u80.d) inputAmountScreen.P.getValue(), null, null, false, false, 0, false, null, 1944);
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a aVar = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) this.f180776b;
        kgh.a aVar2 = aVar.f95842s;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        FundPerformanceScreenContract$ModalStep step = (FundPerformanceScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, FundPerformanceScreenContract$ModalStep.ShowRiskInfo.f95838a)) {
            aVar2.getClass();
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_risk_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_risk_description, null, null, 14), null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
            k9 k9Var = k9.Wealth;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar3, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        }
        if (Intrinsics.f(step, FundPerformanceScreenContract$ModalStep.ShowPerformanceScenariosInfo.f95836a)) {
            aVar2.getClass();
            lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_scenarios_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_scenarios_description, null, null, 14), null, null, false, 28);
            aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
            k9 k9Var2 = k9.Wealth;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar4, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
        }
        if (step instanceof FundPerformanceScreenContract$ModalStep.ShowFeesInfo) {
            return aVar.e1(new nfh.a(new nfh.c(aVar.f95845x.f183996a)));
        }
        if (Intrinsics.f(step, FundPerformanceScreenContract$ModalStep.ShowOpenEndedFundInfo.f95835a)) {
            aVar2.getClass();
            lw0.a aVar5 = new lw0.a(new TextLocalisedClause(R$string.wealth_invest_fund_performance_open_ended_fund_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_fund_performance_open_ended_fund_description, null, null, 14), null, null, false, 28);
            aw0.e eVar3 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1016), null, null, 55);
            k9 k9Var3 = k9.Wealth;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            return new ActionsBottomSheetController(new dii.a(aVar5, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
        }
        if (!Intrinsics.f(step, FundPerformanceScreenContract$ModalStep.ShowPriceInfo.f95837a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar2.getClass();
        lw0.a aVar6 = new lw0.a(new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_price_title, null, null, 14), new TextLocalisedClause(R$string.wealth_private_equity_performance_details_dialog_price_description, null, null, 14), null, null, false, 28);
        aw0.e eVar4 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1016), null, null, 55);
        k9 k9Var4 = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar6, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b) this.f180776b;
        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData = bVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step step = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.PortabilityInstruction) {
            EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.PortabilityInstruction portabilityInstruction = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.PortabilityInstruction) step;
            String str = portabilityInstruction.f100807c;
            Pair pair = new Pair("phoneNumber", bVar.f100810p.a(portabilityInstruction.f100806b));
            EsimGiftRecipient esimGiftRecipient = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f;
            BackendFlowInput.Source.Remote remote = new BackendFlowInput.Source.Remote(str, foh.i.q(pair, new Pair("receiverName", esimGiftRecipient != null ? esimGiftRecipient.d : null)));
            BackendFlowApiEndpoints.INSTANCE.getClass();
            return bVar.e1(new n90.a(new BackendFlowInput(remote, null, null, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100801g == hgj.c.DEFAULT ? BackendFlowNavigationIcon.BackArrow.f63285a : BackendFlowNavigationIcon.Cross.f63286a, false, BackendFlowApiEndpoints.Companion.a(str), 54)));
        }
        if (step instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.NumberTransferConfirmation) {
            String str2 = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100798a;
            String str3 = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100799b;
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100800c;
            EsimCheckoutPortingSteps esimCheckoutPortingSteps = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.d;
            EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.e;
            EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen = new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen(new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData(str2, str3, esimPhoneNumberPortingInstruction, esimCheckoutPortingSteps, esimPhoneNumberPortingPowerOfAttorneyInfo, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f, esimPhoneNumberPortingPowerOfAttorneyInfo.f100375b != null ? hgj.c.DEFAULT : esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100801g));
            final int i = 0;
            Function1 block = new Function1() { // from class: kgj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof h;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar2 = bVar;
                            if (z) {
                                oki.h.t2(bVar2, bVar2.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms(((h) result).f237423a), true, null, false, 12);
                            } else if (result instanceof g) {
                                g gVar = (g) result;
                                oki.h.t2(bVar2, bVar2.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.AdditionalDetails(gVar.f237421a, gVar.f237422b), true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, a.C0621a.f101354a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C2(new a.C0615a(false));
                            }
                            return Unit.f186387a;
                        case 1:
                            mlj.g result2 = (mlj.g) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar3 = bVar;
                            oki.h.t2(bVar3, bVar3.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms(((f) result2).f206983a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            slj.g result3 = (slj.g) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof slj.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            slj.f fVar = (slj.f) result3;
                            bVar.C2(new c(fVar.f264212a, fVar.f264213b));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.H = block;
            return esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
        }
        if (step instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms) {
            EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen = new EsimMobilePlanPowerOfAttorneyTermsScreen(new EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100798a, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100799b, ((EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms) step).f100808a, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.e.i, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f));
            final int i2 = 2;
            Function1 block2 = new Function1() { // from class: kgj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof h;
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar2 = bVar;
                            if (z) {
                                oki.h.t2(bVar2, bVar2.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms(((h) result).f237423a), true, null, false, 12);
                            } else if (result instanceof g) {
                                g gVar = (g) result;
                                oki.h.t2(bVar2, bVar2.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.AdditionalDetails(gVar.f237421a, gVar.f237422b), true, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result, a.C0621a.f101354a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.C2(new a.C0615a(false));
                            }
                            return Unit.f186387a;
                        case 1:
                            mlj.g result2 = (mlj.g) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar3 = bVar;
                            oki.h.t2(bVar3, bVar3.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms(((f) result2).f206983a), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            slj.g result3 = (slj.g) obj4;
                            Intrinsics.checkNotNullParameter(result3, "result");
                            if (!(result3 instanceof slj.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            slj.f fVar = (slj.f) result3;
                            bVar.C2(new c(fVar.f264212a, fVar.f264213b));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            esimMobilePlanPowerOfAttorneyTermsScreen.H = block2;
            return esimMobilePlanPowerOfAttorneyTermsScreen;
        }
        if (!(step instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.AdditionalDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.AdditionalDetails additionalDetails = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.AdditionalDetails) step;
        EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen esimMobilePlanPowerOfAttorneyBusinessDetailsScreen = new EsimMobilePlanPowerOfAttorneyBusinessDetailsScreen(new EsimMobilePlanPowerOfAttorneyBusinessDetailsScreenContract$InputData(additionalDetails.f100803b, additionalDetails.f100802a));
        final int i3 = 1;
        Function1 block3 = new Function1() { // from class: kgj.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i3) {
                    case 0:
                        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a result = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.a) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof h;
                        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar2 = bVar;
                        if (z) {
                            oki.h.t2(bVar2, bVar2.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms(((h) result).f237423a), true, null, false, 12);
                        } else if (result instanceof g) {
                            g gVar = (g) result;
                            oki.h.t2(bVar2, bVar2.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.AdditionalDetails(gVar.f237421a, gVar.f237422b), true, null, false, 12);
                        } else {
                            if (!Intrinsics.f(result, a.C0621a.f101354a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.C2(new a.C0615a(false));
                        }
                        return Unit.f186387a;
                    case 1:
                        mlj.g result2 = (mlj.g) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!(result2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.b bVar3 = bVar;
                        oki.h.t2(bVar3, bVar3.f100813s, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.Terms(((f) result2).f206983a), true, null, false, 12);
                        return Unit.f186387a;
                    default:
                        slj.g result3 = (slj.g) obj4;
                        Intrinsics.checkNotNullParameter(result3, "result");
                        if (!(result3 instanceof slj.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        slj.f fVar = (slj.f) result3;
                        bVar.C2(new c(fVar.f264212a, fVar.f264213b));
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        esimMobilePlanPowerOfAttorneyBusinessDetailsScreen.H = block3;
        return esimMobilePlanPowerOfAttorneyBusinessDetailsScreen;
    }

    private final Object d(Object obj2, Object obj3) {
        boolean z;
        final com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b) this.f180776b;
        kh4.g gVar = bVar.f68293q;
        RefinancingOfferFlowContract$InputData refinancingOfferFlowContract$InputData = bVar.f68292p;
        final yki.l FlowCoordinator = (yki.l) obj2;
        RefinancingOfferFlowContract$Step step = (RefinancingOfferFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z3 = false;
        if (step instanceof RefinancingOfferFlowContract$Step.CreditToRefinanceSelection) {
            CreditApplicationKompotFeatureConfig.RefinancingOffer.Config config = refinancingOfferFlowContract$InputData.f68285b;
            config.getClass();
            if (config instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup) {
                z = ((CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup) config).f66806a;
            } else {
                if (!(config instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.FinalOffer)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            if (z && !((RefinancingOfferFlowContract$Step.CreditToRefinanceSelection) step).f68286a) {
                z3 = true;
            }
            CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = new CreditToRefinanceSelectionScreen(new CreditToRefinanceSelectionScreenContract$InputData(z3, !(refinancingOfferFlowContract$InputData.f68285b instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.FinalOffer), (mv3.k) gVar.f184056c.get("OFFER_PARAMETERS_CACHE_KEY"), refinancingOfferFlowContract$InputData.f68284a));
            j2c.o block = new j2c.o(bVar, 29, creditToRefinanceSelectionScreen, FlowCoordinator);
            Intrinsics.checkNotNullParameter(block, "block");
            creditToRefinanceSelectionScreen.H = block;
            return creditToRefinanceSelectionScreen;
        }
        if (!(step instanceof RefinancingOfferFlowContract$Step.LoanDurationSetup)) {
            if (!(step instanceof RefinancingOfferFlowContract$Step.FinalOffer)) {
                throw new NoWhenBranchMatchedException();
            }
            OfferContentScreen offerContentScreen = new OfferContentScreen(new OfferContentScreenContract$InputData(null, null, null, new CreditOfferParcel(false), refinancingOfferFlowContract$InputData.f68284a));
            final int i = 1;
            Function1 block2 = new Function1() { // from class: kh4.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            c64.l outputData = (c64.l) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z4 = outputData instanceof m;
                            com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar2 = bVar;
                            if (z4) {
                                bVar2.n2(new kb7.c(outputData, bVar2, null, 9), new whi.b(6));
                            } else if (outputData instanceof l.a) {
                                oki.h.t2(bVar2, FlowCoordinator, new RefinancingOfferFlowContract$Step.CreditToRefinanceSelection(true), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                            } else {
                                if (!(outputData instanceof n)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.K2(((n) outputData).f21635a);
                            }
                            return Unit.f186387a;
                        default:
                            q outputData2 = (q) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z6 = outputData2 instanceof o;
                            com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar3 = bVar;
                            if (z6) {
                                oki.h.t2(bVar3, FlowCoordinator, new RefinancingOfferFlowContract$Step.CreditToRefinanceSelection(true), false, null, false, 12);
                            } else {
                                Continuation continuation = null;
                                if (outputData2 instanceof ff4.m) {
                                    bVar3.l2(new k0g.b(outputData2, bVar3, continuation, 25), new yi5.b(26));
                                } else if (Intrinsics.f(outputData2, ff4.n.f134732a)) {
                                    bVar3.n2(new j(bVar3, null, 1), new whi.b(6));
                                } else if (!(outputData2 instanceof p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            offerContentScreen.H = block2;
            return offerContentScreen;
        }
        mv3.k kVar = (mv3.k) gVar.f184056c.get("OFFER_PARAMETERS_CACHE_KEY");
        CalculatorScreen calculatorScreen = new CalculatorScreen(new CalculatorScreenContract$InputData(R$drawable.uikit_icn_24_back_button_arrow, !((RefinancingOfferFlowContract$Step.LoanDurationSetup) step).f68288a ? kVar != null ? Long.valueOf(kVar.f209135b) : null : null, kVar != null ? Long.valueOf(kVar.f209136c) : null, kVar != null ? kVar.d : null, true, refinancingOfferFlowContract$InputData.f68284a));
        final int i2 = 0;
        Function1 block3 = new Function1() { // from class: kh4.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        c64.l outputData = (c64.l) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z4 = outputData instanceof m;
                        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar2 = bVar;
                        if (z4) {
                            bVar2.n2(new kb7.c(outputData, bVar2, null, 9), new whi.b(6));
                        } else if (outputData instanceof l.a) {
                            oki.h.t2(bVar2, FlowCoordinator, new RefinancingOfferFlowContract$Step.CreditToRefinanceSelection(true), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                        } else {
                            if (!(outputData instanceof n)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.K2(((n) outputData).f21635a);
                        }
                        return Unit.f186387a;
                    default:
                        q outputData2 = (q) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        boolean z6 = outputData2 instanceof o;
                        com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar3 = bVar;
                        if (z6) {
                            oki.h.t2(bVar3, FlowCoordinator, new RefinancingOfferFlowContract$Step.CreditToRefinanceSelection(true), false, null, false, 12);
                        } else {
                            Continuation continuation = null;
                            if (outputData2 instanceof ff4.m) {
                                bVar3.l2(new k0g.b(outputData2, bVar3, continuation, 25), new yi5.b(26));
                            } else if (Intrinsics.f(outputData2, ff4.n.f134732a)) {
                                bVar3.n2(new j(bVar3, null, 1), new whi.b(6));
                            } else if (!(outputData2 instanceof p)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        calculatorScreen.H = block3;
        return calculatorScreen;
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a) this.f180776b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TravelMilesFlightSearchResultDetailsScreenContract$ModalStep step = (TravelMilesFlightSearchResultDetailsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TravelMilesFlightSearchResultDetailsScreenContract$ModalStep.FlightSegments) {
            return new TravelMilesFlightSegmentsScreen(new TravelMilesFlightSegmentsScreenContract$InputData(((TravelMilesFlightSearchResultDetailsScreenContract$ModalStep.FlightSegments) step).f94297a));
        }
        if (!(step instanceof TravelMilesFlightSearchResultDetailsScreenContract$ModalStep.TopUp)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelMilesFlightSearchResultDetailsScreenContract$ModalStep.TopUp topUp = (TravelMilesFlightSearchResultDetailsScreenContract$ModalStep.TopUp) step;
        k79.b block = new k79.b(aVar, topUp, 14);
        TravelMilesTransferScreen travelMilesTransferScreen = new TravelMilesTransferScreen(new TravelMilesTransferScreenContract$InputData(topUp.f94298a, null, topUp.f94299b));
        Intrinsics.checkNotNullParameter(block, "block");
        travelMilesTransferScreen.H = block;
        return travelMilesTransferScreen;
    }

    private final Object g(Object obj2, Object obj3) {
        gig.t tVar = (gig.t) this.f180776b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return tVar.b();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        TaxHubTransactionExportReviewScreenContract$InputData inbound;
        ViewController pixQrCodeAddressScreen;
        Address address;
        PixQrCodeParty pixQrCodeParty;
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown;
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown2;
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown3;
        PixQrCodeMoneyBreakdown pixQrCodeMoneyBreakdown4;
        dj0.d dVar;
        PixQrCodeAmount pixQrCodeAmount;
        LocalDate localDate;
        dj0.d dVar2;
        LocalDate localDate2;
        BaseBottomSheetController cancelSubscriptionScreen;
        int i = this.f180775a;
        HiddenAccountsConfig.Accounts accounts = HiddenAccountsConfig.Accounts.f74647b;
        int i2 = 4;
        final int i3 = 3;
        final int i5 = 2;
        final int i6 = 1;
        Object obj4 = this.f180776b;
        switch (i) {
            case 0:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText, ((yof.b) obj5).f315672a, (u80.d) ((RemittanceAmountScreen) obj4).f102018b0.getValue(), null, null, false, false, 0, false, null, 1944);
            case 1:
                k3l.b bVar = (k3l.b) obj4;
                StatusViewConfiguration statusViewConfiguration = (StatusViewConfiguration) obj2;
                if (statusViewConfiguration != null) {
                    ((k3l.d) bVar).O(com.revolut.retail.operation_status.modal_status.b.a(statusViewConfiguration));
                } else {
                    ((k3l.d) bVar).i.j(true);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c cVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                TaxHubTransactionExportFlowContract$Step step = (TaxHubTransactionExportFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TaxHubTransactionExportFlowContract$Step.Filter) {
                    TaxHubTransactionExportFlowContract$Step.Filter filter = (TaxHubTransactionExportFlowContract$Step.Filter) step;
                    TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen = new TaxHubTransactionExportFilterScreen(new TaxHubTransactionExportFilterScreenContract$InputData(filter.f74390a, filter.f74391b));
                    k1.a block = new k1.a(cVar, filter, 15);
                    Intrinsics.checkNotNullParameter(block, "block");
                    taxHubTransactionExportFilterScreen.H = block;
                    return taxHubTransactionExportFilterScreen;
                }
                if (step instanceof TaxHubTransactionExportFlowContract$Step.PeriodPicker) {
                    TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen = new TaxHubTransactionExportPeriodPickerScreen();
                    k0d.c block2 = new k0d.c(cVar, 14);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    taxHubTransactionExportPeriodPickerScreen.H = block2;
                    return taxHubTransactionExportPeriodPickerScreen;
                }
                if (!(step instanceof TaxHubTransactionExportFlowContract$Step.Review)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxHubTransactionExportFlowContract$Step.Review review = (TaxHubTransactionExportFlowContract$Step.Review) step;
                qki.d dVar3 = cVar.f74401t;
                int i21 = com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.b.f74396a[review.f74393a.ordinal()];
                if (i21 == 1) {
                    LocalDate localDate3 = review.f74394b;
                    LocalDate localDate4 = review.f74395c;
                    j2 j2Var = (j2) dVar3.f22677a;
                    j2 j2Var2 = (j2) dVar3.f22677a;
                    inbound = new TaxHubTransactionExportReviewScreenContract$InputData.Inbound(localDate3, localDate4, ((TaxHubTransactionExportFlowContract$State) j2Var.getValue()).f74386a, ((TaxHubTransactionExportFlowContract$State) j2Var2.getValue()).f74387b, cVar.o.f74385c, ((TaxHubTransactionExportFlowContract$State) j2Var2.getValue()).d);
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LocalDate localDate5 = review.f74394b;
                    LocalDate localDate6 = review.f74395c;
                    j2 j2Var3 = (j2) dVar3.f22677a;
                    j2 j2Var4 = (j2) dVar3.f22677a;
                    inbound = new TaxHubTransactionExportReviewScreenContract$InputData.Outbound(localDate5, localDate6, ((TaxHubTransactionExportFlowContract$State) j2Var3.getValue()).f74386a, ((TaxHubTransactionExportFlowContract$State) j2Var4.getValue()).f74387b, ((TaxHubTransactionExportFlowContract$State) j2Var4.getValue()).e);
                }
                TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen = new TaxHubTransactionExportReviewScreen(inbound);
                k1.a block3 = new k1.a(cVar, review, 16);
                Intrinsics.checkNotNullParameter(block3, "block");
                taxHubTransactionExportReviewScreen.H = block3;
                return taxHubTransactionExportReviewScreen;
            case 3:
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.b bVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                BankTransferEntryFlowContract$Step step2 = (BankTransferEntryFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof BankTransferEntryFlowContract$Step.BankTransfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                BankTransferFlow bankTransferFlow = new BankTransferFlow(((BankTransferEntryFlowContract$Step.BankTransfer) step2).f102092a, bVar2.f102094p);
                k0d.c block4 = new k0d.c(bVar2, 20);
                Intrinsics.checkNotNullParameter(block4, "block");
                bankTransferFlow.H = block4;
                return bankTransferFlow;
            case 4:
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c cVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((BankTransferNavigatingEntryFlowContract$Step) obj3, "it");
                BankTransferEntryFlow bankTransferEntryFlow = new BankTransferEntryFlow(cVar2.o, cVar2.f102097p);
                k0d.c block5 = new k0d.c(cVar2, 21);
                Intrinsics.checkNotNullParameter(block5, "block");
                bankTransferEntryFlow.H = block5;
                return bankTransferEntryFlow;
            case 5:
                MessagesScreen messagesScreen = (MessagesScreen) obj4;
                v0 previousPane = (v0) obj2;
                v0 pane = (v0) obj3;
                MessagesScreen.Companion aVar = MessagesScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(previousPane, "previousPane");
                Intrinsics.checkNotNullParameter(pane, "pane");
                j4 j4Var = (j4) messagesScreen.R2();
                j4Var.getClass();
                Intrinsics.checkNotNullParameter(pane, "pane");
                cli.y yVar = j4Var.f181140w0;
                if (((k50.h0) ((j2) yVar.f22677a).getValue()).f181094x != pane) {
                    j4Var.H2(yVar, new o2(pane, 0));
                }
                k50.g gVar = messagesScreen.M;
                if (gVar == null) {
                    Intrinsics.r("analyticsTracker");
                    throw null;
                }
                gVar.b(pane);
                if (previousPane == pane) {
                    return Unit.f186387a;
                }
                int i22 = a2.f181024a[pane.ordinal()];
                if (i22 == 1) {
                    zo0.d dVar4 = messagesScreen.D0;
                    if (dVar4 != null) {
                        dVar4.b();
                    }
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zo0.d dVar5 = messagesScreen.D0;
                    if (dVar5 != null && dVar5.f323848g) {
                        dVar5.f323848g = false;
                        if (dVar5.k) {
                            Lazy lazy = h1.f169241a;
                            h1.e(dVar5.f323854p);
                        }
                        View view = (View) dVar5.f323851l.get();
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        dVar5.c();
                        dVar5.f323845a.removeOnScrollListener(dVar5.f323855q);
                    }
                }
                return Unit.f186387a;
            case 6:
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                ApmTransferWrapperFlowContract$Step step3 = (ApmTransferWrapperFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                ApmTransferFlow apmTransferFlow = new ApmTransferFlow(step3.f62479a);
                k0d.c block6 = new k0d.c((k52.e) obj4, 29);
                Intrinsics.checkNotNullParameter(block6, "block");
                apmTransferFlow.H = block6;
                return apmTransferFlow;
            case 7:
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a aVar2 = (com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                LoanCancellationV2FlowContract$Step step4 = (LoanCancellationV2FlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof LoanCancellationV2FlowContract$Step.Prompt) {
                    ViewController viewControllerE1 = aVar2.e1(new rv3.a(new CreditPromptInputData(zv3.a.CLOSE, aVar2.K2().f319315a, new CreditPromptAnalyticsConfiguration(0, 0, 0, 0, 15), null, 8)));
                    yc0 block7 = new yc0(1, aVar2, com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a.class, "handlePromptOutput", "handlePromptOutput(Lcom/revolut/feature/credit/application/plugins/api/navigation/prompt/CreditPromptOutputData;)V", 0, 28);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewControllerE1.H = block7;
                    return viewControllerE1;
                }
                if (!(step4 instanceof LoanCancellationV2FlowContract$Step.Confirmation)) {
                    if (!(step4 instanceof LoanCancellationV2FlowContract$Step.SelectLoan)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LoanSelectionController loanSelectionController = new LoanSelectionController(new LoanSelectionControllerContract$InputData(((LoanCancellationV2FlowContract$Step.SelectLoan) step4).f70375a));
                    k5e.k block8 = new k5e.k(aVar2, i2);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    loanSelectionController.H = block8;
                    return loanSelectionController;
                }
                String str = ((LoanCancellationV2FlowContract$State) ((j2) aVar2.f70380t.f22677a).getValue()).f70371a;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LoanConfirmWithdrawalController loanConfirmWithdrawalController = new LoanConfirmWithdrawalController(new LoanConfirmWithdrawalControllerContract$InputData(str, aVar2.K2().f319316b));
                yc0 block9 = new yc0(1, aVar2, com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a.class, "handleConfirmationOutput", "handleConfirmationOutput(Lcom/revolut/feature/credit/loan/impl/ui/rev10/cancellation_v2/confirmation/LoanConfirmWithdrawalControllerContract$OutputData;)V", 0, 29);
                Intrinsics.checkNotNullParameter(block9, "block");
                loanConfirmWithdrawalController.H = block9;
                return loanConfirmWithdrawalController;
            case 8:
                com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a aVar3 = (com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DeFiRecoveryPhraseScreenContract$ModalStep step5 = (DeFiRecoveryPhraseScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!Intrinsics.f(step5, DeFiRecoveryPhraseScreenContract$ModalStep.Consent.f71874a)) {
                    throw new NoWhenBranchMatchedException();
                }
                DeFiRecoveryPhraseScreenContract$InputData deFiRecoveryPhraseScreenContract$InputData = aVar3.f71875p;
                RecoveryPhraseConsentScreen recoveryPhraseConsentScreen = new RecoveryPhraseConsentScreen(new RecoveryPhraseConsentContract$InputData(deFiRecoveryPhraseScreenContract$InputData.f71872a, deFiRecoveryPhraseScreenContract$InputData.f71873b));
                k5e.k block10 = new k5e.k(aVar3, 5);
                Intrinsics.checkNotNullParameter(block10, "block");
                recoveryPhraseConsentScreen.H = block10;
                return recoveryPhraseConsentScreen;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.d0.E0(l6a.a.c(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_payment_instructions_first_step_card_description, R$attr.uikit_dp16, ((k6a.j) obj4).f181659h), l6a.a.b((Throwable) obj2));
            case 10:
                t6c.g params = (t6c.g) obj2;
                t6c.o value = (t6c.o) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(value, "value");
                ((k7c.b0) obj4).f181947b.f(k7c.b0.a(params), value);
                return Unit.f186387a;
            case 11:
                com.revolut.feature.subaccount.impl.ui.invite.flow.b bVar3 = (com.revolut.feature.subaccount.impl.ui.invite.flow.b) obj4;
                k8e.d dVar6 = bVar3.o;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                VaultInviteFlowContract$Step step6 = (VaultInviteFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof VaultInviteFlowContract$Step.VaultInvitationConfirmation) {
                    VaultInvitationConfirmationScreen vaultInvitationConfirmationScreen = new VaultInvitationConfirmationScreen(new VaultInvitationConfirmationScreenContract$InputData(dVar6.f182135a.f234899a));
                    k65.d dVar7 = new k65.d(1, bVar3, com.revolut.feature.subaccount.impl.ui.invite.flow.b.class, "handleInvitationOutput", "handleInvitationOutput(Lcom/revolut/feature/subaccount/impl/ui/invite/screen/VaultInvitationConfirmationScreenContract$OutputData;)V", 0, 3);
                    Intrinsics.checkNotNullParameter(dVar7, "<set-?>");
                    vaultInvitationConfirmationScreen.H = dVar7;
                    return vaultInvitationConfirmationScreen;
                }
                if (step6 instanceof VaultInviteFlowContract$Step.DeclineConfirmation) {
                    VaultInvitationDeclineInvitationScreen vaultInvitationDeclineInvitationScreen = new VaultInvitationDeclineInvitationScreen(new VaultInvitationDeclineScreenContract$InputData(dVar6.f182135a));
                    k65.d block11 = new k65.d(1, bVar3, com.revolut.feature.subaccount.impl.ui.invite.flow.b.class, "handleInvitationDeclineResult", "handleInvitationDeclineResult(Lcom/revolut/feature/subaccount/impl/ui/invite/screen/decline/VaultInvitationDeclineScreenContract$OutputData;)V", 0, 4);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    vaultInvitationDeclineInvitationScreen.H = block11;
                    return vaultInvitationDeclineInvitationScreen;
                }
                if (!(step6 instanceof VaultInviteFlowContract$Step.McyFlowStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                t99.k kVar = bVar3.f89093t;
                bla.c cVar3 = ((VaultInviteFlowContract$Step.McyFlowStep) step6).f89087a;
                k9 k9Var = k9.Accounts;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ExchangeGlobalAccessFlow exchangeGlobalAccessFlowB = t99.k.b(kVar, cVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 1);
                k65.d block12 = new k65.d(1, bVar3, com.revolut.feature.subaccount.impl.ui.invite.flow.b.class, "handleMcyOutput", "handleMcyOutput(Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput;)V", 0, 5);
                Intrinsics.checkNotNullParameter(block12, "block");
                exchangeGlobalAccessFlowB.H = block12;
                return exchangeGlobalAccessFlowB;
            case 12:
                com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar4 = (com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelTransfersHomeScreenContract$ModalStep step7 = (TravelHotelTransfersHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof TravelHotelTransfersHomeScreenContract$ModalStep.UnlinkAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelTransfersHomeScreenContract$ModalStep.UnlinkAccount unlinkAccount = (TravelHotelTransfersHomeScreenContract$ModalStep.UnlinkAccount) step7;
                return aVar4.e1(new g1f.a(unlinkAccount.f93603a, unlinkAccount.f93604b, u2f.j.HOTEL_LOYALTY_TRANSFERS));
            case 13:
                com.revolut.feature.apm.payid.impl.screen.area.c cVar4 = (com.revolut.feature.apm.payid.impl.screen.area.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AreaScreenContract$ModalStep it8 = (AreaScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, AreaScreenContract$ModalStep.Intro.f62709a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE12 = cVar4.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PayIdIntroArticleKey.f62719a)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                ka2.y block13 = new ka2.y(cVar4, 1);
                Intrinsics.checkNotNullParameter(block13, "block");
                viewControllerE12.H = block13;
                return viewControllerE12;
            case 14:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new ka4.o((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), ((af4.v) obj4).f3884b.b(com.revolut.feature.credit.core.R$string.credit_application_down_payment_source_v2_sources_title), null);
            case 15:
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar5 = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) obj4;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                SecretAccountsFlowContract$Step step8 = (SecretAccountsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, SecretAccountsFlowContract$Step.Authentication.f74672a)) {
                    ViewController viewControllerE13 = aVar5.e1(qa7.a.f243970a);
                    k65.d block14 = new k65.d(1, aVar5, com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a.class, "handleAuthenticationStepResult", "handleAuthenticationStepResult(Lcom/revolut/feature/hidden_accounts/api/navigation/BiometricAuthenticationOutputData;)V", 0, 6);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    viewControllerE13.H = block14;
                    return viewControllerE13;
                }
                if (Intrinsics.f(step8, SecretAccountsFlowContract$Step.SecretAccountsRoot.f74676a)) {
                    SecretAccountsRootScreen secretAccountsRootScreen = new SecretAccountsRootScreen();
                    k65.d block15 = new k65.d(1, aVar5, com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a.class, "handleSecretAccountsRootStepResult", "handleSecretAccountsRootStepResult(Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts/screens/root/SecretAccountsRootScreenContract$OutputData;)V", 0, 7);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    secretAccountsRootScreen.H = block15;
                    return secretAccountsRootScreen;
                }
                if (Intrinsics.f(step8, SecretAccountsFlowContract$Step.UnhideSecretAccountsDialog.f74677a)) {
                    aVar5.o.getClass();
                    lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_dialog_unhide_secret_accounts_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_dialog_unhide_secret_accounts_description, null, null, 14), null, null, false, 28);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_dialog_unhide_secret_accounts_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.hidden_accounts.impl.R$string.hidden_accounts_dialog_unhide_secret_accounts_action_deny, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var2 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar6, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                    k65.d block16 = new k65.d(1, aVar5, com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a.class, "handleUnhideSecretAccountsDialogStepResult", "handleUnhideSecretAccountsDialogStepResult(Lcom/revolut/kompot/common/bottom_sheet/actions/ActionsBottomSheetController$OutputData;)V", 0, 8);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    actionsBottomSheetController.H = block16;
                    return actionsBottomSheetController;
                }
                if (Intrinsics.f(step8, SecretAccountsFlowContract$Step.SecretAccountsPicker.f74675a)) {
                    HiddenAccountsListScreen hiddenAccountsListScreen = new HiddenAccountsListScreen(new HiddenAccountsListScreenContract$InputData(accounts, na7.b.SECRET, true));
                    k65.d block17 = new k65.d(1, aVar5, com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a.class, "handleSecretAccountsPickerStepResult", "handleSecretAccountsPickerStepResult(Lcom/revolut/feature/hidden_accounts/impl/ui/screens/hidden_accounts_list/HiddenAccountsListScreenContract$OutputData;)V", 0, 9);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    hiddenAccountsListScreen.H = block17;
                    return hiddenAccountsListScreen;
                }
                if (step8 instanceof SecretAccountsFlowContract$Step.CreateSecretPhrase) {
                    CreateSecretPhraseScreen createSecretPhraseScreen = new CreateSecretPhraseScreen();
                    k65.d block18 = new k65.d(1, aVar5, com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a.class, "handleCreateSecretPhraseStepResult", "handleCreateSecretPhraseStepResult(Lcom/revolut/feature/hidden_accounts/impl/ui/secret_accounts_flow/screens/create_secret_phrase/CreateSecretPhraseScreenContract$OutputData;)V", 0, 10);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    createSecretPhraseScreen.H = block18;
                    return createSecretPhraseScreen;
                }
                if (!(step8 instanceof SecretAccountsFlowContract$Step.ProductArticle)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductArticleParams productArticleParams = ((SecretAccountsFlowContract$Step.ProductArticle) step8).f74674a;
                k9 k9Var3 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE14 = aVar5.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, false, 52));
                k5e.k block19 = new k5e.k(aVar5, 18);
                Intrinsics.checkNotNullParameter(block19, "block");
                viewControllerE14.H = block19;
                return viewControllerE14;
            case 16:
                com.revolut.feature.pix.impl.flow.qr_code_transaction.a aVar7 = (com.revolut.feature.pix.impl.flow.qr_code_transaction.a) obj4;
                yki.l FlowCoordinator5 = (yki.l) obj2;
                PixQrCodeTransactionFlowContract$Step step9 = (PixQrCodeTransactionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof PixQrCodeTransactionFlowContract$Step.Amount) {
                    PixQrCodeAmount pixQrCodeAmount2 = aVar7.I2().d;
                    if (pixQrCodeAmount2 == null || (dVar2 = pixQrCodeAmount2.f80424a) == null) {
                        xi0.b.Companion.getClass();
                        dVar2 = new dj0.d(0L, xi0.b.D);
                    }
                    dj0.d dVar8 = dVar2;
                    PixQrCodeTransactionFlowContract$Step.Amount amount = (PixQrCodeTransactionFlowContract$Step.Amount) step9;
                    String str2 = amount.f80689a;
                    String str3 = amount.f80690b;
                    PixQrCodeBill pixQrCodeBill = aVar7.I2().f80449h;
                    String str4 = pixQrCodeBill != null ? pixQrCodeBill.f : null;
                    PixQrCodeBill pixQrCodeBill2 = aVar7.I2().f80449h;
                    if (pixQrCodeBill2 != null) {
                        Intrinsics.checkNotNullParameter(pixQrCodeBill2, "<this>");
                        String str5 = pixQrCodeBill2.f80428c;
                        localDate2 = str5 != null ? LocalDate.parse(str5, DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
                    } else {
                        localDate2 = null;
                    }
                    PixQrCodeDecodeData pixQrCodeDecodeDataI2 = aVar7.I2();
                    Intrinsics.checkNotNullParameter(pixQrCodeDecodeDataI2, "<this>");
                    pixQrCodeAddressScreen = new PixQrCodeTransactionAmountScreen(new PixQrCodeTransactionAmountScreenContract$InputData(dVar8, str2, str3, str4, localDate2, pixQrCodeDecodeDataI2.f80448g == null && pixQrCodeDecodeDataI2.f == null));
                    k79.b block20 = new k79.b(aVar7, FlowCoordinator5, 7);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    pixQrCodeAddressScreen.H = block20;
                } else if (step9 instanceof PixQrCodeTransactionFlowContract$Step.Review) {
                    kba.c cVar5 = aVar7.o;
                    String str6 = cVar5.f182541a;
                    PixQrCodeTransactionFlowContract$Step.Review review2 = (PixQrCodeTransactionFlowContract$Step.Review) step9;
                    dj0.d dVar9 = review2.f80694b;
                    String str7 = review2.f80695c;
                    String str8 = review2.d;
                    String str9 = review2.e;
                    j2 j2Var5 = aVar7.f80696p;
                    TransferScheduleData transferScheduleData = review2.f;
                    PixQrCodeBill pixQrCodeBill3 = cVar5.f182542b.f80449h;
                    if (pixQrCodeBill3 != null) {
                        Intrinsics.checkNotNullParameter(pixQrCodeBill3, "<this>");
                        String str10 = pixQrCodeBill3.f80428c;
                        localDate = str10 != null ? LocalDate.parse(str10, DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
                    } else {
                        localDate = null;
                    }
                    pixQrCodeAddressScreen = new PixQrCodeTransactionReviewScreen(new wba.i(str6, dVar9, str7, str8, str9, j2Var5, localDate, transferScheduleData));
                    j2c.o block21 = new j2c.o(aVar7, 27, FlowCoordinator5, step9);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    pixQrCodeAddressScreen.H = block21;
                } else if (step9 instanceof PixQrCodeTransactionFlowContract$Step.AdditionalInformationRequested) {
                    PixQrCodeBill pixQrCodeBill4 = aVar7.I2().f80449h;
                    List list = pixQrCodeBill4 != null ? pixQrCodeBill4.f80430h : null;
                    if (list == null) {
                        list = zhm.f0.f322471a;
                    }
                    pixQrCodeAddressScreen = new PixQrCodeAdditionalInformationScreen(new PixQrCodeAdditionalInformationScreenContract$InputData(list));
                } else if (step9 instanceof PixQrCodeTransactionFlowContract$Step.PixChangeAmountRequested) {
                    PixQrCodeChange pixQrCodeChange = aVar7.I2().f80448g;
                    if (pixQrCodeChange == null || (pixQrCodeAmount = pixQrCodeChange.f80431a) == null || (dVar = pixQrCodeAmount.f80424a) == null) {
                        dj0.d.Companion.getClass();
                        dVar = dj0.d.e;
                    }
                    pixQrCodeAddressScreen = new PixQrCodeChangeAmountScreen(new PixQrCodeChangeAmountScreenContract$InputData(dVar));
                    k5e.k block22 = new k5e.k(aVar7, 19);
                    Intrinsics.checkNotNullParameter(block22, "block");
                    pixQrCodeAddressScreen.H = block22;
                } else if (step9 instanceof PixQrCodeTransactionFlowContract$Step.InterestAndFeeRequested) {
                    PixQrCodeBill pixQrCodeBill5 = aVar7.I2().f80449h;
                    dj0.d dVar10 = (pixQrCodeBill5 == null || (pixQrCodeMoneyBreakdown4 = pixQrCodeBill5.i) == null) ? null : pixQrCodeMoneyBreakdown4.f;
                    PixQrCodeBill pixQrCodeBill6 = aVar7.I2().f80449h;
                    dj0.d dVar11 = (pixQrCodeBill6 == null || (pixQrCodeMoneyBreakdown3 = pixQrCodeBill6.i) == null) ? null : pixQrCodeMoneyBreakdown3.e;
                    PixQrCodeBill pixQrCodeBill7 = aVar7.I2().f80449h;
                    dj0.d dVar12 = (pixQrCodeBill7 == null || (pixQrCodeMoneyBreakdown2 = pixQrCodeBill7.i) == null) ? null : pixQrCodeMoneyBreakdown2.d;
                    PixQrCodeBill pixQrCodeBill8 = aVar7.I2().f80449h;
                    pixQrCodeAddressScreen = new PixQrCodeMoneyBreakdownScreen(new PixQrCodeMoneyBreakdownScreenContract$InputData(dVar10, dVar11, dVar12, (pixQrCodeBill8 == null || (pixQrCodeMoneyBreakdown = pixQrCodeBill8.i) == null) ? null : pixQrCodeMoneyBreakdown.f80466c));
                } else {
                    if (!(step9 instanceof PixQrCodeTransactionFlowContract$Step.AddressRequested)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PixQrCodeCreditor pixQrCodeCreditor = aVar7.I2().e;
                    if (pixQrCodeCreditor == null || (pixQrCodeParty = pixQrCodeCreditor.f80432a) == null || (address = pixQrCodeParty.f80470c) == null) {
                        address = o51.a.f222306a;
                    }
                    pixQrCodeAddressScreen = new PixQrCodeAddressScreen(new PixQrCodeAddressScreenContract$InputData(address));
                }
                return pixQrCodeAddressScreen;
            case 17:
                final com.revolut.feature_retail_user_declarations.employer.screen.b bVar4 = (com.revolut.feature_retail_user_declarations.employer.screen.b) obj4;
                cli.y yVar2 = bVar4.f97647q;
                EmployerControllerContract$InputData employerControllerContract$InputData = bVar4.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EmployerControllerContract$ModalStep step10 = (EmployerControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (Intrinsics.f(step10, EmployerControllerContract$ModalStep.SelectEmployer.f97643a)) {
                    PickerController pickerController = new PickerController(new s7a.x(null, employerControllerContract$InputData.f97640a, null, null, false, null, new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.onboarding_employer_selection_search_employer_hint, null, null, 14), null, null, false, null, ((kbi.f) ((j2) yVar2.f22677a).getValue()).f182599b, null, null, false, null, null, null, null, Integer.valueOf(R$style.UiKitTheme_ReadyForAccentNeutralMarker), 1073593852), bVar4.f97646p);
                    final int i32 = 0;
                    Function1 block23 = new Function1() { // from class: kbi.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i32) {
                                case 0:
                                    com.revolut.feature_retail_user_declarations.employer.screen.b bVar5 = bVar4;
                                    y yVar3 = bVar5.f97647q;
                                    a0 output = (a0) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    c0 c0Var = output.f260599a;
                                    if (c0Var instanceof z) {
                                        bVar5.H2(yVar3, new k9h.d(15));
                                    } else if (c0Var instanceof jbi.c) {
                                        String str11 = ((jbi.c) c0Var).f172638a;
                                        if (Intrinsics.f(str11, "EMPLOYER_NOT_HERE_ID")) {
                                            bVar5.H2(yVar3, new k9h.d(15));
                                        } else {
                                            bVar5.H2(yVar3, new k7c.n(str11, 6));
                                        }
                                    }
                                    break;
                                default:
                                    AddressFlowContract$OutputData output2 = (AddressFlowContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    Address address2 = output2.f60940a;
                                    com.revolut.feature_retail_user_declarations.employer.screen.b bVar6 = bVar4;
                                    bVar6.H2(bVar6.f97647q, new avj.p(address2, 7));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    pickerController.H = block23;
                    return pickerController;
                }
                if (!Intrinsics.f(step10, EmployerControllerContract$ModalStep.SelectEmployerAddress.f97644a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Address address2 = ((kbi.f) ((j2) yVar2.f22677a).getValue()).f182600c;
                ViewController viewControllerE15 = bVar4.e1(new th1.a(new AddressFlowContract$InputData(address2 == null ? new Address(null, null, null, null, null, employerControllerContract$InputData.f97642c.f297794a, null, null, null, null, null, null, null, null, null, 32735, null) : address2, new TextLocalisedClause(com.revolut.feature.user_declarations.shared.R$string.employer_address_title, null, null, 14), null, false, null, FieldMode.Hidden.f60954a, null, null, false, null, 2097020), null, null, 6));
                final int i33 = 1;
                Function1 block24 = new Function1() { // from class: kbi.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i33) {
                            case 0:
                                com.revolut.feature_retail_user_declarations.employer.screen.b bVar5 = bVar4;
                                y yVar3 = bVar5.f97647q;
                                a0 output = (a0) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                c0 c0Var = output.f260599a;
                                if (c0Var instanceof z) {
                                    bVar5.H2(yVar3, new k9h.d(15));
                                } else if (c0Var instanceof jbi.c) {
                                    String str11 = ((jbi.c) c0Var).f172638a;
                                    if (Intrinsics.f(str11, "EMPLOYER_NOT_HERE_ID")) {
                                        bVar5.H2(yVar3, new k9h.d(15));
                                    } else {
                                        bVar5.H2(yVar3, new k7c.n(str11, 6));
                                    }
                                }
                                break;
                            default:
                                AddressFlowContract$OutputData output2 = (AddressFlowContract$OutputData) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                Address address22 = output2.f60940a;
                                com.revolut.feature_retail_user_declarations.employer.screen.b bVar6 = bVar4;
                                bVar6.H2(bVar6.f97647q, new avj.p(address22, 7));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block24, "block");
                viewControllerE15.H = block24;
                return viewControllerE15;
            case 18:
                ec5.b cryptoAccount = (ec5.b) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(cryptoAccount, "cryptoAccount");
                ((kc5.b) obj4).f182665b.f("CRYPTO_ACCOUNT_MEMORY_KEY", cryptoAccount);
                return Unit.f186387a;
            case 19:
                final com.revolut.feature.pix.impl.flow.transfer.a aVar8 = (com.revolut.feature.pix.impl.flow.transfer.a) obj4;
                final yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                PixTransferFlowContract$Step step11 = (PixTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (Intrinsics.f(step11, PixTransferFlowContract$Step.Beneficiaries.f80746a)) {
                    PixSendScreen pixSendScreen = new PixSendScreen();
                    final int i43 = 0;
                    Function1 block25 = new Function1() { // from class: kca.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i43) {
                                case 0:
                                    j result = (j) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof bba.h;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar9 = aVar8;
                                    if (z) {
                                        aVar9.C1(u0.c(((uz9.a) aVar9.f80755q).a(new ChatTransferRecipient.BeneficiaryRecipient(((bba.h) result).f14206a, null), null)));
                                    } else {
                                        boolean z3 = result instanceof i;
                                        yki.b bVar5 = LazyFlowCoordinator4;
                                        if (z3) {
                                            oki.h.t2(aVar9, bVar5, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                            Unit unit = Unit.f186387a;
                                        } else if (result instanceof bba.g) {
                                            bba.g gVar2 = (bba.g) result;
                                            oki.h.t2(aVar9, bVar5, new PixTransferFlowContract$Step.QrCodeTransfer(gVar2.f14204a, gVar2.f14205b), true, null, false, 12);
                                            Unit unit2 = Unit.f186387a;
                                        } else if (result instanceof bba.f) {
                                            e eVar = aVar9.f80756r;
                                            PixBeneficiary pixBeneficiary = ((bba.f) result).f14203a;
                                            f5j.a aVar10 = pixBeneficiary.f80397a;
                                            String str11 = pixBeneficiary.f80398b;
                                            aVar9.C1(u0.b(d2k.g.a(eVar, aVar10, null, null, null, null, new FlowExtras(new FinishCommand(null, null, null, 7)), str11 != null ? d.x("PAYMENT_SCHEME_END_TO_END_ID", str11) : null, null, 638)));
                                        } else {
                                            if (!(result instanceof bba.e)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            wi0.b.Companion.getClass();
                                            wi0.b bVar6 = wi0.b.A;
                                            xi0.b.Companion.getClass();
                                            aVar9.C1(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar6, xi0.b.D, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)))));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    g12.q result2 = (g12.q) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(result2, "<this>");
                                    g12.p pVar = result2 instanceof g12.p ? (g12.p) result2 : null;
                                    g12.m mVar = pVar != null ? pVar.f139527a : null;
                                    tca.c cVar6 = mVar instanceof tca.c ? (tca.c) mVar : null;
                                    if (cVar6 != null) {
                                        boolean z4 = cVar6 instanceof tca.a;
                                        com.revolut.feature.pix.impl.flow.transfer.a aVar11 = aVar8;
                                        yki.b bVar7 = LazyFlowCoordinator4;
                                        if (z4) {
                                            tca.a aVar12 = (tca.a) cVar6;
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.QrCodeTransfer(aVar12.f269766a, aVar12.f269767b), false, null, false, 12);
                                        } else {
                                            if (!(cVar6 instanceof tca.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.ApmTransfer(((tca.b) cVar6).f269768a), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    qca.m it9 = (qca.m) obj6;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z6 = it9 instanceof qca.i;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar13 = aVar8;
                                    yki.b bVar8 = LazyFlowCoordinator4;
                                    if (z6) {
                                        aVar13.C1(u0.c(((uz9.a) aVar13.f80755q).a(new ChatTransferRecipient.ContactRecipient(((qca.i) it9).f244674a), null)));
                                        oki.h.D2(bVar8);
                                    } else if (it9 instanceof qca.j) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.PeerToPeerTransfer(((qca.j) it9).f244675a), false, null, false, 12);
                                    } else if (it9 instanceof k) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.ApmTransfer(((k) it9).f244676a), false, null, false, 12);
                                    } else if (it9 instanceof qca.l) {
                                        oki.h.t2(aVar13, bVar8, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    } else {
                                        if (!(it9 instanceof qca.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar13.I2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    yca.k result3 = (yca.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof yca.i) {
                                        oki.h.t2(aVar8, LazyFlowCoordinator4, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    pixSendScreen.H = block25;
                    return pixSendScreen;
                }
                if (Intrinsics.f(step11, PixTransferFlowContract$Step.Contacts.f80747a)) {
                    pca.d dVar13 = aVar8.f80757s;
                    pca.e listType = pca.e.Send;
                    dVar13.getClass();
                    Intrinsics.checkNotNullParameter(listType, "listType");
                    Intrinsics.checkNotNullParameter(listType, "<this>");
                    if (pca.f.f234839a[listType.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hrf.f fVar = hrf.f.OUTGOING;
                    ApmPix apmPix = ApmPix.f61820c;
                    apmPix.getClass();
                    return aVar8.e1(new c12.x(new ApmRecipientListInputData(fVar, listType.a(), new GlyphImage(R$drawable.uikit_icn_24_logo_pix_filled, null, null, 6), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_send_search_placeholder, null, null, 14), new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_send_contacts_new_contact, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_select_contact_no_contacts, zhm.u.c(apmPix.e()), null, 12), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_recipient_list_empty_state_widget_action, null, null, 14), apmPix.e(), (List) null, new aw0.k9(new aw0.c("QR_SEARCH_FIELD_ACTION_ID", new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, 2), 544), dVar13.f234838a));
                }
                if (Intrinsics.f(step11, PixTransferFlowContract$Step.ScanQr.f80753a)) {
                    ViewController viewControllerE16 = aVar8.e1(new g12.k(new QrScannerInputData(), aVar8.u));
                    final int i59 = 1;
                    Function1 block26 = new Function1() { // from class: kca.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i59) {
                                case 0:
                                    j result = (j) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof bba.h;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar9 = aVar8;
                                    if (z) {
                                        aVar9.C1(u0.c(((uz9.a) aVar9.f80755q).a(new ChatTransferRecipient.BeneficiaryRecipient(((bba.h) result).f14206a, null), null)));
                                    } else {
                                        boolean z3 = result instanceof i;
                                        yki.b bVar5 = LazyFlowCoordinator4;
                                        if (z3) {
                                            oki.h.t2(aVar9, bVar5, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                            Unit unit = Unit.f186387a;
                                        } else if (result instanceof bba.g) {
                                            bba.g gVar2 = (bba.g) result;
                                            oki.h.t2(aVar9, bVar5, new PixTransferFlowContract$Step.QrCodeTransfer(gVar2.f14204a, gVar2.f14205b), true, null, false, 12);
                                            Unit unit2 = Unit.f186387a;
                                        } else if (result instanceof bba.f) {
                                            e eVar = aVar9.f80756r;
                                            PixBeneficiary pixBeneficiary = ((bba.f) result).f14203a;
                                            f5j.a aVar10 = pixBeneficiary.f80397a;
                                            String str11 = pixBeneficiary.f80398b;
                                            aVar9.C1(u0.b(d2k.g.a(eVar, aVar10, null, null, null, null, new FlowExtras(new FinishCommand(null, null, null, 7)), str11 != null ? d.x("PAYMENT_SCHEME_END_TO_END_ID", str11) : null, null, 638)));
                                        } else {
                                            if (!(result instanceof bba.e)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            wi0.b.Companion.getClass();
                                            wi0.b bVar6 = wi0.b.A;
                                            xi0.b.Companion.getClass();
                                            aVar9.C1(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar6, xi0.b.D, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)))));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    g12.q result2 = (g12.q) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(result2, "<this>");
                                    g12.p pVar = result2 instanceof g12.p ? (g12.p) result2 : null;
                                    g12.m mVar = pVar != null ? pVar.f139527a : null;
                                    tca.c cVar6 = mVar instanceof tca.c ? (tca.c) mVar : null;
                                    if (cVar6 != null) {
                                        boolean z4 = cVar6 instanceof tca.a;
                                        com.revolut.feature.pix.impl.flow.transfer.a aVar11 = aVar8;
                                        yki.b bVar7 = LazyFlowCoordinator4;
                                        if (z4) {
                                            tca.a aVar12 = (tca.a) cVar6;
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.QrCodeTransfer(aVar12.f269766a, aVar12.f269767b), false, null, false, 12);
                                        } else {
                                            if (!(cVar6 instanceof tca.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.ApmTransfer(((tca.b) cVar6).f269768a), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    qca.m it9 = (qca.m) obj6;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z6 = it9 instanceof qca.i;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar13 = aVar8;
                                    yki.b bVar8 = LazyFlowCoordinator4;
                                    if (z6) {
                                        aVar13.C1(u0.c(((uz9.a) aVar13.f80755q).a(new ChatTransferRecipient.ContactRecipient(((qca.i) it9).f244674a), null)));
                                        oki.h.D2(bVar8);
                                    } else if (it9 instanceof qca.j) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.PeerToPeerTransfer(((qca.j) it9).f244675a), false, null, false, 12);
                                    } else if (it9 instanceof k) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.ApmTransfer(((k) it9).f244676a), false, null, false, 12);
                                    } else if (it9 instanceof qca.l) {
                                        oki.h.t2(aVar13, bVar8, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    } else {
                                        if (!(it9 instanceof qca.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar13.I2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    yca.k result3 = (yca.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof yca.i) {
                                        oki.h.t2(aVar8, LazyFlowCoordinator4, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block26, "block");
                    viewControllerE16.H = block26;
                    return viewControllerE16;
                }
                if (step11 instanceof PixTransferFlowContract$Step.NewContact) {
                    PixNewContactScreen pixNewContactScreen = new PixNewContactScreen(((PixTransferFlowContract$Step.NewContact) step11).f80749a);
                    Function1 block27 = new Function1() { // from class: kca.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    j result = (j) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof bba.h;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar9 = aVar8;
                                    if (z) {
                                        aVar9.C1(u0.c(((uz9.a) aVar9.f80755q).a(new ChatTransferRecipient.BeneficiaryRecipient(((bba.h) result).f14206a, null), null)));
                                    } else {
                                        boolean z3 = result instanceof i;
                                        yki.b bVar5 = LazyFlowCoordinator4;
                                        if (z3) {
                                            oki.h.t2(aVar9, bVar5, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                            Unit unit = Unit.f186387a;
                                        } else if (result instanceof bba.g) {
                                            bba.g gVar2 = (bba.g) result;
                                            oki.h.t2(aVar9, bVar5, new PixTransferFlowContract$Step.QrCodeTransfer(gVar2.f14204a, gVar2.f14205b), true, null, false, 12);
                                            Unit unit2 = Unit.f186387a;
                                        } else if (result instanceof bba.f) {
                                            e eVar = aVar9.f80756r;
                                            PixBeneficiary pixBeneficiary = ((bba.f) result).f14203a;
                                            f5j.a aVar10 = pixBeneficiary.f80397a;
                                            String str11 = pixBeneficiary.f80398b;
                                            aVar9.C1(u0.b(d2k.g.a(eVar, aVar10, null, null, null, null, new FlowExtras(new FinishCommand(null, null, null, 7)), str11 != null ? d.x("PAYMENT_SCHEME_END_TO_END_ID", str11) : null, null, 638)));
                                        } else {
                                            if (!(result instanceof bba.e)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            wi0.b.Companion.getClass();
                                            wi0.b bVar6 = wi0.b.A;
                                            xi0.b.Companion.getClass();
                                            aVar9.C1(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar6, xi0.b.D, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)))));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    g12.q result2 = (g12.q) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(result2, "<this>");
                                    g12.p pVar = result2 instanceof g12.p ? (g12.p) result2 : null;
                                    g12.m mVar = pVar != null ? pVar.f139527a : null;
                                    tca.c cVar6 = mVar instanceof tca.c ? (tca.c) mVar : null;
                                    if (cVar6 != null) {
                                        boolean z4 = cVar6 instanceof tca.a;
                                        com.revolut.feature.pix.impl.flow.transfer.a aVar11 = aVar8;
                                        yki.b bVar7 = LazyFlowCoordinator4;
                                        if (z4) {
                                            tca.a aVar12 = (tca.a) cVar6;
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.QrCodeTransfer(aVar12.f269766a, aVar12.f269767b), false, null, false, 12);
                                        } else {
                                            if (!(cVar6 instanceof tca.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.ApmTransfer(((tca.b) cVar6).f269768a), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    qca.m it9 = (qca.m) obj6;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z6 = it9 instanceof qca.i;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar13 = aVar8;
                                    yki.b bVar8 = LazyFlowCoordinator4;
                                    if (z6) {
                                        aVar13.C1(u0.c(((uz9.a) aVar13.f80755q).a(new ChatTransferRecipient.ContactRecipient(((qca.i) it9).f244674a), null)));
                                        oki.h.D2(bVar8);
                                    } else if (it9 instanceof qca.j) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.PeerToPeerTransfer(((qca.j) it9).f244675a), false, null, false, 12);
                                    } else if (it9 instanceof k) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.ApmTransfer(((k) it9).f244676a), false, null, false, 12);
                                    } else if (it9 instanceof qca.l) {
                                        oki.h.t2(aVar13, bVar8, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    } else {
                                        if (!(it9 instanceof qca.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar13.I2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    yca.k result3 = (yca.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof yca.i) {
                                        oki.h.t2(aVar8, LazyFlowCoordinator4, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block27, "block");
                    pixNewContactScreen.H = block27;
                    return pixNewContactScreen;
                }
                if (step11 instanceof PixTransferFlowContract$Step.PeerToPeerTransfer) {
                    return aVar8.e1(new s8k.e(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(((PixTransferFlowContract$Step.PeerToPeerTransfer) step11).f80750a), hrf.f.OUTGOING, TransferFlowType.Default.f92257b, null, new TransferScheduleData(0L, (jli.c) null, 7), m1l.a.SCHEDULE_ENABLED, false, null, null, null, null, null, null, null, null, 131016)));
                }
                if (!(step11 instanceof PixTransferFlowContract$Step.ApmTransfer)) {
                    if (step11 instanceof PixTransferFlowContract$Step.QrCodeTransfer) {
                        PixTransferFlowContract$Step.QrCodeTransfer qrCodeTransfer = (PixTransferFlowContract$Step.QrCodeTransfer) step11;
                        return new PixQrCodeTransactionFlow(new kba.c(qrCodeTransfer.f80751a, qrCodeTransfer.f80752b));
                    }
                    if (!(step11 instanceof PixTransferFlowContract$Step.InputKey)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PixTransferInputKeyScreen pixTransferInputKeyScreen = new PixTransferInputKeyScreen(new PixTransferInputKeyScreenContract$InputData(0));
                    Function1 block28 = new Function1() { // from class: kca.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    j result = (j) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof bba.h;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar9 = aVar8;
                                    if (z) {
                                        aVar9.C1(u0.c(((uz9.a) aVar9.f80755q).a(new ChatTransferRecipient.BeneficiaryRecipient(((bba.h) result).f14206a, null), null)));
                                    } else {
                                        boolean z3 = result instanceof i;
                                        yki.b bVar5 = LazyFlowCoordinator4;
                                        if (z3) {
                                            oki.h.t2(aVar9, bVar5, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                            Unit unit = Unit.f186387a;
                                        } else if (result instanceof bba.g) {
                                            bba.g gVar2 = (bba.g) result;
                                            oki.h.t2(aVar9, bVar5, new PixTransferFlowContract$Step.QrCodeTransfer(gVar2.f14204a, gVar2.f14205b), true, null, false, 12);
                                            Unit unit2 = Unit.f186387a;
                                        } else if (result instanceof bba.f) {
                                            e eVar = aVar9.f80756r;
                                            PixBeneficiary pixBeneficiary = ((bba.f) result).f14203a;
                                            f5j.a aVar10 = pixBeneficiary.f80397a;
                                            String str11 = pixBeneficiary.f80398b;
                                            aVar9.C1(u0.b(d2k.g.a(eVar, aVar10, null, null, null, null, new FlowExtras(new FinishCommand(null, null, null, 7)), str11 != null ? d.x("PAYMENT_SCHEME_END_TO_END_ID", str11) : null, null, 638)));
                                        } else {
                                            if (!(result instanceof bba.e)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            wi0.b.Companion.getClass();
                                            wi0.b bVar6 = wi0.b.A;
                                            xi0.b.Companion.getClass();
                                            aVar9.C1(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar6, xi0.b.D, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.INTERNATIONAL_BENEFICIARY)))));
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    g12.q result2 = (g12.q) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    Intrinsics.checkNotNullParameter(result2, "<this>");
                                    g12.p pVar = result2 instanceof g12.p ? (g12.p) result2 : null;
                                    g12.m mVar = pVar != null ? pVar.f139527a : null;
                                    tca.c cVar6 = mVar instanceof tca.c ? (tca.c) mVar : null;
                                    if (cVar6 != null) {
                                        boolean z4 = cVar6 instanceof tca.a;
                                        com.revolut.feature.pix.impl.flow.transfer.a aVar11 = aVar8;
                                        yki.b bVar7 = LazyFlowCoordinator4;
                                        if (z4) {
                                            tca.a aVar12 = (tca.a) cVar6;
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.QrCodeTransfer(aVar12.f269766a, aVar12.f269767b), false, null, false, 12);
                                        } else {
                                            if (!(cVar6 instanceof tca.b)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(aVar11, bVar7, new PixTransferFlowContract$Step.ApmTransfer(((tca.b) cVar6).f269768a), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    qca.m it9 = (qca.m) obj6;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    boolean z6 = it9 instanceof qca.i;
                                    com.revolut.feature.pix.impl.flow.transfer.a aVar13 = aVar8;
                                    yki.b bVar8 = LazyFlowCoordinator4;
                                    if (z6) {
                                        aVar13.C1(u0.c(((uz9.a) aVar13.f80755q).a(new ChatTransferRecipient.ContactRecipient(((qca.i) it9).f244674a), null)));
                                        oki.h.D2(bVar8);
                                    } else if (it9 instanceof qca.j) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.PeerToPeerTransfer(((qca.j) it9).f244675a), false, null, false, 12);
                                    } else if (it9 instanceof k) {
                                        oki.h.t2(aVar13, bVar8, new PixTransferFlowContract$Step.ApmTransfer(((k) it9).f244676a), false, null, false, 12);
                                    } else if (it9 instanceof qca.l) {
                                        oki.h.t2(aVar13, bVar8, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    } else {
                                        if (!(it9 instanceof qca.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar13.I2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    yca.k result3 = (yca.k) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof yca.i) {
                                        oki.h.t2(aVar8, LazyFlowCoordinator4, PixTransferFlowContract$Step.ScanQr.f80753a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block28, "block");
                    pixTransferInputKeyScreen.H = block28;
                    return pixTransferInputKeyScreen;
                }
                PixTransferFlowContract$Step.ApmTransfer apmTransfer = (PixTransferFlowContract$Step.ApmTransfer) step11;
                PixContact pixContact = apmTransfer.f80743a;
                hrf.f fVar2 = apmTransfer.f80744b;
                TransferMoneyPocket transferMoneyPocket = apmTransfer.f80745c;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_product_pix_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_product_pix_title, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.payments_bank_transfer_amount_reference_default_value, null, null, 14);
                ApmTransferDestinationPix.Companion companion = ApmTransferDestinationPix.INSTANCE;
                PixContact contact = apmTransfer.f80743a;
                companion.getClass();
                Intrinsics.checkNotNullParameter(contact, "contact");
                return aVar8.e1(new c12.p0(new ApmTransferContract$InputData(pixContact, fVar2, textLocalisedClause, textLocalisedClause2, new ApmTransferDestinationPix("PIX", new ApmTransferDestinationPix.Body(t02.e.a(contact), contact.f62143g, contact.f62144h)), transferMoneyPocket, textLocalisedClause3, null, null, 13888)));
            case 20:
                com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a aVar9 = (com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a) obj4;
                yki.l FlowCoordinator6 = (yki.l) obj2;
                LoanSelectionFlowContract$Step step12 = (LoanSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof LoanSelectionFlowContract$Step.SelectLoan)) {
                    throw new NoWhenBranchMatchedException();
                }
                SelectLoanController selectLoanController = new SelectLoanController(new SelectLoanControllerContract$InputData(aVar9.f67884p.f67882a));
                k5e.k block29 = new k5e.k(aVar9, 27);
                Intrinsics.checkNotNullParameter(block29, "block");
                selectLoanController.H = block29;
                return selectLoanController;
            case 21:
                com.revolut.feature.passcode.ui.biometric_passcode_verification.b bVar5 = (com.revolut.feature.passcode.ui.biometric_passcode_verification.b) obj4;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                BiometricPasscodeVerificationFlowContract$Step step13 = (BiometricPasscodeVerificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!Intrinsics.f(step13, BiometricPasscodeVerificationFlowContract$Step.Passcode.f78638a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PasscodeScreenContract$InputData passcodeScreenContract$InputData = bVar5.o.f78637b;
                PasscodeScreenContract$HeaderMode headerMode = passcodeScreenContract$InputData.f78620a;
                PinCodeView.Mode mode = passcodeScreenContract$InputData.f78621b;
                boolean z = passcodeScreenContract$InputData.f78622c;
                PinCodeHinter pinCodeHinter = passcodeScreenContract$InputData.d;
                boolean z3 = passcodeScreenContract$InputData.e;
                boolean z4 = passcodeScreenContract$InputData.f;
                boolean z6 = passcodeScreenContract$InputData.f78624h;
                AnalyticsProduct analyticsProduct = passcodeScreenContract$InputData.i;
                boolean z11 = passcodeScreenContract$InputData.f78625j;
                PasscodeScreenContract$WallpaperBackground wallpaperBackground = passcodeScreenContract$InputData.k;
                PasscodeScreenContract$VerificationMode verificationMode = passcodeScreenContract$InputData.f78626l;
                Boolean bool = passcodeScreenContract$InputData.f78627m;
                Intrinsics.checkNotNullParameter(headerMode, "headerMode");
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(pinCodeHinter, "pinCodeHinter");
                Intrinsics.checkNotNullParameter(wallpaperBackground, "wallpaperBackground");
                Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
                PasscodeScreen passcodeScreen = new PasscodeScreen(new PasscodeScreenContract$InputData(headerMode, mode, z, pinCodeHinter, z3, z4, false, z6, analyticsProduct, z11, wallpaperBackground, verificationMode, bool));
                ke7.v vVar = new ke7.v(bVar5, 1);
                Intrinsics.checkNotNullParameter(vVar, "<set-?>");
                passcodeScreen.H = vVar;
                return passcodeScreen;
            case 22:
                return a(obj2, obj3);
            case 23:
                return b(obj2, obj3);
            case 24:
                return c(obj2, obj3);
            case 25:
                return d(obj2, obj3);
            case 26:
                com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar10 = (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TotalWealthCategoryListContract$Step step14 = (TotalWealthCategoryListContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (Intrinsics.f(step14, TotalWealthCategoryListContract$Step.HiddenAccounts.f89593a)) {
                    return aVar10.e1(new qa7.d(accounts));
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                return e(obj2, obj3);
            case 28:
                return g(obj2, obj3);
            default:
                final com.revolut.feature.rewards.impl.ui.details.flow.b bVar6 = (com.revolut.feature.rewards.impl.ui.details.flow.b) obj4;
                PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = bVar6.o;
                yki.b LazyFlowCoordinator6 = (yki.b) obj2;
                final PerkDetailsFlowContract$Step step15 = (PerkDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator6, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof PerkDetailsFlowContract$Step.Content) {
                    PerkDetailsScreen perkDetailsScreen = new PerkDetailsScreen(((PerkDetailsFlowContract$Step.Content) step15).f84932a);
                    kic.i block30 = new kic.i(bVar6, i6);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    perkDetailsScreen.H = block30;
                    return perkDetailsScreen;
                }
                if (step15 instanceof PerkDetailsFlowContract$Step.OptIn) {
                    PerkDetailsOptInScreen perkDetailsOptInScreen = new PerkDetailsOptInScreen();
                    kic.i block31 = new kic.i(bVar6, i5);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    perkDetailsOptInScreen.H = block31;
                    return perkDetailsOptInScreen;
                }
                if (step15 instanceof PerkDetailsFlowContract$Step.ExpiredPerk) {
                    PerkDetailsExpiredPerkScreen perkDetailsExpiredPerkScreen = new PerkDetailsExpiredPerkScreen();
                    kic.i block32 = new kic.i(bVar6, i3);
                    Intrinsics.checkNotNullParameter(block32, "block");
                    perkDetailsExpiredPerkScreen.H = block32;
                    return perkDetailsExpiredPerkScreen;
                }
                if (step15 instanceof PerkDetailsFlowContract$Step.FooterBottomSheet) {
                    RewardBottomSheetScreen rewardBottomSheetScreen = new RewardBottomSheetScreen(new RewardBottomSheetContract$InputData(((PerkDetailsFlowContract$Step.FooterBottomSheet) step15).f84937a));
                    kic.i block33 = new kic.i(bVar6, i2);
                    Intrinsics.checkNotNullParameter(block33, "block");
                    rewardBottomSheetScreen.H = block33;
                    return rewardBottomSheetScreen;
                }
                if (step15 instanceof PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt) {
                    PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt existingSubscriptionPrompt = (PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt) step15;
                    cancelSubscriptionScreen = new ExistingSubscriptionCheckScreen(new zjc.a(perkDetailsFlowContract$InputData.f84922a, existingSubscriptionPrompt.f84933a, existingSubscriptionPrompt.f84934b, existingSubscriptionPrompt.f84935c));
                    final int i66 = 0;
                    Function1 block34 = new Function1() { // from class: kic.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i66) {
                                case 0:
                                    com.revolut.feature.rewards.impl.ui.details.flow.b bVar7 = bVar6;
                                    yki.i iVar = bVar7.D;
                                    zjc.f result = (zjc.f) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z12 = result instanceof zjc.c;
                                    PerkDetailsFlowContract$Step perkDetailsFlowContract$Step = step15;
                                    if (z12) {
                                        PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt existingSubscriptionPrompt2 = (PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt) perkDetailsFlowContract$Step;
                                        oki.h.w2(iVar, new PerkDetailsFlowContract$Step.CancellationInstructions(existingSubscriptionPrompt2.f84933a, existingSubscriptionPrompt2.f84934b), ModalDestination.Style.POPUP.f98311a);
                                    } else if (result instanceof zjc.b) {
                                        PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt existingSubscriptionPrompt3 = (PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt) perkDetailsFlowContract$Step;
                                        String str11 = existingSubscriptionPrompt3.f84933a;
                                        ActivationNotice activationNotice = existingSubscriptionPrompt3.f84935c;
                                        if (activationNotice != null) {
                                            oki.h.w2(iVar, new PerkDetailsFlowContract$Step.ActivationNotice(str11, activationNotice), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            bVar7.N2("PERK_DETAILS_SUBSCRIPTION_URL_TASK_ID", new m(bVar7, null, 4));
                                        }
                                    } else if (result instanceof zjc.e) {
                                        bVar7.N2("PERK_DETAILS_SUBSCRIPTION_URL_TASK_ID", new k49.f(bVar7, result, null, 8));
                                    } else {
                                        if (!(result instanceof zjc.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar7.S2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    vjc.d result2 = (vjc.d) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof vjc.b) {
                                        com.revolut.feature.rewards.impl.ui.details.flow.b bVar8 = bVar6;
                                        bVar8.N2("PERK_DETAILS_CANCEL_SUBSCRIPTION_TASK_ID", new com.revolut.feature.rewards.impl.ui.details.flow.a(bVar8, step15, null));
                                    } else if (!(result2 instanceof vjc.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block34, "block");
                    cancelSubscriptionScreen.H = block34;
                } else if (step15 instanceof PerkDetailsFlowContract$Step.ActivationNotice) {
                    PerkDetailsFlowContract$Step.ActivationNotice activationNotice = (PerkDetailsFlowContract$Step.ActivationNotice) step15;
                    cancelSubscriptionScreen = new ActivationNoticeScreen(new ActivationNoticeContract$InputData(perkDetailsFlowContract$InputData.f84922a, activationNotice.f84927a, activationNotice.f84928b));
                    kic.i block35 = new kic.i(bVar6, 5);
                    Intrinsics.checkNotNullParameter(block35, "block");
                    cancelSubscriptionScreen.H = block35;
                } else {
                    if (step15 instanceof PerkDetailsFlowContract$Step.CancellationInstructions) {
                        PerkDetailsFlowContract$Step.CancellationInstructions cancellationInstructions = (PerkDetailsFlowContract$Step.CancellationInstructions) step15;
                        CancellationInstructionsScreen cancellationInstructionsScreen = new CancellationInstructionsScreen(new CancellationInstructionsContract$InputData(cancellationInstructions.f84930a, cancellationInstructions.f84931b));
                        kh4.b block36 = new kh4.b(13);
                        Intrinsics.checkNotNullParameter(block36, "block");
                        cancellationInstructionsScreen.H = block36;
                        return cancellationInstructionsScreen;
                    }
                    if (!(step15 instanceof PerkDetailsFlowContract$Step.CancelSubscription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cancelSubscriptionScreen = new CancelSubscriptionScreen(new vjc.a(perkDetailsFlowContract$InputData.f84922a, ((PerkDetailsFlowContract$Step.CancelSubscription) step15).f84929a));
                    Function1 block37 = new Function1() { // from class: kic.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    com.revolut.feature.rewards.impl.ui.details.flow.b bVar7 = bVar6;
                                    yki.i iVar = bVar7.D;
                                    zjc.f result = (zjc.f) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z12 = result instanceof zjc.c;
                                    PerkDetailsFlowContract$Step perkDetailsFlowContract$Step = step15;
                                    if (z12) {
                                        PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt existingSubscriptionPrompt2 = (PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt) perkDetailsFlowContract$Step;
                                        oki.h.w2(iVar, new PerkDetailsFlowContract$Step.CancellationInstructions(existingSubscriptionPrompt2.f84933a, existingSubscriptionPrompt2.f84934b), ModalDestination.Style.POPUP.f98311a);
                                    } else if (result instanceof zjc.b) {
                                        PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt existingSubscriptionPrompt3 = (PerkDetailsFlowContract$Step.ExistingSubscriptionPrompt) perkDetailsFlowContract$Step;
                                        String str11 = existingSubscriptionPrompt3.f84933a;
                                        ActivationNotice activationNotice2 = existingSubscriptionPrompt3.f84935c;
                                        if (activationNotice2 != null) {
                                            oki.h.w2(iVar, new PerkDetailsFlowContract$Step.ActivationNotice(str11, activationNotice2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            bVar7.N2("PERK_DETAILS_SUBSCRIPTION_URL_TASK_ID", new m(bVar7, null, 4));
                                        }
                                    } else if (result instanceof zjc.e) {
                                        bVar7.N2("PERK_DETAILS_SUBSCRIPTION_URL_TASK_ID", new k49.f(bVar7, result, null, 8));
                                    } else {
                                        if (!(result instanceof zjc.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar7.S2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    vjc.d result2 = (vjc.d) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof vjc.b) {
                                        com.revolut.feature.rewards.impl.ui.details.flow.b bVar8 = bVar6;
                                        bVar8.N2("PERK_DETAILS_CANCEL_SUBSCRIPTION_TASK_ID", new com.revolut.feature.rewards.impl.ui.details.flow.a(bVar8, step15, null));
                                    } else if (!(result2 instanceof vjc.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block37, "block");
                    cancelSubscriptionScreen.H = block37;
                }
                return cancelSubscriptionScreen;
        }
    }

    public /* synthetic */ k(k6a.u uVar, k6a.j jVar) {
        this.f180775a = 9;
        this.f180776b = jVar;
    }
}
