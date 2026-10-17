package w6h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsController;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.shared.feature.wealth.models.portfolio.TradingOnboardingStatus;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.gu;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import m1c.r1;
import sil.k;
import tof.a3;
import w6h.g;
import w7b.n;
import wbg.q0;
import wbg.t0;
import whf.p;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295442a;

    public /* synthetic */ f(int i) {
        this.f295442a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TradingOnboardingStatus tradingOnboardingStatus;
        switch (this.f295442a) {
            case 0:
                g.a aVar = g.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 1:
                SelectableDelegate.Model it8 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = LoanRepaymentAccountsController.f70518a0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (RowDelegate.Model) it8.f53305b;
            case 2:
                return w75.e.a((w75.e) obj2, null, null, null, 7);
            case 3:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                eVarB.add(new gu("list_id_card_termination_header_loading", 0, 0, 30));
                pb0 pb0Var = new pb0("list_id_card_termination_item_loading_0");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0Var);
                eVarB.add(new gu("list_id_lost_benefits_header_loading", 0, 0, 30));
                List listK = v.k(new pb0("list_id_lost_benefits_item_loading_0"), new pb0("list_id_lost_benefits_item_loading_1"), new pb0("list_id_lost_benefits_item_loading_2"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return new n(null, null, u.a(eVarB));
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 6:
                w7f.a it9 = (w7f.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = u.c(new pb0("id-row-loading-top-1"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List listK2 = v.k(new s7("id-list-sub-header-loading-bottom", 0, 0, 0, 0, false, null, 126), new pb0("id-row-loading-bottom-1"), new pb0("id-row-loading-bottom-2"), new pb0("id-row-loading-bottom-3"));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return new w85.f(d0.E0(listK2, listC));
            case 8:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 1, 4, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it10 = intRangeU.iterator();
                while (it10.f289625c) {
                    arrayList.add(new pb0(a0.d.n("ID_LOADING_DEVICE_LIST_", it10.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 12:
                Function0 function0 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(function0, "default");
                return (List) function0.invoke();
            case 13:
                l71.d it11 = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.a();
            case 14:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Data(null, it12, false, 5, null);
            case 15:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                k kVar = (k) d0.d0(it13);
                String str = kVar != null ? kVar.f263664a : null;
                return (str == null || kVar.f263665b.isEmpty()) ? qa.a.f243919a : new qa.b(str);
            case 16:
                bla.c it14 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14 == bla.c.ENABLED);
            case 17:
                List<soa.b> settings = (List) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                for (soa.b bVar : settings) {
                    if (bVar.f264801a == soa.c.MARKETING) {
                        return Boolean.valueOf(bVar.f264803c);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 18:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new xbc.d((xbc.b) pair.f186385a, ((Boolean) pair.f186386b).booleanValue());
            case 19:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                p pVar = (p) pair2.f186385a;
                List list = (List) pair2.f186386b;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    arrayList2.add(new yac.b((r1) it15.next()));
                }
                List list2 = pVar.f297646a;
                ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
                Iterator it16 = list2.iterator();
                while (it16.hasNext()) {
                    arrayList3.add(new yac.a((a3) it16.next()));
                }
                return new yac.e(d0.P0(d0.E0(arrayList3, arrayList2), new q2j.v(new wac.b(), 19)), pVar.f297647b);
            case 20:
                TradingAccount tradingAccount = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                return Boolean.valueOf(tradingAccount instanceof TradingAccount.GIA);
            case 21:
                wel.e it17 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Intrinsics.checkNotNullParameter(it17, "<this>");
                wel.h hVar = it17.f.f296826a;
                if (hVar == null || (tradingOnboardingStatus = hVar.f296827a) == null) {
                    tradingOnboardingStatus = TradingOnboardingStatus.NONE;
                }
                int i = wbf.f.f296146a[tradingOnboardingStatus.ordinal()];
                return i != 1 ? i != 2 ? wbf.d.NONE : wbf.d.PENDING : wbf.d.ACTIVE;
            case 22:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new Data(null, it18, false, 5, null);
            case 23:
                ecg.e it19 = (ecg.e) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                if (it19 instanceof ecg.b) {
                    return ((ecg.b) it19).f124728a;
                }
                if ((it19 instanceof ecg.a) || (it19 instanceof ecg.c) || (it19 instanceof ecg.d)) {
                    throw new IllegalStateException("Unsupported payment: ".concat(it19.getClass().getSimpleName()));
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                od0.i it20 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new Data(it20.f224257a, null, false, 6, null);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new t0(f0.f322471a, q0.a.f296195a);
            case 26:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return (a3) d0.d0(transactions);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return wbj.h.f296238b;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            default:
                Intrinsics.checkNotNullParameter((FiatExchangeOrderQuoteParams) obj2, "it");
                return null;
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f295442a = i;
    }
}
