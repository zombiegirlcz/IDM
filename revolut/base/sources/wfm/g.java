package wfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AtomicReference implements Runnable, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lfm.b f297171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.b f297172b;

    public g(Runnable runnable) {
        super(runnable);
        this.f297171a = new lfm.b(1);
        this.f297172b = new lfm.b(1);
    }

    @Override // ifm.c
    public final void dispose() {
        if (getAndSet(null) != null) {
            lfm.b bVar = this.f297171a;
            bVar.getClass();
            lfm.d.a(bVar);
            lfm.b bVar2 = this.f297172b;
            bVar2.getClass();
            lfm.d.a(bVar2);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lfm.b bVar = this.f297172b;
        lfm.b bVar2 = this.f297171a;
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet(null);
                lfm.d dVar = lfm.d.DISPOSED;
                bVar2.lazySet(dVar);
                bVar.lazySet(dVar);
            } catch (Throwable th10) {
                lazySet(null);
                bVar2.lazySet(lfm.d.DISPOSED);
                bVar.lazySet(lfm.d.DISPOSED);
                throw th10;
            }
        }
    }
}
