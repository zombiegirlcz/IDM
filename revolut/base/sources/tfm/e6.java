package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class e6 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.p f270436c;
    public ifm.c d;
    public boolean e;

    public /* synthetic */ e6(efm.y yVar, kfm.p pVar, int i) {
        this.f270434a = i;
        this.f270435b = yVar;
        this.f270436c = pVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270434a) {
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
        switch (this.f270434a) {
        }
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270434a) {
            case 0:
                this.f270435b.onComplete();
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f270435b.onComplete();
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270434a) {
            case 0:
                this.f270435b.onError(th10);
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f270435b.onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270434a) {
            case 0:
                boolean z = this.e;
                efm.y yVar = this.f270435b;
                if (z) {
                    yVar.onNext(obj2);
                } else {
                    try {
                        if (!this.f270436c.test(obj2)) {
                            this.e = true;
                            yVar.onNext(obj2);
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        this.d.dispose();
                        yVar.onError(th10);
                        return;
                    }
                }
                break;
            default:
                if (!this.e) {
                    efm.y yVar2 = this.f270435b;
                    yVar2.onNext(obj2);
                    try {
                        if (this.f270436c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            yVar2.onComplete();
                        }
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        this.d.dispose();
                        onError(th11);
                    }
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270434a) {
            case 0:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f270435b.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    this.f270435b.onSubscribe(this);
                }
                break;
        }
    }
}
