package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.f0 f270522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.p f270523c;
    public ifm.c d;
    public boolean e;

    public /* synthetic */ i(efm.f0 f0Var, kfm.p pVar, int i) {
        this.f270521a = i;
        this.f270522b = f0Var;
        this.f270523c = pVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270521a) {
            case 0:
                this.d.dispose();
                break;
            default:
                this.d.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270521a) {
        }
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270521a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f270522b.onSuccess(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f270522b.onSuccess(Boolean.FALSE);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270521a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f270522b.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f270522b.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270521a) {
            case 0:
                if (!this.e) {
                    try {
                        if (!this.f270523c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            this.f270522b.onSuccess(Boolean.FALSE);
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        this.d.dispose();
                        onError(th10);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.e) {
                    try {
                        if (this.f270523c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            this.f270522b.onSuccess(Boolean.TRUE);
                        }
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        this.d.dispose();
                        onError(th11);
                    }
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270521a) {
            case 0:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f270522b.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f270522b.onSubscribe(this);
                }
                break;
        }
    }
}
