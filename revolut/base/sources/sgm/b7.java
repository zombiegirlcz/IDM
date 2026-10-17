package sgm;

/* JADX INFO: loaded from: classes14.dex */
public final class b7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7 f262725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f262726b;

    public b7(c7 c7Var, boolean z) {
        this.f262725a = c7Var;
        this.f262726b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c7 c7Var = this.f262725a;
        c7Var.f263281b.offer(this.f262726b ? c7.f262750p : c7.f262751q);
        c7Var.c();
    }
}
