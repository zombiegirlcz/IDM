package mb3;

import android.content.Context;
import kl.t1;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bpj.a f204061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f204062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.a f204063c;
    public final an0.c d;
    public final Context e;
    public final f49.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xmg.a f204064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l70.e f204065h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f204066j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f204067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f204068m;

    public i(bpj.a aVar, an0.c cVar, ee0.a aVar2, nj0.a aVar3, f49.a aVar4, xmg.a aVar5, l70.e eVar, Context context) {
        this.f204061a = aVar;
        this.f204062b = aVar3;
        this.f204063c = aVar2;
        this.d = cVar;
        this.e = context;
        this.f = aVar4;
        this.f204064g = aVar5;
        this.f204065h = eVar;
        int i = 22;
        this.i = e4m.b.b(new lal.j(this, 2, i));
        this.f204066j = e4m.b.b(new lal.j(this, 1, i));
        this.k = e4m.b.b(new lal.j(this, 3, i));
        this.f204067l = e4m.b.b(new lal.j(this, 0, i));
        this.f204068m = e4m.b.b(new lal.j(this, 4, i));
    }

    public final d4f.s a() {
        xoj.a aVarA = this.f204061a.a();
        vc.s.j(aVarA);
        return new d4f.s(aVarA, 1);
    }

    public final t1 b() {
        return new t1(new jb3.d(m4d.e.q(m4d.e.m(c.a(), ((nj0.d) this.f204062b).f())), d(), new jb3.a()));
    }

    public final nb3.b c() {
        f49.a aVar = this.f;
        w39.b bVarA = aVar.a();
        vc.s.j(bVarA);
        ang.f fVarE = this.f204064g.e();
        jb3.j jVar = (jb3.j) this.f204067l.get();
        d49.a aVar2 = (d49.a) aVar.f132031l.get();
        vc.s.j(aVar2);
        return new nb3.b(bVarA, fVarE, jVar, aVar2);
    }

    public final xe0.e d() {
        ee0.a aVar = this.f204063c;
        le0.b bVarC = aVar.c();
        vc.s.j(bVarC);
        kg.o oVarA = c.a();
        yk0.a aVarB = this.d.b();
        vc.s.j(aVarB);
        xe0.f fVarF = aVar.f();
        vc.s.j(fVarF);
        return m4d.e.u(oVarA, bVarC, fVarF, aVarB);
    }
}
