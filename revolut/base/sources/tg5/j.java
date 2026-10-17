package tg5;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements zg5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f271092b;

    public j(d dVar) {
        this.f271091a = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f271092b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f271092b, ViewController.class);
        return new k(this.f271091a);
    }
}
