package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class x1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2 f142939b;

    public /* synthetic */ x1(g2 g2Var, int i) {
        this.f142938a = i;
        this.f142939b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142938a) {
            case 0:
                if (this.f142939b.f142657w.f124871a == ecm.r.IDLE) {
                    this.f142939b.i.a(ecm.f.INFO, "CONNECTING as requested");
                    g2.e(this.f142939b, ecm.r.CONNECTING);
                    g2.f(this.f142939b);
                }
                break;
            default:
                g2 g2Var = this.f142939b;
                g2Var.i.a(ecm.f.INFO, "Terminated");
                k3 k3Var = ((j3) g2Var.d.f7848c).f142694j;
                k3Var.A.remove(g2Var);
                k3.i(k3Var);
                break;
        }
    }
}
