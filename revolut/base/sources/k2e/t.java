package k2e;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements b3e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f180556b;

    public t(j jVar) {
        this.f180555a = jVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f180556b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f180556b, ViewController.class);
        return new s(this.f180555a, this.f180556b);
    }
}
