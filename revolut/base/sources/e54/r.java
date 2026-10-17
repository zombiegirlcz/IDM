package e54;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import c55.j0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$InputData;
import com.revolut.feature.apm.iris.impl.ui.IrisFlowContract$Step;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreen;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreenContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlow;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlow;
import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$InputData;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreenContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.pay.MultibancoPayFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.ui.pay.loading.PayLoadingController;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.map.CashTopUpMapFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.ExpiredPopupController;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.ExpiredPopupControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.PersonalDetailsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.customer_identification.CustomerIdentificationScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.customer_identification.CustomerIdentificationScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details.PersonalDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.details.PersonalDetailsScreenContract$InputData;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.LoanCancellationFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerController;
import com.revolut.feature.crypto.earn.assets.shared.impl.dialog.AllTimeRewardsClarificationDialog;
import com.revolut.feature.crypto.earn.assets.shared.impl.dialog.MonthRewardsClarificationDialog;
import com.revolut.feature.crypto.earn.assets.shared.impl.dialog.StakingClarificationDialog;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenContract$ModalStep;
import com.revolut.feature.direct_deposit.impl.ui_kompot.flow.DirectDepositFlowContract$Step;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.DirectDepositAccountScreen;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewContract$InputData;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview.DirectDepositPreviewScreen;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow.FreelancerVatReminderSettingsFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.FreelancerVatReminderSettingsScreen;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreenContract$ModalStep;
import com.revolut.feature.giro.impl.ui.review.domain.SelectedPocket;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$PagerItem;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreenContract$InputData;
import com.revolut.feature.pockets.impl.details_v2.mcy.PocketDetailsMcyFlowContract$Step;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.native_move_money.RevolutPayMoveMoneyFlowContract$InputData;
import com.revolut.feature.revolutpay.impl.ui.native_move_money.RevolutPayMoveMoneyFlowContract$Step;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeControllerContract$Step;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreenContract$ModalStep;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlowContract$Step;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.see_all.TravelMilesAirlineSeeAllScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.see_all.TravelMilesAirlineSeeAllScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$InputData;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreenContract$ModalStep;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.lockup_period.FundLockupPeriodScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.flow.PaymentLinksFlowContract$Step;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import dz6.o;
import e8h.c0;
import e8h.p0;
import ft3.j1;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.reflect.KProperty;
import oc3.i;
import oc3.j;
import oc3.k;
import oc3.l;
import oc3.m;
import oec.a;
import oki.h;
import q35.f0;
import q35.g0;
import sii.d;
import vkm.j2;
import zhm.d0;
import zhm.h0;
import zhm.k0;
import zhm.t0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f122762b;

    public /* synthetic */ r(e9d.c cVar, j7d.a aVar) {
        this.f122761a = 19;
        this.f122762b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        ViewController irisSettingsScreen;
        List listB;
        aw0.i hVar;
        ggh.b bVar;
        int i = this.f122761a;
        int i2 = 25;
        int i3 = 3;
        int i5 = 2;
        final int i6 = 0;
        final int i21 = 1;
        Object obj4 = this.f122762b;
        switch (i) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditAmountInputScreenContract$ModalStep step = (CreditAmountInputScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CreditAmountInputScreenContract$ModalStep.Info)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = bVar2.e1(new fy4.s(new fy4.t(((CreditAmountInputScreenContract$ModalStep.Info) step).f67044a)));
                viewControllerE1.l2(new d8e.a(bVar2, 29));
                return viewControllerE1;
            case 1:
                com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                FreelancerVatReminderSettingsFlowContract$Step step2 = (FreelancerVatReminderSettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, FreelancerVatReminderSettingsFlowContract$Step.Settings.f74439a)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerVatReminderSettingsScreen freelancerVatReminderSettingsScreen = new FreelancerVatReminderSettingsScreen();
                e2j.j block = new e2j.j(aVar, 17);
                Intrinsics.checkNotNullParameter(block, "block");
                freelancerVatReminderSettingsScreen.H = block;
                return freelancerVatReminderSettingsScreen;
            case 2:
                com.revolut.feature.apm.iris.impl.ui.a aVar2 = (com.revolut.feature.apm.iris.impl.ui.a) obj4;
                IrisNavigation$InputData irisNavigation$InputData = aVar2.o;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                IrisFlowContract$Step step3 = (IrisFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof IrisFlowContract$Step.Intro) {
                    ViewController viewControllerE12 = aVar2.e1(new d12.a(new d12.c(new TextLocalisedClause(R$string.iris_entry, null, null, 14)), aVar2.f62510t));
                    e62.c block2 = new e62.c(aVar2, 4);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE12.H = block2;
                    return viewControllerE12;
                }
                if (step3 instanceof IrisFlowContract$Step.Area) {
                    irisSettingsScreen = new IrisAreaScreen(new IrisAreaScreenContract$InputData(irisNavigation$InputData.f62484b));
                    e62.c block3 = new e62.c(aVar2, i21);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    irisSettingsScreen.H = block3;
                } else if (step3 instanceof IrisFlowContract$Step.Registration) {
                    irisSettingsScreen = new IrisRegistrationFlow(new IrisRegistrationFlowContract$InputData(((IrisFlowContract$Step.Registration) step3).f62504a, irisNavigation$InputData.f62484b));
                    e62.c block4 = new e62.c(aVar2, i5);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    irisSettingsScreen.H = block4;
                } else {
                    if (!(step3 instanceof IrisFlowContract$Step.Settings)) {
                        if (step3 instanceof IrisFlowContract$Step.NewContact) {
                            ViewController viewControllerE13 = aVar2.e1(aVar2.f62506p.a(null));
                            e62.c block5 = new e62.c(aVar2, i3);
                            Intrinsics.checkNotNullParameter(block5, "block");
                            viewControllerE13.H = block5;
                            return viewControllerE13;
                        }
                        if (step3 instanceof IrisFlowContract$Step.RecipientList) {
                            ViewController viewControllerE14 = aVar2.e1(aVar2.f62507q.a());
                            e62.c block6 = new e62.c(aVar2, 5);
                            Intrinsics.checkNotNullParameter(block6, "block");
                            viewControllerE14.H = block6;
                            return viewControllerE14;
                        }
                        if (!(step3 instanceof IrisFlowContract$Step.Pay)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IrisPayFlow irisPayFlow = new IrisPayFlow(new IrisPayFlowContract$InputData(((IrisFlowContract$Step.Pay) step3).f62502a, irisNavigation$InputData.f62484b));
                        e62.c block7 = new e62.c(aVar2, i6);
                        Intrinsics.checkNotNullParameter(block7, "block");
                        irisPayFlow.H = block7;
                        return irisPayFlow;
                    }
                    irisSettingsScreen = new IrisSettingsScreen(new IrisSettingsScreenContract$InputData(irisNavigation$InputData.f62484b));
                }
                return irisSettingsScreen;
            case 3:
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a aVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                LoanCancellationFlowContract$Step step4 = (LoanCancellationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof LoanCancellationFlowContract$Step.ConfirmLoanCancellation) {
                    CancelLoanConfirmationController cancelLoanConfirmationController = new CancelLoanConfirmationController(new CancelLoanConfirmationControllerContract$InputData(((LoanCancellationFlowContract$Step.ConfirmLoanCancellation) step4).f70362a));
                    e1.b block8 = new e1.b(aVar3, LazyFlowCoordinator, 22);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    cancelLoanConfirmationController.H = block8;
                    return cancelLoanConfirmationController;
                }
                if (!(step4 instanceof LoanCancellationFlowContract$Step.SelectLoan)) {
                    throw new NoWhenBranchMatchedException();
                }
                LoanSelectionController loanSelectionController = new LoanSelectionController(new LoanSelectionControllerContract$InputData(((LoanCancellationFlowContract$Step.SelectLoan) step4).f70363a));
                e2j.j block9 = new e2j.j(aVar3, 19);
                Intrinsics.checkNotNullParameter(block9, "block");
                loanSelectionController.H = block9;
                return loanSelectionController;
            case 4:
                e76.b params = (e76.b) obj2;
                e8l.d response = (e8l.d) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(response, "response");
                ((e76.d) obj4).f123088b.f(params.f123086c, response);
                return Unit.f186387a;
            case 5:
                com.revolut.feature.giro.impl.ui.review.a aVar4 = (com.revolut.feature.giro.impl.ui.review.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DirectDebitReviewScreenContract$ModalStep step5 = (DirectDebitReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof DirectDebitReviewScreenContract$ModalStep.PocketSelector)) {
                    throw new NoWhenBranchMatchedException();
                }
                SelectedPocket selectedPocket = ((DirectDebitReviewScreenContract$ModalStep.PocketSelector) step5).f74558a;
                l2j.a aVar5 = aVar4.f74559p;
                String str = selectedPocket.f74562a;
                xi0.b bVar3 = selectedPocket.f74563b;
                io3.l lVar = io3.l.CURRENT;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.giro.api.R$string.giro_direct_debits_review_direct_debit_pocket_selection, null, null, 14);
                k1j.a[] elements = {k1j.a.POCKETS, k1j.a.VAULTS, k1j.a.CREDIT_CARDS, k1j.a.EXTERNAL_POCKETS, k1j.a.CRYPTO, k1j.a.COMMODITIES, k1j.a.TRADING_ACCOUNTS, k1j.a.SAVINGS};
                Intrinsics.checkNotNullParameter(elements, "elements");
                CurrencyChooserFlow currencyChooserFlowA = aVar5.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(str, bVar3, lVar, (Set) null, (Set) null, kotlin.collections.d.y0(elements), textLocalisedClause, false, (Integer) null, (Set) null, 1848)));
                e2j.j jVar = new e2j.j(aVar4, 23);
                Intrinsics.checkNotNullParameter(jVar, "<set-?>");
                currencyChooserFlowA.J = jVar;
                return currencyChooserFlowA;
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return yp0.b.g((List) getDefaultErrorItems.invoke(new iii.d(6, "ManagedPortfolioPerformanceSummaryExtensionContract", true, false, null)), ((e7f.i) obj4).f123325c, null, 0, 0, 126);
            case 7:
                final com.revolut.feature.apm.multibanco.impl.ui.pay.a aVar6 = (com.revolut.feature.apm.multibanco.impl.ui.pay.a) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                MultibancoPayFlowContract$Step step6 = (MultibancoPayFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof MultibancoPayFlowContract$Step.Loading) {
                    PayLoadingController payLoadingController = new PayLoadingController();
                    Function1 block10 = new Function1() { // from class: e82.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    g82.d outputData = (g82.d) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof g82.b;
                                    com.revolut.feature.apm.multibanco.impl.ui.pay.a aVar7 = aVar6;
                                    if (z) {
                                        oki.h.D2(aVar7.f62616r);
                                    } else {
                                        if (!(outputData instanceof g82.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar7, aVar7.f62616r, new MultibancoPayFlowContract$Step.QR(((g82.c) outputData).f141243a), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    g12.j outputData2 = (g12.j) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z3 = outputData2 instanceof g12.i;
                                    com.revolut.feature.apm.multibanco.impl.ui.pay.a aVar8 = aVar6;
                                    if (z3) {
                                        aVar8.l2(new o(aVar8, ((g12.i) outputData2).f139523a, null, 28), new yi5.b(26));
                                    } else {
                                        boolean z4 = outputData2 instanceof g12.h;
                                        c cVar = c.f123560a;
                                        if (!z4 && !(outputData2 instanceof g12.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C2(cVar);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    payLoadingController.H = block10;
                    return payLoadingController;
                }
                if (!(step6 instanceof MultibancoPayFlowContract$Step.QR)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE15 = aVar6.e1(new g12.f(((MultibancoPayFlowContract$Step.QR) step6).f62613a));
                Function1 block11 = new Function1() { // from class: e82.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i21) {
                            case 0:
                                g82.d outputData = (g82.d) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z = outputData instanceof g82.b;
                                com.revolut.feature.apm.multibanco.impl.ui.pay.a aVar7 = aVar6;
                                if (z) {
                                    oki.h.D2(aVar7.f62616r);
                                } else {
                                    if (!(outputData instanceof g82.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar7, aVar7.f62616r, new MultibancoPayFlowContract$Step.QR(((g82.c) outputData).f141243a), false, null, false, 12);
                                }
                                return Unit.f186387a;
                            default:
                                g12.j outputData2 = (g12.j) obj5;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z3 = outputData2 instanceof g12.i;
                                com.revolut.feature.apm.multibanco.impl.ui.pay.a aVar8 = aVar6;
                                if (z3) {
                                    aVar8.l2(new o(aVar8, ((g12.i) outputData2).f139523a, null, 28), new yi5.b(26));
                                } else {
                                    boolean z4 = outputData2 instanceof g12.h;
                                    c cVar = c.f123560a;
                                    if (!z4 && !(outputData2 instanceof g12.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar8.C2(cVar);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block11, "block");
                viewControllerE15.H = block11;
                return viewControllerE15;
            case 8:
                AmountInputController amountInputController = (AmountInputController) obj4;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = AmountInputController.S;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract.InputAmountParcel");
                return new zp0.d(field.getEditText(), ((e85.h) obj5).f123584a, (u80.d) amountInputController.P.getValue(), null, new zjh.i(amountInputController, i2), false, false, 0, false, null, 1928);
            case 9:
                final com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar7 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AmountInputControllerContract$ModalStep step7 = (AmountInputControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof AmountInputControllerContract$ModalStep.AccountPicker) {
                    LoanRepaymentAccountModelExtension.RepaymentAccountState repaymentAccountState = ((AmountInputControllerContract$ModalStep.AccountPicker) step7).f70548a;
                    f0 f0Var = repaymentAccountState.f70505b;
                    ViewController viewControllerE16 = aVar7.e1(new g1j.a(new BalanceSelector$InputData(f0Var.f241816g, k1j.d.RETAIL, io3.l.CURRENT, null, null, f0Var.f241817h, null, repaymentAccountState.a(), null, 344), aVar7.f70555s));
                    Function1 block12 = new Function1() { // from class: e85.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    g1j.b result = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar7.f70554r.d3(result.f139686a);
                                    return Unit.f186387a;
                                default:
                                    g85.c result2 = (g85.c) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    g0 g0VarA = com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.a.a(result2.f141286a);
                                    com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar8 = aVar7;
                                    dj0.d dVar = ((g) ((j2) aVar8.z.f22677a).getValue()).f123583c;
                                    if (dVar != null) {
                                        aVar8.I2(dVar, g0VarA);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE16.H = block12;
                    return viewControllerE16;
                }
                if (!(step7 instanceof AmountInputControllerContract$ModalStep.LoanStateExplainer)) {
                    if (step7 instanceof AmountInputControllerContract$ModalStep.RepaymentStampDutyExplainer) {
                        return ((c55.n) aVar7.u).b(((AmountInputControllerContract$ModalStep.RepaymentStampDutyExplainer) step7).f70550a);
                    }
                    if (!(step7 instanceof AmountInputControllerContract$ModalStep.StrategyPicker)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StrategyPickerController strategyPickerController = new StrategyPickerController(new StrategyPickerContract$InputData(((AmountInputControllerContract$ModalStep.StrategyPicker) step7).f70551a));
                    Function1 block13 = new Function1() { // from class: e85.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i21) {
                                case 0:
                                    g1j.b result = (g1j.b) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar7.f70554r.d3(result.f139686a);
                                    return Unit.f186387a;
                                default:
                                    g85.c result2 = (g85.c) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    g0 g0VarA = com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.a.a(result2.f141286a);
                                    com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar8 = aVar7;
                                    dj0.d dVar = ((g) ((j2) aVar8.z.f22677a).getValue()).f123583c;
                                    if (dVar != null) {
                                        aVar8.I2(dVar, g0VarA);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    strategyPickerController.H = block13;
                    return strategyPickerController;
                }
                m35.o oVarB = ((j0) aVar7.f70556t).b(((AmountInputControllerContract$ModalStep.LoanStateExplainer) step7).f70549a, false);
                if (oVarB instanceof m35.n) {
                    return aVar7.e1(((m35.n) oVarB).f202290a);
                }
                if (!(oVarB instanceof m35.m)) {
                    if (oVarB == null) {
                        throw new IllegalArgumentException("Explainer dialog was null");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CreditBottomSheetListItemsController creditBottomSheetListItemsController = ((m35.m) oVarB).f202289a;
                dkm.a block14 = new dkm.a(1, aVar7, com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a.class, "handleStateExplainerResult", "handleStateExplainerResult(Lcom/revolut/feature/credit/core/ui/bottom_sheet/list/CreditBottomSheetListItemsController$OutputData;)V", 0, 15);
                Intrinsics.checkNotNullParameter(block14, "block");
                creditBottomSheetListItemsController.H = block14;
                return creditBottomSheetListItemsController;
            case 10:
                ali.b PagerCoordinator = (ali.b) obj2;
                IndexDetailsFlowContract$PagerItem item = (IndexDetailsFlowContract$PagerItem) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(item, "item");
                com.revolut.feature.global_markets.impl.ui.flow.index_details.a aVar8 = (com.revolut.feature.global_markets.impl.ui.flow.index_details.a) ((j2) ((com.revolut.feature.global_markets.impl.ui.flow.index_details.b) obj4).f74594t.f22677a).getValue();
                if (Intrinsics.f(item, IndexDetailsFlowContract$PagerItem.OverviewItem.f74585a)) {
                    return new IndexOverviewScreen(new IndexOverviewScreenContract$InputData(aVar8.f74586a, aVar8.f74587b));
                }
                if (!Intrinsics.f(item, IndexDetailsFlowContract$PagerItem.NewsItem.f74584a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hx7.e.n(new IllegalStateException("News tab not implemented yet"));
                return new IndexOverviewScreen(new IndexOverviewScreenContract$InputData(aVar8.f74586a, aVar8.f74587b));
            case 11:
                yzg.d value = (yzg.d) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value, "value");
                ((e8h.j) obj4).f123697a.f("STORAGE_FREE_STOCKS_CAMPAIGN_KEY", value);
                return Unit.f186387a;
            case 12:
                String promotionId = (String) obj2;
                b0h.a promotion = (b0h.a) obj3;
                Intrinsics.checkNotNullParameter(promotionId, "promotionId");
                Intrinsics.checkNotNullParameter(promotion, "promotion");
                ((e8h.y) obj4).f123736c.f(e8h.w.a(e8h.y.Companion, promotionId), promotion);
                return Unit.f186387a;
            case 13:
                Set ids = (Set) obj2;
                List data2 = (List) obj3;
                Intrinsics.checkNotNullParameter(ids, "ids");
                Intrinsics.checkNotNullParameter(data2, "data");
                ((c0) obj4).f123674a.f(c0.a(ids), data2);
                return Unit.f186387a;
            case 14:
                List disclaimers = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
                ((p0) obj4).f123722a.f("WEALTH_DISCLAIMERS_DATA_KEY", disclaimers);
                return Unit.f186387a;
            case 15:
                e8k.b bVar4 = (e8k.b) obj4;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((PaymentLinksFlowContract$Step) obj3, "<unused var>");
                PaymentLinksAmountScreen paymentLinksAmountScreen = new PaymentLinksAmountScreen(new PaymentLinksAmountScreenContract$InputData.NewPaymentLink(bVar4.o.f102176a));
                e87.e block15 = new e87.e(bVar4, 8);
                Intrinsics.checkNotNullParameter(block15, "block");
                paymentLinksAmountScreen.H = block15;
                return paymentLinksAmountScreen;
            case 16:
                final com.revolut.feature.direct_deposit.impl.ui_kompot.flow.a aVar9 = (com.revolut.feature.direct_deposit.impl.ui_kompot.flow.a) obj4;
                final yki.l FlowCoordinator5 = (yki.l) obj2;
                DirectDepositFlowContract$Step step8 = (DirectDepositFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, DirectDepositFlowContract$Step.Account.f71948a)) {
                    DirectDepositAccountScreen directDepositAccountScreen = new DirectDepositAccountScreen();
                    Function1 block16 = new Function1() { // from class: e96.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    f96.b result = (f96.b) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, f96.b.f132837a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar9, FlowCoordinator5, DirectDepositFlowContract$Step.Setup.f71952a, false, null, false, 14);
                                    return Unit.f186387a;
                                default:
                                    j96.b result2 = (j96.b) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar9, FlowCoordinator5, new DirectDepositFlowContract$Step.FormPreview(result2.f172293a, result2.f172294b, result2.f172295c), false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    directDepositAccountScreen.H = block16;
                    return directDepositAccountScreen;
                }
                if (Intrinsics.f(step8, DirectDepositFlowContract$Step.Setup.f71952a)) {
                    DirectDepositSetupScreen directDepositSetupScreen = new DirectDepositSetupScreen();
                    Function1 block17 = new Function1() { // from class: e96.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i21) {
                                case 0:
                                    f96.b result = (f96.b) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!Intrinsics.f(result, f96.b.f132837a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar9, FlowCoordinator5, DirectDepositFlowContract$Step.Setup.f71952a, false, null, false, 14);
                                    return Unit.f186387a;
                                default:
                                    j96.b result2 = (j96.b) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar9, FlowCoordinator5, new DirectDepositFlowContract$Step.FormPreview(result2.f172293a, result2.f172294b, result2.f172295c), false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    directDepositSetupScreen.H = block17;
                    return directDepositSetupScreen;
                }
                if (!(step8 instanceof DirectDepositFlowContract$Step.FormPreview)) {
                    throw new NoWhenBranchMatchedException();
                }
                DirectDepositFlowContract$Step.FormPreview formPreview = (DirectDepositFlowContract$Step.FormPreview) step8;
                DirectDepositPreviewScreen directDepositPreviewScreen = new DirectDepositPreviewScreen(new DirectDepositPreviewContract$InputData(formPreview.f71949a, formPreview.f71950b, formPreview.f71951c));
                baa.c block18 = new baa.c(aVar9, FlowCoordinator5, 8);
                Intrinsics.checkNotNullParameter(block18, "block");
                directDepositPreviewScreen.H = block18;
                return directDepositPreviewScreen;
            case 17:
                Map domain = (Map) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((e98.f) obj4).f123931b.f("CARD_REQUESTS_KEY", domain);
                return Unit.f186387a;
            case 18:
                com.revolut.feature.revolutpay.impl.ui.native_move_money.a aVar10 = (com.revolut.feature.revolutpay.impl.ui.native_move_money.a) obj4;
                yki.l FlowCoordinator6 = (yki.l) obj2;
                RevolutPayMoveMoneyFlowContract$Step step9 = (RevolutPayMoveMoneyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof RevolutPayMoveMoneyFlowContract$Step.MoveMoney)) {
                    throw new NoWhenBranchMatchedException();
                }
                r8c.a aVar11 = aVar10.o;
                RevolutPayMoveMoneyFlowContract$InputData revolutPayMoveMoneyFlowContract$InputData = aVar10.f84505q;
                u6c.l lVar2 = revolutPayMoveMoneyFlowContract$InputData.f84502c;
                String str2 = revolutPayMoveMoneyFlowContract$InputData.d;
                long j2 = revolutPayMoveMoneyFlowContract$InputData.e;
                aVar11.getClass();
                ViewController viewControllerE17 = aVar10.e1(new y5i.a(r8c.a.a(lVar2, str2, j2), null, 14));
                e87.e block19 = new e87.e(aVar10, 9);
                Intrinsics.checkNotNullParameter(block19, "block");
                viewControllerE17.H = block19;
                return viewControllerE17;
            case 19:
                j7d.a aVar12 = (j7d.a) obj4;
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return (th10 == null || (listB = iii.c.b(null, null, 6, true)) == null) ? e9d.c.b(aVar12) : listB;
            case 20:
                final com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar13 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) obj4;
                cli.y yVar = aVar13.A;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevolutPayManagementHomeControllerContract$Step step10 = (RevolutPayManagementHomeControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof RevolutPayManagementHomeControllerContract$Step.ProductArticle) {
                    ViewController viewControllerE18 = aVar13.e1(new ProductArticleDescriptor(((RevolutPayManagementHomeControllerContract$Step.ProductArticle) step10).f84588a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    e8e.y block20 = new e8e.y(14);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    viewControllerE18.H = block20;
                    return viewControllerE18;
                }
                if (step10 instanceof RevolutPayManagementHomeControllerContract$Step.SelectPaymentMethod) {
                    u6c.t tVar = u6c.t.REVPAY;
                    od0.i iVar = (od0.i) ((eac.h) ((j2) yVar.f22677a).getValue()).f124167c.getContent();
                    ViewController viewControllerE19 = aVar13.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(tVar, null, iVar != null ? (PaymentMethod) iVar.f224257a : null, new PayWithAnyFundingOptions(new CardPaymentAvailability.Available(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c.b()), 6), w6c.f.SETUP_DEFAULT_PAYMENT_METHOD, 3760)));
                    Function1 block21 = new Function1() { // from class: eac.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i22 = i21;
                            com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar14 = aVar13;
                            switch (i22) {
                                case 0:
                                    oec.a result = (oec.a) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof oec.b) {
                                        aVar14.H2(aVar14.A, new e87.e(result, 11));
                                    } else {
                                        if (!(result instanceof oec.c) && !Intrinsics.f(result, a.C1251a.f224576a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i32 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    w6c.e result2 = (w6c.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof w6c.c) {
                                        aVar14.H2(aVar14.A, new bg4.x(result2, 1));
                                    } else {
                                        if (!(result2 instanceof w6c.d) && !(result2 instanceof w6c.a) && !(result2 instanceof w6c.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i33 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    viewControllerE19.H = block21;
                    return viewControllerE19;
                }
                if (!(step10 instanceof RevolutPayManagementHomeControllerContract$Step.SelectShippingContact)) {
                    if (step10 instanceof RevolutPayManagementHomeControllerContract$Step.PayWithSmileSettings) {
                        return aVar13.e1(ol9.c.f226362a);
                    }
                    if (step10 instanceof RevolutPayManagementHomeControllerContract$Step.PayWithSmileEnrollment) {
                        return aVar13.e1(ol9.a.f226360a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ShippingContact shippingContact = (ShippingContact) ((eac.h) ((j2) yVar.f22677a).getValue()).d.getContent();
                ViewController viewControllerE110 = aVar13.e1(new oec.d(new ShippingContactsScreenDescriptor$InputData(ShippingContactsScreenDescriptor$InputData.ModeConfiguration.UpdatedDefaultContact.f84747a, shippingContact != null ? shippingContact.f84740a : null, false)));
                Function1 block22 = new Function1() { // from class: eac.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i22 = i6;
                        com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar14 = aVar13;
                        switch (i22) {
                            case 0:
                                oec.a result = (oec.a) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof oec.b) {
                                    aVar14.H2(aVar14.A, new e87.e(result, 11));
                                } else {
                                    if (!(result instanceof oec.c) && !Intrinsics.f(result, a.C1251a.f224576a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i32 = jli.h.f175850a;
                                }
                                return Unit.f186387a;
                            default:
                                w6c.e result2 = (w6c.e) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof w6c.c) {
                                    aVar14.H2(aVar14.A, new bg4.x(result2, 1));
                                } else {
                                    if (!(result2 instanceof w6c.d) && !(result2 instanceof w6c.a) && !(result2 instanceof w6c.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int i33 = jli.h.f175850a;
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                viewControllerE110.H = block22;
                return viewControllerE110;
            case 21:
                com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a aVar14 = (com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a) obj4;
                ExpiredApplicationLazyFlowContract$InputData expiredApplicationLazyFlowContract$InputData = aVar14.f67659p;
                ExpiredApplicationLazyFlowContract$Step step11 = (ExpiredApplicationLazyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof ExpiredApplicationLazyFlowContract$Step.Popup)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController.Companion aVar15 = ActionsBottomSheetController.INSTANCE;
                lw0.a aVar16 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_expired_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_expired_dialog_description, null, null, 14), null, null, false, 28);
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = expiredApplicationLazyFlowContract$InputData.f67655a;
                if (creditApplicationPluginFlowContract$Configuration.d == j1.CREDIT_CARD_LIMIT_DECREASE && creditApplicationPluginFlowContract$Configuration.e == gt3.b.USER_INITIATED) {
                    hVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_expired_dialog_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, 55);
                } else {
                    m6 m6Var = n6.Companion;
                    hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_expired_dialog_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_expired_dialog_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                }
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                CreditApplicationCommonContext creditApplicationCommonContextO = t1.O(expiredApplicationLazyFlowContract$InputData);
                companion.getClass();
                ActionsBottomSheetController actionsBottomSheetControllerB = dy4.a.b(aVar15, aVar16, hVar, new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextO)), 8);
                md6.s.E(actionsBottomSheetControllerB, new a97.i(2, aVar14, com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 21), true, new a54.g(aVar14, null, 17), new e87.e(aVar14, 15));
                return actionsBottomSheetControllerB;
            case 22:
                com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.b bVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.b) obj4;
                yki.l FlowCoordinator7 = (yki.l) obj2;
                ExpiredApplicationRootFlowContract$Step step12 = (ExpiredApplicationRootFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof ExpiredApplicationRootFlowContract$Step.ExpiredPopup)) {
                    throw new NoWhenBranchMatchedException();
                }
                ExpiredPopupController expiredPopupController = new ExpiredPopupController(new ExpiredPopupControllerContract$InputData(bVar5.f67662p.f67657a));
                e87.e block23 = new e87.e(bVar5, 16);
                Intrinsics.checkNotNullParameter(block23, "block");
                expiredPopupController.H = block23;
                return expiredPopupController;
            case 23:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a aVar17 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransferOutReviewScreenContract$ModalStep step13 = (TransferOutReviewScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof TransferOutReviewScreenContract$ModalStep.FeesBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                ebf.a aVar18 = aVar17.f91647r;
                ArrayList fees = ((TransferOutReviewScreenContract$ModalStep.FeesBreakdown) step13).f91644a;
                aVar18.getClass();
                Intrinsics.checkNotNullParameter(fees, "fees");
                lw0.a aVar19 = new lw0.a(new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_fees_breakdown_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_fees_breakdown_subtitle, null, null, 14), null, null, false, 28);
                List listP0 = d0.P0(t0.C(k0.a(new ebf.b(0, fees))), cim.b.a(new e8e.y(22), new e8e.y(23)));
                ArrayList arrayList = new ArrayList(zhm.w.t(listP0, 10));
                for (Iterator it8 = listP0.iterator(); it8.hasNext(); it8 = it8) {
                    Pair pair = (Pair) it8.next();
                    dj0.d dVar = (dj0.d) pair.f186385a;
                    int iIntValue = ((Number) pair.f186386b).intValue();
                    xi0.b bVar6 = dVar.f115083b;
                    xi0.b bVar7 = dVar.f115083b;
                    long j3 = dVar.f115082a;
                    arrayList.add(new eii.b(new CellDetailsDelegate.Model("TRANSFER_OUT_REVIEW_FEE_BREAKDOWN__" + bVar6.f306286a + "_" + j3, new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_fees_breakdown_currency_row, zhm.v.k(new CurrencyClause(bVar7, CurrencyClause.Format.Ticker.f57756a, null, 4), Integer.valueOf(iIntValue), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), (Image) null, 0, false, 30), new MoneyClause(new dj0.d(((long) iIntValue) * j3, bVar7), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712)));
                }
                k9 k9Var = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new RowActionsBottomSheetController(new eii.c(aVar19, null, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
            case 24:
                final com.revolut.feature.cash_topup.impl.ui.flow.map.a aVar20 = (com.revolut.feature.cash_topup.impl.ui.flow.map.a) obj4;
                final yki.l FlowCoordinator8 = (yki.l) obj2;
                CashTopUpMapFlowContract$Step step14 = (CashTopUpMapFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator8, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof CashTopUpMapFlowContract$Step.LocationPermissions) {
                    PermissionsFlow permissionsFlow = new PermissionsFlow(zhm.u.c(new PermissionsFlowContract$Permission("android.permission.ACCESS_FINE_LOCATION", aVar20.f65660q.a(), 10)));
                    Function1 function1 = new Function1() { // from class: ec3.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    com.revolut.kompot.common.flow.permissions.a result = (com.revolut.kompot.common.flow.permissions.a) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof sii.c) && !(result instanceof d)) {
                                        if (!Intrinsics.f(result, a.C0596a.f98352a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar20, FlowCoordinator8, CashTopUpMapFlowContract$Step.Map.f65658a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    m result2 = (m) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof j;
                                    com.revolut.feature.cash_topup.impl.ui.flow.map.a aVar21 = aVar20;
                                    if (z) {
                                        h.t2(aVar21, FlowCoordinator8, new CashTopUpMapFlowContract$Step.Details(((j) result2).f224069a), true, null, false, 12);
                                    } else if (result2 instanceof k) {
                                        CashTopUpLocationInfo cashTopUpLocationInfo = ((k) result2).f224070a;
                                        aVar21.C1(new BridgeDestination(((ri3.a) aVar21.o).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                                    } else if (result2 instanceof i) {
                                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("received unexpected result DepositCashClicked(locationId=", ((i) result2).f224068a, ")"));
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    } else if (result2 instanceof m.a) {
                                        IllegalStateException illegalStateException2 = new IllegalStateException("received unexpected result ShowBarcode");
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    } else {
                                        if (!(result2 instanceof l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException3 = new IllegalStateException(p.a.p("received unexpected result SelectLocationClicked(locationId=", ((l) result2).f224071a, ")"));
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
                if (Intrinsics.f(step14, CashTopUpMapFlowContract$Step.Map.f65658a)) {
                    CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = new CashTopUpLocationsMapScreen(new CashTopUpLocationsMapScreenContract$InputData(cb3.a.EU_FLOW, ub3.k.NoEuActions));
                    Function1 function12 = new Function1() { // from class: ec3.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i21) {
                                case 0:
                                    com.revolut.kompot.common.flow.permissions.a result = (com.revolut.kompot.common.flow.permissions.a) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof sii.c) && !(result instanceof d)) {
                                        if (!Intrinsics.f(result, a.C0596a.f98352a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar20, FlowCoordinator8, CashTopUpMapFlowContract$Step.Map.f65658a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    m result2 = (m) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z = result2 instanceof j;
                                    com.revolut.feature.cash_topup.impl.ui.flow.map.a aVar21 = aVar20;
                                    if (z) {
                                        h.t2(aVar21, FlowCoordinator8, new CashTopUpMapFlowContract$Step.Details(((j) result2).f224069a), true, null, false, 12);
                                    } else if (result2 instanceof k) {
                                        CashTopUpLocationInfo cashTopUpLocationInfo = ((k) result2).f224070a;
                                        aVar21.C1(new BridgeDestination(((ri3.a) aVar21.o).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                                    } else if (result2 instanceof i) {
                                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("received unexpected result DepositCashClicked(locationId=", ((i) result2).f224068a, ")"));
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    } else if (result2 instanceof m.a) {
                                        IllegalStateException illegalStateException2 = new IllegalStateException("received unexpected result ShowBarcode");
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    } else {
                                        if (!(result2 instanceof l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException3 = new IllegalStateException(p.a.p("received unexpected result SelectLocationClicked(locationId=", ((l) result2).f224071a, ")"));
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
                if (!(step14 instanceof CashTopUpMapFlowContract$Step.Details)) {
                    throw new NoWhenBranchMatchedException();
                }
                CashTopUpDetailsScreen cashTopUpDetailsScreen = new CashTopUpDetailsScreen(new CashTopUpDetailsScreenContract$InputData(((CashTopUpMapFlowContract$Step.Details) step14).f65656a, ub3.k.NoEuActions));
                e87.e eVar = new e87.e(aVar20, 17);
                Intrinsics.checkNotNullParameter(eVar, "<set-?>");
                cashTopUpDetailsScreen.H = eVar;
                return cashTopUpDetailsScreen;
            case 25:
                com.revolut.feature.pockets.impl.details_v2.mcy.b bVar8 = (com.revolut.feature.pockets.impl.details_v2.mcy.b) obj4;
                PocketDetailsMcyFlowContract$Step step15 = (PocketDetailsMcyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof PocketDetailsMcyFlowContract$Step.McyGlobalAccessStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                k9 k9Var2 = k9.Accounts;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE111 = bVar8.e1(new l89.c(((PocketDetailsMcyFlowContract$Step.McyGlobalAccessStep) step15).f80827a, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2)));
                dkm.a block24 = new dkm.a(1, bVar8, com.revolut.feature.pockets.impl.details_v2.mcy.b.class, "handleMcyOutput", "handleMcyOutput(Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput;)V", 0, 23);
                Intrinsics.checkNotNullParameter(block24, "block");
                viewControllerE111.H = block24;
                return viewControllerE111;
            case 26:
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a aVar21 = (com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EarnAssetsScreenContract$ModalStep step16 = (EarnAssetsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof EarnAssetsScreenContract$ModalStep.AutoStakingControl) {
                    gud.a aVar22 = aVar21.f70799t;
                    EarnAssetsScreenContract$ModalStep.AutoStakingControl autoStakingControl = (EarnAssetsScreenContract$ModalStep.AutoStakingControl) step16;
                    io3.d pocket = autoStakingControl.f70790a;
                    StakingProduct stakingProduct = autoStakingControl.f70791b;
                    aVar22.getClass();
                    Intrinsics.checkNotNullParameter(pocket, "pocket");
                    Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
                    return aVar21.e1(new u7j.b(pocket, stakingProduct));
                }
                if (step16 instanceof EarnAssetsScreenContract$ModalStep.EarnAssetDetails) {
                    gud.c cVar = aVar21.u;
                    StakingPocket stakingPocket = ((EarnAssetsScreenContract$ModalStep.EarnAssetDetails) step16).f70793a;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
                    return aVar21.e1(new u7j.a(stakingPocket));
                }
                if (step16 instanceof EarnAssetsScreenContract$ModalStep.Clarification) {
                    return new StakingClarificationDialog();
                }
                if (step16 instanceof EarnAssetsScreenContract$ModalStep.MonthRewards) {
                    return new MonthRewardsClarificationDialog();
                }
                if (step16 instanceof EarnAssetsScreenContract$ModalStep.AllTimeRewards) {
                    return new AllTimeRewardsClarificationDialog();
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a aVar23 = (com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) obj4;
                PersonalDetailsFlowContract$InputData personalDetailsFlowContract$InputData = aVar23.f68185p;
                yki.l FlowCoordinator9 = (yki.l) obj2;
                PersonalDetailsFlowContract$Step step17 = (PersonalDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator9, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof PersonalDetailsFlowContract$Step.Details) {
                    PersonalDetailsScreen personalDetailsScreen = new PersonalDetailsScreen(new PersonalDetailsScreenContract$InputData(personalDetailsFlowContract$InputData.f68181a));
                    e87.e block25 = new e87.e(aVar23, i2);
                    Intrinsics.checkNotNullParameter(block25, "block");
                    personalDetailsScreen.H = block25;
                    return personalDetailsScreen;
                }
                if (step17 instanceof PersonalDetailsFlowContract$Step.CustomerIdentification) {
                    return new CustomerIdentificationScreen(new CustomerIdentificationScreenContract$InputData(personalDetailsFlowContract$InputData.f68181a));
                }
                if (step17 instanceof PersonalDetailsFlowContract$Step.ProfileAddress) {
                    return aVar23.e1(new ProfileAddressControllerDescriptor(new ProfileAddressControllerDescriptor.InputData(true)));
                }
                throw new NoWhenBranchMatchedException();
            case 28:
                com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a aVar24 = (com.revolut.feature.travel.miles.impl.ui.flow.airline_details.a) obj4;
                yki.l FlowCoordinator10 = (yki.l) obj2;
                TravelMilesAirlineDetailsFlowContract$Step step18 = (TravelMilesAirlineDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator10, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (step18 instanceof TravelMilesAirlineDetailsFlowContract$Step.AirlineDetails) {
                    TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen = new TravelMilesAirlineDetailsScreen(new TravelMilesAirlineDetailsScreenContract$InputData(((TravelMilesAirlineDetailsFlowContract$Step.AirlineDetails) step18).f94197a));
                    eed.j block26 = new eed.j(aVar24, FlowCoordinator10, i21);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    travelMilesAirlineDetailsScreen.H = block26;
                    return travelMilesAirlineDetailsScreen;
                }
                if (step18 instanceof TravelMilesAirlineDetailsFlowContract$Step.AccountRegistration) {
                    TravelMilesAirline travelMilesAirline = ((TravelMilesAirlineDetailsFlowContract$Step.AccountRegistration) step18).f94196a;
                    TravelMilesAccountRegistrationScreen travelMilesAccountRegistrationScreen = new TravelMilesAccountRegistrationScreen(new TravelMilesAccountRegistrationScreenContract$InputData(travelMilesAirline.f94091g, travelMilesAirline.f94089b, travelMilesAirline.f94088a));
                    eed.i iVar2 = new eed.i(aVar24, i5, FlowCoordinator10, step18);
                    Intrinsics.checkNotNullParameter(iVar2, "<set-?>");
                    travelMilesAccountRegistrationScreen.H = iVar2;
                    return travelMilesAccountRegistrationScreen;
                }
                if (!(step18 instanceof TravelMilesAirlineDetailsFlowContract$Step.TopUp)) {
                    if (step18 instanceof TravelMilesAirlineDetailsFlowContract$Step.SeeAllUserVouchers) {
                        return new TravelMilesAirlineSeeAllScreen(new TravelMilesAirlineSeeAllScreenContract$InputData(((TravelMilesAirlineDetailsFlowContract$Step.SeeAllUserVouchers) step18).f94198a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                TravelMilesAirlineDetailsFlowContract$Step.TopUp topUp = (TravelMilesAirlineDetailsFlowContract$Step.TopUp) step18;
                TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData = new TravelMilesTransferScreenContract$InputData(topUp.f94199a, topUp.f94200b, topUp.f94201c);
                egg.d block27 = new egg.d(aVar24, i6);
                TravelMilesTransferScreen travelMilesTransferScreen = new TravelMilesTransferScreen(travelMilesTransferScreenContract$InputData);
                Intrinsics.checkNotNullParameter(block27, "block");
                travelMilesTransferScreen.H = block27;
                return travelMilesTransferScreen;
            default:
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b bVar9 = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FundInvestmentDetailsScreenContract$ModalStep step19 = (FundInvestmentDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (!(step19 instanceof FundInvestmentDetailsScreenContract$ModalStep.ShowLockupPeriodInfo)) {
                    if (Intrinsics.f(step19, FundInvestmentDetailsScreenContract$ModalStep.ShowAveragePriceInfo.f95810a)) {
                        return bVar9.e1(j3h.d.f171191a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                FundInvestmentDetailsScreenContract$ModalStep.ShowLockupPeriodInfo showLockupPeriodInfo = (FundInvestmentDetailsScreenContract$ModalStep.ShowLockupPeriodInfo) step19;
                bVar9.getClass();
                kel.n nVar = showLockupPeriodInfo.f95812b;
                int i22 = egh.n.f125659a[showLockupPeriodInfo.f95811a.ordinal()];
                if (i22 == 1) {
                    bVar = ggh.b.UNLOCKED;
                } else if (i22 == 2) {
                    bVar = ggh.b.SOFT_LOCKUP;
                } else {
                    if (i22 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = ggh.b.HARD_LOCKUP;
                }
                return new FundLockupPeriodScreen(new ggh.c(nVar, bVar));
        }
    }

    public /* synthetic */ r(Object obj2, int i) {
        this.f122761a = i;
        this.f122762b = obj2;
    }
}
