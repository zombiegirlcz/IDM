package nv1;

import hw1.v;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f219425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f219426b;

    public l(g gVar, m mVar) {
        this.f219425a = gVar;
        this.f219426b = mVar;
    }

    @Override // phm.a
    public final Object get() {
        m mVar = this.f219426b;
        g gVar = mVar.f219428b;
        lx1.d dVarB = ((ey1.e) gVar.f219404n).b();
        vc.s.j(dVarB);
        cl3.a aVarD = gVar.f219405p.d();
        vc.s.j(aVarD);
        return new hw1.u(new hw1.g(dVarB, aVarD), mVar.f219427a, (yu1.a) this.f219425a.C.get(), new v());
    }
}
