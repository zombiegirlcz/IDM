package dgm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vfm.c f114730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f114731c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f114732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f114733h;
    public final AtomicBoolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f114734j;
    public final AtomicLong k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f114735l;

    public h() {
        mfm.f.e(8, "capacityHint");
        this.f114730b = new vfm.c(8);
        this.f114731c = new AtomicReference(null);
        this.d = true;
        this.f114732g = new AtomicReference();
        this.i = new AtomicBoolean();
        this.f114734j = new g(this);
        this.k = new AtomicLong();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (this.e || this.f114733h) {
            bVar.cancel();
        } else {
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        if (this.i.get() || !this.i.compareAndSet(false, true)) {
            yfm.d.d(new IllegalStateException("This processor allows only a single Subscriber"), aVar);
            return;
        }
        aVar.e(this.f114734j);
        this.f114732g.set(aVar);
        if (this.f114733h) {
            this.f114732g.lazySet(null);
        } else {
            u();
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e || this.f114733h) {
            return;
        }
        this.e = true;
        Runnable runnable = (Runnable) this.f114731c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        u();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e || this.f114733h) {
            mo3.a.m(th10);
            return;
        }
        this.f = th10;
        this.e = true;
        Runnable runnable = (Runnable) this.f114731c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        u();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        mfm.f.b(obj2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.e || this.f114733h) {
            return;
        }
        this.f114730b.offer(obj2);
        u();
    }

    public final boolean t(boolean z, boolean z3, boolean z4, dom.a aVar, vfm.c cVar) {
        if (this.f114733h) {
            cVar.clear();
            this.f114732g.lazySet(null);
            return true;
        }
        if (!z3) {
            return false;
        }
        if (z && this.f != null) {
            cVar.clear();
            this.f114732g.lazySet(null);
            aVar.onError(this.f);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th10 = this.f;
        this.f114732g.lazySet(null);
        if (th10 != null) {
            aVar.onError(th10);
            return true;
        }
        aVar.onComplete();
        return true;
    }

    public final void u() {
        boolean z;
        if (this.f114734j.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        dom.a aVar = (dom.a) this.f114732g.get();
        int iAddAndGet2 = 1;
        while (aVar == null) {
            iAddAndGet2 = this.f114734j.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                aVar = (dom.a) this.f114732g.get();
            }
        }
        if (this.f114735l) {
            vfm.c cVar = this.f114730b;
            boolean z3 = this.d;
            while (!this.f114733h) {
                boolean z4 = this.e;
                if (!z3 && z4 && this.f != null) {
                    cVar.clear();
                    this.f114732g.lazySet(null);
                    aVar.onError(this.f);
                    return;
                }
                aVar.onNext(null);
                if (z4) {
                    this.f114732g.lazySet(null);
                    Throwable th10 = this.f;
                    if (th10 != null) {
                        aVar.onError(th10);
                        return;
                    } else {
                        aVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.f114734j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f114732g.lazySet(null);
            return;
        }
        vfm.c cVar2 = this.f114730b;
        boolean z6 = !this.d;
        int iAddAndGet3 = 1;
        while (true) {
            long j2 = this.k.get();
            long j3 = 0;
            while (j2 != j3) {
                boolean z11 = this.e;
                Object objPoll = cVar2.poll();
                boolean z12 = objPoll == null;
                if (t(z6, z11, z12, aVar, cVar2)) {
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
                if (t(z6, this.e, cVar2.isEmpty(), aVar, cVar2)) {
                    return;
                }
            } else {
                z = z6;
            }
            if (j3 != 0 && j2 != Long.MAX_VALUE) {
                this.k.addAndGet(-j3);
            }
            iAddAndGet3 = this.f114734j.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z6 = z;
            }
        }
    }
}
