package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class a1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141594c;
    public TravelHotelsPriceBreakdownScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ a1(d dVar, Object obj2, int i) {
        this.f141592a = i;
        this.f141593b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141592a) {
            case 0:
                this.f141594c = viewController;
                break;
            case 1:
                this.f141594c = viewController;
                break;
            default:
                this.f141594c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141592a) {
            case 0:
                vc.s.h(this.f141594c, ViewController.class);
                vc.s.h(this.d, TravelHotelsPriceBreakdownScreenContract$InputData.class);
                return new b1(this.f141593b, (z) this.e, this.d);
            case 1:
                vc.s.h(this.f141594c, ViewController.class);
                vc.s.h(this.d, TravelHotelsPriceBreakdownScreenContract$InputData.class);
                return new b1(this.f141593b, (n) this.e, this.d);
            default:
                vc.s.h(this.f141594c, ViewController.class);
                vc.s.h(this.d, TravelHotelsPriceBreakdownScreenContract$InputData.class);
                return new b1(this.f141593b, (t) this.e, this.d);
        }
    }
}
