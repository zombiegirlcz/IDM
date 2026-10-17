package y2d;

import l70.e;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1d.b f310624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk3.c f310625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f310626c;
    public final usg.a d;
    public final npk.a e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f310627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f310628h;
    public final e4m.e i;

    public b(jk3.c cVar, e eVar, sd0.c cVar2, npk.a aVar, usg.a aVar2, y1d.b bVar) {
        this.f310624a = bVar;
        this.f310625b = cVar;
        this.f310626c = eVar;
        this.d = aVar2;
        this.e = aVar;
        int i = 6;
        this.f = e4m.b.b(new xs6.a(this, 0, i));
        this.f310627g = e4m.b.b(new xs6.a(this, 2, i));
        this.f310628h = e4m.b.b(new xs6.a(this, 1, i));
        this.i = e4m.b.b(new xs6.a(this, 3, i));
    }

    public final n3d.c a() {
        return (n3d.c) this.f.get();
    }
}
