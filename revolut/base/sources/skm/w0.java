package skm;

/* JADX INFO: loaded from: classes14.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f264015c;

    public w0(long j2, Runnable runnable) {
        super(j2);
        this.f264015c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f264015c.run();
    }

    @Override // skm.x0
    public final String toString() {
        return super.toString() + this.f264015c;
    }
}
