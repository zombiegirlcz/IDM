package cwi;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class i1 implements zyi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f109725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f109726c;

    public i1(h0 h0Var, r0 r0Var) {
        this.f109724a = h0Var;
        this.f109725b = r0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f109726c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f109726c, ViewController.class);
        return new j1(this.f109724a, this.f109725b, this.f109726c);
    }
}
