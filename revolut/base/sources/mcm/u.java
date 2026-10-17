package mcm;

import ecm.g2;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends ecm.n {
    public final /* synthetic */ v e;

    public u(v vVar) {
        this.e = vVar;
    }

    @Override // ecm.e0
    public final void p(g2 g2Var) {
        n nVar = this.e.f204415a;
        boolean zE = g2Var.e();
        s sVar = nVar.f204399a;
        if (sVar.e == null && sVar.f == null) {
            return;
        }
        if (zE) {
            ((AtomicLong) nVar.f204400b.f174461b).getAndIncrement();
        } else {
            ((AtomicLong) nVar.f204400b.f174462c).getAndIncrement();
        }
    }
}
