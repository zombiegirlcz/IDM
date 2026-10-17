package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 implements w5g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f132128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132129c;
    public TravelFlightsDiscoverScreenContract$InputData d;

    public i0(b bVar, q qVar) {
        this.f132127a = bVar;
        this.f132128b = qVar;
    }

    @Override // w5g.a
    public final w5g.a R(TravelFlightsDiscoverScreenContract$InputData travelFlightsDiscoverScreenContract$InputData) {
        this.d = travelFlightsDiscoverScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132129c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132129c, ViewController.class);
        vc.s.h(this.d, TravelFlightsDiscoverScreenContract$InputData.class);
        return new j0(this.f132127a, this.f132128b, this.d);
    }
}
