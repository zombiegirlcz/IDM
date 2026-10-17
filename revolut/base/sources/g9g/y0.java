package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class y0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141860c;
    public TravelHotelsLocationPickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ y0(d dVar, Object obj2, int i) {
        this.f141858a = i;
        this.f141859b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141858a) {
            case 0:
                this.f141860c = viewController;
                break;
            case 1:
                this.f141860c = viewController;
                break;
            default:
                this.f141860c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141858a) {
            case 0:
                vc.s.h(this.f141860c, ViewController.class);
                vc.s.h(this.d, TravelHotelsLocationPickerScreenContract$InputData.class);
                return new z0(this.f141859b, (v) this.e, this.f141860c, this.d);
            case 1:
                vc.s.h(this.f141860c, ViewController.class);
                vc.s.h(this.d, TravelHotelsLocationPickerScreenContract$InputData.class);
                return new z0(this.f141859b, (n) this.e, this.f141860c, this.d);
            default:
                vc.s.h(this.f141860c, ViewController.class);
                vc.s.h(this.d, TravelHotelsLocationPickerScreenContract$InputData.class);
                return new z0(this.f141859b, (t) this.e, this.f141860c, this.d);
        }
    }
}
