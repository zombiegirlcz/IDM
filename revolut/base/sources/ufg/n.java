package ufg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.miles.impl.ui.flow.flight_search_results.TravelMilesFlightSearchResultsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements xki.c, fhg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightSearchResultsFlowContract$InputData f279769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f279771c = this;
    public final e4m.e d = e4m.b.b(new u45.v(this, 24));

    public n(g gVar, TravelMilesFlightSearchResultsFlowContract$InputData travelMilesFlightSearchResultsFlowContract$InputData) {
        this.f279770b = gVar;
        this.f279769a = travelMilesFlightSearchResultsFlowContract$InputData;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // fhg.a
    public final b0 q() {
        return new b0(this.f279770b, this.f279771c, 0);
    }
}
