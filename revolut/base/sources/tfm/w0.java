package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f270908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f270909c;
    public final Object d;

    public /* synthetic */ w0(Object obj2, int i) {
        this.f270907a = i;
        this.d = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270907a) {
            case 0:
                this.f270908b.dispose();
                break;
            default:
                this.f270908b.dispose();
                this.f270908b = lfm.d.DISPOSED;
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270907a) {
        }
        return this.f270908b.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270907a) {
            case 0:
                efm.y yVar = (efm.y) this.d;
                yVar.onNext(Long.valueOf(this.f270909c));
                yVar.onComplete();
                break;
            default:
                this.f270908b = lfm.d.DISPOSED;
                ((efm.f0) this.d).onSuccess(Long.valueOf(this.f270909c));
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270907a) {
            case 0:
                ((efm.y) this.d).onError(th10);
                break;
            default:
                this.f270908b = lfm.d.DISPOSED;
                ((efm.f0) this.d).onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270907a) {
            case 0:
                this.f270909c++;
                break;
            default:
                this.f270909c++;
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270907a) {
            case 0:
                if (lfm.d.f(this.f270908b, cVar)) {
                    this.f270908b = cVar;
                    ((efm.y) this.d).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f270908b, cVar)) {
                    this.f270908b = cVar;
                    ((efm.f0) this.d).onSubscribe(this);
                }
                break;
        }
    }
}
