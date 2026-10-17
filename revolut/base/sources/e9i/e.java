package e9i;

import dw3.f6;
import iri.j;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f124020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f124021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pqi.a f124022c;
    public final e d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f124023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f124024h;

    public e(hri.b bVar, pqi.a aVar, l70.e eVar, nj0.a aVar2) {
        this.f124020a = eVar;
        this.f124021b = aVar2;
        this.f124022c = aVar;
        int i = 15;
        this.e = e4m.b.b(new f6(this, 0, i));
        this.f = e4m.b.b(new f6(this, 1, i));
        this.f124023g = e4m.b.b(new f6(this, 2, i));
        this.f124024h = e4m.b.b(new f6(this, 3, i));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.e.get();
    }
}
