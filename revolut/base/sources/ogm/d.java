package ogm;

import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import pgm.f0;
import pgm.j0;
import sgm.i2;
import sgm.k2;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends AtomicReference implements CompletableEmitter, Disposable, fgm.b, fgm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225211b;

    public /* synthetic */ d(AtomicInteger atomicInteger, int i) {
        this.f225210a = i;
        this.f225211b = atomicInteger;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f225210a) {
            case 0:
                jgm.b.a(this);
                break;
            case 1:
                jgm.b.a(this);
                break;
            case 2:
                jgm.b.a(this);
                break;
            case 3:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f225210a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // io.reactivex.rxjava3.core.CompletableEmitter, fgm.b
    public void onComplete() {
        Disposable disposable;
        switch (this.f225210a) {
            case 0:
                Object obj2 = get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (obj2 == bVar || (disposable = (Disposable) getAndSet(bVar)) == bVar) {
                    return;
                }
                try {
                    ((fgm.b) this.f225211b).onComplete();
                    if (disposable != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
            case 1:
                f0 f0Var = (f0) this.f225211b;
                f0Var.d.b(this);
                f0Var.onComplete();
                return;
            default:
                i2 i2Var = (i2) this.f225211b;
                i2Var.e.b(this);
                i2Var.onComplete();
                return;
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableEmitter, fgm.b, efm.f0
    public final void onError(Throwable th10) {
        Disposable disposable;
        switch (this.f225210a) {
            case 0:
                Object obj2 = get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (obj2 == bVar || (disposable = (Disposable) getAndSet(bVar)) == bVar) {
                    jb3.l.v(th10);
                    return;
                }
                try {
                    ((fgm.b) this.f225211b).onError(th10);
                    if (disposable != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
            case 1:
                f0 f0Var = (f0) this.f225211b;
                f0Var.d.b(this);
                f0Var.onError(th10);
                return;
            case 2:
                j0 j0Var = (j0) this.f225211b;
                CompositeDisposable compositeDisposable = j0Var.d;
                compositeDisposable.b(this);
                if (j0Var.f.a(th10)) {
                    j0Var.i.cancel();
                    compositeDisposable.dispose();
                    j0Var.e.decrementAndGet();
                    if (j0Var.getAndIncrement() == 0) {
                        j0Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                i2 i2Var = (i2) this.f225211b;
                i2Var.e.b(this);
                i2Var.onError(th10);
                return;
            default:
                k2 k2Var = (k2) this.f225211b;
                CompositeDisposable compositeDisposable2 = k2Var.d;
                compositeDisposable2.b(this);
                if (k2Var.f.a(th10)) {
                    if (!k2Var.f262955c) {
                        k2Var.i.dispose();
                        compositeDisposable2.dispose();
                    }
                    k2Var.e.decrementAndGet();
                    if (k2Var.getAndIncrement() == 0) {
                        k2Var.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        switch (this.f225210a) {
            case 1:
                jgm.b.e(this, disposable);
                break;
            case 2:
                jgm.b.e(this, disposable);
                break;
            case 3:
                jgm.b.e(this, disposable);
                break;
            default:
                jgm.b.e(this, disposable);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    @Override // fgm.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ogm.d.onSuccess(java.lang.Object):void");
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f225210a) {
            case 0:
                return j6.a.r(d.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }

    public d(fgm.b bVar) {
        this.f225210a = 0;
        this.f225211b = bVar;
    }
}
