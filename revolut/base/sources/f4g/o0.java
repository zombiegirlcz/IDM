package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 implements z6g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132166c;
    public TravelFlightsSearchFiltersScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o0(b bVar, Object obj2, int i) {
        this.f132164a = i;
        this.f132165b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f132164a) {
            case 0:
                this.f132166c = viewController;
                break;
            default:
                this.f132166c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f132164a) {
            case 0:
                vc.s.h(this.f132166c, ViewController.class);
                vc.s.h(this.d, TravelFlightsSearchFiltersScreenContract$InputData.class);
                return new p0(this.f132165b, (q) this.e, this.d);
            default:
                vc.s.h(this.f132166c, ViewController.class);
                vc.s.h(this.d, TravelFlightsSearchFiltersScreenContract$InputData.class);
                return new p0(this.f132165b, (p) this.e, this.d);
        }
    }

    @Override // z6g.a
    public final z6g.a w(TravelFlightsSearchFiltersScreenContract$InputData travelFlightsSearchFiltersScreenContract$InputData) {
        switch (this.f132164a) {
            case 0:
                travelFlightsSearchFiltersScreenContract$InputData.getClass();
                this.d = travelFlightsSearchFiltersScreenContract$InputData;
                break;
            default:
                travelFlightsSearchFiltersScreenContract$InputData.getClass();
                this.d = travelFlightsSearchFiltersScreenContract$InputData;
                break;
        }
        return this;
    }
}
