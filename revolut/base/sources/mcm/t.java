package mcm;

import ecm.g2;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends a {
    public final /* synthetic */ ecm.n e;
    public final /* synthetic */ v f;

    public t(v vVar, ecm.n nVar) {
        this.f = vVar;
        this.e = nVar;
    }

    @Override // ecm.e0
    public final void p(g2 g2Var) {
        n nVar = this.f.f204415a;
        boolean zE = g2Var.e();
        s sVar = nVar.f204399a;
        if (sVar.e != null || sVar.f != null) {
            if (zE) {
                ((AtomicLong) nVar.f204400b.f174461b).getAndIncrement();
            } else {
                ((AtomicLong) nVar.f204400b.f174462c).getAndIncrement();
            }
        }
        this.e.p(g2Var);
    }
}
