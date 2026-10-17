package le3;

import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.hc;
import tof.i3;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194451a;

    public /* synthetic */ b(int i) {
        this.f194451a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String pocketId;
        String str;
        Iterator it8;
        xfg.f fVar;
        ?? C;
        xfg.f fVar2;
        hfg.b0 b0Var;
        xfg.e eVar;
        List list;
        Iterator it9;
        hfg.b0 b0Var2;
        switch (this.f194451a) {
            case 0:
                Map accountSources = (Map) obj2;
                Intrinsics.checkNotNullParameter(accountSources, "accountSources");
                ArrayList<AnalyticsAccountPocketSource> arrayListU = zhm.w.u(accountSources.values());
                ArrayList arrayList = new ArrayList();
                for (AnalyticsAccountPocketSource analyticsAccountPocketSource : arrayListU) {
                    if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.PocketSource) {
                        pocketId = ((AnalyticsAccountPocketSource.PocketSource) analyticsAccountPocketSource).f65740a.f163145a;
                    } else {
                        if (!(analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.SubaccountSource)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pocketId = ((AnalyticsAccountPocketSource.SubaccountSource) analyticsAccountPocketSource).f65741a.getPocketId();
                    }
                    if (pocketId != null) {
                        arrayList.add(pocketId);
                    }
                }
                return d0.i1(arrayList);
            case 1:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return d0.E0((List) rVar.f314203c, d0.E0((List) rVar.f314202b, (List) rVar.f314201a));
            case 2:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list2 = pockets;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(new AnalyticsAccountPocketSource.SubaccountSource((Subaccount) it10.next()));
                }
                return arrayList2;
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                List list4 = (List) pair.f186386b;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it11 = list4.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(((CreditCard) it11.next()).f69793b);
                }
                Set setI1 = d0.i1(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list3) {
                    if (setI1.contains(((io3.d) obj3).f163145a)) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 5:
                List accountSources2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accountSources2, "accountSources");
                return r0.t(accountSources2);
            case 6:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                List list5 = pockets2;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it12 = list5.iterator();
                while (it12.hasNext()) {
                    arrayList5.add(new AnalyticsAccountPocketSource.PocketSource((io3.d) it12.next()));
                }
                return arrayList5;
            case 7:
                Subaccount subaccount = (Subaccount) obj2;
                Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                return zhm.u.c(new AnalyticsAccountPocketSource.SubaccountSource(subaccount));
            case 8:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
            case 9:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list6 = (List) pair3.f186386b;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list6) {
                    io3.k kVar = ((io3.d) obj4).f;
                    if (kVar == io3.k.ACTIVE || kVar == io3.k.DELISTED) {
                        arrayList6.add(obj4);
                    }
                }
                ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                Iterator it13 = arrayList6.iterator();
                while (it13.hasNext()) {
                    arrayList7.add(new AnalyticsAccountPocketSource.PocketSource((io3.d) it13.next()));
                }
                return arrayList7;
            case 10:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : pockets3) {
                    if (cp5.d.A(io3.h.e((io3.d) obj5).f115083b)) {
                        arrayList8.add(obj5);
                    }
                }
                return arrayList8;
            case 11:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                return nkm.y.L(nkm.y.t(d0.Q(walletsWithPockets), new b(12)));
            case 12:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                fo3.c cVar = (fo3.c) pair4.f186385a;
                List<io3.d> list7 = (List) pair4.f186386b;
                ArrayList arrayList9 = new ArrayList();
                for (io3.d dVar : list7) {
                    xi0.a aVar = xi0.b.Companion;
                    String str2 = dVar.f163147c;
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(str2);
                    if (bVarA.equals(cVar.d)) {
                        bVarA = null;
                    }
                    Pair pair5 = bVarA != null ? new Pair(bVarA, cVar.d) : null;
                    if (pair5 != null) {
                        arrayList9.add(pair5);
                    }
                }
                return arrayList9;
            case 13:
                k71.q it14 = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new Data(it14, null, false, 6, null);
            case 14:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return new ie3.a((List) hVar.d, (List) hVar.f288434b, (k71.q) hVar.f288433a, (xi0.b) hVar.f288435c);
            case 15:
                Pair pair6 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair6, "<destruct>");
                ArrayList arrayListE0 = d0.E0((List) pair6.f186386b, (List) pair6.f186385a);
                HashSet hashSet = new HashSet();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : arrayListE0) {
                    if (hashSet.add(((n9l.a) obj6).f213664g)) {
                        arrayList10.add(obj6);
                    }
                }
                return arrayList10;
            case 16:
                DateTime it15 = (DateTime) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zi0.c.P(it15, false, null, 3);
            case 17:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                return zhm.u.c(new hc(wallet.f136801a, null));
            case 18:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zhm.w.u(it16);
            case 19:
                Pair pair7 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair7, "<destruct>");
                return zhm.u.c(new hc(((fo3.c) pair7.f186385a).f136801a, null));
            case 20:
                List data = (List) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (oq9.i iVar : zhm.w.u(data)) {
                    if ((iVar instanceof oq9.h) && (str = ((oq9.h) iVar).f227827l) != null) {
                        linkedHashMap.put(str, iVar);
                    }
                }
                return linkedHashMap;
            case 21:
                List data2 = (List) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return zhm.w.u(data2);
            case 22:
                List categories = (List) obj2;
                Intrinsics.checkNotNullParameter(categories, "categories");
                ArrayList arrayListU2 = zhm.w.u(categories);
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList11 = new ArrayList();
                for (Object obj7 : arrayListU2) {
                    if (hashSet2.add(((i3) obj7).getId())) {
                        arrayList11.add(obj7);
                    }
                }
                return arrayList11;
            case 23:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b bVarY = do3.q.y(user);
                wi0.b.Companion.getClass();
                return Boolean.valueOf(bVarY.equals(wi0.b.Y1));
            case 24:
                xfg.w it17 = (xfg.w) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return a.a.E(it17);
            case 25:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list8 = accounts;
                ArrayList arrayList12 = new ArrayList(zhm.w.t(list8, 10));
                Iterator it18 = list8.iterator();
                while (it18.hasNext()) {
                    arrayList12.add(z92.f.z((xfg.d) it18.next()));
                }
                return arrayList12;
            case 26:
                xfg.i response = (xfg.i) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List airlines = response.getAirlines();
                ArrayList arrayList13 = new ArrayList(zhm.w.t(airlines, 10));
                Iterator it19 = airlines.iterator();
                while (it19.hasNext()) {
                    xfg.f fVar3 = (xfg.f) it19.next();
                    Intrinsics.checkNotNullParameter(fVar3, "<this>");
                    String ref2 = fVar3.getRef();
                    String name = fVar3.getName();
                    String programmeName = fVar3.getProgrammeName();
                    String description = fVar3.getDescription();
                    String logoUrl = fVar3.getLogoUrl();
                    String learnMoreUrl = fVar3.getLearnMoreUrl();
                    TravelMilesProvider travelMilesProviderR = zi0.c.R(fVar3.getProvider());
                    Boolean suggested = fVar3.getSuggested();
                    boolean zBooleanValue = suggested != null ? suggested.booleanValue() : false;
                    List<String> redeemTypes = fVar3.getRedeemTypes();
                    if (redeemTypes != null) {
                        C = new ArrayList();
                        for (String str3 : redeemTypes) {
                            hfg.b0[] b0VarArrValues = hfg.b0.values();
                            int length = b0VarArrValues.length;
                            Iterator it20 = it19;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    b0Var = b0VarArrValues[i];
                                    int i2 = i;
                                    fVar2 = fVar3;
                                    if (!kotlin.text.a0.z(b0Var.name(), str3, true)) {
                                        i = i2 + 1;
                                        fVar3 = fVar2;
                                    }
                                } else {
                                    fVar2 = fVar3;
                                    b0Var = null;
                                }
                            }
                            hfg.b0 b0Var3 = b0Var;
                            if (b0Var3 != null) {
                                C.add(b0Var3);
                            }
                            it19 = it20;
                            fVar3 = fVar2;
                        }
                        it8 = it19;
                        fVar = fVar3;
                    } else {
                        it8 = it19;
                        fVar = fVar3;
                        C = zhm.u.c(hfg.b0.MILES);
                    }
                    arrayList13.add(new TravelMilesAirline(ref2, name, programmeName, description, logoUrl, learnMoreUrl, travelMilesProviderR, zBooleanValue, C, fVar.getVoucherProductGroupId()));
                    it19 = it8;
                }
                return arrayList13;
            case 27:
                xfg.e response2 = (xfg.e) obj2;
                Intrinsics.checkNotNullParameter(response2, "response");
                Intrinsics.checkNotNullParameter(response2, "<this>");
                String ref3 = response2.getRef();
                String name2 = response2.getName();
                String programmeName2 = response2.getProgrammeName();
                String description2 = response2.getDescription();
                String logoUrl2 = response2.getLogoUrl();
                String learnMoreUrl2 = response2.getLearnMoreUrl();
                String websiteUrl = response2.getWebsiteUrl();
                boolean suggested2 = response2.getSuggested();
                String backgroundUrl = response2.getBackgroundUrl();
                TravelMilesProvider travelMilesProviderR2 = zi0.c.R(response2.getProvider());
                List redeemTypes2 = response2.getRedeemTypes();
                if (redeemTypes2 != null) {
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it21 = redeemTypes2.iterator();
                    while (it21.hasNext()) {
                        String str4 = (String) it21.next();
                        hfg.b0[] b0VarArrValues2 = hfg.b0.values();
                        int length2 = b0VarArrValues2.length;
                        xfg.e eVar2 = response2;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                b0Var2 = b0VarArrValues2[i3];
                                int i5 = i3;
                                it9 = it21;
                                if (!kotlin.text.a0.z(b0Var2.name(), str4, true)) {
                                    i3 = i5 + 1;
                                    it21 = it9;
                                }
                            } else {
                                it9 = it21;
                                b0Var2 = null;
                            }
                        }
                        hfg.b0 b0Var4 = b0Var2;
                        if (b0Var4 != null) {
                            arrayList14.add(b0Var4);
                        }
                        response2 = eVar2;
                        it21 = it9;
                    }
                    eVar = response2;
                    list = arrayList14;
                } else {
                    eVar = response2;
                    list = f0.f322471a;
                }
                List list9 = list;
                List redeemOptions = eVar.getRedeemOptions();
                ArrayList arrayList15 = new ArrayList(zhm.w.t(redeemOptions, 10));
                Iterator it22 = redeemOptions.iterator();
                while (it22.hasNext()) {
                    arrayList15.add(u0.M((xfg.z) it22.next()));
                }
                List extraRedeemOptions = eVar.getExtraRedeemOptions();
                ArrayList arrayList16 = new ArrayList(zhm.w.t(extraRedeemOptions, 10));
                Iterator it23 = extraRedeemOptions.iterator();
                while (it23.hasNext()) {
                    arrayList16.add(u0.M((xfg.z) it23.next()));
                }
                return new hfg.e(ref3, name2, programmeName2, description2, logoUrl2, learnMoreUrl2, websiteUrl, suggested2, backgroundUrl, travelMilesProviderR2, list9, arrayList15, arrayList16, eVar.getVoucherProductGroupId());
            case 28:
                List dtos = (List) obj2;
                Intrinsics.checkNotNullParameter(dtos, "dtos");
                List list10 = dtos;
                ArrayList arrayList17 = new ArrayList(zhm.w.t(list10, 10));
                Iterator it24 = list10.iterator();
                while (it24.hasNext()) {
                    arrayList17.add(zi0.c.R((xfg.t) it24.next()));
                }
                return arrayList17;
            default:
                xfg.y it25 = (xfg.y) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                Intrinsics.checkNotNullParameter(it25, "<this>");
                String departureCity = it25.getDepartureCity();
                String arrivalCity = it25.getArrivalCity();
                String departureIataCode = it25.getDepartureIataCode();
                String arrivalIataCode = it25.getArrivalIataCode();
                String provider = it25.getProvider();
                String flightImageUrl = it25.getFlightImageUrl();
                String ctaText = it25.getCtaText();
                List flights = it25.getFlights();
                ArrayList arrayList18 = new ArrayList(zhm.w.t(flights, 10));
                Iterator it26 = flights.iterator();
                while (it26.hasNext()) {
                    xfg.x xVar = (xfg.x) it26.next();
                    Intrinsics.checkNotNullParameter(xVar, "<this>");
                    String flightId = xVar.getFlightId();
                    String airlineName = xVar.getAirlineName();
                    String airlineRef = xVar.getAirlineRef();
                    String airlineIconUrl = xVar.getAirlineIconUrl();
                    LocalDateTime localDateTime = LocalDateTime.parse(xVar.getDepartsAt());
                    Iterator it27 = it26;
                    Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
                    LocalDateTime localDateTime2 = LocalDateTime.parse(xVar.getArrivesAt());
                    Intrinsics.checkNotNullExpressionValue(localDateTime2, "parse(...)");
                    Duration durationOfMinutes = Duration.ofMinutes(xVar.getTotalDuration());
                    Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
                    arrayList18.add(new hfg.y(flightId, airlineName, airlineRef, airlineIconUrl, localDateTime, localDateTime2, durationOfMinutes, xVar.getBookingUrl(), xVar.getFlightClass(), xVar.getRevpointsCost(), mo3.a.o(xVar.getTaxesCost()), xVar.getNumberOfSegments()));
                    it26 = it27;
                }
                return new hfg.z(departureCity, arrivalCity, departureIataCode, arrivalIataCode, provider, flightImageUrl, ctaText, arrayList18);
        }
    }
}
