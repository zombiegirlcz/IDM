package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f245500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f245501b;

    public p(q qVar, Throwable th10) {
        this.f245501b = qVar;
        this.f245500a = th10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f245501b;
        try {
            qVar.f245505a.onError(this.f245500a);
        } finally {
            qVar.d.dispose();
        }
    }
}
