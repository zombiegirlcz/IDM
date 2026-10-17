package lfg;

import com.revolut.core.mobile_services.api.exceptions.MsApiException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.wero.impl.ui.pay.list.WeroRequestLinkListScreen;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesNumberRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAirlineIcon;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$FlightSegment;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$NextConnection;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$SegmentsBreakdown;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.api.ui.providers.composite_add_money.CompositeAddMoneyPortfolioInfoProviderContract$Limits;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hfg.l0;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import xfg.b0;
import xfg.c0;
import xfg.h0;
import xfg.m;
import xfg.o;
import xfg.p;
import xfg.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194928a;

    public /* synthetic */ z(int i) {
        this.f194928a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hfg.e0 e0Var;
        hfg.m mVar;
        Object next;
        int i = 0;
        z = false;
        boolean z = false;
        switch (this.f194928a) {
            case 0:
                xfg.k it8 = (xfg.k) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return kfg.a.a(it8);
            case 1:
                xfg.o it9 = (xfg.o) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                List<o.b> cities = it9.getCities();
                ArrayList arrayList = new ArrayList(zhm.w.t(cities, 10));
                for (o.b bVar : cities) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    String city = bVar.getCity();
                    String country = bVar.getCountry();
                    String countryCode = bVar.getCountryCode();
                    List<o.a> airports = bVar.getAirports();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(airports, 10));
                    for (o.a aVar : airports) {
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        arrayList2.add(new hfg.n(aVar.getIataCode()));
                    }
                    arrayList.add(new hfg.o(city, country, countryCode, arrayList2));
                }
                return new hfg.p(arrayList);
            case 2:
                xfg.h0 it10 = (xfg.h0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                List<xfg.c0> flights = it10.getFlights();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(flights, 10));
                for (xfg.c0 c0Var : flights) {
                    String resultId = it10.getResultId();
                    String flightId = c0Var.getFlightId();
                    List<c0.a> airlines = c0Var.getAirlines();
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(airlines, 10));
                    for (c0.a aVar2 : airlines) {
                        arrayList4.add(new hfg.c0(aVar2.getAirlineName(), aVar2.getAirlineIconName() != null ? new TravelMilesSearchAirlineIcon.Local(aVar2.getAirlineIconName()) : aVar2.getAirlineIconUrl() != null ? new TravelMilesSearchAirlineIcon.Remote(aVar2.getAirlineIconUrl()) : null, aVar2.getAirlineRef()));
                    }
                    LocalDateTime localDateTime = LocalDateTime.parse(c0Var.getDepartsAt());
                    Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
                    LocalDateTime localDateTime2 = LocalDateTime.parse(c0Var.getArrivesAt());
                    Intrinsics.checkNotNullExpressionValue(localDateTime2, "parse(...)");
                    String departureIataCode = c0Var.getDepartureIataCode();
                    String arrivalIataCode = c0Var.getArrivalIataCode();
                    Duration durationOfMinutes = Duration.ofMinutes(c0Var.getTotalDuration());
                    Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
                    arrayList3.add(new hfg.d0(flightId, arrayList4, localDateTime, localDateTime2, departureIataCode, arrivalIataCode, durationOfMinutes, c0Var.getRevpointsPrice(), mo3.a.o(c0Var.getTaxesPrice()), c0Var.getNumberOfSegments(), c0Var.getExternalPartner(), resultId));
                }
                String nextCursor = it10.getNextCursor();
                h0.a liveSearchBreakdown = it10.getLiveSearchBreakdown();
                return new l0(arrayList3, nextCursor, liveSearchBreakdown != null ? new hfg.k0(liveSearchBreakdown.getPollingId(), liveSearchBreakdown.getTimeout()) : null);
            case 3:
                xfg.q it11 = (xfg.q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Intrinsics.checkNotNullParameter(it11, "<this>");
                hfg.h hVarA = kfg.a.a(it11.getSuggestedDates());
                ArrayList arrayListB = kfg.f.b(it11.getAlternativeDestinations());
                List<q.a> recommendedAirlines = it11.getRecommendedAirlines();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(recommendedAirlines, 10));
                for (q.a aVar3 : recommendedAirlines) {
                    arrayList5.add(new hfg.s(aVar3.getName(), aVar3.getProviderDescription(), aVar3.getIconUrl(), aVar3.getDeeplink()));
                }
                return new hfg.t(hVarA, arrayListB, arrayList5);
            case 4:
                xfg.m it12 = (xfg.m) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Intrinsics.checkNotNullParameter(it12, "<this>");
                List numberOfStops = it12.getNumberOfStops();
                ArrayList arrayList6 = new ArrayList(zhm.w.t(numberOfStops, 10));
                Iterator it13 = numberOfStops.iterator();
                while (it13.hasNext()) {
                    arrayList6.add(kfg.b.a((m.a) it13.next()));
                }
                List cabin = it12.getCabin();
                ArrayList arrayList7 = new ArrayList(zhm.w.t(cabin, 10));
                Iterator it14 = cabin.iterator();
                while (it14.hasNext()) {
                    arrayList7.add(kfg.b.a((m.a) it14.next()));
                }
                xfg.s priceInPoints = it12.getPriceInPoints();
                Intrinsics.checkNotNullParameter(priceInPoints, "<this>");
                TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = new TravelMilesNumberRangeFilter(priceInPoints.getMin(), priceInPoints.getMax());
                xfg.r fees = it12.getFees();
                Intrinsics.checkNotNullParameter(fees, "<this>");
                TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = new TravelMilesMoneyRangeFilter(mo3.a.o(fees.getMin()), mo3.a.o(fees.getMax()));
                List airlines2 = it12.getAirlines();
                ArrayList arrayList8 = new ArrayList(zhm.w.t(airlines2, 10));
                Iterator it15 = airlines2.iterator();
                while (it15.hasNext()) {
                    arrayList8.add(kfg.b.a((m.a) it15.next()));
                }
                List milesProgrammes = it12.getMilesProgrammes();
                ArrayList arrayList9 = new ArrayList(zhm.w.t(milesProgrammes, 10));
                Iterator it16 = milesProgrammes.iterator();
                while (it16.hasNext()) {
                    arrayList9.add(kfg.b.a((m.a) it16.next()));
                }
                return new hfg.j(arrayList6, arrayList7, travelMilesNumberRangeFilter, travelMilesMoneyRangeFilter, arrayList8, arrayList9);
            case 5:
                xfg.b0 it17 = (xfg.b0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Intrinsics.checkNotNullParameter(it17, "<this>");
                String strJ = it17.getFlightId();
                List<b0.a> listA = it17.getAirlines();
                ArrayList arrayList10 = new ArrayList(zhm.w.t(listA, 10));
                for (b0.a aVar4 : listA) {
                    arrayList10.add(new hfg.c0(aVar4.getAirlineName(), kfg.d.a(aVar4.getAirlineIconName(), aVar4.getAirlineIconUrl()), aVar4.getAirlineRef()));
                }
                LocalDateTime localDateTime3 = LocalDateTime.parse(it17.getDepartsAt());
                Intrinsics.checkNotNullExpressionValue(localDateTime3, "parse(...)");
                LocalDateTime localDateTime4 = LocalDateTime.parse(it17.getArrivesAt());
                Intrinsics.checkNotNullExpressionValue(localDateTime4, "parse(...)");
                String strH = it17.getDepartureIataCode();
                String strC = it17.getArrivalIataCode();
                Duration durationOfMinutes2 = Duration.ofMinutes(it17.getTotalDuration());
                Intrinsics.checkNotNullExpressionValue(durationOfMinutes2, "ofMinutes(...)");
                hfg.d0 d0Var = new hfg.d0(strJ, arrayList10, localDateTime3, localDateTime4, strH, strC, durationOfMinutes2, it17.getRevpointsPrice(), mo3.a.o(it17.getTaxesPrice()), it17.getNumberOfSegments(), null, null);
                String strM = it17.getProvider();
                b0.e eVarO = it17.getSegmentsBreakdown();
                LocalDate localDate = LocalDate.parse(eVarO.getArrivalDate());
                Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                List<b0.c> listB = eVarO.getSegments();
                ArrayList arrayList11 = new ArrayList(zhm.w.t(listB, 10));
                for (b0.c cVar : listB) {
                    String strO = cVar.getSegmentId();
                    String strM2 = cVar.getFlightNumber();
                    String strA = cVar.getAircraftName();
                    String strD = cVar.getAirlineName();
                    String strE = cVar.getAirlineRef();
                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIconA = kfg.d.a(cVar.getAirlineIconName(), cVar.getAirlineIconUrl());
                    LocalDateTime localDateTime5 = LocalDateTime.parse(cVar.getDepartsAt());
                    Intrinsics.checkNotNullExpressionValue(localDateTime5, "parse(...)");
                    LocalDateTime localDateTime6 = LocalDateTime.parse(cVar.getArrivesAt());
                    Intrinsics.checkNotNullExpressionValue(localDateTime6, "parse(...)");
                    Long l2 = cVar.getDuration();
                    Duration durationOfMinutes3 = l2 != null ? Duration.ofMinutes(l2.longValue()) : null;
                    String strJ2 = cVar.getDepartureAirport();
                    String strF = cVar.getArrivalAirport();
                    String strK = cVar.getDepartureDescription();
                    String strG = cVar.getArrivalDescription();
                    b0.d dVarN = cVar.getNextConnection();
                    arrayList11.add(new TravelMilesSearchFlightDetails$FlightSegment(strO, strM2, strA, strD, strE, travelMilesSearchAirlineIconA, localDateTime5, localDateTime6, durationOfMinutes3, strJ2, strF, strK, strG, dVarN != null ? new TravelMilesSearchFlightDetails$NextConnection(dVarN.getAirportChange(), dVarN.getLayoverDuration()) : null));
                }
                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = new TravelMilesSearchFlightDetails$SegmentsBreakdown(localDate, arrayList11);
                List<b0.b> listI = it17.getFlightClasses();
                ArrayList arrayList12 = new ArrayList(zhm.w.t(listI, 10));
                for (b0.b bVar2 : listI) {
                    String strE2 = bVar2.getType();
                    hfg.e0[] e0VarArrValues = hfg.e0.values();
                    int length = e0VarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            e0Var = e0VarArrValues[i2];
                            if (!kotlin.text.a0.z(e0Var.name(), strE2, true)) {
                                i2++;
                            }
                        } else {
                            e0Var = null;
                        }
                    }
                    if (e0Var == null) {
                        e0Var = hfg.e0.ECONOMY;
                    }
                    arrayList12.add(new hfg.f0(e0Var, bVar2.getName(), bVar2.getRevpointsPrice(), mo3.a.o(bVar2.getTaxesPrice()), bVar2.getBookingUrl()));
                }
                return new hfg.g0(d0Var, strM, travelMilesSearchFlightDetails$SegmentsBreakdown, arrayList12, it17.getCtaText(), it17.getFlightImageUrl(), it17.getDepartureCity(), it17.getArrivalCity());
            case 6:
                xfg.g it18 = (xfg.g) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Intrinsics.checkNotNullParameter(it18, "<this>");
                List<xfg.h> availableAirlines = it18.getAvailableAirlines();
                ArrayList arrayList13 = new ArrayList(zhm.w.t(availableAirlines, 10));
                for (xfg.h hVar : availableAirlines) {
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    arrayList13.add(new hfg.g(hVar.getAirlineName(), hVar.getProviderDescription(), hVar.getIconUrl()));
                }
                List<xfg.h> unavailableAirlines = it18.getUnavailableAirlines();
                ArrayList arrayList14 = new ArrayList(zhm.w.t(unavailableAirlines, 10));
                for (xfg.h hVar2 : unavailableAirlines) {
                    Intrinsics.checkNotNullParameter(hVar2, "<this>");
                    arrayList14.add(new hfg.g(hVar2.getAirlineName(), hVar2.getProviderDescription(), hVar2.getIconUrl()));
                }
                return new hfg.f(arrayList13, arrayList14);
            case 7:
                xfg.p it19 = (xfg.p) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Intrinsics.checkNotNullParameter(it19, "<this>");
                String textSuggestion = it19.getTextSuggestion();
                List<p.a> destinations = it19.getDestinations();
                ArrayList arrayList15 = new ArrayList(zhm.w.t(destinations, 10));
                for (p.a aVar5 : destinations) {
                    Intrinsics.checkNotNullParameter(aVar5, "<this>");
                    arrayList15.add(new hfg.q(aVar5.getCity(), aVar5.getCountry(), aVar5.getCountryCode()));
                }
                return new hfg.r(textSuggestion, arrayList15);
            case 8:
                LocationDomain lastLocation = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(lastLocation, "lastLocation");
                od0.h hVar3 = od0.i.Companion;
                co3.a aVar6 = new co3.a(lastLocation.f78066a, lastLocation.f78067b);
                hVar3.getClass();
                return od0.h.a(aVar6);
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 10:
                List it20 = (List) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return kfg.f.b(it20);
            case 11:
                xfg.n nVar = (xfg.n) obj2;
                Intrinsics.h(nVar);
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                String resultId2 = nVar.getResultId();
                String externalPartner = nVar.getExternalPartner();
                String status = nVar.getStatus();
                hfg.m[] mVarArrValues = hfg.m.values();
                int length2 = mVarArrValues.length;
                while (true) {
                    if (i < length2) {
                        mVar = mVarArrValues[i];
                        if (!kotlin.text.a0.z(mVar.name(), status, true)) {
                            i++;
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unknown live search status received: ", nVar.getStatus()));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    mVar = hfg.m.UNKNOWN;
                }
                return new hfg.k(resultId2, externalPartner, mVar);
            case 12:
                xfg.k0 list = (xfg.k0) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List topUps = list.getTopUps();
                ArrayList arrayList16 = new ArrayList(zhm.w.t(topUps, 10));
                Iterator it21 = topUps.iterator();
                while (it21.hasNext()) {
                    arrayList16.add(boh.f.w((xfg.j0) it21.next()));
                }
                return arrayList16;
            case 13:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var2);
                return Boolean.FALSE;
            case 14:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var3);
                return Boolean.FALSE;
            case 15:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                ArrayList arrayList17 = new ArrayList();
                for (Object obj3 : plans) {
                    hha.d dVar = (hha.d) obj3;
                    if (hha.s.n(dVar) || hha.s.j(dVar) || hha.s.p(dVar)) {
                        arrayList17.add(obj3);
                    }
                }
                Iterator it22 = arrayList17.iterator();
                if (it22.hasNext()) {
                    next = it22.next();
                    if (it22.hasNext()) {
                        int i3 = ((hha.d) next).f152294m;
                        do {
                            Object next2 = it22.next();
                            int i5 = ((hha.d) next2).f152294m;
                            if (i3 > i5) {
                                next = next2;
                                i3 = i5;
                            }
                        } while (it22.hasNext());
                    }
                } else {
                    next = null;
                }
                hha.d dVar2 = (hha.d) next;
                if (dVar2 == null) {
                    return null;
                }
                int i6 = lgk.b.f195127a[hha.s.f(dVar2).ordinal()];
                if (i6 == 1) {
                    return new qf1.m(new TextLocalisedClause(R$string.p4u_product_plan_premium_title, null, null, 14), new TextLocalisedClause(R$string.p4u_product_plan_premium_description, null, null, 14), new TextLocalisedClause(R$string.p4u_product_plan_premium_cta, null, null, 14), R$drawable.uikit_icn_24_premium, null, lgk.d.f195129c, "PREMIUM", 48);
                }
                if (i6 == 2) {
                    return new qf1.m(new TextLocalisedClause(R$string.p4u_product_plan_metal_title, null, null, 14), new TextLocalisedClause(R$string.p4u_product_plan_metal_description, null, null, 14), new TextLocalisedClause(R$string.p4u_product_plan_metal_cta, null, null, 14), R$drawable.uikit_icn_24_premium, null, lgk.d.d, "METAL", 48);
                }
                if (i6 != 3) {
                    return null;
                }
                return new qf1.m(new TextLocalisedClause(R$string.p4u_product_plan_ultra_title, null, null, 14), new TextLocalisedClause(R$string.p4u_product_plan_ultra_description, null, null, 14), new TextLocalisedClause(R$string.p4u_product_plan_ultra_cta, null, null, 14), R$drawable.uikit_icn_24_plan_ultra, null, lgk.d.e, "ULTRA", 48);
            case 16:
                CompositeAddMoneyPortfolioInfoProviderContract$Limits limits = (CompositeAddMoneyPortfolioInfoProviderContract$Limits) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                return new ghh.a(limits.f95368b);
            case 17:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                zhm.h0 h0Var4 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Error while loading sender name from address book for push message", th10, h0Var4);
                return Unit.f186387a;
            case 18:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return ((throwable instanceof MsApiException) && ((MsApiException) throwable).f51387a == jh0.b.TAP_AND_PAY_NO_ACTIVE_WALLET) ? efm.d0.m("") : efm.d0.l(throwable);
            case 19:
                RowDelegate.Model it23 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = WeroRequestLinkListScreen.R;
                Intrinsics.checkNotNullParameter(it23, "it");
                Object obj4 = it23.u;
                if (obj4 instanceof jh2.n) {
                    return (jh2.n) obj4;
                }
                return null;
            case 20:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 21:
                WealthAccount it24 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(it24.available());
            case 22:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list2 = accounts;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it25 = list2.iterator();
                    while (true) {
                        if (it25.hasNext()) {
                            WealthAccount wealthAccount = (WealthAccount) it25.next();
                            if (wealthAccount.available() && (wealthAccount instanceof WealthAccount.Securities)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 23:
                do3.n it26 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                org.joda.time.LocalDate localDate2 = it26.f116413j;
                if (localDate2 != null) {
                    return jli.b.e(localDate2);
                }
                return null;
            case 24:
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a it27 = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return new yhm.r(it27.f77053a, it27.f77054b, it27.f77055c);
            case 25:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "output");
                throw null;
            case 26:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "output");
                throw null;
            case 27:
                ljc.g update = (ljc.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ljc.g.a(update, Data.copy$default(update.f195623b, null, null, true, 3, null), Data.copy$default(update.f195624c, null, null, true, 3, null), Data.copy$default(update.d, null, null, true, 3, null), null, null, 49);
            case 28:
                return ljc.g.a((ljc.g) obj2, null, null, null, null, null, 47);
            default:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
        }
    }

    public /* synthetic */ z(lgk.d dVar) {
        this.f194928a = 15;
    }
}
