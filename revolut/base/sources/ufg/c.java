package ufg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$InputData;
import java.util.Set;
import u45.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAirlineDetailsScreenContract$InputData f279673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f279675c;
    public final e4m.e d;

    public c(g gVar, b bVar, TravelMilesAirlineDetailsScreenContract$InputData travelMilesAirlineDetailsScreenContract$InputData) {
        this.f279674b = gVar;
        this.f279673a = travelMilesAirlineDetailsScreenContract$InputData;
        int i = 16;
        this.f279675c = e4m.b.b(new w0(gVar, this, 1, i));
        this.d = e4m.b.b(new w0(gVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
