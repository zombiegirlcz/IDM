package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_results.sort_by.TravelFlightsSearchSortByScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class u0 implements e7g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132201c;
    public TravelFlightsSearchSortByScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u0(b bVar, Object obj2, int i) {
        this.f132199a = i;
        this.f132200b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f132199a) {
            case 0:
                this.f132201c = viewController;
                break;
            default:
                this.f132201c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f132199a) {
            case 0:
                vc.s.h(this.f132201c, ViewController.class);
                vc.s.h(this.d, TravelFlightsSearchSortByScreenContract$InputData.class);
                return new v0(this.f132200b, (q) this.e, this.d);
            default:
                vc.s.h(this.f132201c, ViewController.class);
                vc.s.h(this.d, TravelFlightsSearchSortByScreenContract$InputData.class);
                return new v0(this.f132200b, (p) this.e, this.d);
        }
    }

    @Override // e7g.a
    public final e7g.a s(TravelFlightsSearchSortByScreenContract$InputData travelFlightsSearchSortByScreenContract$InputData) {
        switch (this.f132199a) {
            case 0:
                travelFlightsSearchSortByScreenContract$InputData.getClass();
                this.d = travelFlightsSearchSortByScreenContract$InputData;
                break;
            default:
                travelFlightsSearchSortByScreenContract$InputData.getClass();
                this.d = travelFlightsSearchSortByScreenContract$InputData;
                break;
        }
        return this;
    }
}
