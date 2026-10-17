package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements z4g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsBookingContactScreenContract$InputData f132114c;

    public f0(b bVar) {
        this.f132112a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132113b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132113b, ViewController.class);
        vc.s.h(this.f132114c, TravelFlightsBookingContactScreenContract$InputData.class);
        return new e0(this.f132112a, this.f132114c);
    }

    @Override // z4g.a
    public final z4g.a l(TravelFlightsBookingContactScreenContract$InputData travelFlightsBookingContactScreenContract$InputData) {
        travelFlightsBookingContactScreenContract$InputData.getClass();
        this.f132114c = travelFlightsBookingContactScreenContract$InputData;
        return this;
    }
}
