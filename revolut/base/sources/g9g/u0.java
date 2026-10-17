package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class u0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141829c;
    public TravelHotelsCardSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u0(d dVar, Object obj2, int i) {
        this.f141827a = i;
        this.f141828b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141827a) {
            case 0:
                this.f141829c = viewController;
                break;
            case 1:
                this.f141829c = viewController;
                break;
            default:
                this.f141829c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141827a) {
            case 0:
                vc.s.h(this.f141829c, ViewController.class);
                vc.s.h(this.d, TravelHotelsCardSelectionScreenContract$InputData.class);
                return new v0(this.f141828b, (g) this.e, this.d);
            case 1:
                vc.s.h(this.f141829c, ViewController.class);
                vc.s.h(this.d, TravelHotelsCardSelectionScreenContract$InputData.class);
                return new v0(this.f141828b, (n) this.e, this.d);
            default:
                vc.s.h(this.f141829c, ViewController.class);
                vc.s.h(this.d, TravelHotelsCardSelectionScreenContract$InputData.class);
                return new v0(this.f141828b, (t) this.e, this.d);
        }
    }
}
