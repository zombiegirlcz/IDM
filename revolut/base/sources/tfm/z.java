package tfm;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends ofm.q implements Runnable, ifm.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable f270979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270980h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270981j;
    public ifm.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Collection f270982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReference f270983m;

    public z(bgm.d dVar, Callable callable, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        super(dVar, new ufm.g());
        this.f270983m = new AtomicReference();
        this.f270979g = callable;
        this.f270980h = j2;
        this.i = timeUnit;
        this.f270981j = c0Var;
    }

    @Override // ofm.q
    public final void a(efm.y yVar, Object obj2) {
        this.f224946b.onNext((Collection) obj2);
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f270983m);
        this.k.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270983m.get() == lfm.d.DISPOSED;
    }

    @Override // efm.y
    public final void onComplete() {
        Collection collection;
        synchronized (this) {
            collection = this.f270982l;
            this.f270982l = null;
        }
        if (collection != null) {
            this.f224947c.offer(collection);
            this.e = true;
            if (f()) {
                c6d.b.h(this.f224947c, this.f224946b, null, this);
            }
        }
        lfm.d.a(this.f270983m);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        synchronized (this) {
            this.f270982l = null;
        }
        this.f224946b.onError(th10);
        lfm.d.a(this.f270983m);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        synchronized (this) {
            try {
                Collection collection = this.f270982l;
                if (collection == null) {
                    return;
                }
                collection.add(obj2);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.k, cVar)) {
            this.k = cVar;
            try {
                Object objCall = this.f270979g.call();
                mfm.f.b(objCall, "The buffer supplied is null");
                this.f270982l = (Collection) objCall;
                this.f224946b.onSubscribe(this);
                if (!this.d) {
                    efm.c0 c0Var = this.f270981j;
                    long j2 = this.f270980h;
                    ifm.c cVarE = c0Var.e(this, j2, j2, this.i);
                    AtomicReference atomicReference = this.f270983m;
                    while (!atomicReference.compareAndSet(null, cVarE)) {
                        if (atomicReference.get() != null) {
                            cVarE.dispose();
                            return;
                        }
                    }
                }
            } catch (Throwable th10) {
                m70.a.u(th10);
                dispose();
                lfm.e.d(th10, this.f224946b);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection collection;
        try {
            Object objCall = this.f270979g.call();
            mfm.f.b(objCall, "The bufferSupplier returned a null buffer");
            Collection collection2 = (Collection) objCall;
            synchronized (this) {
                try {
                    collection = this.f270982l;
                    if (collection != null) {
                        this.f270982l = collection2;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            if (collection == null) {
                lfm.d.a(this.f270983m);
            } else {
                h(collection, this);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            this.f224946b.onError(th11);
            dispose();
        }
    }
}
