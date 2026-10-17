package iwb;

import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements wwb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f169041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f169042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f169043c;
    public RevPointsGiftcardsHomeScreenContract$InputData d;

    public l(e eVar, h hVar) {
        this.f169041a = eVar;
        this.f169042b = hVar;
    }

    @Override // wwb.a
    public final wwb.a L(RevPointsGiftcardsHomeScreenContract$InputData revPointsGiftcardsHomeScreenContract$InputData) {
        revPointsGiftcardsHomeScreenContract$InputData.getClass();
        this.d = revPointsGiftcardsHomeScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f169043c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f169043c, ViewController.class);
        vc.s.h(this.d, RevPointsGiftcardsHomeScreenContract$InputData.class);
        return new m(this.f169041a, this.f169042b, this.d);
    }
}
