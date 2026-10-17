package zxb;

import com.revolut.feature.rev_points.impl.ui.terms_review.screen.RevPointsReadTermsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class s0 implements m0c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f326258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f326259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RevPointsReadTermsControllerContract$InputData f326260c;

    public s0(o0 o0Var) {
        this.f326258a = o0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f326259b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f326259b, ViewController.class);
        vc.s.h(this.f326260c, RevPointsReadTermsControllerContract$InputData.class);
        return new r0(this.f326258a, this.f326260c);
    }

    @Override // m0c.a
    public final m0c.a g(RevPointsReadTermsControllerContract$InputData revPointsReadTermsControllerContract$InputData) {
        revPointsReadTermsControllerContract$InputData.getClass();
        this.f326260c = revPointsReadTermsControllerContract$InputData;
        return this;
    }
}
