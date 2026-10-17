package ngm;

import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f215250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f215251c;
    public final Object d;
    public Object e;

    public /* synthetic */ j(Object obj2, int i, Object obj3, Object obj4) {
        this.f215249a = i;
        this.f215251c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f215249a) {
            case 0:
                Disposable disposable = this.f215250b;
                jgm.b bVar = jgm.b.DISPOSED;
                if (disposable != bVar) {
                    this.f215250b = bVar;
                    try {
                        ((igm.a) this.e).run();
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        jb3.l.v(th10);
                    }
                    disposable.dispose();
                }
                break;
            case 1:
                this.f215250b.dispose();
                this.f215250b = jgm.b.DISPOSED;
                break;
            default:
                this.f215250b.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f215249a) {
            case 1:
                if (this.f215250b == jgm.b.DISPOSED) {
                }
                break;
        }
        return this.f215250b.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f215249a) {
            case 0:
                Disposable disposable = this.f215250b;
                jgm.b bVar = jgm.b.DISPOSED;
                if (disposable != bVar) {
                    this.f215250b = bVar;
                    ((fgm.l) this.f215251c).onComplete();
                }
                break;
            case 1:
                p pVar = (p) this.f215251c;
                this.f215250b = jgm.b.DISPOSED;
                Object obj2 = this.e;
                if (obj2 == null) {
                    Object obj3 = this.d;
                    if (obj3 == null) {
                        pVar.onError(new NoSuchElementException());
                    } else {
                        pVar.onSuccess(obj3);
                    }
                } else {
                    this.e = null;
                    pVar.onSuccess(obj2);
                }
                break;
            default:
                Object obj4 = this.e;
                if (obj4 != null) {
                    this.e = null;
                    ((p) this.f215251c).onSuccess(obj4);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f215249a) {
            case 0:
                Disposable disposable = this.f215250b;
                jgm.b bVar = jgm.b.DISPOSED;
                if (disposable == bVar) {
                    jb3.l.v(th10);
                } else {
                    this.f215250b = bVar;
                    ((fgm.l) this.f215251c).onError(th10);
                }
                break;
            case 1:
                this.f215250b = jgm.b.DISPOSED;
                this.e = null;
                ((p) this.f215251c).onError(th10);
                break;
            default:
                if (this.e == null) {
                    jb3.l.v(th10);
                } else {
                    this.e = null;
                    ((p) this.f215251c).onError(th10);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f215249a) {
            case 0:
                ((fgm.l) this.f215251c).onNext(obj2);
                break;
            case 1:
                this.e = obj2;
                break;
            default:
                Object obj3 = this.e;
                if (obj3 != null) {
                    try {
                        Object objApply = ((igm.c) this.d).apply(obj3, obj2);
                        Objects.requireNonNull(objApply, "The reducer returned a null value");
                        this.e = objApply;
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        this.f215250b.dispose();
                        onError(th10);
                    }
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f215249a) {
            case 0:
                fgm.l lVar = (fgm.l) this.f215251c;
                try {
                    ((igm.g) this.d).accept(disposable);
                    if (jgm.b.f(this.f215250b, disposable)) {
                        this.f215250b = disposable;
                        lVar.onSubscribe(this);
                    }
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    disposable.dispose();
                    this.f215250b = jgm.b.DISPOSED;
                    jgm.c.c(th10, lVar);
                    return;
                }
                break;
            case 1:
                if (jgm.b.f(this.f215250b, disposable)) {
                    this.f215250b = disposable;
                    ((p) this.f215251c).onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.f215250b, disposable)) {
                    this.f215250b = disposable;
                    ((p) this.f215251c).onSubscribe(this);
                }
                break;
        }
    }

    public j(p pVar, Object obj2) {
        this.f215249a = 1;
        this.f215251c = pVar;
        this.d = obj2;
    }
}
