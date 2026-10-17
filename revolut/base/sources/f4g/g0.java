package f4g;

import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f132119c;
    public TravelFlightsDatesSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ g0(b bVar, Object obj2, int i) {
        this.f132117a = i;
        this.f132118b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f132117a) {
            case 0:
                this.f132119c = viewController;
                break;
            default:
                this.f132119c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f132117a) {
            case 0:
                vc.s.h(this.f132119c, ViewController.class);
                vc.s.h(this.d, TravelFlightsDatesSelectionScreenContract$InputData.class);
                return new h0(this.f132118b, (p) this.e, this.d);
            default:
                vc.s.h(this.f132119c, ViewController.class);
                vc.s.h(this.d, TravelFlightsDatesSelectionScreenContract$InputData.class);
                return new h0(this.f132118b, (q) this.e, this.d);
        }
    }
}
