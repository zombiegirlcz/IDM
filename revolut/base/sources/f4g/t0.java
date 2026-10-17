package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 implements b7g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsSearchScreenContract$InputData f132196c;

    public t0(b bVar) {
        this.f132194a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132195b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132195b, ViewController.class);
        vc.s.h(this.f132196c, TravelFlightsSearchScreenContract$InputData.class);
        return new r0(this.f132194a, this.f132196c);
    }

    @Override // b7g.a
    public final b7g.a u(TravelFlightsSearchScreenContract$InputData travelFlightsSearchScreenContract$InputData) {
        travelFlightsSearchScreenContract$InputData.getClass();
        this.f132196c = travelFlightsSearchScreenContract$InputData;
        return this;
    }
}
