package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f142743b;

    public /* synthetic */ l0(p0 p0Var, int i) {
        this.f142742a = i;
        this.f142743b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142742a) {
            case 0:
                this.f142743b.f.c();
                break;
            default:
                this.f142743b.f.b();
                break;
        }
    }
}
