package tfm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f270469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f270470c;
    public ifm.c d;
    public boolean e;
    public final Object f;

    public /* synthetic */ g0(Object obj2, Object obj3, kfm.b bVar, int i) {
        this.f270468a = i;
        this.f = obj2;
        this.f270469b = bVar;
        this.f270470c = obj3;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270468a) {
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

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270468a) {
        }
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270468a) {
            case 0:
                efm.y yVar = (efm.y) this.f;
                if (!this.e) {
                    this.e = true;
                    yVar.onNext(this.f270470c);
                    yVar.onComplete();
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    ((efm.f0) this.f).onSuccess(this.f270470c);
                    break;
                }
                break;
            case 2:
                efm.l lVar = (efm.l) this.f;
                if (!this.e) {
                    this.e = true;
                    Object obj2 = this.f270470c;
                    this.f270470c = null;
                    if (obj2 == null) {
                        lVar.onComplete();
                    } else {
                        lVar.onSuccess(obj2);
                    }
                    break;
                }
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    ((efm.y) this.f).onComplete();
                    break;
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    ((efm.y) this.f).onComplete();
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270468a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    ((efm.y) this.f).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    ((efm.f0) this.f).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            case 2:
                if (!this.e) {
                    this.e = true;
                    this.f270470c = null;
                    ((efm.l) this.f).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    ((efm.y) this.f).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    ((efm.y) this.f).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270468a) {
            case 0:
                if (!this.e) {
                    try {
                        ((kfm.b) this.f270469b).accept(this.f270470c, obj2);
                    } catch (Throwable th10) {
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
                        ((kfm.b) this.f270469b).accept(this.f270470c, obj2);
                    } catch (Throwable th11) {
                        this.d.dispose();
                        onError(th11);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                if (!this.e) {
                    Object obj3 = this.f270470c;
                    if (obj3 == null) {
                        this.f270470c = obj2;
                    } else {
                        try {
                            Object objApply = ((kfm.c) this.f270469b).apply(obj3, obj2);
                            mfm.f.b(objApply, "The reducer returned a null value");
                            this.f270470c = objApply;
                        } catch (Throwable th12) {
                            m70.a.u(th12);
                            this.d.dispose();
                            onError(th12);
                            return;
                        }
                    }
                }
                break;
            case 3:
                if (!this.e) {
                    efm.y yVar = (efm.y) this.f;
                    Object obj4 = this.f270470c;
                    if (obj4 == null) {
                        this.f270470c = obj2;
                        yVar.onNext(obj2);
                    } else {
                        try {
                            Object objApply2 = ((kfm.c) this.f270469b).apply(obj4, obj2);
                            mfm.f.b(objApply2, "The value returned by the accumulator is null");
                            this.f270470c = objApply2;
                            yVar.onNext(objApply2);
                        } catch (Throwable th13) {
                            m70.a.u(th13);
                            this.d.dispose();
                            onError(th13);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                efm.y yVar2 = (efm.y) this.f;
                Iterator it8 = (Iterator) this.f270469b;
                if (!this.e) {
                    try {
                        Object next = it8.next();
                        mfm.f.b(next, "The iterator returned a null value");
                        try {
                            Object objApply3 = ((kfm.c) this.f270470c).apply(obj2, next);
                            mfm.f.b(objApply3, "The zipper function returned a null value");
                            yVar2.onNext(objApply3);
                            try {
                                if (!it8.hasNext()) {
                                    this.e = true;
                                    this.d.dispose();
                                    yVar2.onComplete();
                                }
                            } catch (Throwable th14) {
                                m70.a.u(th14);
                                this.e = true;
                                this.d.dispose();
                                yVar2.onError(th14);
                                return;
                            }
                        } catch (Throwable th15) {
                            m70.a.u(th15);
                            this.e = true;
                            this.d.dispose();
                            yVar2.onError(th15);
                            return;
                        }
                    } catch (Throwable th16) {
                        m70.a.u(th16);
                        this.e = true;
                        this.d.dispose();
                        yVar2.onError(th16);
                    }
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270468a) {
            case 0:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    ((efm.y) this.f).onSubscribe(this);
                }
                break;
            case 1:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    ((efm.f0) this.f).onSubscribe(this);
                }
                break;
            case 2:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    ((efm.l) this.f).onSubscribe(this);
                }
                break;
            case 3:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    ((efm.y) this.f).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.d, cVar)) {
                    this.d = cVar;
                    ((efm.y) this.f).onSubscribe(this);
                }
                break;
        }
    }

    public /* synthetic */ g0(Object obj2, kfm.c cVar, int i) {
        this.f270468a = i;
        this.f = obj2;
        this.f270469b = cVar;
    }

    public g0(efm.y yVar, Iterator it8, kfm.c cVar) {
        this.f270468a = 4;
        this.f = yVar;
        this.f270469b = it8;
        this.f270470c = cVar;
    }
}
