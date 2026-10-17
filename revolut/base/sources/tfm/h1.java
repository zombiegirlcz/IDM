package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f270501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f270502b;

    public h1(i1 i1Var, Throwable th10) {
        this.f270502b = i1Var;
        this.f270501a = th10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f270502b;
        try {
            i1Var.f270526a.onError(this.f270501a);
        } finally {
            i1Var.d.dispose();
        }
    }
}
