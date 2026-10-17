package s6d;

import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedContract$Step;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$Step;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main.PortfolioInsightsScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.a;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status.MarginStatusScreenContract$ModalStep;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreenContract$InputData;
import com.revolut.tracking.v3.ItemPickerSearchContext;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s6h.m;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260254a;

    public /* synthetic */ r(int i) {
        this.f260254a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f260254a) {
            case 0:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 2:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                Subaccount subaccount = (Subaccount) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (subaccount == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 6:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 7:
                Throwable th12 = (Throwable) obj2;
                if (((Map) obj3) == null) {
                    return th12;
                }
                return null;
            case 8:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                MarginStatusScreenContract$ModalStep step = (MarginStatusScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, MarginStatusScreenContract$ModalStep.MarginStatusInfo.f95474a)) {
                    return new MarginStatusInfoScreen(new MarginStatusInfoScreenContract$InputData(u6h.d.MARGIN_STATUS));
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                m.a aVar = s6h.m.Companion;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(10, null, false, false, "LIST_ID_ERROR"));
            case 10:
                ItemPickerSearchContext old2 = (ItemPickerSearchContext) obj2;
                ItemPickerSearchContext itemPickerSearchContext = (ItemPickerSearchContext) obj3;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(itemPickerSearchContext, "new");
                return Boolean.valueOf(old2.getQuery().equals(itemPickerSearchContext.getQuery()));
            case 11:
                yki.l FlowCoordinator = (yki.l) obj2;
                PortfolioInsightsFlowContract$Step step2 = (PortfolioInsightsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof PortfolioInsightsFlowContract$Step.PortfolioInsights) {
                    return new PortfolioInsightsScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 14:
                Throwable th13 = (Throwable) obj2;
                if (((LoanBackupCard) obj3) == null) {
                    return th13;
                }
                return null;
            case 15:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 16:
                Function1 getError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getError, "getError");
                return ue0.e.J(s87.d.a(), (List) getError.invoke(new iii.d(6, q87.m.f243025a, true, false, null)));
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 18:
                Throwable error5 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list3 == null) {
                    return error5;
                }
                return null;
            case 19:
                Throwable error6 = (Throwable) obj2;
                of8.b bVar = (of8.b) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bVar == null) {
                    return error6;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                b.a aVar2 = com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "getDefaultErrorItems");
                return a.C0562a.f91495a;
            case 22:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                b.a aVar3 = com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b.Companion;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 23:
                Throwable error7 = (Throwable) obj2;
                InvestTransaction investTransaction = (InvestTransaction) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (investTransaction == null) {
                    return error7;
                }
                return null;
            case 24:
                Throwable error8 = (Throwable) obj2;
                ybl.h hVar = (ybl.h) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (hVar == null) {
                    return error8;
                }
                return null;
            case 25:
                Throwable th14 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th14;
                }
                return null;
            case 26:
                Throwable th15 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th15;
                }
                return null;
            case 27:
                Throwable error9 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (iVar == null) {
                    return error9;
                }
                return null;
            case 28:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                DirectDebitFailedContract$Step step3 = (DirectDebitFailedContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                throw new IllegalStateException(("Unexpected step: " + step3).toString());
            default:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null));
        }
    }

    public /* synthetic */ r(Object obj2, int i) {
        this.f260254a = i;
    }
}
