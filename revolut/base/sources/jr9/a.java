package jr9;

import jm4.o3;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djf.c f177948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pqi.a f177949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vl3.n f177950c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f177951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f177952h;

    public a(pqi.a aVar, djf.c cVar, vl3.n nVar) {
        this.f177948a = cVar;
        this.f177949b = aVar;
        this.f177950c = nVar;
        int i = 9;
        this.d = e4m.b.b(new o3(this, 1, i));
        this.e = e4m.b.b(new o3(this, 0, i));
        this.f = e4m.b.b(new o3(this, 2, i));
        this.f177951g = e4m.b.b(new o3(this, 3, i));
        this.f177952h = e4m.b.b(new o3(this, 4, i));
    }

    public final nq9.a a() {
        return (nq9.a) this.e.get();
    }

    public final nq9.b b() {
        return (nq9.b) this.f177952h.get();
    }

    public final nq9.c c() {
        return (nq9.c) this.d.get();
    }
}
