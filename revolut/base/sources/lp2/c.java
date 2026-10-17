package lp2;

import aii.q;
import android.os.Parcelable;
import aw0.h;
import aw0.n6;
import aw0.o9;
import c12.j0;
import cli.y;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$Step;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreen;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.terminal_ui.CameraKitTerminalCameraViewController;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.crypto.challenge.impl.dialog.claim.ClaimRewardBottomSheetController;
import com.revolut.crypto.challenge.impl.dialog.conditions.ConditionsBottomSheetContract$InputData;
import com.revolut.crypto.challenge.impl.dialog.conditions.ConditionsBottomSheetController;
import com.revolut.crypto.challenge.impl.model.PlanReward;
import com.revolut.crypto.challenge.impl.ui.screen.progress.CryptoChallengeProgressContract$ModalStep;
import com.revolut.feature.apm.bills.core.api.model.BillInput;
import com.revolut.feature.apm.bills.core.api.model.BillTransferType;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.PaymentMethodDetails;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.feature.apm.bills.postal_check.impl.articles.PostalCheckArticles;
import com.revolut.feature.apm.bills.postal_check.impl.domain.PostalCheckPaymentMethodDetails;
import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlowContract$Step;
import com.revolut.feature.apm.bills.postal_check.impl.ui.form.FormScreen;
import com.revolut.feature.apm.bills.postal_check.impl.ui.form.FormScreenContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrScannerInputData;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreenContract$InputData;
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
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.CassAccountSwitchingFlowContract$Step;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreen;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreenContract$InputData;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket.PickerBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.flow.CreditCardInstalmentHubFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayScreen;
import com.revolut.feature.credit.card.impl.ui.repay.pse.flow.CreditCardPseRepayFlowContract$Step;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationControllerContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.FreelancerCashbackBoosterScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawContract$ModalStep;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawScreen;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData;
import com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlowContract$Step;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.recurring_buys.schedule.impl.ui.RecurringSettingsContract$ModalStep;
import com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.FrequencyPickerContract$InputData;
import com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.FrequencyPickerController;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsAccountsSelectionControllerDescriptor$InputData;
import com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.HiddenAccountsAndTransactionsControllerContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.TravelRemoveWidgetFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.TravelRemoveWidgetContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.sheet.TravelRemoveWidgetController;
import com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$Step;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreenContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreenContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreen;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.savings.flow.SavingsStatementsFlowContract$InputData;
import com.revolut.feature.statements.impl.ui.savings.flow.SavingsStatementsFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreen;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreen;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$Step;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreenContract$ModalStep;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.TradeRevPointsAccountLimitInfoScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.TradeRevPointsAccountLimitInfoScreenContract$InputData;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.model.TravelFlightsPassengerField$Selection$Option;
import com.revolut.feature.workflow.engine.rfi.impl.ui.documents.ChooseDocumentsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$ModalStep;
import com.revolut.retail.feature.pocket.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import g12.m;
import g12.p;
import grl.k9;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import lu5.o;
import luh.n;
import m1c.e0;
import m58.g;
import m58.i;
import s7a.a0;
import s7a.c0;
import s7a.x;
import sx4.f;
import to2.j;
import to2.k;
import vkm.j2;
import we6.x0;
import yhm.m;
import yki.l;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;
import zp0.u;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f198918b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f198917a = i;
        this.f198918b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    private final Object a(Object obj2, Object obj3) {
        JointWithdrawScreen jointWithdrawScreen = (JointWithdrawScreen) this.f198918b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = JointWithdrawScreen.U;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        Object obj4 = data.f51981p;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawContract.WithdrawModelPayload");
        return new zp0.d(editText, ((m58.d) obj4).f202854a, (u80.d) jointWithdrawScreen.K.getValue(), null, new g(data, jointWithdrawScreen), false, false, 0, false, null, 1928);
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.joint.impl.ui.withdraw.b bVar = (com.revolut.feature.joint.impl.ui.withdraw.b) this.f198918b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        JointWithdrawContract$ModalStep step = (JointWithdrawContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof JointWithdrawContract$ModalStep.ShowEnablePocketDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        xi0.b bVar2 = ((JointWithdrawContract$ModalStep.ShowEnablePocketDialog) step).f76606a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.pockets_enable_pocket_title, u.c(bVar2.f306286a), null, 12), new TextLocalisedClause(R$string.pockets_enable_pocket_subtitle, u.c(bVar2.f306286a), null, 12), null, null, false, 28);
        h hVar = new h(false, new n6(new TextLocalisedClause(R$string.pockets_enable_pocket_joint_action_positive, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.pockets_enable_pocket_joint_action_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.JointAccounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        i block = new i(bVar, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a aVar = (com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a) this.f198918b;
        LoanSetupSepaAccountFlowContract$InputData loanSetupSepaAccountFlowContract$InputData = aVar.o;
        l FlowCoordinator = (l) obj2;
        LoanSetupSepaAccountFlowContract$Step step = (LoanSetupSepaAccountFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof LoanSetupSepaAccountFlowContract$Step.SelectAccount)) {
            if (!(step instanceof LoanSetupSepaAccountFlowContract$Step.ConfirmMandate)) {
                throw new NoWhenBranchMatchedException();
            }
            CreateMandateConfirmationController createMandateConfirmationController = new CreateMandateConfirmationController(new CreateMandateConfirmationControllerContract$InputData(loanSetupSepaAccountFlowContract$InputData.f70381a.f70144a.f70108a, ((LoanSetupSepaAccountFlowContract$Step.ConfirmMandate) step).f70383a));
            final int i = 1;
            Function1 block = new Function1() { // from class: m65.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i2 = i;
                    com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a aVar2 = aVar;
                    switch (i2) {
                        case 0:
                            yki.a aVar3 = aVar2.f70386q;
                            v35.b result = (v35.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            x35.e eVar = result.f285853a;
                            LoanSetupSepaAccountFlowContract$InputData loanSetupSepaAccountFlowContract$InputData2 = aVar2.o;
                            if (Intrinsics.f(loanSetupSepaAccountFlowContract$InputData2.f70382b, eVar)) {
                                aVar2.C2(d.f203013a);
                            } else {
                                b95.a aVar4 = loanSetupSepaAccountFlowContract$InputData2.f70381a.f70144a.o;
                                b95.a aVar5 = b95.a.MORTGAGE_LOAN;
                                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                if (aVar4 == aVar5) {
                                    oki.h.w2(aVar3, new LoanSetupSepaAccountFlowContract$Step.ConfirmMandate(eVar), popup);
                                } else if (eVar instanceof x35.d) {
                                    aVar2.l2(new lo.c(aVar2, (Continuation) null, 20), new yi5.b(26));
                                } else if (eVar instanceof x35.b) {
                                    oki.h.w2(aVar3, new LoanSetupSepaAccountFlowContract$Step.ConfirmMandate(eVar), popup);
                                } else {
                                    int i3 = jli.h.f175850a;
                                }
                            }
                            return Unit.f186387a;
                        default:
                            g75.g result2 = (g75.g) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (!(result2 instanceof g75.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.C2(c.f203012a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            createMandateConfirmationController.H = block;
            return createMandateConfirmationController;
        }
        LoanDetails loanDetails = loanSetupSepaAccountFlowContract$InputData.f70381a;
        Loan loan = loanDetails.f70144a;
        ViewController viewControllerE1 = aVar.e1(new v35.a(new AccountSelectorV2$InputData(loanSetupSepaAccountFlowContract$InputData.f70382b, y0.b(loan.f70123x.f306286a), loan.f70108a, loanDetails.f70148h, Integer.valueOf(loanDetails.f70146c), null, 132)));
        final int i2 = 0;
        Function1 block2 = new Function1() { // from class: m65.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i22 = i2;
                com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.a aVar2 = aVar;
                switch (i22) {
                    case 0:
                        yki.a aVar3 = aVar2.f70386q;
                        v35.b result = (v35.b) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        x35.e eVar = result.f285853a;
                        LoanSetupSepaAccountFlowContract$InputData loanSetupSepaAccountFlowContract$InputData2 = aVar2.o;
                        if (Intrinsics.f(loanSetupSepaAccountFlowContract$InputData2.f70382b, eVar)) {
                            aVar2.C2(d.f203013a);
                        } else {
                            b95.a aVar4 = loanSetupSepaAccountFlowContract$InputData2.f70381a.f70144a.o;
                            b95.a aVar5 = b95.a.MORTGAGE_LOAN;
                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                            if (aVar4 == aVar5) {
                                oki.h.w2(aVar3, new LoanSetupSepaAccountFlowContract$Step.ConfirmMandate(eVar), popup);
                            } else if (eVar instanceof x35.d) {
                                aVar2.l2(new lo.c(aVar2, (Continuation) null, 20), new yi5.b(26));
                            } else if (eVar instanceof x35.b) {
                                oki.h.w2(aVar3, new LoanSetupSepaAccountFlowContract$Step.ConfirmMandate(eVar), popup);
                            } else {
                                int i3 = jli.h.f175850a;
                            }
                        }
                        return Unit.f186387a;
                    default:
                        g75.g result2 = (g75.g) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (!(result2 instanceof g75.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar2.C2(c.f203012a);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE1.H = block2;
        return viewControllerE1;
    }

    /* JADX WARN: Type inference failed for: r1v100, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object model) {
        Object obj3;
        Object obj4;
        ServiceProvider serviceProvider;
        ViewController formScreen;
        TradeRevPointsTransferBreakdownScreenContract$InputData revPoints;
        int i = this.f198917a;
        int i2 = 10;
        boolean z = false;
        z = false;
        Object obj5 = this.f198918b;
        switch (i) {
            case 0:
                final com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) obj5;
                mn2.a aVar = bVar.f64009s;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CassAccountSwitchingFlowContract$Step step = (CassAccountSwitchingFlowContract$Step) model;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CassAccountSwitchingFlowContract$Step.Entry) {
                    RequestListScreen requestListScreen = new RequestListScreen(new RequestListScreenContract$InputData(aVar));
                    final int i3 = 0;
                    Function1 block = new Function1() { // from class: lp2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    k outputData = (k) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z3 = outputData instanceof to2.g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar2 = bVar;
                                    if (z3) {
                                        bVar2.l2(new ll6.i(bVar2, wn2.d.FULL, null, 15), new yi5.b(26));
                                    } else if (outputData instanceof to2.h) {
                                        oki.h.D2(bVar2.f64010t);
                                    } else if (outputData instanceof to2.i) {
                                        bVar2.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.a(bVar2, null), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar2.I2(((j) outputData).f272503a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    zo2.e outputData2 = (zo2.e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar.I2(outputData2.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    q it8 = (q) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar3 = bVar;
                                    oki.h.t2(bVar3, bVar3.f64010t, CassAccountSwitchingFlowContract$Step.Entry.f63992a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData3 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    int i5 = e.f198921a[outputData3.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar4 = bVar;
                                    if (i5 == 1) {
                                        oki.h.D2(bVar4.f64010t);
                                    } else {
                                        if (i5 != 2 && i5 != 3 && i5 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.l2(new ll6.i(bVar4, wn2.d.FULL, null, 15), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    requestListScreen.H = block;
                    return requestListScreen;
                }
                if (step instanceof CassAccountSwitchingFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE1 = bVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(((CassAccountSwitchingFlowContract$Step.ProductArticle) step).f63993a)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    final int i5 = 3;
                    Function1 block2 = new Function1() { // from class: lp2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    k outputData = (k) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z3 = outputData instanceof to2.g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar2 = bVar;
                                    if (z3) {
                                        bVar2.l2(new ll6.i(bVar2, wn2.d.FULL, null, 15), new yi5.b(26));
                                    } else if (outputData instanceof to2.h) {
                                        oki.h.D2(bVar2.f64010t);
                                    } else if (outputData instanceof to2.i) {
                                        bVar2.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.a(bVar2, null), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar2.I2(((j) outputData).f272503a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    zo2.e outputData2 = (zo2.e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar.I2(outputData2.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    q it8 = (q) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar3 = bVar;
                                    oki.h.t2(bVar3, bVar3.f64010t, CassAccountSwitchingFlowContract$Step.Entry.f63992a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData3 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    int i59 = e.f198921a[outputData3.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar4 = bVar;
                                    if (i59 == 1) {
                                        oki.h.D2(bVar4.f64010t);
                                    } else {
                                        if (i59 != 2 && i59 != 3 && i59 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.l2(new ll6.i(bVar4, wn2.d.FULL, null, 15), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE1.H = block2;
                    return viewControllerE1;
                }
                if (!(step instanceof CassAccountSwitchingFlowContract$Step.SwitchPreferenceSelection)) {
                    if (step instanceof CassAccountSwitchingFlowContract$Step.TargetAccountSelection) {
                        CassAccountSwitchingFlowContract$Step.TargetAccountSelection targetAccountSelection = (CassAccountSwitchingFlowContract$Step.TargetAccountSelection) step;
                        BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen = new BankAccountSwitchingTargetSelectionScreen(new BankAccountSwitchingTargetSelectionScreenContract$InputData(targetAccountSelection.f64005b, aVar, targetAccountSelection.f64004a));
                        llh.j block3 = new llh.j(targetAccountSelection, bVar, 8);
                        Intrinsics.checkNotNullParameter(block3, "block");
                        bankAccountSwitchingTargetSelectionScreen.H = block3;
                        obj3 = bankAccountSwitchingTargetSelectionScreen;
                    } else if (step instanceof CassAccountSwitchingFlowContract$Step.SourceAccountForm) {
                        CassAccountSwitchingFlowContract$Step.SourceAccountForm sourceAccountForm = (CassAccountSwitchingFlowContract$Step.SourceAccountForm) step;
                        BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = new BankAccountSwitchingFormScreen(new BankAccountSwitchingFormScreenContract$InputData(aVar, sourceAccountForm.f63998a, sourceAccountForm.f63999b));
                        llh.j block4 = new llh.j(bVar, sourceAccountForm, 11);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        bankAccountSwitchingFormScreen.H = block4;
                        obj3 = bankAccountSwitchingFormScreen;
                    } else if (step instanceof CassAccountSwitchingFlowContract$Step.CardDigitsInput) {
                        CassAccountSwitchingFlowContract$Step.CardDigitsInput cardDigitsInput = (CassAccountSwitchingFlowContract$Step.CardDigitsInput) step;
                        BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen = new BankAccountSwitchingCardDigitsScreen(new BankAccountSwitchingCardDigitsScreenContract$InputData(cardDigitsInput.d, cardDigitsInput.f63991c));
                        llh.j block5 = new llh.j(cardDigitsInput, bVar, 12);
                        Intrinsics.checkNotNullParameter(block5, "block");
                        bankAccountSwitchingCardDigitsScreen.H = block5;
                        obj4 = bankAccountSwitchingCardDigitsScreen;
                    } else if (step instanceof CassAccountSwitchingFlowContract$Step.SwitchDateSelection) {
                        CassAccountSwitchingFlowContract$Step.SwitchDateSelection switchDateSelection = (CassAccountSwitchingFlowContract$Step.SwitchDateSelection) step;
                        BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen = new BankAccountSwitchingStartDateSelectionScreen(new BankAccountSwitchingStartDateSelectionScreenContract$InputData(aVar, switchDateSelection.f64000a));
                        llh.j block6 = new llh.j(switchDateSelection, bVar, i2);
                        Intrinsics.checkNotNullParameter(block6, "block");
                        bankAccountSwitchingStartDateSelectionScreen.H = block6;
                        obj3 = bankAccountSwitchingStartDateSelectionScreen;
                    } else if (step instanceof CassAccountSwitchingFlowContract$Step.Review) {
                        CassAccountSwitchingFlowContract$Step.Review review = (CassAccountSwitchingFlowContract$Step.Review) step;
                        BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen = new BankAccountSwitchingReviewScreen(new BankAccountSwitchingReviewScreenContract$InputData(bVar.f64009s, review.f63996b, review.e, review.f63997c, review.f63995a, review.d));
                        final int i6 = 1;
                        Function1 block7 = new Function1() { // from class: lp2.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                switch (i6) {
                                    case 0:
                                        k outputData = (k) obj6;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z3 = outputData instanceof to2.g;
                                        com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar2 = bVar;
                                        if (z3) {
                                            bVar2.l2(new ll6.i(bVar2, wn2.d.FULL, null, 15), new yi5.b(26));
                                        } else if (outputData instanceof to2.h) {
                                            oki.h.D2(bVar2.f64010t);
                                        } else if (outputData instanceof to2.i) {
                                            bVar2.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.a(bVar2, null), new yi5.b(26));
                                        } else {
                                            if (!(outputData instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar2.I2(((j) outputData).f272503a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        zo2.e outputData2 = (zo2.e) obj6;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (outputData2 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar.I2(outputData2.f323861a);
                                        return Unit.f186387a;
                                    case 2:
                                        q it8 = (q) obj6;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar3 = bVar;
                                        oki.h.t2(bVar3, bVar3.f64010t, CassAccountSwitchingFlowContract$Step.Entry.f63992a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                        return Unit.f186387a;
                                    default:
                                        yja.b outputData3 = (yja.b) obj6;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        int i59 = e.f198921a[outputData3.ordinal()];
                                        com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar4 = bVar;
                                        if (i59 == 1) {
                                            oki.h.D2(bVar4.f64010t);
                                        } else {
                                            if (i59 != 2 && i59 != 3 && i59 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar4.l2(new ll6.i(bVar4, wn2.d.FULL, null, 15), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block7, "block");
                        bankAccountSwitchingReviewScreen.H = block7;
                        obj4 = bankAccountSwitchingReviewScreen;
                    } else {
                        if (!(step instanceof CassAccountSwitchingFlowContract$Step.RequestStatus)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen = new BankAccountSwitchingRequestStatusScreen(new BankAccountSwitchingRequestStatusScreenContract$InputData(((CassAccountSwitchingFlowContract$Step.RequestStatus) step).f63994a));
                        final int i21 = 2;
                        Function1 block8 = new Function1() { // from class: lp2.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                switch (i21) {
                                    case 0:
                                        k outputData = (k) obj6;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z3 = outputData instanceof to2.g;
                                        com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar2 = bVar;
                                        if (z3) {
                                            bVar2.l2(new ll6.i(bVar2, wn2.d.FULL, null, 15), new yi5.b(26));
                                        } else if (outputData instanceof to2.h) {
                                            oki.h.D2(bVar2.f64010t);
                                        } else if (outputData instanceof to2.i) {
                                            bVar2.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.a(bVar2, null), new yi5.b(26));
                                        } else {
                                            if (!(outputData instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar2.I2(((j) outputData).f272503a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        zo2.e outputData2 = (zo2.e) obj6;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (outputData2 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar.I2(outputData2.f323861a);
                                        return Unit.f186387a;
                                    case 2:
                                        q it8 = (q) obj6;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar3 = bVar;
                                        oki.h.t2(bVar3, bVar3.f64010t, CassAccountSwitchingFlowContract$Step.Entry.f63992a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                        return Unit.f186387a;
                                    default:
                                        yja.b outputData3 = (yja.b) obj6;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        int i59 = e.f198921a[outputData3.ordinal()];
                                        com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar4 = bVar;
                                        if (i59 == 1) {
                                            oki.h.D2(bVar4.f64010t);
                                        } else {
                                            if (i59 != 2 && i59 != 3 && i59 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar4.l2(new ll6.i(bVar4, wn2.d.FULL, null, 15), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block8, "block");
                        bankAccountSwitchingRequestStatusScreen.H = block8;
                        obj4 = bankAccountSwitchingRequestStatusScreen;
                    }
                    return obj3;
                }
                bVar.f64008r.getClass();
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_cass_preference_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_cass_preference_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_cass_preference_disclaimer, null, null, 14), ao2.a.a(), new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_cass_preference_full_switch_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_cass_preference_partial_switch_action, null, null, 14), true, null, null, null, false, 16741316));
                llh.j block9 = new llh.j(bVar, (CassAccountSwitchingFlowContract$Step.SwitchPreferenceSelection) step, 9);
                Intrinsics.checkNotNullParameter(block9, "block");
                fullScreenPromptScreen.H = block9;
                obj4 = fullScreenPromptScreen;
                return obj4;
            case 1:
                final com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar2 = (com.revolut.feature.apm.bills.postal_check.impl.ui.b) obj5;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                PostalCheckFlowContract$Step step2 = (PostalCheckFlowContract$Step) model;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof PostalCheckFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE12 = bVar2.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PostalCheckArticles.ONBOARDING)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    final int i22 = 2;
                    Function1 block10 = new Function1() { // from class: lr1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i22) {
                                case 0:
                                    ef9.b it8 = (ef9.b) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.u);
                                    return Unit.f186387a;
                                case 1:
                                    g12.q result = (g12.q) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof p;
                                    com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar3 = bVar2;
                                    if (z3) {
                                        m mVar = ((p) result).f139527a;
                                        Intrinsics.i(mVar, "null cannot be cast to non-null type com.revolut.feature.apm.bills.postal_check.impl.qr.QrHandlerResult");
                                        bVar3.K2(((kr1.f) mVar).f188634a);
                                    } else {
                                        oki.h.D2(bVar3.u);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    int i32 = d.f199370a[outputData.ordinal()];
                                    com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar4 = bVar2;
                                    if (i32 == 1) {
                                        oki.h.D2(bVar4.u);
                                    } else {
                                        if (i32 != 2 && i32 != 3 && i32 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.M2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    viewControllerE12.H = block10;
                    return viewControllerE12;
                }
                if (step2 instanceof PostalCheckFlowContract$Step.QrScanner) {
                    ViewController viewControllerE13 = bVar2.e1(new g12.k(new QrScannerInputData(PermissionsControllerContract$Explanation.None.f80324a, new TextLocalisedClause(com.revolut.feature.apm.bills.postal_check.api.R$string.postal_check_scanner_title, null, null, 14)), bVar2.f61524q));
                    final int i32 = 1;
                    Function1 block11 = new Function1() { // from class: lr1.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i32) {
                                case 0:
                                    ef9.b it8 = (ef9.b) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    oki.h.D2(bVar2.u);
                                    return Unit.f186387a;
                                case 1:
                                    g12.q result = (g12.q) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof p;
                                    com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar3 = bVar2;
                                    if (z3) {
                                        m mVar = ((p) result).f139527a;
                                        Intrinsics.i(mVar, "null cannot be cast to non-null type com.revolut.feature.apm.bills.postal_check.impl.qr.QrHandlerResult");
                                        bVar3.K2(((kr1.f) mVar).f188634a);
                                    } else {
                                        oki.h.D2(bVar3.u);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    int i322 = d.f199370a[outputData.ordinal()];
                                    com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar4 = bVar2;
                                    if (i322 == 1) {
                                        oki.h.D2(bVar4.u);
                                    } else {
                                        if (i322 != 2 && i322 != 3 && i322 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar4.M2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    viewControllerE13.H = block11;
                    return viewControllerE13;
                }
                if (step2 instanceof PostalCheckFlowContract$Step.TermsAndConditions) {
                    PostalCheckFlowContract$Step.TermsAndConditions termsAndConditions = (PostalCheckFlowContract$Step.TermsAndConditions) step2;
                    formScreen = bVar2.e1(new j0(new ApmRegistrationTermsScope$InputData(u.c(termsAndConditions.f61520a))));
                    llh.j block12 = new llh.j(bVar2, termsAndConditions, 19);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    formScreen.H = block12;
                } else {
                    if (!(step2 instanceof PostalCheckFlowContract$Step.Form)) {
                        if (!(step2 instanceof PostalCheckFlowContract$Step.Payment)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PostalCheckFlowContract$Step.Payment payment = (PostalCheckFlowContract$Step.Payment) step2;
                        xo1.g gVar = xo1.g.POSTAL_CHECK;
                        BillTransferType billTransferType = BillTransferType.BILL_PAYMENT;
                        Map map = payment.f61517b;
                        PostalCheckQrScanResult.Success success = payment.f61516a;
                        Set<Map.Entry> setEntrySet = map.entrySet();
                        ArrayList arrayList = new ArrayList(w.t(setEntrySet, 10));
                        for (Map.Entry entry : setEntrySet) {
                            arrayList.add(new BillInput((String) entry.getKey(), (String) entry.getValue(), null));
                        }
                        PostalCheckQrScanResult.Success.Details details = success.f61498a;
                        dj0.d dVar = details.f61501b;
                        if (dVar == null) {
                            dVar = new dj0.d(0L, bVar2.f61527t);
                        }
                        dj0.d dVar2 = dVar;
                        dj0.d dVar3 = details.f61501b;
                        boolean z3 = (dVar3 != null ? dVar3.f115082a : 0L) <= 0;
                        String str = details.e;
                        dj0.d dVar4 = details.f61502c;
                        dj0.d dVar5 = details.d;
                        String str2 = details.f;
                        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                            serviceProvider = null;
                        } else {
                            m70.a.c(t0.f186434a);
                            String str3 = str == null ? "" : str;
                            if (str2 == null) {
                                str2 = "";
                            }
                            serviceProvider = new ServiceProvider("", str3, null, new PaymentMethodDetails(str2));
                        }
                        ViewController viewControllerE14 = bVar2.e1(new ef9.a(new BillPaymentNavigation$InputData(gVar, billTransferType, (List) arrayList, new BillPaymentNavigation$BillData(dVar2, dVar4, dVar5, z3, null, serviceProvider, str), new TextLocalisedClause(com.revolut.feature.apm.bills.postal_check.api.R$string.postal_check_descriptor_payment_amount_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.bills.postal_check.api.R$string.postal_check_descriptor_payment_review_title, null, null, 14), new PostalCheckPaymentMethodDetails(details.f61503g, details.f61504h, details.i, details.f61500a, success.f61499b, Boolean.valueOf(details.f61505j), details.e), false, false, 896)));
                        final int i33 = 0;
                        Function1 block13 = new Function1() { // from class: lr1.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                switch (i33) {
                                    case 0:
                                        ef9.b it8 = (ef9.b) obj6;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        oki.h.D2(bVar2.u);
                                        return Unit.f186387a;
                                    case 1:
                                        g12.q result = (g12.q) obj6;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z310 = result instanceof p;
                                        com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar3 = bVar2;
                                        if (z310) {
                                            m mVar = ((p) result).f139527a;
                                            Intrinsics.i(mVar, "null cannot be cast to non-null type com.revolut.feature.apm.bills.postal_check.impl.qr.QrHandlerResult");
                                            bVar3.K2(((kr1.f) mVar).f188634a);
                                        } else {
                                            oki.h.D2(bVar3.u);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        yja.b outputData = (yja.b) obj6;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        int i322 = d.f199370a[outputData.ordinal()];
                                        com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar4 = bVar2;
                                        if (i322 == 1) {
                                            oki.h.D2(bVar4.u);
                                        } else {
                                            if (i322 != 2 && i322 != 3 && i322 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bVar4.M2();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block13, "block");
                        viewControllerE14.H = block13;
                        return viewControllerE14;
                    }
                    PostalCheckFlowContract$Step.Form form = (PostalCheckFlowContract$Step.Form) step2;
                    formScreen = new FormScreen(new FormScreenContract$InputData(form.f61515a.f61498a.k));
                    llh.j block14 = new llh.j(bVar2, form, 18);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    formScreen.H = block14;
                }
                return formScreen;
            case 2:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a aVar2 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardChooseInstalmentsScreenContract$ModalStep step3 = (CreditCardChooseInstalmentsScreenContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof CreditCardChooseInstalmentsScreenContract$ModalStep.SelectInstalment)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_anticipation_select_instalment_select_instalment, null, null, 14), null, null, null, false, 30);
                yp4.a aVar4 = new yp4.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_select, null, null, 14));
                List<CreditCardInstalmentAnticipationQuote> list = aVar2.I2().f199612b.e;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (CreditCardInstalmentAnticipationQuote creditCardInstalmentAnticipationQuote : list) {
                    int i43 = R$plurals.credit_card_statement_financing_setup_dialog_select_instalments_item;
                    int i59 = creditCardInstalmentAnticipationQuote.f68783b;
                    arrayList2.add(new yp4.b(new TextLocalisedQuantityClause(i43, Integer.valueOf(i59), v.k(Integer.valueOf(i59), f.b(3, null, null, creditCardInstalmentAnticipationQuote.f68785g)), (Style) null, 24), Integer.valueOf(i59)));
                }
                PickerBottomSheetController pickerBottomSheetController = new PickerBottomSheetController(new yp4.c(aVar3, aVar4, arrayList2, aVar2.I2().f199612b.e.indexOf(aVar2.I2().a())));
                ls4.m block15 = new ls4.m(aVar2, 1);
                Intrinsics.checkNotNullParameter(block15, "block");
                pickerBottomSheetController.H = block15;
                return pickerBottomSheetController;
            case 3:
                com.revolut.feature.payments.groups.impl.ui_chat.flow.b bVar3 = (com.revolut.feature.payments.groups.impl.ui_chat.flow.b) obj5;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                GroupChatFlowContract$Step step4 = (GroupChatFlowContract$Step) model;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof GroupChatFlowContract$Step.Chat)) {
                    throw new NoWhenBranchMatchedException();
                }
                GroupChatFlowContract$InputData groupChatFlowContract$InputData = bVar3.o;
                GroupChatScreen groupChatScreen = new GroupChatScreen(new GroupChatScreenContract$InputData(groupChatFlowContract$InputData.f79354a, groupChatFlowContract$InputData.f79355b, ((GroupChatFlowContract$Step.Chat) step4).f79356a));
                llh.j block16 = new llh.j(bVar3, LazyFlowCoordinator3, step4, 23);
                Intrinsics.checkNotNullParameter(block16, "block");
                groupChatScreen.H = block16;
                return groupChatScreen;
            case 4:
                TransferReasonsRequest request = (TransferReasonsRequest) obj2;
                TransferReasons data = (TransferReasons) model;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(data, "data");
                ((lsf.d) obj5).f199678a.f(lsf.d.a(request), data);
                return Unit.f186387a;
            case 5:
                com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.a aVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.a) obj5;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                TravelRemoveWidgetFlowContract$Step step5 = (TravelRemoveWidgetFlowContract$Step) model;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof TravelRemoveWidgetFlowContract$Step.ModalRemoveWidget)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelRemoveWidgetFlowContract$Step.ModalRemoveWidget modalRemoveWidget = (TravelRemoveWidgetFlowContract$Step.ModalRemoveWidget) step5;
                TravelRemoveWidgetController travelRemoveWidgetController = new TravelRemoveWidgetController(new TravelRemoveWidgetContract$InputData(modalRemoveWidget.f88051b, modalRemoveWidget.f88050a));
                travelRemoveWidgetController.k2(new lea.b(LazyFlowCoordinator4, aVar5, 29));
                return travelRemoveWidgetController;
            case 6:
                com.revolut.feature.credit.card.impl.ui.repay.pse.flow.a aVar6 = (com.revolut.feature.credit.card.impl.ui.repay.pse.flow.a) obj5;
                l FlowCoordinator = (l) obj2;
                CreditCardPseRepayFlowContract$Step step6 = (CreditCardPseRepayFlowContract$Step) model;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof CreditCardPseRepayFlowContract$Step.SelectAmount) {
                    CreditCardPseRepayScreen creditCardPseRepayScreen = new CreditCardPseRepayScreen(new CreditCardPseRepayContract$InputData(aVar6.o.f69595a));
                    llh.j block17 = new llh.j(aVar6, FlowCoordinator, 25);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    creditCardPseRepayScreen.H = block17;
                    return creditCardPseRepayScreen;
                }
                if (step6 instanceof CreditCardPseRepayFlowContract$Step.InstalmentHub) {
                    return new CreditCardInstalmentHubFlow(new CreditCardInstalmentHubFlowContract$InputData(((CreditCardPseRepayFlowContract$Step.InstalmentHub) step6).f69596a));
                }
                if (!(step6 instanceof CreditCardPseRepayFlowContract$Step.Pse)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardPseRepayFlowContract$Step.Pse pse2 = (CreditCardPseRepayFlowContract$Step.Pse) step6;
                return aVar6.e1(new x0(pse2.f69597a, pse2.f69598b));
            case 7:
                com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar7 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) obj5;
                l80.e eVar = aVar7.f73684p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FreelancerAcquiringOrderFiltersScreenContract$ModalStep step7 = (FreelancerAcquiringOrderFiltersScreenContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (Intrinsics.f(step7, FreelancerAcquiringOrderFiltersScreenContract$ModalStep.StartDateRangePicker.f73683a)) {
                    LocalDate localDateE = ((l80.f) eVar).e();
                    FreelancerDatePickerScreen freelancerDatePickerScreen = new FreelancerDatePickerScreen(new FreelancerDatePickerScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_from, null, null, 14), localDateE, null, null, localDateE, 12));
                    o block18 = new o(aVar7, 4);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    freelancerDatePickerScreen.H = block18;
                    return freelancerDatePickerScreen;
                }
                if (!(step7 instanceof FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker endDateRangePicker = (FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker) step7;
                LocalDate localDateE2 = ((l80.f) eVar).e();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_period_chooser_to, null, null, 14);
                LocalDate localDate = endDateRangePicker.f73682a;
                FreelancerDatePickerScreen freelancerDatePickerScreen2 = new FreelancerDatePickerScreen(new FreelancerDatePickerScreenContract$InputData(textLocalisedClause, localDate, null, localDate, localDateE2, 4));
                llh.j block19 = new llh.j(aVar7, endDateRangePicker, 27);
                Intrinsics.checkNotNullParameter(block19, "block");
                freelancerDatePickerScreen2.H = block19;
                return freelancerDatePickerScreen2;
            case 8:
                final com.revolut.feature.recurring_buys.schedule.impl.ui.a aVar8 = (com.revolut.feature.recurring_buys.schedule.impl.ui.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RecurringSettingsContract$ModalStep step8 = (RecurringSettingsContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof RecurringSettingsContract$ModalStep.CalendarPicker) {
                    DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(new TextLocalisedClause(com.revolut.feature.recurring_buys.schedule.api.R$string.wealthcore_recurringbuys_period_start_date_title, null, null, 14), ((RecurringSettingsContract$ModalStep.CalendarPicker) step8).f81646a, LocalDate.now(), (LocalDate) null, 24));
                    final int i66 = false ? 1 : 0;
                    Function1 block20 = new Function1() { // from class: lua.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i66) {
                                case 0:
                                    hii.a output = (hii.a) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.recurring_buys.schedule.impl.ui.a aVar9 = aVar8;
                                    aVar9.H2(aVar9.o, new cab.j(output, 1));
                                    break;
                                default:
                                    nua.b output2 = (nua.b) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.feature.recurring_buys.schedule.impl.ui.a aVar10 = aVar8;
                                    aVar10.H2(aVar10.o, new o(output2, 5));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    datePickerBottomSheetController.H = block20;
                    return datePickerBottomSheetController;
                }
                if (!(step8 instanceof RecurringSettingsContract$ModalStep.FrequencyPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                FrequencyPickerController frequencyPickerController = new FrequencyPickerController(new FrequencyPickerContract$InputData(((RecurringSettingsContract$ModalStep.FrequencyPicker) step8).f81647a));
                final int i74 = 1;
                Function1 block21 = new Function1() { // from class: lua.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i74) {
                            case 0:
                                hii.a output = (hii.a) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                com.revolut.feature.recurring_buys.schedule.impl.ui.a aVar9 = aVar8;
                                aVar9.H2(aVar9.o, new cab.j(output, 1));
                                break;
                            default:
                                nua.b output2 = (nua.b) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                com.revolut.feature.recurring_buys.schedule.impl.ui.a aVar10 = aVar8;
                                aVar10.H2(aVar10.o, new o(output2, 5));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block21, "block");
                frequencyPickerController.H = block21;
                return frequencyPickerController;
            case 9:
                com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.a aVar9 = (com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                HiddenAccountsAndTransactionsControllerContract$Step step9 = (HiddenAccountsAndTransactionsControllerContract$Step) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof HiddenAccountsAndTransactionsControllerContract$Step.HiddenTransactionsAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE15 = aVar9.e1(qa7.a.f243970a);
                o block22 = new o(aVar9, 6);
                Intrinsics.checkNotNullParameter(block22, "block");
                viewControllerE15.H = block22;
                return viewControllerE15;
            case 10:
                com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar10 = (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ChooseDocumentsScreenContract$ModalStep step10 = (ChooseDocumentsScreenContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof ChooseDocumentsScreenContract$ModalStep.DeleteDocumentDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                File file = ((ChooseDocumentsScreenContract$ModalStep.DeleteDocumentDialog) step10).f96545a;
                ((n) aVar10.f96546q).getClass();
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.chooseDocuments_documents_delete_document, null, null, 14), new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.chooseDocuments_document_requirements_description, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.workflow.engine.R$string.chooseDocuments_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25), iuh.a.f168605a, null, null, 24));
                llh.j block23 = new llh.j(aVar10, file, 29);
                Intrinsics.checkNotNullParameter(block23, "block");
                actionsBottomSheetController.H = block23;
                return actionsBottomSheetController;
            case 11:
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.a aVar11 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AsftCancelBookingScreenContract$ModalStep step11 = (AsftCancelBookingScreenContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof AsftCancelBookingScreenContract$ModalStep.RevPointsInfo) {
                    return aVar11.e1(new hub.c(e0.ASFT));
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b bVar4 = (com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FreelancerCashbackBoosterScreenContract$ModalStep step12 = (FreelancerCashbackBoosterScreenContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof FreelancerCashbackBoosterScreenContract$ModalStep.NewSalePicker) {
                    return jr6.m.a(bVar4.f73751p, null, null, 3);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b bVar5 = (com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b) obj5;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                AutoTopUpFlowContract$Step step13 = (AutoTopUpFlowContract$Step) model;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof AutoTopUpFlowContract$Step.EditTopUpOrder) {
                    AutoTopUpFlowContract$Step.EditTopUpOrder editTopUpOrder = (AutoTopUpFlowContract$Step.EditTopUpOrder) step13;
                    EditTopUpOrderScreen editTopUpOrderScreen = new EditTopUpOrderScreen(new EditTopUpOrderScreenContract$InputData(editTopUpOrder.f88186a, editTopUpOrder.f88187b, bVar5.o.f88179b, editTopUpOrder.f88188c));
                    li8.n block24 = new li8.n(bVar5, 8, LazyFlowCoordinator5, step13);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    editTopUpOrderScreen.H = block24;
                    return editTopUpOrderScreen;
                }
                if (step13 instanceof AutoTopUpFlowContract$Step.CustomTopUpOrderAmount) {
                    AutoTopUpFlowContract$Step.CustomTopUpOrderAmount customTopUpOrderAmount = (AutoTopUpFlowContract$Step.CustomTopUpOrderAmount) step13;
                    CustomOrderAmountScreen customOrderAmountScreen = new CustomOrderAmountScreen(new CustomOrderAmountScreenContract$InputData(customTopUpOrderAmount.f88183a, customTopUpOrderAmount.f88184b, customTopUpOrderAmount.f88185c));
                    lul.d block25 = new lul.d(bVar5, step13, 3);
                    Intrinsics.checkNotNullParameter(block25, "block");
                    customOrderAmountScreen.H = block25;
                    return customOrderAmountScreen;
                }
                if (!(step13 instanceof AutoTopUpFlowContract$Step.AutoTopUpMethodsScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                AutoTopUpFlowContract$Step.AutoTopUpMethodsScreen autoTopUpMethodsScreen = (AutoTopUpFlowContract$Step.AutoTopUpMethodsScreen) step13;
                AutoTopUpMethodsScreen autoTopUpMethodsScreen2 = new AutoTopUpMethodsScreen(new AutoTopUpMethodsScreenContract$InputData(autoTopUpMethodsScreen.f88181a, autoTopUpMethodsScreen.f88182b));
                lxd.c block26 = new lxd.c(bVar5, 1);
                Intrinsics.checkNotNullParameter(block26, "block");
                autoTopUpMethodsScreen2.H = block26;
                return autoTopUpMethodsScreen2;
            case 14:
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) model;
                KProperty[] kPropertyArr = CheckoutCustomAmountScreen.T;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj6 = data2.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj6, (u80.d) ((CheckoutCustomAmountScreen) obj5).L.getValue(), null, null, false, false, 0, false, null, 1944);
            case 15:
                Intrinsics.checkNotNullParameter((Function1) model, "<unused var>");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                int i92 = R$drawable.uikit_icn_24_retry;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf = Float.valueOf(16.0f);
                return yp0.b.g(u.c(new RowDelegate.Model("ID_NEARBY_AIRPORTS_ERROR_ITEM", new RowDelegate.Model.MainImage.Image40((LayeredImage) ((lxi.d) obj5).f200583b.getValue(), null, null, false, null, false, 62), textLocalisedClause2, null, 0, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(i92, numValueOf, fValueOf, fValueOf, 16), new TextLocalisedClause(R.string.common_action_try_again, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10))), null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("nearbyAirportsSubheaderId", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_nearby_airports_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            case 16:
                final com.revolut.camerakit.revolut.ui.flow.b bVar6 = (com.revolut.camerakit.revolut.ui.flow.b) obj5;
                CameraKitFlowContract$Step step14 = (CameraKitFlowContract$Step) model;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof CameraKitFlowContract$Step.Camera) {
                    ly.c cVar = bVar6.o;
                    CameraKitFlowContract$FlowType cameraKitFlowContract$FlowType = cVar.f200604a;
                    ViewController cameraKitTerminalCameraViewController = ((cameraKitFlowContract$FlowType instanceof CameraKitFlowContract$FlowType.Selfie) && ((CameraKitFlowContract$FlowType.Selfie) cameraKitFlowContract$FlowType).f50795a == com.revolut.camerakit.revolut.ui.flow.a.TERMINAL) ? new CameraKitTerminalCameraViewController(new vy.a(cVar.f200604a, cVar.f200605b, cVar.f200606c, cVar.d, cVar.e, cVar.f, cVar.f200607g, cVar.f200608h, null, cVar.k)) : new CameraKitCameraScreen(new vy.a(cVar.f200604a, cVar.f200605b, cVar.f200606c, cVar.d, cVar.e, cVar.f, cVar.f200607g, cVar.f200608h, cVar.f200609j, cVar.k));
                    final int i96 = false ? 1 : 0;
                    Function1 block27 = new Function1() { // from class: ly.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) throws Throwable {
                            switch (i96) {
                                case 0:
                                    vy.e output = (vy.e) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z4 = output instanceof vy.b;
                                    com.revolut.camerakit.revolut.ui.flow.b bVar7 = bVar6;
                                    if (z4) {
                                        bVar7.C2(new d(((vy.b) output).f293113a));
                                    } else if (output instanceof vy.d) {
                                        vy.d dVar6 = (vy.d) output;
                                        bVar7.C2(new f(dVar6.f293117a, dVar6.f293118b, dVar6.f293119c));
                                    } else {
                                        if (!(output instanceof vy.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        vy.c cVar2 = (vy.c) output;
                                        bVar7.C2(new e(cVar2.f293114a, cVar2.f293115b, cVar2.f293116c, cVar2.d, cVar2.e));
                                    }
                                    return Unit.f186387a;
                                default:
                                    r7a.i permissionFlowOutput = (r7a.i) obj7;
                                    Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                                    if (!(permissionFlowOutput instanceof r7a.e) && !(permissionFlowOutput instanceof r7a.f)) {
                                        if (permissionFlowOutput instanceof r7a.h) {
                                            com.revolut.camerakit.revolut.ui.flow.b bVar8 = bVar6;
                                            oki.h.t2(bVar8, bVar8.f50798p, CameraKitFlowContract$Step.Camera.f50796a, false, null, false, 12);
                                        } else {
                                            if (!(permissionFlowOutput instanceof r7a.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            try {
                                                m.Companion companion = yhm.m.INSTANCE;
                                                throw new IllegalStateException("Unhandled secondary click");
                                            } catch (CancellationException e) {
                                                throw e;
                                            } catch (Throwable th10) {
                                                m.Companion companion2 = yhm.m.INSTANCE;
                                                Throwable thA = yhm.m.a(yhm.o.a(th10));
                                                if (thA != null) {
                                                    hx7.e.n(thA);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block27, "block");
                    cameraKitTerminalCameraViewController.H = block27;
                    return cameraKitTerminalCameraViewController;
                }
                if (!(step14 instanceof CameraKitFlowContract$Step.Permissions)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(((CameraKitFlowContract$Step.Permissions) step14).f50797a));
                final int i99 = 1;
                Function1 block28 = new Function1() { // from class: ly.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) throws Throwable {
                        switch (i99) {
                            case 0:
                                vy.e output = (vy.e) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z4 = output instanceof vy.b;
                                com.revolut.camerakit.revolut.ui.flow.b bVar7 = bVar6;
                                if (z4) {
                                    bVar7.C2(new d(((vy.b) output).f293113a));
                                } else if (output instanceof vy.d) {
                                    vy.d dVar6 = (vy.d) output;
                                    bVar7.C2(new f(dVar6.f293117a, dVar6.f293118b, dVar6.f293119c));
                                } else {
                                    if (!(output instanceof vy.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    vy.c cVar2 = (vy.c) output;
                                    bVar7.C2(new e(cVar2.f293114a, cVar2.f293115b, cVar2.f293116c, cVar2.d, cVar2.e));
                                }
                                return Unit.f186387a;
                            default:
                                r7a.i permissionFlowOutput = (r7a.i) obj7;
                                Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                                if (!(permissionFlowOutput instanceof r7a.e) && !(permissionFlowOutput instanceof r7a.f)) {
                                    if (permissionFlowOutput instanceof r7a.h) {
                                        com.revolut.camerakit.revolut.ui.flow.b bVar8 = bVar6;
                                        oki.h.t2(bVar8, bVar8.f50798p, CameraKitFlowContract$Step.Camera.f50796a, false, null, false, 12);
                                    } else {
                                        if (!(permissionFlowOutput instanceof r7a.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Unhandled secondary click");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA != null) {
                                                hx7.e.n(thA);
                                            }
                                        }
                                    }
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block28, "block");
                permissionsController.H = block28;
                return permissionsController;
            case 17:
                yi0.a aVar12 = (yi0.a) obj5;
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(model, "model");
                if ((model instanceof com.revolut.core.ui_kit.widget.dashboard.a) && Intrinsics.f(((com.revolut.core.ui_kit.widget.dashboard.a) model).f59771b, aVar12)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c cVar2 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c) obj5;
                yki.b LazyFlowCoordinator6 = (yki.b) obj2;
                IdealTopUpFlowContract$Step step15 = (IdealTopUpFlowContract$Step) model;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator6, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof IdealTopUpFlowContract$Step.ThreeDs)) {
                    throw new NoWhenBranchMatchedException();
                }
                ThreeDsScreen threeDsScreen = new ThreeDsScreen(new dze.d(null, ((IdealTopUpFlowContract$Step.ThreeDs) step15).f90998a, true));
                lul.d block29 = new lul.d(cVar2, LazyFlowCoordinator6, 9);
                Intrinsics.checkNotNullParameter(block29, "block");
                threeDsScreen.H = block29;
                return threeDsScreen;
            case 19:
                com.revolut.feature.statements.impl.ui.savings.flow.a aVar13 = (com.revolut.feature.statements.impl.ui.savings.flow.a) obj5;
                SavingsStatementsFlowContract$InputData savingsStatementsFlowContract$InputData = aVar13.o;
                SavingsStatementsFlowContract$Step step16 = (SavingsStatementsFlowContract$Step) model;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof SavingsStatementsFlowContract$Step.AccountSelection)) {
                    if (step16 instanceof SavingsStatementsFlowContract$Step.StatementGeneration) {
                        return new SavingsStatementsScreen(new SavingsStatementsScreenContract$InputData(((SavingsStatementsFlowContract$Step.StatementGeneration) step16).f88386a, savingsStatementsFlowContract$InputData.f88384b));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE16 = aVar13.e1(new cjb.b(new SavingsAccountsSelectionControllerDescriptor$InputData(savingsStatementsFlowContract$InputData.f88384b, h0.f322473a)));
                o block30 = new o(aVar13, 25);
                Intrinsics.checkNotNullParameter(block30, "block");
                viewControllerE16.H = block30;
                return viewControllerE16;
            case 20:
                m0k.b params = (m0k.b) obj2;
                boolean zBooleanValue = ((Boolean) model).booleanValue();
                Intrinsics.checkNotNullParameter(params, "params");
                return m0k.e.b((m0k.e) obj5, params.f201155a, params.f201156b, null, null, params.f201157c, params.d, 40, zBooleanValue, 12).map(new m0g.d(2, new o(params, 28)));
            case 21:
                com.revolut.crypto.challenge.impl.ui.screen.progress.a aVar14 = (com.revolut.crypto.challenge.impl.ui.screen.progress.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoChallengeProgressContract$ModalStep step17 = (CryptoChallengeProgressContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (!(step17 instanceof CryptoChallengeProgressContract$ModalStep.ConfirmClaim)) {
                    if (step17 instanceof CryptoChallengeProgressContract$ModalStep.Conditions) {
                        return new ConditionsBottomSheetController(new ConditionsBottomSheetContract$InputData(((CryptoChallengeProgressContract$ModalStep.Conditions) step17).f60121a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                PlanReward.Eligible eligible = ((CryptoChallengeProgressContract$ModalStep.ConfirmClaim) step17).f60122a;
                e11.d dVar6 = aVar14.o;
                f11.c cVar3 = eligible.f60116a;
                dVar6.getClass();
                TextLocalisedClause textLocalisedClauseA = e11.d.a(cVar3);
                LocalDate localDate2 = eligible.f60117b.f60106b.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                ClaimRewardBottomSheetController claimRewardBottomSheetController = new ClaimRewardBottomSheetController(new b11.a(textLocalisedClauseA, localDate2, eligible.f60116a != f11.c.ULTRA));
                m11.h block31 = new m11.h(aVar14, false ? 1 : 0);
                Intrinsics.checkNotNullParameter(block31, "block");
                claimRewardBottomSheetController.H = block31;
                return claimRewardBottomSheetController;
            case 22:
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar15 = (com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator9 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TradeRevPointsTransferScreenContract$ModalStep step18 = (TradeRevPointsTransferScreenContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator9, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (!(step18 instanceof TradeRevPointsTransferScreenContract$ModalStep.Breakdown)) {
                    if (!(step18 instanceof TradeRevPointsTransferScreenContract$ModalStep.LimitInfo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TradeRevPointsTransferScreenContract$ModalStep.LimitInfo limitInfo = (TradeRevPointsTransferScreenContract$ModalStep.LimitInfo) step18;
                    return new TradeRevPointsAccountLimitInfoScreen(new TradeRevPointsAccountLimitInfoScreenContract$InputData(limitInfo.f91162a, limitInfo.f91163b));
                }
                y yVar = aVar15.E;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                int i100 = m2f.v.f201995a[((m2f.l) j2Var.getValue()).f201981j.ordinal()];
                if (i100 == 1 || i100 == 2) {
                    revPoints = new TradeRevPointsTransferBreakdownScreenContract$InputData.RevPoints(((m2f.l) j2Var2.getValue()).e, ((TradeRevPointsTransferScreenContract$ModalStep.Breakdown) step18).f91161a);
                } else {
                    if (i100 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    revPoints = new TradeRevPointsTransferBreakdownScreenContract$InputData.PartnerPoints(((m2f.l) j2Var2.getValue()).f201979g, ((TradeRevPointsTransferScreenContract$ModalStep.Breakdown) step18).f91161a);
                }
                return new TradeRevPointsTransferBreakdownScreen(revPoints);
            case 23:
                String fieldKey = (String) obj2;
                String fieldValue = (String) model;
                Intrinsics.checkNotNullParameter(fieldKey, "fieldKey");
                Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
                return u.c(new TextClause(((m3j.h) obj5).f202576c.b(fieldKey, fieldValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 24:
                Function1 getDefaultErrorItems = (Function1) model;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                List list2 = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                Clause textLocalisedClause3 = ((m4b.f) obj5).f202688a.f202686a;
                if (textLocalisedClause3 == null) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_risk_warning_title, null, null, 14);
                }
                return new cii.b(null, list2, new lw0.a(textLocalisedClause3, null, null, null, false, 30));
            case 25:
                return a(obj2, model);
            case 26:
                return b(obj2, model);
            case 27:
                return c(obj2, model);
            case 28:
                TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen = (TravelFlightsPassengersDetailsScreen) obj5;
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) model;
                KProperty[] kPropertyArr2 = TravelFlightsPassengersDetailsScreen.T;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj7 = model2.P;
                zp0.v vVar = obj7 instanceof zp0.v ? (zp0.v) obj7 : null;
                if (vVar != null) {
                    return new zp0.w(vVar, field2.getInnerEditText(), u.b.f324147a, new lul.d(travelFlightsPassengersDetailsScreen, model2, 24), DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                }
                return null;
            default:
                final com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar16 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator10 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final TravelFlightsPassengersDetailsScreenContract$ModalStep step19 = (TravelFlightsPassengersDetailsScreenContract$ModalStep) model;
                Intrinsics.checkNotNullParameter(ModalCoordinator10, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (step19 instanceof TravelFlightsPassengersDetailsScreenContract$ModalStep.CountrySelection) {
                    TravelFlightsPassengersDetailsScreenContract$ModalStep.CountrySelection countrySelection = (TravelFlightsPassengersDetailsScreenContract$ModalStep.CountrySelection) step19;
                    Clause clause = countrySelection.f93359b;
                    wi0.b bVar7 = countrySelection.f93360c;
                    x xVar = new x(clause, null, null, null, false, null, new TextLocalisedClause(R.string.search_country, null, null, 14), null, null, false, null, bVar7 != null ? bVar7.f297794a : null, null, null, true, null, null, null, null, null, 2138963454);
                    Object obj8 = aVar16.f93367r.get();
                    Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                    PickerController pickerController = new PickerController(xVar, (x7a.d) obj8);
                    final int i101 = false ? 1 : 0;
                    Function1 block32 = new Function1() { // from class: m6g.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            String str4;
                            switch (i101) {
                                case 0:
                                    a0 data3 = (a0) obj9;
                                    Intrinsics.checkNotNullParameter(data3, "data");
                                    c0 c0Var = data3.f260599a;
                                    c8a.a aVar17 = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                                    if (aVar17 != null && (str4 = aVar17.f22154a) != null) {
                                        String str5 = ((TravelFlightsPassengersDetailsScreenContract$ModalStep.CountrySelection) step19).f93358a;
                                        wi0.b.Companion.getClass();
                                        wi0.b bVarA = wi0.a.a(str4);
                                        com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar18 = aVar16;
                                        aVar18.H2(aVar18.D, new a9j.n(str5, 7, bVarA, aVar18));
                                    }
                                    break;
                                default:
                                    eii.k output = (eii.k) obj9;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof eii.i) {
                                        Object obj10 = ((eii.i) output).f126655a;
                                        TravelFlightsPassengerField$Selection$Option travelFlightsPassengerField$Selection$Option = obj10 instanceof TravelFlightsPassengerField$Selection$Option ? (TravelFlightsPassengerField$Selection$Option) obj10 : null;
                                        if (travelFlightsPassengerField$Selection$Option != null) {
                                            String str6 = ((TravelFlightsPassengersDetailsScreenContract$ModalStep.OptionSelection) step19).f93361a;
                                            com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar19 = aVar16;
                                            aVar19.H2(aVar19.D, new a9j.n(str6, 8, travelFlightsPassengerField$Selection$Option, aVar19));
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block32, "block");
                    pickerController.H = block32;
                    return pickerController;
                }
                if (!(step19 instanceof TravelFlightsPassengersDetailsScreenContract$ModalStep.OptionSelection)) {
                    if (!(step19 instanceof TravelFlightsPassengersDetailsScreenContract$ModalStep.PriceChanged)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar16.v.getClass();
                    return j4g.c.a(new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_booking_contact_bottom_sheet_got_it, null, null, 14));
                }
                TravelFlightsPassengersDetailsScreenContract$ModalStep.OptionSelection optionSelection = (TravelFlightsPassengersDetailsScreenContract$ModalStep.OptionSelection) step19;
                lw0.a aVar17 = new lw0.a(optionSelection.f93362b, null, null, null, false, 28);
                List<TravelFlightsPassengerField$Selection$Option> list3 = optionSelection.f93363c;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                for (TravelFlightsPassengerField$Selection$Option travelFlightsPassengerField$Selection$Option : list3) {
                    arrayList3.add(new eii.l(travelFlightsPassengerField$Selection$Option.f93374b, (Clause) null, (RowDelegate.Model.MainImage) null, true, Intrinsics.f(travelFlightsPassengerField$Selection$Option.f93373a, optionSelection.d), (RowDelegate.Model.c) null, (Object) travelFlightsPassengerField$Selection$Option, 200));
                }
                k9 k9Var = k9.Travel;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar17, null, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
                final int i102 = 1;
                Function1 block33 = new Function1() { // from class: m6g.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        String str4;
                        switch (i102) {
                            case 0:
                                a0 data3 = (a0) obj9;
                                Intrinsics.checkNotNullParameter(data3, "data");
                                c0 c0Var = data3.f260599a;
                                c8a.a aVar172 = c0Var instanceof c8a.a ? (c8a.a) c0Var : null;
                                if (aVar172 != null && (str4 = aVar172.f22154a) != null) {
                                    String str5 = ((TravelFlightsPassengersDetailsScreenContract$ModalStep.CountrySelection) step19).f93358a;
                                    wi0.b.Companion.getClass();
                                    wi0.b bVarA = wi0.a.a(str4);
                                    com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar18 = aVar16;
                                    aVar18.H2(aVar18.D, new a9j.n(str5, 7, bVarA, aVar18));
                                }
                                break;
                            default:
                                eii.k output = (eii.k) obj9;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof eii.i) {
                                    Object obj10 = ((eii.i) output).f126655a;
                                    TravelFlightsPassengerField$Selection$Option travelFlightsPassengerField$Selection$Option2 = obj10 instanceof TravelFlightsPassengerField$Selection$Option ? (TravelFlightsPassengerField$Selection$Option) obj10 : null;
                                    if (travelFlightsPassengerField$Selection$Option2 != null) {
                                        String str6 = ((TravelFlightsPassengersDetailsScreenContract$ModalStep.OptionSelection) step19).f93361a;
                                        com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar19 = aVar16;
                                        aVar19.H2(aVar19.D, new a9j.n(str6, 8, travelFlightsPassengerField$Selection$Option2, aVar19));
                                    }
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block33, "block");
                rowActionsBottomSheetController.H = block33;
                return rowActionsBottomSheetController;
        }
    }
}
