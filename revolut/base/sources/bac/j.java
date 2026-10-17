package bac;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements fac.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f14042b;

    public j(b bVar) {
        this.f14041a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f14042b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f14042b, ViewController.class);
        return new i(this.f14041a);
    }
}
