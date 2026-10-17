package dx2;

import da3.j;
import dw3.f6;
import jk3.c;
import l70.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f120534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f120535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f120536c;
    public final b d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f120537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f120538h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f120539j;

    public b(hri.b bVar, e eVar, j jVar, c cVar) {
        this.f120534a = eVar;
        this.f120535b = jVar;
        this.f120536c = cVar;
        int i = 3;
        this.e = e4m.b.b(new f6(this, 0, i));
        this.f = e4m.b.b(new f6(this, 1, i));
        this.f120537g = e4m.b.b(new f6(this, 2, i));
        this.f120538h = e4m.b.b(new f6(this, 3, i));
        this.i = e4m.b.b(new f6(this, 4, i));
        this.f120539j = e4m.b.b(new f6(this, 5, i));
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.e.get();
    }
}
