package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 implements z6g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsSearchFiltersScreenContract$InputData f132192c;

    public s0(b bVar) {
        this.f132190a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132191b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132191b, ViewController.class);
        vc.s.h(this.f132192c, TravelFlightsSearchFiltersScreenContract$InputData.class);
        return new p0(this.f132190a, this.f132192c);
    }

    @Override // z6g.a
    public final z6g.a w(TravelFlightsSearchFiltersScreenContract$InputData travelFlightsSearchFiltersScreenContract$InputData) {
        travelFlightsSearchFiltersScreenContract$InputData.getClass();
        this.f132192c = travelFlightsSearchFiltersScreenContract$InputData;
        return this;
    }
}
