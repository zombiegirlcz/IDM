package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 implements b7g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132178c;
    public TravelFlightsSearchScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ q0(b bVar, Object obj2, int i) {
        this.f132176a = i;
        this.f132177b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f132176a) {
            case 0:
                this.f132178c = viewController;
                break;
            default:
                this.f132178c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f132176a) {
            case 0:
                vc.s.h(this.f132178c, ViewController.class);
                vc.s.h(this.d, TravelFlightsSearchScreenContract$InputData.class);
                return new r0(this.f132177b, (q) this.e, this.d);
            default:
                vc.s.h(this.f132178c, ViewController.class);
                vc.s.h(this.d, TravelFlightsSearchScreenContract$InputData.class);
                return new r0(this.f132177b, (p) this.e, this.d);
        }
    }

    @Override // b7g.a
    public final b7g.a u(TravelFlightsSearchScreenContract$InputData travelFlightsSearchScreenContract$InputData) {
        switch (this.f132176a) {
            case 0:
                travelFlightsSearchScreenContract$InputData.getClass();
                this.d = travelFlightsSearchScreenContract$InputData;
                break;
            default:
                travelFlightsSearchScreenContract$InputData.getClass();
                this.d = travelFlightsSearchScreenContract$InputData;
                break;
        }
        return this;
    }
}
