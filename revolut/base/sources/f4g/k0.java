package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 implements w5g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsDiscoverScreenContract$InputData f132139c;

    public k0(b bVar) {
        this.f132137a = bVar;
    }

    @Override // w5g.a
    public final w5g.a R(TravelFlightsDiscoverScreenContract$InputData travelFlightsDiscoverScreenContract$InputData) {
        this.f132139c = travelFlightsDiscoverScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132138b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132138b, ViewController.class);
        vc.s.h(this.f132139c, TravelFlightsDiscoverScreenContract$InputData.class);
        return new j0(this.f132137a, this.f132139c);
    }
}
