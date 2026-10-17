package tfm;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes13.dex */
public final class y3 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f270971c;

    public y3(efm.y yVar, kfm.o oVar) {
        this.f270969a = yVar;
        this.f270970b = oVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270971c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270971c.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270969a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        efm.y yVar = this.f270969a;
        try {
            Object objApply = this.f270970b.apply(th10);
            if (objApply != null) {
                yVar.onNext(objApply);
                yVar.onComplete();
            } else {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th10);
                yVar.onError(nullPointerException);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            yVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270969a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270971c, cVar)) {
            this.f270971c = cVar;
            this.f270969a.onSubscribe(this);
        }
    }
}
