package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 implements s6g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132149c;
    public TravelFlightsPassengersPickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ l0(b bVar, Object obj2, int i) {
        this.f132147a = i;
        this.f132148b = bVar;
        this.e = obj2;
    }

    @Override // s6g.a
    public final s6g.a Z(TravelFlightsPassengersPickerScreenContract$InputData travelFlightsPassengersPickerScreenContract$InputData) {
        switch (this.f132147a) {
            case 0:
                this.d = travelFlightsPassengersPickerScreenContract$InputData;
                break;
            default:
                this.d = travelFlightsPassengersPickerScreenContract$InputData;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f132147a) {
            case 0:
                this.f132149c = viewController;
                break;
            default:
                this.f132149c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f132147a) {
            case 0:
                vc.s.h(this.f132149c, ViewController.class);
                vc.s.h(this.d, TravelFlightsPassengersPickerScreenContract$InputData.class);
                return new m0(this.f132148b, (q) this.e, this.d);
            default:
                vc.s.h(this.f132149c, ViewController.class);
                vc.s.h(this.d, TravelFlightsPassengersPickerScreenContract$InputData.class);
                return new m0(this.f132148b, (p) this.e, this.d);
        }
    }
}
