package hfm;

import android.os.Handler;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Runnable, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f152033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f152034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f152035c;

    public e(Handler handler, Runnable runnable) {
        this.f152033a = handler;
        this.f152034b = runnable;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f152033a.removeCallbacks(this);
        this.f152035c = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f152035c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f152034b.run();
        } catch (Throwable th10) {
            mo3.a.m(th10);
        }
    }
}
