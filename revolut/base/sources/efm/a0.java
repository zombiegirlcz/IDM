package efm;

import efm.c0;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f125376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.a f125377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f125378c;

    public a0(Runnable runnable, c0.a aVar) {
        this.f125376a = runnable;
        this.f125377b = aVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f125378c = true;
        this.f125377b.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f125378c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f125378c) {
            return;
        }
        try {
            this.f125376a.run();
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f125377b.dispose();
            throw zfm.h.d(th10);
        }
    }
}
