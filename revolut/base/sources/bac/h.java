package bac;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements fac.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f14036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f14037c;

    public h(b bVar, c cVar) {
        this.f14035a = bVar;
        this.f14036b = cVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f14037c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f14037c, ViewController.class);
        return new i(this.f14035a, this.f14036b);
    }
}
