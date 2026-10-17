package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f199896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftHomeScreenContract$InputData f199897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f199898c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199900h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f199901j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f199902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f199903m;

    public f(g gVar, ViewController viewController, i7d.i iVar, AsftHomeScreenContract$InputData asftHomeScreenContract$InputData) {
        this.f199898c = gVar;
        this.f199896a = iVar;
        this.f199897b = asftHomeScreenContract$InputData;
        int i = 27;
        this.d = e4m.b.b(new ljl.u(gVar, this, 1, i));
        this.e = e4m.b.b(new ljl.u(gVar, this, 0, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 27;
        this.f199899g = e4m.b.b(new ljl.u(gVar, this, 2, i2));
        this.f199900h = e4m.b.b(new ljl.u(gVar, this, 5, i2));
        this.i = e4m.b.b(new ljl.u(gVar, this, 4, i2));
        this.f199901j = e4m.b.b(new ljl.u(gVar, this, 3, i2));
        this.k = e4m.b.b(new ljl.u(gVar, this, 6, i2));
        this.f199902l = e4m.b.b(new ljl.u(gVar, this, 8, i2));
        this.f199903m = e4m.b.b(new ljl.u(gVar, this, 7, i2));
    }

    @Override // xki.e
    public final Set f() {
        i7d.o oVar = (i7d.o) this.d.get();
        h7d.e.a(oVar);
        return ImmutableSet.of((yji.n) oVar, (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        i7d.n nVar = (i7d.n) this.e.get();
        h7d.c.a(nVar);
        return ImmutableSet.of((yji.d) nVar, (yji.d) this.f199899g.get(), (yji.d) this.f199901j.get());
    }
}
