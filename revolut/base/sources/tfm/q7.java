package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class q7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f270756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7 f270757b;

    public q7(long j2, r7 r7Var) {
        this.f270756a = j2;
        this.f270757b = r7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r7 r7Var = this.f270757b;
        if (r7Var.d) {
            r7Var.f270792r = true;
        } else {
            r7Var.f224947c.offer(this);
        }
        if (r7Var.f()) {
            r7Var.j0();
        }
    }
}
