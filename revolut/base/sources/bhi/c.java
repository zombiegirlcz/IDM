package bhi;

import android.os.Parcelable;
import aw0.n6;
import beg.k;
import blj.n;
import blj.v;
import bo8.e0;
import bq5.n0;
import bq7.j;
import bs4.r;
import bs4.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.common.impl.flow.field_search.flow.AddressFieldSearchFlowContract$InputData;
import com.revolut.feature.address.common.impl.flow.field_search.flow.AddressFieldSearchFlowContract$Step;
import com.revolut.feature.address.common.impl.flow.field_search.manual.AddManuallyScreen;
import com.revolut.feature.address.common.impl.flow.field_search.manual.AddManuallyScreenContract$InputData;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreen;
import com.revolut.feature.address.common.impl.flow.field_search.search.FieldSearchScreenContract$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$Step;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayBillerData;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData;
import com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.BPayTransferBreakdownScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.breakdown.BPayTransferBreakdownScreenContract$InputData;
import com.revolut.feature.apm.bills.bpay.impl.screen.input.InputScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreen;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.TextInputMask;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.custom_solicitor_details.CustomSolicitorDetailsControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorController;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorControllerContract$InputData;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_card_limit.CreditCardLimitDialogScreen;
import com.revolut.feature.credit.card.impl.ui.credit_card_limit.CreditCardLimitDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsController;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreenContract$OverdueDialogType;
import com.revolut.feature.credit.card.impl.ui.items.bottom_sheet.CreditCardBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountScreen;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlow;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreenContract$ModalStep;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingFlowInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$Modal;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog.CryptoRecipientTypeDialogController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog.CryptoRecipientTypeDialogControllerContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.CryptoAddressHostingFlow;
import com.revolut.feature.junior_onboarding.api.model.OnboardingWorkflow;
import com.revolut.feature.junior_onboarding.impl.ui.creation.JuniorCreationFlowContract$Step;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.JuniorPersonalDataCreationFlow;
import com.revolut.feature.kyc.impl.hyperverge.portal.HypervergePortalScreen;
import com.revolut.feature.kyc.impl.hyperverge.videoconference.HypervergeVideoKycFlowContract$InputData;
import com.revolut.feature.kyc.impl.hyperverge.videoconference.HypervergeVideoKycFlowContract$Step;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationControllerContract$InputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationControllerContract$Step;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.ViewSplitItemsController;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$ModalSteps;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreen;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreenContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.CancelSalarySwitchScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.cancel.CancelSalarySwitchScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute.SalaryDisputeScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.dispute.SalaryDisputeScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreenContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreenContract$ModalStep;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.TransactionsDayNightLimitsFlowContract$PagerItem;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreenContract$InputData;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleController;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleControllerContract$InputData;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreenContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.screener.flows.filters.ScreenerFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.filters.ScreenerFiltersFlowContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.ScreenerNewCollectionFlowContract$Step;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection.NewCollectionScreen;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature_workflow_reminder_impl.ui.flow.WorkflowReminderFlowContract$Step;
import com.revolut.feature_workflow_reminder_impl.ui.reminder.WorkflowReminderController;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerController;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.GraduateStudentFlowContract$Step;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.sso.impl.ui.passkeys_management.PasskeysManagementFlowContract$Step;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.PasskeysListController;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.DeletePasskeyConfirmationBottomSheet;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.DeletePasskeyConfirmationBottomSheetContract$InputData;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlowContract$Step;
import grl.k9;
import grl.q6;
import ip0.n30;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import r7a.f;
import r7a.g;
import r7a.h;
import s7a.x;
import til.m;
import vkm.j2;
import xs8.b;
import xzg.b0;
import xzg.d0;
import yki.l;
import yv8.e;
import zhm.h0;
import zhm.u;
import zjh.i;
import zp0.d;
import zp0.y;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15300b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f15299a = i;
        this.f15300b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.trading.orders.ui.flows.trading_asset_details.a aVar = (com.revolut.trading.orders.ui.flows.trading_asset_details.a) this.f15300b;
        l FlowCoordinator = (l) obj2;
        RecurringBuyAssetDetailsFlowContract$Step step = (RecurringBuyAssetDetailsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof RecurringBuyAssetDetailsFlowContract$Step.DefaultStep) {
            return aVar.e1(new vqk.a(new AssetDetailsDestination(aVar.o.f106822a, null, false, null, null, null, 58)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    private final Object b(Object obj2, Object obj3) {
        CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen = (CreditCardBoletoPaymentAmountScreen) this.f15300b;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = CreditCardBoletoPaymentAmountScreen.W;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.f51981p;
        xi0.b bVar = obj4 instanceof xi0.b ? (xi0.b) obj4 : null;
        if (bVar != null) {
            return new d(field.getEditText(), bVar, (u80.d) creditCardBoletoPaymentAmountScreen.Q.getValue(), null, new i(creditCardBoletoPaymentAmountScreen, 14), false, false, 0, false, null, 1928);
        }
        return null;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar = (com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) this.f15300b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CreditCardStatementFinancingConfirmationScreenContract$ModalStep step = (CreditCardStatementFinancingConfirmationScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof CreditCardStatementFinancingConfirmationScreenContract$ModalStep.Dialog)) {
            throw new NoWhenBranchMatchedException();
        }
        lt4.d dVar = aVar.u;
        CreditCardDialogModel dialogModel = ((CreditCardStatementFinancingConfirmationScreenContract$ModalStep.Dialog) step).f69733a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return new CreditCardBottomSheetController(new CreditCardDialog$InputData.PreLoadedContent(dialogModel));
    }

    private final Object d(Object obj2, Object obj3) {
        final com.revolut.feature.kyc.impl.hyperverge.videoconference.a aVar = (com.revolut.feature.kyc.impl.hyperverge.videoconference.a) this.f15300b;
        l FlowCoordinator = (l) obj2;
        HypervergeVideoKycFlowContract$Step step = (HypervergeVideoKycFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof HypervergeVideoKycFlowContract$Step.Portal) {
            HypervergeVideoKycFlowContract$InputData hypervergeVideoKycFlowContract$InputData = aVar.o;
            HypervergePortalScreen hypervergePortalScreen = new HypervergePortalScreen(new e(hypervergeVideoKycFlowContract$InputData.f77772a, hypervergeVideoKycFlowContract$InputData.f77773b, true, false));
            final int i = 1;
            Function1 block = new Function1() { // from class: bw8.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    int i2 = i;
                    b.a aVar2 = b.a.f308438a;
                    switch (i2) {
                        case 0:
                            r7a.i result = (r7a.i) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof h;
                            com.revolut.feature.kyc.impl.hyperverge.videoconference.a aVar3 = aVar;
                            if (z) {
                                oki.h.t2(aVar3, aVar3.f77776p, HypervergeVideoKycFlowContract$Step.Portal.f77774a, false, null, false, 12);
                            } else if ((result instanceof r7a.e) || (result instanceof f)) {
                                aVar3.C2(aVar2);
                            } else {
                                if (!Intrinsics.f(result, g.f252056a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException("Unexpected output for Permission controller in HypervergeVideoKycFlow");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                            return Unit.f186387a;
                        default:
                            yv8.h output = (yv8.h) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z3 = output instanceof yv8.f;
                            com.revolut.feature.kyc.impl.hyperverge.videoconference.a aVar4 = aVar;
                            if (z3) {
                                aVar4.C2(aVar2);
                            } else {
                                if (!(output instanceof yv8.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.C2(new xs8.c(((yv8.g) output).f317145a));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            hypervergePortalScreen.H = block;
            return hypervergePortalScreen;
        }
        if (!(step instanceof HypervergeVideoKycFlowContract$Step.RequestPermission)) {
            throw new NoWhenBranchMatchedException();
        }
        PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(((HypervergeVideoKycFlowContract$Step.RequestPermission) step).f77775a));
        final int i2 = 0;
        Function1 block2 = new Function1() { // from class: bw8.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i22 = i2;
                b.a aVar2 = b.a.f308438a;
                switch (i22) {
                    case 0:
                        r7a.i result = (r7a.i) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z = result instanceof h;
                        com.revolut.feature.kyc.impl.hyperverge.videoconference.a aVar3 = aVar;
                        if (z) {
                            oki.h.t2(aVar3, aVar3.f77776p, HypervergeVideoKycFlowContract$Step.Portal.f77774a, false, null, false, 12);
                        } else if ((result instanceof r7a.e) || (result instanceof f)) {
                            aVar3.C2(aVar2);
                        } else {
                            if (!Intrinsics.f(result, g.f252056a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IllegalStateException illegalStateException = new IllegalStateException("Unexpected output for Permission controller in HypervergeVideoKycFlow");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        }
                        return Unit.f186387a;
                    default:
                        yv8.h output = (yv8.h) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z3 = output instanceof yv8.f;
                        com.revolut.feature.kyc.impl.hyperverge.videoconference.a aVar4 = aVar;
                        if (z3) {
                            aVar4.C2(aVar2);
                        } else {
                            if (!(output instanceof yv8.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar4.C2(new xs8.c(((yv8.g) output).f317145a));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        permissionsController.H = block2;
        return permissionsController;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController bPayReviewScreen;
        ActionsBottomSheetController actionsBottomSheetController;
        com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController actionsBottomSheetControllerB;
        int i = this.f15299a;
        int i2 = 22;
        final int i3 = 2;
        int i5 = 3;
        int i6 = 14;
        final int i21 = 1;
        final int i22 = 0;
        Object obj4 = this.f15300b;
        switch (i) {
            case 0:
                com.revolut.feature_workflow_reminder_impl.ui.flow.a aVar = (com.revolut.feature_workflow_reminder_impl.ui.flow.a) obj4;
                l FlowCoordinator = (l) obj2;
                WorkflowReminderFlowContract$Step step = (WorkflowReminderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, WorkflowReminderFlowContract$Step.ChooseReminder.f98187a)) {
                    WorkflowReminderController workflowReminderController = new WorkflowReminderController();
                    k block = new k(aVar, FlowCoordinator, 7);
                    Intrinsics.checkNotNullParameter(block, "block");
                    workflowReminderController.H = block;
                    return workflowReminderController;
                }
                if (!(step instanceof WorkflowReminderFlowContract$Step.SetTimer)) {
                    throw new NoWhenBranchMatchedException();
                }
                WorkflowTimerController workflowTimerController = new WorkflowTimerController(new WorkflowTimerControllerContract$InputData(((WorkflowReminderFlowContract$Step.SetTimer) step).f98188a));
                b9i.f block2 = new b9i.f(aVar, 28);
                Intrinsics.checkNotNullParameter(block2, "block");
                workflowTimerController.H = block2;
                return workflowTimerController;
            case 1:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                GraduateStudentFlowContract$Step step2 = (GraduateStudentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, GraduateStudentFlowContract$Step.ProductArticle.f103038a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductArticleParams productArticleParams = bVar.f103041r;
                k9 k9Var = k9.Premium;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE1 = bVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 48));
                bhk.f block3 = new bhk.f(bVar, 1);
                Intrinsics.checkNotNullParameter(block3, "block");
                viewControllerE1.H = block3;
                return viewControllerE1;
            case 2:
                final com.revolut.feature.address.common.impl.flow.field_search.flow.a aVar2 = (com.revolut.feature.address.common.impl.flow.field_search.flow.a) obj4;
                AddressFieldSearchFlowContract$InputData addressFieldSearchFlowContract$InputData = aVar2.o;
                AddressFieldSearchFlowContract$Step step3 = (AddressFieldSearchFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (Intrinsics.f(step3, AddressFieldSearchFlowContract$Step.Search.f60969a)) {
                    FieldSearchScreen fieldSearchScreen = new FieldSearchScreen(new FieldSearchScreenContract$InputData(addressFieldSearchFlowContract$InputData.f60964a, addressFieldSearchFlowContract$InputData.f60965b, addressFieldSearchFlowContract$InputData.f60966c, addressFieldSearchFlowContract$InputData.d, addressFieldSearchFlowContract$InputData.e, addressFieldSearchFlowContract$InputData.f, addressFieldSearchFlowContract$InputData.f60967g));
                    final int i32 = 0;
                    Function1 block4 = new Function1() { // from class: bi1.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i32) {
                                case 0:
                                    ei1.h output = (ei1.h) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z = output instanceof ei1.g;
                                    com.revolut.feature.address.common.impl.flow.field_search.flow.a aVar3 = aVar2;
                                    if (z) {
                                        aVar3.C2(new c(((ei1.g) output).f126347a));
                                    } else {
                                        if (!(output instanceof ei1.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (aVar3.o.d) {
                                            oki.h.t2(aVar3, aVar3.f60970p, new AddressFieldSearchFlowContract$Step.AddManually(((ei1.f) output).f126346a), false, null, false, 14);
                                        } else {
                                            r6.b.D("Manual input is not allowed for the flow");
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    ci1.f output2 = (ci1.f) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    aVar2.C2(new c(output2.f24344a));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    fieldSearchScreen.H = block4;
                    return fieldSearchScreen;
                }
                if (!(step3 instanceof AddressFieldSearchFlowContract$Step.AddManually)) {
                    throw new NoWhenBranchMatchedException();
                }
                AddManuallyScreen addManuallyScreen = new AddManuallyScreen(new AddManuallyScreenContract$InputData(addressFieldSearchFlowContract$InputData.f60965b, ((AddressFieldSearchFlowContract$Step.AddManually) step3).f60968a, addressFieldSearchFlowContract$InputData.f, addressFieldSearchFlowContract$InputData.f60967g));
                final int i33 = 1;
                Function1 block5 = new Function1() { // from class: bi1.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i33) {
                            case 0:
                                ei1.h output = (ei1.h) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z = output instanceof ei1.g;
                                com.revolut.feature.address.common.impl.flow.field_search.flow.a aVar3 = aVar2;
                                if (z) {
                                    aVar3.C2(new c(((ei1.g) output).f126347a));
                                } else {
                                    if (!(output instanceof ei1.f)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (aVar3.o.d) {
                                        oki.h.t2(aVar3, aVar3.f60970p, new AddressFieldSearchFlowContract$Step.AddManually(((ei1.f) output).f126346a), false, null, false, 14);
                                    } else {
                                        r6.b.D("Manual input is not allowed for the flow");
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                ci1.f output2 = (ci1.f) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                aVar2.C2(new c(output2.f24344a));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block5, "block");
                addManuallyScreen.H = block5;
                return addManuallyScreen;
            case 3:
                com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.h hVar = (com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.h) obj4;
                SolicitorSelectionFlowContract$Step step4 = (SolicitorSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof SolicitorSelectionFlowContract$Step.Initial) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.loading.a.a();
                }
                if (step4 instanceof SolicitorSelectionFlowContract$Step.CustomSolicitorAddress) {
                    SolicitorSelectionFlowContract$Step.CustomSolicitorAddress customSolicitorAddress = (SolicitorSelectionFlowContract$Step.CustomSolicitorAddress) step4;
                    Address address = new Address(null, null, null, null, null, customSolicitorAddress.f68381b.getCountry(), null, null, null, null, null, null, null, null, null, 32735, null);
                    int i43 = R$string.credit_application_solicitor_selection_custom_solicitor_address_title;
                    ez3.c cVar = customSolicitorAddress.f68380a;
                    ViewController viewControllerE12 = hVar.e1(new th1.a(new AddressFlowContract$InputData(address, new TextLocalisedClause(i43, u.c(cVar.f130890b.f130883a), null, 12), null, false, new TextLocalisedClause(R$string.credit_application_solicitor_selection_custom_solicitor_address_button, u.c(cVar.f130890b.f130884b), null, 12), FieldMode.Hidden.f60954a, null, null, true, null, 1965884), null, null, 6));
                    k block6 = new k(hVar, customSolicitorAddress, i6);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE12.H = block6;
                    return viewControllerE12;
                }
                if (step4 instanceof SolicitorSelectionFlowContract$Step.CustomSolicitorDetails) {
                    SolicitorSelectionFlowContract$Step.CustomSolicitorDetails customSolicitorDetails = (SolicitorSelectionFlowContract$Step.CustomSolicitorDetails) step4;
                    CustomSolicitorDetailsController customSolicitorDetailsController = new CustomSolicitorDetailsController(new CustomSolicitorDetailsControllerContract$InputData(customSolicitorDetails.f68383a.f130889a, nz8.d.p(customSolicitorDetails.f68384b)));
                    k block7 = new k(hVar, customSolicitorDetails, 16);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    customSolicitorDetailsController.H = block7;
                    return customSolicitorDetailsController;
                }
                if (step4 instanceof SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails) {
                    SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails partnerSolicitorDetails = (SolicitorSelectionFlowContract$Step.PartnerSolicitorDetails) step4;
                    PartnerSolicitorDetailsController partnerSolicitorDetailsController = new PartnerSolicitorDetailsController(new PartnerSolicitorDetailsControllerContract$InputData(partnerSolicitorDetails.f68386a.f130892a));
                    k block8 = new k(hVar, partnerSolicitorDetails, 15);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    partnerSolicitorDetailsController.H = block8;
                    return partnerSolicitorDetailsController;
                }
                if (!(step4 instanceof SolicitorSelectionFlowContract$Step.SelectSolicitor)) {
                    throw new NoWhenBranchMatchedException();
                }
                SolicitorSelectionFlowContract$Step.SelectSolicitor selectSolicitor = (SolicitorSelectionFlowContract$Step.SelectSolicitor) step4;
                SelectSolicitorController selectSolicitorController = new SelectSolicitorController(new SelectSolicitorControllerContract$InputData(selectSolicitor.f68387a.f130908a));
                k block9 = new k(hVar, selectSolicitor, 13);
                Intrinsics.checkNotNullParameter(block9, "block");
                selectSolicitorController.H = block9;
                return selectSolicitorController;
            case 4:
                com.revolut.feature.junior_onboarding.impl.ui.creation.a aVar3 = (com.revolut.feature.junior_onboarding.impl.ui.creation.a) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                JuniorCreationFlowContract$Step step5 = (JuniorCreationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof JuniorCreationFlowContract$Step.Workflow) {
                    OnboardingWorkflow onboardingWorkflow = ((JuniorCreationFlowContract$Step.Workflow) step5).f76990a;
                    m mVar = aVar3.o;
                    String str = onboardingWorkflow.f76957a;
                    q6 value = q6.Onboarding;
                    Parcelable.Creator<AnalyticsProduct.Junior> creator2 = AnalyticsProduct.Junior.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    WorkflowFlow workflowFlowB = m.b(mVar, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, new AnalyticsProduct.Junior(value), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 56);
                    k block10 = new k(aVar3, onboardingWorkflow, 17);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    workflowFlowB.H = block10;
                    return workflowFlowB;
                }
                if (step5 instanceof JuniorCreationFlowContract$Step.JuniorIsaAccountsPicker) {
                    ViewController viewControllerE13 = aVar3.e1(t98.a.f268958a);
                    ax9.d block11 = new ax9.d(1, aVar3, com.revolut.feature.junior_onboarding.impl.ui.creation.a.class, "handleJisaAccountPickerResult", "handleJisaAccountPickerResult(Lcom/revolut/feature/junior/isa/api/navigation/TradingAccountPickerFlowPublicContract$OutputData;)V", 0, 20);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    viewControllerE13.H = block11;
                    return viewControllerE13;
                }
                if (!(step5 instanceof JuniorCreationFlowContract$Step.JuniorPersonalDataCreation)) {
                    throw new NoWhenBranchMatchedException();
                }
                JuniorPersonalDataCreationFlow juniorPersonalDataCreationFlow = new JuniorPersonalDataCreationFlow();
                ax9.d block12 = new ax9.d(1, aVar3, com.revolut.feature.junior_onboarding.impl.ui.creation.a.class, "handlePersonalDataCreationResult", "handlePersonalDataCreationResult(Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$OutputData;)V", 0, 21);
                Intrinsics.checkNotNullParameter(block12, "block");
                juniorPersonalDataCreationFlow.H = block12;
                return juniorPersonalDataCreationFlow;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new fpa.g(((aj8.a) ((a3e.u) obj4).f1129b).a(), null, null, 6);
            case 6:
                com.revolut.feature.tab.invest.impl.ui.home.f fVar = (com.revolut.feature.tab.invest.impl.ui.home.f) obj4;
                ile.a aVar4 = fVar.f89870a0;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TabInvestControllerContract$ModalStep step6 = (TabInvestControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (Intrinsics.f(step6, TabInvestControllerContract$ModalStep.ThemeCustomisation.f89852a)) {
                    return aVar4.d3();
                }
                if (step6 instanceof TabInvestControllerContract$ModalStep.PortfolioValueInfo) {
                    return aVar4.b3(((TabInvestControllerContract$ModalStep.PortfolioValueInfo) step6).f89850a);
                }
                if (step6 instanceof TabInvestControllerContract$ModalStep.KompotDescriptor) {
                    return fVar.e1(((TabInvestControllerContract$ModalStep.KompotDescriptor) step6).f89849a);
                }
                if (step6 instanceof TabInvestControllerContract$ModalStep.RegisteredIdentities) {
                    return aVar4.c3();
                }
                if (step6 instanceof TabInvestControllerContract$ModalStep.Checklist) {
                    return aVar4.Z2(((TabInvestControllerContract$ModalStep.Checklist) step6).f89848a);
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e eVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep step7 = (EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus trackPortabilityStatus = (EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus) step7;
                return new EsimCompleteNumberTransferBottomSheetScreen(new EsimCompleteNumberTransferBottomSheetScreenContract$InputData(trackPortabilityStatus.f101291a, trackPortabilityStatus.f101293c, trackPortabilityStatus.f101292b, null, null, eVar.o.f, 24));
            case 8:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                blj.m mVarA = ((v) obj4).a();
                List list = (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
                blj.l.Companion.getClass();
                return new n(mVarA, list, blj.l.d);
            case 9:
                com.revolut.feature.crypto.tfr.validation.impl.pob.a aVar5 = (com.revolut.feature.crypto.tfr.validation.impl.pob.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PlaceOfBirthScreenContract$ModalStep step8 = (PlaceOfBirthScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof PlaceOfBirthScreenContract$ModalStep.CountryPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                PickerController pickerController = new PickerController(new x(null, null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.crypto.tfr.validation.api.R$string.crypto_tfr_validation_pob_search_hint, null, null, 14), null, null, false, null, null, null, null, true, null, null, null, null, null, 2139094522), aVar5.f71046p);
                bhl.g block13 = new bhl.g(aVar5, 13);
                Intrinsics.checkNotNullParameter(block13, "block");
                pickerController.H = block13;
                return pickerController;
            case 10:
                final com.revolut.feature.apm.bills.bpay.impl.flow.a aVar6 = (com.revolut.feature.apm.bills.bpay.impl.flow.a) obj4;
                final l FlowCoordinator2 = (l) obj2;
                BPayFlowContract$Step step9 = (BPayFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof BPayFlowContract$Step.Input) {
                    InputScreen inputScreen = new InputScreen();
                    final int i59 = 0;
                    Function1 block14 = new Function1() { // from class: bo1.c
                        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i59) {
                                case 0:
                                    lo1.f result = (lo1.f) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof lo1.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    lo1.e eVar2 = (lo1.e) result;
                                    BPayBill.ServiceProvider serviceProvider = eVar2.f197366a.f61225b;
                                    String str2 = serviceProvider.f61230b;
                                    BPayBill.PaymentMethodDetails paymentMethodDetails = serviceProvider.e;
                                    BPayBillerData bPayBillerData = new BPayBillerData(str2, paymentMethodDetails.f61227a, serviceProvider.f61231c, eVar2.f197367b, eVar2.f197368c, paymentMethodDetails.f61228b);
                                    com.revolut.feature.apm.bills.bpay.impl.flow.a aVar7 = aVar6;
                                    oki.h.t2(aVar7, FlowCoordinator2, new BPayFlowContract$Step.Amount(new AmountScreenContract$InputData(bPayBillerData, false, aVar7.o.f61194c, (ScreenConfiguration) aVar7.f61204t.getValue())), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    so1.i result2 = (so1.i) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.apm.bills.bpay.impl.flow.a aVar8 = aVar6;
                                    aVar8.l2(new d(result2, aVar8, FlowCoordinator2, null), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    inputScreen.H = block14;
                    return inputScreen;
                }
                if (step9 instanceof BPayFlowContract$Step.Amount) {
                    bPayReviewScreen = new AmountScreen(((BPayFlowContract$Step.Amount) step9).f61195a);
                    b4d.c block15 = new b4d.c(aVar6, 24, FlowCoordinator2, step9);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    bPayReviewScreen.H = block15;
                } else {
                    if (!(step9 instanceof BPayFlowContract$Step.Review)) {
                        if (!(step9 instanceof BPayFlowContract$Step.TransferBreakdown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BPayFlowContract$Step.TransferBreakdown transferBreakdown = (BPayFlowContract$Step.TransferBreakdown) step9;
                        ApmQuote apmQuote = transferBreakdown.f61199b;
                        BPayTransferBreakdownScreen bPayTransferBreakdownScreen = new BPayTransferBreakdownScreen(new BPayTransferBreakdownScreenContract$InputData(apmQuote != null ? apmQuote.f62210b : null, transferBreakdown.f61198a, apmQuote != null ? apmQuote.f62211c : null, apmQuote != null ? apmQuote.d : null));
                        bhl.g block16 = new bhl.g(aVar6, 17);
                        Intrinsics.checkNotNullParameter(block16, "block");
                        bPayTransferBreakdownScreen.H = block16;
                        return bPayTransferBreakdownScreen;
                    }
                    bPayReviewScreen = new BPayReviewScreen(((BPayFlowContract$Step.Review) step9).f61197a);
                    final int i66 = 1;
                    Function1 block17 = new Function1() { // from class: bo1.c
                        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i66) {
                                case 0:
                                    lo1.f result = (lo1.f) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof lo1.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    lo1.e eVar2 = (lo1.e) result;
                                    BPayBill.ServiceProvider serviceProvider = eVar2.f197366a.f61225b;
                                    String str2 = serviceProvider.f61230b;
                                    BPayBill.PaymentMethodDetails paymentMethodDetails = serviceProvider.e;
                                    BPayBillerData bPayBillerData = new BPayBillerData(str2, paymentMethodDetails.f61227a, serviceProvider.f61231c, eVar2.f197367b, eVar2.f197368c, paymentMethodDetails.f61228b);
                                    com.revolut.feature.apm.bills.bpay.impl.flow.a aVar7 = aVar6;
                                    oki.h.t2(aVar7, FlowCoordinator2, new BPayFlowContract$Step.Amount(new AmountScreenContract$InputData(bPayBillerData, false, aVar7.o.f61194c, (ScreenConfiguration) aVar7.f61204t.getValue())), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    so1.i result2 = (so1.i) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.apm.bills.bpay.impl.flow.a aVar8 = aVar6;
                                    aVar8.l2(new d(result2, aVar8, FlowCoordinator2, null), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    bPayReviewScreen.H = block17;
                }
                return bPayReviewScreen;
            case 11:
                BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen = (BankAccountSwitchingCardDigitsScreen) obj4;
                InputTextDelegate.Model data = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = BankAccountSwitchingCardDigitsScreen.R;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = data.P;
                TextInputMask textInputMask = obj5 instanceof TextInputMask ? (TextInputMask) obj5 : null;
                String str2 = textInputMask != null ? textInputMask.f63925a : null;
                if (str2 != null) {
                    return new y(field.getInnerEditText(), null, str2, new abf.c(bankAccountSwitchingCardDigitsScreen, data, 8), data.f52580a, null, true, 34);
                }
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(new n30(((e0) obj4).f17313a.a()));
            case 13:
                final com.revolut.feature.wealth_discovery.impl.collection.most_traded.a aVar7 = (com.revolut.feature.wealth_discovery.impl.collection.most_traded.a) obj4;
                boh.b bVar2 = aVar7.f96131s;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MostTradedAssetsScreenContract$ModalStep step10 = (MostTradedAssetsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof MostTradedAssetsScreenContract$ModalStep.SelectSection) {
                    d0 selected = ((MostTradedAssetsScreenContract$ModalStep.SelectSection) step10).f96126a;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(selected, "selected");
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(boh.b.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_topMovers_filters_moverType_title, null, null, 14), boh.b.f17461a, selected, boh.c.f));
                    final int i74 = 0;
                    Function1 block18 = new Function1() { // from class: boh.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            eii.k output = (eii.k) obj6;
                            switch (i74) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    eii.i iVar = output instanceof eii.i ? (eii.i) output : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    if (!(obj7 instanceof d0)) {
                                        obj7 = null;
                                    }
                                    d0 d0Var = (d0) obj7;
                                    if (d0Var != null) {
                                        j2 j2Var = aVar7.u;
                                        j2Var.g(null, r.a((r) j2Var.getValue(), null, d0Var, 1));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    eii.i iVar2 = output instanceof eii.i ? (eii.i) output : null;
                                    Object obj8 = iVar2 != null ? iVar2.f126655a : null;
                                    if (!(obj8 instanceof b0)) {
                                        obj8 = null;
                                    }
                                    b0 b0Var = (b0) obj8;
                                    if (b0Var != null) {
                                        j2 j2Var2 = aVar7.u;
                                        j2Var2.g(null, r.a((r) j2Var2.getValue(), b0Var, null, 2));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    rowActionsBottomSheetController.H = block18;
                    return rowActionsBottomSheetController;
                }
                if (!(step10 instanceof MostTradedAssetsScreenContract$ModalStep.SelectTimeSpan)) {
                    throw new NoWhenBranchMatchedException();
                }
                b0 selected2 = ((MostTradedAssetsScreenContract$ModalStep.SelectTimeSpan) step10).f96127a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(selected2, "selected");
                RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(boh.b.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_topMovers_filters_timeSpan_title, null, null, 14), boh.b.f17462b, selected2, boh.d.f));
                final int i92 = 1;
                Function1 block19 = new Function1() { // from class: boh.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        eii.k output = (eii.k) obj6;
                        switch (i92) {
                            case 0:
                                Intrinsics.checkNotNullParameter(output, "output");
                                eii.i iVar = output instanceof eii.i ? (eii.i) output : null;
                                Object obj7 = iVar != null ? iVar.f126655a : null;
                                if (!(obj7 instanceof d0)) {
                                    obj7 = null;
                                }
                                d0 d0Var = (d0) obj7;
                                if (d0Var != null) {
                                    j2 j2Var = aVar7.u;
                                    j2Var.g(null, r.a((r) j2Var.getValue(), null, d0Var, 1));
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(output, "output");
                                eii.i iVar2 = output instanceof eii.i ? (eii.i) output : null;
                                Object obj8 = iVar2 != null ? iVar2.f126655a : null;
                                if (!(obj8 instanceof b0)) {
                                    obj8 = null;
                                }
                                b0 b0Var = (b0) obj8;
                                if (b0Var != null) {
                                    j2 j2Var2 = aVar7.u;
                                    j2Var2.g(null, r.a((r) j2Var2.getValue(), b0Var, null, 2));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                rowActionsBottomSheetController2.H = block19;
                return rowActionsBottomSheetController2;
            case 14:
                com.revolut.sso.impl.ui.passkeys_management.a aVar8 = (com.revolut.sso.impl.ui.passkeys_management.a) obj4;
                PasskeysManagementFlowContract$Step step11 = (PasskeysManagementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof PasskeysManagementFlowContract$Step.PasskeysList)) {
                    if (step11 instanceof PasskeysManagementFlowContract$Step.ShowDeleteConfirmation) {
                        return new DeletePasskeyConfirmationBottomSheet(new DeletePasskeyConfirmationBottomSheetContract$InputData(((PasskeysManagementFlowContract$Step.ShowDeleteConfirmation) step11).f106611a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                PasskeysListController passkeysListController = new PasskeysListController();
                bhl.g block20 = new bhl.g(aVar8, i2);
                Intrinsics.checkNotNullParameter(block20, "block");
                passkeysListController.H = block20;
                return passkeysListController;
            case 15:
                com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.a aVar9 = (com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.a) obj4;
                l FlowCoordinator3 = (l) obj2;
                ScreenerNewCollectionFlowContract$Step step12 = (ScreenerNewCollectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (Intrinsics.f(step12, ScreenerNewCollectionFlowContract$Step.Filters.f96178a)) {
                    ScreenerFiltersFlow screenerFiltersFlow = new ScreenerFiltersFlow(new ScreenerFiltersFlowContract$Input(aVar9.o.f96177a, true));
                    bnj.n block21 = new bnj.n(aVar9, FlowCoordinator3, 8);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    screenerFiltersFlow.H = block21;
                    return screenerFiltersFlow;
                }
                if (!(step12 instanceof ScreenerNewCollectionFlowContract$Step.Result)) {
                    throw new NoWhenBranchMatchedException();
                }
                ScreenerNewCollectionFlowContract$Step.Result result = (ScreenerNewCollectionFlowContract$Step.Result) step12;
                NewCollectionScreen newCollectionScreen = new NewCollectionScreen(new eqh.g(result.f96179a, result.f96180b));
                baa.c block22 = new baa.c(aVar9, FlowCoordinator3, i5);
                Intrinsics.checkNotNullParameter(block22, "block");
                newCollectionScreen.H = block22;
                return newCollectionScreen;
            case 16:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar10 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) obj4;
                bq5.a aVar11 = aVar10.u;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoCreateBeneficiaryScreenContract$Modal it8 = (CryptoCreateBeneficiaryScreenContract$Modal) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof CryptoCreateBeneficiaryScreenContract$Modal.Multichain) {
                    return aVar10.e1(new rj5.b(rj5.c.ADDRESS_TYPE));
                }
                if (it8 instanceof CryptoCreateBeneficiaryScreenContract$Modal.Hosting) {
                    CryptoAddressHostingFlow cryptoAddressHostingFlow = new CryptoAddressHostingFlow(new CryptoAddressHostingFlowInput(null, ((CryptoCreateBeneficiaryScreenContract$Modal.Hosting) it8).f71228a));
                    n0 block23 = new n0(aVar10, i3);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    cryptoAddressHostingFlow.H = block23;
                    return cryptoAddressHostingFlow;
                }
                if (it8 instanceof CryptoCreateBeneficiaryScreenContract$Modal.DestinationTagInfo) {
                    xi0.b currency = ((CryptoCreateBeneficiaryScreenContract$Modal.DestinationTagInfo) it8).f71227a;
                    aVar11.getClass();
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    mo5.a aVar12 = aVar11.f17671a;
                    Clause title = aVar12.d(currency);
                    Clause description = aVar12.g(currency);
                    TextLocalisedClause button = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                    LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle = LargeActionButton.ButtonStyle.f58725a;
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(button, "button");
                    Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
                    lw0.a aVar13 = new lw0.a(title, description, null, null, false, 28);
                    aw0.e eVar2 = new aw0.e(false, null, null, new n6(button, buttonStyle, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var2 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar13, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                } else if (it8 instanceof CryptoCreateBeneficiaryScreenContract$Modal.RecipientInfo) {
                    bq5.c cVar2 = aVar11.f17672b;
                    TextLocalisedClause title2 = new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_create_address_details_recipient_info_title, null, null, 14);
                    TextLocalisedClause description2 = new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_create_address_details_recipient_info_description, null, null, 14);
                    TextLocalisedClause button2 = new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14);
                    LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle2 = LargeActionButton.ButtonStyle.f58726b;
                    Intrinsics.checkNotNullParameter(title2, "title");
                    Intrinsics.checkNotNullParameter(description2, "description");
                    Intrinsics.checkNotNullParameter(button2, "button");
                    Intrinsics.checkNotNullParameter(buttonStyle2, "buttonStyle");
                    lw0.a aVar14 = new lw0.a(title2, description2, null, null, false, 28);
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(button2, buttonStyle2, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var3 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar14, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                    n0 block24 = new n0(aVar10, 0);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    actionsBottomSheetController.H = block24;
                } else {
                    if (it8 instanceof CryptoCreateBeneficiaryScreenContract$Modal.SelectRecipientType) {
                        CryptoRecipientTypeDialogController cryptoRecipientTypeDialogController = new CryptoRecipientTypeDialogController(new CryptoRecipientTypeDialogControllerContract$InputData(((CryptoCreateBeneficiaryScreenContract$Modal.SelectRecipientType) it8).f71232a));
                        n0 block25 = new n0(aVar10, i5);
                        Intrinsics.checkNotNullParameter(block25, "block");
                        cryptoRecipientTypeDialogController.H = block25;
                        return cryptoRecipientTypeDialogController;
                    }
                    if (!(it8 instanceof CryptoCreateBeneficiaryScreenContract$Modal.TransformedAddressInfo)) {
                        if (!(it8 instanceof CryptoCreateBeneficiaryScreenContract$Modal.QrScanner)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ViewController viewControllerE14 = aVar10.e1(zi5.c.f322502a);
                        n0 block26 = new n0(aVar10, 1);
                        Intrinsics.checkNotNullParameter(block26, "block");
                        viewControllerE14.H = block26;
                        return viewControllerE14;
                    }
                    bq5.c cVar3 = aVar11.f17672b;
                    TextLocalisedClause title3 = new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_create_address_details_transformed_address_explanation_popup_title, null, null, 14);
                    TextLocalisedClause description3 = new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_create_address_details_transformed_address_explanation_popup_description, null, null, 14);
                    TextLocalisedClause button3 = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                    LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle3 = LargeActionButton.ButtonStyle.f58725a;
                    Intrinsics.checkNotNullParameter(title3, "title");
                    Intrinsics.checkNotNullParameter(description3, "description");
                    Intrinsics.checkNotNullParameter(button3, "button");
                    Intrinsics.checkNotNullParameter(buttonStyle3, "buttonStyle");
                    lw0.a aVar15 = new lw0.a(title3, description3, null, null, false, 28);
                    aw0.e eVar4 = new aw0.e(false, null, null, new n6(button3, buttonStyle3, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var4 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar15, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                }
                return actionsBottomSheetController;
            case 17:
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.a aVar16 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.a) obj4;
                SplitItemizationControllerContract$InputData splitItemizationControllerContract$InputData = aVar16.o;
                SplitItemizationControllerContract$Step step13 = (SplitItemizationControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof SplitItemizationControllerContract$Step.AddItem) {
                    AddSplitItemController addSplitItemController = new AddSplitItemController(new cq9.g(splitItemizationControllerContract$InputData.f79265a, null));
                    bnj.n block27 = new bnj.n((SplitItemizationControllerContract$Step.AddItem) step13, aVar16, 12);
                    Intrinsics.checkNotNullParameter(block27, "block");
                    addSplitItemController.H = block27;
                    return addSplitItemController;
                }
                if (!(step13 instanceof SplitItemizationControllerContract$Step.ViewItems)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewSplitItemsController viewSplitItemsController = new ViewSplitItemsController(new hq9.i(splitItemizationControllerContract$InputData.f79266b, ((SplitItemizationControllerContract$Step.ViewItems) step13).f79269a, splitItemizationControllerContract$InputData.f79265a, splitItemizationControllerContract$InputData.f79267c));
                j block28 = new j(aVar16, i5);
                Intrinsics.checkNotNullParameter(block28, "block");
                viewSplitItemsController.H = block28;
                return viewSplitItemsController;
            case 18:
                final com.revolut.feature.credit.card.impl.ui.details.a aVar17 = (com.revolut.feature.credit.card.impl.ui.details.a) obj4;
                CreditCardDetailsScreenContract$InputData creditCardDetailsScreenContract$InputData = aVar17.o;
                pm4.e eVar5 = aVar17.f69249w;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final CreditCardDetailsScreenContract$ModalStep step14 = (CreditCardDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.CreditLimitDecrease) {
                    CreditCardDetailsScreenContract$ModalStep.CreditLimitDecrease creditLimitDecrease = (CreditCardDetailsScreenContract$ModalStep.CreditLimitDecrease) step14;
                    CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = new CreditCardLimitDecreaseAmountScreen(new CreditCardLimitDecreaseAmountScreenContract$InputData(creditCardDetailsScreenContract$InputData.f69221a, creditLimitDecrease.f69225a, creditLimitDecrease.f69226b, creditLimitDecrease.f69227c));
                    br4.b0 block29 = new br4.b0(aVar17, 4);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    creditCardLimitDecreaseAmountScreen.H = block29;
                    return creditCardLimitDecreaseAmountScreen;
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.CreditLimitDecreaseIneligible) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_limit_decrease_dialog_unavailable_description, null, null, 14);
                    BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
                    k9 k9Var5 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                    return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, 76);
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.CreditCardLimits) {
                    CreditCardLimitDialogScreen creditCardLimitDialogScreen = new CreditCardLimitDialogScreen(new CreditCardLimitDialogScreenContract$InputData(((br4.k) aVar17.I2()).f17908n, ((br4.k) aVar17.I2()).k != null));
                    br4.b0 block30 = new br4.b0(aVar17, 5);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    creditCardLimitDialogScreen.H = block30;
                    return creditCardLimitDialogScreen;
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.Dialog) {
                    lt4.d dVar = aVar17.D;
                    CreditCardDialogModel creditCardDialogModel = ((CreditCardDetailsScreenContract$ModalStep.Dialog) step14).f69229a;
                    dVar.getClass();
                    return lt4.d.a(creditCardDialogModel);
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer) {
                    CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer overdueStateExplainer = (CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer) step14;
                    wi0.b bVar3 = overdueStateExplainer.f69238c;
                    dj0.d dVar2 = overdueStateExplainer.f69237b;
                    CreditCardDetailsScreenContract$OverdueDialogType creditCardDetailsScreenContract$OverdueDialogType = overdueStateExplainer.d;
                    if (creditCardDetailsScreenContract$OverdueDialogType instanceof CreditCardDetailsScreenContract$OverdueDialogType.MayReport) {
                        actionsBottomSheetControllerB = eVar5.c(dVar2, bVar3);
                    } else if (creditCardDetailsScreenContract$OverdueDialogType instanceof CreditCardDetailsScreenContract$OverdueDialogType.Reported) {
                        actionsBottomSheetControllerB = eVar5.d(dVar2, bVar3);
                    } else {
                        if (!(creditCardDetailsScreenContract$OverdueDialogType instanceof CreditCardDetailsScreenContract$OverdueDialogType.Disabled)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        actionsBottomSheetControllerB = eVar5.b(((CreditCardDetailsScreenContract$OverdueDialogType.Disabled) creditCardDetailsScreenContract$OverdueDialogType).f69241a, dVar2, bVar3);
                    }
                    com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController actionsBottomSheetController2 = actionsBottomSheetControllerB;
                    Function1 block31 = new Function1() { // from class: br4.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            zx4.d result2 = (zx4.d) obj6;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.credit.card.impl.ui.details.a aVar18 = aVar17;
                                    String pocketId = aVar18.o.f69221a;
                                    dj0.d dVar3 = ((CreditCardDetailsScreenContract$ModalStep.Terminated) step14).f69240a;
                                    if (Intrinsics.f(result2, zx4.b.f326040a)) {
                                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                                        if (dVar3 == null) {
                                            oki.h.v2(aVar18.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar18.C2(r.f17920a);
                                        }
                                    } else if (Intrinsics.f(result2, zx4.c.f326041a)) {
                                        aVar18.N2();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof zx4.b) {
                                        CreditCardDetailsScreenContract$ModalStep.LimitExceeded limitExceeded = (CreditCardDetailsScreenContract$ModalStep.LimitExceeded) step14;
                                        String pocketId2 = limitExceeded.f69232a;
                                        dj0.d dVar4 = limitExceeded.f69233b;
                                        Intrinsics.checkNotNullParameter(pocketId2, "pocketId");
                                        com.revolut.feature.credit.card.impl.ui.details.a aVar19 = aVar17;
                                        if (dVar4 == null) {
                                            oki.h.v2(aVar19.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar19.C2(r.f17920a);
                                        }
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof zx4.b) {
                                        CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer overdueStateExplainer2 = (CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer) step14;
                                        String pocketId3 = overdueStateExplainer2.f69236a;
                                        dj0.d dVar5 = overdueStateExplainer2.f69237b;
                                        Intrinsics.checkNotNullParameter(pocketId3, "pocketId");
                                        com.revolut.feature.credit.card.impl.ui.details.a aVar20 = aVar17;
                                        if (dVar5 == null) {
                                            oki.h.v2(aVar20.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar20.C2(r.f17920a);
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block31, "block");
                    actionsBottomSheetController2.H = block31;
                    return actionsBottomSheetController2;
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.DueDate) {
                    CreditCardSelectDueDateFlow creditCardSelectDueDateFlow = new CreditCardSelectDueDateFlow(new CreditCardSelectDueDateFlowContract$InputData(creditCardDetailsScreenContract$InputData.f69221a));
                    creditCardSelectDueDateFlow.l2(new bc1.b(aVar17, i2));
                    return creditCardSelectDueDateFlow;
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.DisplayAmount) {
                    return new DisplayAmountToggleController(aVar17.G, new DisplayAmountToggleControllerContract$InputData(creditCardDetailsScreenContract$InputData.f69221a, aVar17.I2().a().f69798l));
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.NothingToRepay) {
                    return eVar5.a();
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.Terminated) {
                    com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController actionsBottomSheetControllerF = eVar5.f(((CreditCardDetailsScreenContract$ModalStep.Terminated) step14).f69240a, aVar17.I2().getCountryCode());
                    Function1 block32 = new Function1() { // from class: br4.a0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            zx4.d result2 = (zx4.d) obj6;
                            switch (i22) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.feature.credit.card.impl.ui.details.a aVar18 = aVar17;
                                    String pocketId = aVar18.o.f69221a;
                                    dj0.d dVar3 = ((CreditCardDetailsScreenContract$ModalStep.Terminated) step14).f69240a;
                                    if (Intrinsics.f(result2, zx4.b.f326040a)) {
                                        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                                        if (dVar3 == null) {
                                            oki.h.v2(aVar18.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar18.C2(r.f17920a);
                                        }
                                    } else if (Intrinsics.f(result2, zx4.c.f326041a)) {
                                        aVar18.N2();
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof zx4.b) {
                                        CreditCardDetailsScreenContract$ModalStep.LimitExceeded limitExceeded = (CreditCardDetailsScreenContract$ModalStep.LimitExceeded) step14;
                                        String pocketId2 = limitExceeded.f69232a;
                                        dj0.d dVar4 = limitExceeded.f69233b;
                                        Intrinsics.checkNotNullParameter(pocketId2, "pocketId");
                                        com.revolut.feature.credit.card.impl.ui.details.a aVar19 = aVar17;
                                        if (dVar4 == null) {
                                            oki.h.v2(aVar19.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar19.C2(r.f17920a);
                                        }
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof zx4.b) {
                                        CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer overdueStateExplainer2 = (CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer) step14;
                                        String pocketId3 = overdueStateExplainer2.f69236a;
                                        dj0.d dVar5 = overdueStateExplainer2.f69237b;
                                        Intrinsics.checkNotNullParameter(pocketId3, "pocketId");
                                        com.revolut.feature.credit.card.impl.ui.details.a aVar20 = aVar17;
                                        if (dVar5 == null) {
                                            oki.h.v2(aVar20.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        } else {
                                            aVar20.C2(r.f17920a);
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block32, "block");
                    actionsBottomSheetControllerF.H = block32;
                    return actionsBottomSheetControllerF;
                }
                if (step14 instanceof CreditCardDetailsScreenContract$ModalStep.PostTerminationPlan) {
                    return aVar17.e1(new CreditPostTerminationPlanEntryPoint.PlanDetailsFlow(((CreditCardDetailsScreenContract$ModalStep.PostTerminationPlan) step14).f69239a, null));
                }
                if (!(step14 instanceof CreditCardDetailsScreenContract$ModalStep.LimitExceeded)) {
                    if (!(step14 instanceof CreditCardDetailsScreenContract$ModalStep.CreditCards)) {
                        if (!(step14 instanceof CreditCardDetailsScreenContract$ModalStep.CommonError)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar17.I.getClass();
                        return vt4.a.a();
                    }
                    CreditCardsController creditCardsController = new CreditCardsController(new CreditCardsScreenContract$InputData(creditCardDetailsScreenContract$InputData.f69221a));
                    br4.b0 block33 = new br4.b0(aVar17, 0);
                    Intrinsics.checkNotNullParameter(block33, "block");
                    creditCardsController.H = block33;
                    return creditCardsController;
                }
                CreditCardDetailsScreenContract$ModalStep.LimitExceeded limitExceeded = (CreditCardDetailsScreenContract$ModalStep.LimitExceeded) step14;
                dj0.d amount = limitExceeded.f69233b;
                dj0.d totalLimit = limitExceeded.f69234c;
                eVar5.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
                com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController actionsBottomSheetControllerE = pm4.e.e(new TextLocalisedClause(R$string.credit_card_details_dialog_limit_exceeded_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_details_dialog_limit_exceeded_description, u.c(new MoneyClause(totalLimit, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.credit_card_details_dialog_limit_exceeded_amount, null, null, 14), amount, false);
                Function1 block34 = new Function1() { // from class: br4.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        zx4.d result2 = (zx4.d) obj6;
                        switch (i21) {
                            case 0:
                                Intrinsics.checkNotNullParameter(result2, "result");
                                com.revolut.feature.credit.card.impl.ui.details.a aVar18 = aVar17;
                                String pocketId = aVar18.o.f69221a;
                                dj0.d dVar3 = ((CreditCardDetailsScreenContract$ModalStep.Terminated) step14).f69240a;
                                if (Intrinsics.f(result2, zx4.b.f326040a)) {
                                    Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                                    if (dVar3 == null) {
                                        oki.h.v2(aVar18.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        aVar18.C2(r.f17920a);
                                    }
                                } else if (Intrinsics.f(result2, zx4.c.f326041a)) {
                                    aVar18.N2();
                                }
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof zx4.b) {
                                    CreditCardDetailsScreenContract$ModalStep.LimitExceeded limitExceeded2 = (CreditCardDetailsScreenContract$ModalStep.LimitExceeded) step14;
                                    String pocketId2 = limitExceeded2.f69232a;
                                    dj0.d dVar4 = limitExceeded2.f69233b;
                                    Intrinsics.checkNotNullParameter(pocketId2, "pocketId");
                                    com.revolut.feature.credit.card.impl.ui.details.a aVar19 = aVar17;
                                    if (dVar4 == null) {
                                        oki.h.v2(aVar19.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        aVar19.C2(r.f17920a);
                                    }
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof zx4.b) {
                                    CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer overdueStateExplainer2 = (CreditCardDetailsScreenContract$ModalStep.OverdueStateExplainer) step14;
                                    String pocketId3 = overdueStateExplainer2.f69236a;
                                    dj0.d dVar5 = overdueStateExplainer2.f69237b;
                                    Intrinsics.checkNotNullParameter(pocketId3, "pocketId");
                                    com.revolut.feature.credit.card.impl.ui.details.a aVar20 = aVar17;
                                    if (dVar5 == null) {
                                        oki.h.v2(aVar20.M, CreditCardDetailsScreenContract$ModalStep.NothingToRepay.f69235a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        aVar20.C2(r.f17920a);
                                    }
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block34, "block");
                actionsBottomSheetControllerE.H = block34;
                return actionsBottomSheetControllerE;
            case 19:
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a aVar18 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) obj4;
                SalaryStatusScreenContract$InputData salaryStatusScreenContract$InputData = aVar18.f85303p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SalaryStatusScreenContract$ModalStep step15 = (SalaryStatusScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof SalaryStatusScreenContract$ModalStep.CancelRequest) {
                    CancelSalarySwitchScreen cancelSalarySwitchScreen = new CancelSalarySwitchScreen(new CancelSalarySwitchScreenContract$InputData(salaryStatusScreenContract$InputData.f85299a));
                    ax9.d block35 = new ax9.d(1, aVar18, com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a.class, "handleCancelRequestControllerResult", "handleCancelRequestControllerResult(Lcom/revolut/feature/salary_switch/impl/ui/brazil/screen/cancel/CancelSalarySwitchScreenContract$OutputData;)V", 0, 25);
                    Intrinsics.checkNotNullParameter(block35, "block");
                    cancelSalarySwitchScreen.H = block35;
                    return cancelSalarySwitchScreen;
                }
                if (step15 instanceof SalaryStatusScreenContract$ModalStep.DisputeStatus) {
                    return new SalaryDisputeScreen(new SalaryDisputeScreenContract$InputData(((SalaryStatusScreenContract$ModalStep.DisputeStatus) step15).f85301a, salaryStatusScreenContract$InputData.f85299a));
                }
                if (!(step15 instanceof SalaryStatusScreenContract$ModalStep.SubmitDispute)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar18.f85304q.getClass();
                lw0.a aVar19 = new lw0.a(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_submission_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_submission_description, null, null, 14), null, null, false, 28);
                List listK = zhm.v.k(brc.d.a(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_submission_reason_salary_not_arrived, null, null, 14), cqc.c.SALARY_NOT_RECEIVED), brc.d.a(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_dispute_submission_reason_salary_wrong_account, null, null, 14), cqc.c.FUNDS_SENT_TO_WRONG_ACCOUNT));
                k9 k9Var6 = k9.Retail;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController3 = new RowActionsBottomSheetController(new eii.c(aVar19, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null));
                ax9.d block36 = new ax9.d(1, aVar18, com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a.class, "handleSubmitDisputeControllerResult", "handleSubmitDisputeControllerResult(Lcom/revolut/kompot/common/bottom_sheet/row_actions/RowActionsBottomSheetContract$OutputData;)V", 0, 26);
                Intrinsics.checkNotNullParameter(block36, "block");
                rowActionsBottomSheetController3.H = block36;
                return rowActionsBottomSheetController3;
            case 20:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new r(((w) obj4).f18064a.f69385c ? bs4.n.f18055a : bs4.j.f18052a, (List) errorItems.invoke(new iii.d(14, null, true, false, null)));
            case 21:
                PaymentGroup paymentGroup = (PaymentGroup) obj4;
                ((Boolean) obj2).booleanValue();
                return paymentGroup;
            case 22:
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar20 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                GroupChatScreenContract$ModalSteps step16 = (GroupChatScreenContract$ModalSteps) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof GroupChatScreenContract$ModalSteps.InviteNewMembers) {
                    GroupChatScreenContract$ModalSteps.InviteNewMembers inviteNewMembers = (GroupChatScreenContract$ModalSteps.InviteNewMembers) step16;
                    return aVar20.G.a(inviteNewMembers.f79339a, inviteNewMembers.f79340b, inviteNewMembers.f79341c, inviteNewMembers.d);
                }
                if (step16 instanceof GroupChatScreenContract$ModalSteps.SettingsScreen) {
                    GroupChatSettingsScreen groupChatSettingsScreen = new GroupChatSettingsScreen(new GroupChatSettingsScreenContract$InputData(aVar20.J2().f18116a));
                    bs9.y block37 = new bs9.y(aVar20, i5);
                    Intrinsics.checkNotNullParameter(block37, "block");
                    groupChatSettingsScreen.H = block37;
                    return groupChatSettingsScreen;
                }
                if (step16 instanceof GroupChatScreenContract$ModalSteps.Qr) {
                    GroupChatScreenContract$ModalSteps.Qr qr10 = (GroupChatScreenContract$ModalSteps.Qr) step16;
                    return new GroupQrScreen(new GroupQrScreenContract$InputData(qr10.f79342a, qr10.f79343b, qr10.f79344c));
                }
                if (!(step16 instanceof GroupChatScreenContract$ModalSteps.EligibilityUnsupportedDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar21 = new lw0.a(new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.payments_chat_messaging_eligibility_unsupported_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_chat_messaging_eligibility_unsupported_description_group, null, null, 14), null, null, false, 28);
                aw0.e eVar6 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var7 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator8 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar21, eVar6, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var7, "value", k9Var7), null, null, 24));
            case 23:
                List domain = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((bsc.b) obj4).f18159b.f("CRYPTO_TRUSTED_BENEFICIARIES_MEMORY_KEY", domain);
                return Unit.f186387a;
            case 24:
                return a(obj2, obj3);
            case 25:
                return b(obj2, obj3);
            case 26:
                Set ids = (Set) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(ids, "ids");
                ((bva.d) obj4).f18975a.f("HIDDEN_PAYMENT_IDS", ids);
                return Unit.f186387a;
            case 27:
                return c(obj2, obj3);
            case 28:
                return d(obj2, obj3);
            default:
                com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b bVar4 = (com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b) obj4;
                ali.b PagerCoordinator = (ali.b) obj2;
                TransactionsDayNightLimitsFlowContract$PagerItem item = (TransactionsDayNightLimitsFlowContract$PagerItem) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(item, "item");
                if (Intrinsics.f(item, TransactionsDayNightLimitsFlowContract$PagerItem.Day.f85714a)) {
                    TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen = new TransactionsDayNightLimitsScreen(new TransactionsDayNightLimitsScreenContract$InputData(cuc.g.DAY));
                    ax9.d block38 = new ax9.d(1, bVar4, com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b.class, "handleResult", "handleResult(Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$OutputData;)V", 0, 27);
                    Intrinsics.checkNotNullParameter(block38, "block");
                    transactionsDayNightLimitsScreen.H = block38;
                    return transactionsDayNightLimitsScreen;
                }
                if (Intrinsics.f(item, TransactionsDayNightLimitsFlowContract$PagerItem.Night.f85715a)) {
                    TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen2 = new TransactionsDayNightLimitsScreen(new TransactionsDayNightLimitsScreenContract$InputData(cuc.g.NIGHT));
                    ax9.d block39 = new ax9.d(1, bVar4, com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b.class, "handleResult", "handleResult(Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$OutputData;)V", 0, 28);
                    Intrinsics.checkNotNullParameter(block39, "block");
                    transactionsDayNightLimitsScreen2.H = block39;
                    return transactionsDayNightLimitsScreen2;
                }
                if (Intrinsics.f(item, TransactionsDayNightLimitsFlowContract$PagerItem.Daily.f85713a)) {
                    TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen3 = new TransactionsDayNightLimitsScreen(new TransactionsDayNightLimitsScreenContract$InputData(cuc.g.DAILY));
                    ax9.d block40 = new ax9.d(1, bVar4, com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b.class, "handleResult", "handleResult(Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$OutputData;)V", 0, 29);
                    Intrinsics.checkNotNullParameter(block40, "block");
                    transactionsDayNightLimitsScreen3.H = block40;
                    return transactionsDayNightLimitsScreen3;
                }
                if (!Intrinsics.f(item, TransactionsDayNightLimitsFlowContract$PagerItem.Other.f85716a)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransactionsDayNightLimitsScreen transactionsDayNightLimitsScreen4 = new TransactionsDayNightLimitsScreen(new TransactionsDayNightLimitsScreenContract$InputData(cuc.g.OTHER));
                bwc.i block41 = new bwc.i(1, bVar4, com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b.class, "handleResult", "handleResult(Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$OutputData;)V", 0, 0);
                Intrinsics.checkNotNullParameter(block41, "block");
                transactionsDayNightLimitsScreen4.H = block41;
                return transactionsDayNightLimitsScreen4;
        }
    }
}
