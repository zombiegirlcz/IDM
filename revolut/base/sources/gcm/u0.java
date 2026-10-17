package gcm;

/* JADX INFO: loaded from: classes22.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f142891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f142892c;

    public /* synthetic */ u0(r0 r0Var, int i, int i2) {
        this.f142890a = i2;
        this.f142892c = r0Var;
        this.f142891b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142890a) {
            case 0:
                this.f142892c.f142846c.e(this.f142891b);
                break;
            default:
                this.f142892c.f142846c.a(this.f142891b);
                break;
        }
    }
}
