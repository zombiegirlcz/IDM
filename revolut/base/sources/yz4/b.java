package yz4;

import a32.o;
import android.os.Parcelable;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import aw0.c7;
import aw0.h;
import aw0.ka;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import c12.d0;
import c12.e0;
import c55.j0;
import c55.z;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.ApmPendingPaymentFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.success.PendingPaymentSuccessScreen;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsContract$ModalStep;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.ApmRecipientSettingsFlow;
import com.revolut.feature.apm.multibanco.impl.ui.home.MultibancoHomeFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaScreen;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreen;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$OtpChannelConfig;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.esign.ESignTask;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.impl.mapper.LoanRepaymentBreakdownExplainerFactory$ExplainerDialog;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownControllerContract$ModalStep;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeContract$ModalStep;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownScreen;
import com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.DonationsAcceptTermsFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.DonationsAcceptTermsFlowContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.TaxHubAssessmentScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.giro.impl.ui.GiroFlowContract$Step;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreen;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreen;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.ChangePlayStoreCountryController;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlow;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlowContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlowContract$Step;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreenContract$ScreenModelApi$ModalStep;
import com.revolut.feature.paynow.impl.flow.PayNowQrFlowContract$InputData;
import com.revolut.feature.paynow.impl.flow.PayNowQrFlowContract$Step;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreen;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.RevPointsPostOnboardingPersonalisationFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreen;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.add_email.AddEmailScreen;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlowContract$Step;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$ModalStep;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.SelectTrackingCarrierScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.TransferInFlowContract$Step;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.broker_selection.BrokerSelectionScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit.IsaTransferReviewSubmitScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit.IsaTransferReviewSubmitScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit.TransferReviewSubmitScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep;
import com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$ModalStep;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlow;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.rpc.Constants;
import eaf.g;
import f12.e;
import grl.k9;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kp0.w0;
import q35.f0;
import u6c.t;
import v20.n;
import v20.q2;
import v20.s0;
import v44.r;
import vkm.j2;
import w6c.i;
import y45.m;
import yki.l;
import yuc.p;
import yy6.f;
import z75.o;
import z8g.q;
import zab.s;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f318032b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f318031a = i;
        this.f318032b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.apm.multibanco.impl.ui.home.a aVar = (com.revolut.feature.apm.multibanco.impl.ui.home.a) this.f318032b;
        l FlowCoordinator = (l) obj2;
        MultibancoHomeFlowContract$Step step = (MultibancoHomeFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, MultibancoHomeFlowContract$Step.Area.f62592a)) {
            return new MultibancoHomeAreaScreen(new MultibancoHomeAreaContract$InputData(aVar.o.f62591a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.a) this.f318032b;
        z zVar = aVar.f70527q;
        y yVar = aVar.v;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        LoanRepaymentBreakdownControllerContract$ModalStep step = (LoanRepaymentBreakdownControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof LoanRepaymentBreakdownControllerContract$ModalStep.Picker)) {
            if (!(step instanceof LoanRepaymentBreakdownControllerContract$ModalStep.ExplainerDialog)) {
                throw new NoWhenBranchMatchedException();
            }
            LoanRepaymentBreakdownExplainerFactory$ExplainerDialog loanRepaymentBreakdownExplainerFactory$ExplainerDialog = ((LoanRepaymentBreakdownControllerContract$ModalStep.ExplainerDialog) step).f70524a;
            if (loanRepaymentBreakdownExplainerFactory$ExplainerDialog instanceof LoanRepaymentBreakdownExplainerFactory$ExplainerDialog.BreakageFee) {
                return zVar.c(((LoanRepaymentBreakdownExplainerFactory$ExplainerDialog.BreakageFee) loanRepaymentBreakdownExplainerFactory$ExplainerDialog).f70311a);
            }
            if (loanRepaymentBreakdownExplainerFactory$ExplainerDialog instanceof LoanRepaymentBreakdownExplainerFactory$ExplainerDialog.EarlyRepaymentAmount) {
                return zVar.e();
            }
            throw new NoWhenBranchMatchedException();
        }
        f0 f0Var = ((LoanRepaymentAccountModelExtension.RepaymentAccountState) zi0.c.I(((o) ((j2) yVar.f22677a).getValue()).d)).f70505b;
        String strA = ((LoanRepaymentAccountModelExtension.RepaymentAccountState) zi0.c.I(((o) ((j2) yVar.f22677a).getValue()).d)).a();
        ViewController viewControllerE1 = aVar.e1(new g1j.a(new BalanceSelector$InputData(f0Var.f241816g, k1j.d.RETAIL, io3.l.CURRENT, null, null, f0Var.f241817h, null, strA, null, 344), new m()));
        z2.a block = new z2.a(aVar, 15);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object c(Object obj2, Object obj3) {
        RevolutPaySummaryScreenContract$InputData oAuthAuthorization;
        com.revolut.feature.revolutpay.impl.ui.flow.summary.b bVar = (com.revolut.feature.revolutpay.impl.ui.flow.summary.b) this.f318032b;
        l FlowCoordinator = (l) obj2;
        SummaryFlowContract$Step step = (SummaryFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SummaryFlowContract$Step.Idle) {
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        if (step instanceof SummaryFlowContract$Step.Authentication) {
            ViewController viewControllerE1 = bVar.e1(qa7.a.f243970a);
            z8c.c block = new z8c.c(bVar, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof SummaryFlowContract$Step.AddEmail) {
            AddEmailScreen addEmailScreen = new AddEmailScreen();
            z1.c block2 = new z1.c(bVar, FlowCoordinator, 22);
            Intrinsics.checkNotNullParameter(block2, "block");
            addEmailScreen.H = block2;
            return addEmailScreen;
        }
        if (!(step instanceof SummaryFlowContract$Step.Summary)) {
            throw new NoWhenBranchMatchedException();
        }
        SummaryFlowContract$Step.Summary summary = (SummaryFlowContract$Step.Summary) step;
        RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = bVar.o;
        if (revolutPayOrderSummaryContract$InputData instanceof RevolutPayOrderSummaryContract$InputData.Standard) {
            RevolutPayOrderSummaryContract$InputData.Standard standard = (RevolutPayOrderSummaryContract$InputData.Standard) revolutPayOrderSummaryContract$InputData;
            oAuthAuthorization = new RevolutPaySummaryScreenContract$InputData.Standard(standard.f84304b, standard.f84303a, standard.f, standard.f84306g, standard.f84307h, w7c.a.SINGLE_ENTRY, standard.f84308j, standard.k, summary.f84491a, standard.f84309l, standard.f84312p, standard.f84311n);
        } else {
            if (!(revolutPayOrderSummaryContract$InputData instanceof RevolutPayOrderSummaryContract$InputData.OAuthAuthorization)) {
                throw new NoWhenBranchMatchedException();
            }
            RevolutPayOrderSummaryContract$InputData.OAuthAuthorization oAuthAuthorization2 = (RevolutPayOrderSummaryContract$InputData.OAuthAuthorization) revolutPayOrderSummaryContract$InputData;
            oAuthAuthorization = new RevolutPaySummaryScreenContract$InputData.OAuthAuthorization(oAuthAuthorization2.f84300a, oAuthAuthorization2.f84301b, oAuthAuthorization2.f84302c, oAuthAuthorization2.d, oAuthAuthorization2.e);
        }
        RevolutPaySummaryScreen revolutPaySummaryScreen = new RevolutPaySummaryScreen(oAuthAuthorization);
        yea.l block3 = new yea.l(1, bVar, com.revolut.feature.revolutpay.impl.ui.flow.summary.b.class, "handleSummaryScreenResult", "handleSummaryScreenResult(Lcom/revolut/feature/revolutpay/impl/ui/summary_screen/RevolutPaySummaryScreenContract$OutputData;)V", 0, 28);
        Intrinsics.checkNotNullParameter(block3, "block");
        revolutPaySummaryScreen.H = block3;
        return revolutPaySummaryScreen;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object d(Object obj2, Object obj3) {
        PeerToPeerAmountScreen peerToPeerAmountScreen = (PeerToPeerAmountScreen) this.f318032b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        PeerToPeerAmountScreen.Companion aVar = PeerToPeerAmountScreen.INSTANCE;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        Object obj4 = data.f51981p;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
        return new zp0.d(editText, ((yof.b) obj4).f315672a, (u80.d) peerToPeerAmountScreen.f102303b0.getValue(), null, null, false, false, 0, false, null, 1944);
    }

    private final Object e(Object obj2, Object obj3) {
        final com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a aVar = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.a) this.f318032b;
        l FlowCoordinator = (l) obj2;
        TransferInFlowContract$Step step = (TransferInFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TransferInFlowContract$Step.BrokerSelection) {
            TransferInFlowContract$Step.BrokerSelection brokerSelection = (TransferInFlowContract$Step.BrokerSelection) step;
            BrokerSelectionScreen brokerSelectionScreen = new BrokerSelectionScreen(new g(brokerSelection.f91581a, u8f.d.IN));
            q block = new q(aVar, brokerSelection, 7);
            Intrinsics.checkNotNullParameter(block, "block");
            brokerSelectionScreen.H = block;
            return brokerSelectionScreen;
        }
        if (step instanceof TransferInFlowContract$Step.AccountInformation) {
            TransferInFlowContract$Step.AccountInformation accountInformation = (TransferInFlowContract$Step.AccountInformation) step;
            AccountInformationScreen accountInformationScreen = new AccountInformationScreen(accountInformation.f91577a, accountInformation.f91578b, u8f.d.IN);
            q block2 = new q(aVar, accountInformation, 9);
            Intrinsics.checkNotNullParameter(block2, "block");
            accountInformationScreen.H = block2;
            return accountInformationScreen;
        }
        if (step instanceof TransferInFlowContract$Step.AssetSelection) {
            TransferInFlowContract$Step.AssetSelection assetSelection = (TransferInFlowContract$Step.AssetSelection) step;
            SelectedAssetsListScreen selectedAssetsListScreen = new SelectedAssetsListScreen(assetSelection.f91579a, assetSelection.f91580b);
            q block3 = new q(aVar, assetSelection, 8);
            Intrinsics.checkNotNullParameter(block3, "block");
            selectedAssetsListScreen.H = block3;
            return selectedAssetsListScreen;
        }
        if (step instanceof TransferInFlowContract$Step.ReviewSubmit) {
            TransferInFlowContract$Step.ReviewSubmit reviewSubmit = (TransferInFlowContract$Step.ReviewSubmit) step;
            TransferReviewSubmitScreen transferReviewSubmitScreen = new TransferReviewSubmitScreen(reviewSubmit.f91585a, reviewSubmit.f91586b, reviewSubmit.f91587c, reviewSubmit.d);
            final int i = 1;
            Function1 block4 = new Function1() { // from class: z9f.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            gaf.f outputData = (gaf.f) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (!Intrinsics.f(outputData, gaf.f.f142162a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                            return Unit.f186387a;
                        default:
                            kaf.c outputData2 = (kaf.c) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (!Intrinsics.f(outputData2, kaf.c.f182483a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block4, "block");
            transferReviewSubmitScreen.H = block4;
            return transferReviewSubmitScreen;
        }
        if (!(step instanceof TransferInFlowContract$Step.IsaReviewSubmit)) {
            throw new NoWhenBranchMatchedException();
        }
        TransferInFlowContract$Step.IsaReviewSubmit isaReviewSubmit = (TransferInFlowContract$Step.IsaReviewSubmit) step;
        TradingAccount tradingAccount = isaReviewSubmit.f91584c;
        if (!(tradingAccount instanceof TradingAccount.TaxAdvantage)) {
            throw new IllegalArgumentException(("Screen can only be opened for Isa account but it was " + tradingAccount.W()).toString());
        }
        IsaTransferReviewSubmitScreen isaTransferReviewSubmitScreen = new IsaTransferReviewSubmitScreen(new IsaTransferReviewSubmitScreenContract$InputData(isaReviewSubmit.f91582a, isaReviewSubmit.f91583b, (TradingAccount.TaxAdvantage) tradingAccount, u8f.b.ASSETS, r0.g(), false));
        final int i2 = 0;
        Function1 block5 = new Function1() { // from class: z9f.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        gaf.f outputData = (gaf.f) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (!Intrinsics.f(outputData, gaf.f.f142162a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.I2();
                        return Unit.f186387a;
                    default:
                        kaf.c outputData2 = (kaf.c) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        if (!Intrinsics.f(outputData2, kaf.c.f182483a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.I2();
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block5, "block");
        isaTransferReviewSubmitScreen.H = block5;
        return isaTransferReviewSubmitScreen;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.esign.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.esign.a) this.f318032b;
        ESignatureFlowContract$InputData eSignatureFlowContract$InputData = aVar.f67650p;
        l FlowCoordinator = (l) obj2;
        ESignatureFlowContract$Step step = (ESignatureFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ESignatureFlowContract$Step.Documents) {
            ESignDocumentsScreen eSignDocumentsScreen = new ESignDocumentsScreen(new ESignDocumentsScreenContract$InputData(eSignatureFlowContract$InputData.f67645a));
            q block = new q(aVar, FlowCoordinator, 10);
            Intrinsics.checkNotNullParameter(block, "block");
            eSignDocumentsScreen.H = block;
            return eSignDocumentsScreen;
        }
        if (!(step instanceof ESignatureFlowContract$Step.ConfirmationCode)) {
            if (step instanceof ESignatureFlowContract$Step.Prompt) {
                return new CreditPromptFlow(new CreditPromptFlowContract$InputData(((ESignatureFlowContract$Step.Prompt) step).f67649a, new CreditPromptAnalyticsConfiguration(R$string.credit_application_e_signature_document_prompt_title, 0, 0, 0, 14), eSignatureFlowContract$InputData.f67645a));
            }
            throw new NoWhenBranchMatchedException();
        }
        CreditApplicationKompotFeatureConfig.ESignature.Config.Otp otp = ((ESignatureFlowContract$Step.ConfirmationCode) step).f67647a;
        ESignTask eSignTask = otp.f66648a;
        String str = otp.f66649b;
        boolean z = otp.f66650c;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = new ESignOtpScreenContract$InputData(ESignOtpScreenContract$InputData.Mode.Synchronous.f65960a, eSignTask, str, z, (ESignOtpScreenContract$OtpChannelConfig) null, (TextLocalisedClause) null, (TextLocalisedClause) null, resourceImage, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 624);
        eSignOtpScreenContract$InputData.k = w0.F(eSignatureFlowContract$InputData.f67645a);
        ESignOtpScreen eSignOtpScreen = new ESignOtpScreen(eSignOtpScreenContract$InputData);
        z2.a block2 = new z2.a(aVar, 28);
        Intrinsics.checkNotNullParameter(block2, "block");
        eSignOtpScreen.H = block2;
        return eSignOtpScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a aVar = (com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) this.f318032b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        IndiaAppRedirectionFlowContract$Step step = (IndiaAppRedirectionFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, IndiaAppRedirectionFlowContract$Step.DownloadIndiaApp.f78442a)) {
            if (!(step instanceof IndiaAppRedirectionFlowContract$Step.ChangeCountry)) {
                throw new NoWhenBranchMatchedException();
            }
            ChangePlayStoreCountryController changePlayStoreCountryController = new ChangePlayStoreCountryController();
            q block = new q(step, aVar, 11);
            Intrinsics.checkNotNullParameter(block, "block");
            changePlayStoreCountryController.H = block;
            return changePlayStoreCountryController;
        }
        aVar.f78443p.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_app_store_revolut_india_app_instruction_prompt_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_revolut_india_app_prompt_play_store_subtitle, null, null, 14);
        CdnImage cdnImage = new CdnImage("retail", "mobile/apps", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_revolut_india_app_prompt_primary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        Object[] objArr = 0 == true ? 1 : 0;
        PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause, textLocalisedClause2, cdnImage, null, null, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, button, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_registration_revolut_india_app_prompt_secondary_button, null, null, 14), (ResourceImage) objArr, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, 65112));
        za9.c block2 = new za9.c(aVar, 0);
        Intrinsics.checkNotNullParameter(block2, "block");
        promptMarketingScreen.H = block2;
        return promptMarketingScreen;
    }

    private final Object i(Object obj2, Object obj3) {
        com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b bVar = (com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b) this.f318032b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        AddShippingTrackingScreenContract$ModalStep step = (AddShippingTrackingScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof AddShippingTrackingScreenContract$ModalStep.SelectCarrier)) {
            throw new NoWhenBranchMatchedException();
        }
        SelectTrackingCarrierScreen selectTrackingCarrierScreen = new SelectTrackingCarrierScreen();
        s block = new s(1, bVar, com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.b.class, "handleSelectTrackingCarrierResult", "handleSelectTrackingCarrierResult(Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/select_tracking_carrier/SelectTrackingCarrierScreenContract$OutputData;)V", 0, 4);
        Intrinsics.checkNotNullParameter(block, "block");
        selectTrackingCarrierScreen.H = block;
        return selectTrackingCarrierScreen;
    }

    private final Object j(Object obj2, Object obj3) {
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a aVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.a) this.f318032b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep step = (TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking.DialogScenario dialogScenario = ((TravelHotelsBookingAmendmentDatesPickerScreenContract$ModalStep.ManageBooking) step).f93800a;
        fcg.d dVar = aVar.f93809p;
        TextLocalisedClause title = dialogScenario.f;
        TextLocalisedClause description = dialogScenario.f93804a;
        TextLocalisedClause primaryButtonText = dialogScenario.f93805b;
        TextLocalisedClause secondaryButtonText = dialogScenario.f93806c;
        LargeActionButton.ButtonStyle.FlatButton secondaryButtonStyle = LargeActionButton.ButtonStyle.o;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        lw0.a aVar2 = new lw0.a(title, description, null, null, false, 28);
        m6 m6Var = n6.Companion;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, new h(false, m6.c(m6Var, primaryButtonText, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, secondaryButtonText, secondaryButtonStyle, null, null, false, null, null, null, 1020), null, null, null, 121), new AnalyticsProduct.Retail(dVar.f133744a), null, null, 24));
        q block = new q(aVar, step, 17);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object k(Object obj2, Object obj3) {
        zah.g gVar = (zah.g) this.f318032b;
        ali.b PagerCoordinator = (ali.b) obj2;
        InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem item = (InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(item, "item");
        oc.f fVar = gVar.f320714p;
        WealthAccountType accountType = item.f95576a.getF85125a().b();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return gVar.e1(fVar.a(accountType).a().a(item.f95576a));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    private final Object l(Object obj2, Object obj3) {
        OneTimeDonationScreen oneTimeDonationScreen = (OneTimeDonationScreen) this.f318032b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = OneTimeDonationScreen.V;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        Object obj4 = data.f51981p;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
        return new zp0.d(editText, (xi0.b) obj4, (u80.d) oneTimeDonationScreen.Q.getValue(), null, new zb6.c(oneTimeDonationScreen), false, false, 0, false, null, 1928);
    }

    private final Object m(Object obj2, Object obj3) {
        com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) this.f318032b;
        bb6.d dVar = aVar.f72095y;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        OneTimeDonationScreenContract$ModalStep step = (OneTimeDonationScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof OneTimeDonationScreenContract$ModalStep.PocketPicker) {
            OneTimeDonationScreenContract$ModalStep.PocketPicker pocketPicker = (OneTimeDonationScreenContract$ModalStep.PocketPicker) step;
            ViewController viewControllerE1 = aVar.e1(new i(new PayWithAnyControllerDescriptor$InputData(t.DONATIONS, pocketPicker.f72086a, pocketPicker.f72087b, null, null, 4080)));
            s block = new s(1, aVar, com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a.class, "handlePocketPickerResult", "handlePocketPickerResult(Lcom/revolut/feature/revolutpay/api/shared/navigation/PayWithAnyControllerDescriptor$OutputData;)V", 0, 8);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            dVar.a(viewControllerE1);
            return viewControllerE1;
        }
        if (!(step instanceof OneTimeDonationScreenContract$ModalStep.AcceptTerms)) {
            if (!(step instanceof OneTimeDonationScreenContract$ModalStep.Breakdown)) {
                throw new NoWhenBranchMatchedException();
            }
            DonationBreakdownScreen donationBreakdownScreen = new DonationBreakdownScreen(((OneTimeDonationScreenContract$ModalStep.Breakdown) step).f72085a);
            dVar.a(donationBreakdownScreen);
            return donationBreakdownScreen;
        }
        DonationsAcceptTermsFlow donationsAcceptTermsFlow = new DonationsAcceptTermsFlow(new DonationsAcceptTermsFlowContract$InputData(((OneTimeDonationScreenContract$ModalStep.AcceptTerms) step).f72084a));
        s block2 = new s(1, aVar, com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a.class, "handleAcceptTermsResult", "handleAcceptTermsResult(Lcom/revolut/feature/donations/impl/ui/kompot/flow/acceptterms/DonationsAcceptTermsFlowContract$Output;)V", 0, 9);
        Intrinsics.checkNotNullParameter(block2, "block");
        donationsAcceptTermsFlow.H = block2;
        return donationsAcceptTermsFlow;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ActionsBottomSheetController actionsBottomSheetController;
        ViewController directDebitReviewScreen;
        int i = this.f318031a;
        final int i2 = 2;
        final int i3 = 0;
        final int i5 = 1;
        AnalyticsContext analyticsContext = null;
        Object obj4 = this.f318032b;
        switch (i) {
            case 0:
                com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c cVar = (com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CreditForbearanceAgreementsContract$Step step = (CreditForbearanceAgreementsContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CreditForbearanceAgreementsContract$Step.Documents) {
                    y44.q qVar = cVar.u;
                    CreditApplicationDocumentsScreenContract$InputData inputData = new CreditApplicationDocumentsScreenContract$InputData(cVar.I2(), analyticsContext, i2);
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    CreditApplicationDocumentsScreen creditApplicationDocumentsScreen = new CreditApplicationDocumentsScreen(inputData);
                    yrk.e block = new yrk.e(cVar, 9, LazyFlowCoordinator, step);
                    Intrinsics.checkNotNullParameter(block, "block");
                    creditApplicationDocumentsScreen.H = block;
                    return creditApplicationDocumentsScreen;
                }
                if (!(step instanceof CreditForbearanceAgreementsContract$Step.DocumentViewer)) {
                    if (!(step instanceof CreditForbearanceAgreementsContract$Step.QuitApplicationDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ActionsBottomSheetController.Companion aVar = ActionsBottomSheetController.INSTANCE;
                    lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.credit_forbearance_leave_dialog_title, null, null, 14), new TextLocalisedClause(R$string.credit_forbearance_leave_dialog_message, null, null, 14), null, null, false, 28);
                    m6 m6Var = n6.Companion;
                    ActionsBottomSheetController actionsBottomSheetControllerB = dy4.a.b(aVar, aVar2, new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.credit_forbearance_leave_dialog_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.credit_common_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), null, 8);
                    dph.c block2 = new dph.c(cVar, LazyFlowCoordinator, 29);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    actionsBottomSheetControllerB.H = block2;
                    return actionsBottomSheetControllerB;
                }
                r rVar = cVar.f69943t;
                CreditForbearanceAgreementsContract$Step.DocumentViewer documentViewer = (CreditForbearanceAgreementsContract$Step.DocumentViewer) step;
                du3.a aVar3 = documentViewer.f69932a;
                CreditApplicationDocumentViewerScreenContract$InputData inputData2 = new CreditApplicationDocumentViewerScreenContract$InputData(new TextClause(aVar3.f117552b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), aVar3.f117551a, new v44.f(aVar3.d, aVar3.e), documentViewer.f69933b, null, null, null, null, 240);
                rVar.getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = new CreditApplicationDocumentViewerScreen(inputData2);
                yrb.i block3 = new yrb.i(cVar, LazyFlowCoordinator, 26);
                Intrinsics.checkNotNullParameter(block3, "block");
                creditApplicationDocumentViewerScreen.H = block3;
                return creditApplicationDocumentViewerScreen;
            case 1:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.a aVar4 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.a) obj4;
                PeerToPeerChatFlowContract$Step step2 = (PeerToPeerChatFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof PeerToPeerChatFlowContract$Step.ChatScreen) {
                    PeerToPeerChatFlowContract$Step.ChatScreen chatScreen = (PeerToPeerChatFlowContract$Step.ChatScreen) step2;
                    PeerToPeerChatOnlyFlow peerToPeerChatOnlyFlow = new PeerToPeerChatOnlyFlow(new PeerToPeerChatOnlyFlowContract$InputData(chatScreen.f79753a, chatScreen.f79754b, chatScreen.f79755c), aVar4.f79760q);
                    yrb.i block4 = new yrb.i(aVar4, step2, 27);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    peerToPeerChatOnlyFlow.H = block4;
                    return peerToPeerChatOnlyFlow;
                }
                if (!(step2 instanceof PeerToPeerChatFlowContract$Step.Transfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                PeerToPeerChatFlowContract$Step.Transfer transfer = (PeerToPeerChatFlowContract$Step.Transfer) step2;
                PeerToPeerTransferFlow peerToPeerTransferFlowA = aVar4.o.a(transfer.f79756a, transfer.f79757b, transfer.f79758c);
                p block5 = new p(aVar4, 22);
                Intrinsics.checkNotNullParameter(block5, "block");
                peerToPeerTransferFlowA.H = block5;
                return peerToPeerTransferFlowA;
            case 2:
                com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a aVar5 = (com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) obj4;
                l FlowCoordinator = (l) obj2;
                RevPointsPostOnboardingPersonalisationFlowContract$Step step3 = (RevPointsPostOnboardingPersonalisationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof RevPointsPostOnboardingPersonalisationFlowContract$Step.Categories) {
                    RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen = new RevPointsPostOnboardingPersonalisationPreferencesScreen(new RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData(zzb.m.CATEGORIES));
                    yrb.i block6 = new yrb.i(aVar5, FlowCoordinator, 28);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    revPointsPostOnboardingPersonalisationPreferencesScreen.H = block6;
                    return revPointsPostOnboardingPersonalisationPreferencesScreen;
                }
                if (!(step3 instanceof RevPointsPostOnboardingPersonalisationFlowContract$Step.Brands)) {
                    throw new NoWhenBranchMatchedException();
                }
                RevPointsPostOnboardingPersonalisationPreferencesScreen revPointsPostOnboardingPersonalisationPreferencesScreen2 = new RevPointsPostOnboardingPersonalisationPreferencesScreen(new RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData(zzb.m.BRANDS));
                p block7 = new p(aVar5, 23);
                Intrinsics.checkNotNullParameter(block7, "block");
                revPointsPostOnboardingPersonalisationPreferencesScreen2.H = block7;
                return revPointsPostOnboardingPersonalisationPreferencesScreen2;
            case 3:
                return ComposerKt.removeCurrentGroup$lambda$0((RememberManager) obj4, ((Integer) obj2).intValue(), obj3);
            case 4:
                z20.q qVar2 = (z20.q) obj4;
                n msg = (n) obj2;
                List entities = (List) obj3;
                Intrinsics.checkNotNullParameter(msg, "msg");
                Intrinsics.checkNotNullParameter(entities, "entities");
                if (msg instanceof v20.c) {
                    qVar2.getClass();
                    z20.q.g((v20.c) msg, entities);
                }
                return msg;
            case 5:
                n message = (n) obj2;
                Map cacheSnapshot = (Map) obj3;
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(cacheSnapshot, "cacheSnapshot");
                ((z20.r) obj4).getClass();
                if (!(message instanceof s0)) {
                    return message;
                }
                s0 s0Var = (s0) message;
                s0 s0Var2 = (s0) cacheSnapshot.get(s0Var.getId());
                if (s0Var2 == null) {
                    return message;
                }
                String strY = s0Var.getTranscriptText();
                if (strY == null) {
                    strY = s0Var2.getTranscriptText();
                }
                String str = strY;
                q2 q2VarX = s0Var.getTranscriptState();
                if (q2VarX == null) {
                    q2VarX = s0Var2.getTranscriptState();
                }
                return s0.r(s0Var2, null, null, null, null, null, null, null, q2VarX, str, 131071);
            case 6:
                final com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.a aVar6 = (com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.a) obj4;
                ApmPendingPaymentFlowContract$Step step4 = (ApmPendingPaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof ApmPendingPaymentFlowContract$Step.Confirmation) {
                    PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = new PendingPaymentConfirmationScreen(aVar6.o);
                    Function1 block8 = new Function1() { // from class: z22.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    aii.q it8 = (aii.q) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar6.C2(f12.c.f131166a);
                                    return Unit.f186387a;
                                default:
                                    a32.o outputData = (a32.o) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, o.a.f1034a);
                                    com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.a aVar7 = aVar6;
                                    if (zF) {
                                        oki.h.t2(aVar7, aVar7.f62359p, ApmPendingPaymentFlowContract$Step.Success.f62358a, false, null, false, 12);
                                    } else if (Intrinsics.f(outputData, o.c.f1036a)) {
                                        aVar7.C2(e.f131168a);
                                    } else {
                                        if (!Intrinsics.f(outputData, o.b.f1035a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar7.C2(f12.d.f131167a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    pendingPaymentConfirmationScreen.H = block8;
                    return pendingPaymentConfirmationScreen;
                }
                if (!(step4 instanceof ApmPendingPaymentFlowContract$Step.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                PendingPaymentSuccessScreen pendingPaymentSuccessScreen = new PendingPaymentSuccessScreen();
                Function1 block9 = new Function1() { // from class: z22.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i3) {
                            case 0:
                                aii.q it8 = (aii.q) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                aVar6.C2(f12.c.f131166a);
                                return Unit.f186387a;
                            default:
                                a32.o outputData = (a32.o) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean zF = Intrinsics.f(outputData, o.a.f1034a);
                                com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.a aVar7 = aVar6;
                                if (zF) {
                                    oki.h.t2(aVar7, aVar7.f62359p, ApmPendingPaymentFlowContract$Step.Success.f62358a, false, null, false, 12);
                                } else if (Intrinsics.f(outputData, o.c.f1036a)) {
                                    aVar7.C2(e.f131168a);
                                } else {
                                    if (!Intrinsics.f(outputData, o.b.f1035a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar7.C2(f12.d.f131167a);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block9, "block");
                pendingPaymentSuccessScreen.H = block9;
                return pendingPaymentSuccessScreen;
            case 7:
                com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f fVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) obj4;
                b37.c cVar2 = fVar.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TaxHubAssessmentScreenContract$ModalStep step5 = (TaxHubAssessmentScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof TaxHubAssessmentScreenContract$ModalStep.CompleteTaxReturn) {
                    cVar2.getClass();
                    lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_tax_return_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_tax_return_description, null, null, 14), null, null, false, 28);
                    h hVar = new h(false, new n6(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_tax_return_action_complete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_tax_return_action_not_yet, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var = k9.Freelancer;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar7, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    z1.c block10 = new z1.c(fVar, (TaxHubAssessmentScreenContract$ModalStep.CompleteTaxReturn) step5, 9);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    actionsBottomSheetController2.H = block10;
                    return actionsBottomSheetController2;
                }
                if (!(step5 instanceof TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2.getClass();
                lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_completion_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_completion_description, u.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_completion_action_confirm, null, null, 14)), null, 12), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_checklist_confirmation_completion_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var2 = k9.Freelancer;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar8, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                z1.c block11 = new z1.c(fVar, (TaxHubAssessmentScreenContract$ModalStep.MarkEventAsCompleted) step5, 10);
                Intrinsics.checkNotNullParameter(block11, "block");
                actionsBottomSheetController3.H = block11;
                return actionsBottomSheetController3;
            case 8:
                final com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar9 = (com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ApmRecipientDetailsContract$ModalStep step6 = (ApmRecipientDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof ApmRecipientDetailsContract$ModalStep.BlockRecipient) {
                    ApmRecipientSettingsFlow apmRecipientSettingsFlow = new ApmRecipientSettingsFlow(((ApmRecipientDetailsContract$ModalStep.BlockRecipient) step6).f62398a);
                    Function1 block12 = new Function1() { // from class: z32.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    dii.g outputData = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.f) {
                                        com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar10 = aVar9;
                                        aVar10.l2(new yzb.c(aVar10, null, 1), new yi5.b(26));
                                    }
                                    break;
                                default:
                                    e0 outputData2 = (e0) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof d0) {
                                        com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar11 = aVar9;
                                        aVar11.H2(aVar11.f62402q, new z2.a(outputData2, 8));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    apmRecipientSettingsFlow.H = block12;
                    return apmRecipientSettingsFlow;
                }
                if (!Intrinsics.f(step6, ApmRecipientDetailsContract$ModalStep.DeleteRecipient.f62400a)) {
                    if (Intrinsics.f(step6, ApmRecipientDetailsContract$ModalStep.ChangeBackgroundDialog.f62399a)) {
                        return aVar9.f62401p.Z2(aVar9.I2().getF62134a().getF62112a());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar10 = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_delete_confirm_title, u.c(aVar9.I2().getDisplayName()), null, 12), null, null, null, false, 30);
                aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                k9 k9Var3 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar10, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                Function1 block13 = new Function1() { // from class: z32.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i3) {
                            case 0:
                                dii.g outputData = (dii.g) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof dii.f) {
                                    com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar102 = aVar9;
                                    aVar102.l2(new yzb.c(aVar102, null, 1), new yi5.b(26));
                                }
                                break;
                            default:
                                e0 outputData2 = (e0) obj5;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                if (outputData2 instanceof d0) {
                                    com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar11 = aVar9;
                                    aVar11.H2(aVar11.f62402q, new z2.a(outputData2, 8));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block13, "block");
                actionsBottomSheetController4.H = block13;
                return actionsBottomSheetController4;
            case 9:
                z34.a params = (z34.a) obj2;
                ev3.a content = (ev3.a) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(content, "content");
                ((z34.b) obj4).f319160c.f("personal_details_tax_number_" + params.f319157a.f137835a, content);
                return Unit.f186387a;
            case 10:
                com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.a aVar11 = (com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.a) obj4;
                TaxHubSettingsFlowContract$Step step7 = (TaxHubSettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof TaxHubSettingsFlowContract$Step.UpdateProfile)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxHubSettingsFlowContract$InputData taxHubSettingsFlowContract$InputData = aVar11.o;
                TaxHubCreateProfileScreen taxHubCreateProfileScreen = new TaxHubCreateProfileScreen(new TaxHubCreateProfileScreenContract$InputData(false, taxHubSettingsFlowContract$InputData.f74362c, taxHubSettingsFlowContract$InputData.f74360a, taxHubSettingsFlowContract$InputData.f74361b));
                z2.a block14 = new z2.a(aVar11, 10);
                Intrinsics.checkNotNullParameter(block14, "block");
                taxHubCreateProfileScreen.H = block14;
                return taxHubCreateProfileScreen;
            case 11:
                com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a aVar12 = (com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                OnboardingContactSyncPermissionScreenContract$ScreenModelApi$ModalStep it8 = (OnboardingContactSyncPermissionScreenContract$ScreenModelApi$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, OnboardingContactSyncPermissionScreenContract$ScreenModelApi$ModalStep.ContactPermissionsFlow.f80114a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
                PermissionsFlow permissionsFlow = new PermissionsFlow(r0.k(new Pair("android.permission.READ_CONTACTS", none), new Pair("android.permission.WRITE_CONTACTS", none)));
                z2.a aVar13 = new z2.a(aVar12, 11);
                Intrinsics.checkNotNullParameter(aVar13, "<set-?>");
                permissionsFlow.J = aVar13;
                return permissionsFlow;
            case 12:
                com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar14 = (com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a) obj4;
                m35.i iVar = aVar14.u;
                m35.f fVar2 = aVar14.f70354s;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LoanAccountDetailsScreenContract$ModalStep step8 = (LoanAccountDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof LoanAccountDetailsScreenContract$ModalStep.RepaymentAmountExplainer) {
                    String str2 = ((LoanAccountDetailsScreenContract$ModalStep.RepaymentAmountExplainer) step8).f70348a;
                    switch (str2.hashCode()) {
                        case -2139344673:
                            if (str2.equals("ID_APR")) {
                                Loan loan = (Loan) aVar14.I2().getContent();
                                wi0.b bVar = loan != null ? loan.f70112h : null;
                                ((c55.n) fVar2).getClass();
                                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_details_apr_title, null, null, 14);
                                wi0.b.Companion.getClass();
                                lw0.a aVar15 = new lw0.a(textLocalisedClause, Intrinsics.f(bVar, wi0.b.p0) ? new TextLocalisedClause(R$string.loan_management_details_apr_subtitle_uk, null, null, 14) : new TextLocalisedClause(R$string.loan_management_details_apr_subtitle, null, null, 14), null, null, false, 28);
                                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var4 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar15, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                                break;
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case -1894624141:
                            if (str2.equals("ID_TAEG")) {
                                ((c55.n) fVar2).getClass();
                                lw0.a aVar16 = new lw0.a(new TextLocalisedClause(R$string.loan_management_details_taeg_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_details_taeg_subtitle, null, null, 14), null, null, false, 28);
                                aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var5 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                                return new ActionsBottomSheetController(new dii.a(aVar16, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case -1104552539:
                            if (str2.equals("ID_RESCHEDULED_PRINCIPAL")) {
                                ((c55.n) fVar2).getClass();
                                lw0.a aVar17 = new lw0.a(new TextLocalisedClause(R$string.loan_management_details_rescheduled_amount_dialog_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_details_rescheduled_amount_dialog_description, null, null, 14), null, null, false, 28);
                                aw0.e eVar4 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var6 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                                return new ActionsBottomSheetController(new dii.a(aVar17, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case -676560955:
                            if (str2.equals("ID_LEFT_TO_REPAY")) {
                                Loan loan2 = (Loan) aVar14.I2().getContent();
                                wi0.b bVar2 = loan2 != null ? loan2.f70112h : null;
                                ((c55.n) fVar2).getClass();
                                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_loan_details_dialog_left_to_repay_title, null, null, 14);
                                wi0.b.Companion.getClass();
                                lw0.a aVar18 = new lw0.a(textLocalisedClause2, Intrinsics.f(bVar2, wi0.b.p0) ? new TextLocalisedClause(R$string.loan_management_details_total_balance_dialog_description_uk, null, null, 14) : new TextLocalisedClause(R$string.loan_management_details_total_balance_dialog_description, null, null, 14), null, null, false, 28);
                                aw0.e eVar5 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var7 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar18, eVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var7, "value", k9Var7), null, null, 24));
                                break;
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case 33963146:
                            if (str2.equals("ID_ACCRUED_INTEREST")) {
                                Loan loan3 = (Loan) aVar14.I2().getContent();
                                wi0.b bVar3 = loan3 != null ? loan3.f70112h : null;
                                ((c55.n) fVar2).getClass();
                                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.loan_management_details_accrued_interest_dialog_title, null, null, 14);
                                wi0.b.Companion.getClass();
                                lw0.a aVar19 = new lw0.a(textLocalisedClause3, Intrinsics.f(bVar3, wi0.b.p0) ? new TextLocalisedClause(R$string.loan_management_details_accrued_interest_dialog_description_uk, null, null, 14) : new TextLocalisedClause(R$string.loan_management_details_accrued_interest_dialog_description, null, null, 14), null, null, false, 28);
                                aw0.e eVar6 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var8 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator8 = AnalyticsProduct.Retail.CREATOR;
                                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar19, eVar6, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var8, "value", k9Var8), null, null, 24));
                                break;
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case 1574514321:
                            if (str2.equals("ID_LEFT_TO_REPAY_WITH_STAMP_DUTY")) {
                                ((c55.n) fVar2).getClass();
                                lw0.a aVar20 = new lw0.a(new TextLocalisedClause(R$string.credit_loan_details_dialog_left_to_repay_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_details_total_balance_dialog_with_stamp_duty_description, null, null, 14), null, null, false, 28);
                                aw0.e eVar7 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var9 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator9 = AnalyticsProduct.Retail.CREATOR;
                                return new ActionsBottomSheetController(new dii.a(aVar20, eVar7, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var9, "value", k9Var9), null, null, 24));
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case 1582912799:
                            if (str2.equals("ID_FIXED_RATE_END_DATE_CELL")) {
                                ((c55.n) fVar2).getClass();
                                lw0.a aVar21 = new lw0.a(new TextLocalisedClause(R$string.loan_management_account_rate_temporary_fixed_explainer_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_account_rate_temporary_fixed_explainer_disclaimer, null, null, 14), null, null, false, 28);
                                aw0.e eVar8 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var10 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator10 = AnalyticsProduct.Retail.CREATOR;
                                return new ActionsBottomSheetController(new dii.a(aVar21, eVar8, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var10, "value", k9Var10), null, null, 24));
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case 1864318123:
                            if (str2.equals("ID_LATE_REPAYMENT_INTEREST")) {
                                ((c55.n) fVar2).getClass();
                                lw0.a aVar22 = new lw0.a(new TextLocalisedClause(R$string.loan_management_details_late_repayment_interest_dialog_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_details_late_repayment_interest_dialog_description, null, null, 14), null, null, false, 28);
                                aw0.e eVar9 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var11 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator11 = AnalyticsProduct.Retail.CREATOR;
                                return new ActionsBottomSheetController(new dii.a(aVar22, eVar9, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var11, "value", k9Var11), null, null, 24));
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        case 2036764166:
                            if (str2.equals("ID_ACCRUED_FEE")) {
                                ((c55.n) fVar2).getClass();
                                lw0.a aVar23 = new lw0.a(new TextLocalisedClause(R$string.loan_management_details_accrued_fee_dialog_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_details_accrued_fee_dialog_description, null, null, 14), null, null, false, 28);
                                aw0.e eVar10 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                                k9 k9Var12 = k9.Credit;
                                Parcelable.Creator<AnalyticsProduct.Retail> creator12 = AnalyticsProduct.Retail.CREATOR;
                                return new ActionsBottomSheetController(new dii.a(aVar23, eVar10, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var12, "value", k9Var12), null, null, 24));
                            }
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                        default:
                            throw new IllegalArgumentException("Unknown listId for a bottom dialog: ".concat(str2));
                    }
                }
                if (step8 instanceof LoanAccountDetailsScreenContract$ModalStep.RepaymentStampDutyExplainer) {
                    return ((c55.n) fVar2).b(((LoanAccountDetailsScreenContract$ModalStep.RepaymentStampDutyExplainer) step8).f70350a);
                }
                if (step8 instanceof LoanAccountDetailsScreenContract$ModalStep.RepaymentDayExplainer) {
                    LocalDate firstRepaymentDate = ((LoanAccountDetailsScreenContract$ModalStep.RepaymentDayExplainer) step8).f70349a;
                    c55.q qVar3 = (c55.q) iVar;
                    qVar3.getClass();
                    Intrinsics.checkNotNullParameter(firstRepaymentDate, "firstRepaymentDate");
                    lw0.a aVar24 = new lw0.a(new TextLocalisedClause(R$string.loan_management_delayed_disbursal_explainer_repayment_day_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_delayed_disbursal_explainer_repayment_day_description_v2, u.c(j.b(c7.Companion, firstRepaymentDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT))), null, 12), null, null, false, 28);
                    qv0.i iVarA = qVar3.f21455a.a("REPAYMENT_DAY_GOT_IT");
                    yp0.b.r(iVarA, R$attr.uikit_dp24, 0, 0, 0, 14);
                    List listC = u.c(iVarA);
                    k9 k9Var13 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator13 = AnalyticsProduct.Retail.CREATOR;
                    return new CreditBottomSheetListItemsController(new cy4.a(aVar24, listC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var13, "value", k9Var13)));
                }
                if (step8 instanceof LoanAccountDetailsScreenContract$ModalStep.FundsAvailableExplainer) {
                    c55.q qVar4 = (c55.q) iVar;
                    qVar4.getClass();
                    lw0.a aVar25 = new lw0.a(new TextLocalisedClause(R$string.loan_management_delayed_disbursal_explainer_availability_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_delayed_disbursal_explainer_availability_description_no_link_fr, u.c(new TextLocalisedClause(R$string.loan_management_delayed_disbursal_explainer_availability_description_link, null, new Click(30, (Integer) null, (Object) null, "FUNDS_AVAILABILITY_FAQ", false), 10)), null, 12), null, null, false, 28);
                    qv0.i iVarA2 = qVar4.f21455a.a("FUNDS_AVAILABILITY_GOT_IT");
                    yp0.b.r(iVarA2, R$attr.uikit_dp24, 0, 0, 0, 14);
                    List listC2 = u.c(iVarA2);
                    k9 k9Var14 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator14 = AnalyticsProduct.Retail.CREATOR;
                    CreditBottomSheetListItemsController creditBottomSheetListItemsController = new CreditBottomSheetListItemsController(new cy4.a(aVar25, listC2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var14, "value", k9Var14)));
                    yea.l block15 = new yea.l(1, aVar14, com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a.class, "handleFundsExplainerResult", "handleFundsExplainerResult(Lcom/revolut/feature/credit/core/ui/bottom_sheet/list/CreditBottomSheetListItemsController$OutputData;)V", 0, 25);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    creditBottomSheetListItemsController.H = block15;
                    return creditBottomSheetListItemsController;
                }
                if (!(step8 instanceof LoanAccountDetailsScreenContract$ModalStep.HowRepaymentWorksExplainer)) {
                    if (!(step8 instanceof LoanAccountDetailsScreenContract$ModalStep.LoanStateExplainer)) {
                        if (step8 instanceof LoanAccountDetailsScreenContract$ModalStep.InterestRateTypeExplainer) {
                            return ((c55.n) fVar2).a(((LoanAccountDetailsScreenContract$ModalStep.InterestRateTypeExplainer) step8).f70346a);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    m35.o oVarB = ((j0) aVar14.f70355t).b((q35.t) zi0.c.I(aVar14.I2()), true);
                    if (oVarB instanceof m35.n) {
                        return aVar14.e1(((m35.n) oVarB).f202290a);
                    }
                    if (!(oVarB instanceof m35.m)) {
                        if (oVarB == null) {
                            throw new IllegalArgumentException("Explainer dialog was null");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    CreditBottomSheetListItemsController creditBottomSheetListItemsController2 = ((m35.m) oVarB).f202289a;
                    yea.l block16 = new yea.l(1, aVar14, com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a.class, "handleStateExplainerResult", "handleStateExplainerResult(Lcom/revolut/feature/credit/core/ui/bottom_sheet/list/CreditBottomSheetListItemsController$OutputData;)V", 0, 26);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    creditBottomSheetListItemsController2.H = block16;
                    return creditBottomSheetListItemsController2;
                }
                boolean z = ((LoanAccountDetailsScreenContract$ModalStep.HowRepaymentWorksExplainer) step8).f70345a;
                ((c55.n) fVar2).getClass();
                lw0.a aVar26 = new lw0.a(new TextLocalisedClause(R$string.loan_management_details_repayment_methods_explainer_sheet_title, null, null, 14), z ? new TextLocalisedClause(R$string.loan_management_details_repayment_methods_explainer_sheet_text_multi_borrower, null, null, 14) : new TextLocalisedClause(R$string.loan_management_details_repayment_methods_explainer_sheet_text_single_borrower, null, null, 14), null, null, false, 28);
                aw0.e eVar11 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var15 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator15 = AnalyticsProduct.Retail.CREATOR;
                actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar26, eVar11, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var15, "value", k9Var15), null, null, 24));
                return actionsBottomSheetController;
            case 13:
                com.revolut.feature.defi.trade.impl.ui.trade.a aVar27 = (com.revolut.feature.defi.trade.impl.ui.trade.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DefiTradeContract$ModalStep step9 = (DefiTradeContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof DefiTradeContract$ModalStep.SelectSorting)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = aVar27.e1(new dw5.a(new CryptoSortingPickerInputData(((DefiTradeContract$ModalStep.SelectSorting) step9).f71884a, com.revolut.feature.defi.trade.impl.ui.trade.a.f71885y)));
                z66.l block17 = new z66.l(aVar27, i5);
                Intrinsics.checkNotNullParameter(block17, "block");
                viewControllerE1.H = block17;
                return viewControllerE1;
            case 14:
                final com.revolut.feature.giro.impl.ui.a aVar28 = (com.revolut.feature.giro.impl.ui.a) obj4;
                GiroFlowContract$Step step10 = (GiroFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof GiroFlowContract$Step.CreditorSearch) {
                    ViewController viewControllerE12 = aVar28.e1(new dm1.a(new BillerSearchNavigation$InputData(xo1.g.GIRO_HU_DIRECT_DEBIT, null)));
                    Function1 block18 = new Function1() { // from class: z67.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i3) {
                                case 0:
                                    dm1.d result = (dm1.d) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof dm1.c;
                                    com.revolut.feature.giro.impl.ui.a aVar29 = aVar28;
                                    if (z3) {
                                        oki.h.t2(aVar29, aVar29.f74540s, new GiroFlowContract$Step.Form(((dm1.c) result).f115817a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, dm1.b.f115816a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar29.f74540s);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    b77.i result2 = (b77.i) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.giro.impl.ui.a aVar30 = aVar28;
                                    aVar30.l2(new f(aVar30, result2, null, 13), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    e77.g result3 = (e77.g) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e77.g) {
                                        aVar28.C2(aii.q.f5292a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    viewControllerE12.H = block18;
                    return viewControllerE12;
                }
                if (step10 instanceof GiroFlowContract$Step.Form) {
                    directDebitReviewScreen = new DirectDebitFormScreen(new DirectDebitFormScreenContract$InputData.CreateByCreditor(((GiroFlowContract$Step.Form) step10).f74534a));
                    Function1 block19 = new Function1() { // from class: z67.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    dm1.d result = (dm1.d) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof dm1.c;
                                    com.revolut.feature.giro.impl.ui.a aVar29 = aVar28;
                                    if (z3) {
                                        oki.h.t2(aVar29, aVar29.f74540s, new GiroFlowContract$Step.Form(((dm1.c) result).f115817a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, dm1.b.f115816a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar29.f74540s);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    b77.i result2 = (b77.i) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.giro.impl.ui.a aVar30 = aVar28;
                                    aVar30.l2(new f(aVar30, result2, null, 13), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    e77.g result3 = (e77.g) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e77.g) {
                                        aVar28.C2(aii.q.f5292a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    directDebitReviewScreen.H = block19;
                } else {
                    if (!(step10 instanceof GiroFlowContract$Step.Review)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    GiroFlowContract$Step.Review review = (GiroFlowContract$Step.Review) step10;
                    directDebitReviewScreen = new DirectDebitReviewScreen(new DirectDebitReviewScreenContract$InputData(review.f74535a, review.f74536b));
                    Function1 block20 = new Function1() { // from class: z67.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i2) {
                                case 0:
                                    dm1.d result = (dm1.d) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof dm1.c;
                                    com.revolut.feature.giro.impl.ui.a aVar29 = aVar28;
                                    if (z3) {
                                        oki.h.t2(aVar29, aVar29.f74540s, new GiroFlowContract$Step.Form(((dm1.c) result).f115817a), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(result, dm1.b.f115816a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar29.f74540s);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    b77.i result2 = (b77.i) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.giro.impl.ui.a aVar30 = aVar28;
                                    aVar30.l2(new f(aVar30, result2, null, 13), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    e77.g result3 = (e77.g) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e77.g) {
                                        aVar28.C2(aii.q.f5292a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    directDebitReviewScreen.H = block20;
                }
                return directDebitReviewScreen;
            case 15:
                com.revolut.feature.paynow.impl.flow.a aVar29 = (com.revolut.feature.paynow.impl.flow.a) obj4;
                PayNowQrFlowContract$Step step11 = (PayNowQrFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!Intrinsics.f(step11, PayNowQrFlowContract$Step.Qr.f80297a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PayNowQrFlowContract$InputData payNowQrFlowContract$InputData = aVar29.o;
                PayNowQrScreen payNowQrScreen = new PayNowQrScreen(new PayNowQrScreenContract$InputData(payNowQrFlowContract$InputData.f80295a, payNowQrFlowContract$InputData.f80296b));
                z2.a block21 = new z2.a(aVar29, 13);
                Intrinsics.checkNotNullParameter(block21, "block");
                payNowQrScreen.H = block21;
                return payNowQrScreen;
            case 16:
                com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b bVar4 = (com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MoneyRequestDetailsContract$ModalStep step12 = (MoneyRequestDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof MoneyRequestDetailsContract$ModalStep.DeleteReceipt)) {
                    throw new NoWhenBranchMatchedException();
                }
                m1a.q qVar5 = bVar4.f102159t;
                k9 value = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator16 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ActionsBottomSheetController actionsBottomSheetController5 = new ActionsBottomSheetController(qVar5.b(new AnalyticsProduct.Retail(value)));
                z1.c block22 = new z1.c(bVar4, step12, 21);
                Intrinsics.checkNotNullParameter(block22, "block");
                actionsBottomSheetController5.H = block22;
                return actionsBottomSheetController5;
            case 17:
                return a(obj2, obj3);
            case 18:
                return b(obj2, obj3);
            case 19:
                return c(obj2, obj3);
            case 20:
                return d(obj2, obj3);
            case 21:
                return e(obj2, obj3);
            case 22:
                return g(obj2, obj3);
            case 23:
                return h(obj2, obj3);
            case 24:
                return i(obj2, obj3);
            case 25:
                return j(obj2, obj3);
            case 26:
                return k(obj2, obj3);
            case 27:
                return l(obj2, obj3);
            case 28:
                return m(obj2, obj3);
            default:
                List payments = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(payments, "payments");
                ((zb8.b) obj4).f320842b.f("ALLOWANCE_RECURRING_PAYMENTS_KEY", payments);
                return Unit.f186387a;
        }
    }
}
