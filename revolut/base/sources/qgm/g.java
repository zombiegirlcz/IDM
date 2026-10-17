package qgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements fgm.e, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.b f246375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f246376b;

    public g(fgm.b bVar) {
        this.f246375a = bVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f246376b.dispose();
        this.f246376b = jgm.b.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f246376b.isDisposed();
    }

    @Override // fgm.e
    public final void onComplete() {
        this.f246376b = jgm.b.DISPOSED;
        this.f246375a.onComplete();
    }

    @Override // fgm.e
    public final void onError(Throwable th10) {
        this.f246376b = jgm.b.DISPOSED;
        this.f246375a.onError(th10);
    }

    @Override // fgm.e
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f246376b, disposable)) {
            this.f246376b = disposable;
            this.f246375a.onSubscribe(this);
        }
    }

    @Override // fgm.e, fgm.p
    public final void onSuccess(Object obj2) {
        this.f246376b = jgm.b.DISPOSED;
        this.f246375a.onComplete();
    }
}
