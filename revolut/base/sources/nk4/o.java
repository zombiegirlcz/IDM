package nk4;

import aii.q;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cjl.s;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.bank_account_switching.impl.articles.BankAccountSwitchingArticle;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreen;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreen;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreen;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.MobilityAccountSwitchingFlowContract$Step;
import com.revolut.feature.bank_account_switching.impl.ui.switch_preference.SwitchPreferenceScreen;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreen;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreenContract$InputData;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser_commands.api.RegionConfiguration;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserContract$ModalStep;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.CreditCardAnticipationPrepayScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.CreditCardAnticipationPrepayScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreenContract$ModalStep;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$Step;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentController;
import com.revolut.feature.feedback.impl.ui.screen.one_click.OneClickFeedbackContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.one_click.OneClickFeedbackController;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.FreelancerAcquiringOrderFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.FreelancerPluginAuthFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.FreelancerPluginAuthFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.FreelancerPluginAuthScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.screen.FreelancerPluginAuthScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditContract$State;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditContract$Step;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.ChallengeEditFrequencyScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.ChallengeEditFrequencyScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.reward.ChallengeEditRewardScreenContract$InputData;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreen;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$DocumentsUploadConfig;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$Step;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreen;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$InputData;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreenItem;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreenContract$Step;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreenContract$ModalSteps;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.api.navigation.descriptor.RevPointsPersonalisationTargetingOnboardingController$InputData;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.RevPointsExclusiveStoreProductFlowContract$Step;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreenContract$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.sca_prompt.impl.trusted_entities.TrustedEntitiesScreenContract$ModalStep;
import com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsController;
import com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsControllerContract$InputData;
import com.revolut.feature.second_device_login.impl.ui.flow.SecondDeviceLoginFlowContract$Step;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreenContract$ModalStep;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$ModalStep;
import com.revolut.feature.us_send_checks.impl.flow.SendChecksFlowContract$Step;
import com.revolut.feature.us_send_checks.impl.ui.address_verification.SendChecksAddressVerificationScreen;
import com.revolut.feature.us_send_checks.impl.ui.address_verification.SendChecksAddressVerificationScreenContract$InputData;
import com.revolut.feature.us_send_checks.impl.ui.recipient.SendChecksRecipientScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.NewScreenerScreenContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.SaveScreenerCollectionScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.result.ScreenerResultScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlow;
import com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlowContract$InputData;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlowContract$State;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$InputData;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.EsimAlreadyInstalledBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.EsimAlreadyInstalledBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.a;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.AssetDetailsFlowContract$ResolvedDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsControllerContract$ModalStep;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsPeriodChooserController;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheet;
import com.revolut.sso.impl.ui.common.accounts_to_apply_changes.AccountsToApplyChangesBottomSheetContract$InputData;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreenContract$ModalStep;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$Step;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreen;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import dnj.e;
import fej.d;
import grl.k9;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import nii.y0;
import nii.z;
import njj.n0;
import nme.d0;
import no.e0;
import nvg.b0;
import nvk.a0;
import pw8.i;
import qa9.w;
import qi3.t;
import s7a.x;
import tlg.e;
import to2.k;
import tof.a3;
import tof.i7;
import vkm.j2;
import vlg.f;
import vlg.j;
import ww8.g;
import ww8.h;
import yki.l;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216652b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f216651a = i;
        this.f216652b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) this.f216652b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        HiddenTransactionsScreenContract$ModalStep step = (HiddenTransactionsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof HiddenTransactionsScreenContract$ModalStep.TransactionDetailsPager) {
            HiddenTransactionsScreenContract$ModalStep.TransactionDetailsPager transactionDetailsPager = (HiddenTransactionsScreenContract$ModalStep.TransactionDetailsPager) step;
            a3 a3Var = transactionDetailsPager.f85581a;
            i7 i7Var = transactionDetailsPager.f85582b;
            TransactionContext.INSTANCE.getClass();
            return aVar.e1(new rhf.e(a3Var, i7Var, TransactionContext.f60264c, transactionDetailsPager.f85583c, 16));
        }
        if (!Intrinsics.f(step, HiddenTransactionsScreenContract$ModalStep.HideTransactionsConfirmation.f85580a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.f85586r.getClass();
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_title, null, null, 14), null, null, null, false, 30);
        RowDelegate.Model.c cVar = null;
        boolean z = false;
        int i = 6;
        RowDelegate.Model.c cVar2 = null;
        List listK = v.k(new eii.l((Clause) new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_analytics_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_analytics_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, (RowDelegate.Model.c) null, (Object) cVar, 488), new eii.l((Clause) new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_accessible_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_accessible_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, cVar, (Object) cVar2, 488), new eii.l((Clause) new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_balance_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_balance_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, cVar2, (Object) null, 488));
        m6 m6Var = n6.Companion;
        aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.hidden_transaction_hide_info_multiple_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
        k9 value = k9.SecurityHub;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, hVar, listK, new AnalyticsProduct.Retail(value), null));
        nrd.g block = new nrd.g(aVar, i);
        Intrinsics.checkNotNullParameter(block, "block");
        rowActionsBottomSheetController.H = block;
        return rowActionsBottomSheetController;
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.kyc.impl.flow.addressverification.a aVar = (com.revolut.feature.kyc.impl.flow.addressverification.a) this.f216652b;
        yki.l FlowCoordinator = (yki.l) obj2;
        final ProofOfAddressFlowContract$Step step = (ProofOfAddressFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 0;
        if (step instanceof ProofOfAddressFlowContract$Step.AddressConfirmation) {
            AddressConfirmationScreen addressConfirmationScreen = new AddressConfirmationScreen(((ProofOfAddressFlowContract$Step.AddressConfirmation) step).f77683a);
            Function1 block = new Function1() { // from class: nv8.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i2 = i;
                    ProofOfAddressFlowContract$Step proofOfAddressFlowContract$Step = step;
                    switch (i2) {
                        case 0:
                            h data = (h) obj4;
                            Intrinsics.checkNotNullParameter(data, "data");
                            if (!(data instanceof g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.kyc.impl.flow.addressverification.a aVar2 = aVar;
                            g gVar = (g) data;
                            oki.h.t2(aVar2, aVar2.f77688r, new ProofOfAddressFlowContract$Step.DocumentsIntro(new ProofOfAddressFlowContract$DocumentsUploadConfig(gVar.f300625a, ((ProofOfAddressFlowContract$Step.AddressConfirmation) proofOfAddressFlowContract$Step).f77683a.f77849c, gVar.f300626b)), true, null, false, 12);
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.kyc.impl.flow.addressverification.a aVar3 = aVar;
                            yki.a aVar4 = aVar3.f77688r;
                            i result = (i) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (Intrinsics.f(result, pw8.g.f240348a)) {
                                ProofOfAddressFlowContract$DocumentsUploadConfig proofOfAddressFlowContract$DocumentsUploadConfig = ((ProofOfAddressFlowContract$Step.DocumentsIntro) proofOfAddressFlowContract$Step).f77685a;
                                aVar3.C1(new BridgeDestination(new FeatureCommand(new KycFeatureConfig.AddressVerificationKyc(proofOfAddressFlowContract$DocumentsUploadConfig.f77677a, 10001, proofOfAddressFlowContract$DocumentsUploadConfig.f77678b, "KYC_FLOW", aVar3.o.f77682c, proofOfAddressFlowContract$DocumentsUploadConfig.f77679c, true))));
                            } else if (Intrinsics.f(result, pw8.e.f240345a)) {
                                if (aVar4.c()) {
                                    aVar3.B2();
                                } else {
                                    oki.h.D2(aVar4);
                                }
                            } else if (result instanceof pw8.h) {
                                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("ProofOfAddressFlowModel : Unexpected ProductSelected Output for model id : ", ((pw8.h) result).f240349a.f52973a));
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            } else {
                                if (!(result instanceof pw8.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("ProofOfAddressFlowModel : Unexpected Clause Clicked Output for id : ", ((pw8.f) result).f240346a));
                                h0 h0Var2 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            addressConfirmationScreen.H = block;
            return addressConfirmationScreen;
        }
        if (!(step instanceof ProofOfAddressFlowContract$Step.DocumentsIntro)) {
            if (!(step instanceof ProofOfAddressFlowContract$Step.DocumentReview)) {
                throw new NoWhenBranchMatchedException();
            }
            DocumentReviewScreen documentReviewScreen = new DocumentReviewScreen(((ProofOfAddressFlowContract$Step.DocumentReview) step).f77684a);
            nrd.g block2 = new nrd.g(aVar, 12);
            Intrinsics.checkNotNullParameter(block2, "block");
            documentReviewScreen.H = block2;
            return documentReviewScreen;
        }
        nv8.a aVar2 = aVar.f77687q;
        boolean zEquals = step.equals(aVar.o.f77680a);
        wi0.b bVar = ((ProofOfAddressFlowContract$Step.DocumentsIntro) step).f77685a.f77677a;
        aVar2.getClass();
        IntroductionScreenItem.ImageItem imageItem = new IntroductionScreenItem.ImageItem("3D131", "INTRO_IMAGE_LIST_ID");
        int i2 = R$drawable.uikit_icn_24_profile;
        wi0.b.Companion.getClass();
        final int i3 = 1;
        List listK = v.k(imageItem, new IntroductionScreenItem.ListCellItem(i2, Intrinsics.f(bVar, wi0.b.A) ? new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.proof_of_address_introduction_row1_br, null, null, 14) : Intrinsics.f(bVar, wi0.b.Y1) ? new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.proof_of_address_introduction_row1_mx, null, null, 14) : new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.proof_of_address_introduction_row1, null, null, 14), null, "UPLOAD_INTRO_ITEM_1_LIST_ID"), new IntroductionScreenItem.ListCellItem(R$drawable.uikit_icn_24_calendar_check, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.proof_of_address_introduction_row2, null, null, 14), null, "UPLOAD_INTRO_ITEM_2_LIST_ID"), new IntroductionScreenItem.ListCellItem(R$drawable.uikit_icn_24_lock_opened, new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.proof_of_address_introduction_row3, null, null, 14), null, "UPLOAD_INTRO_ITEM_3_LIST_ID"));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.proof_of_address_introduction_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        IntroductionScreen introductionScreen = new IntroductionScreen(new IntroductionScreenContract$InputData(listK, textLocalisedClause, null, textLocalisedClause2, com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var), !zEquals ? lx8.a.BACK : lx8.a.NONE, 196));
        Function1 block3 = new Function1() { // from class: nv8.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i22 = i3;
                ProofOfAddressFlowContract$Step proofOfAddressFlowContract$Step = step;
                switch (i22) {
                    case 0:
                        h data = (h) obj4;
                        Intrinsics.checkNotNullParameter(data, "data");
                        if (!(data instanceof g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.kyc.impl.flow.addressverification.a aVar22 = aVar;
                        g gVar = (g) data;
                        oki.h.t2(aVar22, aVar22.f77688r, new ProofOfAddressFlowContract$Step.DocumentsIntro(new ProofOfAddressFlowContract$DocumentsUploadConfig(gVar.f300625a, ((ProofOfAddressFlowContract$Step.AddressConfirmation) proofOfAddressFlowContract$Step).f77683a.f77849c, gVar.f300626b)), true, null, false, 12);
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.kyc.impl.flow.addressverification.a aVar3 = aVar;
                        yki.a aVar4 = aVar3.f77688r;
                        i result = (i) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (Intrinsics.f(result, pw8.g.f240348a)) {
                            ProofOfAddressFlowContract$DocumentsUploadConfig proofOfAddressFlowContract$DocumentsUploadConfig = ((ProofOfAddressFlowContract$Step.DocumentsIntro) proofOfAddressFlowContract$Step).f77685a;
                            aVar3.C1(new BridgeDestination(new FeatureCommand(new KycFeatureConfig.AddressVerificationKyc(proofOfAddressFlowContract$DocumentsUploadConfig.f77677a, 10001, proofOfAddressFlowContract$DocumentsUploadConfig.f77678b, "KYC_FLOW", aVar3.o.f77682c, proofOfAddressFlowContract$DocumentsUploadConfig.f77679c, true))));
                        } else if (Intrinsics.f(result, pw8.e.f240345a)) {
                            if (aVar4.c()) {
                                aVar3.B2();
                            } else {
                                oki.h.D2(aVar4);
                            }
                        } else if (result instanceof pw8.h) {
                            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("ProofOfAddressFlowModel : Unexpected ProductSelected Output for model id : ", ((pw8.h) result).f240349a.f52973a));
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        } else {
                            if (!(result instanceof pw8.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("ProofOfAddressFlowModel : Unexpected Clause Clicked Output for id : ", ((pw8.f) result).f240346a));
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        introductionScreen.H = block3;
        return introductionScreen;
    }

    private final Object c(Object obj2, Object obj3) {
        nvb.e eVar;
        int i;
        Clause textLocalisedClause;
        ProductArticleParams.ArticleReference key;
        com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a) this.f216652b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        RevPointsExclusiveStoreProductFlowContract$Step step = (RevPointsExclusiveStoreProductFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof RevPointsExclusiveStoreProductFlowContract$Step.ProductArticle) {
            ExclusiveStoreInputData.ArticleReference articleReference = ((RevPointsExclusiveStoreProductFlowContract$Step.ProductArticle) step).f83584b;
            if (articleReference instanceof ExclusiveStoreInputData.ArticleReference.ReferenceId) {
                key = new ProductArticleParams.ArticleReference.Id(((ExclusiveStoreInputData.ArticleReference.ReferenceId) articleReference).f83569a);
            } else {
                if (!(articleReference instanceof ExclusiveStoreInputData.ArticleReference.ReferenceKey)) {
                    throw new NoWhenBranchMatchedException();
                }
                ExclusiveStoreInputData.ArticleReference.ReferenceKey referenceKey = (ExclusiveStoreInputData.ArticleReference.ReferenceKey) articleReference;
                key = new ProductArticleParams.ArticleReference.Key(new RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle(referenceKey.f83571b, referenceKey.f83570a, null));
            }
            aVar.H2(aVar.f83595t, new nuc.n(11));
            return aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(key), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 24));
        }
        int i2 = 2;
        if (step instanceof RevPointsExclusiveStoreProductFlowContract$Step.Checkout) {
            RevPointsExclusiveStoreProductCheckoutScreen revPointsExclusiveStoreProductCheckoutScreen = new RevPointsExclusiveStoreProductCheckoutScreen(new RevPointsExclusiveStoreProductCheckoutScreenContract$InputData(((RevPointsExclusiveStoreProductFlowContract$Step.Checkout) step).f83581a));
            nvb.d block = new nvb.d(aVar, i2);
            Intrinsics.checkNotNullParameter(block, "block");
            revPointsExclusiveStoreProductCheckoutScreen.H = block;
            revPointsExclusiveStoreProductCheckoutScreen.k2(new nmm.h(aVar, 21));
            return revPointsExclusiveStoreProductCheckoutScreen;
        }
        int i3 = 1;
        if (!(step instanceof RevPointsExclusiveStoreProductFlowContract$Step.UnavailableProduct)) {
            if (!(step instanceof RevPointsExclusiveStoreProductFlowContract$Step.OptIn)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = aVar.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.ExclusiveStore.f83989a, false, 6)));
            nvb.d block2 = new nvb.d(aVar, i3);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        RevPointsExclusiveStoreProductFlowContract$Step.UnavailableProduct unavailableProduct = (RevPointsExclusiveStoreProductFlowContract$Step.UnavailableProduct) step;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int i5 = nvb.f.f219578b[unavailableProduct.f83585a.ordinal()];
        if (i5 == 1) {
            eVar = new nvb.e(com.revolut.feature.store.core.api.R$string.store_exclusives_tile_sold_out_bottom_sheet_title, com.revolut.feature.store.core.api.R$string.store_exclusives_tile_sold_out_bottom_sheet_subtitle, com.revolut.feature.store.core.api.R$string.store_exclusives_tile_sold_out_bottom_sheet_action);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new nvb.e(com.revolut.feature.store.core.api.R$string.store_exclusives_tile_coming_soon_bottom_sheet_title, com.revolut.feature.store.core.api.R$string.store_exclusives_tile_coming_soon_bottom_sheet_subtitle, com.revolut.feature.store.core.api.R$string.store_exclusives_tile_coming_soon_bottom_sheet_action);
        }
        String str = unavailableProduct.f83586b;
        if (str != null) {
            i = 14;
            textLocalisedClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            i = 14;
            textLocalisedClause = new TextLocalisedClause(eVar.f219574a, null, null, 14);
        }
        String str2 = unavailableProduct.f83587c;
        lw0.a aVar2 = new lw0.a(textLocalisedClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(eVar.f219575b, null, null, i), null, null, false, 28);
        aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(eVar.f219576c, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        e0 block3 = new e0(ref$BooleanRef, aVar, 24);
        Intrinsics.checkNotNullParameter(block3, "block");
        actionsBottomSheetController.H = block3;
        actionsBottomSheetController.k2(new nsh.e(ref$BooleanRef, aVar, 5));
        return actionsBottomSheetController;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.a) this.f216652b;
        yki.l FlowCoordinator = (yki.l) obj2;
        FreelancerPluginAuthFlowContract$Step step = (FreelancerPluginAuthFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof FreelancerPluginAuthFlowContract$Step.AuthoriseEcommercePlugin)) {
            throw new NoWhenBranchMatchedException();
        }
        FreelancerPluginAuthFlowContract$InputData freelancerPluginAuthFlowContract$InputData = aVar.o;
        FreelancerPluginAuthScreen freelancerPluginAuthScreen = new FreelancerPluginAuthScreen(new FreelancerPluginAuthScreenContract$InputData(freelancerPluginAuthFlowContract$InputData.f73780a, freelancerPluginAuthFlowContract$InputData.f73781b, freelancerPluginAuthFlowContract$InputData.f73782c, freelancerPluginAuthFlowContract$InputData.d, freelancerPluginAuthFlowContract$InputData.f, freelancerPluginAuthFlowContract$InputData.e, freelancerPluginAuthFlowContract$InputData.f73783g));
        b0 block = new b0(aVar, FlowCoordinator, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        freelancerPluginAuthScreen.H = block;
        return freelancerPluginAuthScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v114, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        hnj.d dVar;
        dnj.d dVar2;
        lni.b bVar;
        String str;
        TextLocalisedClause textLocalisedClause;
        int i = this.f216651a;
        int i2 = 5;
        int i3 = 3;
        final int i5 = 1;
        Object[] objArr = 0;
        final int i6 = 0;
        Object obj4 = this.f216652b;
        switch (i) {
            case 0:
                com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b bVar2 = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) obj4;
                ConfirmAutopayContract$InputData confirmAutopayContract$InputData = bVar2.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ConfirmAutopayContract$ModalStep step = (ConfirmAutopayContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof ConfirmAutopayContract$ModalStep.BackupInfoDialog;
                BottomSheet.ActionStyle.Accent accent = BottomSheet.ActionStyle.Accent.f69824a;
                if (z) {
                    wj4.b bVar3 = bVar2.f68641q;
                    Clause title = confirmAutopayContract$InputData.getD().d.f68635a;
                    Clause description = confirmAutopayContract$InputData.getD().d.f68636b;
                    AnalyticsContext f68626b = confirmAutopayContract$InputData.getF68626b();
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), accent), null);
                    k9 k9Var = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return BottomSheet.a(title, description, null, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), f68626b, 12);
                }
                if (!(step instanceof ConfirmAutopayContract$ModalStep.RepaymentDayInfoDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                pk4.a aVar = bVar2.f68642r;
                AnalyticsContext f68626b2 = confirmAutopayContract$InputData.getF68626b();
                aVar.getClass();
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_dialog_payment_day_title, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_dialog_payment_day_description, null, null, 14);
                BottomSheet.ActionBlock.SingleAction singleAction2 = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), accent), null);
                k9 k9Var2 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                return BottomSheet.a(textLocalisedClause2, textLocalisedClause3, null, null, singleAction2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), f68626b2, 12);
            case 1:
                final com.revolut.feature.us_send_checks.impl.flow.a aVar2 = (com.revolut.feature.us_send_checks.impl.flow.a) obj4;
                final yki.l FlowCoordinator = (yki.l) obj2;
                SendChecksFlowContract$Step step2 = (SendChecksFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof SendChecksFlowContract$Step.AddRecipient) {
                    SendChecksRecipientScreen sendChecksRecipientScreen = new SendChecksRecipientScreen();
                    Function1 block = new Function1() { // from class: nlg.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    com.revolut.feature.us_send_checks.impl.flow.a aVar3 = aVar2;
                                    dj3.a aVar4 = aVar3.o;
                                    j outputData = (j) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z3 = outputData instanceof f;
                                    l lVar = FlowCoordinator;
                                    if (z3) {
                                        f fVar = (f) outputData;
                                        oki.h.t2(aVar3, lVar, new SendChecksFlowContract$Step.AddressVerificationNeeded(fVar.f290435a, fVar.f290436b), true, null, false, 12);
                                        Unit unit = Unit.f186387a;
                                    } else if (outputData instanceof vlg.g) {
                                        aVar3.X1(new y0("ADDRESS_UNDELIVERABLE_DIALOG_ID", new z(new TextLocalisedClause(com.revolut.feature.us_send_checks.impl.R$string.send_checks_address_verification_undeliverable_title, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.us_send_checks.impl.R$string.send_checks_address_verification_undeliverable_cta_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4));
                                    } else if (outputData instanceof vlg.i) {
                                        aVar3.I2(lVar, ((vlg.i) outputData).f290440a);
                                    } else {
                                        if (!(outputData instanceof vlg.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        t70.g localization = aVar3.f94590p;
                                        wi0.b.Companion.getClass();
                                        wi0.b bVar4 = wi0.b.f297770q3;
                                        vlg.h hVar = (vlg.h) outputData;
                                        String str2 = hVar.f290438a;
                                        ((ri3.a) aVar4).getClass();
                                        Intrinsics.checkNotNullParameter(localization, "localization");
                                        Intrinsics.checkNotNullParameter("US", "countryCode");
                                        wi0.b bVarC = com.bumptech.glide.d.c("US");
                                        Intrinsics.checkNotNullParameter(localization, "localization");
                                        String strG = uc0.b.g(bVarC.equals(bVar4) ? R.string.common_address_region_state : bVarC.equals(wi0.b.E) ? R.string.common_address_region_province_territory : bVarC.equals(wi0.b.X0) ? R.string.common_address_region_prefecture : bVarC.equals(wi0.b.f297756l) ? R.string.common_address_region_state_territory : (bVarC.equals(wi0.b.A) || bVarC.equals(wi0.b.W) || bVarC.equals(wi0.b.Y1)) ? R.string.common_address_region_hint_state : bVarC.equals(wi0.b.k) ? R.string.common_address_region_federal_state : bVarC.equals(wi0.b.J) ? R.string.common_address_region_canton_district : bVarC.equals(wi0.b.f297764o1) ? R.string.common_address_region_municipalities : (bVarC.equals(wi0.b.L0) || bVarC.equals(wi0.b.D2)) ? R.string.common_address_region_county : bVarC.equals(wi0.b.T0) ? R.string.common_address_region_province : bVarC.equals(wi0.b.n3) ? R.string.address_form_region_ua_placeholder : R.string.delivery_address_hint_region, localization);
                                        new RegionConfiguration(strG, "US", str2);
                                        ArrayList items = hVar.f290439b;
                                        ChooserConfiguration.ConfigurationType.INSTANCE.getClass();
                                        ChooserConfiguration.ConfigurationType.NamedConfiguration configurationType = ChooserConfiguration.ConfigurationType.Companion.d;
                                        ((ri3.a) aVar4).getClass();
                                        Intrinsics.checkNotNullParameter(items, "items");
                                        Intrinsics.checkNotNullParameter(configurationType, "configurationType");
                                        t.Companion.getClass();
                                        aVar3.C1(u0.b(new ActivityNavigateCommand(com.revolut.feature.chooser.b.f65915b, new ChooserConfiguration(items, configurationType, null, true, strG, strG, true, 0, null, false, 15904), null, 23, 0, null, null, null, null, false, 1012)));
                                    }
                                    return Unit.f186387a;
                                default:
                                    e output = (e) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar2.I2(FlowCoordinator, output.f272095a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    sendChecksRecipientScreen.H = block;
                    return sendChecksRecipientScreen;
                }
                if (!(step2 instanceof SendChecksFlowContract$Step.AddressVerificationNeeded)) {
                    throw new NoWhenBranchMatchedException();
                }
                SendChecksFlowContract$Step.AddressVerificationNeeded addressVerificationNeeded = (SendChecksFlowContract$Step.AddressVerificationNeeded) step2;
                SendChecksAddressVerificationScreen sendChecksAddressVerificationScreen = new SendChecksAddressVerificationScreen(new SendChecksAddressVerificationScreenContract$InputData(addressVerificationNeeded.f94588a, addressVerificationNeeded.f94589b));
                final int i21 = 1;
                Function1 block2 = new Function1() { // from class: nlg.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i21) {
                            case 0:
                                com.revolut.feature.us_send_checks.impl.flow.a aVar3 = aVar2;
                                dj3.a aVar4 = aVar3.o;
                                j outputData = (j) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z3 = outputData instanceof f;
                                l lVar = FlowCoordinator;
                                if (z3) {
                                    f fVar = (f) outputData;
                                    oki.h.t2(aVar3, lVar, new SendChecksFlowContract$Step.AddressVerificationNeeded(fVar.f290435a, fVar.f290436b), true, null, false, 12);
                                    Unit unit = Unit.f186387a;
                                } else if (outputData instanceof vlg.g) {
                                    aVar3.X1(new y0("ADDRESS_UNDELIVERABLE_DIALOG_ID", new z(new TextLocalisedClause(com.revolut.feature.us_send_checks.impl.R$string.send_checks_address_verification_undeliverable_title, null, null, 14), null, new TextLocalisedClause(com.revolut.feature.us_send_checks.impl.R$string.send_checks_address_verification_undeliverable_cta_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4));
                                } else if (outputData instanceof vlg.i) {
                                    aVar3.I2(lVar, ((vlg.i) outputData).f290440a);
                                } else {
                                    if (!(outputData instanceof vlg.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    t70.g localization = aVar3.f94590p;
                                    wi0.b.Companion.getClass();
                                    wi0.b bVar4 = wi0.b.f297770q3;
                                    vlg.h hVar = (vlg.h) outputData;
                                    String str2 = hVar.f290438a;
                                    ((ri3.a) aVar4).getClass();
                                    Intrinsics.checkNotNullParameter(localization, "localization");
                                    Intrinsics.checkNotNullParameter("US", "countryCode");
                                    wi0.b bVarC = com.bumptech.glide.d.c("US");
                                    Intrinsics.checkNotNullParameter(localization, "localization");
                                    String strG = uc0.b.g(bVarC.equals(bVar4) ? R.string.common_address_region_state : bVarC.equals(wi0.b.E) ? R.string.common_address_region_province_territory : bVarC.equals(wi0.b.X0) ? R.string.common_address_region_prefecture : bVarC.equals(wi0.b.f297756l) ? R.string.common_address_region_state_territory : (bVarC.equals(wi0.b.A) || bVarC.equals(wi0.b.W) || bVarC.equals(wi0.b.Y1)) ? R.string.common_address_region_hint_state : bVarC.equals(wi0.b.k) ? R.string.common_address_region_federal_state : bVarC.equals(wi0.b.J) ? R.string.common_address_region_canton_district : bVarC.equals(wi0.b.f297764o1) ? R.string.common_address_region_municipalities : (bVarC.equals(wi0.b.L0) || bVarC.equals(wi0.b.D2)) ? R.string.common_address_region_county : bVarC.equals(wi0.b.T0) ? R.string.common_address_region_province : bVarC.equals(wi0.b.n3) ? R.string.address_form_region_ua_placeholder : R.string.delivery_address_hint_region, localization);
                                    new RegionConfiguration(strG, "US", str2);
                                    ArrayList items = hVar.f290439b;
                                    ChooserConfiguration.ConfigurationType.INSTANCE.getClass();
                                    ChooserConfiguration.ConfigurationType.NamedConfiguration configurationType = ChooserConfiguration.ConfigurationType.Companion.d;
                                    ((ri3.a) aVar4).getClass();
                                    Intrinsics.checkNotNullParameter(items, "items");
                                    Intrinsics.checkNotNullParameter(configurationType, "configurationType");
                                    t.Companion.getClass();
                                    aVar3.C1(u0.b(new ActivityNavigateCommand(com.revolut.feature.chooser.b.f65915b, new ChooserConfiguration(items, configurationType, null, true, strG, strG, true, 0, null, false, 15904), null, 23, 0, null, null, null, null, false, 1012)));
                                }
                                return Unit.f186387a;
                            default:
                                e output = (e) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                aVar2.I2(FlowCoordinator, output.f272095a);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                sendChecksAddressVerificationScreen.H = block2;
                return sendChecksAddressVerificationScreen;
            case 2:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new nm9.k((List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null)), new lw0.h(lw0.i.TITLE_SUBTITLE), false, nm9.n.a((nm9.g) obj4));
            case 3:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new nmb.j((List) errorItems.invoke(new iii.d(14, null, false, false, null)), new nmb.d(false, null, false, 30), new nmb.h(((nmb.c) obj4).f217237c, null, false));
            case 4:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TabLifestyleScreenContract$ModalStep step3 = (TabLifestyleScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof TabLifestyleScreenContract$ModalStep.ThemeCustomisation) {
                    RetailBackgroundKey.RevPointsHome revPointsHome = RetailBackgroundKey.RevPointsHome.f63848b;
                    em2.b.Companion.getClass();
                    return fVar.e1(new cm2.h(revPointsHome, em2.a.a(), null));
                }
                if (step3 instanceof TabLifestyleScreenContract$ModalStep.Checklist) {
                    SlotChecklistPayload slotChecklistPayload = ((TabLifestyleScreenContract$ModalStep.Checklist) step3).f89918a;
                    k9 k9Var3 = k9.Lifestyle;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    return fVar.e1(new jkd.a(slotChecklistPayload, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3)));
                }
                if (step3 instanceof TabLifestyleScreenContract$ModalStep.RevPointsBottomSheet) {
                    return fVar.e1(new hub.c(m1c.e0.CARDS));
                }
                if (!(step3 instanceof TabLifestyleScreenContract$ModalStep.RevPointsFullScreenOptInModal)) {
                    if (step3 instanceof TabLifestyleScreenContract$ModalStep.PersonalisationTargetingOnboarding) {
                        return fVar.e1(new hub.e(new RevPointsPersonalisationTargetingOnboardingController$InputData(((TabLifestyleScreenContract$ModalStep.PersonalisationTargetingOnboarding) step3).f89919a)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = fVar.e1(new hub.a(new LifestyleRevPointsOptInController$InputData(((TabLifestyleScreenContract$ModalStep.RevPointsFullScreenOptInModal) step3).f89921a, false, 6)));
                d0 block3 = new d0(fVar, 1);
                Intrinsics.checkNotNullParameter(block3, "block");
                viewControllerE1.H = block3;
                return viewControllerE1;
            case 5:
                com.revolut.sso.impl.ui.country_selection.b bVar4 = (com.revolut.sso.impl.ui.country_selection.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CountrySelectionScreenContract$ModalStep step4 = (CountrySelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof CountrySelectionScreenContract$ModalStep.CountryPicker) {
                    PickerController pickerController = new PickerController(new x(null, null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.picker.R$string.picker_country_picker_search_hint, null, null, 14), null, null, false, null, ((nml.g) ((j2) bVar4.f106507r.f22677a).getValue()).f217378a.f297794a, null, null, true, mql.a.f208025a, null, null, null, null, 2105409022), bVar4.o);
                    nfj.l block4 = new nfj.l(bVar4, 29);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    pickerController.H = block4;
                    return pickerController;
                }
                if (!(step4 instanceof CountrySelectionScreenContract$ModalStep.Terms)) {
                    throw new NoWhenBranchMatchedException();
                }
                CountrySelectionScreenContract$ModalStep.Terms terms = (CountrySelectionScreenContract$ModalStep.Terms) step4;
                jx0.a aVarI2 = bVar4.I2();
                String listId = terms.f106502a;
                wi0.b countryCode = terms.f106503b;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return ((w) aVarI2.f179038b).a(listId, countryCode);
            case 6:
                com.revolut.feature.contacts_chooser.impl.ui.a aVar3 = (com.revolut.feature.contacts_chooser.impl.ui.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ContactsChooserContract$ModalStep step5 = (ContactsChooserContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (Intrinsics.f(step5, ContactsChooserContract$ModalStep.AddNewContact.f66085a)) {
                    return aVar3.e1(new el3.a(new AddContactInputData(new AddContactInputData.InputMode.Full(0), el3.b.FINISH, R$drawable.uikit_icn_24_back_button_arrow)));
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                final com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c) obj4;
                EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = cVar.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimRefundReasonScreenContract$ModalStep step6 = (EsimRefundReasonScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof EsimRefundReasonScreenContract$ModalStep.EsimAlreadyInstalled) {
                    if (esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.CancelMobilePlan) {
                        dVar2 = dnj.d.PROCEED_WITH_CANCELLATION;
                    } else {
                        if (!(esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar2 = dnj.d.CONTINUE_WITH_REFUND;
                    }
                    EsimAlreadyInstalledBottomSheetScreen esimAlreadyInstalledBottomSheetScreen = new EsimAlreadyInstalledBottomSheetScreen(new EsimAlreadyInstalledBottomSheetScreenContract$InputData(dVar2));
                    final int i22 = 1;
                    Function1 block5 = new Function1() { // from class: nnj.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    fej.d output = (fej.d) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, d.a.f134638a);
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar2 = cVar;
                                    if (zF) {
                                        cVar2.C2(a.C0625a.f101467a);
                                    } else {
                                        if (!Intrinsics.f(output, d.b.f134639a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EsimInstructionType.INSTANCE.getClass();
                                        cVar2.M2("INSTALLATION");
                                    }
                                    return Unit.f186387a;
                                default:
                                    dnj.e result = (dnj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, e.a.f116351a);
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar3 = cVar;
                                    if (zF2) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        cVar3.M2("ACTIVATION");
                                    } else {
                                        if (!Intrinsics.f(result, e.b.f116352a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar3.L2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    esimAlreadyInstalledBottomSheetScreen.H = block5;
                    return esimAlreadyInstalledBottomSheetScreen;
                }
                if (!(step6 instanceof EsimRefundReasonScreenContract$ModalStep.EsimInstallConfirmation)) {
                    if (!(step6 instanceof EsimRefundReasonScreenContract$ModalStep.EsimInstallation)) {
                        if (step6 instanceof EsimRefundReasonScreenContract$ModalStep.Instructions) {
                            return cVar.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData(((EsimRefundReasonScreenContract$ModalStep.Instructions) step6).f101466a, null)));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE12 = cVar.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(((EsimRefundReasonScreenContract$ModalStep.EsimInstallation) step6).f101465a, EsimInstallationFlowDescriptor$Start.DirectInstallation, false)));
                    Function1 block6 = new Function1() { // from class: nnj.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    fej.d output = (fej.d) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean zF = Intrinsics.f(output, d.a.f134638a);
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar2 = cVar;
                                    if (zF) {
                                        cVar2.C2(a.C0625a.f101467a);
                                    } else {
                                        if (!Intrinsics.f(output, d.b.f134639a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EsimInstructionType.INSTANCE.getClass();
                                        cVar2.M2("INSTALLATION");
                                    }
                                    return Unit.f186387a;
                                default:
                                    dnj.e result = (dnj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF2 = Intrinsics.f(result, e.a.f116351a);
                                    com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.c cVar3 = cVar;
                                    if (zF2) {
                                        EsimInstructionType.INSTANCE.getClass();
                                        cVar3.M2("ACTIVATION");
                                    } else {
                                        if (!Intrinsics.f(result, e.b.f116352a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar3.L2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE12.H = block6;
                    return viewControllerE12;
                }
                if (esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.CancelMobilePlan) {
                    dVar = hnj.d.PROCEED_WITH_CANCELLATION;
                } else {
                    if (!(esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = hnj.d.CONTINUE_WITH_REFUND;
                }
                EsimProfile esimProfile = ((EsimRefundReasonScreenContract$ModalStep.EsimInstallConfirmation) step6).f101464a;
                EsimInstallBottomSheetScreen esimInstallBottomSheetScreen = new EsimInstallBottomSheetScreen(new EsimInstallBottomSheetScreenContract$InputData(dVar, esimProfile, pd.b.j((Boolean) ((nnj.k) ((j2) cVar.f101474x.f22677a).getValue()).d.getContent())));
                nc1.j block7 = new nc1.j(cVar, esimProfile, 27);
                Intrinsics.checkNotNullParameter(block7, "block");
                esimInstallBottomSheetScreen.H = block7;
                return esimInstallBottomSheetScreen;
            case 8:
                final com.revolut.sso.impl.ui.phone.change_flow.b bVar5 = (com.revolut.sso.impl.ui.phone.change_flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                ChangePhoneFlowContract$Step step7 = (ChangePhoneFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof ChangePhoneFlowContract$Step.ChooseAccountsToApplyChange) {
                    ChangePhoneFlowContract$Step.ChooseAccountsToApplyChange chooseAccountsToApplyChange = (ChangePhoneFlowContract$Step.ChooseAccountsToApplyChange) step7;
                    final String str2 = chooseAccountsToApplyChange.f106647b;
                    String str3 = chooseAccountsToApplyChange.f106648c;
                    List list = chooseAccountsToApplyChange.f106646a;
                    SsoChangeClaimMode ssoChangeClaimMode = bVar5.f106655q.f106642c;
                    if (ssoChangeClaimMode instanceof SsoChangeClaimMode.Current) {
                        str = str3;
                    } else {
                        if (!(ssoChangeClaimMode instanceof SsoChangeClaimMode.Multiple)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((SsoChangeClaimMode.Multiple) ssoChangeClaimMode).f105983a;
                    }
                    AccountsToApplyChangesBottomSheet accountsToApplyChangesBottomSheet = new AccountsToApplyChangesBottomSheet(new AccountsToApplyChangesBottomSheetContract$InputData(str3, str, list, ull.c.PHONE));
                    final int i32 = 1;
                    Function1 block8 = new Function1() { // from class: nol.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i33 = i32;
                            com.revolut.sso.impl.ui.phone.change_flow.b bVar6 = bVar5;
                            String str4 = str2;
                            switch (i33) {
                                case 0:
                                    lni.i result = (lni.i) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof lni.d) {
                                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected result " + result);
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                        bVar6.O2(new nnf.h(21));
                                        Unit unit = Unit.f186387a;
                                    } else if (result instanceof lni.e) {
                                        bVar6.l2(new k(bVar6, str4, null), new yi5.b(26));
                                    } else if (result instanceof lni.f) {
                                        bVar6.l2(new l(bVar6, str4, result, null), new yi5.b(26));
                                    } else if (result instanceof lni.g) {
                                        bVar6.l2(new m(bVar6, str4, result, null), new yi5.b(26));
                                    } else {
                                        if (!(result instanceof lni.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar6.l2(new n(bVar6, str4, result, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ull.d result2 = (ull.d) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    bVar6.l2(new i(bVar6, str4, result2, null), new yi5.b(26));
                                    return Unit.f186387a;
                                default:
                                    kql.e result3 = (kql.e) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    boolean z3 = result3 instanceof kql.a;
                                    com.revolut.sso.impl.ui.phone.change_flow.b bVar7 = bVar5;
                                    if (z3) {
                                        yji.l.a1(bVar7, bVar7.X1(((jol.c) bVar7.f106654p).a(new Claim.Phone(str4))), null, null, new o(bVar7, null), 3);
                                    } else if (result3 instanceof kql.b) {
                                        bVar7.N2(new fjl.a(str4));
                                    } else if (result3 instanceof kql.c) {
                                        RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(p.a.p("Unexpected ", result3.getClass().getName(), " result"));
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var2);
                                        bVar7.O2(new nnf.h(21));
                                    } else {
                                        if (!(result3 instanceof kql.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar7.l2(new p(bVar7, str4, null), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    accountsToApplyChangesBottomSheet.H = block8;
                    return accountsToApplyChangesBottomSheet;
                }
                if (step7 instanceof ChangePhoneFlowContract$Step.CreateNewPhone) {
                    ChangePhoneFlowContract$Step.CreateNewPhone createNewPhone = (ChangePhoneFlowContract$Step.CreateNewPhone) step7;
                    EnterPhoneScreen enterPhoneScreen = new EnterPhoneScreen(new EnterPhoneScreenContract$InputData(new EnterPhoneScreenContract$InputData.Mode.Create(createNewPhone.f106649a, createNewPhone.f106650b)));
                    nol.e block9 = new nol.e(bVar5, 1);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    enterPhoneScreen.H = block9;
                    return enterPhoneScreen;
                }
                if (!(step7 instanceof ChangePhoneFlowContract$Step.EvidenceRequired)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChangePhoneFlowContract$Step.EvidenceRequired evidenceRequired = (ChangePhoneFlowContract$Step.EvidenceRequired) step7;
                final String str4 = evidenceRequired.f106651a;
                Challenge challenge = evidenceRequired.f106652b;
                ArrayList arrayList = evidenceRequired.f106653c;
                jkl.i iVar = challenge.f106098a;
                int[] iArr = nol.g.f218077a;
                switch (iArr[iVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        int i33 = iArr[iVar.ordinal()];
                        if (i33 == 1) {
                            bVar = lni.b.SMS;
                        } else if (i33 == 2) {
                            bVar = lni.b.TELEPHONE;
                        } else {
                            if (i33 != 3) {
                                throw new IllegalStateException(("Unexpected phone confirmation method " + iVar).toString());
                            }
                            bVar = lni.b.WHATSAPP;
                        }
                        lni.b bVar6 = bVar;
                        String str5 = challenge.d;
                        String str6 = challenge.e;
                        od0.a aVar4 = od0.a.f224253a;
                        String str7 = od0.a.e() ? str6 : null;
                        bVar5.f106657s.getClass();
                        ConfirmWithOtpCodeFlow confirmWithOtpCodeFlow = new ConfirmWithOtpCodeFlow(new ConfirmWithOtpCodeFlowContract$InputData(str5, str7, arrayList, bVar6, null, 192));
                        Function1 block10 = new Function1() { // from class: nol.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i332 = i6;
                                com.revolut.sso.impl.ui.phone.change_flow.b bVar62 = bVar5;
                                String str42 = str4;
                                switch (i332) {
                                    case 0:
                                        lni.i result = (lni.i) obj5;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (result instanceof lni.d) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Unexpected result " + result);
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                            bVar62.O2(new nnf.h(21));
                                            Unit unit = Unit.f186387a;
                                        } else if (result instanceof lni.e) {
                                            bVar62.l2(new k(bVar62, str42, null), new yi5.b(26));
                                        } else if (result instanceof lni.f) {
                                            bVar62.l2(new l(bVar62, str42, result, null), new yi5.b(26));
                                        } else if (result instanceof lni.g) {
                                            bVar62.l2(new m(bVar62, str42, result, null), new yi5.b(26));
                                        } else {
                                            if (!(result instanceof lni.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar62.l2(new n(bVar62, str42, result, null), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        ull.d result2 = (ull.d) obj5;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        bVar62.l2(new i(bVar62, str42, result2, null), new yi5.b(26));
                                        return Unit.f186387a;
                                    default:
                                        kql.e result3 = (kql.e) obj5;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        boolean z3 = result3 instanceof kql.a;
                                        com.revolut.sso.impl.ui.phone.change_flow.b bVar7 = bVar5;
                                        if (z3) {
                                            yji.l.a1(bVar7, bVar7.X1(((jol.c) bVar7.f106654p).a(new Claim.Phone(str42))), null, null, new o(bVar7, null), 3);
                                        } else if (result3 instanceof kql.b) {
                                            bVar7.N2(new fjl.a(str42));
                                        } else if (result3 instanceof kql.c) {
                                            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(p.a.p("Unexpected ", result3.getClass().getName(), " result"));
                                            h0 h0Var2 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var2);
                                            bVar7.O2(new nnf.h(21));
                                        } else {
                                            if (!(result3 instanceof kql.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar7.l2(new p(bVar7, str42, null), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block10, "block");
                        confirmWithOtpCodeFlow.H = block10;
                        return confirmWithOtpCodeFlow;
                    case 4:
                        s sVar = s.GLOBAL;
                        f0 f0Var = f0.f322471a;
                        h0 h0Var = h0.f322473a;
                        final int i43 = 2;
                        return ((kql.h) bVar5.v).b3(bVar5.o, new AuthAction.OperationBoundAuthentication(sVar, "", f0Var, "", f0Var, h0Var, h0Var, 16128), challenge, str4, new Function1() { // from class: nol.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i332 = i43;
                                com.revolut.sso.impl.ui.phone.change_flow.b bVar62 = bVar5;
                                String str42 = str4;
                                switch (i332) {
                                    case 0:
                                        lni.i result = (lni.i) obj5;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (result instanceof lni.d) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Unexpected result " + result);
                                            h0 h0Var2 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                                            bVar62.O2(new nnf.h(21));
                                            Unit unit = Unit.f186387a;
                                        } else if (result instanceof lni.e) {
                                            bVar62.l2(new k(bVar62, str42, null), new yi5.b(26));
                                        } else if (result instanceof lni.f) {
                                            bVar62.l2(new l(bVar62, str42, result, null), new yi5.b(26));
                                        } else if (result instanceof lni.g) {
                                            bVar62.l2(new m(bVar62, str42, result, null), new yi5.b(26));
                                        } else {
                                            if (!(result instanceof lni.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar62.l2(new n(bVar62, str42, result, null), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        ull.d result2 = (ull.d) obj5;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        bVar62.l2(new i(bVar62, str42, result2, null), new yi5.b(26));
                                        return Unit.f186387a;
                                    default:
                                        kql.e result3 = (kql.e) obj5;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        boolean z3 = result3 instanceof kql.a;
                                        com.revolut.sso.impl.ui.phone.change_flow.b bVar7 = bVar5;
                                        if (z3) {
                                            yji.l.a1(bVar7, bVar7.X1(((jol.c) bVar7.f106654p).a(new Claim.Phone(str42))), null, null, new o(bVar7, null), 3);
                                        } else if (result3 instanceof kql.b) {
                                            bVar7.N2(new fjl.a(str42));
                                        } else if (result3 instanceof kql.c) {
                                            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(p.a.p("Unexpected ", result3.getClass().getName(), " result"));
                                            h0 h0Var22 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var22);
                                            bVar7.O2(new nnf.h(21));
                                        } else {
                                            if (!(result3 instanceof kql.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar7.l2(new p(bVar7, str42, null), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        });
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        throw new IllegalStateException(("Unexpected phone confirmation method " + iVar).toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 9:
                final com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar7 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b) obj4;
                mn2.a aVar5 = bVar7.f64029q;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                MobilityAccountSwitchingFlowContract$Step step8 = (MobilityAccountSwitchingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof MobilityAccountSwitchingFlowContract$Step.Entry) {
                    RequestListScreen requestListScreen = new RequestListScreen(new RequestListScreenContract$InputData(aVar5));
                    final int i59 = 3;
                    Function1 block11 = new Function1() { // from class: np2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i59) {
                                case 0:
                                    q it8 = (q) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar8 = bVar7;
                                    oki.h.t2(bVar8, bVar8.f64030r, MobilityAccountSwitchingFlowContract$Step.Entry.f64011a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    zo2.e outputData = (zo2.e) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar7.J2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    bq2.c outputData2 = (bq2.c) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.d dVar3 = outputData2.f17669a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar9 = bVar7;
                                    oki.h.t2(bVar9, bVar9.f64030r, new MobilityAccountSwitchingFlowContract$Step.SourceAccountForm(dVar3), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    k outputData3 = (k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof to2.g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar10 = bVar7;
                                    if (z3) {
                                        bVar10.I2(false);
                                    } else if (outputData3 instanceof to2.h) {
                                        oki.h.D2(bVar10.f64030r);
                                    } else if (outputData3 instanceof to2.i) {
                                        oki.h.t2(bVar10, bVar10.f64030r, MobilityAccountSwitchingFlowContract$Step.ProductArticle.f64012a, false, null, false, 12);
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar10.J2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i66 = d.f218126a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar11 = bVar7;
                                    if (i66 == 1) {
                                        oki.h.D2(bVar11.f64030r);
                                    } else {
                                        if (i66 != 2 && i66 != 3 && i66 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar11.I2(true);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    requestListScreen.H = block11;
                    return requestListScreen;
                }
                if (step8 instanceof MobilityAccountSwitchingFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE13 = bVar7.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(BankAccountSwitchingArticle.MOBILITY)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    final int i66 = 4;
                    Function1 block12 = new Function1() { // from class: np2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i66) {
                                case 0:
                                    q it8 = (q) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar8 = bVar7;
                                    oki.h.t2(bVar8, bVar8.f64030r, MobilityAccountSwitchingFlowContract$Step.Entry.f64011a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    zo2.e outputData = (zo2.e) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar7.J2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    bq2.c outputData2 = (bq2.c) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.d dVar3 = outputData2.f17669a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar9 = bVar7;
                                    oki.h.t2(bVar9, bVar9.f64030r, new MobilityAccountSwitchingFlowContract$Step.SourceAccountForm(dVar3), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    k outputData3 = (k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof to2.g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar10 = bVar7;
                                    if (z3) {
                                        bVar10.I2(false);
                                    } else if (outputData3 instanceof to2.h) {
                                        oki.h.D2(bVar10.f64030r);
                                    } else if (outputData3 instanceof to2.i) {
                                        oki.h.t2(bVar10, bVar10.f64030r, MobilityAccountSwitchingFlowContract$Step.ProductArticle.f64012a, false, null, false, 12);
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar10.J2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i662 = d.f218126a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar11 = bVar7;
                                    if (i662 == 1) {
                                        oki.h.D2(bVar11.f64030r);
                                    } else {
                                        if (i662 != 2 && i662 != 3 && i662 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar11.I2(true);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE13.H = block12;
                    return viewControllerE13;
                }
                if (step8 instanceof MobilityAccountSwitchingFlowContract$Step.SwitchPreferenceSelection) {
                    SwitchPreferenceScreen switchPreferenceScreen = new SwitchPreferenceScreen();
                    final int i74 = 2;
                    Function1 block13 = new Function1() { // from class: np2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i74) {
                                case 0:
                                    q it8 = (q) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar8 = bVar7;
                                    oki.h.t2(bVar8, bVar8.f64030r, MobilityAccountSwitchingFlowContract$Step.Entry.f64011a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    zo2.e outputData = (zo2.e) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar7.J2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    bq2.c outputData2 = (bq2.c) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.d dVar3 = outputData2.f17669a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar9 = bVar7;
                                    oki.h.t2(bVar9, bVar9.f64030r, new MobilityAccountSwitchingFlowContract$Step.SourceAccountForm(dVar3), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    k outputData3 = (k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof to2.g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar10 = bVar7;
                                    if (z3) {
                                        bVar10.I2(false);
                                    } else if (outputData3 instanceof to2.h) {
                                        oki.h.D2(bVar10.f64030r);
                                    } else if (outputData3 instanceof to2.i) {
                                        oki.h.t2(bVar10, bVar10.f64030r, MobilityAccountSwitchingFlowContract$Step.ProductArticle.f64012a, false, null, false, 12);
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar10.J2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i662 = d.f218126a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar11 = bVar7;
                                    if (i662 == 1) {
                                        oki.h.D2(bVar11.f64030r);
                                    } else {
                                        if (i662 != 2 && i662 != 3 && i662 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar11.I2(true);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    switchPreferenceScreen.H = block13;
                    return switchPreferenceScreen;
                }
                if (step8 instanceof MobilityAccountSwitchingFlowContract$Step.SourceAccountForm) {
                    MobilityAccountSwitchingFlowContract$Step.SourceAccountForm sourceAccountForm = (MobilityAccountSwitchingFlowContract$Step.SourceAccountForm) step8;
                    BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = new BankAccountSwitchingFormScreen(new BankAccountSwitchingFormScreenContract$InputData(aVar5, sourceAccountForm.f64017a, null));
                    e0 block14 = new e0(bVar7, sourceAccountForm, 3);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    bankAccountSwitchingFormScreen.H = block14;
                    return bankAccountSwitchingFormScreen;
                }
                if (step8 instanceof MobilityAccountSwitchingFlowContract$Step.TargetAccountSelection) {
                    MobilityAccountSwitchingFlowContract$Step.TargetAccountSelection targetAccountSelection = (MobilityAccountSwitchingFlowContract$Step.TargetAccountSelection) step8;
                    BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen = new BankAccountSwitchingTargetSelectionScreen(new BankAccountSwitchingTargetSelectionScreenContract$InputData(targetAccountSelection.f64024c, aVar5, targetAccountSelection.f64022a));
                    e0 block15 = new e0(bVar7, targetAccountSelection, 5);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    bankAccountSwitchingTargetSelectionScreen.H = block15;
                    return bankAccountSwitchingTargetSelectionScreen;
                }
                if (step8 instanceof MobilityAccountSwitchingFlowContract$Step.SwitchDateSelection) {
                    MobilityAccountSwitchingFlowContract$Step.SwitchDateSelection switchDateSelection = (MobilityAccountSwitchingFlowContract$Step.SwitchDateSelection) step8;
                    BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen = new BankAccountSwitchingStartDateSelectionScreen(new BankAccountSwitchingStartDateSelectionScreenContract$InputData(aVar5, switchDateSelection.f64018a));
                    e0 block16 = new e0(bVar7, switchDateSelection, 4);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    bankAccountSwitchingStartDateSelectionScreen.H = block16;
                    return bankAccountSwitchingStartDateSelectionScreen;
                }
                if (step8 instanceof MobilityAccountSwitchingFlowContract$Step.Review) {
                    MobilityAccountSwitchingFlowContract$Step.Review review = (MobilityAccountSwitchingFlowContract$Step.Review) step8;
                    BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen = new BankAccountSwitchingReviewScreen(new BankAccountSwitchingReviewScreenContract$InputData(bVar7.f64029q, review.f64015b, review.d, review.f64016c, review.f64014a, null));
                    final int i92 = 1;
                    Function1 block17 = new Function1() { // from class: np2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i92) {
                                case 0:
                                    q it8 = (q) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar8 = bVar7;
                                    oki.h.t2(bVar8, bVar8.f64030r, MobilityAccountSwitchingFlowContract$Step.Entry.f64011a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    zo2.e outputData = (zo2.e) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar7.J2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    bq2.c outputData2 = (bq2.c) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.d dVar3 = outputData2.f17669a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar9 = bVar7;
                                    oki.h.t2(bVar9, bVar9.f64030r, new MobilityAccountSwitchingFlowContract$Step.SourceAccountForm(dVar3), true, null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    k outputData3 = (k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof to2.g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar10 = bVar7;
                                    if (z3) {
                                        bVar10.I2(false);
                                    } else if (outputData3 instanceof to2.h) {
                                        oki.h.D2(bVar10.f64030r);
                                    } else if (outputData3 instanceof to2.i) {
                                        oki.h.t2(bVar10, bVar10.f64030r, MobilityAccountSwitchingFlowContract$Step.ProductArticle.f64012a, false, null, false, 12);
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar10.J2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i662 = d.f218126a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar11 = bVar7;
                                    if (i662 == 1) {
                                        oki.h.D2(bVar11.f64030r);
                                    } else {
                                        if (i662 != 2 && i662 != 3 && i662 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar11.I2(true);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    bankAccountSwitchingReviewScreen.H = block17;
                    return bankAccountSwitchingReviewScreen;
                }
                if (!(step8 instanceof MobilityAccountSwitchingFlowContract$Step.RequestStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen = new BankAccountSwitchingRequestStatusScreen(new BankAccountSwitchingRequestStatusScreenContract$InputData(((MobilityAccountSwitchingFlowContract$Step.RequestStatus) step8).f64013a));
                Function1 block18 = new Function1() { // from class: np2.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i6) {
                            case 0:
                                q it8 = (q) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar8 = bVar7;
                                oki.h.t2(bVar8, bVar8.f64030r, MobilityAccountSwitchingFlowContract$Step.Entry.f64011a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                return Unit.f186387a;
                            case 1:
                                zo2.e outputData = (zo2.e) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar7.J2(outputData.f323861a);
                                return Unit.f186387a;
                            case 2:
                                bq2.c outputData2 = (bq2.c) obj5;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                wn2.d dVar3 = outputData2.f17669a;
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar9 = bVar7;
                                oki.h.t2(bVar9, bVar9.f64030r, new MobilityAccountSwitchingFlowContract$Step.SourceAccountForm(dVar3), true, null, false, 12);
                                return Unit.f186387a;
                            case 3:
                                k outputData3 = (k) obj5;
                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                boolean z3 = outputData3 instanceof to2.g;
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar10 = bVar7;
                                if (z3) {
                                    bVar10.I2(false);
                                } else if (outputData3 instanceof to2.h) {
                                    oki.h.D2(bVar10.f64030r);
                                } else if (outputData3 instanceof to2.i) {
                                    oki.h.t2(bVar10, bVar10.f64030r, MobilityAccountSwitchingFlowContract$Step.ProductArticle.f64012a, false, null, false, 12);
                                } else {
                                    if (!(outputData3 instanceof to2.j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar10.J2(((to2.j) outputData3).f272503a);
                                }
                                return Unit.f186387a;
                            default:
                                yja.b outputData4 = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                int i662 = d.f218126a[outputData4.ordinal()];
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.b bVar11 = bVar7;
                                if (i662 == 1) {
                                    oki.h.D2(bVar11.f64030r);
                                } else {
                                    if (i662 != 2 && i662 != 3 && i662 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar11.I2(true);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block18, "block");
                bankAccountSwitchingRequestStatusScreen.H = block18;
                return bankAccountSwitchingRequestStatusScreen;
            case 10:
                AdditionalCardsChangeLimitScreen additionalCardsChangeLimitScreen = (AdditionalCardsChangeLimitScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = AdditionalCardsChangeLimitScreen.V;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.f51981p;
                xi0.b bVar8 = obj5 instanceof xi0.b ? (xi0.b) obj5 : null;
                if (bVar8 != null) {
                    return new zp0.d(field.getEditText(), bVar8, (u80.d) additionalCardsChangeLimitScreen.Q.getValue(), null, new t1(additionalCardsChangeLimitScreen, 21), false, false, 0, false, null, 1928);
                }
                return null;
            case 11:
                np6.b bVar9 = (np6.b) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                OneClickFeedbackFlowContract$Step step9 = (OneClickFeedbackFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof OneClickFeedbackFlowContract$Step.OneClickFeedback) {
                    OneClickFeedbackController oneClickFeedbackController = new OneClickFeedbackController(new OneClickFeedbackContract$InputData(((OneClickFeedbackFlowContract$Step.OneClickFeedback) step9).f73145a));
                    e0 block19 = new e0(bVar9, FlowCoordinator2, 6);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    oneClickFeedbackController.H = block19;
                    return oneClickFeedbackController;
                }
                if (!(step9 instanceof OneClickFeedbackFlowContract$Step.Comment)) {
                    throw new NoWhenBranchMatchedException();
                }
                OneClickFeedbackFlowContract$Step.Comment comment = (OneClickFeedbackFlowContract$Step.Comment) step9;
                FeedbackCommentController feedbackCommentController = new FeedbackCommentController(new FeedbackCommentContract$InputData(comment.f73143b, comment.f73142a, comment.f73144c));
                nn3.z block20 = new nn3.z(bVar9, 25);
                Intrinsics.checkNotNullParameter(block20, "block");
                feedbackCommentController.H = block20;
                return feedbackCommentController;
            case 12:
                final com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar10 = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b) obj4;
                qki.d dVar3 = bVar10.u;
                final yki.l FlowCoordinator3 = (yki.l) obj2;
                ChallengesEditContract$Step step10 = (ChallengesEditContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof ChallengesEditContract$Step.Details) {
                    j2 j2Var = (j2) dVar3.f22677a;
                    j2 j2Var2 = (j2) dVar3.f22677a;
                    ChallengeEditDetailsScreen challengeEditDetailsScreen = new ChallengeEditDetailsScreen(new ChallengeEditDetailsScreenContract$InputData(((ChallengesEditContract$State) j2Var.getValue()).f77361b, ((ChallengesEditContract$State) j2Var2.getValue()).f77362c, ((ChallengesEditContract$State) j2Var2.getValue()).d, ((ChallengesEditContract$State) j2Var2.getValue()).f77363g != dp8.d.ONE_OFF));
                    Function1 block21 = new Function1() { // from class: np8.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    rp8.k result = (rp8.k) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar11 = bVar10;
                                    qki.d dVar4 = bVar11.u;
                                    bVar11.H2(dVar4, new nn3.z(result, 26));
                                    boolean z3 = result.f256281c;
                                    l lVar = FlowCoordinator3;
                                    if (z3 && ((ChallengesEditContract$State) ((j2) dVar4.f22677a).getValue()).f77361b == c.Create) {
                                        oki.h.t2(bVar11, lVar, ChallengesEditContract$Step.Frequency.f77365a, true, null, false, 12);
                                    } else {
                                        oki.h.t2(bVar11, lVar, ChallengesEditContract$Step.Reward.f77366a, true, null, false, 12);
                                    }
                                    break;
                                default:
                                    tp8.i result2 = (tp8.i) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar12 = bVar10;
                                    bVar12.H2(bVar12.u, new nn3.z(result2, 28));
                                    oki.h.t2(bVar12, FlowCoordinator3, ChallengesEditContract$Step.Reward.f77366a, true, null, false, 12);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    challengeEditDetailsScreen.H = block21;
                    return challengeEditDetailsScreen;
                }
                if (step10 instanceof ChallengesEditContract$Step.Frequency) {
                    ChallengeEditFrequencyScreen challengeEditFrequencyScreen = new ChallengeEditFrequencyScreen(new ChallengeEditFrequencyScreenContract$InputData(((ChallengesEditContract$State) ((j2) dVar3.f22677a).getValue()).f, ((ChallengesEditContract$State) ((j2) dVar3.f22677a).getValue()).f77363g));
                    final int i96 = 1;
                    Function1 block22 = new Function1() { // from class: np8.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i96) {
                                case 0:
                                    rp8.k result = (rp8.k) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar11 = bVar10;
                                    qki.d dVar4 = bVar11.u;
                                    bVar11.H2(dVar4, new nn3.z(result, 26));
                                    boolean z3 = result.f256281c;
                                    l lVar = FlowCoordinator3;
                                    if (z3 && ((ChallengesEditContract$State) ((j2) dVar4.f22677a).getValue()).f77361b == c.Create) {
                                        oki.h.t2(bVar11, lVar, ChallengesEditContract$Step.Frequency.f77365a, true, null, false, 12);
                                    } else {
                                        oki.h.t2(bVar11, lVar, ChallengesEditContract$Step.Reward.f77366a, true, null, false, 12);
                                    }
                                    break;
                                default:
                                    tp8.i result2 = (tp8.i) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.b bVar12 = bVar10;
                                    bVar12.H2(bVar12.u, new nn3.z(result2, 28));
                                    oki.h.t2(bVar12, FlowCoordinator3, ChallengesEditContract$Step.Reward.f77366a, true, null, false, 12);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    challengeEditFrequencyScreen.H = block22;
                    return challengeEditFrequencyScreen;
                }
                if (!(step10 instanceof ChallengesEditContract$Step.Reward)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChallengeEditRewardScreen challengeEditRewardScreen = new ChallengeEditRewardScreen(new ChallengeEditRewardScreenContract$InputData(((ChallengesEditContract$State) ((j2) dVar3.f22677a).getValue()).f77361b, bVar10.o.f218154a, ((ChallengesEditContract$State) ((j2) dVar3.f22677a).getValue()).e));
                np8.f block23 = new np8.f(bVar10, i6);
                Intrinsics.checkNotNullParameter(block23, "block");
                challengeEditRewardScreen.H = block23;
                return challengeEditRewardScreen;
            case 13:
                final com.revolut.feature.wealth_discovery.impl.screener.screens.result.a aVar6 = (com.revolut.feature.wealth_discovery.impl.screener.screens.result.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ScreenerResultScreenContract$ModalStep step11 = (ScreenerResultScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof ScreenerResultScreenContract$ModalStep.SaveScreener) {
                    ScreenerResultScreenContract$ModalStep.SaveScreener saveScreener = (ScreenerResultScreenContract$ModalStep.SaveScreener) step11;
                    SaveScreenerCollectionScreen saveScreenerCollectionScreen = new SaveScreenerCollectionScreen(new NewScreenerScreenContract$Input(saveScreener.f96266a, saveScreener.f96267b, saveScreener.f96268c));
                    Function1 block24 = new Function1() { // from class: nqh.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    gqh.g createdScreenerId = (gqh.g) obj6;
                                    Intrinsics.checkNotNullParameter(createdScreenerId, "createdScreenerId");
                                    aVar6.C2(g.f218459a);
                                    break;
                                default:
                                    dii.g output = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, dii.f.f115069a)) {
                                        aVar6.C2(f.f218458a);
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    saveScreenerCollectionScreen.H = block24;
                    return saveScreenerCollectionScreen;
                }
                if (!Intrinsics.f(step11, ScreenerResultScreenContract$ModalStep.ResetFiltersConfirmation.f96265a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.f96271r.getClass();
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(vph.a.a());
                final int i99 = 1;
                Function1 block25 = new Function1() { // from class: nqh.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i99) {
                            case 0:
                                gqh.g createdScreenerId = (gqh.g) obj6;
                                Intrinsics.checkNotNullParameter(createdScreenerId, "createdScreenerId");
                                aVar6.C2(g.f218459a);
                                break;
                            default:
                                dii.g output = (dii.g) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (Intrinsics.f(output, dii.f.f115069a)) {
                                    aVar6.C2(f.f218458a);
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block25, "block");
                actionsBottomSheetController.H = block25;
                return actionsBottomSheetController;
            case 14:
                y yVar = ((com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a) obj4).f69447r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardAnticipationConfirmationScreenContract$ModalStep step12 = (CreditCardAnticipationConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof CreditCardAnticipationConfirmationScreenContract$ModalStep.ShowEarlyInstalment) {
                    return new CreditCardAnticipationPrepayScreen(new CreditCardAnticipationPrepayScreenContract$InputData(((ns4.e) ((j2) yVar.f22677a).getValue()).f218741b, ((ns4.e) ((j2) yVar.f22677a).getValue()).f218740a.i));
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a aVar7 = (com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                GroupTransactionsScreenContract$Step step13 = (GroupTransactionsScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof GroupTransactionsScreenContract$Step.BillDetailsScreen) {
                    GroupTransactionsScreenContract$InputData groupTransactionsScreenContract$InputData = aVar7.o;
                    return new GroupDetailsBillScreen(new GroupDetailsBillScreenContract$InputData.WithBill(groupTransactionsScreenContract$InputData.f79362b, ((GroupTransactionsScreenContract$Step.BillDetailsScreen) step13).f79363a, groupTransactionsScreenContract$InputData.f79361a));
                }
                if (step13 instanceof GroupTransactionsScreenContract$Step.SettlementDetailsScreen) {
                    return new GroupDetailsSettlementScreen(new GroupDetailsSettlementScreenContract$InputData(((GroupTransactionsScreenContract$Step.SettlementDetailsScreen) step13).f79364a, aVar7.o.f79361a));
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                com.revolut.feature.sca_prompt.impl.trusted_entities.a aVar8 = (com.revolut.feature.sca_prompt.impl.trusted_entities.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator9 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TrustedEntitiesScreenContract$ModalStep step14 = (TrustedEntitiesScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator9, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof TrustedEntitiesScreenContract$ModalStep.Remove)) {
                    throw new NoWhenBranchMatchedException();
                }
                RecipientPaymentsSettings recipientPaymentsSettings = ((TrustedEntitiesScreenContract$ModalStep.Remove) step14).f85349a;
                psc.b bVar11 = aVar8.f85351q;
                String legalEntityId = recipientPaymentsSettings.f79672a;
                bVar11.getClass();
                Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
                nd.k kVar = bVar11.f239470a;
                lw0.a aVar9 = new lw0.a(kVar.i(legalEntityId), null, new lw0.b(LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_logo_revolut, new Color.Solid(R$attr.uikit_colorBlack), new Color.Solid(R$attr.uikit_colorWhite)), null), null, false, 26);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_trusted_entities_prompt_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, new ResourceImage(R$drawable.uikit_icn_24_trash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, 1016), null, null, 55);
                Clause clauseI = kVar.i(legalEntityId);
                int i100 = psc.a.f239468a[msc.a.a(legalEntityId).ordinal()];
                if (i100 == 1) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.crypto_sca_trusted_entities_prompt_subtitle, u.c(clauseI), null, 12);
                } else if (i100 == 2) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.stocks_sca_trusted_entities_prompt_subtitle, u.c(clauseI), null, 12);
                } else if (i100 == 3) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.wealth_sca_trusted_entities_prompt_subtitle_revolut_ltd, u.c(clauseI), null, 12);
                } else if (i100 == 4) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.sca_prompt.impl.R$string.wealth_sca_trusted_entities_prompt_subtitle_revolut_trading_ltd, u.c(clauseI), null, 12);
                } else {
                    if (i100 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = null;
                }
                dii.i iVar2 = textLocalisedClause != null ? new dii.i(textLocalisedClause) : null;
                k9 value = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar9, eVar, new AnalyticsProduct.Retail(value), (AnalyticsContext) null, iVar2));
                e0 block26 = new e0(aVar8, recipientPaymentsSettings, 11);
                Intrinsics.checkNotNullParameter(block26, "block");
                actionsBottomSheetController2.H = block26;
                return actionsBottomSheetController2;
            case 17:
                com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar12 = (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator10 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                GroupCreationScreenContract$ModalSteps step15 = (GroupCreationScreenContract$ModalSteps) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator10, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof GroupCreationScreenContract$ModalSteps.CurrencySelector) {
                    GroupCreationScreenContract$ModalSteps.CurrencySelector currencySelector = (GroupCreationScreenContract$ModalSteps.CurrencySelector) step15;
                    CurrencyChooserFlow currencyChooserFlowA = bVar12.f79483q.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, currencySelector.f79478a, currencySelector.f79479b, null, null, 51)));
                    nrd.g gVar = new nrd.g(bVar12, i3);
                    Intrinsics.checkNotNullParameter(gVar, "<set-?>");
                    currencyChooserFlowA.J = gVar;
                    return currencyChooserFlowA;
                }
                if (Intrinsics.f(step15, GroupCreationScreenContract$ModalSteps.SmartSettlementInfo.f79480a)) {
                    bVar12.f79485s.getClass();
                    return new ActionsBottomSheetController(wr9.e.a());
                }
                if (!Intrinsics.f(step15, GroupCreationScreenContract$ModalSteps.BaseCurrencyExplanation.f79477a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar12.f79486t.getClass();
                lw0.a aVar10 = new lw0.a(new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_base_currency_bottom_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_base_currency_bottom_sheet_description, null, null, 14), null, null, false, 28);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 k9Var4 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar10, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
            case 18:
                com.revolut.feature.second_device_login.impl.ui.flow.a aVar11 = (com.revolut.feature.second_device_login.impl.ui.flow.a) obj4;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                SecondDeviceLoginFlowContract$Step step16 = (SecondDeviceLoginFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (Intrinsics.f(step16, SecondDeviceLoginFlowContract$Step.Details.f85362a)) {
                    SecondDeviceLoginDetailsController secondDeviceLoginDetailsController = new SecondDeviceLoginDetailsController(new SecondDeviceLoginDetailsControllerContract$InputData(aVar11.o.f85358a));
                    e0 block27 = new e0(aVar11, FlowCoordinator4, 15);
                    Intrinsics.checkNotNullParameter(block27, "block");
                    secondDeviceLoginDetailsController.H = block27;
                    return secondDeviceLoginDetailsController;
                }
                if (Intrinsics.f(step16, SecondDeviceLoginFlowContract$Step.ConfirmLogin.f85361a)) {
                    LayoutViewerScreen layoutViewerScreen = new LayoutViewerScreen(R$layout.screen_transparent);
                    aVar11.l2(new n0(aVar11, FlowCoordinator4, objArr == true ? 1 : 0, 19), new yi5.b(26));
                    return layoutViewerScreen;
                }
                if (Intrinsics.f(step16, SecondDeviceLoginFlowContract$Step.ChangePasscode.f85360a)) {
                    return aVar11.e1(new ejl.c(0));
                }
                if (Intrinsics.f(step16, SecondDeviceLoginFlowContract$Step.DeviceManagement.f85363a)) {
                    return aVar11.e1(i86.a.f159473a);
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar12 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                AssetDetailsFlowContract$ResolvedDestination step17 = (AssetDetailsFlowContract$ResolvedDestination) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof AssetDetailsFlowContract$ResolvedDestination.EtfDetails) {
                    return new EtfDetailsFlowController(((AssetDetailsFlowContract$ResolvedDestination.EtfDetails) step17).f103827a);
                }
                if (step17 instanceof AssetDetailsFlowContract$ResolvedDestination.StockDetails) {
                    return new StockDetailsFlowController(((AssetDetailsFlowContract$ResolvedDestination.StockDetails) step17).f103830a);
                }
                if (step17 instanceof AssetDetailsFlowContract$ResolvedDestination.BondDetails) {
                    return new BondDetailsController(((AssetDetailsFlowContract$ResolvedDestination.BondDetails) step17).f103825a);
                }
                if (step17 instanceof AssetDetailsFlowContract$ResolvedDestination.CfdDetails) {
                    return new CfdDetailsController(((AssetDetailsFlowContract$ResolvedDestination.CfdDetails) step17).f103826a);
                }
                if (step17 instanceof AssetDetailsFlowContract$ResolvedDestination.PrivateMarketDetails) {
                    return aVar12.e1(new ofh.a(((AssetDetailsFlowContract$ResolvedDestination.PrivateMarketDetails) step17).f103829a.f95733a));
                }
                if (step17 instanceof AssetDetailsFlowContract$ResolvedDestination.MutualFundDetails) {
                    return aVar12.e1(new beh.a(((AssetDetailsFlowContract$ResolvedDestination.MutualFundDetails) step17).f103828a.f95714a));
                }
                if (step17 instanceof AssetDetailsFlowContract$ResolvedDestination.StructuredNoteDetails) {
                    return aVar12.e1(new l4e.a(((AssetDetailsFlowContract$ResolvedDestination.StructuredNoteDetails) step17).f103831a.f88859a));
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.a aVar13 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.a) obj4;
                FreelancerAcquiringOrderFlowContract$Step step18 = (FreelancerAcquiringOrderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (step18 instanceof FreelancerAcquiringOrderFlowContract$Step.OrderDetails) {
                    return new FreelancerAcquiringOrderDetailsScreen(new FreelancerAcquiringOrderDetailsScreenContract$InputData(((FreelancerAcquiringOrderFlowContract$Step.OrderDetails) step18).f73690a));
                }
                if (!(step18 instanceof FreelancerAcquiringOrderFlowContract$Step.OrderList)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerAcquiringOrderFlowContract$Step.OrderList orderList = (FreelancerAcquiringOrderFlowContract$Step.OrderList) step18;
                FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen = new FreelancerAcquiringOrderListScreen(new FreelancerAcquiringOrderListScreenContract$InputData(orderList.f73691a, orderList.f73692b));
                nrd.g block28 = new nrd.g(aVar13, i2);
                Intrinsics.checkNotNullParameter(block28, "block");
                freelancerAcquiringOrderListScreen.H = block28;
                return freelancerAcquiringOrderListScreen;
            case 21:
                return a(obj2, obj3);
            case 22:
                final com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar13 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator11 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AsftPassDetailsLegacyScreenContract$ModalStep step19 = (AsftPassDetailsLegacyScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator11, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (step19 instanceof AsftPassDetailsLegacyScreenContract$ModalStep.ManageBooking) {
                    AsftManageBookingScreen asftManageBookingScreen = new AsftManageBookingScreen(((AsftPassDetailsLegacyScreenContract$ModalStep.ManageBooking) step19).f98858a);
                    Function1 block29 = new Function1() { // from class: nui.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    qui.e result = (qui.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar14 = bVar13;
                                    if (zF) {
                                        bVar14.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                    } else if (result instanceof qui.d) {
                                        bVar14.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                    } else {
                                        if (!(result instanceof qui.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qui.b bVar15 = (qui.b) result;
                                        oki.h.v2(bVar14.u, new AsftPassDetailsLegacyScreenContract$ModalStep.CancelBooking(new AsftCancelBookingScreenContract$InputData(bVar15.f249454a, bVar15.f249455b, bVar15.f249456c, bVar15.d)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    lui.g result2 = (lui.g) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, lui.f.f200246a)) {
                                        if (!(result2 instanceof lui.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar16 = bVar13;
                                        bVar16.l2(new n0(bVar16, (lui.e) result2, null, 21), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block29, "block");
                    asftManageBookingScreen.H = block29;
                    return asftManageBookingScreen;
                }
                if (!(step19 instanceof AsftPassDetailsLegacyScreenContract$ModalStep.CancelBooking)) {
                    throw new NoWhenBranchMatchedException();
                }
                AsftCancelBookingScreen asftCancelBookingScreen = new AsftCancelBookingScreen(((AsftPassDetailsLegacyScreenContract$ModalStep.CancelBooking) step19).f98857a);
                Function1 block30 = new Function1() { // from class: nui.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i5) {
                            case 0:
                                qui.e result = (qui.e) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean zF = Intrinsics.f(result, qui.c.f249457a);
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar14 = bVar13;
                                if (zF) {
                                    bVar14.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                } else if (result instanceof qui.d) {
                                    bVar14.C1(new ExternalDestination.Browser(((qui.d) result).f249458a, null));
                                } else {
                                    if (!(result instanceof qui.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    qui.b bVar15 = (qui.b) result;
                                    oki.h.v2(bVar14.u, new AsftPassDetailsLegacyScreenContract$ModalStep.CancelBooking(new AsftCancelBookingScreenContract$InputData(bVar15.f249454a, bVar15.f249455b, bVar15.f249456c, bVar15.d)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                }
                                return Unit.f186387a;
                            default:
                                lui.g result2 = (lui.g) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (!Intrinsics.f(result2, lui.f.f200246a)) {
                                    if (!(result2 instanceof lui.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar16 = bVar13;
                                    bVar16.l2(new n0(bVar16, (lui.e) result2, null, 21), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block30, "block");
                asftCancelBookingScreen.H = block30;
                return asftCancelBookingScreen;
            case 23:
                com.revolut.feature.credit.card.impl.ui.statement.export.b bVar14 = (com.revolut.feature.credit.card.impl.ui.statement.export.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator12 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardStatementExportScreenContract$ModalStep step20 = (CreditCardStatementExportScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator12, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step20, "step");
                if (!(step20 instanceof CreditCardStatementExportScreenContract$ModalStep.Calendar)) {
                    if (!(step20 instanceof CreditCardStatementExportScreenContract$ModalStep.UnexpectedError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_error_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_error_generic, null, null, 14);
                    BottomSheet.ActionItem actionItem = new BottomSheet.ActionItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), null);
                    k9 k9Var5 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                    return BottomSheet.b(textLocalisedClause4, textLocalisedClause5, null, null, actionItem, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), 172);
                }
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_choose_month, null, null, 14);
                CreditCardStatementExportScreenContract$ModalStep.Calendar calendar = (CreditCardStatementExportScreenContract$ModalStep.Calendar) step20;
                YearMonth yearMonthH0 = pyd.c.h0(calendar.f69695a);
                Intrinsics.checkNotNullExpressionValue(yearMonthH0, "toYearMonth(...)");
                MonthPickerBottomSheetController monthPickerBottomSheetController = new MonthPickerBottomSheetController(new MonthPickerBottomSheetController.InputData(textLocalisedClause6, yearMonthH0, pyd.c.h0(calendar.f69696b), pyd.c.h0(calendar.f69697c)));
                nrd.g block31 = new nrd.g(bVar14, 9);
                Intrinsics.checkNotNullParameter(block31, "block");
                monthPickerBottomSheetController.H = block31;
                return monthPickerBottomSheetController;
            case 24:
                return b(obj2, obj3);
            case 25:
                return c(obj2, obj3);
            case 26:
                com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a aVar14 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator13 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StockFinancialsStatementsControllerContract$ModalStep step21 = (StockFinancialsStatementsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator13, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step21, "step");
                if (!(step21 instanceof StockFinancialsStatementsControllerContract$ModalStep.PeriodChooser)) {
                    throw new NoWhenBranchMatchedException();
                }
                StockFinancialsStatementsPeriodChooserController stockFinancialsStatementsPeriodChooserController = new StockFinancialsStatementsPeriodChooserController(new StockFinancialsStatementsPeriodChooserController.InputData(((StockFinancialsStatementsControllerContract$ModalStep.PeriodChooser) step21).f103964a));
                nrd.g block32 = new nrd.g(aVar14, 16);
                Intrinsics.checkNotNullParameter(block32, "block");
                stockFinancialsStatementsPeriodChooserController.H = block32;
                return stockFinancialsStatementsPeriodChooserController;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((a0) obj4).f219705b.b();
            case 28:
                return d(obj2, obj3);
            default:
                com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.a aVar15 = (com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.a) obj4;
                qki.d dVar4 = aVar15.f98960p;
                AirportLoungeCheckoutFlowContract$Step step22 = (AirportLoungeCheckoutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step22, "step");
                if (!(step22 instanceof AirportLoungeCheckoutFlowContract$Step.Checkout)) {
                    throw new NoWhenBranchMatchedException();
                }
                AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen = new AirportLoungePassCheckoutScreen(new AirportLoungePassCheckoutScreenContract$InputData(((AirportLoungeCheckoutFlowContract$State) ((j2) dVar4.f22677a).getValue()).f98957a, ((AirportLoungeCheckoutFlowContract$State) ((j2) dVar4.f22677a).getValue()).f98958b, aVar15.o.f98956b));
                nrd.g block33 = new nrd.g(aVar15, 23);
                Intrinsics.checkNotNullParameter(block33, "block");
                airportLoungePassCheckoutScreen.H = block33;
                return airportLoungePassCheckoutScreen;
        }
    }

    public /* synthetic */ o(nm9.n nVar, nm9.g gVar) {
        this.f216651a = 2;
        this.f216652b = gVar;
    }
}
