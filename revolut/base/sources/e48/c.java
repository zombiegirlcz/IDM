package e48;

import dw3.f6;
import g48.r0;
import r6e.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f122411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xmg.a f122412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ika.f f122413c;
    public final usg.a d;
    public final u06.a e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oda.d f122414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f122415h;
    public final e4m.e i;

    public c(a aVar, ika.f fVar, usg.a aVar2, a0 a0Var, u06.a aVar3, oda.d dVar, xmg.a aVar4) {
        this.f122411a = aVar;
        this.f122412b = aVar4;
        this.f122413c = fVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = a0Var;
        this.f122414g = dVar;
        int i = 6;
        this.f122415h = e4m.b.b(new f6(this, 1, i));
        this.i = e4m.b.b(new f6(this, 0, i));
    }

    public final k38.a a() {
        return (k38.a) this.f122415h.get();
    }

    public final x48.k b() {
        q06.d dVarA = this.e.a();
        vc.s.j(dVarA);
        r0 r0VarC = this.f122411a.c();
        wsg.b bVarA = this.d.a();
        g6e.d dVarB = this.f.b();
        vc.s.j(dVarB);
        return new x48.k(dVarA, r0VarC, bVarA, dVarB, this.f122414g.f());
    }

    public final o38.a c() {
        return (o38.a) this.i.get();
    }
}
