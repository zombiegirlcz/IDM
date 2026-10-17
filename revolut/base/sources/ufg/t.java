package ufg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.miles.impl.ui.flow.recommended_flights.TravelMilesRecommendedFlightsFlowContract$InputData;
import java.util.Set;
import u45.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements xki.c, rgg.a, sig.a, rig.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesRecommendedFlightsFlowContract$InputData f279792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f279794c = this;
    public final e4m.e d;
    public final e4m.e e;

    public t(g gVar, TravelMilesRecommendedFlightsFlowContract$InputData travelMilesRecommendedFlightsFlowContract$InputData) {
        this.f279793b = gVar;
        this.f279792a = travelMilesRecommendedFlightsFlowContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new w0(gVar, this, 1, i));
        this.e = e4m.b.b(new w0(gVar, this, 0, i));
    }

    @Override // rgg.a
    public final x b() {
        return new x(this.f279793b, this.f279794c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // sig.a
    public final j0 j() {
        return new j0(this.f279793b, this.f279794c, 0);
    }

    @Override // rig.a
    public final h0 q() {
        return new h0(this.f279793b, this.f279794c, 0);
    }
}
