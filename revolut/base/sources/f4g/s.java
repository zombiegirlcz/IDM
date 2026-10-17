package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary.TravelFlightsItineraryScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsItineraryScreenContract$InputData f132186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f132188c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f132189g;

    public s(b bVar, p pVar, TravelFlightsItineraryScreenContract$InputData travelFlightsItineraryScreenContract$InputData) {
        this.f132187b = bVar;
        this.f132186a = travelFlightsItineraryScreenContract$InputData;
        int i = 16;
        this.f132188c = e4m.b.b(new eyd.j(bVar, this, 1, i));
        this.d = e4m.b.b(new eyd.j(bVar, this, 0, i));
        this.e = e4m.b.b(new eyd.j(bVar, this, 3, i));
        this.f = e4m.b.b(new eyd.j(bVar, this, 4, i));
        this.f132189g = e4m.b.b(new eyd.j(bVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
