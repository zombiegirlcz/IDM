package mcm;

import com.google.common.base.Preconditions;
import ecm.a1;
import ecm.r0;
import ecm.u0;
import ecm.x0;
import ecm.y0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204379a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f204380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f204381c;

    public f(i iVar) {
        this.f204381c = iVar;
    }

    @Override // mcm.c, ecm.u0
    public x0 a(r0 r0Var) {
        switch (this.f204379a) {
            case 1:
                y yVar = (y) this.f204381c;
                HashMap map = yVar.f204421g;
                w wVar = new w(yVar, r0Var, (k) this.f204380b);
                List list = r0Var.f124864a;
                if (y.g(list) && map.containsKey(((ecm.z) list.get(0)).f124900a.get(0))) {
                    n nVar = (n) map.get(((ecm.z) list.get(0)).f124900a.get(0));
                    nVar.a(wVar);
                    if (nVar.d != null) {
                        wVar.k();
                    }
                }
                return wVar;
            default:
                return super.a(r0Var);
        }
    }

    @Override // mcm.c, ecm.u0
    public final void f(ecm.r rVar, y0 y0Var) {
        switch (this.f204379a) {
            case 0:
                a1 a1Var = (a1) this.f204380b;
                i iVar = (i) this.f204381c;
                a1 a1Var2 = iVar.k;
                if (a1Var == a1Var2) {
                    Preconditions.checkState(iVar.f204389n, "there's pending lb while current lb has been out of READY");
                    iVar.f204387l = rVar;
                    iVar.f204388m = y0Var;
                    if (rVar == ecm.r.READY) {
                        iVar.h();
                    }
                } else if (a1Var == iVar.i) {
                    boolean z = rVar == ecm.r.READY;
                    iVar.f204389n = z;
                    if (z || a1Var2 == iVar.f) {
                        iVar.f204384g.f(rVar, y0Var);
                    } else {
                        iVar.h();
                    }
                }
                break;
            default:
                ((k) this.f204380b).f(rVar, new gcm.h(y0Var, 1));
                break;
        }
    }

    @Override // mcm.c
    public final u0 g() {
        switch (this.f204379a) {
            case 0:
                return ((i) this.f204381c).f204384g;
            default:
                return (k) this.f204380b;
        }
    }

    public f(y yVar, u0 u0Var) {
        this.f204381c = yVar;
        this.f204380b = new k(u0Var);
    }
}
