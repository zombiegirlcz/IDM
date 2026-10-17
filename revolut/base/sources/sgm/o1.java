package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class o1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263040a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f263041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f263042c;
    public final Object d;
    public Object e;

    public o1(fgm.e eVar) {
        this.d = eVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263040a) {
            case 0:
                this.f263041b.dispose();
                break;
            default:
                this.f263041b.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263040a) {
        }
        return this.f263041b.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263040a) {
            case 0:
                if (!this.f263042c) {
                    this.f263042c = true;
                    ((fgm.l) this.d).onComplete();
                    break;
                }
                break;
            default:
                fgm.e eVar = (fgm.e) this.d;
                if (!this.f263042c) {
                    this.f263042c = true;
                    Object obj2 = this.e;
                    this.e = null;
                    if (obj2 != null) {
                        eVar.onSuccess(obj2);
                    } else {
                        eVar.onComplete();
                    }
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263040a) {
            case 0:
                if (!this.f263042c) {
                    this.f263042c = true;
                    ((fgm.l) this.d).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                if (!this.f263042c) {
                    this.f263042c = true;
                    ((fgm.e) this.d).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263040a) {
            case 0:
                if (!this.f263042c) {
                    try {
                        Object objApply = ((igm.o) this.e).apply(obj2);
                        Objects.requireNonNull(objApply, "The selector returned a null Notification");
                        fgm.f fVar = (fgm.f) objApply;
                        Object obj3 = fVar.f135107a;
                        if (obj3 instanceof ygm.j) {
                            this.f263041b.dispose();
                            onError(fVar.a());
                        } else if (obj3 != null) {
                            fgm.l lVar = (fgm.l) this.d;
                            if (obj3 == null || (obj3 instanceof ygm.j)) {
                                obj3 = null;
                            }
                            lVar.onNext(obj3);
                        } else {
                            this.f263041b.dispose();
                            onComplete();
                        }
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        this.f263041b.dispose();
                        onError(th10);
                        return;
                    }
                } else if (obj2 instanceof fgm.f) {
                    fgm.f fVar2 = (fgm.f) obj2;
                    if (fVar2.f135107a instanceof ygm.j) {
                        jb3.l.v(fVar2.a());
                    }
                }
                break;
            default:
                if (!this.f263042c) {
                    if (this.e == null) {
                        this.e = obj2;
                    } else {
                        this.f263042c = true;
                        this.f263041b.dispose();
                        ((fgm.e) this.d).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263040a) {
            case 0:
                if (jgm.b.f(this.f263041b, disposable)) {
                    this.f263041b = disposable;
                    ((fgm.l) this.d).onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.f263041b, disposable)) {
                    this.f263041b = disposable;
                    ((fgm.e) this.d).onSubscribe(this);
                }
                break;
        }
    }

    public o1(fgm.l lVar, igm.o oVar) {
        this.d = lVar;
        this.e = oVar;
    }
}
