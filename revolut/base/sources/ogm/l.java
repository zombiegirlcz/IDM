package ogm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class l implements fgm.b, Disposable, fgm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f225230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225231c;
    public final Object d;

    public l(fgm.e eVar, igm.p pVar) {
        this.f225229a = 1;
        this.f225231c = eVar;
        this.d = pVar;
    }

    public boolean a(int i) {
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        int i2 = 0;
        if (atomicInteger.get() != 0 || !atomicInteger.compareAndSet(0, i)) {
            return false;
        }
        sgm.o[] oVarArr = (sgm.o[]) this.f225230b;
        int length = oVarArr.length;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (i3 != i) {
                sgm.o oVar = oVarArr[i2];
                oVar.getClass();
                jgm.b.a(oVar);
            }
            i2 = i3;
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f225229a) {
            case 0:
                ((Disposable) this.f225230b).dispose();
                break;
            case 1:
                Disposable disposable = (Disposable) this.f225230b;
                this.f225230b = jgm.b.DISPOSED;
                disposable.dispose();
                break;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.d;
                if (atomicInteger.get() != -1) {
                    atomicInteger.lazySet(-1);
                    for (sgm.o oVar : (sgm.o[]) this.f225230b) {
                        oVar.getClass();
                        jgm.b.a(oVar);
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f225229a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((AtomicInteger) this.d).get() == -1) {
                }
                break;
        }
        return ((Disposable) this.f225230b).isDisposed();
    }

    @Override // fgm.b
    public void onComplete() {
        fgm.b bVar = (fgm.b) this.f225231c;
        m mVar = (m) this.d;
        if (((Disposable) this.f225230b) == jgm.b.DISPOSED) {
            return;
        }
        try {
            mVar.d.run();
            mVar.e.run();
            bVar.onComplete();
        } catch (Throwable th10) {
            ce9.m.F(th10);
            bVar.onError(th10);
        }
    }

    @Override // fgm.b, efm.f0
    public void onError(Throwable th10) {
        switch (this.f225229a) {
            case 0:
                m mVar = (m) this.d;
                if (((Disposable) this.f225230b) != jgm.b.DISPOSED) {
                    try {
                        mVar.f225234c.accept(th10);
                        mVar.e.run();
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        th10 = new CompositeException(th10, th11);
                    }
                    ((fgm.b) this.f225231c).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                ((fgm.e) this.f225231c).onError(th10);
                break;
        }
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        switch (this.f225229a) {
            case 0:
                fgm.b bVar = (fgm.b) this.f225231c;
                try {
                    ((m) this.d).f225233b.accept(disposable);
                    if (jgm.b.f((Disposable) this.f225230b, disposable)) {
                        this.f225230b = disposable;
                        bVar.onSubscribe(this);
                    }
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    disposable.dispose();
                    this.f225230b = jgm.b.DISPOSED;
                    bVar.onSubscribe(jgm.c.INSTANCE);
                    bVar.onError(th10);
                    return;
                }
                break;
            default:
                if (jgm.b.f((Disposable) this.f225230b, disposable)) {
                    this.f225230b = disposable;
                    ((fgm.e) this.f225231c).onSubscribe(this);
                }
                break;
        }
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        fgm.e eVar = (fgm.e) this.f225231c;
        try {
            if (((igm.p) this.d).test(obj2)) {
                eVar.onSuccess(obj2);
            } else {
                eVar.onComplete();
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            eVar.onError(th10);
        }
    }

    public l(m mVar, fgm.b bVar) {
        this.f225229a = 0;
        this.d = mVar;
        this.f225231c = bVar;
    }

    public l(fgm.l lVar, int i) {
        this.f225229a = 2;
        this.d = new AtomicInteger();
        this.f225231c = lVar;
        this.f225230b = new sgm.o[i];
    }
}
