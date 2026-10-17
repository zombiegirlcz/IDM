package xs6;

import c21.e;
import gr6.i;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f308422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f308423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f308424c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f308425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f308426h;
    public final e4m.e i;

    public b(d dVar, e eVar) {
        this.f308422a = dVar;
        this.f308423b = eVar;
        int i = 0;
        this.f308424c = e4m.b.b(new a(this, 4, i));
        this.d = e4m.b.b(new a(this, 3, i));
        this.e = e4m.b.b(new a(this, 2, i));
        this.f = e4m.b.b(new a(this, 5, i));
        this.f308425g = e4m.b.b(new a(this, 6, i));
        this.f308426h = e4m.b.b(new a(this, 1, i));
        this.i = e4m.b.b(new a(this, 0, i));
    }

    public final i a() {
        return (i) this.i.get();
    }
}
