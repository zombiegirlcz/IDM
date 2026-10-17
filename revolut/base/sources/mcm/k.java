package mcm;

import com.google.common.base.Preconditions;
import ecm.a1;
import ecm.r0;
import ecm.u0;
import ecm.x0;
import ecm.y0;
import ecm.z0;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204392a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f204393b;

    public k(u0 u0Var) {
        this.f204393b = (u0) Preconditions.checkNotNull(u0Var, "helper");
    }

    @Override // mcm.c, ecm.u0
    public x0 a(r0 r0Var) {
        switch (this.f204392a) {
            case 0:
                z0 z0Var = (z0) r0Var.a(a1.f124777c);
                x0 x0VarA = super.a(r0Var);
                if (z0Var != null) {
                    return x0VarA.c().f124780a.get(a1.d) == null ? new j(x0VarA, z0Var) : x0VarA;
                }
                return x0VarA;
            default:
                return super.a(r0Var);
        }
    }

    @Override // mcm.c, ecm.u0
    public void f(ecm.r rVar, y0 y0Var) {
        switch (this.f204392a) {
            case 1:
                l lVar = (l) this.f204393b;
                c0 c0Var = lVar.e;
                if (c0Var.f.containsKey(lVar.f204394a)) {
                    lVar.f204396c = rVar;
                    lVar.d = y0Var;
                    if (!c0Var.f204375h) {
                        if (rVar == ecm.r.IDLE) {
                            lVar.f204395b.e();
                        }
                        c0Var.j();
                    }
                    break;
                }
                break;
            default:
                super.f(rVar, y0Var);
                break;
        }
    }

    @Override // mcm.c
    public final u0 g() {
        switch (this.f204392a) {
            case 0:
                return (u0) this.f204393b;
            default:
                return ((l) this.f204393b).e.f204374g;
        }
    }

    public k(l lVar) {
        this.f204393b = lVar;
    }
}
