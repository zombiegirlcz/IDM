package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class i5 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262907a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.c f262909c;
    public Object d;
    public Disposable e;
    public boolean f;

    public i5(fgm.l lVar, igm.c cVar) {
        this.f262908b = lVar;
        this.f262909c = cVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262907a) {
            case 0:
                this.e.dispose();
                break;
            default:
                this.e.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262907a) {
        }
        return this.e.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262907a) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.f262908b.onComplete();
                    break;
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    this.f262908b.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262907a) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.f262908b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    this.f262908b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262907a) {
            case 0:
                if (!this.f) {
                    Object obj3 = this.d;
                    fgm.l lVar = this.f262908b;
                    if (obj3 == null) {
                        this.d = obj2;
                        lVar.onNext(obj2);
                    } else {
                        try {
                            Object objApply = this.f262909c.apply(obj3, obj2);
                            Objects.requireNonNull(objApply, "The value returned by the accumulator is null");
                            this.d = objApply;
                            lVar.onNext(objApply);
                        } catch (Throwable th10) {
                            ce9.m.F(th10);
                            this.e.dispose();
                            onError(th10);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                if (!this.f) {
                    try {
                        Object objApply2 = this.f262909c.apply(this.d, obj2);
                        Objects.requireNonNull(objApply2, "The accumulator returned a null value");
                        this.d = objApply2;
                        this.f262908b.onNext(objApply2);
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        this.e.dispose();
                        onError(th11);
                    }
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262907a) {
            case 0:
                if (jgm.b.f(this.e, disposable)) {
                    this.e = disposable;
                    this.f262908b.onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.e, disposable)) {
                    this.e = disposable;
                    fgm.l lVar = this.f262908b;
                    lVar.onSubscribe(this);
                    lVar.onNext(this.d);
                }
                break;
        }
    }

    public i5(fgm.l lVar, igm.c cVar, Object obj2) {
        this.f262908b = lVar;
        this.f262909c = cVar;
        this.d = obj2;
    }
}
