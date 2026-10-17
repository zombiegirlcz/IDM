package w2i;

import com.google.common.collect.ImmutableSet;
import ei5.d;
import hn.h;
import java.util.Collection;
import l70.e;
import mp.r;
import qud.c;
import rkd.g;
import v0i.j;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements hri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f294058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f294059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4i.a f294060c;
    public final v0i.b d;
    public final efk.a e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z7l.a f294061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final npk.a f294062h;
    public final kde.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f294063j;
    public final ite.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ore.b f294064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f294065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f294066n;
    public final nj0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ee0.a f294067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final an0.c f294068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f294069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qga.a f294070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qga.b f294071t;
    public final vn.a u;
    public final b v = this;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f294072w = e4m.b.b(new vy9.a(this, 0, 3));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f294073x = e4m.b.b(new vy9.a(this, 1, 3));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f294074y = e4m.b.b(new vy9.a(this, 2, 3));
    public final e4m.e z = e4m.b.b(new vy9.a(this, 3, 3));
    public final e4m.e A = e4m.b.b(new vy9.a(this, 4, 3));
    public final e4m.e B = e4m.b.b(new vy9.a(this, 5, 3));
    public final e4m.e C = e4m.b.b(new vy9.a(this, 6, 3));
    public final e4m.e D = e4m.b.b(new vy9.a(this, 7, 3));
    public final e4m.e E = e4m.b.b(new vy9.a(this, 8, 3));
    public final e4m.e F = e4m.b.b(new vy9.a(this, 9, 3));
    public final e4m.e G = e4m.b.b(new vy9.a(this, 10, 3));
    public final e4m.e H = e4m.b.b(new vy9.a(this, 11, 3));
    public final e4m.e I = e4m.b.b(new vy9.a(this, 12, 3));
    public final e4m.e J = e4m.b.b(new vy9.a(this, 13, 3));

    public b(hri.b bVar, j jVar, v0i.b bVar2, ee0.a aVar, an0.c cVar, e eVar, efk.a aVar2, j4i.a aVar3, ite.a aVar4, xmg.a aVar5, qga.b bVar3, qga.a aVar6, npk.a aVar7, ore.b bVar4, d dVar, c cVar2, g gVar, nj0.a aVar8, kde.a aVar9, vn.a aVar10, z7l.a aVar11) {
        this.f294058a = bVar;
        this.f294059b = eVar;
        this.f294060c = aVar3;
        this.d = bVar2;
        this.e = aVar2;
        this.f = aVar5;
        this.f294061g = aVar11;
        this.f294062h = aVar7;
        this.i = aVar9;
        this.f294063j = cVar2;
        this.k = aVar4;
        this.f294064l = bVar4;
        this.f294065m = dVar;
        this.f294066n = jVar;
        this.o = aVar8;
        this.f294067p = aVar;
        this.f294068q = cVar;
        this.f294069r = gVar;
        this.f294070s = aVar6;
        this.f294071t = bVar3;
        this.u = aVar10;
    }

    public final qm.e a() {
        return new qm.e((um.c) this.A.get());
    }

    public final jn.e b() {
        ln.a aVar = (ln.a) this.C.get();
        h hVar = (h) this.B.get();
        t70.g gVarO = this.f294059b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final iri.j e() {
        return (iri.j) this.f294073x.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f294072w.get();
    }
}
