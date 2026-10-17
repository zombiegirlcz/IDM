package ofm;

import efm.y;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AtomicReference implements y, ifm.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f224917b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f224918a;

    public g(LinkedBlockingQueue linkedBlockingQueue) {
        this.f224918a = linkedBlockingQueue;
    }

    @Override // ifm.c
    public final void dispose() {
        if (lfm.d.a(this)) {
            this.f224918a.offer(f224917b);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == lfm.d.DISPOSED;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f224918a.offer(zfm.m.COMPLETE);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f224918a.offer(new zfm.k(th10));
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f224918a.offer(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
