package com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights;

import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import lgg.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final tig.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f80.a f94243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f94244q;

    public a(TravelMilesRecommendedFlightsFlowContract$InputData inputData, tig.b topUpDialogMapper, f80.a uriHelper) {
        FlowStep flightSearchResultDetails;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpDialogMapper, "topUpDialogMapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = topUpDialogMapper;
        this.f94243p = uriHelper;
        if (inputData instanceof TravelMilesRecommendedFlightsFlowContract$InputData.RecommendedFlights) {
            TravelMilesRecommendedFlightsFlowContract$InputData.RecommendedFlights recommendedFlights = (TravelMilesRecommendedFlightsFlowContract$InputData.RecommendedFlights) inputData;
            flightSearchResultDetails = new TravelMilesRecommendedFlightsFlowContract$Step.RecommendedFlights(recommendedFlights.f94229a, recommendedFlights.f94230b, recommendedFlights.f94231c, recommendedFlights.d);
        } else {
            if (!(inputData instanceof TravelMilesRecommendedFlightsFlowContract$InputData.FlightSearchResultDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            TravelMilesRecommendedFlightsFlowContract$InputData.FlightSearchResultDetails flightSearchResultDetails2 = (TravelMilesRecommendedFlightsFlowContract$InputData.FlightSearchResultDetails) inputData;
            flightSearchResultDetails = new TravelMilesRecommendedFlightsFlowContract$Step.FlightSearchResultDetails(flightSearchResultDetails2.f94226a, flightSearchResultDetails2.f94227b, flightSearchResultDetails2.d, flightSearchResultDetails2.f94228c);
        }
        this.f94244q = d.a(this, flightSearchResultDetails, f0.f322471a, new c(this, 8));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94244q;
    }
}
