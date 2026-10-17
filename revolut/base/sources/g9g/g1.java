package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class g1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141678c;
    public TravelHotelsGuestPickerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ g1(d dVar, Object obj2, int i) {
        this.f141676a = i;
        this.f141677b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141676a) {
            case 0:
                this.f141678c = viewController;
                break;
            default:
                this.f141678c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141676a) {
            case 0:
                vc.s.h(this.f141678c, ViewController.class);
                vc.s.h(this.d, TravelHotelsGuestPickerScreenContract$InputData.class);
                return new h1(this.f141677b, (n) this.e, this.d);
            default:
                vc.s.h(this.f141678c, ViewController.class);
                vc.s.h(this.d, TravelHotelsGuestPickerScreenContract$InputData.class);
                return new h1(this.f141677b, (t) this.e, this.d);
        }
    }
}
