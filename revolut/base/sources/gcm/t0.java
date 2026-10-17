package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f142877b;

    public /* synthetic */ t0(r0 r0Var, int i) {
        this.f142876a = i;
        this.f142877b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142876a) {
            case 0:
                this.f142877b.f142846c.request();
                break;
            case 1:
                this.f142877b.m();
                break;
            case 2:
                this.f142877b.f142846c.flush();
                break;
            default:
                this.f142877b.f142846c.g();
                break;
        }
    }
}
