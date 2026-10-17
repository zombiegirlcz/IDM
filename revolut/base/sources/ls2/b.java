package ls2;

import e4m.e;
import iri.j;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f199601a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f199602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f199603c;
    public final e d;
    public final e e;

    public b(hri.b bVar) {
        int i = 5;
        this.f199602b = e4m.b.b(new a9i.b(this, 0, i));
        this.f199603c = e4m.b.b(new a9i.b(this, 1, i));
        this.d = e4m.b.b(new a9i.b(this, 2, i));
        this.e = e4m.b.b(new a9i.b(this, 3, i));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f199603c.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f199602b.get();
    }
}
