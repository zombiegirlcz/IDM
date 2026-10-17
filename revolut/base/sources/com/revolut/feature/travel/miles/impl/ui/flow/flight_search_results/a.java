package com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results;

import com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.TravelMilesFlightSearchResultsFlowContract$Step;
import hfb.d;
import hgg.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final TravelMilesFlightSearchResultsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f94220p;

    public a(TravelMilesFlightSearchResultsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 3);
        this.f94220p = cp5.d.a(this, TravelMilesFlightSearchResultsFlowContract$Step.SearchResults.f94219a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94220p;
    }
}
