package voa;

import c21.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f290923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f290924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f290925c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f290926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f290927h;

    public a(b bVar, ee0.a aVar, e eVar, an0.c cVar) {
        this.f290923a = eVar;
        this.f290924b = aVar;
        this.f290925c = cVar;
        int i = 26;
        this.d = e4m.b.b(new uhc.a(this, 2, i));
        this.e = e4m.b.b(new uhc.a(this, 3, i));
        this.f = e4m.b.b(new uhc.a(this, 4, i));
        this.f290926g = e4m.b.b(new uhc.a(this, 1, i));
        this.f290927h = e4m.b.b(new uhc.a(this, 0, i));
    }

    public final toa.a a() {
        return (toa.a) this.f290927h.get();
    }
}
