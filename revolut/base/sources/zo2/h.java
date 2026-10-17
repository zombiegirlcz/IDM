package zo2;

import a07.i;
import a17.e;
import android.os.Parcelable;
import au6.k2;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputViewController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreen;
import com.revolut.feature.bank_account_switching.impl.ui.link_list.BankAccountSwitchingLinkListScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$ModalStep;
import com.revolut.feature.bank_account_switching.impl.ui.review.ltd_dialog.LtdConfirmationController;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreenContract$InputData;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreenContract$ModalStep;
import com.revolut.feature.contacts.api.navigation.BlockUserBottomSheetInputData;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.CreditCardAutopaySettingsRootFlow;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayRootFlow;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreen;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$DomainState$CancellationModel;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.CreditCardInstalmentRepayFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.select_repayment.CreditCardInstalmentSelectRepaymentScreen;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlow;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_details.flow.CreditCardStatementDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_details.flow.CreditCardStatementDetailsFlowContract$Step;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.SupportedSendRecipientInput;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.CryptoSendFlowContract$Step;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlow;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$AddRecipientOption$Bank;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$AddRecipientOption$Crypto;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$ModalStep;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.flow.InvoiceSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.account.FreelancerAccountScreen;
import com.revolut.feature.freelancer.impl.ui.profile.account.FreelancerAccountScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.details.FreelancerProfileScreen;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.FreelancerEmailFlow;
import com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.FreelancerMerchantTermsScreen;
import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees.FreelancerPaymentProcessingFeesScreen;
import com.revolut.feature.freelancer.impl.ui.profile.tax.flow.FreelancerTaxSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.FreelancerTradingNameFlow;
import com.revolut.feature.freelancer.impl.ui.profile.vat.FreelancerVatScreen;
import com.revolut.feature.freelancer.impl.ui.profile.vat_prompt.VatPromptScreen;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlow;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.FreelancerWebsiteFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$Step;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.taxes_breakdown.ChallengesTaxesBreakdownScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.transfer.ChallengesReviewTransferController;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$ScreenModelApi$ModalStep;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreenContract$ModalStep;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.TrustedWifisListScreenContract$Step;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$ModalStep;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorContract$InputData;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorScreen;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.TopUpLimitsBottomSheetController;
import com.revolut.feature.topup_screen.impl.google_pay.flow.GooglePayFlowContract$Step;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.beneficiary.api.navigation.BankBeneficiaryDetailsDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreenContract$ModalStep;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventContract$Mode;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.TravelItineraryAddEventScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates.TravelItineraryConfirmEditDatesContract$InputData;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates.TravelItineraryConfirmEditDatesController;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlowContract$Step;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$ModalStep;
import e07.f;
import eq5.u;
import eq5.v;
import grl.k9;
import hr6.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ko5.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.t0;
import lo5.j;
import lo5.r;
import oki.h;
import te0.w;
import vkm.j2;
import vq5.k;
import zhm.d0;
import zhm.f0;
import zhm.z0;
import znd.u0;
import zq5.z;
import zr4.e0;
import zr4.s;
import zrd.q;
import zuj.o;
import zuj.t;
import zuj.y;
import zul.m0;
import zz9.b0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f323866b;

    public /* synthetic */ h(Object obj2, int i) {
        this.f323865a = i;
        this.f323866b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) this.f323866b;
        t tVar = aVar.o;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TravelItineraryScreenContract$ModalStep step = (TravelItineraryScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TravelItineraryScreenContract$ModalStep.AddBooking) {
            zuj.a aVar2 = aVar.v;
            o availability = ((zuj.n) ((j2) aVar.z.f22677a).getValue()).d;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(availability, "availability");
            eii.l lVar = null;
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.travel_trip_itinerary_add_booking_title, null, null, 14), null, null, null, false, 30);
            eii.l lVarA = zuj.a.a(R$string.travel_trip_itinerary_add_booking_stays, R$drawable.uikit_icn_24_resort, zuj.m.Stays);
            if (!availability.f325500a || !availability.d) {
                lVarA = null;
            }
            eii.l lVarA2 = zuj.a.a(R$string.travel_trip_itinerary_add_booking_experiences, R$drawable.uikit_icn_24_voucher, zuj.m.Experiences);
            if (!availability.f325501b || !availability.e) {
                lVarA2 = null;
            }
            eii.l lVarA3 = zuj.a.a(R$string.travel_trip_itinerary_add_booking_asft, R$drawable.uikit_icn_24_turbo_transfer, zuj.m.AirportFastTrack);
            if (availability.f325502c && availability.f) {
                lVar = lVarA3;
            }
            eii.l[] elements = {lVarA, lVarA2, lVar, zuj.a.a(R$string.travel_trip_itinerary_add_booking_custom, R$drawable.uikit_icn_24_plus, zuj.m.Custom)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            k9 k9Var = k9.Analytics;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar3, null, listL, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
            y block = new y(aVar, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            rowActionsBottomSheetController.H = block;
            return rowActionsBottomSheetController;
        }
        if (step instanceof TravelItineraryScreenContract$ModalStep.AddEvent) {
            TravelItineraryScreenContract$ModalStep.AddEvent addEvent = (TravelItineraryScreenContract$ModalStep.AddEvent) step;
            TravelItineraryAddEventScreen travelItineraryAddEventScreen = new TravelItineraryAddEventScreen(new TravelItineraryAddEventContract$InputData(tVar.f325508a, addEvent.f101591a, addEvent.f101592b, addEvent.f101593c, TravelItineraryAddEventContract$Mode.Add.f101624a));
            zg8.d block2 = new zg8.d(1, aVar, com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a.class, "onAddEventResult", "onAddEventResult(Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$OutputData;)V", 0, 14);
            Intrinsics.checkNotNullParameter(block2, "block");
            travelItineraryAddEventScreen.H = block2;
            return travelItineraryAddEventScreen;
        }
        if (step instanceof TravelItineraryScreenContract$ModalStep.AddProposal) {
            TravelItineraryScreenContract$ModalStep.AddProposal addProposal = (TravelItineraryScreenContract$ModalStep.AddProposal) step;
            TravelItineraryAddEventScreen travelItineraryAddEventScreen2 = new TravelItineraryAddEventScreen(new TravelItineraryAddEventContract$InputData(tVar.f325508a, addProposal.f101595b, addProposal.f101596c, addProposal.d, new TravelItineraryAddEventContract$Mode.AddProposal(addProposal.f101594a, addProposal.e, addProposal.f, addProposal.f101597g, addProposal.f101598h)));
            zg8.d block3 = new zg8.d(1, aVar, com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a.class, "onAddEventResult", "onAddEventResult(Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$OutputData;)V", 0, 15);
            Intrinsics.checkNotNullParameter(block3, "block");
            travelItineraryAddEventScreen2.H = block3;
            return travelItineraryAddEventScreen2;
        }
        if (step instanceof TravelItineraryScreenContract$ModalStep.EditEvent) {
            TravelItineraryScreenContract$ModalStep.EditEvent editEvent = (TravelItineraryScreenContract$ModalStep.EditEvent) step;
            TravelItineraryAddEventScreen travelItineraryAddEventScreen3 = new TravelItineraryAddEventScreen(new TravelItineraryAddEventContract$InputData(tVar.f325508a, editEvent.f101605b, editEvent.f101606c, editEvent.d, new TravelItineraryAddEventContract$Mode.Edit(editEvent.f101604a, editEvent.e, editEvent.f, editEvent.f101607g, editEvent.f101608h)));
            zg8.d block4 = new zg8.d(1, aVar, com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a.class, "onAddEventResult", "onAddEventResult(Lcom/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$OutputData;)V", 0, 16);
            Intrinsics.checkNotNullParameter(block4, "block");
            travelItineraryAddEventScreen3.H = block4;
            return travelItineraryAddEventScreen3;
        }
        if (step instanceof TravelItineraryScreenContract$ModalStep.EditDates) {
            TravelItineraryScreenContract$ModalStep.EditDates editDates = (TravelItineraryScreenContract$ModalStep.EditDates) step;
            TravelItineraryEditDatesScreen travelItineraryEditDatesScreen = new TravelItineraryEditDatesScreen(new TravelItineraryEditDatesScreenContract$InputData(tVar.f325508a, editDates.f101602a, editDates.f101603b));
            zp5.f block5 = new zp5.f(aVar, step, 13);
            Intrinsics.checkNotNullParameter(block5, "block");
            travelItineraryEditDatesScreen.H = block5;
            return travelItineraryEditDatesScreen;
        }
        if (!(step instanceof TravelItineraryScreenContract$ModalStep.ConfirmEditDates)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelItineraryScreenContract$ModalStep.ConfirmEditDates confirmEditDates = (TravelItineraryScreenContract$ModalStep.ConfirmEditDates) step;
        TravelItineraryConfirmEditDatesController travelItineraryConfirmEditDatesController = new TravelItineraryConfirmEditDatesController(new TravelItineraryConfirmEditDatesContract$InputData(confirmEditDates.f101599a, confirmEditDates.f101600b, confirmEditDates.f101601c, confirmEditDates.d, confirmEditDates.e));
        y block6 = new y(aVar, 2);
        Intrinsics.checkNotNullParameter(block6, "block");
        travelItineraryConfirmEditDatesController.H = block6;
        return travelItineraryConfirmEditDatesController;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.credit.card.impl.ui.statement_details.flow.a aVar = (com.revolut.feature.credit.card.impl.ui.statement_details.flow.a) this.f323866b;
        CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData = aVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        CreditCardStatementDetailsFlowContract$Step step = (CreditCardStatementDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditCardStatementDetailsFlowContract$Step.Statement) {
            CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = new CreditCardStatementDetailsScreen(new CreditCardStatementDetailsScreenContract$InputData(creditCardStatementDetailsFlowContract$InputData.f69725a));
            zp5.f block = new zp5.f(aVar, FlowCoordinator, 16);
            Intrinsics.checkNotNullParameter(block, "block");
            creditCardStatementDetailsScreen.H = block;
            return creditCardStatementDetailsScreen;
        }
        if (Intrinsics.f(step, CreditCardStatementDetailsFlowContract$Step.SetupAutoPay.f69728a)) {
            return new CreditCardSetupAutopayRootFlow(new CreditCardSetupAutopayFlowContract$InputData.Create(creditCardStatementDetailsFlowContract$InputData.f69725a));
        }
        if (Intrinsics.f(step, CreditCardStatementDetailsFlowContract$Step.AutoPaySettings.f69726a)) {
            return new CreditCardAutopaySettingsRootFlow(new CreditCardAutopaySettingsFlowContract$InputData(creditCardStatementDetailsFlowContract$InputData.f69725a, tp4.a.Quit));
        }
        if (Intrinsics.f(step, CreditCardStatementDetailsFlowContract$Step.Repay.f69727a)) {
            return new CreditCardRepayFlow(new CreditCardRepayFlowContract$InputData(null, creditCardStatementDetailsFlowContract$InputData.f69725a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar = (com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) this.f323866b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        final TrustedWifisListScreenContract$Step step = (TrustedWifisListScreenContract$Step) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TrustedWifisListScreenContract$Step.RemoveWifi) {
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_subtitle, null, null, 14), null, null, false, 28);
            m6 m6Var = n6.Companion;
            aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
            k9 k9Var = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
            final int i = 0;
            Function1 block = new Function1() { // from class: zvc.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    dii.g it8 = (dii.g) obj4;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            String str = ((TrustedWifisListScreenContract$Step.RemoveWifi) step).f85700a;
                            if (it8 instanceof dii.e) {
                                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar3 = aVar;
                                aVar3.l2(new k(aVar3, str, null, 1), new yi5.b(26));
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            String str2 = ((TrustedWifisListScreenContract$Step.RemoveLastWifi) step).f85699a;
                            if (it8 instanceof dii.e) {
                                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar4 = aVar;
                                aVar4.l2(new k(aVar4, str2, null, 1), new yi5.b(26));
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
        if (step instanceof TrustedWifisListScreenContract$Step.RemoveLastWifi) {
            aVar.f85707w.getClass();
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_last_item_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_last_item_subtitle, null, null, 14), null, null, false, 28);
            aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_last_item_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_removal_confirmation_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
            k9 k9Var2 = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar3, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: zvc.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    dii.g it8 = (dii.g) obj4;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            String str = ((TrustedWifisListScreenContract$Step.RemoveWifi) step).f85700a;
                            if (it8 instanceof dii.e) {
                                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar32 = aVar;
                                aVar32.l2(new k(aVar32, str, null, 1), new yi5.b(26));
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            String str2 = ((TrustedWifisListScreenContract$Step.RemoveLastWifi) step).f85699a;
                            if (it8 instanceof dii.e) {
                                com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a aVar4 = aVar;
                                aVar4.l2(new k(aVar4, str2, null, 1), new yi5.b(26));
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            actionsBottomSheetController2.H = block2;
            return actionsBottomSheetController2;
        }
        if (!(step instanceof TrustedWifisListScreenContract$Step.UnsecuredNetwork)) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_unsecure_network_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_unsecure_network_dialog_description, null, null, 14), null, null, false, 28);
        m6 m6Var2 = n6.Companion;
        aw0.h hVar3 = new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_unsecure_network_dialog_change_wifi, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_street_mode_trusted_wifi_list_unsecure_network_dialog_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        k9 k9Var3 = k9.SecurityHub;
        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar4, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
        q block3 = new q(aVar, 12);
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetController3.H = block3;
        return actionsBottomSheetController3;
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.freelancer.impl.ui.profile.a aVar = (com.revolut.feature.freelancer.impl.ui.profile.a) this.f323866b;
        yki.l FlowCoordinator = (yki.l) obj2;
        FreelancerProfileFlowContract$Step step = (FreelancerProfileFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FreelancerProfileFlowContract$Step.Profile) {
            FreelancerProfileScreen freelancerProfileScreen = new FreelancerProfileScreen();
            final int i = 0;
            Function1 function1 = new Function1() { // from class: zz6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            f output = (f) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f74034q, output.f121443a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            e output2 = (e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f74034q;
                            output2.getClass();
                            h.t2(aVar3, aVar4, FreelancerProfileFlowContract$Step.Vat.f74028a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            y07.h output3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3.f310159a) {
                                mii.f fVarA = w.a("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, null, 124);
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar5 = aVar;
                                aVar5.X1(fVarA);
                                if (aVar5.I2().equals(FreelancerProfileFlowContract$Step.VatPrompt.f74029a)) {
                                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((k2) aVar5.f74033p.f129237b).d, "STORAGE_KEY_GET_VAT_PROMPT", Boolean.TRUE);
                                    h.D2(aVar5.f74034q);
                                } else {
                                    aVar5.B2();
                                }
                            }
                            return Unit.f186387a;
                        case 3:
                            hr6.h outputData = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar6 = aVar;
                                hr6.f fVar = (hr6.f) outputData;
                                h.t2(aVar6, aVar6.f74034q, new FreelancerProfileFlowContract$Step.TaxProfile(fVar.f154778a, fVar.f154779b), false, null, false, 12);
                            } else if (!Intrinsics.f(outputData, g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            m07.f output4 = (m07.f) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, m07.f.f201092a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar7 = aVar;
                            h.t2(aVar7, aVar7.f74034q, new FreelancerProfileFlowContract$Step.PaymentProcessingFees(0), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            i outputData2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof a07.g;
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar8 = aVar;
                            if (z) {
                                h.t2(aVar8, aVar8.f74034q, ((a07.g) outputData2).f146a, false, null, false, 12);
                            } else {
                                if (!(outputData2 instanceof a07.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar8.f74034q, new FreelancerProfileFlowContract$Step.VatReminder(((a07.h) outputData2).f147a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            freelancerProfileScreen.H = function1;
            return freelancerProfileScreen;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.VatPrompt) {
            VatPromptScreen vatPromptScreen = new VatPromptScreen();
            final int i2 = 1;
            Function1 function12 = new Function1() { // from class: zz6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            f output = (f) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f74034q, output.f121443a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            e output2 = (e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f74034q;
                            output2.getClass();
                            h.t2(aVar3, aVar4, FreelancerProfileFlowContract$Step.Vat.f74028a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            y07.h output3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3.f310159a) {
                                mii.f fVarA = w.a("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, null, 124);
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar5 = aVar;
                                aVar5.X1(fVarA);
                                if (aVar5.I2().equals(FreelancerProfileFlowContract$Step.VatPrompt.f74029a)) {
                                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((k2) aVar5.f74033p.f129237b).d, "STORAGE_KEY_GET_VAT_PROMPT", Boolean.TRUE);
                                    h.D2(aVar5.f74034q);
                                } else {
                                    aVar5.B2();
                                }
                            }
                            return Unit.f186387a;
                        case 3:
                            hr6.h outputData = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar6 = aVar;
                                hr6.f fVar = (hr6.f) outputData;
                                h.t2(aVar6, aVar6.f74034q, new FreelancerProfileFlowContract$Step.TaxProfile(fVar.f154778a, fVar.f154779b), false, null, false, 12);
                            } else if (!Intrinsics.f(outputData, g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            m07.f output4 = (m07.f) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, m07.f.f201092a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar7 = aVar;
                            h.t2(aVar7, aVar7.f74034q, new FreelancerProfileFlowContract$Step.PaymentProcessingFees(0), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            i outputData2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof a07.g;
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar8 = aVar;
                            if (z) {
                                h.t2(aVar8, aVar8.f74034q, ((a07.g) outputData2).f146a, false, null, false, 12);
                            } else {
                                if (!(outputData2 instanceof a07.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar8.f74034q, new FreelancerProfileFlowContract$Step.VatReminder(((a07.h) outputData2).f147a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            vatPromptScreen.H = function12;
            return vatPromptScreen;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.Email) {
            return new FreelancerEmailFlow(new g07.c(((FreelancerProfileFlowContract$Step.Email) step).f74018a));
        }
        if (step instanceof FreelancerProfileFlowContract$Step.Website) {
            FreelancerProfileFlowContract$Step.Website website = (FreelancerProfileFlowContract$Step.Website) step;
            FreelancerWebsiteFlow freelancerWebsiteFlow = new FreelancerWebsiteFlow(new FreelancerWebsiteFlowContract$InputData(website.f74031a, website.f74032b));
            zg8.d block = new zg8.d(1, aVar, com.revolut.feature.freelancer.impl.ui.profile.a.class, "handleWebsiteResult", "handleWebsiteResult(Lcom/revolut/feature/freelancer/impl/ui/profile/website/flow/FreelancerWebsiteFlowContract$OutputData;)V", 0, 19);
            Intrinsics.checkNotNullParameter(block, "block");
            freelancerWebsiteFlow.H = block;
            return freelancerWebsiteFlow;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.TradingName) {
            FreelancerTradingNameFlow freelancerTradingNameFlow = new FreelancerTradingNameFlow();
            zg8.d block2 = new zg8.d(1, aVar, com.revolut.feature.freelancer.impl.ui.profile.a.class, "handleTradingNameResult", "handleTradingNameResult(Lcom/revolut/feature/freelancer/impl/ui/profile/trading_name/flow/FreelancerTradingNameFlowContract$OutputData;)V", 0, 20);
            Intrinsics.checkNotNullParameter(block2, "block");
            freelancerTradingNameFlow.H = block2;
            return freelancerTradingNameFlow;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.Vat) {
            FreelancerVatScreen freelancerVatScreen = new FreelancerVatScreen();
            final int i3 = 2;
            Function1 function13 = new Function1() { // from class: zz6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i3) {
                        case 0:
                            f output = (f) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f74034q, output.f121443a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            e output2 = (e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f74034q;
                            output2.getClass();
                            h.t2(aVar3, aVar4, FreelancerProfileFlowContract$Step.Vat.f74028a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            y07.h output3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3.f310159a) {
                                mii.f fVarA = w.a("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, null, 124);
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar5 = aVar;
                                aVar5.X1(fVarA);
                                if (aVar5.I2().equals(FreelancerProfileFlowContract$Step.VatPrompt.f74029a)) {
                                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((k2) aVar5.f74033p.f129237b).d, "STORAGE_KEY_GET_VAT_PROMPT", Boolean.TRUE);
                                    h.D2(aVar5.f74034q);
                                } else {
                                    aVar5.B2();
                                }
                            }
                            return Unit.f186387a;
                        case 3:
                            hr6.h outputData = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar6 = aVar;
                                hr6.f fVar = (hr6.f) outputData;
                                h.t2(aVar6, aVar6.f74034q, new FreelancerProfileFlowContract$Step.TaxProfile(fVar.f154778a, fVar.f154779b), false, null, false, 12);
                            } else if (!Intrinsics.f(outputData, g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            m07.f output4 = (m07.f) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, m07.f.f201092a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar7 = aVar;
                            h.t2(aVar7, aVar7.f74034q, new FreelancerProfileFlowContract$Step.PaymentProcessingFees(0), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            i outputData2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof a07.g;
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar8 = aVar;
                            if (z) {
                                h.t2(aVar8, aVar8.f74034q, ((a07.g) outputData2).f146a, false, null, false, 12);
                            } else {
                                if (!(outputData2 instanceof a07.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar8.f74034q, new FreelancerProfileFlowContract$Step.VatReminder(((a07.h) outputData2).f147a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            freelancerVatScreen.H = function13;
            return freelancerVatScreen;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.VatReminder) {
            TaxHubReminderScreen taxHubReminderScreen = new TaxHubReminderScreen(new TaxHubReminderScreenContract$InputData(((FreelancerProfileFlowContract$Step.VatReminder) step).f74030a, true));
            final int i5 = 3;
            Function1 block3 = new Function1() { // from class: zz6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i5) {
                        case 0:
                            f output = (f) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f74034q, output.f121443a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            e output2 = (e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f74034q;
                            output2.getClass();
                            h.t2(aVar3, aVar4, FreelancerProfileFlowContract$Step.Vat.f74028a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            y07.h output3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3.f310159a) {
                                mii.f fVarA = w.a("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, null, 124);
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar5 = aVar;
                                aVar5.X1(fVarA);
                                if (aVar5.I2().equals(FreelancerProfileFlowContract$Step.VatPrompt.f74029a)) {
                                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((k2) aVar5.f74033p.f129237b).d, "STORAGE_KEY_GET_VAT_PROMPT", Boolean.TRUE);
                                    h.D2(aVar5.f74034q);
                                } else {
                                    aVar5.B2();
                                }
                            }
                            return Unit.f186387a;
                        case 3:
                            hr6.h outputData = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar6 = aVar;
                                hr6.f fVar = (hr6.f) outputData;
                                h.t2(aVar6, aVar6.f74034q, new FreelancerProfileFlowContract$Step.TaxProfile(fVar.f154778a, fVar.f154779b), false, null, false, 12);
                            } else if (!Intrinsics.f(outputData, g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            m07.f output4 = (m07.f) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, m07.f.f201092a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar7 = aVar;
                            h.t2(aVar7, aVar7.f74034q, new FreelancerProfileFlowContract$Step.PaymentProcessingFees(0), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            i outputData2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof a07.g;
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar8 = aVar;
                            if (z) {
                                h.t2(aVar8, aVar8.f74034q, ((a07.g) outputData2).f146a, false, null, false, 12);
                            } else {
                                if (!(outputData2 instanceof a07.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar8.f74034q, new FreelancerProfileFlowContract$Step.VatReminder(((a07.h) outputData2).f147a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            taxHubReminderScreen.H = block3;
            return taxHubReminderScreen;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.MerchantTerms) {
            FreelancerMerchantTermsScreen freelancerMerchantTermsScreen = new FreelancerMerchantTermsScreen();
            final int i6 = 4;
            Function1 block4 = new Function1() { // from class: zz6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i6) {
                        case 0:
                            f output = (f) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f74034q, output.f121443a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            e output2 = (e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f74034q;
                            output2.getClass();
                            h.t2(aVar3, aVar4, FreelancerProfileFlowContract$Step.Vat.f74028a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            y07.h output3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3.f310159a) {
                                mii.f fVarA = w.a("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, null, 124);
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar5 = aVar;
                                aVar5.X1(fVarA);
                                if (aVar5.I2().equals(FreelancerProfileFlowContract$Step.VatPrompt.f74029a)) {
                                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((k2) aVar5.f74033p.f129237b).d, "STORAGE_KEY_GET_VAT_PROMPT", Boolean.TRUE);
                                    h.D2(aVar5.f74034q);
                                } else {
                                    aVar5.B2();
                                }
                            }
                            return Unit.f186387a;
                        case 3:
                            hr6.h outputData = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar6 = aVar;
                                hr6.f fVar = (hr6.f) outputData;
                                h.t2(aVar6, aVar6.f74034q, new FreelancerProfileFlowContract$Step.TaxProfile(fVar.f154778a, fVar.f154779b), false, null, false, 12);
                            } else if (!Intrinsics.f(outputData, g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            m07.f output4 = (m07.f) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, m07.f.f201092a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar7 = aVar;
                            h.t2(aVar7, aVar7.f74034q, new FreelancerProfileFlowContract$Step.PaymentProcessingFees(0), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            i outputData2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof a07.g;
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar8 = aVar;
                            if (z) {
                                h.t2(aVar8, aVar8.f74034q, ((a07.g) outputData2).f146a, false, null, false, 12);
                            } else {
                                if (!(outputData2 instanceof a07.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar8.f74034q, new FreelancerProfileFlowContract$Step.VatReminder(((a07.h) outputData2).f147a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            freelancerMerchantTermsScreen.H = block4;
            return freelancerMerchantTermsScreen;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.PaymentProcessingFees) {
            return new FreelancerPaymentProcessingFeesScreen(new FreelancerPaymentProcessingFeesContract$InputData(((FreelancerProfileFlowContract$Step.PaymentProcessingFees) step).f74021a));
        }
        if (step instanceof FreelancerProfileFlowContract$Step.Account) {
            FreelancerProfileFlowContract$Step.Account account = (FreelancerProfileFlowContract$Step.Account) step;
            FreelancerProfileSettings freelancerProfileSettings = account.f74016a;
            FreelancerAccountScreen freelancerAccountScreen = new FreelancerAccountScreen(new FreelancerAccountScreenContract$InputData(freelancerProfileSettings != null ? freelancerProfileSettings.f73325b : null, freelancerProfileSettings != null ? freelancerProfileSettings.d : null, freelancerProfileSettings != null ? freelancerProfileSettings.f73327g : null, freelancerProfileSettings != null ? freelancerProfileSettings.f : null, account.f74017b, freelancerProfileSettings != null ? freelancerProfileSettings.f73326c : null, freelancerProfileSettings != null ? freelancerProfileSettings.f73328h : null));
            final int i21 = 5;
            Function1 block5 = new Function1() { // from class: zz6.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i21) {
                        case 0:
                            f output = (f) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar2 = aVar;
                            h.t2(aVar2, aVar2.f74034q, output.f121443a, true, null, false, 12);
                            return Unit.f186387a;
                        case 1:
                            e output2 = (e) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f74034q;
                            output2.getClass();
                            h.t2(aVar3, aVar4, FreelancerProfileFlowContract$Step.Vat.f74028a, true, null, false, 12);
                            return Unit.f186387a;
                        case 2:
                            y07.h output3 = (y07.h) obj4;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (output3.f310159a) {
                                mii.f fVarA = w.a("DIALOG_ID_VAT_UPDATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_vat_editing_confirmation_title, null, null, 14), null, null, null, null, 124);
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar5 = aVar;
                                aVar5.X1(fVarA);
                                if (aVar5.I2().equals(FreelancerProfileFlowContract$Step.VatPrompt.f74029a)) {
                                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((k2) aVar5.f74033p.f129237b).d, "STORAGE_KEY_GET_VAT_PROMPT", Boolean.TRUE);
                                    h.D2(aVar5.f74034q);
                                } else {
                                    aVar5.B2();
                                }
                            }
                            return Unit.f186387a;
                        case 3:
                            hr6.h outputData = (hr6.h) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof hr6.f) {
                                com.revolut.feature.freelancer.impl.ui.profile.a aVar6 = aVar;
                                hr6.f fVar = (hr6.f) outputData;
                                h.t2(aVar6, aVar6.f74034q, new FreelancerProfileFlowContract$Step.TaxProfile(fVar.f154778a, fVar.f154779b), false, null, false, 12);
                            } else if (!Intrinsics.f(outputData, g.f154780a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        case 4:
                            m07.f output4 = (m07.f) obj4;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            if (!Intrinsics.f(output4, m07.f.f201092a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar7 = aVar;
                            h.t2(aVar7, aVar7.f74034q, new FreelancerProfileFlowContract$Step.PaymentProcessingFees(0), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            i outputData2 = (i) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z = outputData2 instanceof a07.g;
                            com.revolut.feature.freelancer.impl.ui.profile.a aVar8 = aVar;
                            if (z) {
                                h.t2(aVar8, aVar8.f74034q, ((a07.g) outputData2).f146a, false, null, false, 12);
                            } else {
                                if (!(outputData2 instanceof a07.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.w2(aVar8.f74034q, new FreelancerProfileFlowContract$Step.VatReminder(((a07.h) outputData2).f147a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            freelancerAccountScreen.H = block5;
            return freelancerAccountScreen;
        }
        if (step instanceof FreelancerProfileFlowContract$Step.Taxes) {
            return new FreelancerTaxSettingsFlow();
        }
        if (step instanceof FreelancerProfileFlowContract$Step.TaxProfile) {
            FreelancerProfileFlowContract$Step.TaxProfile taxProfile = (FreelancerProfileFlowContract$Step.TaxProfile) step;
            return new TaxHubSettingsFlow(new TaxHubSettingsFlowContract$InputData(taxProfile.f74023a, taxProfile.f74024b, false));
        }
        if (step instanceof FreelancerProfileFlowContract$Step.InvoiceSettings) {
            return new InvoiceSettingsFlow();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) this.f323866b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PeerToPeerChatScreenContract$ScreenModelApi$ModalStep step = (PeerToPeerChatScreenContract$ScreenModelApi$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.Reactions) {
            ViewController viewControllerE1 = dVar.e1(new fu9.e(((PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.Reactions) step).f79771a));
            b0 block = new b0(step, dVar);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.ReactionsPicker) {
            ViewController viewControllerE12 = dVar.e1(fu9.c.f138150a);
            b0 block2 = new b0(dVar, step);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE12.H = block2;
            return viewControllerE12;
        }
        if (!(step instanceof PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.UnblockUser)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE13 = dVar.e1(new el3.d(new BlockUserBottomSheetInputData(((PeerToPeerChatScreenContract$ScreenModelApi$ModalStep.UnblockUser) step).f79774a, el3.e.UNBLOCK)));
        q block3 = new q(dVar, 24);
        Intrinsics.checkNotNullParameter(block3, "block");
        viewControllerE13.H = block3;
        return viewControllerE13;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.statements.impl.ui.documents_hub.a aVar = (com.revolut.feature.statements.impl.ui.documents_hub.a) this.f323866b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        DocumentsHubScreenContract$ModalStep step = (DocumentsHubScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof DocumentsHubScreenContract$ModalStep.ProductSelector)) {
            throw new NoWhenBranchMatchedException();
        }
        DocumentsHubScreenContract$ModalStep.ProductSelector productSelector = (DocumentsHubScreenContract$ModalStep.ProductSelector) step;
        DocumentsHubProductSelectorScreen documentsHubProductSelectorScreen = new DocumentsHubProductSelectorScreen(new DocumentsHubProductSelectorContract$InputData(productSelector.f88359a, productSelector.f88360b));
        zg8.d block = new zg8.d(1, aVar, com.revolut.feature.statements.impl.ui.documents_hub.a.class, "onProductSelected", "onProductSelected(Lcom/revolut/feature/statements/impl/ui/documents_hub/product_selector/DocumentsHubProductSelectorContract$OutputData;)V", 0, 21);
        Intrinsics.checkNotNullParameter(block, "block");
        documentsHubProductSelectorScreen.H = block;
        return documentsHubProductSelectorScreen;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Set setI;
        WhoToTransferFilter whoToTransferFilter;
        TextLocalisedClause textLocalisedClause;
        Object obj4;
        Object obj5;
        int i = this.f323865a;
        int i2 = 10;
        final int i3 = 4;
        final int i5 = 0;
        Object obj6 = this.f323866b;
        switch (i) {
            case 0:
                final com.revolut.feature.bank_account_switching.impl.ui.review.b bVar = (com.revolut.feature.bank_account_switching.impl.ui.review.b) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BankAccountSwitchingReviewScreenContract$ModalStep step = (BankAccountSwitchingReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof BankAccountSwitchingReviewScreenContract$ModalStep.TermsAndConditions) {
                    TermsAndConditionsScreen termsAndConditionsScreen = new TermsAndConditionsScreen(new TermsAndConditionsScreenContract$InputData(((BankAccountSwitchingReviewScreenContract$ModalStep.TermsAndConditions) step).f63966a));
                    Function1 block = new Function1() { // from class: zo2.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    gq2.i result = (gq2.i) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof gq2.i) {
                                        com.revolut.feature.bank_account_switching.impl.ui.review.b bVar2 = bVar;
                                        bVar2.l2(new k(bVar2, null, 3), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    cp2.h result2 = (cp2.h) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, cp2.f.f107773a)) {
                                        bVar.I2();
                                    } else if (!Intrinsics.f(result2, cp2.g.f107774a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    termsAndConditionsScreen.H = block;
                    return termsAndConditionsScreen;
                }
                if (step instanceof BankAccountSwitchingReviewScreenContract$ModalStep.LinkList) {
                    return new BankAccountSwitchingLinkListScreen(new BankAccountSwitchingLinkListScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_status_documents_title, null, null, 14), ((BankAccountSwitchingReviewScreenContract$ModalStep.LinkList) step).f63964a));
                }
                if (!(step instanceof BankAccountSwitchingReviewScreenContract$ModalStep.LtdConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                LtdConfirmationController ltdConfirmationController = new LtdConfirmationController();
                final int i6 = 1;
                Function1 block2 = new Function1() { // from class: zo2.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i6) {
                            case 0:
                                gq2.i result = (gq2.i) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof gq2.i) {
                                    com.revolut.feature.bank_account_switching.impl.ui.review.b bVar2 = bVar;
                                    bVar2.l2(new k(bVar2, null, 3), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                cp2.h result2 = (cp2.h) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (Intrinsics.f(result2, cp2.f.f107773a)) {
                                    bVar.I2();
                                } else if (!Intrinsics.f(result2, cp2.g.f107774a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                ltdConfirmationController.H = block2;
                return ltdConfirmationController;
            case 1:
                com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a aVar = (com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a) obj6;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                ReauthenticationWrapperFlowContract$Step step2 = (ReauthenticationWrapperFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, ReauthenticationWrapperFlowContract$Step.Modal.f106691a)) {
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    AuthenticationFlow authenticationFlowI2 = aVar.I2();
                    authenticationFlowI2.l2(new zf5.b(ref$BooleanRef, 2, aVar, authenticationFlowI2));
                    aVar.a(authenticationFlowI2, new zaf.d(ref$BooleanRef, aVar, i3));
                    return authenticationFlowI2;
                }
                if (!Intrinsics.f(step2, ReauthenticationWrapperFlowContract$Step.Regular.f106692a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AuthenticationFlow authenticationFlowI22 = aVar.I2();
                zhf.f block3 = new zhf.f(aVar, 23);
                Intrinsics.checkNotNullParameter(block3, "block");
                authenticationFlowI22.H = block3;
                return authenticationFlowI22;
            case 2:
                final com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.a) obj6;
                yki.l FlowCoordinator = (yki.l) obj2;
                CryptoSendFlowContract$Step step3 = (CryptoSendFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof CryptoSendFlowContract$Step.WalletsList) {
                    CryptoSendFlowContract$Step.WalletsList walletsList = (CryptoSendFlowContract$Step.WalletsList) step3;
                    xi0.b bVar2 = walletsList.f71201a;
                    zp5.h hVar = aVar2.f71206s;
                    SupportedSendRecipientInput supportedSendRecipientInput = walletsList.f71202b;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(supportedSendRecipientInput, "supportedSendRecipientInput");
                    if (supportedSendRecipientInput instanceof SupportedSendRecipientInput.Custom) {
                        setI = ((SupportedSendRecipientInput.Custom) supportedSendRecipientInput).f71114a;
                    } else {
                        if (!Intrinsics.f(supportedSendRecipientInput, SupportedSendRecipientInput.Default.f71115a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        p pVar = p.WALLET;
                        p pVar2 = p.P2P;
                        if (!hVar.f324178a.f145086a) {
                            pVar2 = null;
                        }
                        p pVar3 = p.WALLET;
                        setI = z0.i(pVar, pVar2, null);
                    }
                    CryptoSendWalletsListController cryptoSendWalletsListController = new CryptoSendWalletsListController(new CryptoSendWalletsListControllerContract$InputData(bVar2, setI, r.DEFAULT));
                    zf5.n block4 = new zf5.n(aVar2, walletsList, 29);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    cryptoSendWalletsListController.H = block4;
                    return cryptoSendWalletsListController;
                }
                if (step3 instanceof CryptoSendFlowContract$Step.ChatScreen) {
                    ViewController viewControllerE1 = aVar2.e1(new kz9.b(((CryptoSendFlowContract$Step.ChatScreen) step3).f71193a));
                    Function1 block5 = new Function1() { // from class: zp5.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i5) {
                                case 0:
                                    kz9.e output = (kz9.e) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof kz9.c;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar3 = aVar2;
                                    if (z) {
                                        ChatTransferRecipient chatTransferRecipient = ((kz9.c) output).f191076a;
                                        if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a), false, null, false, 14);
                                        } else if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            f5j.a aVar4 = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
                                            aVar3.C1(new BankBeneficiaryDetailsDestination(aVar4, aVar4.f132329a));
                                        }
                                    } else {
                                        if (!(output instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient chatTransferRecipient2 = ((kz9.d) output).f191077a;
                                        if (chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2;
                                            aVar3.J2(cryptoAddressRecipient.f79721a, cryptoAddressRecipient.f79722b, true);
                                        } else if (chatTransferRecipient2 instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient2;
                                            f5j.a aVar5 = beneficiaryRecipient.f79716a;
                                            TransferMoneyPocket transferMoneyPocket = beneficiaryRecipient.f79717b;
                                            if (transferMoneyPocket == null) {
                                                transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
                                            }
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.BankTransfer(aVar5, transferMoneyPocket), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f result = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, d2k.b.f110872a);
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar6 = aVar2;
                                    if (zF || Intrinsics.f(result, d2k.c.f110873a)) {
                                        aVar6.f71209x.e(false);
                                    } else {
                                        if (!(result instanceof d2k.d) && !(result instanceof d2k.a) && !(result instanceof d2k.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar7 = aVar2;
                                    yki.a aVar8 = aVar7.f71209x;
                                    j result2 = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, lo5.h.f197400a)) {
                                        if (oki.h.E2(aVar8, new u0(13))) {
                                            aVar8.e(false);
                                        } else if (aVar7.o.getF71141b() != null) {
                                            aVar7.C1(zh9.u0.b(new FinishCommand(7788, null, null, 6)));
                                        } else {
                                            aVar7.C2(lo5.q.f197409a);
                                        }
                                    } else {
                                        if (!(result2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        lo5.i iVar = (lo5.i) result2;
                                        oki.h.t2(aVar7, aVar7.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(iVar.f197401a, iVar.f197402b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    k result3 = (k) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z3 = result3 instanceof vq5.h;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar9 = aVar2;
                                    if (z3) {
                                        oki.h.t2(aVar9, aVar9.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((vq5.h) result3).f291322a), false, null, false, 14);
                                    } else if (result3 instanceof vq5.j) {
                                        aVar9.C1(zh9.u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((vq5.j) result3).f291325a), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
                                        aVar9.K2();
                                    } else {
                                        if (!(result3 instanceof vq5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        agf.b bVar3 = aVar9.f71207t;
                                        vq5.i iVar2 = (vq5.i) result3;
                                        bgf.h hVar2 = iVar2.f291323a;
                                        String str = iVar2.f291324b;
                                        ((cgf.b) bVar3).b(hVar2, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)), str);
                                        aVar9.K2();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    lo5.e output2 = (lo5.e) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof lo5.d) {
                                        com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar10 = aVar2;
                                        aVar10.f71209x.e(true);
                                        aVar10.n2(new g(aVar10, null, 0), new whi.b(6));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    eq5.w output3 = (eq5.w) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z4 = output3 instanceof v;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar11 = aVar2;
                                    if (z4) {
                                        v vVar = (v) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(vVar.f128338a, vVar.f128339b), false, null, false, 14);
                                    } else if (output3 instanceof eq5.t) {
                                        eq5.t tVar = (eq5.t) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.Confirmation(new CryptoSendConfirmationControllerContract$InputData(tVar.f128328a, tVar.f128329b, tVar.f128330c, tVar.d, tVar.e, tVar.f, tVar.f128331g, tVar.f128332h)), false, null, false, 14);
                                    } else {
                                        if (!(output3 instanceof u)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((u) output3).f128336a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    x2j.b output4 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar12 = aVar2;
                                    aVar12.l2(new zah.f(aVar12, output4, null, 23), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (step3 instanceof CryptoSendFlowContract$Step.AmountInput) {
                    CryptoSendFlowContract$Step.AmountInput amountInput = (CryptoSendFlowContract$Step.AmountInput) step3;
                    boolean z = amountInput.f71190c;
                    xi0.b bVar3 = amountInput.f71189b;
                    CryptoAddress cryptoAddress = amountInput.f71188a;
                    CryptoSendAmountInputScreen cryptoSendAmountInputScreen = new CryptoSendAmountInputScreen(z ? new CryptoSendAmountInputScreenDestination$InputData.QuickSend(cryptoAddress, bVar3) : new CryptoSendAmountInputScreenDestination$InputData.ExistingBeneficiary(cryptoAddress, bVar3));
                    final int i21 = 5;
                    Function1 block6 = new Function1() { // from class: zp5.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i21) {
                                case 0:
                                    kz9.e output = (kz9.e) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof kz9.c;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar3 = aVar2;
                                    if (z3) {
                                        ChatTransferRecipient chatTransferRecipient = ((kz9.c) output).f191076a;
                                        if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a), false, null, false, 14);
                                        } else if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            f5j.a aVar4 = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
                                            aVar3.C1(new BankBeneficiaryDetailsDestination(aVar4, aVar4.f132329a));
                                        }
                                    } else {
                                        if (!(output instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient chatTransferRecipient2 = ((kz9.d) output).f191077a;
                                        if (chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2;
                                            aVar3.J2(cryptoAddressRecipient.f79721a, cryptoAddressRecipient.f79722b, true);
                                        } else if (chatTransferRecipient2 instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient2;
                                            f5j.a aVar5 = beneficiaryRecipient.f79716a;
                                            TransferMoneyPocket transferMoneyPocket = beneficiaryRecipient.f79717b;
                                            if (transferMoneyPocket == null) {
                                                transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
                                            }
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.BankTransfer(aVar5, transferMoneyPocket), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f result = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, d2k.b.f110872a);
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar6 = aVar2;
                                    if (zF || Intrinsics.f(result, d2k.c.f110873a)) {
                                        aVar6.f71209x.e(false);
                                    } else {
                                        if (!(result instanceof d2k.d) && !(result instanceof d2k.a) && !(result instanceof d2k.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar7 = aVar2;
                                    yki.a aVar8 = aVar7.f71209x;
                                    j result2 = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, lo5.h.f197400a)) {
                                        if (oki.h.E2(aVar8, new u0(13))) {
                                            aVar8.e(false);
                                        } else if (aVar7.o.getF71141b() != null) {
                                            aVar7.C1(zh9.u0.b(new FinishCommand(7788, null, null, 6)));
                                        } else {
                                            aVar7.C2(lo5.q.f197409a);
                                        }
                                    } else {
                                        if (!(result2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        lo5.i iVar = (lo5.i) result2;
                                        oki.h.t2(aVar7, aVar7.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(iVar.f197401a, iVar.f197402b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    k result3 = (k) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z310 = result3 instanceof vq5.h;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar9 = aVar2;
                                    if (z310) {
                                        oki.h.t2(aVar9, aVar9.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((vq5.h) result3).f291322a), false, null, false, 14);
                                    } else if (result3 instanceof vq5.j) {
                                        aVar9.C1(zh9.u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((vq5.j) result3).f291325a), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
                                        aVar9.K2();
                                    } else {
                                        if (!(result3 instanceof vq5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        agf.b bVar32 = aVar9.f71207t;
                                        vq5.i iVar2 = (vq5.i) result3;
                                        bgf.h hVar2 = iVar2.f291323a;
                                        String str = iVar2.f291324b;
                                        ((cgf.b) bVar32).b(hVar2, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)), str);
                                        aVar9.K2();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    lo5.e output2 = (lo5.e) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof lo5.d) {
                                        com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar10 = aVar2;
                                        aVar10.f71209x.e(true);
                                        aVar10.n2(new g(aVar10, null, 0), new whi.b(6));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    eq5.w output3 = (eq5.w) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z4 = output3 instanceof v;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar11 = aVar2;
                                    if (z4) {
                                        v vVar = (v) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(vVar.f128338a, vVar.f128339b), false, null, false, 14);
                                    } else if (output3 instanceof eq5.t) {
                                        eq5.t tVar = (eq5.t) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.Confirmation(new CryptoSendConfirmationControllerContract$InputData(tVar.f128328a, tVar.f128329b, tVar.f128330c, tVar.d, tVar.e, tVar.f, tVar.f128331g, tVar.f128332h)), false, null, false, 14);
                                    } else {
                                        if (!(output3 instanceof u)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((u) output3).f128336a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    x2j.b output4 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar12 = aVar2;
                                    aVar12.l2(new zah.f(aVar12, output4, null, 23), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    cryptoSendAmountInputScreen.H = block6;
                    return cryptoSendAmountInputScreen;
                }
                if (step3 instanceof CryptoSendFlowContract$Step.SubmitWalletDetails) {
                    CryptoSendFlowContract$Step.SubmitWalletDetails submitWalletDetails = (CryptoSendFlowContract$Step.SubmitWalletDetails) step3;
                    CryptoAddBeneficiaryFlow cryptoAddBeneficiaryFlow = new CryptoAddBeneficiaryFlow(new CryptoAddBeneficiaryInput.SubmitRecipientDetails(submitWalletDetails.f71199b, submitWalletDetails.f71198a, null));
                    Function1 block7 = new Function1() { // from class: zp5.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    kz9.e output = (kz9.e) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof kz9.c;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar3 = aVar2;
                                    if (z3) {
                                        ChatTransferRecipient chatTransferRecipient = ((kz9.c) output).f191076a;
                                        if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a), false, null, false, 14);
                                        } else if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            f5j.a aVar4 = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
                                            aVar3.C1(new BankBeneficiaryDetailsDestination(aVar4, aVar4.f132329a));
                                        }
                                    } else {
                                        if (!(output instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient chatTransferRecipient2 = ((kz9.d) output).f191077a;
                                        if (chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2;
                                            aVar3.J2(cryptoAddressRecipient.f79721a, cryptoAddressRecipient.f79722b, true);
                                        } else if (chatTransferRecipient2 instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient2;
                                            f5j.a aVar5 = beneficiaryRecipient.f79716a;
                                            TransferMoneyPocket transferMoneyPocket = beneficiaryRecipient.f79717b;
                                            if (transferMoneyPocket == null) {
                                                transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
                                            }
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.BankTransfer(aVar5, transferMoneyPocket), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f result = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, d2k.b.f110872a);
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar6 = aVar2;
                                    if (zF || Intrinsics.f(result, d2k.c.f110873a)) {
                                        aVar6.f71209x.e(false);
                                    } else {
                                        if (!(result instanceof d2k.d) && !(result instanceof d2k.a) && !(result instanceof d2k.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar7 = aVar2;
                                    yki.a aVar8 = aVar7.f71209x;
                                    j result2 = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, lo5.h.f197400a)) {
                                        if (oki.h.E2(aVar8, new u0(13))) {
                                            aVar8.e(false);
                                        } else if (aVar7.o.getF71141b() != null) {
                                            aVar7.C1(zh9.u0.b(new FinishCommand(7788, null, null, 6)));
                                        } else {
                                            aVar7.C2(lo5.q.f197409a);
                                        }
                                    } else {
                                        if (!(result2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        lo5.i iVar = (lo5.i) result2;
                                        oki.h.t2(aVar7, aVar7.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(iVar.f197401a, iVar.f197402b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    k result3 = (k) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z310 = result3 instanceof vq5.h;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar9 = aVar2;
                                    if (z310) {
                                        oki.h.t2(aVar9, aVar9.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((vq5.h) result3).f291322a), false, null, false, 14);
                                    } else if (result3 instanceof vq5.j) {
                                        aVar9.C1(zh9.u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((vq5.j) result3).f291325a), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
                                        aVar9.K2();
                                    } else {
                                        if (!(result3 instanceof vq5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        agf.b bVar32 = aVar9.f71207t;
                                        vq5.i iVar2 = (vq5.i) result3;
                                        bgf.h hVar2 = iVar2.f291323a;
                                        String str = iVar2.f291324b;
                                        ((cgf.b) bVar32).b(hVar2, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)), str);
                                        aVar9.K2();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    lo5.e output2 = (lo5.e) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof lo5.d) {
                                        com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar10 = aVar2;
                                        aVar10.f71209x.e(true);
                                        aVar10.n2(new g(aVar10, null, 0), new whi.b(6));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    eq5.w output3 = (eq5.w) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z4 = output3 instanceof v;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar11 = aVar2;
                                    if (z4) {
                                        v vVar = (v) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(vVar.f128338a, vVar.f128339b), false, null, false, 14);
                                    } else if (output3 instanceof eq5.t) {
                                        eq5.t tVar = (eq5.t) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.Confirmation(new CryptoSendConfirmationControllerContract$InputData(tVar.f128328a, tVar.f128329b, tVar.f128330c, tVar.d, tVar.e, tVar.f, tVar.f128331g, tVar.f128332h)), false, null, false, 14);
                                    } else {
                                        if (!(output3 instanceof u)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((u) output3).f128336a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    x2j.b output4 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar12 = aVar2;
                                    aVar12.l2(new zah.f(aVar12, output4, null, 23), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    cryptoAddBeneficiaryFlow.H = block7;
                    return cryptoAddBeneficiaryFlow;
                }
                if (step3 instanceof CryptoSendFlowContract$Step.Confirmation) {
                    CryptoSendConfirmationController cryptoSendConfirmationController = new CryptoSendConfirmationController(((CryptoSendFlowContract$Step.Confirmation) step3).f71194a);
                    final int i22 = 3;
                    Function1 block8 = new Function1() { // from class: zp5.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i22) {
                                case 0:
                                    kz9.e output = (kz9.e) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof kz9.c;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar3 = aVar2;
                                    if (z3) {
                                        ChatTransferRecipient chatTransferRecipient = ((kz9.c) output).f191076a;
                                        if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a), false, null, false, 14);
                                        } else if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            f5j.a aVar4 = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
                                            aVar3.C1(new BankBeneficiaryDetailsDestination(aVar4, aVar4.f132329a));
                                        }
                                    } else {
                                        if (!(output instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient chatTransferRecipient2 = ((kz9.d) output).f191077a;
                                        if (chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2;
                                            aVar3.J2(cryptoAddressRecipient.f79721a, cryptoAddressRecipient.f79722b, true);
                                        } else if (chatTransferRecipient2 instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient2;
                                            f5j.a aVar5 = beneficiaryRecipient.f79716a;
                                            TransferMoneyPocket transferMoneyPocket = beneficiaryRecipient.f79717b;
                                            if (transferMoneyPocket == null) {
                                                transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
                                            }
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.BankTransfer(aVar5, transferMoneyPocket), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f result = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, d2k.b.f110872a);
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar6 = aVar2;
                                    if (zF || Intrinsics.f(result, d2k.c.f110873a)) {
                                        aVar6.f71209x.e(false);
                                    } else {
                                        if (!(result instanceof d2k.d) && !(result instanceof d2k.a) && !(result instanceof d2k.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar7 = aVar2;
                                    yki.a aVar8 = aVar7.f71209x;
                                    j result2 = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, lo5.h.f197400a)) {
                                        if (oki.h.E2(aVar8, new u0(13))) {
                                            aVar8.e(false);
                                        } else if (aVar7.o.getF71141b() != null) {
                                            aVar7.C1(zh9.u0.b(new FinishCommand(7788, null, null, 6)));
                                        } else {
                                            aVar7.C2(lo5.q.f197409a);
                                        }
                                    } else {
                                        if (!(result2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        lo5.i iVar = (lo5.i) result2;
                                        oki.h.t2(aVar7, aVar7.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(iVar.f197401a, iVar.f197402b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    k result3 = (k) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z310 = result3 instanceof vq5.h;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar9 = aVar2;
                                    if (z310) {
                                        oki.h.t2(aVar9, aVar9.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((vq5.h) result3).f291322a), false, null, false, 14);
                                    } else if (result3 instanceof vq5.j) {
                                        aVar9.C1(zh9.u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((vq5.j) result3).f291325a), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
                                        aVar9.K2();
                                    } else {
                                        if (!(result3 instanceof vq5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        agf.b bVar32 = aVar9.f71207t;
                                        vq5.i iVar2 = (vq5.i) result3;
                                        bgf.h hVar2 = iVar2.f291323a;
                                        String str = iVar2.f291324b;
                                        ((cgf.b) bVar32).b(hVar2, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)), str);
                                        aVar9.K2();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    lo5.e output2 = (lo5.e) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof lo5.d) {
                                        com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar10 = aVar2;
                                        aVar10.f71209x.e(true);
                                        aVar10.n2(new g(aVar10, null, 0), new whi.b(6));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    eq5.w output3 = (eq5.w) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z4 = output3 instanceof v;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar11 = aVar2;
                                    if (z4) {
                                        v vVar = (v) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(vVar.f128338a, vVar.f128339b), false, null, false, 14);
                                    } else if (output3 instanceof eq5.t) {
                                        eq5.t tVar = (eq5.t) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.Confirmation(new CryptoSendConfirmationControllerContract$InputData(tVar.f128328a, tVar.f128329b, tVar.f128330c, tVar.d, tVar.e, tVar.f, tVar.f128331g, tVar.f128332h)), false, null, false, 14);
                                    } else {
                                        if (!(output3 instanceof u)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((u) output3).f128336a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    x2j.b output4 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar12 = aVar2;
                                    aVar12.l2(new zah.f(aVar12, output4, null, 23), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    cryptoSendConfirmationController.H = block8;
                    return cryptoSendConfirmationController;
                }
                if (step3 instanceof CryptoSendFlowContract$Step.WalletDetails) {
                    CryptoBeneficiaryDetailsScreen cryptoBeneficiaryDetailsScreen = new CryptoBeneficiaryDetailsScreen(new CryptoBeneficiaryDetailsScreenContract$InputData(((CryptoSendFlowContract$Step.WalletDetails) step3).f71200a, lo5.g.DEFAULT));
                    final int i32 = 2;
                    Function1 block9 = new Function1() { // from class: zp5.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i32) {
                                case 0:
                                    kz9.e output = (kz9.e) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof kz9.c;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar3 = aVar2;
                                    if (z3) {
                                        ChatTransferRecipient chatTransferRecipient = ((kz9.c) output).f191076a;
                                        if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a), false, null, false, 14);
                                        } else if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            f5j.a aVar4 = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
                                            aVar3.C1(new BankBeneficiaryDetailsDestination(aVar4, aVar4.f132329a));
                                        }
                                    } else {
                                        if (!(output instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient chatTransferRecipient2 = ((kz9.d) output).f191077a;
                                        if (chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2;
                                            aVar3.J2(cryptoAddressRecipient.f79721a, cryptoAddressRecipient.f79722b, true);
                                        } else if (chatTransferRecipient2 instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient2;
                                            f5j.a aVar5 = beneficiaryRecipient.f79716a;
                                            TransferMoneyPocket transferMoneyPocket = beneficiaryRecipient.f79717b;
                                            if (transferMoneyPocket == null) {
                                                transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
                                            }
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.BankTransfer(aVar5, transferMoneyPocket), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f result = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, d2k.b.f110872a);
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar6 = aVar2;
                                    if (zF || Intrinsics.f(result, d2k.c.f110873a)) {
                                        aVar6.f71209x.e(false);
                                    } else {
                                        if (!(result instanceof d2k.d) && !(result instanceof d2k.a) && !(result instanceof d2k.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar7 = aVar2;
                                    yki.a aVar8 = aVar7.f71209x;
                                    j result2 = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, lo5.h.f197400a)) {
                                        if (oki.h.E2(aVar8, new u0(13))) {
                                            aVar8.e(false);
                                        } else if (aVar7.o.getF71141b() != null) {
                                            aVar7.C1(zh9.u0.b(new FinishCommand(7788, null, null, 6)));
                                        } else {
                                            aVar7.C2(lo5.q.f197409a);
                                        }
                                    } else {
                                        if (!(result2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        lo5.i iVar = (lo5.i) result2;
                                        oki.h.t2(aVar7, aVar7.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(iVar.f197401a, iVar.f197402b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    k result3 = (k) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z310 = result3 instanceof vq5.h;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar9 = aVar2;
                                    if (z310) {
                                        oki.h.t2(aVar9, aVar9.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((vq5.h) result3).f291322a), false, null, false, 14);
                                    } else if (result3 instanceof vq5.j) {
                                        aVar9.C1(zh9.u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((vq5.j) result3).f291325a), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
                                        aVar9.K2();
                                    } else {
                                        if (!(result3 instanceof vq5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        agf.b bVar32 = aVar9.f71207t;
                                        vq5.i iVar2 = (vq5.i) result3;
                                        bgf.h hVar2 = iVar2.f291323a;
                                        String str = iVar2.f291324b;
                                        ((cgf.b) bVar32).b(hVar2, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)), str);
                                        aVar9.K2();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    lo5.e output2 = (lo5.e) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof lo5.d) {
                                        com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar10 = aVar2;
                                        aVar10.f71209x.e(true);
                                        aVar10.n2(new g(aVar10, null, 0), new whi.b(6));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    eq5.w output3 = (eq5.w) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z4 = output3 instanceof v;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar11 = aVar2;
                                    if (z4) {
                                        v vVar = (v) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(vVar.f128338a, vVar.f128339b), false, null, false, 14);
                                    } else if (output3 instanceof eq5.t) {
                                        eq5.t tVar = (eq5.t) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.Confirmation(new CryptoSendConfirmationControllerContract$InputData(tVar.f128328a, tVar.f128329b, tVar.f128330c, tVar.d, tVar.e, tVar.f, tVar.f128331g, tVar.f128332h)), false, null, false, 14);
                                    } else {
                                        if (!(output3 instanceof u)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((u) output3).f128336a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    x2j.b output4 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar12 = aVar2;
                                    aVar12.l2(new zah.f(aVar12, output4, null, 23), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    cryptoBeneficiaryDetailsScreen.H = block9;
                    return cryptoBeneficiaryDetailsScreen;
                }
                if (step3 instanceof CryptoSendFlowContract$Step.CreateCryptoRecipient) {
                    CryptoSendFlowContract$Step.CreateCryptoRecipient createCryptoRecipient = (CryptoSendFlowContract$Step.CreateCryptoRecipient) step3;
                    ViewController viewControllerE12 = aVar2.e1(new lo5.a(new CryptoAddBeneficiaryInput.NewBeneficiary(createCryptoRecipient.f71196a, (wk5.a) null, createCryptoRecipient.f71197b, (Integer) null, 26)));
                    zp5.f block10 = new zp5.f(aVar2, createCryptoRecipient, i5);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    viewControllerE12.H = block10;
                    return viewControllerE12;
                }
                if (Intrinsics.f(step3, CryptoSendFlowContract$Step.CreateBankRecipient.f71195a)) {
                    BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig[] elements = {new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(f5j.l.BENEFICIARY), BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.HideAccountTypeSelector.f99628a, BeneficiaryCreationKompotInputData.CreationConfiguration.AdditionalConfig.HideNavBarMenu.f99630a};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    ViewController viewControllerE13 = aVar2.e1(new com.revolut.retail.feature.beneficiary.api.navigation.a(new BeneficiaryCreationKompotInputData.CreationConfiguration.DefaultCreation(null, null, null, null, null, null, kotlin.collections.d.y0(elements), 63)));
                    final int i33 = 6;
                    Function1 block11 = new Function1() { // from class: zp5.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i33) {
                                case 0:
                                    kz9.e output = (kz9.e) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof kz9.c;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar3 = aVar2;
                                    if (z3) {
                                        ChatTransferRecipient chatTransferRecipient = ((kz9.c) output).f191076a;
                                        if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a), false, null, false, 14);
                                        } else if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            f5j.a aVar4 = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
                                            aVar3.C1(new BankBeneficiaryDetailsDestination(aVar4, aVar4.f132329a));
                                        }
                                    } else {
                                        if (!(output instanceof kz9.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ChatTransferRecipient chatTransferRecipient2 = ((kz9.d) output).f191077a;
                                        if (chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                            ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2;
                                            aVar3.J2(cryptoAddressRecipient.f79721a, cryptoAddressRecipient.f79722b, true);
                                        } else if (chatTransferRecipient2 instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                            ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient2;
                                            f5j.a aVar5 = beneficiaryRecipient.f79716a;
                                            TransferMoneyPocket transferMoneyPocket = beneficiaryRecipient.f79717b;
                                            if (transferMoneyPocket == null) {
                                                transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
                                            }
                                            oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.BankTransfer(aVar5, transferMoneyPocket), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    d2k.f result = (d2k.f) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, d2k.b.f110872a);
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar6 = aVar2;
                                    if (zF || Intrinsics.f(result, d2k.c.f110873a)) {
                                        aVar6.f71209x.e(false);
                                    } else {
                                        if (!(result instanceof d2k.d) && !(result instanceof d2k.a) && !(result instanceof d2k.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar7 = aVar2;
                                    yki.a aVar8 = aVar7.f71209x;
                                    j result2 = (j) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, lo5.h.f197400a)) {
                                        if (oki.h.E2(aVar8, new u0(13))) {
                                            aVar8.e(false);
                                        } else if (aVar7.o.getF71141b() != null) {
                                            aVar7.C1(zh9.u0.b(new FinishCommand(7788, null, null, 6)));
                                        } else {
                                            aVar7.C2(lo5.q.f197409a);
                                        }
                                    } else {
                                        if (!(result2 instanceof lo5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        lo5.i iVar = (lo5.i) result2;
                                        oki.h.t2(aVar7, aVar7.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(iVar.f197401a, iVar.f197402b), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    k result3 = (k) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z310 = result3 instanceof vq5.h;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar9 = aVar2;
                                    if (z310) {
                                        oki.h.t2(aVar9, aVar9.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((vq5.h) result3).f291322a), false, null, false, 14);
                                    } else if (result3 instanceof vq5.j) {
                                        aVar9.C1(zh9.u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((vq5.j) result3).f291325a), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
                                        aVar9.K2();
                                    } else {
                                        if (!(result3 instanceof vq5.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        agf.b bVar32 = aVar9.f71207t;
                                        vq5.i iVar2 = (vq5.i) result3;
                                        bgf.h hVar2 = iVar2.f291323a;
                                        String str = iVar2.f291324b;
                                        ((cgf.b) bVar32).b(hVar2, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)), str);
                                        aVar9.K2();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    lo5.e output2 = (lo5.e) obj7;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (output2 instanceof lo5.d) {
                                        com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar10 = aVar2;
                                        aVar10.f71209x.e(true);
                                        aVar10.n2(new g(aVar10, null, 0), new whi.b(6));
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    eq5.w output3 = (eq5.w) obj7;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z4 = output3 instanceof v;
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar11 = aVar2;
                                    if (z4) {
                                        v vVar = (v) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(vVar.f128338a, vVar.f128339b), false, null, false, 14);
                                    } else if (output3 instanceof eq5.t) {
                                        eq5.t tVar = (eq5.t) output3;
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.Confirmation(new CryptoSendConfirmationControllerContract$InputData(tVar.f128328a, tVar.f128329b, tVar.f128330c, tVar.d, tVar.e, tVar.f, tVar.f128331g, tVar.f128332h)), false, null, false, 14);
                                    } else {
                                        if (!(output3 instanceof u)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((u) output3).f128336a), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    x2j.b output4 = (x2j.b) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar12 = aVar2;
                                    aVar12.l2(new zah.f(aVar12, output4, null, 23), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    viewControllerE13.H = block11;
                    return viewControllerE13;
                }
                if (!(step3 instanceof CryptoSendFlowContract$Step.BankTransfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoSendFlowContract$Step.BankTransfer bankTransfer = (CryptoSendFlowContract$Step.BankTransfer) step3;
                ViewController viewControllerE14 = aVar2.e1(new com.revolut.retail.feature.payments.bank_transfer.api.navigation.a(new BankTransferInputData(bankTransfer.f71191a, (TransferFlowType) TransferFlowType.Crypto.f92256b, (BankTransferInputReference) new BankTransferInputReference.SimpleNote(aVar2.f71208w.b(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.revolutx_bank_transfer_reference_default_value, null, null, 14)).toString()), bankTransfer.f71192b, m1l.a.SCHEDULE_DISABLED, new TransferScheduleData(0L, (jli.c) null, 7), (qua.p) null, (FlowExtras) null, (Map) null, (UltimateDebtor) null, (kq2.g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 65408), aVar2.v, 4));
                final int i43 = 1;
                Function1 block12 = new Function1() { // from class: zp5.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i43) {
                            case 0:
                                kz9.e output = (kz9.e) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z3 = output instanceof kz9.c;
                                com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar3 = aVar2;
                                if (z3) {
                                    ChatTransferRecipient chatTransferRecipient = ((kz9.c) output).f191076a;
                                    if (chatTransferRecipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                        oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient).f79721a.f71059a), false, null, false, 14);
                                    } else if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                        f5j.a aVar4 = ((ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient).f79716a;
                                        aVar3.C1(new BankBeneficiaryDetailsDestination(aVar4, aVar4.f132329a));
                                    }
                                } else {
                                    if (!(output instanceof kz9.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ChatTransferRecipient chatTransferRecipient2 = ((kz9.d) output).f191077a;
                                    if (chatTransferRecipient2 instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                                        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = (ChatTransferRecipient.CryptoAddressRecipient) chatTransferRecipient2;
                                        aVar3.J2(cryptoAddressRecipient.f79721a, cryptoAddressRecipient.f79722b, true);
                                    } else if (chatTransferRecipient2 instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                        ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient2;
                                        f5j.a aVar5 = beneficiaryRecipient.f79716a;
                                        TransferMoneyPocket transferMoneyPocket = beneficiaryRecipient.f79717b;
                                        if (transferMoneyPocket == null) {
                                            transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
                                        }
                                        oki.h.t2(aVar3, aVar3.f71209x, new CryptoSendFlowContract$Step.BankTransfer(aVar5, transferMoneyPocket), true, null, false, 12);
                                    }
                                }
                                return Unit.f186387a;
                            case 1:
                                d2k.f result = (d2k.f) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF = Intrinsics.f(result, d2k.b.f110872a);
                                com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar6 = aVar2;
                                if (zF || Intrinsics.f(result, d2k.c.f110873a)) {
                                    aVar6.f71209x.e(false);
                                } else {
                                    if (!(result instanceof d2k.d) && !(result instanceof d2k.a) && !(result instanceof d2k.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar6.K2();
                                }
                                return Unit.f186387a;
                            case 2:
                                com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar7 = aVar2;
                                yki.a aVar8 = aVar7.f71209x;
                                j result2 = (j) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (Intrinsics.f(result2, lo5.h.f197400a)) {
                                    if (oki.h.E2(aVar8, new u0(13))) {
                                        aVar8.e(false);
                                    } else if (aVar7.o.getF71141b() != null) {
                                        aVar7.C1(zh9.u0.b(new FinishCommand(7788, null, null, 6)));
                                    } else {
                                        aVar7.C2(lo5.q.f197409a);
                                    }
                                } else {
                                    if (!(result2 instanceof lo5.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    lo5.i iVar = (lo5.i) result2;
                                    oki.h.t2(aVar7, aVar7.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(iVar.f197401a, iVar.f197402b), false, null, false, 14);
                                }
                                return Unit.f186387a;
                            case 3:
                                k result3 = (k) obj7;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                boolean z310 = result3 instanceof vq5.h;
                                com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar9 = aVar2;
                                if (z310) {
                                    oki.h.t2(aVar9, aVar9.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((vq5.h) result3).f291322a), false, null, false, 14);
                                } else if (result3 instanceof vq5.j) {
                                    aVar9.C1(zh9.u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((vq5.j) result3).f291325a), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124))));
                                    aVar9.K2();
                                } else {
                                    if (!(result3 instanceof vq5.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    agf.b bVar32 = aVar9.f71207t;
                                    vq5.i iVar2 = (vq5.i) result3;
                                    bgf.h hVar2 = iVar2.f291323a;
                                    String str = iVar2.f291324b;
                                    ((cgf.b) bVar32).b(hVar2, new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)), str);
                                    aVar9.K2();
                                }
                                return Unit.f186387a;
                            case 4:
                                lo5.e output2 = (lo5.e) obj7;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (output2 instanceof lo5.d) {
                                    com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar10 = aVar2;
                                    aVar10.f71209x.e(true);
                                    aVar10.n2(new g(aVar10, null, 0), new whi.b(6));
                                }
                                return Unit.f186387a;
                            case 5:
                                eq5.w output3 = (eq5.w) obj7;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                boolean z4 = output3 instanceof v;
                                com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar11 = aVar2;
                                if (z4) {
                                    v vVar = (v) output3;
                                    oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.SubmitWalletDetails(vVar.f128338a, vVar.f128339b), false, null, false, 14);
                                } else if (output3 instanceof eq5.t) {
                                    eq5.t tVar = (eq5.t) output3;
                                    oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.Confirmation(new CryptoSendConfirmationControllerContract$InputData(tVar.f128328a, tVar.f128329b, tVar.f128330c, tVar.d, tVar.e, tVar.f, tVar.f128331g, tVar.f128332h)), false, null, false, 14);
                                } else {
                                    if (!(output3 instanceof u)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar11, aVar11.f71209x, new CryptoSendFlowContract$Step.WalletDetails(((u) output3).f128336a), false, null, false, 14);
                                }
                                return Unit.f186387a;
                            default:
                                x2j.b output4 = (x2j.b) obj7;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                com.revolut.feature.crypto.withdraw.impl.ui_v3.a aVar12 = aVar2;
                                aVar12.l2(new zah.f(aVar12, output4, null, 23), new yi5.b(26));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block12, "block");
                viewControllerE14.H = block12;
                return viewControllerE14;
            case 3:
                com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar4 = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) obj6;
                ChallengesOverviewContract$InputData challengesOverviewContract$InputData = bVar4.o;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                ChallengesOverviewContract$Step currentStep = (ChallengesOverviewContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(currentStep, "currentStep");
                if (Intrinsics.f(currentStep, ChallengesOverviewContract$Step.List.f77388a)) {
                    ChallengesOverviewListScreen challengesOverviewListScreen = new ChallengesOverviewListScreen(new ChallengesOverviewListScreenContract$InputData(challengesOverviewContract$InputData.f77385a));
                    zg8.d block13 = new zg8.d(1, bVar4, com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b.class, "handleListResult", "handleListResult(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/list/ChallengesOverviewListScreenContract$OutputData;)V", 0, 8);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    challengesOverviewListScreen.H = block13;
                    return challengesOverviewListScreen;
                }
                if (currentStep instanceof ChallengesOverviewContract$Step.Details) {
                    ChallengesOverviewDetailsScreen challengesOverviewDetailsScreen = new ChallengesOverviewDetailsScreen(new ChallengesOverviewDetailsScreenContract$InputData(challengesOverviewContract$InputData.f77385a, ((ChallengesOverviewContract$Step.Details) currentStep).f77386a));
                    zg8.d block14 = new zg8.d(1, bVar4, com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b.class, "handleDetailsResult", "handleDetailsResult(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/details/ChallengesOverviewDetailsScreenContract$OutputData;)V", 0, 9);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    challengesOverviewDetailsScreen.H = block14;
                    return challengesOverviewDetailsScreen;
                }
                if (currentStep instanceof ChallengesOverviewContract$Step.PayForTasks) {
                    return bVar4.f77397q.Z2(((ChallengesOverviewContract$Step.PayForTasks) currentStep).f77389a);
                }
                if (currentStep instanceof ChallengesOverviewContract$Step.ReviewTransfer) {
                    ChallengesOverviewContract$Step.ReviewTransfer reviewTransfer = (ChallengesOverviewContract$Step.ReviewTransfer) currentStep;
                    ChallengesReviewTransferController challengesReviewTransferController = new ChallengesReviewTransferController(new hq8.h(challengesOverviewContract$InputData.f77385a, reviewTransfer.f77390a, reviewTransfer.f77391b, reviewTransfer.f77392c));
                    zg8.d block15 = new zg8.d(1, bVar4, com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b.class, "handleReviewTransferResult", "handleReviewTransferResult(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/transfer/ChallengesReviewTransferControllerContract$Output;)V", 0, 10);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    challengesReviewTransferController.H = block15;
                    return challengesReviewTransferController;
                }
                if (currentStep instanceof ChallengesOverviewContract$Step.TaxesBreakdown) {
                    ChallengesTaxesBreakdownScreen challengesTaxesBreakdownScreen = new ChallengesTaxesBreakdownScreen(new gq8.b(((ChallengesOverviewContract$Step.TaxesBreakdown) currentStep).f77393a));
                    zg8.d block16 = new zg8.d(1, bVar4, com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b.class, "handleTaxesBreakdownResult", "handleTaxesBreakdownResult(Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/screens/taxes_breakdown/ChallengesTaxesBreakdownScreenContract$Output;)V", 0, 11);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    challengesTaxesBreakdownScreen.H = block16;
                    return challengesTaxesBreakdownScreen;
                }
                if (!(currentStep instanceof ChallengesOverviewContract$Step.GmfBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_gmf_tax_header_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_gmf_tax_header_description, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.junior_tasks.api.R$string.junior_challenges_gmf_tax_footer_button_label, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Junior;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                actionsBottomSheetController.l2(new zk7.a(bVar4, currentStep, i2));
                return actionsBottomSheetController;
            case 4:
                com.revolut.feature.credit.card.impl.ui.description.flow.b bVar5 = (com.revolut.feature.credit.card.impl.ui.description.flow.b) obj6;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                CreditCardBeDrivenDescriptionFlowContract$Step step4 = (CreditCardBeDrivenDescriptionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof CreditCardBeDrivenDescriptionFlowContract$Step.Details)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardBeDrivenDescriptionFlowContract$Step.Details details = (CreditCardBeDrivenDescriptionFlowContract$Step.Details) step4;
                bVar5.getClass();
                return new CreditCardDescriptionScreen(new CreditCardDescriptionScreenContract$InputData.Remote(details.f69217a, details.f69218b));
            case 5:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar4 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoSendWalletsListControllerContract$ModalStep step5 = (CryptoSendWalletsListControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof CryptoSendWalletsListControllerContract$ModalStep.Multichain) {
                    return aVar4.e1(new rj5.b(0));
                }
                if (step5 instanceof CryptoSendWalletsListControllerContract$ModalStep.ScanQr) {
                    ViewController viewControllerE15 = aVar4.e1(zi5.c.f322502a);
                    zq5.y block17 = new zq5.y(aVar4, 1);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    viewControllerE15.H = block17;
                    return viewControllerE15;
                }
                if (Intrinsics.f(step5, CryptoSendWalletsListControllerContract$ModalStep.AddRecipientBottomSheet.f71337a)) {
                    aVar4.f71348y.getClass();
                    boolean z3 = false;
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_wallets_list_add_recipient_sheet_title, null, null, 14), null, null, null, false, 30), null, zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_wallets_list_add_recipient_sheet_bank_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_wallets_list_add_recipient_sheet_bank_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_bank, null, null, 6), null, null, z3, null, false, 60), true, z3, (RowDelegate.Model.c) (false ? 1 : 0), (Object) CryptoSendWalletsListControllerContract$AddRecipientOption$Bank.f71332a, 232), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_wallets_list_add_recipient_sheet_crypto_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_wallets_list_add_recipient_sheet_crypto_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_bitcoin, null, null, 6), null, null, z3, false ? 1 : 0, false, 60), true, z3, (RowDelegate.Model.c) (false ? 1 : 0), (Object) CryptoSendWalletsListControllerContract$AddRecipientOption$Crypto.f71333a, 232)), AnalyticsProduct.Shared.Crypto.f, null));
                    zq5.y block18 = new zq5.y(aVar4, 2);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    rowActionsBottomSheetController.H = block18;
                    return rowActionsBottomSheetController;
                }
                if (!Intrinsics.f(step5, CryptoSendWalletsListControllerContract$ModalStep.Transfer.f71340a)) {
                    throw new NoWhenBranchMatchedException();
                }
                k4a.v vVar = aVar4.f71342q;
                Set set = aVar4.o.f71335b;
                ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    int i59 = z.f324408b[((p) it8.next()).ordinal()];
                    if (i59 == 1) {
                        whoToTransferFilter = WhoToTransferFilter.CryptoWallets.f80001a;
                    } else if (i59 == 2) {
                        whoToTransferFilter = WhoToTransferFilter.Revolut.f80005a;
                    } else {
                        if (i59 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        whoToTransferFilter = WhoToTransferFilter.Accounts.f79984a;
                    }
                    arrayList.add(whoToTransferFilter);
                }
                return k4a.v.a(vVar, d0.i1(arrayList), null, g3a.e.CRYPTO_SEND, 6);
            case 6:
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a aVar5 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SalaryRequestsScreenContract$ModalStep step6 = (SalaryRequestsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof SalaryRequestsScreenContract$ModalStep.SalarySwitchStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                SalaryStatusScreen salaryStatusScreen = new SalaryStatusScreen(new SalaryStatusScreenContract$InputData(((SalaryRequestsScreenContract$ModalStep.SalarySwitchStatus) step6).f85295a));
                zg8.d block19 = new zg8.d(1, aVar5, com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a.class, "handleStatusScreenResult", "handleStatusScreenResult(Lcom/revolut/feature/salary_switch/impl/ui/brazil/screen/status/SalaryStatusScreenContract$OutputData;)V", 0, 13);
                Intrinsics.checkNotNullParameter(block19, "block");
                salaryStatusScreen.H = block19;
                return salaryStatusScreen;
            case 7:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return new zqc.i((List) defaultFactory.invoke(new iii.d(14, null, false, false, null)), f0.f322471a, (List) ((zqc.j) obj6).f324459c.getValue());
            case 8:
                final com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar6 = (com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a) obj6;
                yr4.g gVar = aVar6.f69378s;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InstalmentDetailsScreenContract$ModalStep step7 = (InstalmentDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof InstalmentDetailsScreenContract$ModalStep.Dialog) {
                    lt4.d dVar = aVar6.f69380w;
                    CreditCardDialogModel creditCardDialogModel = ((InstalmentDetailsScreenContract$ModalStep.Dialog) step7).f69372a;
                    dVar.getClass();
                    return lt4.d.a(creditCardDialogModel);
                }
                if (!(step7 instanceof InstalmentDetailsScreenContract$ModalStep.OverdueBalanceDialog)) {
                    if (!(step7 instanceof InstalmentDetailsScreenContract$ModalStep.Cancel)) {
                        if (!(step7 instanceof InstalmentDetailsScreenContract$ModalStep.RemainingPlan)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gVar.getClass();
                        return yr4.g.b();
                    }
                    yr4.g gVar2 = aVar6.f69378s;
                    InstalmentDetailsScreenContract$DomainState$CancellationModel instalmentDetailsScreenContract$DomainState$CancellationModel = ((InstalmentDetailsScreenContract$ModalStep.Cancel) step7).f69371a;
                    com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController actionsBottomSheetControllerA = gVar2.a(instalmentDetailsScreenContract$DomainState$CancellationModel.f69365a, instalmentDetailsScreenContract$DomainState$CancellationModel.f69367c, instalmentDetailsScreenContract$DomainState$CancellationModel.f69366b, instalmentDetailsScreenContract$DomainState$CancellationModel.f, instalmentDetailsScreenContract$DomainState$CancellationModel.d, instalmentDetailsScreenContract$DomainState$CancellationModel.e, aVar6.I2().f324565h);
                    final int i66 = 1;
                    Function1 block20 = new Function1() { // from class: zr4.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            zx4.d result = (zx4.d) obj7;
                            switch (i66) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof zx4.b) {
                                        com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar7 = aVar6;
                                        aVar7.C1(new CreditCardTopupDestination(aVar7.I2().f324564g, (KompotDestination) null, 6));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof zx4.b) {
                                        com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar8 = aVar6;
                                        aVar8.l2(new z(aVar8, null, 0), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    actionsBottomSheetControllerA.H = block20;
                    return actionsBottomSheetControllerA;
                }
                dj0.d minimumDue = ((InstalmentDetailsScreenContract$ModalStep.OverdueBalanceDialog) step7).f69373a;
                wi0.b countryCode = aVar6.I2().f324565h;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(minimumDue, "minimumDue");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                wi0.b.Companion.getClass();
                wi0.b bVar6 = wi0.b.f297756l;
                TextLocalisedClause textLocalisedClause2 = Intrinsics.f(countryCode, bVar6) ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_management_dialog_overdue_title_au, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_management_dialog_overdue_title, null, null, 14);
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(minimumDue, "minimumDue");
                if (Intrinsics.f(countryCode, bVar6)) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_management_dialog_overdue_description_au, null, null, 14);
                } else {
                    textLocalisedClause = new TextLocalisedClause(Intrinsics.f(countryCode, wi0.b.W) ? com.revolut.feature.credit.core.R$string.credit_card_instalment_management_dialog_overdue_description_de : Intrinsics.f(countryCode, wi0.b.D2) ? com.revolut.feature.credit.core.R$string.credit_card_instalment_management_dialog_overdue_description_ro : com.revolut.feature.credit.core.R$string.credit_card_instalment_management_dialog_overdue_description, zhm.u.c(sx4.f.b(3, null, null, minimumDue)), null, 12);
                }
                TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
                BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_management_dialog_overdue_action, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
                GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_warning, GlyphImageTint.DANGER.f59929a, null, 4);
                List listC = zhm.u.c(new BottomSheet.Item.CellItem("id_credit_card_instalment_details_dialog_overdue_item_amount", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_details_dialog_overdue_amount, null, null, 14), sx4.f.b(3, null, null, minimumDue), null, false, null, 0, SyslogConstants.LOG_CLOCK));
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController actionsBottomSheetControllerB = BottomSheet.b(textLocalisedClause2, textLocalisedClause3, glyphImage, listC, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), SyslogConstants.LOG_LOCAL2);
                Function1 block21 = new Function1() { // from class: zr4.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        zx4.d result = (zx4.d) obj7;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof zx4.b) {
                                    com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar7 = aVar6;
                                    aVar7.C1(new CreditCardTopupDestination(aVar7.I2().f324564g, (KompotDestination) null, 6));
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof zx4.b) {
                                    com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar8 = aVar6;
                                    aVar8.l2(new z(aVar8, null, 0), new yi5.b(26));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block21, "block");
                actionsBottomSheetControllerB.H = block21;
                return actionsBottomSheetControllerB;
            case 9:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new zr4.w(((e0) obj6).f324558a.f69370c ? s.f324577a : new zr4.o(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)));
            case 10:
                com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar7 = (com.revolut.feature.business.referrals.ui.screens.invite_contacts.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InviteContactsScreenContract$ModalStep step8 = (InviteContactsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof InviteContactsScreenContract$ModalStep.RequestPermission)) {
                    throw new NoWhenBranchMatchedException();
                }
                zs2.c cVar = (zs2.c) aVar7.f64349r;
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(zhm.v.k(new PermissionsControllerContract$Permission("android.permission.READ_CONTACTS", null, cVar.b(), false, 10), new PermissionsControllerContract$Permission("android.permission.WRITE_CONTACTS", null, cVar.b(), false, 10))));
                zs2.n block22 = new zs2.n(aVar7, 1);
                Intrinsics.checkNotNullParameter(block22, "block");
                permissionsController.H = block22;
                return permissionsController;
            case 11:
                final com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a aVar8 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a) obj6;
                CreditCardInstalmentRepayFlowContract$InputData creditCardInstalmentRepayFlowContract$InputData = aVar8.o;
                final yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                CreditCardInstalmentRepayFlowContract$Step step9 = (CreditCardInstalmentRepayFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof CreditCardInstalmentRepayFlowContract$Step.SelectPaymentType) {
                    CreditCardInstalmentSelectRepaymentScreen creditCardInstalmentSelectRepaymentScreen = new CreditCardInstalmentSelectRepaymentScreen();
                    zp5.f block23 = new zp5.f(aVar8, LazyFlowCoordinator3, 3);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    creditCardInstalmentSelectRepaymentScreen.H = block23;
                    return creditCardInstalmentSelectRepaymentScreen;
                }
                if (step9 instanceof CreditCardInstalmentRepayFlowContract$Step.FutureInstalments) {
                    CreditCardRepayFutureInstalmentsFlow creditCardRepayFutureInstalmentsFlow = new CreditCardRepayFutureInstalmentsFlow(new CreditCardRepayFutureInstalmentsFlowContract$InputData(creditCardInstalmentRepayFlowContract$InputData.f69493a, creditCardInstalmentRepayFlowContract$InputData.f69494b, creditCardInstalmentRepayFlowContract$InputData.f69495c));
                    Function1 block24 = new Function1(aVar8, LazyFlowCoordinator3, i5) { // from class: zs4.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f324806a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ yki.b f324807b;

                        {
                            this.f324806a = i5;
                            this.f324807b = LazyFlowCoordinator3;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (this.f324806a) {
                                case 0:
                                    at4.d result = (at4.d) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof at4.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(this.f324807b);
                                    return Unit.f186387a;
                                default:
                                    ws4.c result2 = (ws4.c) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof ws4.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(this.f324807b);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    creditCardRepayFutureInstalmentsFlow.H = block24;
                    obj4 = creditCardRepayFutureInstalmentsFlow;
                } else {
                    if (!(step9 instanceof CreditCardInstalmentRepayFlowContract$Step.CustomAmount)) {
                        if (step9 instanceof CreditCardInstalmentRepayFlowContract$Step.Anticipation) {
                            return new CreditCardInstalmentAnticipationFlow(new CreditCardInstalmentAnticipationFlowContract$InputData(creditCardInstalmentRepayFlowContract$InputData.f69493a, creditCardInstalmentRepayFlowContract$InputData.f69494b, creditCardInstalmentRepayFlowContract$InputData.f69495c));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditCardRepayCustomAmountFlow creditCardRepayCustomAmountFlow = new CreditCardRepayCustomAmountFlow(new CreditCardRepayCustomAmountFlowContract$InputData(creditCardInstalmentRepayFlowContract$InputData.f69493a, creditCardInstalmentRepayFlowContract$InputData.f69494b, creditCardInstalmentRepayFlowContract$InputData.f69495c));
                    final int i74 = 1;
                    Function1 block25 = new Function1(aVar8, LazyFlowCoordinator3, i74) { // from class: zs4.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f324806a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ yki.b f324807b;

                        {
                            this.f324806a = i74;
                            this.f324807b = LazyFlowCoordinator3;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (this.f324806a) {
                                case 0:
                                    at4.d result = (at4.d) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof at4.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(this.f324807b);
                                    return Unit.f186387a;
                                default:
                                    ws4.c result2 = (ws4.c) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof ws4.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(this.f324807b);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    creditCardRepayCustomAmountFlow.H = block25;
                    obj4 = creditCardRepayCustomAmountFlow;
                }
                return obj4;
            case 12:
                com.revolut.biometric_verification.impl.ui.step.nfc.flow.a aVar9 = (com.revolut.biometric_verification.impl.ui.step.nfc.flow.a) obj6;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                BiometricVerificationNfcFlowContract$Step step10 = (BiometricVerificationNfcFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof BiometricVerificationNfcFlowContract$Step.UpdateDetails)) {
                    if (step10 instanceof BiometricVerificationNfcFlowContract$Step.IntroStep) {
                        return aVar9.I2(aVar9.o.f324993a);
                    }
                    if (step10 instanceof BiometricVerificationNfcFlowContract$Step.ConsolidatedNfcReaderStep) {
                        return aVar9.I2(((BiometricVerificationNfcFlowContract$Step.ConsolidatedNfcReaderStep) step10).f50621a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                BiometricVerificationNfcFlowContract$Step.UpdateDetails updateDetails = (BiometricVerificationNfcFlowContract$Step.UpdateDetails) step10;
                BiometricVerificationManualInputViewController biometricVerificationManualInputViewController = new BiometricVerificationManualInputViewController(new BiometricVerificationManualInputContract$InputData(updateDetails.f50623a, updateDetails.f50624b, updateDetails.f50625c, updateDetails.d));
                zt.g block26 = new zt.g(aVar9, i5);
                Intrinsics.checkNotNullParameter(block26, "block");
                biometricVerificationManualInputViewController.H = block26;
                return biometricVerificationManualInputViewController;
            case 13:
                com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar10 = (com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardBoletoDetailsContract$ModalStep step11 = (CreditCardBoletoDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof CreditCardBoletoDetailsContract$ModalStep.ConfirmCancellation)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause title = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_boleto_cancellation_dialog_title, null, null, 14);
                TextLocalisedClause description = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_boleto_cancellation_dialog_description, null, null, 14);
                lw0.b bVar7 = new lw0.b(new ResourceImage(R$drawable.uikit_icn_24_scan_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, new ImageTransformations(null, null, null, null, null, 40, 40, 31), (Clause) null, 182), null);
                aw0.h actionFooter = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_boleto_cancellation_dialog_primary_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_boleto_cancellation_dialog_secondary_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
                lw0.a aVar11 = new lw0.a(title, description, bVar7, null, false, 24);
                k9 k9Var3 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar11, actionFooter, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                q block27 = new q(aVar10, i3);
                Intrinsics.checkNotNullParameter(block27, "block");
                actionsBottomSheetController2.H = block27;
                return actionsBottomSheetController2;
            case 14:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new zt4.i((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), new zt4.f(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_boleto_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_boleto_subtitle, null, null, 14), new ResourceImage(((zt4.a) obj6).f325068b ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            case 15:
                String accountId = (String) obj2;
                so6.a details2 = (so6.a) obj3;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(details2, "details");
                ((zue.a) obj6).f325441b.f("BRAZIL_INBOUND_STORED_METHOD_DETAILS_MEMORY_CACHE_KEY" + accountId, details2);
                return Unit.f186387a;
            case 16:
                return a(obj2, obj3);
            case 17:
                com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar12 = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvestmentProjectionsScreenContract$ModalStep step12 = (InvestmentProjectionsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof InvestmentProjectionsScreenContract$ModalStep.ShowAnnualReturnDisclaimer)) {
                    throw new NoWhenBranchMatchedException();
                }
                zul.a aVar13 = aVar12.f107042w;
                int i92 = ((InvestmentProjectionsScreenContract$ModalStep.ShowAnnualReturnDisclaimer) step12).f107034a;
                aVar13.getClass();
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_invest_order_investment_plan_projections_disclaimer_info_dialog_title, null, null, 14);
                List listK = zhm.v.k(new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_invest_order_investment_plan_projections_disclaimer_info_dialog_description_1, zhm.u.c(Integer.valueOf(i92)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_invest_order_investment_plan_projections_disclaimer_info_dialog_description_2, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
                t0 t0Var = t0.f186434a;
                lw0.a aVar14 = new lw0.a(textLocalisedClause4, new CompositeClause(listK, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var4 = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar14, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((m0) obj6).f325539a;
            case 19:
                return b(obj2, obj3);
            case 20:
                return c(obj2, obj3);
            case 21:
                List exchanges = (List) obj2;
                List tradingSessions = (List) obj3;
                Intrinsics.checkNotNullParameter(exchanges, "exchanges");
                Intrinsics.checkNotNullParameter(tradingSessions, "tradingSessions");
                ((zwk.a) obj6).f325975c.f(zwk.a.a(exchanges), tradingSessions);
                return Unit.f186387a;
            case 22:
                return d(obj2, obj3);
            case 23:
                return e(obj2, obj3);
            case 24:
                return g(obj2, obj3);
            default:
                com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar8 = (com.revolut.feature.topup_screen.impl.google_pay.flow.b) obj6;
                b0f.a aVar15 = bVar8.u;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                GooglePayFlowContract$Step step13 = (GooglePayFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                int i96 = 27;
                if (step13 instanceof GooglePayFlowContract$Step.FeeOmittedDialog) {
                    GooglePayFee.FeeOmitted fee2 = ((GooglePayFlowContract$Step.FeeOmittedDialog) step13).f91031a;
                    ((b0f.b) aVar15).getClass();
                    Intrinsics.checkNotNullParameter(fee2, "fee");
                    lw0.a aVar16 = new lw0.a(new TextClause(fee2.f90518a.f90521a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(fee2.f90518a.f90522b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var5 = k9.Topup;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar16, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                    zp5.f block28 = new zp5.f(bVar8, step13, i96);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    actionsBottomSheetController3.H = block28;
                    return actionsBottomSheetController3;
                }
                if (step13 instanceof GooglePayFlowContract$Step.FeeRequiredDialog) {
                    Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                    GooglePayFee.FeeRequired fee3 = ((GooglePayFlowContract$Step.FeeRequiredDialog) step13).f91033a;
                    ((b0f.b) aVar15).getClass();
                    Intrinsics.checkNotNullParameter(fee3, "fee");
                    lw0.a aVar17 = new lw0.a(new TextClause(fee3.f90519a.f90521a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(fee3.f90519a.f90522b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
                    aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(R.string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.xpay_fee_dialog_confirmation_button_select_another_method, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var6 = k9.Topup;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar17, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
                    actionsBottomSheetController4.k2(new zk7.a(ref$BooleanRef2, bVar8, 22));
                    yrk.e block29 = new yrk.e(ref$BooleanRef2, i96, bVar8, step13);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    actionsBottomSheetController4.H = block29;
                    obj5 = actionsBottomSheetController4;
                } else {
                    if (!(step13 instanceof GooglePayFlowContract$Step.UnverifiedOwnerLimitValueDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                    xye.d dVar2 = bVar8.z;
                    aue.d dVar3 = bVar8.A;
                    TopUpLimitUiModel topUpLimitUiModel = ((GooglePayFlowContract$Step.UnverifiedOwnerLimitValueDialog) step13).f91035a;
                    dVar3.getClass();
                    TopUpLimitsBottomSheetController topUpLimitsBottomSheetController = new TopUpLimitsBottomSheetController(dVar2.b(zhm.u.c(aue.d.a(topUpLimitUiModel)), false));
                    topUpLimitsBottomSheetController.k2(new zk7.a(ref$BooleanRef3, bVar8, LazyFlowCoordinator4));
                    yrk.e block30 = new yrk.e(ref$BooleanRef3, 28, bVar8, LazyFlowCoordinator4);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    topUpLimitsBottomSheetController.H = block30;
                    obj5 = topUpLimitsBottomSheetController;
                }
                return obj5;
        }
    }

    public /* synthetic */ h(zt4.o oVar, zt4.a aVar) {
        this.f323865a = 14;
        this.f323866b = aVar;
    }
}
