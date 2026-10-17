package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 implements s6g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsPassengersPickerScreenContract$InputData f132160c;

    public n0(b bVar) {
        this.f132158a = bVar;
    }

    @Override // s6g.a
    public final s6g.a Z(TravelFlightsPassengersPickerScreenContract$InputData travelFlightsPassengersPickerScreenContract$InputData) {
        this.f132160c = travelFlightsPassengersPickerScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132159b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132159b, ViewController.class);
        vc.s.h(this.f132160c, TravelFlightsPassengersPickerScreenContract$InputData.class);
        return new m0(this.f132158a, this.f132160c);
    }
}
