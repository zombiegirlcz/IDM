package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters;

import cli.g;
import cli.y;
import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import hx7.e;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r3k.c;
import r6f.i;
import rhg.j;
import rhg.l;
import rhg.w;
import vfg.r;
import vii.b;
import vkm.q;
import zhm.a1;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements l {
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f94342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f94344r;

    public a(w stateMapper, TravelMilesFlightSearchResultsFiltersScreenContract$InputData inputData, r flightSearchInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flightSearchInteractor, "flightSearchInteractor");
        this.o = flightSearchInteractor;
        this.f94342p = new b();
        this.f94343q = e.a(this, new i(this, 22));
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = inputData.f94338a;
        this.f94344r = d.b(this, new j(travelMilesSearchAppliedFilters == null ? new TravelMilesSearchAppliedFilters(0) : travelMilesSearchAppliedFilters, 1), stateMapper, null, false, 12);
    }

    public static LinkedHashSet I2(Set set, boolean z, TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption) {
        String str = travelMilesFlightFilters$FilterOption.f94096a;
        return z ? a1.j(set, str) : a1.m(set, str);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f94342p, new c(continuation, this, 5)), null, null, new r5e.e(this, continuation, 23), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94343q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f94344r;
    }
}
