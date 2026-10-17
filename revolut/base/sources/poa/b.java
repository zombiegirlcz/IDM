package poa;

import c21.e;
import iri.j;
import pl1.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f237951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vxd.b f237952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f237953c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f237954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f237955h;

    public b(hri.b bVar, e eVar, vxd.b bVar2) {
        this.f237951a = eVar;
        this.f237952b = bVar2;
        int i = 4;
        this.d = e4m.b.b(new h(this, 0, i));
        this.e = e4m.b.b(new h(this, 1, i));
        this.f = e4m.b.b(new h(this, 3, i));
        this.f237954g = e4m.b.b(new h(this, 4, i));
        this.f237955h = e4m.b.b(new h(this, 2, i));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.e.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.d.get();
    }
}
