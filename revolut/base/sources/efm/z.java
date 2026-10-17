package efm;

import efm.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class z implements ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f125389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.a f125390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f125391c;

    public z(Runnable runnable, c0.a aVar) {
        this.f125389a = runnable;
        this.f125390b = aVar;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f125391c == Thread.currentThread()) {
            c0.a aVar = this.f125390b;
            if (aVar instanceof wfm.q) {
                wfm.q qVar = (wfm.q) aVar;
                if (qVar.f297194b) {
                    return;
                }
                qVar.f297194b = true;
                qVar.f297193a.shutdown();
                return;
            }
        }
        this.f125390b.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f125390b.isDisposed();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f125391c = Thread.currentThread();
        try {
            this.f125389a.run();
        } finally {
            dispose();
            this.f125391c = null;
        }
    }
}
