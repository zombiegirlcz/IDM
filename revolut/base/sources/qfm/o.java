package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f245487a;

    public o(q qVar) {
        this.f245487a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f245487a;
        try {
            qVar.f245505a.onComplete();
        } finally {
            qVar.d.dispose();
        }
    }
}
