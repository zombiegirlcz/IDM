package ofm;

import efm.f0;
import efm.y;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f224928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f224929c;
    public final Object d;
    public Object e;

    public /* synthetic */ k(Object obj2, int i, Object obj3, Object obj4) {
        this.f224927a = i;
        this.f224929c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f224927a) {
            case 0:
                ifm.c cVar = this.f224928b;
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar != dVar) {
                    this.f224928b = dVar;
                    try {
                        ((kfm.a) this.e).run();
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        mo3.a.m(th10);
                    }
                    cVar.dispose();
                }
                break;
            case 1:
                this.f224928b.dispose();
                this.f224928b = lfm.d.DISPOSED;
                break;
            default:
                this.f224928b.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f224927a) {
            case 1:
                if (this.f224928b == lfm.d.DISPOSED) {
                }
                break;
        }
        return this.f224928b.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f224927a) {
            case 0:
                ifm.c cVar = this.f224928b;
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar != dVar) {
                    this.f224928b = dVar;
                    ((y) this.f224929c).onComplete();
                }
                break;
            case 1:
                f0 f0Var = (f0) this.f224929c;
                this.f224928b = lfm.d.DISPOSED;
                Object obj2 = this.e;
                if (obj2 == null) {
                    Object obj3 = this.d;
                    if (obj3 == null) {
                        f0Var.onError(new NoSuchElementException());
                    } else {
                        f0Var.onSuccess(obj3);
                    }
                } else {
                    this.e = null;
                    f0Var.onSuccess(obj2);
                }
                break;
            default:
                Object obj4 = this.e;
                if (obj4 != null) {
                    this.e = null;
                    ((f0) this.f224929c).onSuccess(obj4);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f224927a) {
            case 0:
                ifm.c cVar = this.f224928b;
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar == dVar) {
                    mo3.a.m(th10);
                } else {
                    this.f224928b = dVar;
                    ((y) this.f224929c).onError(th10);
                }
                break;
            case 1:
                this.f224928b = lfm.d.DISPOSED;
                this.e = null;
                ((f0) this.f224929c).onError(th10);
                break;
            default:
                if (this.e == null) {
                    mo3.a.m(th10);
                } else {
                    this.e = null;
                    ((f0) this.f224929c).onError(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f224927a) {
            case 0:
                ((y) this.f224929c).onNext(obj2);
                break;
            case 1:
                this.e = obj2;
                break;
            default:
                Object obj3 = this.e;
                if (obj3 != null) {
                    try {
                        Object objApply = ((kfm.c) this.d).apply(obj3, obj2);
                        mfm.f.b(objApply, "The reducer returned a null value");
                        this.e = objApply;
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        this.f224928b.dispose();
                        onError(th10);
                    }
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f224927a) {
            case 0:
                y yVar = (y) this.f224929c;
                try {
                    ((kfm.g) this.d).accept(cVar);
                    if (lfm.d.f(this.f224928b, cVar)) {
                        this.f224928b = cVar;
                        yVar.onSubscribe(this);
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    cVar.dispose();
                    this.f224928b = lfm.d.DISPOSED;
                    lfm.e.d(th10, yVar);
                    return;
                }
                break;
            case 1:
                if (lfm.d.f(this.f224928b, cVar)) {
                    this.f224928b = cVar;
                    ((f0) this.f224929c).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f224928b, cVar)) {
                    this.f224928b = cVar;
                    ((f0) this.f224929c).onSubscribe(this);
                }
                break;
        }
    }

    public k(f0 f0Var, Object obj2) {
        this.f224927a = 1;
        this.f224929c = f0Var;
        this.d = obj2;
    }
}
