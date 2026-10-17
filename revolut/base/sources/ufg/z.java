package ufg;

import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f279810c;
    public TravelMilesRedeemOptionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ z(g gVar, Object obj2, int i) {
        this.f279808a = i;
        this.f279809b = gVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f279808a) {
            case 0:
                this.f279810c = viewController;
                break;
            default:
                this.f279810c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f279808a) {
            case 0:
                vc.s.h(this.f279810c, ViewController.class);
                vc.s.h(this.d, TravelMilesRedeemOptionScreenContract$InputData.class);
                return new a0(this.f279809b, (j) this.e, this.d);
            default:
                vc.s.h(this.f279810c, ViewController.class);
                vc.s.h(this.d, TravelMilesRedeemOptionScreenContract$InputData.class);
                return new a0(this.f279809b, (b) this.e, this.d);
        }
    }
}
