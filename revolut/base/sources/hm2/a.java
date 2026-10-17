package hm2;

import ffk.t;
import fma.h;
import jge.j;
import r10.v;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f153507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cm2.a f153508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei5.d f153509c;
    public final gke.a d;
    public final s19.a e;
    public final ibb.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f153510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final efk.a f153511h;
    public final xmg.a i;

    public a(h hVar, j jVar, s19.a aVar, cm2.a aVar2, gke.a aVar3, ei5.d dVar, ibb.b bVar, efk.a aVar4, xmg.a aVar5) {
        this.f153507a = jVar;
        this.f153508b = aVar2;
        this.f153509c = dVar;
        this.d = aVar3;
        this.e = aVar;
        this.f = bVar;
        this.f153510g = hVar;
        this.f153511h = aVar4;
        this.i = aVar5;
    }

    public final v a() {
        rla.c cVar = (rla.c) this.f153510g.C.get();
        s.j(cVar);
        efk.a aVar = this.f153511h;
        t tVarF = aVar.f();
        s.j(tVarF);
        sfk.a aVarE = aVar.e();
        s.j(aVarE);
        return new v(cVar, tVarF, aVarE);
    }
}
