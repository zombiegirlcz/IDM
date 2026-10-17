package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements s4g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f132081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TravelFlightsAirlinesFilterScreenContract$InputData f132082c;

    public c0(b bVar) {
        this.f132080a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f132081b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f132081b, ViewController.class);
        vc.s.h(this.f132082c, TravelFlightsAirlinesFilterScreenContract$InputData.class);
        return new b0(this.f132080a, this.f132082c);
    }

    @Override // s4g.a
    public final s4g.a h0(TravelFlightsAirlinesFilterScreenContract$InputData travelFlightsAirlinesFilterScreenContract$InputData) {
        travelFlightsAirlinesFilterScreenContract$InputData.getClass();
        this.f132082c = travelFlightsAirlinesFilterScreenContract$InputData;
        return this;
    }
}
