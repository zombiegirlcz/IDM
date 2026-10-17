package elm;

import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f127547c;

    public l(Runnable runnable, long j2, boolean z) {
        super(j2, z);
        this.f127547c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f127547c.run();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Task[");
        Runnable runnable = this.f127547c;
        sb6.append(runnable.getClass().getSimpleName());
        sb6.append('@');
        sb6.append(e0.s(runnable));
        sb6.append(", ");
        sb6.append(this.f127545a);
        sb6.append(", ");
        return j6.a.u(sb6, this.f127546b ? "Blocking" : "Non-blocking", ']');
    }
}
