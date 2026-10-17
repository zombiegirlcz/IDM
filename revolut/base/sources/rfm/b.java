package rfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends AtomicReference implements efm.l, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253916a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f253918c;
    public Object d;

    public b(kfm.g gVar, kfm.g gVar2, kfm.a aVar) {
        this.f253917b = gVar;
        this.f253918c = gVar2;
        this.d = aVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253916a) {
            case 0:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                ((ifm.c) this.d).dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253916a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.l
    public final void onComplete() {
        switch (this.f253916a) {
            case 0:
                lazySet(lfm.d.DISPOSED);
                try {
                    ((kfm.a) this.d).run();
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    mo3.a.m(th10);
                    return;
                }
                break;
            default:
                ((efm.l) this.f253917b).onComplete();
                break;
        }
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        switch (this.f253916a) {
            case 0:
                lazySet(lfm.d.DISPOSED);
                try {
                    ((kfm.g) this.f253918c).accept(th10);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    mo3.a.m(new CompositeException(th10, th11));
                    return;
                }
                break;
            default:
                ((efm.l) this.f253917b).onError(th10);
                break;
        }
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253916a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            default:
                if (lfm.d.f((ifm.c) this.d, cVar)) {
                    this.d = cVar;
                    ((efm.l) this.f253917b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f253916a) {
            case 0:
                lazySet(lfm.d.DISPOSED);
                try {
                    ((kfm.g) this.f253917b).accept(obj2);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    mo3.a.m(th10);
                }
                break;
            default:
                try {
                    Object objApply = ((kfm.o) this.f253918c).apply(obj2);
                    mfm.f.b(objApply, "The mapper returned a null MaybeSource");
                    efm.n nVar = (efm.n) objApply;
                    if (!isDisposed()) {
                        ((efm.k) nVar).i(new ecm.q(this, 22));
                    }
                } catch (Exception e) {
                    m70.a.u(e);
                    ((efm.l) this.f253917b).onError(e);
                    return;
                }
                break;
        }
    }

    public b(efm.l lVar, kfm.o oVar) {
        this.f253917b = lVar;
        this.f253918c = oVar;
    }
}
