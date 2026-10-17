package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class y1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f142969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f142970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f142971c;

    public y1(g2 g2Var, b2 b2Var, boolean z) {
        this.f142971c = g2Var;
        this.f142969a = b2Var;
        this.f142970b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f142971c.f142656t.n(this.f142969a, this.f142970b);
    }
}
