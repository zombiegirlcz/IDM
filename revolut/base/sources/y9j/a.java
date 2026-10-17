package y9j;

import e4m.e;
import mw5.l;
import xf6.a1;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmg.a f311858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dc5.a f311859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f311860c;
    public final l d;
    public final cri.b e;
    public final a f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f311861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f311862h;

    public a(dc5.a aVar, l lVar, cri.b bVar, ite.a aVar2, xmg.a aVar3) {
        this.f311858a = aVar3;
        this.f311859b = aVar;
        this.f311860c = aVar2;
        this.d = lVar;
        this.e = bVar;
        int i = 19;
        this.f311861g = e4m.b.b(new a1(this, 0, i));
        this.f311862h = e4m.b.b(new a1(this, 1, i));
    }

    public final w9j.a a() {
        return (w9j.a) this.f311861g.get();
    }

    public final w9j.e b() {
        return (w9j.e) this.f311862h.get();
    }
}
