package dhm;

import bhm.i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;
import ygm.g;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends a {
    public volatile boolean e;
    public Throwable f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f114857h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f114859l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f114854b = new i(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f114855c = new AtomicReference(null);
    public final boolean d = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f114856g = new AtomicReference();
    public final AtomicBoolean i = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f114858j = new c(this);
    public final AtomicLong k = new AtomicLong();

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (this.e || this.f114857h) {
            bVar.cancel();
        } else {
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        if (this.i.get() || !this.i.compareAndSet(false, true)) {
            xgm.c.c(new IllegalStateException("This processor allows only a single Subscriber"), aVar);
            return;
        }
        aVar.e(this.f114858j);
        this.f114856g.set(aVar);
        if (this.f114857h) {
            this.f114856g.lazySet(null);
        } else {
            o();
        }
    }

    public final boolean n(boolean z, boolean z3, boolean z4, dom.a aVar, i iVar) {
        if (this.f114857h) {
            iVar.clear();
            this.f114856g.lazySet(null);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (z && this.f != null) {
            iVar.clear();
            this.f114856g.lazySet(null);
            aVar.onError(this.f);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th10 = this.f;
        this.f114856g.lazySet(null);
        if (th10 != null) {
            aVar.onError(th10);
            return true;
        }
        aVar.onComplete();
        return true;
    }

    public final void o() {
        boolean z;
        if (this.f114858j.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        dom.a aVar = (dom.a) this.f114856g.get();
        int iAddAndGet2 = 1;
        while (aVar == null) {
            iAddAndGet2 = this.f114858j.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                aVar = (dom.a) this.f114856g.get();
            }
        }
        if (this.f114859l) {
            i iVar = this.f114854b;
            boolean z3 = this.d;
            while (!this.f114857h) {
                boolean z4 = this.e;
                if (!z3 && z4 && this.f != null) {
                    iVar.clear();
                    this.f114856g.lazySet(null);
                    aVar.onError(this.f);
                    return;
                }
                aVar.onNext(null);
                if (z4) {
                    this.f114856g.lazySet(null);
                    Throwable th10 = this.f;
                    if (th10 != null) {
                        aVar.onError(th10);
                        return;
                    } else {
                        aVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f114858j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f114856g.lazySet(null);
            return;
        }
        i iVar2 = this.f114854b;
        boolean z6 = !this.d;
        int iAddAndGet3 = 1;
        while (true) {
            long j2 = this.k.get();
            long j3 = 0;
            while (j2 != j3) {
                boolean z11 = this.e;
                Object objPoll = iVar2.poll();
                boolean z12 = objPoll == null;
                if (n(z6, z11, z12, aVar, iVar2)) {
                    return;
                }
                if (z12) {
                    break;
                }
                aVar.onNext(objPoll);
                j3++;
            }
            if (j2 == j3) {
                z = z6;
                if (n(z6, this.e, iVar2.isEmpty(), aVar, iVar2)) {
                    return;
                }
            } else {
                z = z6;
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.k.addAndGet(-j3);
            }
            iAddAndGet3 = this.f114858j.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z6 = z;
            }
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e || this.f114857h) {
            return;
        }
        this.e = true;
        Runnable runnable = (Runnable) this.f114855c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        o();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        g.c(th10, "onError called with a null Throwable.");
        if (this.e || this.f114857h) {
            l.v(th10);
            return;
        }
        this.f = th10;
        this.e = true;
        Runnable runnable = (Runnable) this.f114855c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        o();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        g.c(obj2, "onNext called with a null value.");
        if (this.e || this.f114857h) {
            return;
        }
        this.f114854b.offer(obj2);
        o();
    }
}
