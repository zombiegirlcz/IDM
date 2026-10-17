package xgm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends AtomicInteger implements bhm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f305775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dom.a f305776b;

    public d(dom.a aVar, Object obj2) {
        this.f305776b = aVar;
        this.f305775a = obj2;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (f.f(j2) && compareAndSet(0, 1)) {
            Object obj2 = this.f305775a;
            dom.a aVar = this.f305776b;
            aVar.onNext(obj2);
            if (get() != 2) {
                aVar.onComplete();
            }
        }
    }

    @Override // bhm.c
    public final int b(int i) {
        return 1;
    }

    @Override // dom.b
    public final void cancel() {
        lazySet(2);
    }

    @Override // bhm.g
    public final void clear() {
        lazySet(1);
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bhm.g
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f305775a;
    }
}
