package hy8;

import an0.c;
import l70.e;
import xx8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f156760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f156761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ux8.a f156762c;
    public final c d;
    public final xp.a e;
    public final b f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f156763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f156764h;

    public b(f fVar, xx8.c cVar, e eVar, xp.a aVar, ux8.a aVar2, c cVar2) {
        this.f156760a = fVar;
        this.f156761b = eVar;
        this.f156762c = aVar2;
        this.d = cVar2;
        this.e = aVar;
        int i = 24;
        this.f156763g = e4m.b.b(new gff.a(this, 0, i));
        this.f156764h = e4m.b.b(new gff.a(this, 1, i));
    }

    public final iy8.b a() {
        return (iy8.b) this.f156763g.get();
    }
}
