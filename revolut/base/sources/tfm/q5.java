package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class q5 extends AtomicInteger implements nfm.e, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f270753b;

    public q5(efm.y yVar, Object obj2) {
        this.f270752a = yVar;
        this.f270753b = obj2;
    }

    @Override // nfm.f
    public final int b(int i) {
        lazySet(1);
        return 1;
    }

    @Override // nfm.j
    public final void clear() {
        lazySet(3);
    }

    @Override // ifm.c
    public final void dispose() {
        set(3);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == 3;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nfm.j
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f270753b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj2 = this.f270753b;
            efm.y yVar = this.f270752a;
            yVar.onNext(obj2);
            if (get() == 2) {
                lazySet(3);
                yVar.onComplete();
            }
        }
    }
}
