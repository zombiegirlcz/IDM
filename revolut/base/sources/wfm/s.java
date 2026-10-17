package wfm;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends a implements Runnable {
    public s(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f297160b = Thread.currentThread();
        try {
            this.f297159a.run();
            this.f297160b = null;
        } catch (Throwable th10) {
            this.f297160b = null;
            lazySet(a.f297158c);
            mo3.a.m(th10);
        }
    }
}
