package fgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f135110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f135111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f135112c;

    public m(Runnable runnable, o oVar) {
        this.f135110a = runnable;
        this.f135111b = oVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f135112c == Thread.currentThread()) {
            o oVar = this.f135111b;
            if (oVar instanceof vgm.l) {
                vgm.l lVar = (vgm.l) oVar;
                if (lVar.f289243b) {
                    return;
                }
                lVar.f289243b = true;
                lVar.f289242a.shutdown();
                return;
            }
        }
        this.f135111b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f135111b.isDisposed();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f135112c = Thread.currentThread();
        try {
            this.f135110a.run();
        } finally {
        }
    }
}
