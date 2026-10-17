package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class e1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141660c;
    public TravelHotelsChildAgePickerContract$InputData d;
    public final Object e;

    public /* synthetic */ e1(d dVar, Object obj2, int i) {
        this.f141658a = i;
        this.f141659b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141658a) {
            case 0:
                this.f141660c = viewController;
                break;
            default:
                this.f141660c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141658a) {
            case 0:
                vc.s.h(this.f141660c, ViewController.class);
                vc.s.h(this.d, TravelHotelsChildAgePickerContract$InputData.class);
                return new f1(this.f141659b, (n) this.e, this.d);
            default:
                vc.s.h(this.f141660c, ViewController.class);
                vc.s.h(this.d, TravelHotelsChildAgePickerContract$InputData.class);
                return new f1(this.f141659b, (t) this.e, this.d);
        }
    }
}
