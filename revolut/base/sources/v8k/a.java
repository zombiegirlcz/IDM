package v8k;

import mri.w;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.e f286773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c21.e f286774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xmg.a f286775c;
    public final usg.a d;
    public final cri.d e;
    public final h4e.a f;

    public a(l70.e eVar, q7k.c cVar, c21.e eVar2, xmg.a aVar, usg.a aVar2, cri.d dVar, h4e.a aVar3) {
        this.f286773a = eVar;
        this.f286774b = eVar2;
        this.f286775c = aVar;
        this.d = aVar2;
        this.e = dVar;
        this.f = aVar3;
        e4m.b.b(new pbb.a(20));
    }

    public final y8k.b a() {
        l80.e eVarH = this.f286773a.h();
        s.j(eVarH);
        return new y8k.b(eVarH);
    }

    public final y8k.c b() {
        return new y8k.c(new p7k.b());
    }

    public final x8k.c c() {
        c21.b bVar = (c21.b) this.f286774b;
        y71.a aVar = (y71.a) bVar.f20589y.get();
        s.j(aVar);
        y71.c cVar = (y71.c) bVar.f20585w.get();
        s.j(cVar);
        ang.f fVarE = this.f286775c.e();
        n nVarB = this.d.b();
        z80.b bVarS = this.f286773a.s();
        s.j(bVarS);
        w wVarA = ((ozl.a) this.e).a();
        s.j(wVarA);
        return new x8k.c(aVar, cVar, fVarE, nVarB, bVarS, wVarA, this.f.b());
    }
}
