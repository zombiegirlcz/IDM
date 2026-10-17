package k3d;

import jqa.m;
import l3d.h0;
import l3d.r;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4d.a f180696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1d.b f180697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f180698c;
    public final y2d.c d;
    public final pqi.a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f180699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f180700h;

    public b(pqi.a aVar, y2d.c cVar, c cVar2, m4d.a aVar2, y1d.b bVar) {
        this.f180696a = aVar2;
        this.f180697b = bVar;
        this.f180698c = cVar2;
        this.d = cVar;
        this.e = aVar;
        int i = 13;
        this.f = e4m.b.b(new m(this, 1, i));
        this.f180699g = e4m.b.b(new m(this, 0, i));
        this.f180700h = e4m.b.b(new m(this, 2, i));
    }

    public final r a() {
        return (r) this.f180700h.get();
    }

    public final h0 b() {
        return (h0) this.f180699g.get();
    }
}
