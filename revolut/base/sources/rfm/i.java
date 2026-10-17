package rfm;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements efm.l, ifm.c, efm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.l f253948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.p f253949c;
    public ifm.c d;

    public /* synthetic */ i(efm.l lVar, kfm.p pVar, int i) {
        this.f253947a = i;
        this.f253948b = lVar;
        this.f253949c = pVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253947a) {
            case 0:
                ifm.c cVar = this.d;
                this.d = lfm.d.DISPOSED;
                cVar.dispose();
                break;
            default:
                ifm.c cVar2 = this.d;
                this.d = lfm.d.DISPOSED;
                cVar2.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253947a) {
        }
        return this.d.isDisposed();
    }

    @Override // efm.l
    public void onComplete() {
        this.f253948b.onComplete();
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        switch (this.f253947a) {
            case 0:
                this.f253948b.onError(th10);
                break;
            default:
                this.f253948b.onError(th10);
                break;
        }
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253947a) {
            case 0:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f253948b.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f253948b.onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f253947a) {
            case 0:
                efm.l lVar = this.f253948b;
                try {
                    if (!this.f253949c.test(obj2)) {
                        lVar.onComplete();
                    } else {
                        lVar.onSuccess(obj2);
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lVar.onError(th10);
                    return;
                }
                break;
            default:
                efm.l lVar2 = this.f253948b;
                try {
                    if (!this.f253949c.test(obj2)) {
                        lVar2.onComplete();
                    } else {
                        lVar2.onSuccess(obj2);
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lVar2.onError(th11);
                }
                break;
        }
    }
}
