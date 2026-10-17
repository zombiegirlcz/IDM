package p7c;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements jdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewController f233609a;

    public f0(r rVar) {
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233609a = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233609a, ViewController.class);
        g0 g0Var = new g0();
        g0Var.f233612a = e4m.b.b(new p12.o(7));
        return g0Var;
    }
}
