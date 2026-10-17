package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class h3 extends AtomicReference implements Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f262879b;

    public h3(fgm.l lVar) {
        this.f262878a = lVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == jgm.b.DISPOSED;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != jgm.b.DISPOSED) {
            long j2 = this.f262879b;
            this.f262879b = 1 + j2;
            this.f262878a.onNext(Long.valueOf(j2));
        }
    }
}
