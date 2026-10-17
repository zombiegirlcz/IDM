package y77;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;
import xsl.q;
import yji.n;
import z0h.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f311386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IndexOverviewScreenContract$InputData f311387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f311388c;
    public final e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f311389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f311390h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f311391j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f311392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f311393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f311394n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f311395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f311396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f311397r;

    public f(c cVar, e eVar, ViewController viewController, IndexOverviewScreenContract$InputData indexOverviewScreenContract$InputData) {
        this.f311388c = cVar;
        this.d = eVar;
        this.f311386a = viewController;
        this.f311387b = indexOverviewScreenContract$InputData;
        int i = 12;
        this.e = e4m.b.b(new q(cVar, this, 0, i));
        this.f = e4m.b.b(new q(cVar, this, 1, i));
        this.f311389g = e4m.b.b(new q(cVar, this, 5, i));
        this.f311390h = e4m.b.b(e4m.c.a(viewController));
        int i2 = 12;
        this.i = e4m.b.b(new q(cVar, this, 7, i2));
        this.f311391j = e4m.b.b(new q(cVar, this, 6, i2));
        this.k = e4m.b.b(new q(cVar, this, 4, i2));
        this.f311392l = e4m.b.b(new q(cVar, this, 3, i2));
        this.f311393m = e4m.b.b(new q(cVar, this, 2, i2));
        this.f311394n = e4m.b.b(new q(cVar, this, 8, i2));
        this.o = e4m.b.b(new q(cVar, this, 11, i2));
        this.f311395p = e4m.b.b(new q(cVar, this, 12, i2));
        this.f311396q = e4m.b.b(new q(cVar, this, 10, i2));
        this.f311397r = e4m.b.b(new q(cVar, this, 9, i2));
    }

    @Override // xki.e
    public final Set f() {
        n nVar = (n) this.d.k.get();
        aah.h hVar = (aah.h) this.f.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(nVar, (n) hVar, (n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f311388c.f311366j).d();
        s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, (s1) this.e.get(), (aah.h) this.f.get()), (yji.d) this.f311393m.get(), (yji.d) this.f311394n.get());
    }
}
