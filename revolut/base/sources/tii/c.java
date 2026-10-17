package tii;

import com.revolut.kompot.navigable.vc.ViewController;
import fji.h;
import lti.u;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements gji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f271535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f271536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f271537c;

    public c(b bVar) {
        this.f271535a = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f271536b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final e mo3783build() {
        s.h(this.f271536b, ViewController.class);
        s.h(this.f271537c, h.class);
        return new u(this.f271535a, this.f271537c);
    }

    @Override // gji.a
    public final gji.a l0(h hVar) {
        hVar.getClass();
        this.f271537c = hVar;
        return this;
    }
}
