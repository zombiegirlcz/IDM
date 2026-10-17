package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f194754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f194755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194756c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f194757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f194758h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f194759j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f194760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f194761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f194762n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f194763p;

    public o(m mVar, n nVar, ViewController viewController) {
        this.f194754a = mVar;
        this.f194755b = e4m.b.b(e4m.c.a(viewController));
        this.f194756c = e4m.b.b(new ld1.q(mVar, nVar, this, 2, 3));
        int i = 3;
        this.d = e4m.b.b(new ld1.q(mVar, nVar, this, 1, i));
        this.e = e4m.b.b(new ld1.q(mVar, nVar, this, 0, i));
        this.f = e4m.b.b(new ld1.q(mVar, nVar, this, 4, i));
        this.f194757g = e4m.b.b(new ld1.q(mVar, nVar, this, 3, i));
        this.f194758h = e4m.b.b(new ld1.q(mVar, nVar, this, 6, i));
        this.i = e4m.b.b(new ld1.q(mVar, nVar, this, 5, i));
        this.f194759j = e4m.b.b(new ld1.q(mVar, nVar, this, 7, i));
        this.k = e4m.b.b(new ld1.q(mVar, nVar, this, 8, i));
        this.f194760l = e4m.b.b(new ld1.q(mVar, nVar, this, 9, i));
        this.f194761m = e4m.b.b(new ld1.q(mVar, nVar, this, 10, i));
        this.f194762n = e4m.b.b(new ld1.q(mVar, nVar, this, 11, i));
        this.o = e4m.b.b(new ld1.q(mVar, nVar, this, 13, i));
        this.f194763p = e4m.b.b(new ld1.q(mVar, nVar, this, 12, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f194757g.get(), (yji.n) this.i.get(), (yji.n) this.f194759j.get(), (yji.n) this.k.get(), (yji.n) this.f194760l.get(), (yji.n) this.f194761m.get(), (yji.n) this.f194762n.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
