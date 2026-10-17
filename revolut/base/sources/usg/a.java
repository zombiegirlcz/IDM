package usg;

import atg.l;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmg.a f282900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f282901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final npk.a f282902c;
    public final jk3.c d;
    public final gz5.c e;
    public final aa1.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282903g = e4m.b.b(new pbb.a(18));

    public a(gz5.c cVar, jk3.c cVar2, npk.a aVar, b bVar, aa1.a aVar2, xmg.a aVar3) {
        this.f282900a = aVar3;
        this.f282901b = bVar;
        this.f282902c = aVar;
        this.d = cVar2;
        this.e = cVar;
        this.f = aVar2;
    }

    public final wsg.b a() {
        atg.i iVar = (atg.i) this.f282901b.i.get();
        s.j(iVar);
        return new wsg.b(iVar, this.f282900a.e());
    }

    public final n b() {
        ang.f fVarE = this.f282900a.e();
        b bVar = this.f282901b;
        qsg.b bVarB = bVar.b();
        s.j(bVarB);
        l lVar = (l) bVar.k.get();
        s.j(lVar);
        ppk.f fVarA = this.f282902c.a();
        fk3.a aVarA = this.d.a();
        s.j(aVarA);
        ez5.b bVar2 = (ez5.b) this.e.e.get();
        s.j(bVar2);
        return new n(fVarE, bVarB, lVar, fVarA, aVarA, bVar2, this.f.a());
    }
}
