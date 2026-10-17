package tfm;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f270697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f270698c;
    public Object d;

    public /* synthetic */ o2(Object obj2, int i) {
        this.f270696a = i;
        this.f270698c = obj2;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270696a) {
            case 0:
                this.f270697b.dispose();
                this.f270697b = lfm.d.DISPOSED;
                break;
            case 1:
                this.f270697b.dispose();
                this.f270697b = lfm.d.DISPOSED;
                break;
            case 2:
                this.d = null;
                this.f270697b.dispose();
                break;
            case 3:
                this.f270697b.dispose();
                break;
            default:
                this.f270697b.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270696a) {
            case 1:
                if (this.f270697b == lfm.d.DISPOSED) {
                }
                break;
        }
        return this.f270697b.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270696a) {
            case 0:
                ifm.c cVar = this.f270697b;
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar != dVar) {
                    this.f270697b = dVar;
                    ((efm.y) this.f270698c).onComplete();
                    break;
                }
                break;
            case 1:
                efm.l lVar = (efm.l) this.f270698c;
                this.f270697b = lfm.d.DISPOSED;
                Object obj2 = this.d;
                if (obj2 == null) {
                    lVar.onComplete();
                } else {
                    this.d = null;
                    lVar.onSuccess(obj2);
                }
                break;
            case 2:
                efm.y yVar = (efm.y) this.f270698c;
                Object obj3 = this.d;
                if (obj3 != null) {
                    this.d = null;
                    yVar.onNext(obj3);
                }
                yVar.onComplete();
                break;
            case 3:
                Collection collection = (Collection) this.d;
                this.d = null;
                efm.y yVar2 = (efm.y) this.f270698c;
                yVar2.onNext(collection);
                yVar2.onComplete();
                break;
            default:
                Collection collection2 = (Collection) this.d;
                this.d = null;
                ((efm.f0) this.f270698c).onSuccess(collection2);
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270696a) {
            case 0:
                ifm.c cVar = this.f270697b;
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar != dVar) {
                    this.f270697b = dVar;
                    ((efm.y) this.f270698c).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            case 1:
                this.f270697b = lfm.d.DISPOSED;
                this.d = null;
                ((efm.l) this.f270698c).onError(th10);
                break;
            case 2:
                this.d = null;
                ((efm.y) this.f270698c).onError(th10);
                break;
            case 3:
                this.d = null;
                ((efm.y) this.f270698c).onError(th10);
                break;
            default:
                this.d = null;
                ((efm.f0) this.f270698c).onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270696a) {
            case 0:
                if (this.f270697b != lfm.d.DISPOSED) {
                    try {
                        efm.y yVar = (efm.y) this.f270698c;
                        for (Object obj3 : (Iterable) ((kfm.o) this.d).apply(obj2)) {
                            try {
                                try {
                                    mfm.f.b(obj3, "The iterator returned a null value");
                                    yVar.onNext(obj3);
                                } catch (Throwable th10) {
                                    m70.a.u(th10);
                                    this.f270697b.dispose();
                                    onError(th10);
                                    return;
                                }
                            } catch (Throwable th11) {
                                m70.a.u(th11);
                                this.f270697b.dispose();
                                onError(th11);
                                return;
                            }
                        }
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        this.f270697b.dispose();
                        onError(th12);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                this.d = obj2;
                break;
            case 2:
                this.d = obj2;
                break;
            case 3:
                ((Collection) this.d).add(obj2);
                break;
            default:
                ((Collection) this.d).add(obj2);
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270696a) {
            case 0:
                if (lfm.d.f(this.f270697b, cVar)) {
                    this.f270697b = cVar;
                    ((efm.y) this.f270698c).onSubscribe(this);
                }
                break;
            case 1:
                if (lfm.d.f(this.f270697b, cVar)) {
                    this.f270697b = cVar;
                    ((efm.l) this.f270698c).onSubscribe(this);
                }
                break;
            case 2:
                if (lfm.d.f(this.f270697b, cVar)) {
                    this.f270697b = cVar;
                    ((efm.y) this.f270698c).onSubscribe(this);
                }
                break;
            case 3:
                if (lfm.d.f(this.f270697b, cVar)) {
                    this.f270697b = cVar;
                    ((efm.y) this.f270698c).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f270697b, cVar)) {
                    this.f270697b = cVar;
                    ((efm.f0) this.f270698c).onSubscribe(this);
                }
                break;
        }
    }

    public /* synthetic */ o2(Object obj2, Object obj3, int i) {
        this.f270696a = i;
        this.f270698c = obj2;
        this.d = obj3;
    }
}
