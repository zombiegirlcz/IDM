package jje;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements xki.c, oje.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f174848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f174849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f174850c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f174851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f174852h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f174853j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f174854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f174855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f174856n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f174857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f174858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f174859r;

    public d(c cVar, ViewController viewController) {
        this.f174849b = cVar;
        this.f174848a = viewController;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.e = e4m.b.b(new jdi.i(cVar, this, 2, i));
        this.f = e4m.b.b(new jdi.i(cVar, this, 1, i));
        this.f174851g = e4m.b.b(new jdi.i(cVar, this, 0, i));
        this.f174852h = e4m.b.b(new jdi.i(cVar, this, 4, i));
        this.i = e4m.b.b(new jdi.i(cVar, this, 7, i));
        this.f174853j = e4m.b.b(new jdi.i(cVar, this, 6, i));
        this.k = e4m.b.b(new jdi.i(cVar, this, 8, i));
        this.f174854l = e4m.b.b(new jdi.i(cVar, this, 9, i));
        this.f174855m = e4m.b.b(new jdi.i(cVar, this, 10, i));
        this.f174856n = e4m.b.b(new jdi.i(cVar, this, 5, i));
        this.o = e4m.b.b(new jdi.i(cVar, this, 12, i));
        this.f174857p = e4m.b.b(new jdi.i(cVar, this, 11, i));
        this.f174858q = e4m.b.b(new jdi.i(cVar, this, 3, i));
        this.f174859r = e4m.b.b(new jdi.i(cVar, this, 13, i));
    }

    @Override // oje.b
    public final g b() {
        return new g(this.f174849b, this.f174850c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f174851g.get());
    }
}
