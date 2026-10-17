package ngm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f215247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f215248c;
    public final Object d;
    public final Object e;

    public i(igm.g gVar, igm.g gVar2, igm.a aVar) {
        this.f215246a = 1;
        he2.b bVar = kgm.j.d;
        this.f215247b = gVar;
        this.f215248c = gVar2;
        this.d = aVar;
        this.e = bVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f215246a) {
            case 0:
                jgm.b.a(this);
                ggm.a aVar = (ggm.a) ((AtomicReference) this.e).getAndSet(null);
                if (aVar != null) {
                    aVar.b(this);
                }
                break;
            case 1:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a((AtomicReference) this.e);
                jgm.b.a((AtomicReference) this.d);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f215246a) {
            case 0:
                return jgm.b.b((Disposable) get());
            case 1:
                return get() == jgm.b.DISPOSED;
            default:
                return jgm.b.b((Disposable) ((AtomicReference) this.e).get());
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f215246a) {
            case 0:
                Object obj2 = get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (obj2 != bVar) {
                    lazySet(bVar);
                    try {
                        ((igm.a) this.d).run();
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        jb3.l.v(th10);
                    }
                }
                ggm.a aVar = (ggm.a) ((AtomicReference) this.e).getAndSet(null);
                if (aVar != null) {
                    aVar.b(this);
                }
                break;
            case 1:
                if (!isDisposed()) {
                    lazySet(jgm.b.DISPOSED);
                    try {
                        ((igm.a) this.d).run();
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        jb3.l.v(th11);
                        return;
                    }
                }
                break;
            default:
                jgm.b.a((AtomicReference) this.d);
                ((ahm.c) this.f215247b).onComplete();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f215246a) {
            case 0:
                Object obj2 = get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (obj2 != bVar) {
                    lazySet(bVar);
                    try {
                        ((igm.g) this.f215247b).accept(th10);
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        jb3.l.v(new CompositeException(th10, th11));
                    }
                } else {
                    jb3.l.v(th10);
                }
                ggm.a aVar = (ggm.a) ((AtomicReference) this.e).getAndSet(null);
                if (aVar != null) {
                    aVar.b(this);
                }
                break;
            case 1:
                if (isDisposed()) {
                    jb3.l.v(th10);
                } else {
                    lazySet(jgm.b.DISPOSED);
                    try {
                        ((igm.g) this.f215248c).accept(th10);
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        jb3.l.v(new CompositeException(th10, th12));
                        return;
                    }
                }
                break;
            default:
                jgm.b.a((AtomicReference) this.d);
                ((ahm.c) this.f215247b).onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f215246a) {
            case 0:
                if (get() != jgm.b.DISPOSED) {
                    try {
                        ((igm.g) this.f215248c).accept(obj2);
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        ((Disposable) get()).dispose();
                        onError(th10);
                        return;
                    }
                }
                break;
            case 1:
                if (!isDisposed()) {
                    try {
                        ((igm.g) this.f215247b).accept(obj2);
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        ((Disposable) get()).dispose();
                        onError(th11);
                        return;
                    }
                }
                break;
            default:
                ahm.c cVar = (ahm.c) this.f215247b;
                Object obj3 = get();
                if (obj3 != null) {
                    try {
                        Object objApply = ((igm.c) this.f215248c).apply(obj2, obj3);
                        Objects.requireNonNull(objApply, "The combiner returned a null value");
                        cVar.onNext(objApply);
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        dispose();
                        cVar.onError(th12);
                    }
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f215246a) {
            case 0:
                jgm.b.e(this, disposable);
                break;
            case 1:
                if (jgm.b.e(this, disposable)) {
                    try {
                        ((he2.b) this.e).getClass();
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        disposable.dispose();
                        onError(th10);
                        return;
                    }
                }
                break;
            default:
                jgm.b.e((AtomicReference) this.e, disposable);
                break;
        }
    }

    public i(ahm.c cVar, igm.c cVar2) {
        this.f215246a = 2;
        this.e = new AtomicReference();
        this.d = new AtomicReference();
        this.f215247b = cVar;
        this.f215248c = cVar2;
    }

    public i(igm.g gVar, igm.g gVar2, igm.a aVar, ggm.a aVar2) {
        this.f215246a = 0;
        this.f215247b = gVar2;
        this.d = aVar;
        this.e = new AtomicReference(aVar2);
        this.f215248c = gVar;
    }
}
