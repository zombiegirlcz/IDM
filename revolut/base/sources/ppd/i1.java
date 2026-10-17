package ppd;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class i1 implements drd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f238437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f238438b;

    public i1(n nVar) {
        this.f238437a = nVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f238438b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f238438b, ViewController.class);
        return new h1(this.f238437a, this.f238438b);
    }
}
