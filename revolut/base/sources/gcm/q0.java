package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f142833b;

    public /* synthetic */ q0(z2 z2Var, int i) {
        this.f142832a = i;
        this.f142833b = z2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142832a) {
            case 0:
                this.f142833b.e(true);
                break;
            case 1:
                this.f142833b.e(false);
                break;
            default:
                this.f142833b.d();
                break;
        }
    }
}
