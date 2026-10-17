package vgm;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f289218c = Thread.currentThread();
        try {
            this.f289216a.run();
            this.f289218c = null;
        } catch (Throwable th10) {
            dispose();
            this.f289218c = null;
            jb3.l.v(th10);
            throw th10;
        }
    }
}
