package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270633a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f270634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f270635c;
    public final Object d;
    public Object e;

    public m1(efm.l lVar) {
        this.d = lVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270633a) {
            case 0:
                this.f270634b.dispose();
                break;
            default:
                this.f270634b.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270633a) {
        }
        return this.f270634b.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270633a) {
            case 0:
                if (!this.f270635c) {
                    this.f270635c = true;
                    ((efm.y) this.d).onComplete();
                    break;
                }
                break;
            default:
                efm.l lVar = (efm.l) this.d;
                if (!this.f270635c) {
                    this.f270635c = true;
                    Object obj2 = this.e;
                    this.e = null;
                    if (obj2 != null) {
                        lVar.onSuccess(obj2);
                    } else {
                        lVar.onComplete();
                    }
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270633a) {
            case 0:
                if (!this.f270635c) {
                    this.f270635c = true;
                    ((efm.y) this.d).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            default:
                if (!this.f270635c) {
                    this.f270635c = true;
                    ((efm.l) this.d).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270633a) {
            case 0:
                if (!this.f270635c) {
                    try {
                        Object objApply = ((kfm.o) this.e).apply(obj2);
                        mfm.f.b(objApply, "The selector returned a null Notification");
                        efm.p pVar = (efm.p) objApply;
                        Object obj3 = pVar.f125387a;
                        if (obj3 instanceof zfm.k) {
                            this.f270634b.dispose();
                            onError(pVar.c());
                        } else if (obj3 != null) {
                            efm.y yVar = (efm.y) this.d;
                            if (obj3 == null || (obj3 instanceof zfm.k)) {
                                obj3 = null;
                            }
                            yVar.onNext(obj3);
                        } else {
                            this.f270634b.dispose();
                            onComplete();
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        this.f270634b.dispose();
                        onError(th10);
                        return;
                    }
                } else if (obj2 instanceof efm.p) {
                    efm.p pVar2 = (efm.p) obj2;
                    if (pVar2.f125387a instanceof zfm.k) {
                        mo3.a.m(pVar2.c());
                    }
                }
                break;
            default:
                if (!this.f270635c) {
                    if (this.e == null) {
                        this.e = obj2;
                    } else {
                        this.f270635c = true;
                        this.f270634b.dispose();
                        ((efm.l) this.d).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270633a) {
            case 0:
                if (lfm.d.f(this.f270634b, cVar)) {
                    this.f270634b = cVar;
                    ((efm.y) this.d).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f270634b, cVar)) {
                    this.f270634b = cVar;
                    ((efm.l) this.d).onSubscribe(this);
                }
                break;
        }
    }

    public m1(efm.y yVar, kfm.o oVar) {
        this.d = yVar;
        this.e = oVar;
    }
}
