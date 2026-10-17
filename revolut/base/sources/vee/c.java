package vee;

import da3.j;
import l70.e;
import tz2.d;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f288309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f288310c;
    public final jk3.c d;
    public final d e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ede.b f288311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ite.a f288312h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f288313j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f288314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f288315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f288316n;
    public final Object o;

    public c(hri.b bVar, e eVar, ede.b bVar2, j jVar, jk3.c cVar, d dVar, xmg.a aVar, ite.a aVar2, int i) {
        this.f288308a = i;
        switch (i) {
            case 1:
                this.o = this;
                this.f288309b = eVar;
                this.f288310c = jVar;
                this.d = cVar;
                this.e = dVar;
                this.f = aVar;
                this.f288311g = bVar2;
                this.f288312h = aVar2;
                int i2 = 25;
                this.i = e4m.b.b(new vy9.a(this, 0, i2));
                this.f288313j = e4m.b.b(new vy9.a(this, 1, i2));
                this.k = e4m.b.b(new vy9.a(this, 2, i2));
                this.f288314l = e4m.b.b(new vy9.a(this, 3, i2));
                this.f288315m = e4m.b.b(new vy9.a(this, 4, i2));
                this.f288316n = e4m.b.b(new vy9.a(this, 5, i2));
                break;
            default:
                this.o = this;
                this.f288309b = eVar;
                this.f288310c = jVar;
                this.d = cVar;
                this.e = dVar;
                this.f = aVar;
                this.f288311g = bVar2;
                this.f288312h = aVar2;
                int i3 = 8;
                this.i = e4m.b.b(new v4d.a(this, 0, i3));
                this.f288313j = e4m.b.b(new v4d.a(this, 1, i3));
                this.k = e4m.b.b(new v4d.a(this, 2, i3));
                this.f288314l = e4m.b.b(new v4d.a(this, 3, i3));
                this.f288315m = e4m.b.b(new v4d.a(this, 4, i3));
                this.f288316n = e4m.b.b(new v4d.a(this, 5, i3));
                break;
        }
    }

    @Override // hri.a
    public final iri.j e() {
        switch (this.f288308a) {
        }
        return (iri.j) this.f288313j.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        switch (this.f288308a) {
        }
        return (ifm.b) this.i.get();
    }
}
