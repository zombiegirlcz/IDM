package jdi;

import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements ydi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f173098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f173099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f173100c;
    public RevPointsPocketOnboardingScreenContract$InputData d;

    public h(c cVar, f fVar) {
        this.f173098a = cVar;
        this.f173099b = fVar;
    }

    @Override // ydi.a
    public final ydi.a A(RevPointsPocketOnboardingScreenContract$InputData revPointsPocketOnboardingScreenContract$InputData) {
        this.d = revPointsPocketOnboardingScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f173100c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f173100c, ViewController.class);
        vc.s.h(this.d, RevPointsPocketOnboardingScreenContract$InputData.class);
        return new j(this.f173098a, this.f173099b, this.f173100c, this.d);
    }
}
