package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements s4g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132051c;
    public TravelFlightsAirlinesFilterScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ a0(b bVar, Object obj2, int i) {
        this.f132049a = i;
        this.f132050b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f132049a) {
            case 0:
                this.f132051c = viewController;
                break;
            default:
                this.f132051c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f132049a) {
            case 0:
                vc.s.h(this.f132051c, ViewController.class);
                vc.s.h(this.d, TravelFlightsAirlinesFilterScreenContract$InputData.class);
                return new b0(this.f132050b, (q) this.e, this.d);
            default:
                vc.s.h(this.f132051c, ViewController.class);
                vc.s.h(this.d, TravelFlightsAirlinesFilterScreenContract$InputData.class);
                return new b0(this.f132050b, (p) this.e, this.d);
        }
    }

    @Override // s4g.a
    public final s4g.a h0(TravelFlightsAirlinesFilterScreenContract$InputData travelFlightsAirlinesFilterScreenContract$InputData) {
        switch (this.f132049a) {
            case 0:
                travelFlightsAirlinesFilterScreenContract$InputData.getClass();
                this.d = travelFlightsAirlinesFilterScreenContract$InputData;
                break;
            default:
                travelFlightsAirlinesFilterScreenContract$InputData.getClass();
                this.d = travelFlightsAirlinesFilterScreenContract$InputData;
                break;
        }
        return this;
    }
}
