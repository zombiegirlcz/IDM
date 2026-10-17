package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class d6 extends AtomicInteger implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262776c;
    public final fgm.o d;
    public final boolean e;
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final igm.g f262777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Disposable f262778h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f262779j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f262780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f262781m;

    public d6(fgm.l lVar, long j2, TimeUnit timeUnit, fgm.o oVar, boolean z, igm.g gVar) {
        this.f262774a = lVar;
        this.f262775b = j2;
        this.f262776c = timeUnit;
        this.d = oVar;
        this.e = z;
        this.f262777g = gVar;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f;
        fgm.l lVar = this.f262774a;
        int iAddAndGet = 1;
        while (!this.k) {
            boolean z = this.i;
            Throwable compositeException = this.f262779j;
            if (z && compositeException != null) {
                if (this.f262777g != null) {
                    Object andSet = atomicReference.getAndSet(null);
                    if (andSet != null) {
                        try {
                            this.f262777g.accept(andSet);
                        } catch (Throwable th10) {
                            ce9.m.F(th10);
                            compositeException = new CompositeException(compositeException, th10);
                        }
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                lVar.onError(compositeException);
                this.d.dispose();
                return;
            }
            boolean z3 = atomicReference.get() == null;
            if (z) {
                if (!z3) {
                    Object andSet2 = atomicReference.getAndSet(null);
                    if (this.e) {
                        lVar.onNext(andSet2);
                    } else {
                        igm.g gVar = this.f262777g;
                        if (gVar != null) {
                            try {
                                gVar.accept(andSet2);
                            } catch (Throwable th11) {
                                ce9.m.F(th11);
                                lVar.onError(th11);
                                this.d.dispose();
                                return;
                            }
                        }
                    }
                }
                lVar.onComplete();
                this.d.dispose();
                return;
            }
            if (z3) {
                if (this.f262780l) {
                    this.f262781m = false;
                    this.f262780l = false;
                }
            } else if (!this.f262781m || this.f262780l) {
                lVar.onNext(atomicReference.getAndSet(null));
                this.f262780l = false;
                this.f262781m = true;
                this.d.a(this, this.f262775b, this.f262776c);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        AtomicReference atomicReference2 = this.f;
        igm.g gVar2 = this.f262777g;
        if (gVar2 == null) {
            atomicReference2.lazySet(null);
            return;
        }
        Object andSet3 = atomicReference2.getAndSet(null);
        if (andSet3 != null) {
            try {
                gVar2.accept(andSet3);
            } catch (Throwable th12) {
                ce9.m.F(th12);
                jb3.l.v(th12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.k = true;
        this.f262778h.dispose();
        this.d.dispose();
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.f;
            igm.g gVar = this.f262777g;
            if (gVar == null) {
                atomicReference.lazySet(null);
                return;
            }
            Object andSet = atomicReference.getAndSet(null);
            if (andSet != null) {
                try {
                    gVar.accept(andSet);
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jb3.l.v(th10);
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.k;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.i = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f262779j = th10;
        this.i = true;
        a();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        Object andSet = this.f.getAndSet(obj2);
        igm.g gVar = this.f262777g;
        if (gVar != null && andSet != null) {
            try {
                gVar.accept(andSet);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                this.f262778h.dispose();
                this.f262779j = th10;
                this.i = true;
            }
        }
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f262778h, disposable)) {
            this.f262778h = disposable;
            this.f262774a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f262780l = true;
        a();
    }
}
