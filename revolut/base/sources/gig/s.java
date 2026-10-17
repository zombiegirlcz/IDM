package gig;

import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.TravelMilesRecommendedFlightsScreenContract$InputData;
import hfg.a0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tnb.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends oki.h implements o {
    public final TravelMilesRecommendedFlightsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iig.f f144207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f144208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vfg.q f144209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f144210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f144211t;

    public s(t stateMapper, TravelMilesRecommendedFlightsScreenContract$InputData inputData, iig.f recommendedFlightDialogMapper, g0 recommendedFlightsInteractor, vfg.q travelMilesProvidersInteractor, vfg.e travelMilesAirlinesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recommendedFlightDialogMapper, "recommendedFlightDialogMapper");
        Intrinsics.checkNotNullParameter(recommendedFlightsInteractor, "recommendedFlightsInteractor");
        Intrinsics.checkNotNullParameter(travelMilesProvidersInteractor, "travelMilesProvidersInteractor");
        Intrinsics.checkNotNullParameter(travelMilesAirlinesInteractor, "travelMilesAirlinesInteractor");
        this.o = inputData;
        this.f144207p = recommendedFlightDialogMapper;
        this.f144208q = recommendedFlightsInteractor;
        this.f144209r = travelMilesProvidersInteractor;
        this.f144210s = new vii.b();
        this.f144211t = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        TravelMilesRecommendedFlightsScreenContract$InputData travelMilesRecommendedFlightsScreenContract$InputData = this.o;
        yji.l.a1(this, vkm.q.Q(this.f144210s, new eh9.j((Continuation) null, this, new a0(travelMilesRecommendedFlightsScreenContract$InputData.f94378a, travelMilesRecommendedFlightsScreenContract$InputData.f94379b, travelMilesRecommendedFlightsScreenContract$InputData.f94380c), 14)), null, null, new r(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f144211t;
    }
}
