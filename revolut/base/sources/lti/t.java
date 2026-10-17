package lti;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements gji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f199955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f199956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f199957c;
    public fji.h d;

    public t(g gVar, k kVar) {
        this.f199955a = gVar;
        this.f199956b = kVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f199957c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f199957c, ViewController.class);
        vc.s.h(this.d, fji.h.class);
        return new u(this.f199955a, this.f199956b, this.d);
    }

    @Override // gji.a
    public final gji.a l0(fji.h hVar) {
        hVar.getClass();
        this.d = hVar;
        return this;
    }
}
