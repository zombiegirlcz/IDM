package pgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class l0 extends lgm.a implements fgm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f236103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f236104c;

    public /* synthetic */ l0(Object obj2, int i) {
        this.f236102a = i;
        this.f236104c = obj2;
    }

    @Override // lgm.a, dom.b
    public void cancel() {
        switch (this.f236102a) {
            case 0:
                this.f236103b.dispose();
                this.f236103b = jgm.b.DISPOSED;
                break;
        }
    }

    @Override // lgm.a, io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        switch (this.f236102a) {
            case 1:
                this.f236103b.dispose();
                this.f236103b = jgm.b.DISPOSED;
                break;
        }
    }

    @Override // lgm.a, io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        switch (this.f236102a) {
            case 1:
                return this.f236103b.isDisposed();
            default:
                return super.isDisposed();
        }
    }

    @Override // fgm.b
    public final void onComplete() {
        switch (this.f236102a) {
            case 0:
                this.f236103b = jgm.b.DISPOSED;
                ((dom.a) this.f236104c).onComplete();
                break;
            default:
                this.f236103b = jgm.b.DISPOSED;
                ((fgm.l) this.f236104c).onComplete();
                break;
        }
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        switch (this.f236102a) {
            case 0:
                this.f236103b = jgm.b.DISPOSED;
                ((dom.a) this.f236104c).onError(th10);
                break;
            default:
                this.f236103b = jgm.b.DISPOSED;
                ((fgm.l) this.f236104c).onError(th10);
                break;
        }
    }

    @Override // fgm.b
    public final void onSubscribe(Disposable disposable) {
        switch (this.f236102a) {
            case 0:
                if (jgm.b.f(this.f236103b, disposable)) {
                    this.f236103b = disposable;
                    ((dom.a) this.f236104c).e(this);
                }
                break;
            default:
                if (jgm.b.f(this.f236103b, disposable)) {
                    this.f236103b = disposable;
                    ((fgm.l) this.f236104c).onSubscribe(this);
                }
                break;
        }
    }
}
