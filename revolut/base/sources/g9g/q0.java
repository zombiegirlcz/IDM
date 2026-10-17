package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141799c;
    public TravelHotelsHomeBookingsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ q0(d dVar, Object obj2, int i) {
        this.f141797a = i;
        this.f141798b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141797a) {
            case 0:
                this.f141799c = viewController;
                break;
            default:
                this.f141799c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141797a) {
            case 0:
                vc.s.h(this.f141799c, ViewController.class);
                vc.s.h(this.d, TravelHotelsHomeBookingsScreenContract$InputData.class);
                return new r0(this.f141798b, (v) this.e, this.d);
            default:
                vc.s.h(this.f141799c, ViewController.class);
                vc.s.h(this.d, TravelHotelsHomeBookingsScreenContract$InputData.class);
                return new r0(this.f141798b, (t) this.e, this.d);
        }
    }
}
