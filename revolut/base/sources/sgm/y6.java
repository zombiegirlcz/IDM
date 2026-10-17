package sgm;

/* JADX INFO: loaded from: classes14.dex */
public final class y6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6 f263305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263306b;

    public y6(z6 z6Var, long j2) {
        this.f263305a = z6Var;
        this.f263306b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z6 z6Var = this.f263305a;
        z6Var.f263281b.offer(this);
        z6Var.c();
    }
}
