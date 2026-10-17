package jdi;

import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements ydi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f173109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f173110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RevPointsPocketOnboardingScreenContract$InputData f173111c;

    public k(c cVar) {
        this.f173109a = cVar;
    }

    @Override // ydi.a
    public final ydi.a A(RevPointsPocketOnboardingScreenContract$InputData revPointsPocketOnboardingScreenContract$InputData) {
        this.f173111c = revPointsPocketOnboardingScreenContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f173110b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f173110b, ViewController.class);
        vc.s.h(this.f173111c, RevPointsPocketOnboardingScreenContract$InputData.class);
        return new j(this.f173109a, this.f173110b, this.f173111c);
    }
}
