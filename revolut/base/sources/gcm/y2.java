package gcm;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes22.dex */
public final class y2 extends ecm.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.l0 f142972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.e f142973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f142974c;
    public final ecm.p1 d;
    public final ecm.v e;
    public ecm.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ecm.i f142975g;

    public y2(ecm.l0 l0Var, d3 d3Var, Executor executor, ecm.p1 p1Var, ecm.d dVar) {
        this.f142972a = l0Var;
        this.f142973b = d3Var;
        this.d = p1Var;
        Executor executor2 = dVar.f124791b;
        executor = executor2 != null ? executor2 : executor;
        this.f142974c = executor;
        oe.c cVarB = ecm.d.b(dVar);
        cVarB.f224498b = executor;
        this.f = new ecm.d(cVarB);
        this.e = ecm.v.b();
    }

    @Override // ecm.y1, ecm.i
    public final void a(String str, Throwable th10) {
        ecm.i iVar = this.f142975g;
        if (iVar != null) {
            iVar.a(str, th10);
        }
    }

    @Override // ecm.i
    public final void e(ecm.h hVar, ecm.m1 m1Var) {
        ecm.d dVar = this.f;
        v2 v2Var = k3.i0;
        ecm.p1 p1Var = this.d;
        r10.a aVarA = this.f142972a.a();
        ecm.g2 g2Var = (ecm.g2) aVarA.f250811a;
        if (!g2Var.e()) {
            this.f142974c.execute(new n0(this, hVar, p1.h(g2Var)));
            this.f142975g = k3.j0;
            return;
        }
        q3 q3Var = (q3) aVarA.f250812b;
        o3 o3Var = (o3) q3Var.f142837b.get(p1Var.f124857b);
        if (o3Var == null) {
            o3Var = (o3) q3Var.f142838c.get(p1Var.f124858c);
        }
        if (o3Var == null) {
            o3Var = q3Var.f142836a;
        }
        if (o3Var != null) {
            this.f = this.f.c(o3.f142792g, o3Var);
        }
        ecm.i iVarF = this.f142973b.f(p1Var, this.f);
        this.f142975g = iVarF;
        iVarF.e(hVar, m1Var);
    }

    @Override // ecm.y1
    public final ecm.i f() {
        return this.f142975g;
    }
}
