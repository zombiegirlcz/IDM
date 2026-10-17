package iwb;

import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements wwb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f169051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f169052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RevPointsGiftcardsHomeScreenContract$InputData f169053c;

    public n(e eVar) {
        this.f169051a = eVar;
    }

    @Override // wwb.a
    public final wwb.a L(RevPointsGiftcardsHomeScreenContract$InputData revPointsGiftcardsHomeScreenContract$InputData) {
        revPointsGiftcardsHomeScreenContract$InputData.getClass();
        this.f169053c = revPointsGiftcardsHomeScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f169052b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f169052b, ViewController.class);
        vc.s.h(this.f169053c, RevPointsGiftcardsHomeScreenContract$InputData.class);
        return new m(this.f169051a, this.f169053c);
    }
}
