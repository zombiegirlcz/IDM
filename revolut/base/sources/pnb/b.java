package pnb;

import aw0.n6;
import com.revolut.feature.apm.core.ui.impl.ui.transactions_list.mapped.ApmTransactionOnlyListScreen;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsController;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.smart_driving.SmartDrivingScreen;
import com.revolut.feature.retail.savings.impl.documents.presentation.tax_form.TaxFormsScreen;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlow;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.status.RevPointsExclusiveStoreProductStatusScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreen;
import com.revolut.feature.transport.impl.ui.timer_dialog.TimerDialogController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreen;
import com.revolut.otp.input.flow.email.OtpEmailScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.terms.EsimTermsScreen;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlow;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen.InvestmentGoalsScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import mx0.q6;
import nii.n1;
import prl.j;
import prl.r;
import pti.u;
import pti.z;
import q09.b0;
import q09.m0;
import w4l.k;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((TaxFormsScreen) this.v, continuation, 0);
            case 1:
                return new b((OtpEmailScreen) this.v, continuation, 1);
            case 2:
                return new b((EsimTermsScreen) this.v, continuation, 2);
            case 3:
                return new b((SmartDrivingScreen) this.v, continuation, 3);
            case 4:
                return new b((BankListScreen) this.v, continuation, 4);
            case 5:
                return new b((ScreenerSortingPickerScreen) this.v, continuation, 5);
            case 6:
                return new b((j) this.v, continuation, 6);
            case 7:
                return new b((r) this.v, continuation, 7);
            case 8:
                return new b((com.revolut.feature.payments.groups.impl.ui_chat.settings.d) this.v, continuation, 8);
            case 9:
                return new b((psk.i) this.v, continuation, 9);
            case 10:
                return new b((MainContainerFlow) this.v, continuation, 10);
            case 11:
                return new b((com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.v, continuation, 11);
            case 12:
                return new b((pti.e) this.v, continuation, 12);
            case 13:
                return new b((u) this.v, continuation, 13);
            case 14:
                return new b((z) this.v, continuation, 14);
            case 15:
                return new b((com.revolut.feature.kyc.impl.cmd.flow.b) this.v, continuation, 15);
            case 16:
                return new b((StockDetailsFlowController) this.v, continuation, 16);
            case 17:
                return new b((RevPointsExclusiveStoreProductStatusScreen) this.v, continuation, 17);
            case 18:
                return new b((com.revolut.feature.payments.profile.impl.flow.a) this.v, continuation, 18);
            case 19:
                return new b((TimerDialogController) this.v, continuation, 19);
            case 20:
                return new b((DirectDebitAccountDetailsScreen) this.v, continuation, 20);
            case 21:
                return new b((InvestmentGoalsScreen) this.v, continuation, 21);
            case 22:
                return new b((RevolutCardSettingsController) this.v, continuation, 22);
            case 23:
                return new b((m0) this.v, continuation, 23);
            case 24:
                return new b((RevPointsTransactionsListScreen) this.v, continuation, 24);
            case 25:
                return new b((com.revolut.feature.semi_independent_activation.impl.ui.activation.b) this.v, continuation, 25);
            case 26:
                return new b((WealthAssetTypeNewsFlow) this.v, continuation, 26);
            case 27:
                return new b((com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.v, continuation, 27);
            case 28:
                return new b((q30.h) this.v, continuation, 28);
            default:
                return new b((ApmTransactionOnlyListScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((pqh.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((q6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((b0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0232 A[PHI: r9
      0x0232: PHI (r9v36 android.view.ViewGroup) = 
      (r9v34 android.view.ViewGroup)
      (r9v34 android.view.ViewGroup)
      (r9v34 android.view.ViewGroup)
      (r9v42 android.view.ViewGroup)
     binds: [B:61:0x020e, B:63:0x021b, B:65:0x021f, B:71:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028e  */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pnb.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
