package ngm;

import fgm.p;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends AtomicReference implements fgm.b, Disposable, p, fgm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f215242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f215243c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f215241a = i;
        this.f215242b = obj2;
        this.f215243c = obj3;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f215241a) {
            case 0:
                jgm.b.a(this);
                break;
            case 1:
                jgm.b.a(this);
                break;
            case 2:
                jgm.b.a(this);
                break;
            case 3:
                jgm.b.a(this);
                ggm.b bVar = (ggm.b) this.f215242b;
                bVar.getClass();
                jgm.b.a(bVar);
                break;
            case 4:
                jgm.b.a(this);
                break;
            default:
                igm.a aVar = (igm.a) getAndSet(null);
                if (aVar != null) {
                    try {
                        aVar.run();
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        jb3.l.v(th10);
                    }
                    ((Disposable) this.f215243c).dispose();
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f215241a) {
            case 0:
                return get() == jgm.b.DISPOSED;
            case 1:
                return get() == jgm.b.DISPOSED;
            case 2:
                return jgm.b.b((Disposable) get());
            case 3:
                return jgm.b.b((Disposable) get());
            case 4:
                return jgm.b.b((Disposable) get());
            default:
                return ((Disposable) this.f215243c).isDisposed();
        }
    }

    @Override // fgm.b
    public void onComplete() {
        switch (this.f215241a) {
            case 0:
                try {
                    ((igm.a) this.f215243c).run();
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jb3.l.v(th10);
                }
                lazySet(jgm.b.DISPOSED);
                break;
            case 1:
            default:
                ((SingleSource) this.f215243c).c(new k7i.i(this, (p) this.f215242b, 12));
                break;
            case 2:
                ((CompletableSource) this.f215243c).c(new kgm.i(this, (fgm.b) this.f215242b, 15));
                break;
            case 3:
                ((fgm.e) this.f215243c).onComplete();
                break;
        }
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        switch (this.f215241a) {
            case 0:
                try {
                    ((igm.g) this.f215242b).accept(th10);
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    jb3.l.v(th11);
                }
                lazySet(jgm.b.DISPOSED);
                break;
            case 1:
                lazySet(jgm.b.DISPOSED);
                try {
                    ((igm.g) this.f215243c).accept(th10);
                } catch (Throwable th12) {
                    ce9.m.F(th12);
                    jb3.l.v(new CompositeException(th10, th12));
                    return;
                }
                break;
            case 2:
                ((fgm.b) this.f215242b).onError(th10);
                break;
            case 3:
                ((fgm.e) this.f215243c).onError(th10);
                break;
            case 4:
                ((p) this.f215242b).onError(th10);
                break;
            default:
                ((p) this.f215242b).onError(th10);
                break;
        }
    }

    @Override // fgm.b
    public final void onSubscribe(Disposable disposable) {
        switch (this.f215241a) {
            case 0:
                jgm.b.e(this, disposable);
                break;
            case 1:
                jgm.b.e(this, disposable);
                break;
            case 2:
                if (jgm.b.e(this, disposable)) {
                    ((fgm.b) this.f215242b).onSubscribe(this);
                }
                break;
            case 3:
                jgm.b.e(this, disposable);
                break;
            case 4:
                if (jgm.b.e(this, disposable)) {
                    ((p) this.f215242b).onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f((Disposable) this.f215243c, disposable)) {
                    this.f215243c = disposable;
                    ((p) this.f215242b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        switch (this.f215241a) {
            case 1:
                lazySet(jgm.b.DISPOSED);
                try {
                    ((igm.g) this.f215242b).accept(obj2);
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jb3.l.v(th10);
                    return;
                }
                break;
            case 2:
            default:
                ((p) this.f215242b).onSuccess(obj2);
                break;
            case 3:
                ((fgm.e) this.f215243c).onSuccess(obj2);
                break;
        }
    }

    public g(p pVar, com.onfido.android.sdk.capture.ui.camera.c cVar) {
        this.f215241a = 5;
        this.f215242b = pVar;
        lazySet(cVar);
    }

    public g(fgm.e eVar) {
        this.f215241a = 3;
        this.f215243c = eVar;
        this.f215242b = new ggm.b();
    }
}
