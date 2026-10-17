package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class a0 extends ngm.n implements Runnable, Disposable {
    public final igm.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f262689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeUnit f262690h;
    public final Scheduler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Disposable f262691j;
    public Collection k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f262692l;

    public a0(ahm.c cVar, igm.q qVar, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        super(cVar, new su9.c());
        this.f262692l = new AtomicReference();
        this.f = qVar;
        this.f262689g = j2;
        this.f262690h = timeUnit;
        this.i = scheduler;
    }

    @Override // ngm.n
    public final void b(fgm.l lVar, Object obj2) {
        this.f215262b.onNext((Collection) obj2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f262692l);
        this.f262691j.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f262692l.get() == jgm.b.DISPOSED;
    }

    @Override // fgm.l
    public final void onComplete() {
        Collection collection;
        synchronized (this) {
            collection = this.k;
            this.k = null;
        }
        if (collection != null) {
            this.f215263c.offer(collection);
            this.e = true;
            if (j()) {
                z92.f.f(this.f215263c, this.f215262b, null, this);
            }
        }
        jgm.b.a(this.f262692l);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        synchronized (this) {
            this.k = null;
        }
        this.f215262b.onError(th10);
        jgm.b.a(this.f262692l);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        synchronized (this) {
            try {
                Collection collection = this.k;
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
        ahm.c cVar = this.f215262b;
        if (jgm.b.f(this.f262691j, disposable)) {
            this.f262691j = disposable;
            try {
                Object obj2 = this.f.get();
                Objects.requireNonNull(obj2, "The buffer supplied is null");
                this.k = (Collection) obj2;
                cVar.onSubscribe(this);
                AtomicReference atomicReference = this.f262692l;
                if (jgm.b.b((Disposable) atomicReference.get())) {
                    return;
                }
                long j2 = this.f262689g;
                jgm.b.d(atomicReference, this.i.e(this, j2, j2, this.f262690h));
            } catch (Throwable th10) {
                ce9.m.F(th10);
                dispose();
                jgm.c.c(th10, cVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection collection;
        try {
            Object obj2 = this.f.get();
            Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
            Collection collection2 = (Collection) obj2;
            synchronized (this) {
                try {
                    collection = this.k;
                    if (collection != null) {
                        this.k = collection2;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            if (collection == null) {
                jgm.b.a(this.f262692l);
            } else {
                k(collection, this);
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            this.f215262b.onError(th11);
            dispose();
        }
    }
}
