package vgm;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends fgm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jgm.d f289219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeDisposable f289220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jgm.d f289221c;
    public final d d;
    public volatile boolean e;

    public b(d dVar) {
        this.d = dVar;
        jgm.d dVar2 = new jgm.d();
        this.f289219a = dVar2;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f289220b = compositeDisposable;
        jgm.d dVar3 = new jgm.d();
        this.f289221c = dVar3;
        dVar3.a(dVar2);
        dVar3.a(compositeDisposable);
    }

    @Override // fgm.o
    public final Disposable a(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.e ? jgm.c.INSTANCE : this.d.d(runnable, j2, timeUnit, this.f289220b);
    }

    @Override // fgm.o
    public final void b(Runnable runnable) {
        if (this.e) {
            return;
        }
        this.d.d(runnable, 0L, TimeUnit.MILLISECONDS, this.f289219a);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f289221c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.e;
    }
}
