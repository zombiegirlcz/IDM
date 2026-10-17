package cwi;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class k1 implements zyi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f109739b;

    public k1(h0 h0Var) {
        this.f109738a = h0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f109739b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f109739b, ViewController.class);
        return new j1(this.f109738a, this.f109739b);
    }
}
