package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class u2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k3 f142896b;

    public /* synthetic */ u2(k3 k3Var, int i) {
        this.f142895a = i;
        this.f142896b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142895a) {
            case 0:
                k3 k3Var = this.f142896b;
                if (!k3Var.G.get() && k3Var.f142727y != null) {
                    k3Var.j(false);
                    k3.h(k3Var);
                    break;
                }
                break;
            default:
                k3 k3Var2 = this.f142896b;
                if (k3Var2.f142727y != null) {
                    k3.h(k3Var2);
                    break;
                }
                break;
        }
    }
}
