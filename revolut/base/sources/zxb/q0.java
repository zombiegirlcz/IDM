package zxb;

import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class q0 implements m0c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f326246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f326247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f326248c;
    public RevPointsReadTermsControllerContract$InputData d;

    public q0(o0 o0Var, p0 p0Var) {
        this.f326246a = o0Var;
        this.f326247b = p0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f326248c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f326248c, ViewController.class);
        vc.s.h(this.d, RevPointsReadTermsControllerContract$InputData.class);
        return new r0(this.f326246a, this.f326247b, this.d);
    }

    @Override // m0c.a
    public final m0c.a g(RevPointsReadTermsControllerContract$InputData revPointsReadTermsControllerContract$InputData) {
        revPointsReadTermsControllerContract$InputData.getClass();
        this.d = revPointsReadTermsControllerContract$InputData;
        return this;
    }
}
