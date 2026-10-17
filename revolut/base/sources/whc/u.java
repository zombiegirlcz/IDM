package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f297587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f297588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f297589c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f297590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f297591h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f297592j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f297593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f297594m;

    public u(z zVar, ViewController viewController, i7d.i iVar) {
        this.f297589c = zVar;
        this.f297587a = iVar;
        this.f297588b = viewController;
        int i = 0;
        this.d = e4m.b.b(new t(zVar, this, 1, i));
        int i2 = 0;
        this.e = e4m.b.b(new t(zVar, this, i2, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        this.f297590g = e4m.b.b(new t(zVar, this, 3, i2));
        this.f297591h = e4m.b.b(new t(zVar, this, 5, i2));
        this.i = e4m.b.b(new t(zVar, this, 4, i2));
        this.f297592j = e4m.b.b(new t(zVar, this, 6, i2));
        this.k = e4m.b.b(new t(zVar, this, 2, i2));
        this.f297593l = e4m.b.b(new t(zVar, this, 7, i2));
        this.f297594m = e4m.b.b(new t(zVar, this, 8, i2));
    }

    @Override // xki.e
    public final Set f() {
        i7d.o oVar = (i7d.o) this.d.get();
        h7d.e.a(oVar);
        return ImmutableSet.of((yji.n) oVar, (yji.n) this.f297593l.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        i7d.n nVar = (i7d.n) this.e.get();
        h7d.c.a(nVar);
        return ImmutableSet.of((yji.d) nVar, (yji.d) this.k.get());
    }
}
