package vfd;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements khd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f288591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f288592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f288593c;
    public jhd.g d;

    public d(a aVar, b bVar) {
        this.f288591a = aVar;
        this.f288592b = bVar;
    }

    @Override // khd.a
    public final khd.a T(jhd.g gVar) {
        gVar.getClass();
        this.d = gVar;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f288593c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f288593c, ViewController.class);
        s.h(this.d, jhd.g.class);
        return new e(this.f288591a, this.f288592b, this.d);
    }
}
