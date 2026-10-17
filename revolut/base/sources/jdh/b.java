package jdh;

import com.google.common.collect.ImmutableMap;
import kyk.x;
import ldh.f;
import ldh.i;
import m2b.e;
import nel.z;
import ufh.j;
import vc.s;
import vrl.g;
import ybl.d;
import zdl.c;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f173073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9h.a f173074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rgh.a f173075c;
    public final trl.a d;
    public final x e;
    public final e f;

    public b(e eVar, h9h.a aVar, x xVar, trl.a aVar2, c cVar, rgh.a aVar3) {
        this.f173073a = cVar;
        this.f173074b = aVar;
        this.f173075c = aVar3;
        this.d = aVar2;
        this.e = xVar;
        this.f = eVar;
    }

    public final kbb.c a() {
        rgh.a aVar = this.f173075c;
        z zVar = z.EQUITY;
        svk.a aVar2 = new svk.a(((prk.a) aVar.f254184a).f239043g.c());
        z zVar2 = z.FUND;
        j jVar = aVar.f254185b;
        trl.a aVar3 = jVar.f279864a;
        vrl.b bVar = (vrl.b) aVar3.Q.get();
        s.j(bVar);
        g gVarB = aVar3.b();
        s.j(gVarB);
        d dVarH = jVar.f279865b.h();
        s.j(dVarH);
        ImmutableMap immutableMapOf = ImmutableMap.of(zVar, (vfh.e) aVar2, zVar2, new vfh.e(bVar, gVarB, dVarH));
        s.j(immutableMapOf);
        trl.a aVar4 = this.d;
        udf.a aVar5 = (udf.a) aVar4.F.get();
        s.j(aVar5);
        vrl.b bVar2 = (vrl.b) aVar4.Q.get();
        s.j(bVar2);
        i iVar = new i(aVar5, bVar2);
        c1l.e eVarA = this.e.a();
        a2b.b bVarF = this.f.f();
        s.j(bVarF);
        return new kbb.c(immutableMapOf, iVar, new f(eVarA, bVarF));
    }

    public final kdh.b b() {
        ybl.b bVarB = this.f173073a.b();
        s.j(bVarB);
        return new kdh.b(new kdh.a(bVarB), this.f173074b.w());
    }
}
