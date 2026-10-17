package ui3;

import iri.j;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements hri.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f280304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f280305b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f280306c = e4m.b.b(new tn3.a(this, 0, 19));
    public final e4m.e d = e4m.b.b(new tn3.a(this, 1, 19));
    public final e4m.e e = e4m.b.b(new tn3.a(this, 2, 19));
    public final e4m.e f = e4m.b.b(new tn3.a(this, 5, 19));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f280307g = e4m.b.b(new tn3.a(this, 4, 19));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f280308h = e4m.b.b(new tn3.a(this, 3, 19));

    public e(hri.b bVar, l70.e eVar) {
        this.f280304a = eVar;
    }

    @Override // ui3.a
    public final b05.a G() {
        return new b05.a(this.f280305b, 7);
    }

    @Override // hri.a
    public final j e() {
        return (j) this.d.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f280306c.get();
    }
}
