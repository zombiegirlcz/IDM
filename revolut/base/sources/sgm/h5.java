package sgm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class h5 extends AtomicInteger implements bhm.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f262884b;

    public h5(fgm.l lVar, Object obj2) {
        this.f262883a = lVar;
        this.f262884b = obj2;
    }

    @Override // bhm.c
    public final int b(int i) {
        lazySet(1);
        return 1;
    }

    @Override // bhm.g
    public final void clear() {
        lazySet(3);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        set(3);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == 3;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bhm.g
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f262884b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj2 = this.f262884b;
            fgm.l lVar = this.f262883a;
            lVar.onNext(obj2);
            if (get() == 2) {
                lazySet(3);
                lVar.onComplete();
            }
        }
    }
}
