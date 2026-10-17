package ngm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f215239b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f215240a;

    public f(LinkedBlockingQueue linkedBlockingQueue) {
        this.f215240a = linkedBlockingQueue;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (jgm.b.a(this)) {
            this.f215240a.offer(f215239b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == jgm.b.DISPOSED;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f215240a.offer(ygm.l.COMPLETE);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f215240a.offer(new ygm.j(th10));
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f215240a.offer(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
