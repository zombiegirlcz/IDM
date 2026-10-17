package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f318465c;
    public TravelExperiencesBookingsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w(b bVar, Object obj2, int i) {
        this.f318463a = i;
        this.f318464b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f318463a) {
            case 0:
                this.f318465c = viewController;
                break;
            default:
                this.f318465c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f318463a) {
            case 0:
                vc.s.h(this.f318465c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesBookingsScreenContract$InputData.class);
                return new x(this.f318464b, (q) this.e, this.d);
            default:
                vc.s.h(this.f318465c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesBookingsScreenContract$InputData.class);
                return new x(this.f318464b, (j) this.e, this.d);
        }
    }
}
