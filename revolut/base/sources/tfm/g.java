package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.p f270467c;
    public ifm.c d;
    public boolean e;

    public /* synthetic */ g(efm.y yVar, kfm.p pVar, int i) {
        this.f270465a = i;
        this.f270466b = yVar;
        this.f270467c = pVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270465a) {
            case 0:
                this.d.dispose();
                break;
            case 1:
                this.d.dispose();
                break;
            default:
                this.d.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270465a) {
        }
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270465a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    Boolean bool = Boolean.TRUE;
                    efm.y yVar = this.f270466b;
                    yVar.onNext(bool);
                    yVar.onComplete();
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    Boolean bool2 = Boolean.FALSE;
                    efm.y yVar2 = this.f270466b;
                    yVar2.onNext(bool2);
                    yVar2.onComplete();
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f270466b.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270465a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f270466b.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    this.f270466b.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f270466b.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270465a) {
            case 0:
                if (!this.e) {
                    try {
                        if (!this.f270467c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            Boolean bool = Boolean.FALSE;
                            efm.y yVar = this.f270466b;
                            yVar.onNext(bool);
                            yVar.onComplete();
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
            case 1:
                if (!this.e) {
                    try {
                        if (this.f270467c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            Boolean bool2 = Boolean.TRUE;
                            efm.y yVar2 = this.f270466b;
                            yVar2.onNext(bool2);
                            yVar2.onComplete();
                        }
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        this.d.dispose();
                        onError(th11);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.e) {
                    try {
                        boolean zTest = this.f270467c.test(obj2);
                        efm.y yVar3 = this.f270466b;
                        if (!zTest) {
                            this.e = true;
                            this.d.dispose();
                            yVar3.onComplete();
                        } else {
                            yVar3.onNext(obj2);
                        }
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        this.d.dispose();
                        onError(th12);
                    }
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270465a) {
            case 0:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f270466b.onSubscribe(this);
                }
                break;
            case 1:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f270466b.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f270466b.onSubscribe(this);
                }
                break;
        }
    }
}
