package jk8;

import a0e.w;
import ffk.t;
import kk8.k;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f175123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f175124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bpj.a f175125c;
    public final nj0.a d;
    public final efk.a e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l70.e f175126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jk3.c f175127h;
    public final a i = this;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f175128j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f175129l;

    public a(l70.e eVar, nj0.a aVar, bpj.a aVar2, se8.a aVar3, efk.a aVar4, xmg.a aVar5, jk3.c cVar, ee0.a aVar6, an0.c cVar2) {
        this.f175123a = aVar6;
        this.f175124b = cVar2;
        this.f175125c = aVar2;
        this.d = aVar;
        this.e = aVar4;
        this.f = aVar5;
        this.f175126g = eVar;
        this.f175127h = cVar;
        int i = 21;
        this.f175128j = e4m.b.b(new ibh.a(this, 0, i));
        this.k = e4m.b.b(new ibh.a(this, 1, i));
        this.f175129l = e4m.b.b(new ibh.a(this, 2, i));
    }

    public final k a() {
        nj0.d dVar = (nj0.d) this.d;
        ik0.b bVarM = dVar.m();
        s.j(bVarM);
        gk8.d dVar2 = new gk8.d(g.a(dVar.d(), bVarM), (ue0.c) this.f175128j.get());
        xoj.a aVarA = this.f175125c.a();
        s.j(aVarA);
        t tVarF = this.e.f();
        s.j(tVarF);
        ang.f fVarE = this.f.e();
        l80.e eVarH = this.f175126g.h();
        s.j(eVarH);
        w wVar = new w(eVarH, 4);
        fk3.a aVarA2 = this.f175127h.a();
        s.j(aVarA2);
        return new k(dVar2, aVarA, tVarF, fVarE, wVar, aVarA2);
    }
}
