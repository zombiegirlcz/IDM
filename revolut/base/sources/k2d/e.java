package k2d;

import jqa.m;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4d.a f180477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1d.b f180478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2d.c f180479c;
    public final c d;
    public final e4m.e e;
    public final e4m.e f;

    public e(a2d.c cVar, m4d.a aVar, y1d.b bVar, c cVar2) {
        this.f180477a = aVar;
        this.f180478b = bVar;
        this.f180479c = cVar;
        this.d = cVar2;
        int i = 11;
        this.e = e4m.b.b(new m(this, 0, i));
        this.f = e4m.b.b(new m(this, 1, i));
        e4m.b.b(new m(this, 2, i));
    }

    public final efd.a a() {
        return (efd.a) this.e.get();
    }

    public final ffd.a b() {
        return (ffd.a) this.f.get();
    }
}
