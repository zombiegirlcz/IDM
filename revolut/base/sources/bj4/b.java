package bj4;

import iri.j;
import l70.e;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f15557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15558b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f15559c = e4m.b.b(new a9i.b(this, 0, 1));
    public final e4m.e d = e4m.b.b(new a9i.b(this, 1, 1));
    public final e4m.e e = e4m.b.b(new a9i.b(this, 2, 1));

    public b(hri.b bVar, e eVar) {
        this.f15557a = eVar;
    }

    @Override // hri.a
    public final j e() {
        return (j) this.d.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f15559c.get();
    }
}
