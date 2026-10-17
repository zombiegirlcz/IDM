package tfm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class r5 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270774a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f270775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270776c;
    public boolean d;
    public final Object e;
    public Object f;

    public r5(efm.f0 f0Var, Object obj2) {
        this.e = f0Var;
        this.f270775b = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270774a) {
            case 0:
                this.f270776c.dispose();
                break;
            default:
                this.f270776c.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270774a) {
        }
        return this.f270776c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270774a) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    ((efm.y) this.e).onComplete();
                    break;
                }
                break;
            default:
                efm.f0 f0Var = (efm.f0) this.e;
                if (!this.d) {
                    this.d = true;
                    Object obj2 = this.f;
                    this.f = null;
                    if (obj2 == null) {
                        obj2 = this.f270775b;
                    }
                    if (obj2 == null) {
                        f0Var.onError(new NoSuchElementException());
                    } else {
                        f0Var.onSuccess(obj2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270774a) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    ((efm.y) this.e).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    ((efm.f0) this.e).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270774a) {
            case 0:
                if (!this.d) {
                    try {
                        Object objApply = ((kfm.c) this.f).apply(this.f270775b, obj2);
                        mfm.f.b(objApply, "The accumulator returned a null value");
                        this.f270775b = objApply;
                        ((efm.y) this.e).onNext(objApply);
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        this.f270776c.dispose();
                        onError(th10);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.d) {
                    if (this.f == null) {
                        this.f = obj2;
                    } else {
                        this.d = true;
                        this.f270776c.dispose();
                        ((efm.f0) this.e).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270774a) {
            case 0:
                efm.y yVar = (efm.y) this.e;
                if (lfm.d.f(this.f270776c, cVar)) {
                    this.f270776c = cVar;
                    yVar.onSubscribe(this);
                    yVar.onNext(this.f270775b);
                }
                break;
            default:
                if (lfm.d.f(this.f270776c, cVar)) {
                    this.f270776c = cVar;
                    ((efm.f0) this.e).onSubscribe(this);
                }
                break;
        }
    }

    public r5(efm.y yVar, kfm.c cVar, Object obj2) {
        this.e = yVar;
        this.f = cVar;
        this.f270775b = obj2;
    }
}
