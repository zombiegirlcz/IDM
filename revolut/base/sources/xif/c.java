package xif;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.aani.impl.model.DataForRegistration;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreen;
import com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$FailStartTradingOnboardingException;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.api.domain.model.balance.WealthAccountsBalance;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureStatus;
import efm.d0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.a3;
import tof.x5;
import xzg.o0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306350a;

    public /* synthetic */ c(int i) {
        this.f306350a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f306350a) {
            case 0:
                efm.i it8 = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.b(30L, TimeUnit.SECONDS);
            case 1:
                jif.c it9 = (jif.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                return new x5(it9.getCancellable());
            case 2:
                List entityList = (List) obj2;
                Intrinsics.checkNotNullParameter(entityList, "it");
                Intrinsics.checkNotNullParameter(entityList, "entityList");
                return rif.a.e(entityList);
            case 3:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 1, null);
            case 4:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : it10) {
                    if (((WealthAccount) obj3).getF95255c() != o0.UNAVAILABLE) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 5:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List<Pair> list2 = list;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (Pair pair : list2) {
                    arrayList2.add(new whh.b((String) pair.f186385a, (AccountClosureStatus) pair.f186386b));
                }
                return new whh.c(arrayList2);
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 7:
                Long l2 = (Long) obj2;
                l2.longValue();
                return l2;
            case 8:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, it11, h0Var);
                return Unit.f186387a;
            case 9:
                xk1.b update = (xk1.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                xk1.g processingState = xk1.g.PROCESSING;
                update.getClass();
                Intrinsics.checkNotNullParameter(processingState, "processingState");
                return new xk1.b(processingState);
            case 10:
                xk1.b update2 = (xk1.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                xk1.g processingState2 = xk1.g.DETECTING;
                update2.getClass();
                Intrinsics.checkNotNullParameter(processingState2, "processingState");
                return new xk1.b(processingState2);
            case 11:
                xk1.b update3 = (xk1.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                xk1.g processingState3 = xk1.g.DETECTING;
                update3.getClass();
                Intrinsics.checkNotNullParameter(processingState3, "processingState");
                return new xk1.b(processingState3);
            case 12:
                xk1.l supportedQr = (xk1.l) obj2;
                List list3 = xk1.k.f306600a;
                Intrinsics.checkNotNullParameter(supportedQr, "supportedQr");
                return supportedQr.f306603a;
            case 13:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACClaimExpenseDetailsScreen.f75139b0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj4 = it12.u;
                if (obj4 instanceof File) {
                    return (File) obj4;
                }
                return null;
            case 14:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var2);
                return Boolean.FALSE;
            case 15:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(!it13.isEmpty());
            case 16:
                return Boolean.valueOf(!((List) obj2).isEmpty());
            case 17:
                List accountPortfolioBalances = (List) obj2;
                Intrinsics.checkNotNullParameter(accountPortfolioBalances, "accountPortfolioBalances");
                return new xke.b(accountPortfolioBalances);
            case 18:
                WealthAccountsBalance portfolioBalance = (WealthAccountsBalance) obj2;
                Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
                return portfolioBalance.f95259a;
            case 19:
                a3 observeTransactionProperty = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty, "$this$observeTransactionProperty");
                return observeTransactionProperty.K1;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return mlk.f.b();
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return xkk.q.d;
            case 23:
                xl1.a update4 = (xl1.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                boolean z = !update4.f306901b;
                DataForRegistration dataForRegistration = update4.f306900a;
                Intrinsics.checkNotNullParameter(dataForRegistration, "dataForRegistration");
                return new xl1.a(dataForRegistration, z);
            case 24:
                xl9.e update5 = (xl9.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return xl9.e.a(update5, !update5.f306957a, null, false, null, 14);
            case 25:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var3);
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 26:
                hha.d it14 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it14);
            case 27:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return m72.b.x(it15, od0.i.Companion);
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ufm.c cVarL = d0.l(new SavingsErrorHandlingApi$FailStartTradingOnboardingException(0));
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            default:
                List<koi.j> it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                ArrayList arrayList3 = new ArrayList();
                for (koi.j jVar : it16) {
                    qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
                    Object i = pVar != null ? pVar.getF() : null;
                    if (i != null) {
                        arrayList3.add(i);
                    }
                }
                return arrayList3;
        }
    }
}
