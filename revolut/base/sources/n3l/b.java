package n3l;

import iri.j;
import l70.e;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f212195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rta.b f212196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final poi.b f212197c;
    public final cri.b d;
    public final b e = this;
    public final e4m.e f = e4m.b.b(new mil.a(this, 0, 16));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f212198g = e4m.b.b(new mil.a(this, 1, 16));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f212199h = e4m.b.b(new mil.a(this, 3, 16));
    public final e4m.e i = e4m.b.b(new mil.a(this, 2, 16));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f212200j = e4m.b.b(new mil.a(this, 6, 16));
    public final e4m.e k = e4m.b.b(new mil.a(this, 5, 16));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f212201l = e4m.b.b(new mil.a(this, 4, 16));

    public b(hri.b bVar, e eVar, poi.b bVar2, rta.b bVar3, cri.b bVar4) {
        this.f212195a = eVar;
        this.f212196b = bVar3;
        this.f212197c = bVar2;
        this.d = bVar4;
    }

    @Override // hri.a
    public final j e() {
        return (j) this.f212198g.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f.get();
    }
}
