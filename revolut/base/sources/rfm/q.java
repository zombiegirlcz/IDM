package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements efm.f0, ifm.c, efm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f253974c;

    public /* synthetic */ q(Object obj2, int i) {
        this.f253972a = i;
        this.f253973b = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253972a) {
            case 0:
                this.f253974c.dispose();
                this.f253974c = lfm.d.DISPOSED;
                break;
            case 1:
                this.f253974c.dispose();
                break;
            default:
                this.f253974c.dispose();
                this.f253974c = lfm.d.DISPOSED;
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253972a) {
        }
        return this.f253974c.isDisposed();
    }

    @Override // efm.l
    public void onComplete() {
        switch (this.f253972a) {
            case 1:
                ((efm.l) this.f253973b).onComplete();
                break;
            default:
                this.f253974c = lfm.d.DISPOSED;
                ((efm.d) this.f253973b).onComplete();
                break;
        }
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        switch (this.f253972a) {
            case 0:
                this.f253974c = lfm.d.DISPOSED;
                ((efm.l) this.f253973b).onError(th10);
                break;
            case 1:
                ((efm.l) this.f253973b).onComplete();
                break;
            default:
                this.f253974c = lfm.d.DISPOSED;
                ((efm.d) this.f253973b).onError(th10);
                break;
        }
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253972a) {
            case 0:
                if (lfm.d.f(this.f253974c, cVar)) {
                    this.f253974c = cVar;
                    ((efm.l) this.f253973b).onSubscribe(this);
                }
                break;
            case 1:
                if (lfm.d.f(this.f253974c, cVar)) {
                    this.f253974c = cVar;
                    ((efm.l) this.f253973b).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f253974c, cVar)) {
                    this.f253974c = cVar;
                    ((efm.d) this.f253973b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f253972a) {
            case 0:
                this.f253974c = lfm.d.DISPOSED;
                ((efm.l) this.f253973b).onSuccess(obj2);
                break;
            case 1:
                ((efm.l) this.f253973b).onSuccess(obj2);
                break;
            default:
                this.f253974c = lfm.d.DISPOSED;
                ((efm.d) this.f253973b).onComplete();
                break;
        }
    }
}
