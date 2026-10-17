package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f270471a;

    public g1(i1 i1Var) {
        this.f270471a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f270471a;
        try {
            i1Var.f270526a.onComplete();
        } finally {
            i1Var.d.dispose();
        }
    }
}
