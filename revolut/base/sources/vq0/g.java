package vq0;

import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFeatureConfig;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jv0.r;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.a0;
import ofm.q;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291292a;

    public /* synthetic */ g(int i) {
        this.f291292a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291292a) {
            case 0:
                jv0.m event = (jv0.m) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                return Boolean.valueOf(event instanceof jv0.n);
            case 1:
                jv0.m event2 = (jv0.m) obj2;
                Intrinsics.checkNotNullParameter(event2, "event");
                return Boolean.valueOf(((jv0.n) event2).f178754a);
            case 2:
                jv0.m it8 = (jv0.m) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 instanceof r);
            case 3:
                nu0.h state = (nu0.h) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(state != nu0.h.PAUSED);
            case 4:
                jv0.m it9 = (jv0.m) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (r) it9;
            case 5:
                r it10 = (r) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ArrayList arrayList = it10.f178760a;
                m70.a.t(t0.f186434a);
                return d0.k0(arrayList, " ", null, null, 0, null, 62);
            case 6:
                PagoPABill bill = (PagoPABill) obj2;
                Intrinsics.checkNotNullParameter(bill, "bill");
                return new FeatureCommand(new PagoPAFeatureConfig.BillConfirmation(bill));
            case 7:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                qta.c cVar = (qta.c) d0.d0(it11);
                if (cVar != null) {
                    return q.f0(cVar);
                }
                return null;
            case 8:
                return vq5.g.a((vq5.g) obj2, null, null, null, null, null, null, 8127);
            case 9:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 10:
                Map.Entry it12 = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.getKey(), "overall"));
            case 11:
                Optional it13 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (qrb.f) gj7.b.m(it13);
            case 12:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 14:
                TradingAccount tradingAccount = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                return com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a;
            case 15:
                nel.n it14 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.k.a();
            case 16:
                kel.g gVar = (kel.g) obj2;
                Intrinsics.i(gVar, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.models.holding.StockHolding");
                return (kel.n) gVar;
            case 17:
                InvestOrder investOrder = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                return Boolean.valueOf(com.revolut.retail.trading.core.domain.orders.a.l(investOrder));
            case 18:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : orders) {
                    InvestOrder investOrder2 = (InvestOrder) obj3;
                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                    if (com.revolut.retail.trading.core.domain.orders.a.l(investOrder2)) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 19:
                List orders2 = (List) obj2;
                Intrinsics.checkNotNullParameter(orders2, "orders");
                List list = orders2;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it15 = list.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            InvestOrder investOrder3 = (InvestOrder) it15.next();
                            if ((investOrder3 instanceof InvestOrder.InvestSecuritiesOrder) && ((InvestOrder.InvestSecuritiesOrder) investOrder3).L() != null) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 20:
                List list2 = (List) obj2;
                int iB = q0.b(w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list2) {
                    linkedHashMap.put(((a0) obj4).f214560a.f214596b, obj4);
                }
                return linkedHashMap;
            case 21:
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                List list3 = exchangeRates;
                int iB2 = q0.b(w.t(list3, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj5 : list3) {
                    n9l.a aVar = (n9l.a) obj5;
                    linkedHashMap2.put(new Pair(aVar.f213661a, aVar.f213662b), obj5);
                }
                return linkedHashMap2;
            case 22:
                TradingAccount it16 = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 instanceof TradingAccount.TaxAdvantage.Pea);
            case 23:
                TradingAccount it17 = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17 instanceof TradingAccount.TaxAdvantage.Isa);
            case 24:
                io3.d it18 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(cp5.d.z(z92.f.l(it18)));
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 27:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                ArrayList arrayList3 = new ArrayList();
                Iterator it19 = groups.iterator();
                while (it19.hasNext()) {
                    xdf.h hVar = (xdf.h) gj7.b.m((Optional) it19.next());
                    if (hVar != null) {
                        arrayList3.add(hVar);
                    }
                }
                return arrayList3;
            case 28:
                List groups2 = (List) obj2;
                Intrinsics.checkNotNullParameter(groups2, "groups");
                ArrayList arrayList4 = new ArrayList();
                Iterator it20 = groups2.iterator();
                while (it20.hasNext()) {
                    zhm.a0.x(((xdf.h) it20.next()).f304436c, arrayList4);
                }
                return (SourcePocket) d0.b0(arrayList4);
            default:
                Pair it21 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Optional.of(it21);
        }
    }
}
