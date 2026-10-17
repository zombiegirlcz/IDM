package hjf;

import fw2.l;
import mjf.u;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f152762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f152763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f152764c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f152765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f152766h;

    public b(an0.c cVar, ee0.a aVar, nj0.a aVar2) {
        this.f152762a = aVar2;
        this.f152763b = aVar;
        this.f152764c = cVar;
        int i = 22;
        this.d = e4m.b.b(new l(this, 1, i));
        this.e = e4m.b.b(new l(this, 2, i));
        this.f = e4m.b.b(new l(this, 3, i));
        this.f152765g = e4m.b.b(new l(this, 0, i));
        this.f152766h = e4m.b.b(new l(this, 4, i));
    }

    public final u a() {
        return (u) this.f152765g.get();
    }
}
