package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.TravelFlightsSearchSortByScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 implements e7g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsSearchSortByScreenContract$InputData f132213c;

    public w0(b bVar) {
        this.f132211a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132212b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132212b, ViewController.class);
        vc.s.h(this.f132213c, TravelFlightsSearchSortByScreenContract$InputData.class);
        return new v0(this.f132211a, this.f132213c);
    }

    @Override // e7g.a
    public final e7g.a s(TravelFlightsSearchSortByScreenContract$InputData travelFlightsSearchSortByScreenContract$InputData) {
        travelFlightsSearchSortByScreenContract$InputData.getClass();
        this.f132213c = travelFlightsSearchSortByScreenContract$InputData;
        return this;
    }
}
