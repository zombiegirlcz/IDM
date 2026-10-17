package vfd;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements khd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f288597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f288598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jhd.g f288599c;

    public f(a aVar) {
        this.f288597a = aVar;
    }

    @Override // khd.a
    public final khd.a T(jhd.g gVar) {
        gVar.getClass();
        this.f288599c = gVar;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f288598b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f288598b, ViewController.class);
        s.h(this.f288599c, jhd.g.class);
        return new e(this.f288597a, this.f288599c);
    }
}
