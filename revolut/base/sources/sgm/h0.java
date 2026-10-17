package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class h0 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f262872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f262873c;
    public Disposable d;
    public boolean e;
    public final Object f;

    public /* synthetic */ h0(Object obj2, Object obj3, igm.b bVar, int i) {
        this.f262871a = i;
        this.f = obj2;
        this.f262872b = bVar;
        this.f262873c = obj3;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262871a) {
            case 0:
                this.d.dispose();
                break;
            case 1:
                this.d.dispose();
                break;
            case 2:
                this.d.dispose();
                break;
            case 3:
                this.d.dispose();
                break;
            default:
                this.d.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262871a) {
        }
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262871a) {
            case 0:
                fgm.l lVar = (fgm.l) this.f;
                if (!this.e) {
                    this.e = true;
                    lVar.onNext(this.f262873c);
                    lVar.onComplete();
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    ((fgm.p) this.f).onSuccess(this.f262873c);
                    break;
                }
                break;
            case 2:
                fgm.e eVar = (fgm.e) this.f;
                if (!this.e) {
                    this.e = true;
                    Object obj2 = this.f262873c;
                    this.f262873c = null;
                    if (obj2 == null) {
                        eVar.onComplete();
                    } else {
                        eVar.onSuccess(obj2);
                    }
                    break;
                }
                break;
            case 3:
                fgm.p pVar = (fgm.p) this.f;
                if (!this.e) {
                    this.e = true;
                    Object obj3 = this.f262872b;
                    this.f262872b = null;
                    if (obj3 == null) {
                        obj3 = this.f262873c;
                    }
                    if (obj3 == null) {
                        pVar.onError(new NoSuchElementException());
                    } else {
                        pVar.onSuccess(obj3);
                    }
                    break;
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    ((fgm.l) this.f).onComplete();
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262871a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    ((fgm.l) this.f).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    ((fgm.p) this.f).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            case 2:
                if (!this.e) {
                    this.e = true;
                    this.f262873c = null;
                    ((fgm.e) this.f).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    ((fgm.p) this.f).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    ((fgm.l) this.f).onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262871a) {
            case 0:
                if (!this.e) {
                    try {
                        ((igm.b) this.f262872b).accept(this.f262873c, obj2);
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        this.d.dispose();
                        onError(th10);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    try {
                        ((igm.b) this.f262872b).accept(this.f262873c, obj2);
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        this.d.dispose();
                        onError(th11);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                if (!this.e) {
                    Object obj3 = this.f262873c;
                    if (obj3 == null) {
                        this.f262873c = obj2;
                    } else {
                        try {
                            Object objApply = ((igm.c) this.f262872b).apply(obj3, obj2);
                            Objects.requireNonNull(objApply, "The reducer returned a null value");
                            this.f262873c = objApply;
                        } catch (Throwable th12) {
                            ce9.m.F(th12);
                            this.d.dispose();
                            onError(th12);
                            return;
                        }
                    }
                }
                break;
            case 3:
                if (!this.e) {
                    if (this.f262872b == null) {
                        this.f262872b = obj2;
                    } else {
                        this.e = true;
                        this.d.dispose();
                        ((fgm.p) this.f).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
            default:
                fgm.l lVar = (fgm.l) this.f;
                Iterator it8 = (Iterator) this.f262872b;
                if (!this.e) {
                    try {
                        Object next = it8.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        try {
                            Object objApply2 = ((igm.c) this.f262873c).apply(obj2, next);
                            Objects.requireNonNull(objApply2, "The zipper function returned a null value");
                            lVar.onNext(objApply2);
                            try {
                                if (!it8.hasNext()) {
                                    this.e = true;
                                    this.d.dispose();
                                    lVar.onComplete();
                                }
                            } catch (Throwable th13) {
                                ce9.m.F(th13);
                                this.e = true;
                                this.d.dispose();
                                lVar.onError(th13);
                                return;
                            }
                        } catch (Throwable th14) {
                            ce9.m.F(th14);
                            this.e = true;
                            this.d.dispose();
                            lVar.onError(th14);
                            return;
                        }
                    } catch (Throwable th15) {
                        ce9.m.F(th15);
                        this.e = true;
                        this.d.dispose();
                        lVar.onError(th15);
                    }
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262871a) {
            case 0:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.l) this.f).onSubscribe(this);
                }
                break;
            case 1:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.p) this.f).onSubscribe(this);
                }
                break;
            case 2:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.e) this.f).onSubscribe(this);
                }
                break;
            case 3:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.p) this.f).onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.l) this.f).onSubscribe(this);
                }
                break;
        }
    }

    public h0(fgm.p pVar, Object obj2) {
        this.f262871a = 3;
        this.f = pVar;
        this.f262873c = obj2;
    }

    public h0(fgm.e eVar, igm.c cVar) {
        this.f262871a = 2;
        this.f = eVar;
        this.f262872b = cVar;
    }

    public h0(fgm.l lVar, Iterator it8, igm.c cVar) {
        this.f262871a = 4;
        this.f = lVar;
        this.f262872b = it8;
        this.f262873c = cVar;
    }
}
