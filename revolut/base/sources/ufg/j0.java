package ufg;

import com.revolut.feature.travel.miles.impl.ui.screen.transfer.TravelMilesTransferScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f279752c;
    public TravelMilesTransferScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ j0(g gVar, Object obj2, int i) {
        this.f279750a = i;
        this.f279751b = gVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f279750a) {
            case 0:
                this.f279752c = viewController;
                break;
            default:
                this.f279752c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f279750a) {
            case 0:
                vc.s.h(this.f279752c, ViewController.class);
                vc.s.h(this.d, TravelMilesTransferScreenContract$InputData.class);
                return new l0(this.f279751b, (t) this.e, this.f279752c, this.d);
            default:
                vc.s.h(this.f279752c, ViewController.class);
                vc.s.h(this.d, TravelMilesTransferScreenContract$InputData.class);
                return new l0(this.f279751b, (b) this.e, this.f279752c, this.d);
        }
    }
}
