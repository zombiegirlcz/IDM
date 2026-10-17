package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class l2 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f262977c;
    public Disposable d;

    public /* synthetic */ l2(fgm.l lVar, igm.o oVar, int i) {
        this.f262975a = i;
        this.f262976b = lVar;
        this.f262977c = oVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262975a) {
            case 0:
                this.d.dispose();
                this.d = jgm.b.DISPOSED;
                break;
            default:
                this.d.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262975a) {
        }
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262975a) {
            case 0:
                Disposable disposable = this.d;
                jgm.b bVar = jgm.b.DISPOSED;
                if (disposable != bVar) {
                    this.d = bVar;
                    this.f262976b.onComplete();
                    break;
                }
                break;
            default:
                this.f262976b.onComplete();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262975a) {
            case 0:
                Disposable disposable = this.d;
                jgm.b bVar = jgm.b.DISPOSED;
                if (disposable != bVar) {
                    this.d = bVar;
                    this.f262976b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                fgm.l lVar = this.f262976b;
                try {
                    Object objApply = this.f262977c.apply(th10);
                    if (objApply != null) {
                        lVar.onNext(objApply);
                        lVar.onComplete();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th10);
                        lVar.onError(nullPointerException);
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    lVar.onError(new CompositeException(th10, th11));
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262975a) {
            case 0:
                if (this.d != jgm.b.DISPOSED) {
                    try {
                        for (Object obj3 : (Iterable) this.f262977c.apply(obj2)) {
                            try {
                                try {
                                    Objects.requireNonNull(obj3, "The iterator returned a null value");
                                    this.f262976b.onNext(obj3);
                                } catch (Throwable th10) {
                                    ce9.m.F(th10);
                                    this.d.dispose();
                                    onError(th10);
                                    return;
                                }
                            } catch (Throwable th11) {
                                ce9.m.F(th11);
                                this.d.dispose();
                                onError(th11);
                                return;
                            }
                        }
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        this.d.dispose();
                        onError(th12);
                        return;
                    }
                    break;
                }
                break;
            default:
                this.f262976b.onNext(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262975a) {
            case 0:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262976b.onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262976b.onSubscribe(this);
                }
                break;
        }
    }
}
