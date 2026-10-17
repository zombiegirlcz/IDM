package ofm;

import efm.y;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends AtomicReference implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f224943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f224944c;
    public final Object d;
    public final Object e;

    public p(kfm.g gVar, kfm.g gVar2, kfm.a aVar, kfm.g gVar3) {
        this.f224942a = 0;
        this.f224943b = gVar;
        this.f224944c = gVar2;
        this.e = aVar;
        this.d = gVar3;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f224942a) {
            case 0:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a((AtomicReference) this.d);
                lfm.d.a((AtomicReference) this.e);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f224942a) {
            case 0:
                return get() == lfm.d.DISPOSED;
            default:
                return lfm.d.b((ifm.c) ((AtomicReference) this.d).get());
        }
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f224942a) {
            case 0:
                if (!isDisposed()) {
                    lazySet(lfm.d.DISPOSED);
                    try {
                        ((kfm.a) this.e).run();
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        mo3.a.m(th10);
                        return;
                    }
                }
                break;
            default:
                lfm.d.a((AtomicReference) this.e);
                ((bgm.d) this.f224943b).onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f224942a) {
            case 0:
                if (isDisposed()) {
                    mo3.a.m(th10);
                } else {
                    lazySet(lfm.d.DISPOSED);
                    try {
                        ((kfm.g) this.f224944c).accept(th10);
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        mo3.a.m(new CompositeException(th10, th11));
                        return;
                    }
                }
                break;
            default:
                lfm.d.a((AtomicReference) this.e);
                ((bgm.d) this.f224943b).onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f224942a) {
            case 0:
                if (!isDisposed()) {
                    try {
                        ((kfm.g) this.f224943b).accept(obj2);
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        ((ifm.c) get()).dispose();
                        onError(th10);
                        return;
                    }
                }
                break;
            default:
                bgm.d dVar = (bgm.d) this.f224943b;
                Object obj3 = get();
                if (obj3 != null) {
                    try {
                        Object objApply = ((kfm.c) this.f224944c).apply(obj2, obj3);
                        mfm.f.b(objApply, "The combiner returned a null value");
                        dVar.onNext(objApply);
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        dispose();
                        dVar.onError(th11);
                    }
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f224942a) {
            case 0:
                if (lfm.d.e(this, cVar)) {
                    try {
                        ((kfm.g) this.d).accept(this);
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        cVar.dispose();
                        onError(th10);
                        return;
                    }
                }
                break;
            default:
                lfm.d.e((AtomicReference) this.d, cVar);
                break;
        }
    }

    public p(bgm.d dVar, kfm.c cVar) {
        this.f224942a = 1;
        this.d = new AtomicReference();
        this.e = new AtomicReference();
        this.f224943b = dVar;
        this.f224944c = cVar;
    }
}
