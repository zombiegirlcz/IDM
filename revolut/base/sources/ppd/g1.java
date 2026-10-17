package ppd;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class g1 implements drd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f238418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f238419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f238420c;

    public g1(n nVar, l lVar) {
        this.f238418a = nVar;
        this.f238419b = lVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f238420c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f238420c, ViewController.class);
        return new h1(this.f238418a, this.f238419b, this.f238420c);
    }
}
