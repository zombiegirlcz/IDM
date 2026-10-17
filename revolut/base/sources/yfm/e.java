package yfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicInteger implements nfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f313468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dom.a f313469b;

    public e(dom.a aVar, Object obj2) {
        this.f313469b = aVar;
        this.f313468a = obj2;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (g.f(j2) && compareAndSet(0, 1)) {
            Object obj2 = this.f313468a;
            dom.a aVar = this.f313469b;
            aVar.onNext(obj2);
            if (get() != 2) {
                aVar.onComplete();
            }
        }
    }

    @Override // nfm.f
    public final int b(int i) {
        return 1;
    }

    @Override // dom.b
    public final void cancel() {
        lazySet(2);
    }

    @Override // nfm.j
    public final void clear() {
        lazySet(1);
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nfm.j
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f313468a;
    }
}
