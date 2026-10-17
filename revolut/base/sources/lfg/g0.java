package lfg;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesMoneyRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesNumberRangeFilter;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAirlineIcon;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$FlightSegment;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$NextConnection;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$SegmentsBreakdown;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.feature.travel.miles.impl.network.TravelMilesSearchService;
import com.youTransactor.uCube.rpc.Constants;
import hfg.l0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import xfg.d0;
import yfg.e;
import yfg.f;
import yfg.g;
import yfg.n;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Type f194884p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchService f194885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f194886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fd0.d f194887c;
    public final ue0.c d;
    public final w39.b e;
    public final hlm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f194888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f194889h;
    public final w4l.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4l.f f194890j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4l.f f194891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4l.f f194892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f194893n;
    public final w4l.f o;

    static {
        Type type = new TypeToken<yfg.p>() { // from class: com.revolut.feature.travel.miles.impl.data.repository.TravelMilesSearchRepositoryImpl$Companion$PREFILLED_LOCATIONS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f194884p = type;
    }

    public g0(TravelMilesSearchService service, ne0.j memoryCache, fd0.d searchResultsCache, ue0.c storage, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(searchResultsCache, "searchResultsCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f194885a = service;
        this.f194886b = memoryCache;
        this.f194887c = searchResultsCache;
        this.d = storage;
        this.e = locationInteractor;
        this.f = hlm.d.a();
        final int i = 0;
        final int i2 = 8;
        final int i3 = 17;
        this.f194888g = new w4l.f(new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i5 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i5, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i6 = iArr[i0Var.ordinal()];
                            if (i6 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i6 != 2 && i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i21 = iArr[i0Var.ordinal()];
                            if (i21 == 1 || i21 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 1), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i5 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i5, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i6 = iArr[i0Var.ordinal()];
                            if (i6 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i6 != 2 && i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i21 = iArr[i0Var.ordinal()];
                            if (i21 == 1 || i21 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 11), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i5 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i5, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i6 = iArr[i0Var.ordinal()];
                            if (i6 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i6 != 2 && i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i21 = iArr[i0Var.ordinal()];
                            if (i21 == 1 || i21 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i5 = 18;
        final int i6 = 20;
        this.f194889h = new w4l.f(new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i5) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i59 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i59, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i21 = iArr[i0Var.ordinal()];
                            if (i21 == 1 || i21 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 13), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i6) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i59 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i59, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i21 = iArr[i0Var.ordinal()];
                            if (i21 == 1 || i21 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i21 = 21;
        final int i22 = 6;
        final int i32 = 19;
        this.i = new w4l.f(new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i21) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i59 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i59, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 14), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i22) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i59 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i59, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 9), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i32) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i59 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i59, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i33 = 22;
        final int i43 = 23;
        final int i59 = 24;
        this.f194890j = new w4l.f(new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i33) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 17), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i43) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 18), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i59) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i66 = iArr[i0Var.ordinal()];
                            if (i66 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i66 != 2 && i66 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i66 = 25;
        Function2 function2 = new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i66) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar2 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        };
        y yVar = new y(this, 0);
        final int i74 = 1;
        Function2 function22 = new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i74) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar2 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar22 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        };
        final int i92 = 2;
        this.k = new w4l.f(function2, yVar, function22, new y(this, i92), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i92) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar2 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar22 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i96 = 3;
        Function2 function23 = new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i96) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar2 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar22 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        };
        y yVar2 = new y(this, i96);
        final int i99 = 4;
        Function2 function24 = new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i99) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar3 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        };
        y yVar3 = new y(this, i99);
        final int i100 = 5;
        this.f194891l = new w4l.f(function23, yVar2, function24, yVar3, new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i100) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i101 = 7;
        final int i102 = 9;
        final int i103 = 10;
        this.f194892m = new w4l.f(new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i101) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 5), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i102) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 6), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i103) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i104 = 11;
        final int i105 = 12;
        final int i106 = 13;
        this.f194893n = new w4l.f(new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i104) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 7), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i105) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 8), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i106) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i107 = 14;
        final int i108 = 15;
        final int i109 = 16;
        this.o = new w4l.f(new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i107) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 10), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i108) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, new y(this, 12), new Function2(this) { // from class: lfg.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f194925b;

            {
                this.f194925b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                String str;
                n.d dVar;
                d0.c cVar;
                xfg.g0 g0Var;
                xfg.f0 f0Var;
                switch (i109) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        g0 g0Var2 = this.f194925b;
                        ufm.i iVar = new ufm.i(g0Var2.b(), new le3.y(new y(g0Var2, 15), 14), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                        return iVar;
                    case 1:
                        String flightId = (String) obj2;
                        hfg.g0 flightDetails = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails, "flightDetails");
                        this.f194925b.f194886b.f("FLIGHT_DETAILS_MEMORY_KEY" + flightId, flightDetails);
                        return Unit.f186387a;
                    case 2:
                        String flightId2 = (String) obj2;
                        hfg.g0 flightDetails2 = (hfg.g0) obj3;
                        Intrinsics.checkNotNullParameter(flightId2, "flightId");
                        Intrinsics.checkNotNullParameter(flightDetails2, "flightDetails");
                        ue0.c cVar2 = this.f194925b.d;
                        String str2 = "FLIGHT_DETAILS_STORAGE_KEY" + flightId2;
                        Intrinsics.checkNotNullParameter(flightDetails2, "<this>");
                        hfg.d0 d0Var = flightDetails2.f151839a;
                        String str3 = d0Var.f151815a;
                        ArrayList arrayList = d0Var.f151816b;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (true) {
                            String str4 = null;
                            if (!it9.hasNext()) {
                                String string = d0Var.f151817c.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                String string2 = d0Var.d.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                String str5 = d0Var.e;
                                String str6 = d0Var.f;
                                long minutes = d0Var.f151818g.toMinutes();
                                double d = d0Var.f151819h;
                                jo3.b bVarA = hx7.a.A(d0Var.i);
                                int i592 = d0Var.f151820j;
                                String str7 = flightDetails2.f151840b;
                                TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = flightDetails2.f151841c;
                                String string3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a.toString();
                                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                                ArrayList arrayList3 = travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b;
                                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) it10.next();
                                    String str8 = travelMilesSearchFlightDetails$FlightSegment.f94128a;
                                    Iterator it11 = it10;
                                    String str9 = travelMilesSearchFlightDetails$FlightSegment.f94129b;
                                    String str10 = travelMilesSearchFlightDetails$FlightSegment.f94130c;
                                    String str11 = travelMilesSearchFlightDetails$FlightSegment.d;
                                    String str12 = travelMilesSearchFlightDetails$FlightSegment.e;
                                    TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = travelMilesSearchFlightDetails$FlightSegment.f;
                                    TravelMilesSearchAirlineIcon.Remote remote = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon : null;
                                    String str13 = remote != null ? remote.f94124a : null;
                                    TravelMilesSearchAirlineIcon.Local local = travelMilesSearchAirlineIcon instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon : null;
                                    String str14 = local != null ? local.f94123a : null;
                                    String string4 = travelMilesSearchFlightDetails$FlightSegment.f94131g.toString();
                                    Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                                    String string5 = travelMilesSearchFlightDetails$FlightSegment.f94132h.toString();
                                    Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                                    Duration duration = travelMilesSearchFlightDetails$FlightSegment.i;
                                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                                    String str15 = travelMilesSearchFlightDetails$FlightSegment.f94133j;
                                    String str16 = travelMilesSearchFlightDetails$FlightSegment.k;
                                    String str17 = travelMilesSearchFlightDetails$FlightSegment.f94134l;
                                    String str18 = travelMilesSearchFlightDetails$FlightSegment.f94135m;
                                    TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = travelMilesSearchFlightDetails$FlightSegment.f94136n;
                                    if (travelMilesSearchFlightDetails$NextConnection != null) {
                                        str = string5;
                                        dVar = new n.d(travelMilesSearchFlightDetails$NextConnection.f94137a, travelMilesSearchFlightDetails$NextConnection.f94138b);
                                    } else {
                                        str = string5;
                                        dVar = null;
                                    }
                                    arrayList4.add(new n.c(str8, str9, str10, str11, str12, str13, str14, string4, str, lValueOf, str15, str16, str17, str18, dVar));
                                    it10 = it11;
                                }
                                n.e eVar = new n.e(string3, arrayList4);
                                ArrayList arrayList5 = flightDetails2.d;
                                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                                for (Iterator it12 = arrayList5.iterator(); it12.hasNext(); it12 = it12) {
                                    hfg.f0 f0Var2 = (hfg.f0) it12.next();
                                    arrayList6.add(new n.b(f0Var2.f151833a.name(), f0Var2.f151834b, f0Var2.f151835c, hx7.a.A(f0Var2.d), f0Var2.e));
                                    eVar = eVar;
                                }
                                cVar2.G(new yfg.n(str3, arrayList2, string, string2, str5, str6, minutes, d, bVarA, i592, str7, eVar, arrayList6, flightDetails2.e, flightDetails2.f, flightDetails2.f151842g, flightDetails2.f151843h), str2, wim.z.d(o0.b(yfg.n.class)));
                                return Unit.f186387a;
                            }
                            hfg.c0 c0Var = (hfg.c0) it9.next();
                            String str19 = c0Var.f151809a;
                            TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon2 = c0Var.f151810b;
                            TravelMilesSearchAirlineIcon.Remote remote2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Remote ? (TravelMilesSearchAirlineIcon.Remote) travelMilesSearchAirlineIcon2 : null;
                            String str20 = remote2 != null ? remote2.f94124a : null;
                            TravelMilesSearchAirlineIcon.Local local2 = travelMilesSearchAirlineIcon2 instanceof TravelMilesSearchAirlineIcon.Local ? (TravelMilesSearchAirlineIcon.Local) travelMilesSearchAirlineIcon2 : null;
                            if (local2 != null) {
                                str4 = local2.f94123a;
                            }
                            arrayList2.add(new n.a(str19, str20, str4, c0Var.f151811c));
                        }
                        break;
                    case 3:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        Unit it13 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it13, "it");
                        efm.d0<xfg.g> availableAirlines = this.f194925b.f194885a.getAvailableAirlines();
                        le3.y yVar22 = new le3.y(new z(6), 22);
                        availableAirlines.getClass();
                        ufm.i iVar2 = new ufm.i(availableAirlines, yVar22, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        hfg.f airlines = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines, "airlines");
                        this.f194925b.f194886b.f("AVAILABLE_AIRLINES_MEMORY_KEY", airlines);
                        return Unit.f186387a;
                    case 5:
                        hfg.f airlines2 = (hfg.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(airlines2, "airlines");
                        ue0.c cVar3 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(airlines2, "<this>");
                        ArrayList<hfg.g> arrayList7 = airlines2.f151831a;
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                        for (hfg.g gVar : arrayList7) {
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            arrayList8.add(new yfg.b(gVar.f151836a, gVar.f151837b, gVar.f151838c));
                        }
                        ArrayList<hfg.g> arrayList9 = airlines2.f151832b;
                        ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, 10));
                        for (hfg.g gVar2 : arrayList9) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            arrayList10.add(new yfg.b(gVar2.f151836a, gVar2.f151837b, gVar2.f151838c));
                        }
                        cVar3.G(new yfg.a(arrayList8, arrayList10), "AVAILABLE_AIRLINES_STORAGE_KEY", wim.z.d(o0.b(yfg.a.class)));
                        return Unit.f186387a;
                    case 6:
                        List topDestinations = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations, "topDestinations");
                        this.f194925b.f194886b.f("TOP_DESTINATIONS_MEM_KEY", topDestinations);
                        return Unit.f186387a;
                    case 7:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<xfg.m> flightsFilters = this.f194925b.f194885a.getFlightsFilters();
                        le3.y yVar222 = new le3.y(new z(4), 20);
                        flightsFilters.getClass();
                        ufm.i iVar3 = new ufm.i(flightsFilters, yVar222, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 8:
                        hfg.r suggestions = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                        this.f194925b.f194886b.f("SEARCH_SUGGESTIONS_MEMORY_KEY", suggestions);
                        return Unit.f186387a;
                    case 9:
                        hfg.j filters = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters, "filters");
                        this.f194925b.f194886b.f("FLIGHT_FILTERS_MEMORY_KEY", filters);
                        return Unit.f186387a;
                    case 10:
                        hfg.j filters2 = (hfg.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(filters2, "filters");
                        ue0.c cVar4 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(filters2, "<this>");
                        ArrayList arrayList11 = filters2.f151850a;
                        ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                        Iterator it15 = arrayList11.iterator();
                        while (it15.hasNext()) {
                            arrayList12.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it15.next()));
                        }
                        ArrayList arrayList13 = filters2.f151851b;
                        ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                        Iterator it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            arrayList14.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it16.next()));
                        }
                        TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = filters2.f151852c;
                        Intrinsics.checkNotNullParameter(travelMilesNumberRangeFilter, "<this>");
                        yfg.k kVar = new yfg.k(travelMilesNumberRangeFilter.f94101a, travelMilesNumberRangeFilter.f94102b);
                        TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = filters2.d;
                        Intrinsics.checkNotNullParameter(travelMilesMoneyRangeFilter, "<this>");
                        yfg.j jVar = new yfg.j(hx7.a.A(travelMilesMoneyRangeFilter.f94099a), hx7.a.A(travelMilesMoneyRangeFilter.f94100b));
                        ArrayList arrayList15 = filters2.e;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        Iterator it17 = arrayList15.iterator();
                        while (it17.hasNext()) {
                            arrayList16.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it17.next()));
                        }
                        ArrayList arrayList17 = filters2.f;
                        ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                        Iterator it18 = arrayList17.iterator();
                        while (it18.hasNext()) {
                            arrayList18.add(kfg.b.c((TravelMilesFlightFilters$FilterOption) it18.next()));
                        }
                        cVar4.G(new yfg.d(arrayList12, arrayList14, kVar, jVar, arrayList16, arrayList18), "FLIGHT_FILTERS_STORAGE_KEY", wim.z.d(o0.b(yfg.d.class)));
                        return Unit.f186387a;
                    case 11:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        hfg.i request = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.k> flightAvailability = this.f194925b.f194885a.getFlightAvailability(kfg.a.c(request));
                        le3.y yVar32 = new le3.y(new z(0), 15);
                        flightAvailability.getClass();
                        ufm.i iVar4 = new ufm.i(flightAvailability, yVar32, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                        return iVar4;
                    case 12:
                        hfg.i request2 = (hfg.i) obj2;
                        hfg.h availability = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(availability, "availability");
                        this.f194925b.f194886b.f("FLIGHT_AVAILABILITY_MEMORY_KEY" + g0.c(request2), availability);
                        return Unit.f186387a;
                    case 13:
                        hfg.i request3 = (hfg.i) obj2;
                        hfg.h availability2 = (hfg.h) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(availability2, "availability");
                        this.f194925b.d.G(kfg.a.d(availability2), j6.a.q("FLIGHT_AVAILABILITY_STORAGE_KEY", g0.c(request3)), wim.z.d(o0.b(yfg.c.class)));
                        return Unit.f186387a;
                    case 14:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        hfg.i request4 = (hfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request4, "request");
                        efm.d0<xfg.q> flightSuggestions = this.f194925b.f194885a.getFlightSuggestions(kfg.a.c(request4));
                        le3.y yVar4 = new le3.y(new z(3), 18);
                        flightSuggestions.getClass();
                        ufm.i iVar5 = new ufm.i(flightSuggestions, yVar4, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
                        return iVar5;
                    case 15:
                        hfg.i request5 = (hfg.i) obj2;
                        hfg.t suggestions2 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request5, "request");
                        Intrinsics.checkNotNullParameter(suggestions2, "suggestions");
                        this.f194925b.f194886b.f("FLIGHT_SUGGESTIONS_MEMORY_KEY" + g0.c(request5), suggestions2);
                        return Unit.f186387a;
                    case 16:
                        hfg.i request6 = (hfg.i) obj2;
                        hfg.t suggestions3 = (hfg.t) obj3;
                        Intrinsics.checkNotNullParameter(request6, "request");
                        Intrinsics.checkNotNullParameter(suggestions3, "suggestions");
                        ue0.c cVar5 = this.f194925b.d;
                        String str21 = "FLIGHT_SUGGESTIONS_STORAGE_KEY" + g0.c(request6);
                        Intrinsics.checkNotNullParameter(suggestions3, "<this>");
                        yfg.c cVarD = kfg.a.d(suggestions3.f151889a);
                        ArrayList arrayListA = kfg.f.a(suggestions3.f151890b);
                        ArrayList<hfg.s> arrayList19 = suggestions3.f151891c;
                        ArrayList arrayList20 = new ArrayList(zhm.w.t(arrayList19, 10));
                        for (hfg.s sVar : arrayList19) {
                            arrayList20.add(new g.a(sVar.f151886a, sVar.f151887b, sVar.f151888c, sVar.d));
                        }
                        cVar5.G(new yfg.g(cVarD, arrayListA, arrayList20), str21, wim.z.d(o0.b(yfg.g.class)));
                        return Unit.f186387a;
                    case 17:
                        hfg.r suggestions4 = (hfg.r) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(suggestions4, "suggestions");
                        ue0.c cVar6 = this.f194925b.d;
                        Intrinsics.checkNotNullParameter(suggestions4, "<this>");
                        String str22 = suggestions4.f151884a;
                        ArrayList<hfg.q> arrayList21 = suggestions4.f151885b;
                        ArrayList arrayList22 = new ArrayList(zhm.w.t(arrayList21, 10));
                        for (hfg.q qVar : arrayList21) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            arrayList22.add(new f.a(qVar.f151881a, qVar.f151882b, qVar.f151883c));
                        }
                        cVar6.G(new yfg.f(str22, arrayList22), "SEARCH_SUGGESTIONS_STORAGE_KEY", wim.z.d(o0.b(yfg.f.class)));
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        TravelMilesSearchService travelMilesSearchService = this.f194925b.f194885a;
                        boolean z = params.f194864a;
                        hfg.j0 j0Var = params.f194865b;
                        Intrinsics.checkNotNullParameter(j0Var, "<this>");
                        d0.b bVarC = kfg.d.c(j0Var.f151853a);
                        d0.b bVarC2 = kfg.d.c(j0Var.f151854b);
                        String string6 = j0Var.f151855c.toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        String str23 = j0Var.d;
                        hfg.i0 i0Var = j0Var.e;
                        if (i0Var != null) {
                            int[] iArr = kfg.c.f183358a;
                            int i662 = iArr[i0Var.ordinal()];
                            if (i662 == 1) {
                                g0Var = xfg.g0.PRICE;
                            } else {
                                if (i662 != 2 && i662 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                g0Var = xfg.g0.DEPARTURE;
                            }
                            int i212 = iArr[i0Var.ordinal()];
                            if (i212 == 1 || i212 == 2) {
                                f0Var = xfg.f0.ASC;
                            } else {
                                if (i212 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f0Var = xfg.f0.DESC;
                            }
                            cVar = new d0.c(g0Var, f0Var);
                        } else {
                            cVar = null;
                        }
                        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = j0Var.f;
                        efm.d0<xfg.h0> searchResults = travelMilesSearchService.getSearchResults(z, new xfg.d0(bVarC, bVarC2, string6, 20, str23, cVar, travelMilesSearchAppliedFilters != null ? kfg.d.b(travelMilesSearchAppliedFilters) : null));
                        le3.y yVar5 = new le3.y(new z(2), 17);
                        searchResults.getClass();
                        ufm.i iVar6 = new ufm.i(searchResults, yVar5, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                        return iVar6;
                    case 19:
                        List topDestinations2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(topDestinations2, "topDestinations");
                        this.f194925b.d.G(kfg.f.a(topDestinations2), "TOP_DESTINATIONS_STORAGE_KEY", kii.e.o(yfg.q.class, KTypeProjection.INSTANCE, List.class));
                        return Unit.f186387a;
                    case 20:
                        b0 params2 = (b0) obj2;
                        l0 searchResults2 = (l0) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(searchResults2, "searchResults");
                        if (params2.f194865b.d == null) {
                            this.f194925b.f194887c.d(params2, searchResults2);
                        }
                        return Unit.f186387a;
                    case 21:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it19 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it19, "it");
                        g0 g0Var3 = this.f194925b;
                        ufm.i iVar7 = new ufm.i(g0Var3.b(), new le3.y(new y(g0Var3, 16), 19), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                        return iVar7;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        vfg.i params3 = (vfg.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params3, "params");
                        efm.d0<xfg.o> airports = this.f194925b.f194885a.getAirports(params3.f288623b, 20, params3.f288622a);
                        le3.y yVar6 = new le3.y(new z(1), 16);
                        airports.getClass();
                        ufm.i iVar8 = new ufm.i(airports, yVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                        return iVar8;
                    case 23:
                        vfg.i params4 = (vfg.i) obj2;
                        hfg.p citiesWithAirports = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports, "citiesWithAirports");
                        this.f194925b.f194886b.f(g0.d(params4), citiesWithAirports);
                        return Unit.f186387a;
                    case 24:
                        vfg.i params5 = (vfg.i) obj2;
                        hfg.p citiesWithAirports2 = (hfg.p) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "citiesWithAirports");
                        ue0.c cVar7 = this.f194925b.d;
                        String strE = g0.e(params5);
                        Intrinsics.checkNotNullParameter(citiesWithAirports2, "<this>");
                        ArrayList<hfg.o> arrayList23 = citiesWithAirports2.f151880a;
                        ArrayList arrayList24 = new ArrayList(zhm.w.t(arrayList23, 10));
                        for (hfg.o oVar : arrayList23) {
                            Intrinsics.checkNotNullParameter(oVar, "<this>");
                            String str24 = oVar.f151874a;
                            String str25 = oVar.f151875b;
                            String str26 = oVar.f151876c;
                            ArrayList<hfg.n> arrayList25 = oVar.d;
                            ArrayList arrayList26 = new ArrayList(zhm.w.t(arrayList25, 10));
                            for (hfg.n nVar : arrayList25) {
                                Intrinsics.checkNotNullParameter(nVar, "<this>");
                                arrayList26.add(new e.a(nVar.f151868a));
                            }
                            arrayList24.add(new e.b(str24, str25, str26, arrayList26));
                        }
                        cVar7.G(new yfg.e(arrayList24), strE, wim.z.d(o0.b(yfg.e.class)));
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        String flightId3 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(flightId3, "flightId");
                        efm.d0<xfg.b0> flightDetails3 = this.f194925b.f194885a.getFlightDetails(flightId3);
                        le3.y yVar7 = new le3.y(new z(5), 21);
                        flightDetails3.getClass();
                        ufm.i iVar9 = new ufm.i(flightDetails3, yVar7, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                        return iVar9;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(lfg.g0 r5, int r6, long r7, lai.d r9, gim.c r10) throws java.lang.Exception {
        /*
            boolean r0 = r10 instanceof lfg.f0
            if (r0 == 0) goto L13
            r0 = r10
            lfg.f0 r0 = (lfg.f0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            lfg.f0 r0 = new lfg.f0
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r5 = r0.f194881y
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            int r1 = r0.A
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L37
            int r6 = r0.v
            long r7 = r0.f194879w
            int r9 = r0.u
            kotlin.jvm.functions.Function1 r1 = r0.f194880x
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            yhm.o.b(r5)
        L33:
            r5 = r6
            r6 = r9
            r9 = r1
            goto L53
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            int r6 = r0.v
            long r7 = r0.f194879w
            int r9 = r0.u
            kotlin.jvm.functions.Function1 r1 = r0.f194880x
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L4d
            return r5
        L4d:
            r5 = move-exception
            goto L6f
        L4f:
            yhm.o.b(r5)
            r5 = 0
        L53:
            r1 = r9
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch: java.lang.Exception -> L69
            r0.f194880x = r1     // Catch: java.lang.Exception -> L69
            r0.u = r6     // Catch: java.lang.Exception -> L69
            r0.f194879w = r7     // Catch: java.lang.Exception -> L69
            r0.v = r5     // Catch: java.lang.Exception -> L69
            r0.A = r3     // Catch: java.lang.Exception -> L69
            java.lang.Object r5 = r9.invoke(r0)     // Catch: java.lang.Exception -> L69
            if (r5 != r10) goto L67
            goto L85
        L67:
            r10 = r5
            goto L85
        L69:
            r1 = move-exception
            r4 = r6
            r6 = r5
            r5 = r1
            r1 = r9
            r9 = r4
        L6f:
            int r6 = r6 + r3
            if (r6 >= r9) goto L86
            r5 = r1
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r0.f194880x = r5
            r0.u = r9
            r0.f194879w = r7
            r0.v = r6
            r0.A = r2
            java.lang.Object r5 = skm.k0.b(r7, r0)
            if (r5 != r10) goto L33
        L85:
            return r10
        L86:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lfg.g0.a(lfg.g0, int, long, lai.d, gim.c):java.lang.Object");
    }

    public static String c(hfg.i iVar) throws IOException {
        String str;
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = iVar.d;
        String strI = null;
        if (travelMilesSearchAppliedFilters != null) {
            Set set = travelMilesSearchAppliedFilters.f94125a;
            Set set2 = travelMilesSearchAppliedFilters.f94126b;
            TravelMilesNumberRangeFilter travelMilesNumberRangeFilter = travelMilesSearchAppliedFilters.f94127c;
            TravelMilesMoneyRangeFilter travelMilesMoneyRangeFilter = travelMilesSearchAppliedFilters.d;
            Set set3 = travelMilesSearchAppliedFilters.e;
            Set set4 = travelMilesSearchAppliedFilters.f;
            if (travelMilesNumberRangeFilter != null) {
                str = "min=" + travelMilesNumberRangeFilter.f94101a + ",max=" + travelMilesNumberRangeFilter.f94102b;
            } else {
                str = null;
            }
            if (travelMilesMoneyRangeFilter != null) {
                dj0.d dVar = travelMilesMoneyRangeFilter.f94099a;
                long j2 = dVar.f115082a;
                String str2 = dVar.f115083b.f306286a;
                dj0.d dVar2 = travelMilesMoneyRangeFilter.f94100b;
                strI = "minAmount=" + j2 + ",minCurrency=" + str2 + ",maxAmount=" + dVar2.f115082a + ",maxCurrency=" + dVar2.f115083b.f306286a;
            }
            String strK0 = zhm.d0.k0(set, null, null, null, 0, null, 63);
            String strK02 = zhm.d0.k0(set2, null, null, null, 0, null, 63);
            String strK03 = zhm.d0.k0(set3, null, null, null, 0, null, 63);
            String strK04 = zhm.d0.k0(set4, null, null, null, 0, null, 63);
            StringBuilder sbT = p.a.t(strK0, "_", strK02, "_", str);
            j6.a.D(sbT, "_", strI, "_", strK03);
            strI = v0.a.i(sbT, "_", strK04);
        }
        TravelMilesSearchLocation travelMilesSearchLocation = iVar.f151847a;
        TravelMilesSearchLocation travelMilesSearchLocation2 = iVar.f151848b;
        LocalDate localDate = iVar.f151849c;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(travelMilesSearchLocation);
        sb6.append("_");
        sb6.append(travelMilesSearchLocation2);
        sb6.append("_");
        sb6.append(localDate);
        return v0.a.i(sb6, "_", strI);
    }

    public static String d(vfg.i iVar) {
        return v1.c.t(iVar.f288622a, "AIRPORTS_MEMORY_KEY", iVar.f288623b, "_20_");
    }

    public static String e(vfg.i iVar) {
        return v1.c.t(iVar.f288622a, "AIRPORTS_STORAGE_KEY", iVar.f288623b, "_20_");
    }

    public final pfm.z b() {
        rfm.m mVar = new rfm.m(((z39.b) this.e).f319221b.c(), new le3.y(new z(8), 24), 1);
        od0.i.Companion.getClass();
        rfm.f0 f0VarP = mVar.p(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        return ue0.e.I(f0VarP, zhm.h0.f322473a, new z(9));
    }
}
