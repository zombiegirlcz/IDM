package lfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesNumberRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAirlineIcon;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$FlightSegment;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$NextConnection;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$SegmentsBreakdown;
import com.revolut.feature.travel.miles.impl.network.TravelMilesSearchService;
import hfg.l0;
import ip0.v7;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import yfg.d;
import yfg.e;
import yfg.f;
import yfg.g;
import yfg.n;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f194927b;

    public /* synthetic */ y(g0 g0Var, int i) {
        this.f194926a = i;
        this.f194927b = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hfg.e0 e0Var;
        switch (this.f194926a) {
            case 0:
                String flightId = (String) obj2;
                Intrinsics.checkNotNullParameter(flightId, "flightId");
                return (hfg.g0) v7.r("FLIGHT_DETAILS_MEMORY_KEY", flightId, this.f194927b.f194886b);
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (hfg.r) this.f194927b.f194886b.get("SEARCH_SUGGESTIONS_MEMORY_KEY");
            case 2:
                String flightId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(flightId2, "flightId");
                yfg.n nVar = (yfg.n) j6.a.k(yfg.n.class, this.f194927b.d, j6.a.q("FLIGHT_DETAILS_STORAGE_KEY", flightId2));
                if (nVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(nVar, "<this>");
                String strJ = nVar.getFlightId();
                List<n.a> listA = nVar.getAirlines();
                ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
                for (n.a aVar : listA) {
                    arrayList.add(new hfg.c0(aVar.getAirlineName(), kfg.d.a(aVar.getAirlineIconName(), aVar.getAirlineIconUrl()), aVar.getAirlineRef()));
                }
                LocalDateTime localDateTime = LocalDateTime.parse(nVar.getDepartsAt());
                Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
                LocalDateTime localDateTime2 = LocalDateTime.parse(nVar.getArrivesAt());
                Intrinsics.checkNotNullExpressionValue(localDateTime2, "parse(...)");
                String strH = nVar.getDepartureIataCode();
                String strC = nVar.getArrivalIataCode();
                Duration durationOfMinutes = Duration.ofMinutes(nVar.getTotalDuration());
                Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
                hfg.d0 d0Var = new hfg.d0(strJ, arrayList, localDateTime, localDateTime2, strH, strC, durationOfMinutes, nVar.getRevpointsPrice(), hx7.a.v(nVar.getTaxesPrice()), nVar.getNumberOfSegments(), null, null);
                String strM = nVar.getProvider();
                n.e eVarO = nVar.getSegmentsBreakdown();
                LocalDate localDate = LocalDate.parse(eVarO.getArrivalDate());
                Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                List<n.c> listB = eVarO.getSegments();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listB, 10));
                for (n.c cVar : listB) {
                    String strO = cVar.getSegmentId();
                    String strM2 = cVar.getFlightNumber();
                    String strA = cVar.getAircraftName();
                    String strD = cVar.getAirlineName();
                    String strE = cVar.getAirlineRef();
                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIconA = kfg.d.a(cVar.getAirlineIconName(), cVar.getAirlineIconUrl());
                    LocalDateTime localDateTime3 = LocalDateTime.parse(cVar.getDepartsAt());
                    Intrinsics.checkNotNullExpressionValue(localDateTime3, "parse(...)");
                    LocalDateTime localDateTime4 = LocalDateTime.parse(cVar.getArrivesAt());
                    Intrinsics.checkNotNullExpressionValue(localDateTime4, "parse(...)");
                    Long l2 = cVar.getDuration();
                    Duration durationOfMinutes2 = l2 != null ? Duration.ofMinutes(l2.longValue()) : null;
                    String strJ2 = cVar.getDepartureAirport();
                    String strF = cVar.getArrivalAirport();
                    String strK = cVar.getDepartureDescription();
                    String strG = cVar.getArrivalDescription();
                    n.d dVarN = cVar.getNextConnection();
                    arrayList2.add(new TravelMilesSearchFlightDetails$FlightSegment(strO, strM2, strA, strD, strE, travelMilesSearchAirlineIconA, localDateTime3, localDateTime4, durationOfMinutes2, strJ2, strF, strK, strG, dVarN != null ? new TravelMilesSearchFlightDetails$NextConnection(dVarN.getAirportChange(), dVarN.getLayoverDuration()) : null));
                }
                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = new TravelMilesSearchFlightDetails$SegmentsBreakdown(localDate, arrayList2);
                List<n.b> listI = nVar.getFlightClasses();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(listI, 10));
                for (n.b bVar : listI) {
                    String strE2 = bVar.getType();
                    hfg.e0[] e0VarArrValues = hfg.e0.values();
                    int length = e0VarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            e0Var = e0VarArrValues[i];
                            if (!kotlin.text.a0.z(e0Var.name(), strE2, true)) {
                                i++;
                            }
                        } else {
                            e0Var = null;
                        }
                    }
                    if (e0Var == null) {
                        e0Var = hfg.e0.ECONOMY;
                    }
                    arrayList3.add(new hfg.f0(e0Var, bVar.getName(), bVar.getRevpointsPrice(), hx7.a.v(bVar.getTaxesPrice()), bVar.getBookingUrl()));
                }
                return new hfg.g0(d0Var, strM, travelMilesSearchFlightDetails$SegmentsBreakdown, arrayList3, nVar.getCtaText(), nVar.getFlightImageUrl(), nVar.getDepartureCity(), nVar.getArrivalCity());
            case 3:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (hfg.f) this.f194927b.f194886b.get("AVAILABLE_AIRLINES_MEMORY_KEY");
            case 4:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                yfg.a aVar2 = (yfg.a) j6.a.k(yfg.a.class, this.f194927b.d, "AVAILABLE_AIRLINES_STORAGE_KEY");
                if (aVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                List<yfg.b> availableAirlines = aVar2.getAvailableAirlines();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(availableAirlines, 10));
                for (yfg.b bVar2 : availableAirlines) {
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    arrayList4.add(new hfg.g(bVar2.getAirlineName(), bVar2.getProviderDescription(), bVar2.getIconUrl()));
                }
                List<yfg.b> unavailableAirlines = aVar2.getUnavailableAirlines();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(unavailableAirlines, 10));
                for (yfg.b bVar3 : unavailableAirlines) {
                    Intrinsics.checkNotNullParameter(bVar3, "<this>");
                    arrayList5.add(new hfg.g(bVar3.getAirlineName(), bVar3.getProviderDescription(), bVar3.getIconUrl()));
                }
                return new hfg.f(arrayList4, arrayList5);
            case 5:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (hfg.j) this.f194927b.f194886b.get("FLIGHT_FILTERS_MEMORY_KEY");
            case 6:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                yfg.d dVar = (yfg.d) j6.a.k(yfg.d.class, this.f194927b.d, "FLIGHT_FILTERS_STORAGE_KEY");
                if (dVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                List numberOfStops = dVar.getNumberOfStops();
                ArrayList arrayList6 = new ArrayList(zhm.w.t(numberOfStops, 10));
                Iterator it12 = numberOfStops.iterator();
                while (it12.hasNext()) {
                    arrayList6.add(kfg.b.b((d.a) it12.next()));
                }
                List cabin = dVar.getCabin();
                ArrayList arrayList7 = new ArrayList(zhm.w.t(cabin, 10));
                Iterator it13 = cabin.iterator();
                while (it13.hasNext()) {
                    arrayList7.add(kfg.b.b((d.a) it13.next()));
                }
                yfg.k priceInPoints = dVar.getPriceInPoints();
                Intrinsics.checkNotNullParameter(priceInPoints, "<this>");
                TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = new TravelMilesNumberRangeFilter(priceInPoints.getMin(), priceInPoints.getMax());
                yfg.j fees = dVar.getFees();
                Intrinsics.checkNotNullParameter(fees, "<this>");
                TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = new TravelMilesMoneyRangeFilter(hx7.a.v(fees.getMin()), hx7.a.v(fees.getMax()));
                List airlines = dVar.getAirlines();
                ArrayList arrayList8 = new ArrayList(zhm.w.t(airlines, 10));
                Iterator it14 = airlines.iterator();
                while (it14.hasNext()) {
                    arrayList8.add(kfg.b.b((d.a) it14.next()));
                }
                List milesProgrammes = dVar.getMilesProgrammes();
                ArrayList arrayList9 = new ArrayList(zhm.w.t(milesProgrammes, 10));
                Iterator it15 = milesProgrammes.iterator();
                while (it15.hasNext()) {
                    arrayList9.add(kfg.b.b((d.a) it15.next()));
                }
                return new hfg.j(arrayList6, arrayList7, travelMilesNumberRangeFilter, travelMilesMoneyRangeFilter, arrayList8, arrayList9);
            case 7:
                hfg.i request = (hfg.i) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return (hfg.h) v7.r("FLIGHT_AVAILABILITY_MEMORY_KEY", g0.c(request), this.f194927b.f194886b);
            case 8:
                hfg.i request2 = (hfg.i) obj2;
                Intrinsics.checkNotNullParameter(request2, "request");
                yfg.c cVar2 = (yfg.c) j6.a.k(yfg.c.class, this.f194927b.d, j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request2)));
                if (cVar2 != null) {
                    return kfg.a.b(cVar2);
                }
                return null;
            case 9:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                List list = (List) p.a.j(yfg.q.class, KTypeProjection.INSTANCE, List.class, this.f194927b.d, "TOP_DESTINATIONS_STORAGE_KEY");
                if (list != null) {
                    return kfg.f.c(list);
                }
                return null;
            case 10:
                hfg.i request3 = (hfg.i) obj2;
                Intrinsics.checkNotNullParameter(request3, "request");
                return (hfg.t) v7.r("FLIGHT_SUGGESTIONS_MEMORY_KEY", g0.c(request3), this.f194927b.f194886b);
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                yfg.f fVar = (yfg.f) j6.a.k(yfg.f.class, this.f194927b.d, "SEARCH_SUGGESTIONS_STORAGE_KEY");
                if (fVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                String textSuggestion = fVar.getTextSuggestion();
                List<f.a> destinations = fVar.getDestinations();
                ArrayList arrayList10 = new ArrayList(zhm.w.t(destinations, 10));
                for (f.a aVar3 : destinations) {
                    Intrinsics.checkNotNullParameter(aVar3, "<this>");
                    arrayList10.add(new hfg.q(aVar3.getCity(), aVar3.getCountry(), aVar3.getCountryCode()));
                }
                return new hfg.r(textSuggestion, arrayList10);
            case 12:
                hfg.i request4 = (hfg.i) obj2;
                Intrinsics.checkNotNullParameter(request4, "request");
                yfg.g gVar = (yfg.g) j6.a.k(yfg.g.class, this.f194927b.d, j6.a.q("FLIGHT_SUGGESTIONS_STORAGE_KEY", g0.c(request4)));
                if (gVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                hfg.h hVarB = kfg.a.b(gVar.getSuggestedDates());
                ArrayList arrayListC = kfg.f.c(gVar.getAlternativeDestinations());
                List<g.a> recommendedAirlines = gVar.getRecommendedAirlines();
                ArrayList arrayList11 = new ArrayList(zhm.w.t(recommendedAirlines, 10));
                for (g.a aVar4 : recommendedAirlines) {
                    arrayList11.add(new hfg.s(aVar4.getName(), aVar4.getProviderDescription(), aVar4.getIconUrl(), aVar4.getDeeplink()));
                }
                return new hfg.t(hVarB, arrayListC, arrayList11);
            case 13:
                b0 params = (b0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (l0) this.f194927b.f194887c.c(params);
            case 14:
                Unit it17 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (List) this.f194927b.f194886b.get("TOP_DESTINATIONS_MEM_KEY");
            case 15:
                od0.i locationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(locationOptional, "locationOptional");
                TravelMilesSearchService travelMilesSearchService = this.f194927b.f194885a;
                co3.a aVar5 = (co3.a) locationOptional.f224257a;
                return new ufm.i(te0.w.i0(travelMilesSearchService.getSearchSuggestions(aVar5 != null ? aVar5.f25486a + "," + aVar5.f25487b : null)), new le3.y(new z(7), 23), 1);
            case 16:
                od0.i locationOptional2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(locationOptional2, "locationOptional");
                TravelMilesSearchService travelMilesSearchService2 = this.f194927b.f194885a;
                co3.a aVar6 = (co3.a) locationOptional2.f224257a;
                return new ufm.i(travelMilesSearchService2.getTopDestinations(aVar6 != null ? aVar6.f25486a + "," + aVar6.f25487b : null).s(hhm.f.f152431c), new le3.y(new z(10), 25), 1);
            case 17:
                vfg.i params2 = (vfg.i) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (hfg.p) this.f194927b.f194886b.get(g0.d(params2));
            default:
                vfg.i params3 = (vfg.i) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                yfg.e eVar = (yfg.e) j6.a.k(yfg.e.class, this.f194927b.d, g0.e(params3));
                if (eVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                List<e.b> cities = eVar.getCities();
                ArrayList arrayList12 = new ArrayList(zhm.w.t(cities, 10));
                for (e.b bVar4 : cities) {
                    Intrinsics.checkNotNullParameter(bVar4, "<this>");
                    String city = bVar4.getCity();
                    String country = bVar4.getCountry();
                    String countryCode = bVar4.getCountryCode();
                    List<e.a> airports = bVar4.getAirports();
                    ArrayList arrayList13 = new ArrayList(zhm.w.t(airports, 10));
                    for (e.a aVar7 : airports) {
                        Intrinsics.checkNotNullParameter(aVar7, "<this>");
                        arrayList13.add(new hfg.n(aVar7.getIataCode()));
                    }
                    arrayList12.add(new hfg.o(city, country, countryCode, arrayList13));
                }
                return new hfg.p(arrayList12);
        }
    }
}
