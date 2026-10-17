package y77;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import om4.d0;
import vc.s;
import xsl.q;
import yji.n;
import z0h.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h87.d f311349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j87.b f311350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f311351c;
    public final c d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f311352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f311353h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f311354j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f311355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f311356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f311357n;
    public final e4m.e o;

    public a(c cVar, d dVar, h87.d dVar2, j87.b bVar, s1 s1Var) {
        this.d = cVar;
        this.f311349a = dVar2;
        this.f311350b = bVar;
        this.f311351c = s1Var;
        this.e = e4m.b.b(new q(cVar, this, 2, 9));
        this.f = e4m.b.b(new q(cVar, this, 1, 9));
        this.f311352g = e4m.b.b(new q(cVar, this, 0, 9));
        this.f311353h = e4m.b.b(new q(cVar, this, 5, 9));
        this.i = e4m.b.b(new q(cVar, this, 4, 9));
        this.f311354j = e4m.b.b(new q(cVar, this, 3, 9));
        this.k = e4m.b.b(new q(cVar, this, 6, 9));
        this.f311355l = e4m.b.b(new q(cVar, this, 7, 9));
        this.f311356m = e4m.b.b(new q(cVar, this, 8, 9));
        this.f311357n = e4m.b.b(new q(cVar, this, 10, 9));
        this.o = e4m.b.b(new q(cVar, this, 9, 9));
    }

    public final ou5.b b() {
        c cVar = this.d;
        yhl.e eVar = (yhl.e) cVar.d.E.get();
        s.j(eVar);
        zjh.c cVarA = cVar.e.a();
        e9h.d dVarD = cVar.f311362b.D();
        mk0.a aVarA = cVar.f.a();
        s.j(aVarA);
        d0 d0Var = new d0(aVarA);
        gte.a aVarB = cVar.f311364g.b();
        s.j(aVarB);
        return new ou5.b(eVar, cVarA, dVarD, d0Var, aVarB);
    }

    @Override // xki.e
    public final Set f() {
        n nVar = (n) this.f311355l.get();
        n nVar2 = (n) this.f311356m.get();
        aah.h hVar = (aah.h) this.k.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((aah.h) nVar, (aah.h) nVar2, hVar);
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f311352g.get();
        yji.d dVar2 = (yji.d) this.f311354j.get();
        aah.i iVarD = ((u8h.b) this.d.f311366j).d();
        s.j(iVarD);
        return ImmutableSet.of((aah.g) dVar, (aah.g) dVar2, a0k.b.l(iVarD, this.f311351c, (aah.h) this.k.get()));
    }
}
