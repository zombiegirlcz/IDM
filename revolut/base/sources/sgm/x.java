package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class x extends ngm.n implements Disposable {
    public final igm.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ObservableSource f263264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Disposable f263265h;
    public w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Collection f263266j;

    public x(ahm.c cVar, igm.q qVar, ObservableSource observableSource) {
        super(cVar, new su9.c());
        this.f = qVar;
        this.f263264g = observableSource;
    }

    @Override // ngm.n
    public final void b(fgm.l lVar, Object obj2) {
        this.f215262b.onNext((Collection) obj2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.i.dispose();
        this.f263265h.dispose();
        if (j()) {
            this.f215263c.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // fgm.l
    public final void onComplete() {
        synchronized (this) {
            try {
                Collection collection = this.f263266j;
                if (collection == null) {
                    return;
                }
                this.f263266j = null;
                this.f215263c.offer(collection);
                this.e = true;
                if (j()) {
                    z92.f.f(this.f215263c, this.f215262b, this, this);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        dispose();
        this.f215262b.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        synchronized (this) {
            try {
                Collection collection = this.f263266j;
                if (collection == null) {
                    return;
                }
                collection.add(obj2);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263265h, disposable)) {
            this.f263265h = disposable;
            try {
                Object obj2 = this.f.get();
                Objects.requireNonNull(obj2, "The buffer supplied is null");
                this.f263266j = (Collection) obj2;
                w wVar = new w(this);
                this.i = wVar;
                this.f215262b.onSubscribe(this);
                if (this.d) {
                    return;
                }
                this.f263264g.subscribe(wVar);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                this.d = true;
                disposable.dispose();
                jgm.c.c(th10, this.f215262b);
            }
        }
    }
}
