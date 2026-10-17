package did;

import zxb.j0;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f115050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f115051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ila.b f115052c;
    public final e4m.e d;
    public final e4m.e e;

    public q(ila.b bVar, ite.a aVar, j0 j0Var) {
        this.f115050a = aVar;
        this.f115051b = j0Var;
        this.f115052c = bVar;
        int i = 19;
        this.d = e4m.b.b(new cbb.b(this, 0, i));
        this.e = e4m.b.b(new cbb.b(this, 1, i));
    }

    public final h4g.g a() {
        return b();
    }

    public final h4g.g b() {
        gte.a aVarB = this.f115050a.b();
        vc.s.j(aVarB);
        eub.a aVarA = this.f115051b.a();
        vc.s.j(aVarA);
        return new h4g.g(aVarB, aVarA, this.f115052c.a(), 1);
    }
}
