package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsPassengersDetailsScreenContract$InputData f132202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f132204c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f132205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f132206h;

    public v(b bVar, p pVar, TravelFlightsPassengersDetailsScreenContract$InputData travelFlightsPassengersDetailsScreenContract$InputData) {
        this.f132203b = bVar;
        this.f132202a = travelFlightsPassengersDetailsScreenContract$InputData;
        int i = 17;
        this.f132204c = e4m.b.b(new eyd.j(bVar, this, 1, i));
        this.d = e4m.b.b(new eyd.j(bVar, this, 0, i));
        this.e = e4m.b.b(new eyd.j(bVar, this, 3, i));
        this.f = e4m.b.b(new eyd.j(bVar, this, 4, i));
        this.f132205g = e4m.b.b(new eyd.j(bVar, this, 5, i));
        this.f132206h = e4m.b.b(new eyd.j(bVar, this, 2, i));
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
