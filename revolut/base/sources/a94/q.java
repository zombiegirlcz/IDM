package a94;

import bq5.a0;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$IntroProceedAction;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.OutstandingDebtsV2FlowContract$State;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import pt5.u;
import tof.c9;
import tof.i7;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f2327b;

    public /* synthetic */ q(int i, xi0.b bVar) {
        this.f2326a = i;
        this.f2327b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        e7l.h hVar;
        Object obj3;
        Object next;
        Object obj4;
        Object obj5;
        List list;
        Object obj6;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj7;
        dj0.d dVar;
        Set set;
        Object obj8;
        Object next2;
        Object next3;
        kel.b bVar;
        ExchangePocket exchangePocket;
        Pair pair;
        Object next4;
        int i = this.f2326a;
        boolean z = true;
        z = true;
        int i2 = 0;
        xi0.b baseCurrency = this.f2327b;
        switch (i) {
            case 0:
                OutstandingDebtsV2FlowContract$State outstandingDebtsV2FlowContract$State = (OutstandingDebtsV2FlowContract$State) obj2;
                OutstandingDebtsV2FlowContract$IntroProceedAction outstandingDebtsV2FlowContract$IntroProceedAction = outstandingDebtsV2FlowContract$State.f67454b;
                outstandingDebtsV2FlowContract$State.getClass();
                return new OutstandingDebtsV2FlowContract$State(baseCurrency, outstandingDebtsV2FlowContract$IntroProceedAction);
            case 1:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                xi0.a aVar = xi0.b.Companion;
                ArrayList arrayList3 = new ArrayList(w.t(linkedHashSet, 10));
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    t61.a.A(aVar, (String) it8.next(), arrayList3);
                }
                Collection[] elements = {arrayList3, config.T};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return Boolean.valueOf(d0.i1(w.u(kotlin.collections.d.L(elements))).contains(baseCurrency));
            case 2:
                e7l.f config2 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config2, "config");
                List list2 = config2.P0;
                if (list2 != null) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next5 = it9.next();
                            if (Intrinsics.f(((e7l.h) next5).f123408a.f306286a, baseCurrency.f306286a)) {
                                obj3 = next5;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    hVar = (e7l.h) obj3;
                } else {
                    hVar = null;
                }
                od0.i.Companion.getClass();
                return od0.h.a(hVar);
            case 3:
                pd5.d config3 = (pd5.d) obj2;
                Intrinsics.checkNotNullParameter(config3, "config");
                od0.h hVar2 = od0.i.Companion;
                Iterator it10 = config3.f235097c.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (((pd5.g) next).f235102a.equals(baseCurrency)) {
                        }
                    } else {
                        next = null;
                    }
                }
                pd5.g gVar = (pd5.g) next;
                pd5.j jVar = gVar != null ? gVar.f235106h : null;
                hVar2.getClass();
                return od0.h.a(jVar);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return baseCurrency;
            case 5:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Iterator it11 = accounts.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next6 = it11.next();
                        if (Intrinsics.f(((n71.b) next6).f212975b, baseCurrency.f306286a)) {
                            obj4 = next6;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                return (n71.b) obj4;
            case 6:
                bcj.d update = (bcj.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return bcj.d.a(update, baseCurrency, null, null, 6);
            case 7:
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj9 : accounts2) {
                    if (Intrinsics.f(((n71.b) obj9).f212975b, baseCurrency.f306286a)) {
                        arrayList4.add(obj9);
                    }
                }
                return arrayList4;
            case 8:
                pd5.d config4 = (pd5.d) obj2;
                Intrinsics.checkNotNullParameter(config4, "config");
                Iterator it12 = config4.f235097c.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next7 = it12.next();
                        if (((pd5.g) next7).f235102a.equals(baseCurrency)) {
                            obj5 = next7;
                        }
                    } else {
                        obj5 = null;
                    }
                }
                pd5.g gVar2 = (pd5.g) obj5;
                return (gVar2 == null || (list = gVar2.f) == null) ? f0.f322471a : list;
            case 9:
                return ake.a.a((ake.a) obj2, null, null, null, null, null, null, null, this.f2327b, null, null, 895);
            case 10:
                return a0.a((a0) obj2, null, this.f2327b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1073741821);
            case 11:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it13 = pockets.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next8 = it13.next();
                        if (Intrinsics.f(((io3.d) next8).f163147c, baseCurrency.f306286a)) {
                            obj6 = next8;
                        }
                    } else {
                        obj6 = null;
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((io3.d) obj6);
            case 12:
                e7l.f config5 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config5, "config");
                LinkedHashSet linkedHashSet2 = config5.M;
                xi0.a aVar2 = xi0.b.Companion;
                ArrayList arrayList5 = new ArrayList(w.t(linkedHashSet2, 10));
                Iterator it14 = linkedHashSet2.iterator();
                while (it14.hasNext()) {
                    t61.a.A(aVar2, (String) it14.next(), arrayList5);
                }
                Set set2 = config5.T;
                List list3 = config5.P0;
                if (list3 != null) {
                    List list4 = list3;
                    ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
                    Iterator it15 = list4.iterator();
                    while (it15.hasNext()) {
                        arrayList6.add(((e7l.h) it15.next()).f123408a);
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = null;
                }
                Collection[] elements2 = {arrayList5, set2, arrayList};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                Set setI1 = d0.i1(w.u(kotlin.collections.d.L(elements2)));
                ArrayList<xi0.b> arrayList7 = new ArrayList();
                for (Object obj10 : setI1) {
                    if (cp5.d.y((xi0.b) obj10)) {
                        arrayList7.add(obj10);
                    }
                }
                ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
                for (xi0.b bVar2 : arrayList7) {
                    y1d.b.Companion.getClass();
                    arrayList8.add(c2d.h.e(y1d.a.d, bVar2, baseCurrency));
                }
                return arrayList8;
            case 13:
                e7l.f config6 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config6, "config");
                LinkedHashSet linkedHashSet3 = config6.M;
                xi0.a aVar3 = xi0.b.Companion;
                ArrayList arrayList9 = new ArrayList(w.t(linkedHashSet3, 10));
                Iterator it16 = linkedHashSet3.iterator();
                while (it16.hasNext()) {
                    t61.a.A(aVar3, (String) it16.next(), arrayList9);
                }
                Set set3 = config6.T;
                List list5 = config6.P0;
                if (list5 != null) {
                    List list6 = list5;
                    ArrayList arrayList10 = new ArrayList(w.t(list6, 10));
                    Iterator it17 = list6.iterator();
                    while (it17.hasNext()) {
                        arrayList10.add(((e7l.h) it17.next()).f123408a);
                    }
                    arrayList2 = arrayList10;
                } else {
                    arrayList2 = null;
                }
                Collection[] elements3 = {arrayList9, set3, arrayList2};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                Set setI12 = d0.i1(w.u(kotlin.collections.d.L(elements3)));
                ArrayList<xi0.b> arrayList11 = new ArrayList();
                for (Object obj11 : setI12) {
                    if (cp5.d.z((xi0.b) obj11)) {
                        arrayList11.add(obj11);
                    }
                }
                ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                for (xi0.b bVar3 : arrayList11) {
                    y1d.b.Companion.getClass();
                    arrayList12.add(c2d.h.e(y1d.a.f310359c, bVar3, baseCurrency));
                }
                return arrayList12;
            case 14:
                y49.f unrealisedPerformance = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
                Iterator it18 = unrealisedPerformance.d.iterator();
                while (true) {
                    if (it18.hasNext()) {
                        Object next9 = it18.next();
                        if (Intrinsics.f(((y49.c) next9).d.f115083b, baseCurrency)) {
                            obj7 = next9;
                        }
                    } else {
                        obj7 = null;
                    }
                }
                y49.c cVar = (y49.c) obj7;
                if (cVar != null && (dVar = cVar.d) != null) {
                    return dVar;
                }
                hx7.e.n(new IllegalStateException("Couldn't find CFD's cashBalance for currency: " + baseCurrency));
                return new dj0.d(0L, baseCurrency);
            case 15:
                ccb.i updateState = (ccb.i) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ccb.i.a(updateState, null, null, null, null, dj0.d.c(updateState.f, 0L, baseCurrency, 1), null, null, null, null, null, 16351);
            case 16:
                cv6.j update2 = (cv6.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AcquiringPaymentFilter acquiringPaymentFilter = update2.f109287b;
                if (acquiringPaymentFilter == null || (set = acquiringPaymentFilter.f73367a) == null) {
                    set = h0.f322473a;
                }
                LinkedHashSet linkedHashSetA = gc0.c.A(set, baseCurrency);
                AcquiringPaymentFilter acquiringPaymentFilter2 = update2.f109287b;
                if (acquiringPaymentFilter2 == null) {
                    acquiringPaymentFilter2 = new AcquiringPaymentFilter(0);
                }
                AcquiringPaymentFilter acquiringPaymentFilterA = AcquiringPaymentFilter.a(acquiringPaymentFilter2, linkedHashSetA, null, null, null, 14);
                if (acquiringPaymentFilterA.b()) {
                    acquiringPaymentFilterA = null;
                }
                return cv6.j.a(update2, null, acquiringPaymentFilterA, 5);
            case 17:
                return cvl.l.a((cvl.l) obj2, null, this.f2327b, null, null, null, null, null, null, null, null, false, false, false, 8189);
            case 18:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Iterator it20 = it19.iterator();
                while (true) {
                    if (it20.hasNext()) {
                        Object next10 = it20.next();
                        if (Intrinsics.f(((io3.d) next10).f163147c, baseCurrency.f306286a)) {
                            obj8 = next10;
                        }
                    } else {
                        obj8 = null;
                    }
                }
                return (io3.d) obj8;
            case 19:
                List balances = (List) obj2;
                Intrinsics.checkNotNullParameter(balances, "balances");
                ArrayList arrayList13 = new ArrayList();
                for (Object obj12 : balances) {
                    if (Intrinsics.f(((DeFiBalance) obj12).f71635a, baseCurrency.f306286a)) {
                        arrayList13.add(obj12);
                    }
                }
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                Iterator it21 = arrayList13.iterator();
                while (it21.hasNext()) {
                    linkedHashSet4.add(((DeFiBalance) it21.next()).f71638g);
                }
                i7.c cVar2 = i7.Companion;
                i7[] i7VarArr = {d76.b.f111827b, new c9(linkedHashSet4)};
                cVar2.getClass();
                return i7.c.a(i7VarArr);
            case 20:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                wel.e eVar = (wel.e) pair2.f186385a;
                Set set4 = (Set) pair2.f186386b;
                ArrayList arrayList14 = eVar.e;
                ArrayList arrayList15 = new ArrayList();
                for (Object obj13 : arrayList14) {
                    if (obj13 instanceof kel.b) {
                        arrayList15.add(obj13);
                    }
                }
                Iterator it22 = arrayList15.iterator();
                while (true) {
                    if (it22.hasNext()) {
                        next2 = it22.next();
                        if (Intrinsics.f(((kel.b) next2).f183148a.e, baseCurrency.f306286a)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                kel.b bVar4 = (kel.b) next2;
                if (bVar4 != null) {
                    bVar = bVar4;
                } else {
                    Set set5 = set4;
                    ArrayList arrayList16 = new ArrayList(w.t(set5, 10));
                    Iterator it23 = set5.iterator();
                    while (it23.hasNext()) {
                        arrayList16.add(((xi0.b) it23.next()).f306286a);
                    }
                    Set setI13 = d0.i1(arrayList16);
                    ArrayList arrayList17 = new ArrayList();
                    for (Object obj14 : arrayList15) {
                        if (!setI13.contains(((kel.b) obj14).f183148a.e)) {
                            arrayList17.add(obj14);
                        }
                    }
                    Iterator it24 = arrayList17.iterator();
                    if (it24.hasNext()) {
                        next3 = it24.next();
                        if (it24.hasNext()) {
                            long j2 = ((kel.b) next3).e.f115082a;
                            do {
                                Object next11 = it24.next();
                                long j3 = ((kel.b) next11).e.f115082a;
                                if (j2 < j3) {
                                    next3 = next11;
                                    j2 = j3;
                                }
                            } while (it24.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    bVar = (kel.b) next3;
                    if (bVar == null || bVar.e.f115082a <= 0) {
                        bVar = null;
                    }
                }
                if (bVar != null) {
                    kel.a aVar4 = bVar.f183148a;
                    exchangePocket = new ExchangePocket(aVar4.f183145a, aVar4.e, bVar.e.f115082a, wd6.i.TRADING);
                } else {
                    exchangePocket = null;
                }
                od0.i.Companion.getClass();
                return od0.h.a(exchangePocket);
            case 21:
                List pocketBalances = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
                return yoj.b.x(pocketBalances, baseCurrency);
            case 22:
                List charitiesListWithDonations = (List) obj2;
                Intrinsics.checkNotNullParameter(charitiesListWithDonations, "charitiesListWithDonations");
                if (charitiesListWithDonations.isEmpty()) {
                    return new dj0.d(0L, baseCurrency);
                }
                List list7 = charitiesListWithDonations;
                ArrayList arrayList18 = new ArrayList(w.t(list7, 10));
                Iterator it25 = list7.iterator();
                while (it25.hasNext()) {
                    arrayList18.add((dj0.d) ((Pair) it25.next()).f186386b);
                }
                Iterator it26 = arrayList18.iterator();
                if (!it26.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next12 = it26.next();
                while (it26.hasNext()) {
                    next12 = pyd.c.O((dj0.d) next12, (dj0.d) it26.next());
                }
                return (dj0.d) next12;
            case 23:
                List charityList = (List) obj2;
                Intrinsics.checkNotNullParameter(charityList, "charityList");
                Intrinsics.checkNotNullParameter(charityList, "<this>");
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                List list8 = charityList;
                ArrayList arrayList19 = new ArrayList(w.t(list8, 10));
                Iterator it27 = list8.iterator();
                while (it27.hasNext()) {
                    v1.c.A(arrayList19, ((ba6.l) it27.next()).i.f115083b, baseCurrency);
                }
                List listU = d0.U(arrayList19);
                ArrayList arrayList20 = new ArrayList();
                for (Object obj15 : listU) {
                    Pair pair3 = (Pair) obj15;
                    if (!Intrinsics.f(pair3.f186385a, pair3.f186386b)) {
                        arrayList20.add(obj15);
                    }
                }
                return new Pair(charityList, arrayList20);
            case 24:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                List list9 = (List) pair4.f186385a;
                List list10 = (List) pair4.f186386b;
                List<ba6.l> list11 = list9;
                ArrayList arrayList21 = new ArrayList(w.t(list11, 10));
                for (ba6.l lVar : list11) {
                    dj0.d dVar2 = lVar.i;
                    if (Intrinsics.f(dVar2.f115083b, baseCurrency) || list10.isEmpty()) {
                        pair = new Pair(lVar, dVar2);
                    } else {
                        Iterator it28 = list10.iterator();
                        while (true) {
                            if (it28.hasNext()) {
                                next4 = it28.next();
                                n9l.a aVar5 = (n9l.a) next4;
                                if (!Intrinsics.f(aVar5.f213661a, dVar2.f115083b) || !Intrinsics.f(aVar5.f213662b, baseCurrency)) {
                                }
                            } else {
                                next4 = null;
                            }
                        }
                        n9l.a aVar6 = (n9l.a) next4;
                        pair = new Pair(lVar, aVar6 != null ? pyd.c.K(dVar2, aVar6.f213663c, baseCurrency) : new dj0.d(0L, baseCurrency));
                    }
                    arrayList21.add(pair);
                }
                return arrayList21;
            case 25:
                List orders = (List) obj2;
                Intrinsics.checkNotNullParameter(orders, "orders");
                ArrayList arrayList22 = new ArrayList();
                for (Object obj16 : orders) {
                    ExchangeOrder exchangeOrder = (ExchangeOrder) obj16;
                    if (cp5.d.z(exchangeOrder.getF72134a().e) || cp5.d.z(exchangeOrder.getF72134a().f)) {
                        if (baseCurrency == null || Intrinsics.f(exchangeOrder.getF72134a().e, baseCurrency) || Intrinsics.f(exchangeOrder.getF72134a().f, baseCurrency)) {
                            arrayList22.add(obj16);
                        }
                    }
                }
                ArrayList arrayList23 = new ArrayList();
                for (Object obj17 : arrayList22) {
                    if (obj17 instanceof ExchangeOrder.Active) {
                        arrayList23.add(obj17);
                    }
                }
                List listP0 = d0.P0(arrayList23, new dv5.j());
                ArrayList arrayList24 = new ArrayList(w.t(listP0, 10));
                Iterator it29 = listP0.iterator();
                while (it29.hasNext()) {
                    arrayList24.add(new u((ExchangeOrder.Active) it29.next()));
                }
                return arrayList24;
            case 26:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                return y.L(y.n(y.n(y.n(d0.Q(pockets2), new q(27, baseCurrency)), new ds4.b(13)), new ds4.b(11)));
            case 27:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                xi0.a aVar7 = xi0.b.Companion;
                String str = pocket.f163147c;
                aVar7.getClass();
                xi0.b bVarA = xi0.a.a(str);
                boolean zEquals = bVarA.equals(baseCurrency);
                if (!cp5.d.A(baseCurrency) ? !cp5.d.z(bVarA) || !zEquals : pocket.e != io3.l.REVX_FIAT || !zEquals) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                return y.L(y.n(y.n(y.n(d0.Q(pockets3), new dv5.p(z ? 1 : 0, baseCurrency)), new ds4.b(21)), new ds4.b(22)));
            default:
                List pockets4 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets4, "pockets");
                return y.L(y.n(y.n(y.n(d0.Q(pockets4), new dv5.p(i2, baseCurrency)), new ds4.b(19)), new ds4.b(20)));
        }
    }

    public /* synthetic */ q(Object obj2, xi0.b bVar, int i) {
        this.f2326a = i;
        this.f2327b = bVar;
    }
}
