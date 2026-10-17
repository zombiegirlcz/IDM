package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results;

import cli.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import hfg.i0;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import lk0.g;
import nhg.s;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f94322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f94323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f94324c;
    public final g d;
    public final i0 e;
    public final TravelMilesSearchAppliedFilters f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f94325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f94326h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f94327j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f94328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnalyticsContext f94329m;

    public b(TravelMilesSearchLocation origin, TravelMilesSearchLocation destination, LocalDate date, g gVar, i0 sortBy, TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters, s searchInputState, a liveSearchState, boolean z, Data flightsAvailability, Data flightSuggestions, boolean z3, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(searchInputState, "searchInputState");
        Intrinsics.checkNotNullParameter(liveSearchState, "liveSearchState");
        Intrinsics.checkNotNullParameter(flightsAvailability, "flightsAvailability");
        Intrinsics.checkNotNullParameter(flightSuggestions, "flightSuggestions");
        this.f94322a = origin;
        this.f94323b = destination;
        this.f94324c = date;
        this.d = gVar;
        this.e = sortBy;
        this.f = travelMilesSearchAppliedFilters;
        this.f94325g = searchInputState;
        this.f94326h = liveSearchState;
        this.i = z;
        this.f94327j = flightsAvailability;
        this.k = flightSuggestions;
        this.f94328l = z3;
        this.f94329m = analyticsContext;
    }

    public static b a(b bVar, TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2, LocalDate localDate, g gVar, i0 i0Var, TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters, s sVar, a aVar, boolean z, Data data, Data data2, boolean z3, AnalyticsContext analyticsContext, int i) {
        if ((i & 1) != 0) {
            travelMilesSearchLocation = bVar.f94322a;
        }
        TravelMilesSearchLocation origin = travelMilesSearchLocation;
        TravelMilesSearchLocation destination = (i & 2) != 0 ? bVar.f94323b : travelMilesSearchLocation2;
        LocalDate date = (i & 4) != 0 ? bVar.f94324c : localDate;
        g gVar2 = (i & 8) != 0 ? bVar.d : gVar;
        i0 sortBy = (i & 16) != 0 ? bVar.e : i0Var;
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters2 = (i & 32) != 0 ? bVar.f : travelMilesSearchAppliedFilters;
        s searchInputState = (i & 64) != 0 ? bVar.f94325g : sVar;
        a liveSearchState = (i & 128) != 0 ? bVar.f94326h : aVar;
        boolean z4 = (i & 256) != 0 ? bVar.i : z;
        Data flightsAvailability = (i & 512) != 0 ? bVar.f94327j : data;
        Data flightSuggestions = (i & 1024) != 0 ? bVar.k : data2;
        boolean z6 = (i & 2048) != 0 ? bVar.f94328l : z3;
        AnalyticsContext analyticsContext2 = (i & 4096) != 0 ? bVar.f94329m : analyticsContext;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Intrinsics.checkNotNullParameter(searchInputState, "searchInputState");
        Intrinsics.checkNotNullParameter(liveSearchState, "liveSearchState");
        Intrinsics.checkNotNullParameter(flightsAvailability, "flightsAvailability");
        Intrinsics.checkNotNullParameter(flightSuggestions, "flightSuggestions");
        return new b(origin, destination, date, gVar2, sortBy, travelMilesSearchAppliedFilters2, searchInputState, liveSearchState, z4, flightsAvailability, flightSuggestions, z6, analyticsContext2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f94322a, bVar.f94322a) && Intrinsics.f(this.f94323b, bVar.f94323b) && Intrinsics.f(this.f94324c, bVar.f94324c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && this.f94325g == bVar.f94325g && Intrinsics.f(this.f94326h, bVar.f94326h) && this.i == bVar.i && Intrinsics.f(this.f94327j, bVar.f94327j) && Intrinsics.f(this.k, bVar.k) && this.f94328l == bVar.f94328l && Intrinsics.f(this.f94329m, bVar.f94329m);
    }

    public final int hashCode() {
        int iA = y.a((this.f94323b.hashCode() + (this.f94322a.hashCode() * 31)) * 31, 31, this.f94324c);
        g gVar = this.d;
        int iHashCode = (this.e.hashCode() + ((iA + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31)) * 31;
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = this.f;
        int iC = j6.a.c(kii.e.c(this.k, kii.e.c(this.f94327j, j6.a.c((this.f94326h.hashCode() + ((this.f94325g.hashCode() + ((iHashCode + (travelMilesSearchAppliedFilters == null ? 0 : travelMilesSearchAppliedFilters.hashCode())) * 31)) * 31)) * 31, 31, this.i), 31), 31), 31, this.f94328l);
        AnalyticsContext analyticsContext = this.f94329m;
        return iC + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
