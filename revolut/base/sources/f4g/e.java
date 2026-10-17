package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_details.TravelFlightsBookingDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsBookingDetailsScreenContract$InputData f132101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f132102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f132103c;

    public e(b bVar, TravelFlightsBookingDetailsScreenContract$InputData travelFlightsBookingDetailsScreenContract$InputData) {
        this.f132101a = travelFlightsBookingDetailsScreenContract$InputData;
        int i = 12;
        this.f132102b = e4m.b.b(new eyd.j(bVar, this, 1, i));
        this.f132103c = e4m.b.b(new eyd.j(bVar, this, 0, i));
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
