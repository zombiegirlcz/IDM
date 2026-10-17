package y25;

import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInsuranceState;
import com.revolut.feature.wealth.api.ui.providers.composite_add_money.CompositeAddMoneyPortfolioInfoProviderContract$Limits;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import d9.e1;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p35.e0;
import p35.f0;
import p35.g0;
import wp5.y;
import y2e.t;
import yhm.r;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310593a;

    public /* synthetic */ d(int i) {
        this.f310593a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f310593a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 1:
                lk0.g it8 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(!it8.f196174a.isEmpty());
            case 2:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 3:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                int size = previousPage.f196171a.size();
                y2e.i iVar = (y2e.i) previousPage.f196172b;
                iVar.getClass();
                if (size < 10) {
                    return null;
                }
                return new y2e.i(iVar.f310644a + 10);
            case 4:
                ImageTransformations imageTransformations = t.f310660a;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(nb0.b(pb0.Companion, "LOADING_LIST_ID", false, 0, false, 30));
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar2 = (od0.i) pair.f186385a;
                OrderQuote orderQuote = iVar2.d() ? (OrderQuote) iVar2.c() : (OrderQuote) ((od0.i) pair.f186386b).c();
                Amount amount = orderQuote.f104755g.f104731a.f104724c;
                return l4i.a.b(amount != null ? a.a.x(e1.i(orderQuote, f8l.b.TO), amount) : e1.i(orderQuote, f8l.b.TO));
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(y43.b.c(), new pb0("LIST_ID_CARD_PAYMENT_METHOD_WIDGET_LOADING"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 9:
                List loans = (List) obj2;
                Intrinsics.checkNotNullParameter(loans, "loans");
                List list = loans;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (Intrinsics.f(((Loan) it9.next()).f70122w, LoanInsuranceState.Eligible.f70161a)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                List loans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(loans2, "loans");
                List list2 = loans2;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it10 = list2.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            if (((Loan) it10.next()).f70122w instanceof LoanInsuranceState.Insured) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                e0 it11 = (e0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.O;
            case 12:
                io3.d it12 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return io3.h.e(it12);
            case 13:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new ux4.b(d0.P0(d0.E0(((ux4.b) pair2.f186386b).f283864a, ((ux4.b) pair2.f186385a).f283864a), new y45.e()));
            case 14:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Intrinsics.checkNotNullParameter(it13, "<this>");
                List list3 = it13;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list3) {
                    if (((e0) obj4).e == g0.ACTIVE) {
                        arrayList.add(obj4);
                    }
                }
                List listP0 = d0.P0(arrayList, cim.b.a(new p0g.b(15), new p0g.b(16), new p0g.b(17), new p0g.b(18), new p0g.b(19)));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list3) {
                    if (((e0) obj5).e == g0.INACTIVE) {
                        arrayList2.add(obj5);
                    }
                }
                List listP02 = d0.P0(arrayList2, cim.b.a(new p0g.b(20), new p0g.b(21), new p0g.b(22)));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list3) {
                    g0[] elements = {g0.ACTIVE, g0.INACTIVE};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    if (!kotlin.collections.d.y0(elements).contains(((e0) obj6).e)) {
                        arrayList3.add(obj6);
                    }
                }
                List listP03 = d0.P0(arrayList3, new f0());
                aim.e eVarB = u.b();
                eVarB.addAll(listP0);
                eVarB.addAll(listP02);
                eVarB.addAll(listP03);
                return u.a(eVarB);
            case 15:
                List loans3 = (List) obj2;
                Intrinsics.checkNotNullParameter(loans3, "loans");
                List list4 = loans3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it14 = list4.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            if (v.k(b95.a.PERSONAL_LOAN, b95.a.REFINANCING_LOAN).contains(((Loan) it14.next()).getO())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                l35.g it15 = (l35.g) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.f191854a || it15.f191855b || it15.f191856c);
            case 17:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return new l35.c((o35.e) pair3.f186386b, (l35.g) pair3.f186385a);
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return l35.d.f191853a;
            case 19:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new l35.g(((Boolean) rVar.f314201a).booleanValue(), ((Boolean) rVar.f314202b).booleanValue(), ((Boolean) rVar.f314203c).booleanValue());
            case 20:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                cs3.b bVar = (cs3.b) pair4.f186385a;
                return new o35.e(bVar.f108441a, bVar.f108442b, ((Boolean) pair4.f186386b).booleanValue());
            case 21:
                l35.g it16 = (l35.g) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16.f191855b);
            case 22:
                l35.g it17 = (l35.g) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.f191856c);
            case 23:
                l35.g it18 = (l35.g) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18.f191854a);
            case 24:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "it", aVar);
            case 25:
                List loans4 = (List) obj2;
                Intrinsics.checkNotNullParameter(loans4, "loans");
                List list5 = loans4;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it19 = list5.iterator();
                    while (true) {
                        if (it19.hasNext()) {
                            if (((Loan) it19.next()).o == b95.a.MORTGAGE_LOAN) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                yoj.a aVar2 = (yoj.a) obj2;
                return y.s(aVar2, "it", aVar2);
            case 27:
                List loans5 = (List) obj2;
                Intrinsics.checkNotNullParameter(loans5, "loans");
                List list6 = loans5;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it20 = list6.iterator();
                    while (true) {
                        if (it20.hasNext()) {
                            if (((Loan) it20.next()).o == b95.a.MORTGAGE_LOAN) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 28:
                m1h.h config = (m1h.h) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return new CompositeAddMoneyPortfolioInfoProviderContract$Limits(new dj0.d(1L, config.f201496a), null, null);
            default:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                Iterator it21 = tradingAccounts.f105278a.iterator();
                while (true) {
                    if (it21.hasNext()) {
                        Object next = it21.next();
                        if (Intrinsics.f(((TradingAccount) next).W(), TradingAccountType.Margin.f105271a)) {
                            obj3 = next;
                        }
                    }
                }
                if (obj3 != null) {
                    return (TradingAccount) obj3;
                }
                throw new IllegalStateException("Margin trading account is not created");
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f310593a = i;
    }
}
