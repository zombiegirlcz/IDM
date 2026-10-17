package pfm;

import efm.f0;
import io.reactivex.exceptions.CompositeException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class s implements efm.d, ifm.c, efm.l, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f235760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235761c;
    public final Object d;

    public /* synthetic */ s(Object obj2, Object obj3, int i) {
        this.f235759a = i;
        this.f235761c = obj2;
        this.d = obj3;
    }

    public void a(Throwable th10) {
        try {
            ((rfm.y) this.d).d.accept(th10);
        } catch (Throwable th11) {
            m70.a.u(th11);
            th10 = new CompositeException(th10, th11);
        }
        this.f235760b = lfm.d.DISPOSED;
        ((efm.l) this.f235761c).onError(th10);
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f235759a) {
            case 0:
                try {
                    ((t) this.d).f235765g.run();
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    mo3.a.m(th10);
                }
                this.f235760b.dispose();
                break;
            case 1:
                ifm.c cVar = this.f235760b;
                this.f235760b = lfm.d.DISPOSED;
                cVar.dispose();
                break;
            case 2:
                this.f235760b.dispose();
                this.f235760b = lfm.d.DISPOSED;
                break;
            case 3:
                this.f235760b.dispose();
                this.f235760b = lfm.d.DISPOSED;
                break;
            case 4:
                this.f235760b.dispose();
                break;
            default:
                this.f235760b.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f235759a) {
        }
        return this.f235760b.isDisposed();
    }

    @Override // efm.d
    public void onComplete() {
        switch (this.f235759a) {
            case 0:
                efm.d dVar = (efm.d) this.f235761c;
                t tVar = (t) this.d;
                if (this.f235760b != lfm.d.DISPOSED) {
                    try {
                        tVar.d.run();
                        tVar.e.run();
                        dVar.onComplete();
                        try {
                            tVar.f.run();
                        } catch (Throwable th10) {
                            m70.a.u(th10);
                            mo3.a.m(th10);
                            return;
                        }
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        dVar.onError(th11);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ((efm.l) this.f235761c).onComplete();
                break;
            case 2:
                ifm.c cVar = this.f235760b;
                lfm.d dVar2 = lfm.d.DISPOSED;
                if (cVar != dVar2) {
                    try {
                        ((rfm.y) this.d).e.run();
                        this.f235760b = dVar2;
                        ((efm.l) this.f235761c).onComplete();
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        a(th12);
                        return;
                    }
                    break;
                }
                break;
            default:
                f0 f0Var = (f0) this.f235761c;
                this.f235760b = lfm.d.DISPOSED;
                Object obj2 = this.d;
                if (obj2 == null) {
                    f0Var.onError(new NoSuchElementException("The MaybeSource is empty"));
                } else {
                    f0Var.onSuccess(obj2);
                }
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f235759a) {
            case 0:
                t tVar = (t) this.d;
                if (this.f235760b == lfm.d.DISPOSED) {
                    mo3.a.m(th10);
                } else {
                    try {
                        tVar.f235764c.accept(th10);
                        tVar.e.run();
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        th10 = new CompositeException(th10, th11);
                    }
                    ((efm.d) this.f235761c).onError(th10);
                    try {
                        tVar.f.run();
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        mo3.a.m(th12);
                        return;
                    }
                }
                break;
            case 1:
                ((efm.l) this.f235761c).onError(th10);
                break;
            case 2:
                if (this.f235760b != lfm.d.DISPOSED) {
                    a(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            case 3:
                this.f235760b = lfm.d.DISPOSED;
                ((f0) this.f235761c).onError(th10);
                break;
            case 4:
                ((f0) this.f235761c).onError(th10);
                break;
            default:
                ((f0) this.f235761c).onError(th10);
                try {
                    ((kfm.a) this.d).run();
                } catch (Throwable th13) {
                    m70.a.u(th13);
                    mo3.a.m(th13);
                }
                break;
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f235759a) {
            case 0:
                efm.d dVar = (efm.d) this.f235761c;
                try {
                    ((t) this.d).f235763b.accept(cVar);
                    if (lfm.d.f(this.f235760b, cVar)) {
                        this.f235760b = cVar;
                        dVar.onSubscribe(this);
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    cVar.dispose();
                    this.f235760b = lfm.d.DISPOSED;
                    dVar.onSubscribe(lfm.e.INSTANCE);
                    dVar.onError(th10);
                    return;
                }
                break;
            case 1:
                if (lfm.d.f(this.f235760b, cVar)) {
                    this.f235760b = cVar;
                    ((efm.l) this.f235761c).onSubscribe(this);
                }
                break;
            case 2:
                efm.l lVar = (efm.l) this.f235761c;
                if (lfm.d.f(this.f235760b, cVar)) {
                    try {
                        ((rfm.y) this.d).f253984b.accept(cVar);
                        this.f235760b = cVar;
                        lVar.onSubscribe(this);
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        cVar.dispose();
                        this.f235760b = lfm.d.DISPOSED;
                        lfm.e.c(th11, lVar);
                        return;
                    }
                }
                break;
            case 3:
                if (lfm.d.f(this.f235760b, cVar)) {
                    this.f235760b = cVar;
                    ((f0) this.f235761c).onSubscribe(this);
                }
                break;
            case 4:
                if (lfm.d.f(this.f235760b, cVar)) {
                    this.f235760b = cVar;
                    ((f0) this.f235761c).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f235760b, cVar)) {
                    this.f235760b = cVar;
                    ((f0) this.f235761c).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f235759a) {
            case 1:
                efm.l lVar = (efm.l) this.f235761c;
                try {
                    Object objApply = ((kfm.o) this.d).apply(obj2);
                    mfm.f.b(objApply, "The mapper returned a null item");
                    lVar.onSuccess(objApply);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lVar.onError(th10);
                    return;
                }
                break;
            case 2:
                ifm.c cVar = this.f235760b;
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar != dVar) {
                    try {
                        ((rfm.y) this.d).f253985c.accept(obj2);
                        this.f235760b = dVar;
                        ((efm.l) this.f235761c).onSuccess(obj2);
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        a(th11);
                        return;
                    }
                    break;
                }
                break;
            case 3:
                this.f235760b = lfm.d.DISPOSED;
                ((f0) this.f235761c).onSuccess(obj2);
                break;
            case 4:
                ((f0) this.f235761c).onSuccess(obj2);
                try {
                    ((kfm.g) this.d).accept(obj2);
                } catch (Throwable th12) {
                    m70.a.u(th12);
                    mo3.a.m(th12);
                    return;
                }
                break;
            default:
                ((f0) this.f235761c).onSuccess(obj2);
                try {
                    ((kfm.a) this.d).run();
                } catch (Throwable th13) {
                    m70.a.u(th13);
                    mo3.a.m(th13);
                }
                break;
        }
    }

    public s(t tVar, efm.d dVar) {
        this.f235759a = 0;
        this.d = tVar;
        this.f235761c = dVar;
    }
}
