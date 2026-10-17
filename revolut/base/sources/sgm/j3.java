package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j3 extends AtomicReference implements Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f262926c;

    public j3(fgm.l lVar, long j2, long j3) {
        this.f262924a = lVar;
        this.f262926c = j2;
        this.f262925b = j3;
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
        if (isDisposed()) {
            return;
        }
        long j2 = this.f262926c;
        Long lValueOf = Long.valueOf(j2);
        fgm.l lVar = this.f262924a;
        lVar.onNext(lValueOf);
        if (j2 != this.f262925b) {
            this.f262926c = j2 + 1;
            return;
        }
        if (!isDisposed()) {
            lVar.onComplete();
        }
        jgm.b.a(this);
    }
}
