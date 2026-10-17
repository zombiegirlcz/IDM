package ufg;

import com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f279740c;
    public TravelMilesTransferBreakdownScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ h0(g gVar, Object obj2, int i) {
        this.f279738a = i;
        this.f279739b = gVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f279738a) {
            case 0:
                this.f279740c = viewController;
                break;
            default:
                this.f279740c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f279738a) {
            case 0:
                vc.s.h(this.f279740c, ViewController.class);
                vc.s.h(this.d, TravelMilesTransferBreakdownScreenContract$InputData.class);
                return new i0(this.f279739b, (t) this.e, this.d);
            default:
                vc.s.h(this.f279740c, ViewController.class);
                vc.s.h(this.d, TravelMilesTransferBreakdownScreenContract$InputData.class);
                return new i0(this.f279739b, (b) this.e, this.d);
        }
    }
}
