package gcm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class d2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f142613b;

    public /* synthetic */ d2(e2 e2Var, int i) {
        this.f142612a = i;
        this.f142613b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142612a) {
            case 0:
                e2 e2Var = this.f142613b;
                g2 g2Var = e2Var.f142626c;
                g2Var.f142651n = null;
                if (g2Var.f142658x == null) {
                    b2 b2Var = g2Var.u;
                    b2 b2Var2 = e2Var.f142624a;
                    if (b2Var == b2Var2) {
                        g2Var.v = b2Var2;
                        g2 g2Var2 = this.f142613b.f142626c;
                        g2Var2.u = null;
                        g2.e(g2Var2, ecm.r.READY);
                    }
                } else {
                    Preconditions.checkState(g2Var.v == null, "Unexpected non-null activeTransport");
                    e2 e2Var2 = this.f142613b;
                    e2Var2.f142624a.c(e2Var2.f142626c.f142658x);
                }
                break;
            default:
                e2 e2Var3 = this.f142613b;
                e2Var3.f142626c.f142655s.remove(e2Var3.f142624a);
                if (this.f142613b.f142626c.f142657w.f124871a == ecm.r.SHUTDOWN && this.f142613b.f142626c.f142655s.isEmpty()) {
                    g2 g2Var3 = this.f142613b.f142626c;
                    g2Var3.k.execute(new x1(g2Var3, 1));
                    break;
                }
                break;
        }
    }
}
