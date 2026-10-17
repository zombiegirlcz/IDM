package qhh;

import e4m.b;
import e4m.e;
import prk.u;
import t1h.i;
import t1h.j;
import t1h.k;
import zdl.c;
import zdl.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements rzg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f246605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f246606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9h.a f246607c;
    public final f d;
    public final e e = b.b(new u(this, 0, 22));
    public final e f = b.b(new u(this, 1, 22));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f246608g = b.b(new u(this, 2, 22));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f246609h = b.b(new u(this, 3, 22));
    public final e i = b.b(new u(this, 4, 22));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f246610j = b.b(new u(this, 5, 22));

    public a(phh.a aVar, ite.a aVar2, h9h.a aVar3, c cVar, f fVar) {
        this.f246605a = cVar;
        this.f246606b = aVar2;
        this.f246607c = aVar3;
        this.d = fVar;
    }

    @Override // rzg.a
    public final t1h.c a() {
        return (t1h.c) this.f.get();
    }

    @Override // rzg.a
    public final k b() {
        return (k) this.f246610j.get();
    }

    @Override // rzg.a
    public final i c() {
        return (i) this.e.get();
    }

    @Override // rzg.a
    public final g5f.b d() {
        return (g5f.b) this.i.get();
    }

    @Override // rzg.a
    public final t1h.a e() {
        return (t1h.a) this.f246609h.get();
    }

    @Override // rzg.a
    public final j f() {
        return (j) this.f246608g.get();
    }
}
