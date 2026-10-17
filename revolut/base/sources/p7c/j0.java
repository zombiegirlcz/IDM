package p7c;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 implements qdc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewController f233630a;

    public j0(r rVar) {
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f233630a = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f233630a, ViewController.class);
        k0 k0Var = new k0();
        k0Var.f233635a = e4m.b.b(new p12.o(9));
        return k0Var;
    }
}
