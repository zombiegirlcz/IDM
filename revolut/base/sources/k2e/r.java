package k2e;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements b3e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f180548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f180549c;

    public r(j jVar, l lVar) {
        this.f180547a = jVar;
        this.f180548b = lVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f180549c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f180549c, ViewController.class);
        return new s(this.f180547a, this.f180548b, this.f180549c);
    }
}
