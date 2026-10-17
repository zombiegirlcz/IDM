package ymg;

import e4m.e;
import xf6.a1;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f314988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f314989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final asi.b f314990c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f314991g;

    public a(ee0.a aVar, an0.c cVar, asi.b bVar) {
        this.f314988a = aVar;
        this.f314989b = cVar;
        this.f314990c = bVar;
        int i = 24;
        this.d = e4m.b.b(new a1(this, 2, i));
        this.e = e4m.b.b(new a1(this, 3, i));
        this.f = e4m.b.b(new a1(this, 1, i));
        this.f314991g = e4m.b.b(new a1(this, 0, i));
    }

    public final cng.b a() {
        return (cng.b) this.f314991g.get();
    }

    public final hng.b b() {
        return (hng.b) this.f.get();
    }
}
