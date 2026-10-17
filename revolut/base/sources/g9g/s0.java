package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class s0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141811c;
    public TravelHotelsBedOptionsSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ s0(d dVar, Object obj2, int i) {
        this.f141809a = i;
        this.f141810b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141809a) {
            case 0:
                this.f141811c = viewController;
                break;
            case 1:
                this.f141811c = viewController;
                break;
            default:
                this.f141811c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141809a) {
            case 0:
                vc.s.h(this.f141811c, ViewController.class);
                vc.s.h(this.d, TravelHotelsBedOptionsSelectionScreenContract$InputData.class);
                return new t0(this.f141810b, (g) this.e, this.d);
            case 1:
                vc.s.h(this.f141811c, ViewController.class);
                vc.s.h(this.d, TravelHotelsBedOptionsSelectionScreenContract$InputData.class);
                return new t0(this.f141810b, (n) this.e, this.d);
            default:
                vc.s.h(this.f141811c, ViewController.class);
                vc.s.h(this.d, TravelHotelsBedOptionsSelectionScreenContract$InputData.class);
                return new t0(this.f141810b, (t) this.e, this.d);
        }
    }
}
