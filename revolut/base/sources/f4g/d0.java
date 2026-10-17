package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.booking_contact.TravelFlightsBookingContactScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements z4g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f132097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132098c;
    public TravelFlightsBookingContactScreenContract$InputData d;

    public d0(b bVar, p pVar) {
        this.f132096a = bVar;
        this.f132097b = pVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132098c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132098c, ViewController.class);
        vc.s.h(this.d, TravelFlightsBookingContactScreenContract$InputData.class);
        return new e0(this.f132096a, this.f132097b, this.d);
    }

    @Override // z4g.a
    public final z4g.a l(TravelFlightsBookingContactScreenContract$InputData travelFlightsBookingContactScreenContract$InputData) {
        travelFlightsBookingContactScreenContract$InputData.getClass();
        this.d = travelFlightsBookingContactScreenContract$InputData;
        return this;
    }
}
