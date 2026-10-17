package lfg;

import com.revolut.feature.travel.miles.impl.network.TravelMilesRecommendedFlightsService;
import ip0.v7;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesRecommendedFlightsService f194921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f194922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f194923c;
    public final w4l.f d;

    public w(TravelMilesRecommendedFlightsService service, ne0.j memoryCache, ue0.c revPointsStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(revPointsStorage, "revPointsStorage");
        this.f194921a = service;
        this.f194922b = memoryCache;
        this.f194923c = revPointsStorage;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: lfg.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f194918b;

            {
                this.f194918b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hfg.a0 request = (hfg.a0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.y> recommendedFlights = this.f194918b.f194921a.getRecommendedFlights(request.f151803a, request.f151804b, request.f151805c);
                        le3.y yVar = new le3.y(new le3.b(29), 13);
                        recommendedFlights.getClass();
                        ufm.i iVar = new ufm.i(recommendedFlights, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        hfg.a0 request2 = (hfg.a0) obj2;
                        hfg.z flights = (hfg.z) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(flights, "flights");
                        ne0.j jVar = this.f194918b.f194922b;
                        w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(request2, "<this>");
                        jVar.f("RECOMMENDED_FLIGHTS_MEM_KEY_" + v.a(request2), flights);
                        break;
                    default:
                        hfg.a0 request3 = (hfg.a0) obj2;
                        hfg.z flights2 = (hfg.z) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(flights2, "flights");
                        ue0.c cVar = this.f194918b.f194923c;
                        w.Companion.getClass();
                        String str = "<this>";
                        Intrinsics.checkNotNullParameter(request3, "<this>");
                        String str2 = "RECOMMENDED_FLIGHTS_STORAGE_KEY_" + v.a(request3);
                        Intrinsics.checkNotNullParameter(flights2, "<this>");
                        String str3 = flights2.f151905a;
                        String str4 = flights2.f151906b;
                        String str5 = flights2.f151907c;
                        String str6 = flights2.d;
                        String str7 = flights2.e;
                        String str8 = flights2.f;
                        String str9 = flights2.f151908g;
                        ArrayList arrayList = flights2.f151909h;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            hfg.y yVar2 = (hfg.y) it8.next();
                            Intrinsics.checkNotNullParameter(yVar2, str);
                            String str10 = yVar2.f151898a;
                            Iterator it9 = it8;
                            String str11 = yVar2.f151899b;
                            String str12 = yVar2.f151900c;
                            String str13 = yVar2.d;
                            String string = yVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = yVar2.f.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new yfg.l(str10, str11, str12, str13, string, string2, yVar2.f151901g.toMinutes(), yVar2.f151902h, yVar2.i, yVar2.f151903j, hx7.a.A(yVar2.k), yVar2.f151904l));
                            it8 = it9;
                            str = str;
                            str3 = str3;
                            str4 = str4;
                        }
                        cVar.G(new yfg.m(str3, str4, str5, str6, str7, str8, str9, arrayList2), str2, wim.z.d(o0.b(yfg.m.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1 = new Function1(this) { // from class: lfg.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f194920b;

            {
                this.f194920b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        hfg.a0 request = (hfg.a0) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ne0.j jVar = this.f194920b.f194922b;
                        w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(request, "<this>");
                        return (hfg.z) v7.r("RECOMMENDED_FLIGHTS_MEM_KEY_", v.a(request), jVar);
                    default:
                        hfg.a0 request2 = (hfg.a0) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        ue0.c cVar = this.f194920b.f194923c;
                        w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(request2, "<this>");
                        yfg.m mVar = (yfg.m) j6.a.k(yfg.m.class, cVar, j6.a.q("RECOMMENDED_FLIGHTS_STORAGE_KEY_", v.a(request2)));
                        if (mVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        String departureCity = mVar.getDepartureCity();
                        String arrivalCity = mVar.getArrivalCity();
                        String departureIataCode = mVar.getDepartureIataCode();
                        String arrivalIataCode = mVar.getArrivalIataCode();
                        String provider = mVar.getProvider();
                        String flightImageUrl = mVar.getFlightImageUrl();
                        String ctaText = mVar.getCtaText();
                        List flights = mVar.getFlights();
                        ArrayList arrayList = new ArrayList(zhm.w.t(flights, 10));
                        Iterator it8 = flights.iterator();
                        while (it8.hasNext()) {
                            yfg.l lVar = (yfg.l) it8.next();
                            Intrinsics.checkNotNullParameter(lVar, "<this>");
                            String flightId = lVar.getFlightId();
                            String airlineName = lVar.getAirlineName();
                            String airlineRef = lVar.getAirlineRef();
                            String airlineIconUrl = lVar.getAirlineIconUrl();
                            LocalDateTime localDateTime = LocalDateTime.parse(lVar.getDepartsAt());
                            Iterator it9 = it8;
                            Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
                            LocalDateTime localDateTime2 = LocalDateTime.parse(lVar.getArrivesAt());
                            Intrinsics.checkNotNullExpressionValue(localDateTime2, "parse(...)");
                            Duration durationOfMinutes = Duration.ofMinutes(lVar.getTotalDuration());
                            Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
                            arrayList.add(new hfg.y(flightId, airlineName, airlineRef, airlineIconUrl, localDateTime, localDateTime2, durationOfMinutes, lVar.getBookingUrl(), lVar.getFlightClass(), lVar.getRevpointsCost(), hx7.a.v(lVar.getTaxesCost()), lVar.getNumberOfSegments()));
                            it8 = it9;
                        }
                        return new hfg.z(departureCity, arrivalCity, departureIataCode, arrivalIataCode, provider, flightImageUrl, ctaText, arrayList);
                }
            }
        };
        final int i2 = 1;
        Function2 function22 = new Function2(this) { // from class: lfg.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f194918b;

            {
                this.f194918b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hfg.a0 request = (hfg.a0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.y> recommendedFlights = this.f194918b.f194921a.getRecommendedFlights(request.f151803a, request.f151804b, request.f151805c);
                        le3.y yVar = new le3.y(new le3.b(29), 13);
                        recommendedFlights.getClass();
                        ufm.i iVar = new ufm.i(recommendedFlights, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        hfg.a0 request2 = (hfg.a0) obj2;
                        hfg.z flights = (hfg.z) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(flights, "flights");
                        ne0.j jVar = this.f194918b.f194922b;
                        w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(request2, "<this>");
                        jVar.f("RECOMMENDED_FLIGHTS_MEM_KEY_" + v.a(request2), flights);
                        break;
                    default:
                        hfg.a0 request3 = (hfg.a0) obj2;
                        hfg.z flights2 = (hfg.z) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(flights2, "flights");
                        ue0.c cVar = this.f194918b.f194923c;
                        w.Companion.getClass();
                        String str = "<this>";
                        Intrinsics.checkNotNullParameter(request3, "<this>");
                        String str2 = "RECOMMENDED_FLIGHTS_STORAGE_KEY_" + v.a(request3);
                        Intrinsics.checkNotNullParameter(flights2, "<this>");
                        String str3 = flights2.f151905a;
                        String str4 = flights2.f151906b;
                        String str5 = flights2.f151907c;
                        String str6 = flights2.d;
                        String str7 = flights2.e;
                        String str8 = flights2.f;
                        String str9 = flights2.f151908g;
                        ArrayList arrayList = flights2.f151909h;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            hfg.y yVar2 = (hfg.y) it8.next();
                            Intrinsics.checkNotNullParameter(yVar2, str);
                            String str10 = yVar2.f151898a;
                            Iterator it9 = it8;
                            String str11 = yVar2.f151899b;
                            String str12 = yVar2.f151900c;
                            String str13 = yVar2.d;
                            String string = yVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = yVar2.f.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new yfg.l(str10, str11, str12, str13, string, string2, yVar2.f151901g.toMinutes(), yVar2.f151902h, yVar2.i, yVar2.f151903j, hx7.a.A(yVar2.k), yVar2.f151904l));
                            it8 = it9;
                            str = str;
                            str3 = str3;
                            str4 = str4;
                        }
                        cVar.G(new yfg.m(str3, str4, str5, str6, str7, str8, str9, arrayList2), str2, wim.z.d(o0.b(yfg.m.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: lfg.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f194920b;

            {
                this.f194920b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        hfg.a0 request = (hfg.a0) obj2;
                        Intrinsics.checkNotNullParameter(request, "request");
                        ne0.j jVar = this.f194920b.f194922b;
                        w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(request, "<this>");
                        return (hfg.z) v7.r("RECOMMENDED_FLIGHTS_MEM_KEY_", v.a(request), jVar);
                    default:
                        hfg.a0 request2 = (hfg.a0) obj2;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        ue0.c cVar = this.f194920b.f194923c;
                        w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(request2, "<this>");
                        yfg.m mVar = (yfg.m) j6.a.k(yfg.m.class, cVar, j6.a.q("RECOMMENDED_FLIGHTS_STORAGE_KEY_", v.a(request2)));
                        if (mVar == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        String departureCity = mVar.getDepartureCity();
                        String arrivalCity = mVar.getArrivalCity();
                        String departureIataCode = mVar.getDepartureIataCode();
                        String arrivalIataCode = mVar.getArrivalIataCode();
                        String provider = mVar.getProvider();
                        String flightImageUrl = mVar.getFlightImageUrl();
                        String ctaText = mVar.getCtaText();
                        List flights = mVar.getFlights();
                        ArrayList arrayList = new ArrayList(zhm.w.t(flights, 10));
                        Iterator it8 = flights.iterator();
                        while (it8.hasNext()) {
                            yfg.l lVar = (yfg.l) it8.next();
                            Intrinsics.checkNotNullParameter(lVar, "<this>");
                            String flightId = lVar.getFlightId();
                            String airlineName = lVar.getAirlineName();
                            String airlineRef = lVar.getAirlineRef();
                            String airlineIconUrl = lVar.getAirlineIconUrl();
                            LocalDateTime localDateTime = LocalDateTime.parse(lVar.getDepartsAt());
                            Iterator it9 = it8;
                            Intrinsics.checkNotNullExpressionValue(localDateTime, "parse(...)");
                            LocalDateTime localDateTime2 = LocalDateTime.parse(lVar.getArrivesAt());
                            Intrinsics.checkNotNullExpressionValue(localDateTime2, "parse(...)");
                            Duration durationOfMinutes = Duration.ofMinutes(lVar.getTotalDuration());
                            Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
                            arrayList.add(new hfg.y(flightId, airlineName, airlineRef, airlineIconUrl, localDateTime, localDateTime2, durationOfMinutes, lVar.getBookingUrl(), lVar.getFlightClass(), lVar.getRevpointsCost(), hx7.a.v(lVar.getTaxesCost()), lVar.getNumberOfSegments()));
                            it8 = it9;
                        }
                        return new hfg.z(departureCity, arrivalCity, departureIataCode, arrivalIataCode, provider, flightImageUrl, ctaText, arrayList);
                }
            }
        };
        final int i3 = 2;
        this.d = new w4l.f(function2, function1, function22, function12, new Function2(this) { // from class: lfg.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f194918b;

            {
                this.f194918b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        hfg.a0 request = (hfg.a0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(request, "request");
                        efm.d0<xfg.y> recommendedFlights = this.f194918b.f194921a.getRecommendedFlights(request.f151803a, request.f151804b, request.f151805c);
                        le3.y yVar = new le3.y(new le3.b(29), 13);
                        recommendedFlights.getClass();
                        ufm.i iVar = new ufm.i(recommendedFlights, yVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        break;
                    case 1:
                        hfg.a0 request2 = (hfg.a0) obj2;
                        hfg.z flights = (hfg.z) obj3;
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(flights, "flights");
                        ne0.j jVar = this.f194918b.f194922b;
                        w.Companion.getClass();
                        Intrinsics.checkNotNullParameter(request2, "<this>");
                        jVar.f("RECOMMENDED_FLIGHTS_MEM_KEY_" + v.a(request2), flights);
                        break;
                    default:
                        hfg.a0 request3 = (hfg.a0) obj2;
                        hfg.z flights2 = (hfg.z) obj3;
                        Intrinsics.checkNotNullParameter(request3, "request");
                        Intrinsics.checkNotNullParameter(flights2, "flights");
                        ue0.c cVar = this.f194918b.f194923c;
                        w.Companion.getClass();
                        String str = "<this>";
                        Intrinsics.checkNotNullParameter(request3, "<this>");
                        String str2 = "RECOMMENDED_FLIGHTS_STORAGE_KEY_" + v.a(request3);
                        Intrinsics.checkNotNullParameter(flights2, "<this>");
                        String str3 = flights2.f151905a;
                        String str4 = flights2.f151906b;
                        String str5 = flights2.f151907c;
                        String str6 = flights2.d;
                        String str7 = flights2.e;
                        String str8 = flights2.f;
                        String str9 = flights2.f151908g;
                        ArrayList arrayList = flights2.f151909h;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            hfg.y yVar2 = (hfg.y) it8.next();
                            Intrinsics.checkNotNullParameter(yVar2, str);
                            String str10 = yVar2.f151898a;
                            Iterator it9 = it8;
                            String str11 = yVar2.f151899b;
                            String str12 = yVar2.f151900c;
                            String str13 = yVar2.d;
                            String string = yVar2.e.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            String string2 = yVar2.f.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            arrayList2.add(new yfg.l(str10, str11, str12, str13, string, string2, yVar2.f151901g.toMinutes(), yVar2.f151902h, yVar2.i, yVar2.f151903j, hx7.a.A(yVar2.k), yVar2.f151904l));
                            it8 = it9;
                            str = str;
                            str3 = str3;
                            str4 = str4;
                        }
                        cVar.G(new yfg.m(str3, str4, str5, str6, str7, str8, str9, arrayList2), str2, wim.z.d(o0.b(yfg.m.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
