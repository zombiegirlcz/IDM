package rfm;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements efm.d, ifm.c, efm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f253971c;

    public /* synthetic */ p(Object obj2, int i) {
        this.f253969a = i;
        this.f253970b = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253969a) {
            case 0:
                this.f253971c.dispose();
                this.f253971c = lfm.d.DISPOSED;
                break;
            case 1:
                this.f253971c.dispose();
                this.f253971c = lfm.d.DISPOSED;
                break;
            case 2:
                this.f253971c.dispose();
                break;
            default:
                this.f253971c.dispose();
                this.f253971c = lfm.d.DISPOSED;
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253969a) {
        }
        return this.f253971c.isDisposed();
    }

    @Override // efm.d
    public final void onComplete() {
        switch (this.f253969a) {
            case 0:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.l) this.f253970b).onComplete();
                break;
            case 1:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.l) this.f253970b).onComplete();
                break;
            case 2:
                ((efm.l) this.f253970b).onSuccess(Boolean.TRUE);
                break;
            default:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.f0) this.f253970b).onSuccess(Boolean.TRUE);
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f253969a) {
            case 0:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.l) this.f253970b).onError(th10);
                break;
            case 1:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.l) this.f253970b).onError(th10);
                break;
            case 2:
                ((efm.l) this.f253970b).onError(th10);
                break;
            default:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.f0) this.f253970b).onError(th10);
                break;
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253969a) {
            case 0:
                if (lfm.d.f(this.f253971c, cVar)) {
                    this.f253971c = cVar;
                    ((efm.l) this.f253970b).onSubscribe(this);
                }
                break;
            case 1:
                if (lfm.d.f(this.f253971c, cVar)) {
                    this.f253971c = cVar;
                    ((efm.l) this.f253970b).onSubscribe(this);
                }
                break;
            case 2:
                if (lfm.d.f(this.f253971c, cVar)) {
                    this.f253971c = cVar;
                    ((efm.l) this.f253970b).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f253971c, cVar)) {
                    this.f253971c = cVar;
                    ((efm.f0) this.f253970b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f253969a) {
            case 1:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.l) this.f253970b).onComplete();
                break;
            case 2:
                ((efm.l) this.f253970b).onSuccess(Boolean.FALSE);
                break;
            default:
                this.f253971c = lfm.d.DISPOSED;
                ((efm.f0) this.f253970b).onSuccess(Boolean.FALSE);
                break;
        }
    }
}
