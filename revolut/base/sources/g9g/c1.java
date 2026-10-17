package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class c1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141614c;
    public TravelHotelsDatesPickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ c1(d dVar, Object obj2, int i) {
        this.f141612a = i;
        this.f141613b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141612a) {
            case 0:
                this.f141614c = viewController;
                break;
            default:
                this.f141614c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141612a) {
            case 0:
                vc.s.h(this.f141614c, ViewController.class);
                vc.s.h(this.d, TravelHotelsDatesPickerScreenContract$InputData.class);
                return new d1(this.f141613b, (n) this.e, this.d);
            default:
                vc.s.h(this.f141614c, ViewController.class);
                vc.s.h(this.d, TravelHotelsDatesPickerScreenContract$InputData.class);
                return new d1(this.f141613b, (t) this.e, this.d);
        }
    }
}
