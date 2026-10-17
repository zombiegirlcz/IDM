package mz;

import com.google.common.collect.ImmutableSet;
import f00.a;
import java.util.Set;
import l70.e;
import px.g;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements my.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ly.c f210562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f210563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gx.c f210564c;
    public final u00.d d;
    public final f00.b e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nv.a f210565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fv.e f210566h;
    public final b i = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f210567j;
    public final e4m.e k;

    public b(g gVar, e eVar, gx.c cVar, u00.d dVar, nv.a aVar, ly.c cVar2, a.C0766a c0766a, fv.e eVar2) {
        this.f210562a = cVar2;
        this.f210563b = eVar;
        this.f210564c = cVar;
        this.d = dVar;
        this.e = c0766a;
        this.f = gVar;
        this.f210565g = aVar;
        this.f210566h = eVar2;
        int i = 12;
        this.f210567j = e4m.b.b(new mil.a(this, 0, i));
        this.k = e4m.b.b(new mil.a(this, 1, i));
    }

    @Override // my.b
    public final ly.b e() {
        return (ly.b) this.f210567j.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // my.b
    public final ey.c u() {
        return new ey.c(this.i, 1);
    }
}
