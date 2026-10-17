package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_status.TravelFlightsBookingStatusScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsBookingStatusScreenContract$InputData f132109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f132110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f132111c;

    public f(b bVar, TravelFlightsBookingStatusScreenContract$InputData travelFlightsBookingStatusScreenContract$InputData) {
        this.f132109a = travelFlightsBookingStatusScreenContract$InputData;
        this.f132110b = e4m.b.b(new eyd.j(bVar, this, 1, 13));
        this.f132111c = e4m.b.b(new eyd.j(bVar, this, 0, 13));
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
