package c09;

import b09.c;
import c1g.q;
import c1g.s;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRate;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRatePoint;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import eda.e;
import efm.d0;
import h93.f0;
import io3.d;
import io3.k;
import io3.l;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import myf.e0;
import myf.m;
import myf.n;
import myf.t;
import myf.u;
import org.joda.time.DateTime;
import retrofit2.HttpException;
import wd6.g;
import wd6.h;
import wd6.j;
import wp5.y;
import yw4.p;
import z0i.f;
import z0i.i;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20193a;

    public /* synthetic */ a(int i) {
        this.f20193a = i;
    }

    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        n nVar;
        t tVar;
        ExchangeOrder active;
        Object next;
        Boolean boolValueOf;
        List list;
        BigDecimal bigDecimalJ;
        BigDecimal bigDecimalJ2;
        switch (this.f20193a) {
            case 0:
                c responseResult = (c) obj2;
                Intrinsics.checkNotNullParameter(responseResult, "responseResult");
                if (responseResult instanceof b09.b) {
                    ufm.b bVarM = d0.m(((b09.b) responseResult).f11625a);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                if (responseResult instanceof b09.a) {
                    return d0.l(new HttpException(((b09.a) responseResult).f11624c));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                d it8 = (d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(Boolean.valueOf(it8.f == k.ACTIVE), it8.e);
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Pair(Boolean.FALSE, l.CURRENT);
            case 3:
                e it9 = (e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f124961a;
            case 4:
                lyf.e destinationDiscovery = (lyf.e) obj2;
                Intrinsics.checkNotNullParameter(destinationDiscovery, "destinationDiscovery");
                return Boolean.valueOf(destinationDiscovery.f200822h);
            case 5:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "feature", aVar);
            case 6:
                myf.a experience = (myf.a) obj2;
                Intrinsics.checkNotNullParameter(experience, "experience");
                m mVar = experience.f210460p;
                u uVar = mVar != null ? mVar.f210482a : null;
                if ((uVar == null ? -1 : s.f20507a[uVar.ordinal()]) != 1) {
                    return c1g.u.d(experience);
                }
                m mVar2 = experience.f210460p;
                if (mVar2 != null && (nVar = (n) zhm.d0.d0(mVar2.f210483b)) != null && (tVar = (t) zhm.d0.d0(nVar.f210484a)) != null) {
                    ArrayList arrayList = tVar.f210492b;
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        Pair pair = (Pair) zhm.d0.d0(c8g.a.z(experience));
                        TravelExperienceLocation travelExperienceLocation = pair != null ? (TravelExperienceLocation) pair.f186386b : null;
                        Pair pair2 = (Pair) zhm.d0.d0(c8g.a.y(experience));
                        return new e0(arrayList, travelExperienceLocation, pair2 != null ? (TravelExperienceLocation) pair2.f186386b : null);
                    }
                }
                return c1g.u.d(experience);
            case 7:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                return new q(baseCurrency);
            case 8:
                myf.k it10 = (myf.k) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zhm.d0.V0(it10.f210476a, 2);
            case 9:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.EXPERIENCES) : b39.b.f12015a;
            case 10:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 11:
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                String str = lowerPage.d;
                if (str == null) {
                    return null;
                }
                oyf.b bVar = (oyf.b) lowerPage.f196172b;
                LocationId locationId = bVar.f231034a;
                DateTime dateTime = bVar.f231035b;
                DateTime dateTime2 = bVar.f231036c;
                String currency = bVar.d;
                TravelExperienceFiltersSelection selectedFilters = bVar.f;
                Coordinates coordinates = bVar.f231037g;
                int i = bVar.f231038h;
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
                return new oyf.b(locationId, dateTime, dateTime2, currency, str, selectedFilters, coordinates, i);
            case 12:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 13:
                f it11 = (f) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Intrinsics.checkNotNullParameter(it11, "<this>");
                Pair pairH = cp5.d.H(it11.getCurrencyPair());
                xi0.b bVar2 = (xi0.b) pairH.f186385a;
                xi0.b bVar3 = (xi0.b) pairH.f186386b;
                List<z0i.e> listD = it11.getOrders();
                ArrayList arrayList2 = new ArrayList(w.t(listD, 10));
                for (z0i.e eVar : listD) {
                    String id10 = eVar.getId();
                    String compoundId = eVar.getCompoundId();
                    if (compoundId == null) {
                        compoundId = com.google.android.gms.internal.mlkit_vision_face.a.o(wd6.f.FX_ORDER.a(), ":", eVar.getId());
                    }
                    arrayList2.add(new ExchangeOrderInfo(id10, compoundId, h.valueOf(eVar.getOrderType()), wd6.e.valueOf(it11.getExchangeMode()), bVar2, bVar3, mo3.a.o(it11.getAmount()), Double.parseDouble(eVar.getTargetRate()), eVar.getCreatedDate(), eVar.getUpdatedDate()));
                }
                return new ExchangeOrder.Active((ExchangeOrderInfo) zhm.d0.b0(arrayList2), (ExchangeOrderInfo) zhm.d0.e0(1, arrayList2));
            case 14:
                i response = (i) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List nonClosingOrders = response.getNonClosingOrders();
                ArrayList arrayList3 = new ArrayList(w.t(nonClosingOrders, 10));
                Iterator it12 = nonClosingOrders.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(a1i.b.d((z0i.h) it12.next()));
                }
                List<z0i.d> closingOrders = response.getClosingOrders();
                ArrayList arrayList4 = new ArrayList(w.t(closingOrders, 10));
                for (z0i.d dVar : closingOrders) {
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    int i2 = a1i.a.f635a[((j) u1.u(((z0i.c) zhm.d0.b0(dVar.getOrders())).getState(), a1i.c.f638c)).ordinal()];
                    if (i2 == 1) {
                        ExchangeOrderInfo exchangeOrderInfoB = a1i.b.b((z0i.c) zhm.d0.b0(dVar.getOrders()), dVar);
                        z0i.c cVar = (z0i.c) zhm.d0.e0(1, dVar.getOrders());
                        active = new ExchangeOrder.Active(exchangeOrderInfoB, cVar != null ? a1i.b.b(cVar, dVar) : null);
                    } else if (i2 == 2) {
                        ExchangeOrderInfo exchangeOrderInfoB2 = a1i.b.b((z0i.c) zhm.d0.b0(dVar.getOrders()), dVar);
                        z0i.c cVar2 = (z0i.c) zhm.d0.e0(1, dVar.getOrders());
                        ExchangeOrderInfo exchangeOrderInfoB3 = cVar2 != null ? a1i.b.b(cVar2, dVar) : null;
                        double d = Double.parseDouble(((z0i.c) zhm.d0.b0(dVar.getOrders())).getTargetRate());
                        dj0.d dVarO = mo3.a.o(dVar.getAmount());
                        dj0.d.Companion.getClass();
                        active = new ExchangeOrder.Completed(exchangeOrderInfoB2, exchangeOrderInfoB3, d, dVarO, dj0.d.d);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ExchangeOrderInfo exchangeOrderInfoB4 = a1i.b.b((z0i.c) zhm.d0.b0(dVar.getOrders()), dVar);
                        z0i.c cVar3 = (z0i.c) zhm.d0.e0(1, dVar.getOrders());
                        active = new ExchangeOrder.Failed(exchangeOrderInfoB4, cVar3 != null ? a1i.b.b(cVar3, dVar) : null, g.UNKNOWN);
                    }
                    arrayList4.add(active);
                }
                return zhm.d0.E0(arrayList4, arrayList3);
            case 15:
                z0i.g it13 = (z0i.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Intrinsics.checkNotNullParameter(it13, "<this>");
                Pair pairH2 = cp5.d.H(it13.getCurrencyPair());
                return new ExchangeOrder.Active(new ExchangeOrderInfo(it13.getId(), it13.getCompoundId(), (h) u1.u(it13.getOrderType(), a1i.c.f636a), (wd6.e) u1.u(it13.getExchangeMode(), a1i.c.f637b), (xi0.b) pairH2.f186385a, (xi0.b) pairH2.f186386b, mo3.a.o(it13.getAmount()), Double.parseDouble(it13.getTargetRate()), it13.getCreatedDate(), it13.getUpdatedDate()), null);
            case 16:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List<f1k.b> list2 = (List) pair3.f186385a;
                List list3 = (List) pair3.f186386b;
                ArrayList arrayList5 = new ArrayList();
                for (f1k.b bVar4 : list2) {
                    Iterator it14 = list3.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            next = it14.next();
                            if (Intrinsics.f(bVar4.f131287a, ((f1k.a) next).f131285a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    f1k.a aVar2 = (f1k.a) next;
                    d1k.a aVar3 = aVar2 != null ? new d1k.a(aVar2.f131285a, bVar4.f131288b, aVar2.f131286b) : null;
                    if (aVar3 != null) {
                        arrayList5.add(aVar3);
                    }
                }
                return arrayList5;
            case 17:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15;
            case 18:
                l93.d it16 = (l93.d) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 != l93.d.SELF_EDIT);
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 20:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                List list4 = (List) pair4.f186385a;
                List list5 = (List) pair4.f186386b;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : list4) {
                    i93.c cVar4 = ((f0) obj3).f150113g;
                    if (cVar4 == null || (list = cVar4.f) == null) {
                        boolValueOf = null;
                    } else {
                        List list6 = list;
                        boolean z = false;
                        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                            Iterator it17 = list6.iterator();
                            while (true) {
                                if (it17.hasNext()) {
                                    if (list5.contains(((i93.h) it17.next()).f159559a)) {
                                        z = true;
                                    }
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    if (pd.b.j(boolValueOf)) {
                        arrayList6.add(obj3);
                    }
                }
                return arrayList6;
            case 21:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                List list7 = facilities;
                ArrayList arrayList7 = new ArrayList(w.t(list7, 10));
                Iterator it18 = list7.iterator();
                while (it18.hasNext()) {
                    arrayList7.add(((p) it18.next()).f317326b);
                }
                return arrayList7;
            case 22:
                List plots = (List) obj2;
                Intrinsics.checkNotNullParameter(plots, "plots");
                List<qta.d> list8 = plots;
                ArrayList arrayList8 = new ArrayList(w.t(list8, 10));
                for (qta.d dVar2 : list8) {
                    Pair pair5 = new Pair(dVar2.f249052b.f306286a, dVar2.f249053c.f306286a);
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(dVar2.f249051a));
                    ngd.b bVar5 = ngd.b.LINE;
                    List<Pair> list9 = dVar2.e;
                    ArrayList arrayList9 = new ArrayList(w.t(list9, 10));
                    for (Pair pair6 : list9) {
                        arrayList9.add(new ChartRatePoint.Line(new DateTime(((Number) pair6.f186385a).longValue()), new BigDecimal(String.valueOf(((Number) pair6.f186386b).doubleValue()))));
                    }
                    arrayList8.add(new ChartRate(pair5, bigDecimal, arrayList9, bVar5));
                }
                return arrayList8;
            case 23:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list10 = pockets;
                int iB = q0.b(w.t(list10, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list10) {
                    xi0.a aVar4 = xi0.b.Companion;
                    String str2 = ((d) obj4).f163147c;
                    aVar4.getClass();
                    linkedHashMap.put(xi0.a.a(str2), obj4);
                }
                return linkedHashMap;
            case 24:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<nel.n> list11 = instruments;
                ArrayList arrayList10 = new ArrayList(w.t(list11, 10));
                for (nel.n nVar2 : list11) {
                    arrayList10.add(new u3d.a(24, null, nVar2.f214596b, nVar2.e, nVar2.d, null));
                }
                return arrayList10;
            case 25:
                List tickers = (List) obj2;
                Intrinsics.checkNotNullParameter(tickers, "tickers");
                List<InstrumentTicker> list12 = tickers;
                ArrayList arrayList11 = new ArrayList(w.t(list12, 10));
                for (InstrumentTicker instrumentTicker : list12) {
                    String str3 = instrumentTicker.f105112b;
                    String str4 = instrumentTicker.f105113c;
                    dj0.d dVar3 = instrumentTicker.e;
                    String str5 = dVar3.f115083b.f306286a;
                    ej0.b bVar6 = instrumentTicker.f;
                    if (bVar6 == null || (bigDecimalJ = bVar6.f126703a) == null) {
                        bigDecimalJ = pyd.c.j(dVar3);
                    }
                    arrayList11.add(new lgd.d(str3, str4, str5, bigDecimalJ, null, instrumentTicker.f105125w));
                }
                return arrayList11;
            case 26:
                List instruments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments2, "instruments");
                List<nel.n> list13 = instruments2;
                ArrayList arrayList12 = new ArrayList(w.t(list13, 10));
                for (nel.n nVar3 : list13) {
                    arrayList12.add(new u3d.a(24, null, nVar3.f214596b, nVar3.e, nVar3.d, null));
                }
                return arrayList12;
            case 27:
                List tickers2 = (List) obj2;
                Intrinsics.checkNotNullParameter(tickers2, "tickers");
                List<InstrumentTicker> list14 = tickers2;
                ArrayList arrayList13 = new ArrayList(w.t(list14, 10));
                for (InstrumentTicker instrumentTicker2 : list14) {
                    String str6 = instrumentTicker2.f105112b;
                    String str7 = instrumentTicker2.f105113c;
                    dj0.d dVar4 = instrumentTicker2.e;
                    String str8 = dVar4.f115083b.f306286a;
                    ej0.b bVar7 = instrumentTicker2.f;
                    if (bVar7 == null || (bigDecimalJ2 = bVar7.f126703a) == null) {
                        bigDecimalJ2 = pyd.c.j(dVar4);
                    }
                    arrayList13.add(new lgd.d(str6, str7, str8, bigDecimalJ2, jb3.l.N(instrumentTicker2), null));
                }
                return arrayList13;
            case 28:
                Data feature = (Data) obj2;
                Intrinsics.checkNotNullParameter(feature, "feature");
                yoj.a aVar5 = (yoj.a) feature.getContent();
                return Boolean.valueOf(aVar5 != null ? yoj.b.k(aVar5) : false);
            default:
                Data legalEntityInformation = (Data) obj2;
                Intrinsics.checkNotNullParameter(legalEntityInformation, "legalEntityInformation");
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) legalEntityInformation.getContent();
                return (tradingLegalEntityInformation != null ? tradingLegalEntityInformation.f105106a : null) == hel.b.GB ? lgd.b.FX : lgd.b.GENERIC_SECURITY;
        }
    }
}
