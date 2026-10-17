package tg5;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements zg5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f271083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f271084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f271085c;

    public g(d dVar, e eVar) {
        this.f271083a = dVar;
        this.f271084b = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f271085c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f271085c, ViewController.class);
        return new i(this.f271083a, this.f271084b);
    }
}
