package g9g;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f141841c;
    public TravelHotelsCancellationPolicyScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ w0(d dVar, Object obj2, int i) {
        this.f141839a = i;
        this.f141840b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141839a) {
            case 0:
                this.f141841c = viewController;
                break;
            default:
                this.f141841c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141839a) {
            case 0:
                vc.s.h(this.f141841c, ViewController.class);
                vc.s.h(this.d, TravelHotelsCancellationPolicyScreenContract$InputData.class);
                return new x0(this.f141840b, (n) this.e, this.d);
            default:
                vc.s.h(this.f141841c, ViewController.class);
                vc.s.h(this.d, TravelHotelsCancellationPolicyScreenContract$InputData.class);
                return new x0(this.f141840b, (t) this.e, this.d);
        }
    }
}
