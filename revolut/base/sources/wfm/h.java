package wfm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends AtomicBoolean implements Runnable, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f297173a;

    public h(Runnable runnable) {
        this.f297173a = runnable;
    }

    @Override // ifm.c
    public final void dispose() {
        lazySet(true);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.f297173a.run();
        } finally {
            lazySet(true);
        }
    }
}
