package z0g;

import com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f318363c;
    public TravelExperiencesItineraryScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ f0(b bVar, Object obj2, int i) {
        this.f318361a = i;
        this.f318362b = bVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f318361a) {
            case 0:
                this.f318363c = viewController;
                break;
            default:
                this.f318363c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f318361a) {
            case 0:
                vc.s.h(this.f318363c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesItineraryScreenContract$InputData.class);
                return new g0(this.f318362b, (f) this.e, this.d);
            default:
                vc.s.h(this.f318363c, ViewController.class);
                vc.s.h(this.d, TravelExperiencesItineraryScreenContract$InputData.class);
                return new g0(this.f318362b, (j) this.e, this.d);
        }
    }
}
