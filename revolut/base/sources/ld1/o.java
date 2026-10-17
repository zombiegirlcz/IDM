package ld1;

import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f193980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193982c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f193984h;
    public final e4m.e i;

    public o(l lVar, w wVar, ViewController viewController) {
        this.f193980a = lVar;
        this.f193981b = e4m.b.b(new il8.d(lVar, wVar, this, 1, 29));
        int i = 29;
        this.f193982c = e4m.b.b(new il8.d(lVar, wVar, this, 0, i));
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new il8.d(lVar, wVar, this, 3, i));
        this.f = e4m.b.b(new il8.d(lVar, wVar, this, 2, i));
        this.f193983g = e4m.b.b(new il8.d(lVar, wVar, this, 5, i));
        this.f193984h = e4m.b.b(new il8.d(lVar, wVar, this, 6, i));
        this.i = e4m.b.b(new il8.d(lVar, wVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.singleton((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return Collections.singleton((yji.d) this.f193982c.get());
    }
}
