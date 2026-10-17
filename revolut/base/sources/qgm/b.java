package qgm;

import ce9.m;
import igm.o;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends AtomicReference implements fgm.e, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246364a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f246365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f246366c;
    public Object d;

    public b(igm.g gVar, igm.g gVar2) {
        kgm.b bVar = kgm.j.f184027c;
        this.f246365b = gVar;
        this.f246366c = gVar2;
        this.d = bVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f246364a) {
            case 0:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                ((Disposable) this.d).dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f246364a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.e
    public final void onComplete() {
        switch (this.f246364a) {
            case 0:
                lazySet(jgm.b.DISPOSED);
                try {
                    ((kgm.b) this.d).getClass();
                } catch (Throwable th10) {
                    m.F(th10);
                    jb3.l.v(th10);
                    return;
                }
                break;
            default:
                ((fgm.e) this.f246365b).onComplete();
                break;
        }
    }

    @Override // fgm.e
    public final void onError(Throwable th10) {
        switch (this.f246364a) {
            case 0:
                lazySet(jgm.b.DISPOSED);
                try {
                    ((igm.g) this.f246366c).accept(th10);
                } catch (Throwable th11) {
                    m.F(th11);
                    jb3.l.v(new CompositeException(th10, th11));
                    return;
                }
                break;
            default:
                ((fgm.e) this.f246365b).onError(th10);
                break;
        }
    }

    @Override // fgm.e
    public final void onSubscribe(Disposable disposable) {
        switch (this.f246364a) {
            case 0:
                jgm.b.e(this, disposable);
                break;
            default:
                if (jgm.b.f((Disposable) this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.e) this.f246365b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // fgm.e, fgm.p
    public final void onSuccess(Object obj2) {
        switch (this.f246364a) {
            case 0:
                lazySet(jgm.b.DISPOSED);
                try {
                    ((igm.g) this.f246365b).accept(obj2);
                } catch (Throwable th10) {
                    m.F(th10);
                    jb3.l.v(th10);
                }
                break;
            default:
                try {
                    Object objApply = ((o) this.f246366c).apply(obj2);
                    Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                    MaybeSource maybeSource = (MaybeSource) objApply;
                    if (!isDisposed()) {
                        maybeSource.c(new p56.a(this, 9));
                    }
                } catch (Throwable th11) {
                    m.F(th11);
                    ((fgm.e) this.f246365b).onError(th11);
                    return;
                }
                break;
        }
    }

    public b(fgm.e eVar, o oVar) {
        this.f246365b = eVar;
        this.f246366c = oVar;
    }
}
