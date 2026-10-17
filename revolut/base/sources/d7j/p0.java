package d7j;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112038a;

    public /* synthetic */ p0(int i) {
        this.f112038a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        io3.k kVar;
        Object next;
        switch (this.f112038a) {
            case 0:
                w it8 = (w) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f112070g.a();
            case 1:
                w it9 = (w) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f112070g.a();
            case 2:
                w it10 = (w) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f112070g.a();
            case 3:
                List cashHoldings = (List) obj2;
                Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
                List<kel.b> list = cashHoldings;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (kel.b bVar : list) {
                    kel.a aVar = bVar.f183148a;
                    arrayList.add(new ExchangePocket(aVar.f183145a, aVar.e, bVar.e.f115082a, wd6.i.TRADING));
                }
                return arrayList;
            case 4:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList<io3.d> arrayList2 = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar = (io3.d) obj3;
                    if (dVar.e == io3.l.CURRENT && dVar.f163149h == io3.i.INTERNAL && ((kVar = dVar.f) == io3.k.ACTIVE || kVar == io3.k.INACTIVE)) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (io3.d dVar2 : arrayList2) {
                    arrayList3.add(new ExchangePocket(dVar2.f163145a, dVar2.f163147c, dVar2.i, wd6.i.CURRENT));
                }
                return arrayList3;
            case 5:
                wel.e portfolio = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                ArrayList arrayList4 = portfolio.e;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (obj4 instanceof kel.b) {
                        arrayList5.add(obj4);
                    }
                }
                return arrayList5;
            case 6:
                s0 ratesInput = (s0) obj2;
                Intrinsics.checkNotNullParameter(ratesInput, "ratesInput");
                List list2 = ratesInput.f112051a;
                r0 r0Var = ratesInput.f112052b;
                Iterator it11 = list2.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next = it11.next();
                        qta.a aVar2 = (qta.a) next;
                        if (!Intrinsics.f(aVar2.f249039a, r0Var.f112045a) || !Intrinsics.f(aVar2.f249040b, r0Var.f112047c)) {
                        }
                    } else {
                        next = null;
                    }
                }
                qta.a aVar3 = (qta.a) next;
                if (aVar3 != null) {
                    return pyd.c.L(new dj0.d(r0Var.f112046b, r0Var.f112045a), t0.f112055a[r0Var.d.ordinal()] == 1 ? aVar3.f249041c : aVar3.d, r0Var.f112047c);
                }
                return null;
            case 7:
                return ((w) obj2).f112069c;
            case 8:
                return ((w) obj2).f112070g.a();
            case 9:
                return ((w) obj2).d;
            case 10:
                ExchangeOrderDraft exchangeOrderDraftA = ((w) obj2).f112070g.a();
                if (exchangeOrderDraftA != null) {
                    return exchangeOrderDraftA.e;
                }
                return null;
            case 11:
                TradingLegalEntityInformation it12 = (TradingLegalEntityInformation) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.f105106a != null);
            case 12:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186386b;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it13 = list3.iterator();
                while (it13.hasNext()) {
                    arrayList6.add(((io3.d) it13.next()).f163147c);
                }
                return Boolean.valueOf(zhm.d0.i1(arrayList6).size() > 1);
            case 13:
                List accountExtraDataList = (List) obj2;
                Intrinsics.checkNotNullParameter(accountExtraDataList, "accountExtraDataList");
                return zi0.c.P(accountExtraDataList, false, null, 3);
            case 14:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it14);
            case 15:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : pockets2) {
                    String str = ((io3.d) obj5).f163147c;
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add(obj5);
                }
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList7 = new ArrayList(zhm.w.t(collectionValues, 10));
                Iterator it15 = collectionValues.iterator();
                while (it15.hasNext()) {
                    arrayList7.add(zhm.d0.P0((List) it15.next(), new d89.f()));
                }
                return zhm.w.u(arrayList7);
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return zhm.f0.f322471a;
            case 17:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : pockets3) {
                    if (((io3.d) obj6).e == io3.l.BLOCKING) {
                        arrayList8.add(obj6);
                    }
                }
                ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                Iterator it16 = arrayList8.iterator();
                while (it16.hasNext()) {
                    arrayList9.add(new Pair((io3.d) it16.next(), z79.b.JUNIOR));
                }
                return arrayList9;
            case 18:
                List pockets4 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets4, "pockets");
                ArrayList arrayList10 = new ArrayList();
                for (Object obj7 : pockets4) {
                    io3.d dVar3 = (io3.d) obj7;
                    if (dVar3.e == io3.l.BLOCKING && Intrinsics.f(dVar3.d, dVar3.f163147c)) {
                        arrayList10.add(obj7);
                    }
                }
                ArrayList arrayList11 = new ArrayList(zhm.w.t(arrayList10, 10));
                Iterator it17 = arrayList10.iterator();
                while (it17.hasNext()) {
                    arrayList11.add(new Pair((io3.d) it17.next(), z79.b.OTHER));
                }
                return arrayList11;
            case 19:
                List pockets5 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets5, "pockets");
                ArrayList arrayList12 = new ArrayList();
                for (Object obj8 : pockets5) {
                    io3.d dVar4 = (io3.d) obj8;
                    if (dVar4.e == io3.l.BLOCKING && d89.g.a(z79.b.JOINT, dVar4.d)) {
                        arrayList12.add(obj8);
                    }
                }
                ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                Iterator it18 = arrayList12.iterator();
                while (it18.hasNext()) {
                    arrayList13.add(new Pair((io3.d) it18.next(), z79.b.JOINT));
                }
                return arrayList13;
            case 20:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                Object content = data.getContent();
                return content == null ? data : zi0.c.P(content, false, null, 3);
            case 21:
                List pockets6 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets6, "pockets");
                ArrayList arrayList14 = new ArrayList();
                for (Object obj9 : pockets6) {
                    if (((io3.d) obj9).e == io3.l.BLOCKING) {
                        arrayList14.add(obj9);
                    }
                }
                return arrayList14;
            case 22:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                ArrayList arrayListE0 = zhm.d0.E0((List) rVar.f314203c, zhm.d0.E0((List) rVar.f314202b, (List) rVar.f314201a));
                ArrayList arrayList15 = new ArrayList();
                for (Object obj10 : arrayListE0) {
                    dj0.d dVarE = io3.h.e((io3.d) obj10);
                    dj0.d.Companion.getClass();
                    if (dVarE.f(dj0.d.e)) {
                        arrayList15.add(obj10);
                    }
                }
                return arrayList15;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return d8d.c.b();
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return d8d.c.b();
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return d8d.c.b();
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s7 s7Var = new s7("LOADING_1", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                s7 s7Var2 = new s7("LOADING_2", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                s7 s7Var3 = new s7("LOADING_3", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var3, 0, 0, 0, 0, null, false, 63);
                s7 s7Var4 = new s7("LOADING_4", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var4, 0, 0, 0, 0, null, false, 63);
                s7 s7Var5 = new s7("LOADING_5", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var5, 0, 0, 0, 0, null, false, 63);
                return new da8.j(zhm.v.k(s7Var, s7Var2, s7Var3, s7Var4, s7Var5), false);
            case 28:
                yja.b result = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                int i = dac.c.f112510a[result.ordinal()];
                if (i == 1 || i == 2) {
                    int i2 = jli.h.f175850a;
                } else {
                    if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected product article result " + result);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
        }
    }

    public /* synthetic */ p0(Object obj2, int i) {
        this.f112038a = i;
    }
}
