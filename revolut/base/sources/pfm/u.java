package pfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class u extends AtomicReference implements efm.d, ifm.c, efm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f235767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f235768c;
    public final Object d;

    public u(efm.d dVar, kfm.o oVar) {
        this.f235766a = 0;
        this.d = dVar;
        this.f235767b = oVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f235766a) {
            case 0:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f235766a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.d
    public final void onComplete() {
        switch (this.f235766a) {
            case 0:
                ((efm.d) this.d).onComplete();
                break;
            default:
                ((efm.l) this.d).onComplete();
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f235766a) {
            case 0:
                efm.d dVar = (efm.d) this.d;
                if (this.f235768c) {
                    dVar.onError(th10);
                } else {
                    this.f235768c = true;
                    try {
                        Object objApply = this.f235767b.apply(th10);
                        mfm.f.b(objApply, "The errorMapper returned a null CompletableSource");
                        ((efm.f) objApply).d(this);
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        dVar.onError(new CompositeException(th10, th11));
                        return;
                    }
                }
                break;
            default:
                efm.l lVar = (efm.l) this.d;
                if (this.f235768c || (th10 instanceof Exception)) {
                    try {
                        Object objApply2 = this.f235767b.apply(th10);
                        mfm.f.b(objApply2, "The resumeFunction returned a null MaybeSource");
                        efm.n nVar = (efm.n) objApply2;
                        lfm.d.c(this, null);
                        ((efm.k) nVar).i(new jx0.a(lVar, this, 26));
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        lVar.onError(new CompositeException(th10, th12));
                    }
                } else {
                    lVar.onError(th10);
                }
                break;
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f235766a) {
            case 0:
                lfm.d.c(this, cVar);
                break;
            default:
                if (lfm.d.e(this, cVar)) {
                    ((efm.l) this.d).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        ((efm.l) this.d).onSuccess(obj2);
    }

    public u(efm.l lVar, kfm.o oVar) {
        this.f235766a = 1;
        this.d = lVar;
        this.f235767b = oVar;
        this.f235768c = true;
    }
}
