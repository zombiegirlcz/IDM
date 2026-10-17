package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f199882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f199883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199884c;
    public final e4m.e d;
    public final e4m.e e;

    public b(g gVar, k kVar, ViewController viewController) {
        this.f199882a = gVar;
        this.f199883b = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.f199884c = e4m.b.b(new ljl.u(gVar, this, 0, i));
        this.d = e4m.b.b(new ljl.u(gVar, this, 2, i));
        this.e = e4m.b.b(new ljl.u(gVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f199884c.get());
    }
}
