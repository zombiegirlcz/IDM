package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class a7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f270347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270348b;

    public a7(long j2, z6 z6Var) {
        this.f270348b = j2;
        this.f270347a = z6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tfm.z6] */
    @Override // java.lang.Runnable
    public final void run() {
        this.f270347a.b(this.f270348b);
    }
}
