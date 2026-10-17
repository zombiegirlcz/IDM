package p55;

import aii.u;
import aii.x;
import com.revolut.feature.credit.loan.api.LoanApi$Toggles;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotDestination;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayRootFlow;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details.LoanDirectDebitAccountDetailsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_account_details.LoanDirectDebitAccountDetailsRootFlow;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.LoanDirectDebitFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.LoanDirectDebitRootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.LoanCancellationFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.LoanCancellationRootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2RootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.change_repayment_account.setup_sepa_direct_debit.LoanSetupSepaAccountFlowController;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayRootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.LoanDocumentsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.LoanDocumentsFlowController;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownController;
import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.loanslist.LoansListScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.LoanPaymentSettingsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow.LoanPaymentSettingsFlowController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.LoanPaymentManagementFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.LoanPaymentManagementFlowController;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2Controller;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedcreditlistv2.LoanRefinancedCreditListV2ControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt.LoanRefinancedSettlementPromptScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt.LoanRefinancedSettlementPromptScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.renameloan.RenameLoanScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.renameloan.RenameLoanScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.LoanRepaymentAccountsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.LoanRepaymentAccountsRootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown.LoanRepaymentBreakdownControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails.LoanRepaymentDetailsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails.LoanRepaymentDetailsControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreenContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardRootFlow;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeController;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.statements.flow.LoanStatementsFlow;
import com.revolut.feature.credit.loan.impl.ui.statements.flow.LoanStatementsFlowContract$InputData;
import efm.d0;
import efm.r;
import java.util.List;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l35.b;
import om4.l0;
import om4.t3;
import p4a.g;
import r35.c;
import w4l.h;
import w4l.j;
import y45.f;
import y45.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f233020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f233021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f233022c;

    public a(b loanInteractor, i loanProductInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f233020a = loanInteractor;
        this.f233021b = loanProductInteractor;
        this.f233022c = featureToggleInteractor;
    }

    @Override // nhi.f
    public final Object d(x xVar, Continuation continuation) {
        boolean z = xVar instanceof c;
        b bVar = this.f233020a;
        i iVar = this.f233021b;
        if (z) {
            String strA = ((c) xVar).a();
            d0 d0VarFirstOrError = m70.a.g(nim.a.w(kli.a.h(iVar.b(strA, h.f294642c), ((f) bVar).l(strA, j.f294644c)), new t3(strA, 20)), null, new g(5), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            Object objB = nim.a.b(d0VarFirstOrError, continuation);
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : (u) objB;
        }
        if (!(xVar instanceof r35.b)) {
            return null;
        }
        String strA2 = ((r35.b) xVar).a();
        r rVarX = new ufm.i(b.d(bVar, strA2, null, 6), new p30.b(25, new p4c.u(29)), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        d0 d0VarFirstOrError2 = m70.a.g(nim.a.w(kli.a.h(rVarX, iVar.b(strA2, h.f294642c)), new l0(this, 18, strA2, xVar)), null, new g(6), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        Object objB2 = nim.a.b(d0VarFirstOrError2, continuation);
        return objB2 == fim.a.COROUTINE_SUSPENDED ? objB2 : (u) objB2;
    }

    @Override // nte.a
    public final List e() {
        return LoanApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        LoanKompotDestination loanKompotDestination = destination instanceof LoanKompotDestination ? (LoanKompotDestination) destination : null;
        if (loanKompotDestination == null) {
            return null;
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.StatementsNavigationDestination) {
            LoanKompotFeatureConfig.StatementsNavigationDestination statementsNavigationDestination = (LoanKompotFeatureConfig.StatementsNavigationDestination) loanKompotDestination;
            return gc0.c.b(new LoanStatementsFlow(new LoanStatementsFlowContract$InputData(statementsNavigationDestination.getF70272a(), statementsNavigationDestination.getF70273b())), new ogk.b(9));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.DirectDebitsNavigationDestination) {
            return new LoanDirectDebitRootFlow(new LoanDirectDebitFlowContract$InputData(((LoanKompotFeatureConfig.DirectDebitsNavigationDestination) loanKompotDestination).getF70229a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.ExternalAccountDetailsNavigationDestination) {
            return new LoanDirectDebitAccountDetailsRootFlow(new LoanDirectDebitAccountDetailsFlowContract$InputData(((LoanKompotFeatureConfig.ExternalAccountDetailsNavigationDestination) loanKompotDestination).getF70231a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RepaymentsListDestination) {
            return new LoanRepaymentsListScreen(new LoanRepaymentsListScreenContract$InputData(((LoanKompotFeatureConfig.RepaymentsListDestination) loanKompotDestination).getF70258a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestination) {
            LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestination upcomingInstalmentDetailsDestination = (LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestination) loanKompotDestination;
            return gc0.c.b(new LoanInstalmentDetailsScreen(new LoanInstalmentDetailsScreenContract$InputData.PreloadedContent(upcomingInstalmentDetailsDestination.getF70278a(), upcomingInstalmentDetailsDestination.getF70279b())), new ogk.b(10));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestinationAsync) {
            LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestinationAsync upcomingInstalmentDetailsDestinationAsync = (LoanKompotFeatureConfig.UpcomingInstalmentDetailsDestinationAsync) loanKompotDestination;
            return gc0.c.b(new LoanInstalmentDetailsScreen(new LoanInstalmentDetailsScreenContract$InputData.LoadContent(upcomingInstalmentDetailsDestinationAsync.getF70280a(), upcomingInstalmentDetailsDestinationAsync.getF70281b())), new ogk.b(11));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.AutoPayNavigationDestination) {
            LoanKompotFeatureConfig.AutoPayNavigationDestination autoPayNavigationDestination = (LoanKompotFeatureConfig.AutoPayNavigationDestination) loanKompotDestination;
            return new LoanAutopayRootFlow(new LoanAutopayFlowContract$InputData(autoPayNavigationDestination.getF70223a(), autoPayNavigationDestination.getF70224b()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.AccountDetailsNavigationDestination) {
            return new LoanAccountDetailsScreen(new LoanAccountDetailsScreenContract$InputData(((LoanKompotFeatureConfig.AccountDetailsNavigationDestination) loanKompotDestination).getF70220a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.SelectAutoPayNavigationDestination) {
            return new LoanSelectAutopayScreen(new LoanSelectAutopayScreenContract$InputData(((LoanKompotFeatureConfig.SelectAutoPayNavigationDestination) loanKompotDestination).getF70260a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.SelectBackupCardFlowNavigationDestination) {
            LoanKompotFeatureConfig.SelectBackupCardFlowNavigationDestination selectBackupCardFlowNavigationDestination = (LoanKompotFeatureConfig.SelectBackupCardFlowNavigationDestination) loanKompotDestination;
            return new LoanSelectBackupCardRootFlow(new LoanSelectBackupCardFlowContract$InputData(selectBackupCardFlowNavigationDestination.getF70263a(), selectBackupCardFlowNavigationDestination.getF70264b(), selectBackupCardFlowNavigationDestination.getF70265c()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.ManageRepaymentsDestination) {
            LoanKompotFeatureConfig.ManageRepaymentsDestination manageRepaymentsDestination = (LoanKompotFeatureConfig.ManageRepaymentsDestination) loanKompotDestination;
            return new LoanRepaymentAccountsRootFlow(new LoanRepaymentAccountsFlowContract$InputData(manageRepaymentsDestination.getF70236c(), manageRepaymentsDestination.getF70234a(), manageRepaymentsDestination.getF70235b()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.ChangeRepaymentDayFlowNavigationDestination) {
            return new LoanChangeRepaymentDayRootFlow(new LoanChangeRepaymentDayFlowContract$InputData(((LoanKompotFeatureConfig.ChangeRepaymentDayFlowNavigationDestination) loanKompotDestination).getF70228a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.LoansListNavigationDestination) {
            return new LoansListScreen();
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RenameLoanNavigationDestination) {
            return new RenameLoanScreen(new RenameLoanScreenContract$InputData(((LoanKompotFeatureConfig.RenameLoanNavigationDestination) loanKompotDestination).getF70245a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.PartialRepaymentDestination) {
            LoanKompotFeatureConfig.PartialRepaymentDestination partialRepaymentDestination = (LoanKompotFeatureConfig.PartialRepaymentDestination) loanKompotDestination;
            return gc0.c.b(new LoanPartialRepaymentController(new LoanPartialRepaymentControllerContract$InputData(partialRepaymentDestination.getF70238a(), partialRepaymentDestination.getF70239b())), new ogk.b(12));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RepaymentV2Destination) {
            LoanKompotFeatureConfig.RepaymentV2Destination repaymentV2Destination = (LoanKompotFeatureConfig.RepaymentV2Destination) loanKompotDestination;
            return new LoanRepaymentFlowController(new LoanRepaymentFlowContract$InputData(repaymentV2Destination.getF70255a(), repaymentV2Destination.getF70256b(), repaymentV2Destination.getF70257c(), repaymentV2Destination.getD()));
        }
        boolean z = loanKompotDestination instanceof LoanKompotFeatureConfig.CancellationDestination;
        gte.a aVar = this.f233022c;
        if (z) {
            String f70226a = ((LoanKompotFeatureConfig.CancellationDestination) loanKompotDestination).getF70226a();
            return ((d) aVar).c(LoanApi$Toggles.LoanCancellationV2.f70065c) ? new LoanCancellationV2RootFlow(new LoanCancellationV2FlowContract$InputData(f70226a)) : new LoanCancellationRootFlow(new LoanCancellationFlowContract$InputData(f70226a));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.WelcomeDestination) {
            return gc0.c.b(new LoanWelcomeController(new LoanWelcomeControllerContract$InputData(((LoanKompotFeatureConfig.WelcomeDestination) loanKompotDestination).getF70283a())), new ogk.b(8));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.DocumentsNavigationDestination) {
            return new LoanDocumentsFlowController(new LoanDocumentsFlowContract$InputData(((LoanKompotFeatureConfig.DocumentsNavigationDestination) loanKompotDestination).getF70230a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RefinancedCreditsListV2Destination) {
            return new LoanRefinancedCreditListV2Controller(new LoanRefinancedCreditListV2ControllerContract$InputData(((LoanKompotFeatureConfig.RefinancedCreditsListV2Destination) loanKompotDestination).getF70242a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RepaymentTypePreloadedDestination) {
            return new LoanRepaymentTypeController(new LoanRepaymentTypeControllerContract$InputData(((LoanKompotFeatureConfig.RepaymentTypePreloadedDestination) loanKompotDestination).getF70254a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RepaymentBreakdownDestination) {
            LoanKompotFeatureConfig.RepaymentBreakdownDestination repaymentBreakdownDestination = (LoanKompotFeatureConfig.RepaymentBreakdownDestination) loanKompotDestination;
            return new LoanRepaymentBreakdownController(new LoanRepaymentBreakdownControllerContract$InputData(repaymentBreakdownDestination.getF70246a(), repaymentBreakdownDestination.getF70247b(), repaymentBreakdownDestination.getF70248c(), repaymentBreakdownDestination.getD(), repaymentBreakdownDestination.getE(), repaymentBreakdownDestination.getF()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RepaymentDetailsDestination) {
            LoanKompotFeatureConfig.RepaymentDetailsDestination repaymentDetailsDestination = (LoanKompotFeatureConfig.RepaymentDetailsDestination) loanKompotDestination;
            return new LoanRepaymentDetailsController(new LoanRepaymentDetailsControllerContract$InputData(repaymentDetailsDestination.getF70251a(), repaymentDetailsDestination.getF70252b(), repaymentDetailsDestination.getF70253c()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.RefinancedSettlementPromptDestination) {
            return new LoanRefinancedSettlementPromptScreen(new LoanRefinancedSettlementPromptScreenContract$InputData(((LoanKompotFeatureConfig.RefinancedSettlementPromptDestination) loanKompotDestination).getF70244a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.InterestRateBreakdownDestination) {
            return new LoanInterestRateBreakdownController(new LoanInterestRateBreakdownControllerContract$InputData(((LoanKompotFeatureConfig.InterestRateBreakdownDestination) loanKompotDestination).getF70232a()));
        }
        if (loanKompotDestination instanceof LoanKompotFeatureConfig.PaymentManagementDestination) {
            String f70240a = ((LoanKompotFeatureConfig.PaymentManagementDestination) loanKompotDestination).getF70240a();
            return ((d) aVar).c(LoanApi$Toggles.LoanPaymentSettingsRevamp.f70067c) ? new LoanPaymentSettingsFlowController(new LoanPaymentSettingsFlowContract$InputData(f70240a)) : new LoanPaymentManagementFlowController(new LoanPaymentManagementFlowContract$InputData(f70240a));
        }
        if (!(loanKompotDestination instanceof LoanKompotFeatureConfig.SetupSepaDirectDebitDestination)) {
            throw new NoWhenBranchMatchedException();
        }
        LoanKompotFeatureConfig.SetupSepaDirectDebitDestination setupSepaDirectDebitDestination = (LoanKompotFeatureConfig.SetupSepaDirectDebitDestination) loanKompotDestination;
        return new LoanSetupSepaAccountFlowController(new LoanSetupSepaAccountFlowContract$InputData(setupSepaDirectDebitDestination.getF70268a(), setupSepaDirectDebitDestination.getF70269b()));
    }
}
