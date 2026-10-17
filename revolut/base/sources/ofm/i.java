package ofm;

import efm.d0;
import efm.f0;
import efm.h0;
import io.reactivex.exceptions.CompositeException;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import qfm.s;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AtomicReference implements f0, ifm.c, efm.d, efm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f224923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f224924c;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f224922a = i;
        this.f224923b = obj2;
        this.f224924c = obj3;
    }

    public void a(Throwable th10) {
        ifm.c cVar;
        ifm.c cVar2 = (ifm.c) get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (cVar2 == dVar || (cVar = (ifm.c) getAndSet(dVar)) == dVar) {
            mo3.a.m(th10);
            return;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        ((f0) this.f224923b).onError(th10);
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f224922a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                lfm.d.a(this);
                break;
            case 2:
                lfm.d.a(this);
                break;
            case 3:
                lfm.d.a(this);
                break;
            case 4:
                kfm.a aVar = (kfm.a) getAndSet(null);
                if (aVar != null) {
                    try {
                        aVar.run();
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        mo3.a.m(th10);
                    }
                    ((ifm.c) this.f224924c).dispose();
                }
                break;
            default:
                lfm.d.a(this);
                s sVar = (s) this.f224924c;
                sVar.getClass();
                yfm.g.b(sVar);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f224922a) {
            case 0:
                return get() == lfm.d.DISPOSED;
            case 1:
                return lfm.d.b((ifm.c) get());
            case 2:
                return lfm.d.b((ifm.c) get());
            case 3:
                return lfm.d.b((ifm.c) get());
            case 4:
                return ((ifm.c) this.f224924c).isDisposed();
            default:
                return lfm.d.b((ifm.c) get());
        }
    }

    @Override // efm.d
    public void onComplete() {
        switch (this.f224922a) {
            case 1:
                ((efm.k) this.f224924c).i(new kgm.i(this, (efm.l) this.f224923b, 25));
                break;
            case 2:
                ((f0) this.f224923b).onError(new NoSuchElementException());
                break;
            default:
                ifm.c cVar = (ifm.c) get();
                if (cVar != lfm.d.DISPOSED && compareAndSet(cVar, null)) {
                    ((d0) ((h0) this.f224924c)).q(new k7i.i((f0) this.f224923b, this, 22));
                    break;
                }
                break;
        }
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        switch (this.f224922a) {
            case 0:
                lazySet(lfm.d.DISPOSED);
                try {
                    ((kfm.g) this.f224924c).accept(th10);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    mo3.a.m(new CompositeException(th10, th11));
                    return;
                }
                break;
            case 1:
                ((efm.l) this.f224923b).onError(th10);
                break;
            case 2:
                ((f0) this.f224923b).onError(th10);
                break;
            case 3:
                ((f0) this.f224923b).onError(th10);
                break;
            case 4:
                ((f0) this.f224923b).onError(th10);
                break;
            default:
                s sVar = (s) this.f224924c;
                sVar.getClass();
                yfm.g.b(sVar);
                ifm.c cVar = (ifm.c) get();
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar == dVar || ((ifm.c) getAndSet(dVar)) == dVar) {
                    mo3.a.m(th10);
                } else {
                    ((f0) this.f224923b).onError(th10);
                }
                break;
        }
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f224922a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            case 1:
                if (lfm.d.e(this, cVar)) {
                    ((efm.l) this.f224923b).onSubscribe(this);
                }
                break;
            case 2:
                if (lfm.d.e(this, cVar)) {
                    ((f0) this.f224923b).onSubscribe(this);
                }
                break;
            case 3:
                if (lfm.d.e(this, cVar)) {
                    ((f0) this.f224923b).onSubscribe(this);
                }
                break;
            case 4:
                if (lfm.d.f((ifm.c) this.f224924c, cVar)) {
                    this.f224924c = cVar;
                    ((f0) this.f224923b).onSubscribe(this);
                }
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f224922a) {
            case 0:
                lazySet(lfm.d.DISPOSED);
                try {
                    ((kfm.g) this.f224923b).accept(obj2);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    mo3.a.m(th10);
                    return;
                }
                break;
            case 1:
            default:
                s sVar = (s) this.f224924c;
                sVar.getClass();
                yfm.g.b(sVar);
                lfm.d dVar = lfm.d.DISPOSED;
                if (((ifm.c) getAndSet(dVar)) != dVar) {
                    ((f0) this.f224923b).onSuccess(obj2);
                }
                break;
            case 2:
                try {
                    Object objApply = ((kfm.o) this.f224924c).apply(obj2);
                    mfm.f.b(objApply, "The mapper returned a null SingleSource");
                    h0 h0Var = (h0) objApply;
                    if (!isDisposed()) {
                        ((d0) h0Var).q(new jul.o(this, (f0) this.f224923b, 28));
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    onError(th11);
                    return;
                }
                break;
            case 3:
                ((f0) this.f224923b).onSuccess(obj2);
                break;
            case 4:
                ((f0) this.f224923b).onSuccess(obj2);
                break;
        }
    }

    public i(f0 f0Var, rzc.b bVar) {
        this.f224922a = 4;
        this.f224923b = f0Var;
        lazySet(bVar);
    }

    public i(f0 f0Var) {
        this.f224922a = 5;
        this.f224923b = f0Var;
        this.f224924c = new s(this);
    }
}
