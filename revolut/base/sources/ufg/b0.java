package ufg;

import com.revolut.feature.travel.miles.impl.ui.screen.flight_date_picker.TravelMilesFlightDatePickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f279672c;
    public TravelMilesFlightDatePickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ b0(g gVar, Object obj2, int i) {
        this.f279670a = i;
        this.f279671b = gVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f279670a) {
            case 0:
                this.f279672c = viewController;
                break;
            default:
                this.f279672c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f279670a) {
            case 0:
                vc.s.h(this.f279672c, ViewController.class);
                vc.s.h(this.d, TravelMilesFlightDatePickerScreenContract$InputData.class);
                return new c0(this.f279671b, (n) this.e, this.d);
            default:
                vc.s.h(this.f279672c, ViewController.class);
                vc.s.h(this.d, TravelMilesFlightDatePickerScreenContract$InputData.class);
                return new c0(this.f279671b, (j) this.e, this.d);
        }
    }
}
