package fhm;

import bhm.i;
import fgm.l;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kgm.j;
import ygm.g;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f135274a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f135276c;
    public volatile boolean e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f135277g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f135279j;
    public final boolean d = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f135275b = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f135278h = new AtomicBoolean();
    public final e i = new e(this);

    public f(int i, Runnable runnable) {
        this.f135274a = new i(i);
        this.f135276c = new AtomicReference(runnable);
    }

    public static f c(int i, Runnable runnable) {
        j.a(i, "capacityHint");
        Objects.requireNonNull(runnable, "onTerminate");
        return new f(i, runnable);
    }

    public final void d() {
        AtomicReference atomicReference = this.f135276c;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void e() {
        Throwable th10;
        if (this.i.getAndIncrement() != 0) {
            return;
        }
        l lVar = (l) this.f135275b.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (lVar == null) {
            iAddAndGet2 = this.i.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                lVar = (l) this.f135275b.get();
            }
        }
        if (this.f135279j) {
            i iVar = this.f135274a;
            boolean z = this.d;
            while (!this.e) {
                boolean z3 = this.f;
                if (!z && z3 && (th10 = this.f135277g) != null) {
                    this.f135275b.lazySet(null);
                    iVar.clear();
                    lVar.onError(th10);
                    return;
                }
                lVar.onNext(null);
                if (z3) {
                    this.f135275b.lazySet(null);
                    Throwable th11 = this.f135277g;
                    if (th11 != null) {
                        lVar.onError(th11);
                        return;
                    } else {
                        lVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f135275b.lazySet(null);
            return;
        }
        i iVar2 = this.f135274a;
        boolean z4 = this.d;
        boolean z6 = true;
        int iAddAndGet3 = 1;
        while (!this.e) {
            boolean z11 = this.f;
            Object objPoll = this.f135274a.poll();
            boolean z12 = objPoll == null;
            if (z11) {
                if (!z4 && z6) {
                    Throwable th12 = this.f135277g;
                    if (th12 != null) {
                        this.f135275b.lazySet(null);
                        iVar2.clear();
                        lVar.onError(th12);
                        return;
                    }
                    z6 = false;
                }
                if (z12) {
                    this.f135275b.lazySet(null);
                    Throwable th13 = this.f135277g;
                    if (th13 != null) {
                        lVar.onError(th13);
                        return;
                    } else {
                        lVar.onComplete();
                        return;
                    }
                }
            }
            if (z12) {
                iAddAndGet3 = this.i.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                lVar.onNext(objPoll);
            }
        }
        this.f135275b.lazySet(null);
        iVar2.clear();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f || this.e) {
            return;
        }
        this.f = true;
        d();
        e();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        g.c(th10, "onError called with a null Throwable.");
        if (this.f || this.e) {
            jb3.l.v(th10);
            return;
        }
        this.f135277g = th10;
        this.f = true;
        d();
        e();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        g.c(obj2, "onNext called with a null value.");
        if (this.f || this.e) {
            return;
        }
        this.f135274a.offer(obj2);
        e();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (this.f || this.e) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(l lVar) {
        if (this.f135278h.get() || !this.f135278h.compareAndSet(false, true)) {
            jgm.c.c(new IllegalStateException("Only a single observer allowed."), lVar);
            return;
        }
        lVar.onSubscribe(this.i);
        this.f135275b.lazySet(lVar);
        if (this.e) {
            this.f135275b.lazySet(null);
        } else {
            e();
        }
    }
}
