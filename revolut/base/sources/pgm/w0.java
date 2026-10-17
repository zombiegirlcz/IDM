package pgm;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class w0 extends xgm.a implements fgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bhm.f f236169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.a f236170c;
    public final igm.g d;
    public dom.b e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f236171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f236172h;
    public final AtomicLong i = new AtomicLong();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f236173j;

    public w0(dom.a aVar, int i, boolean z, kgm.b bVar, he2.b bVar2) {
        this.f236168a = aVar;
        this.f236170c = bVar;
        this.d = bVar2;
        this.f236169b = z ? new bhm.i(i) : new bhm.h(i);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (this.f236173j || !xgm.f.f(j2)) {
            return;
        }
        xam.a.b(this.i, j2);
        f();
    }

    @Override // bhm.c
    public final int b(int i) {
        this.f236173j = true;
        return 2;
    }

    public final boolean c(boolean z, boolean z3, dom.a aVar) {
        if (this.f) {
            this.f236169b.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th10 = this.f236172h;
        if (th10 != null) {
            this.f236169b.clear();
            aVar.onError(th10);
            return true;
        }
        if (!z3) {
            return false;
        }
        aVar.onComplete();
        return true;
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.e.cancel();
        if (this.f236173j || getAndIncrement() != 0) {
            return;
        }
        this.f236169b.clear();
    }

    @Override // bhm.g
    public final void clear() {
        this.f236169b.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.e, bVar)) {
            this.e = bVar;
            this.f236168a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            bhm.f fVar = this.f236169b;
            dom.a aVar = this.f236168a;
            int iAddAndGet = 1;
            while (!c(this.f236171g, fVar.isEmpty(), aVar)) {
                long j2 = this.i.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z = this.f236171g;
                    Object objPoll = fVar.poll();
                    boolean z3 = objPoll == null;
                    if (c(z, z3, aVar)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    aVar.onNext(objPoll);
                    j3++;
                }
                if (j3 == j2 && c(this.f236171g, fVar.isEmpty(), aVar)) {
                    return;
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.i.addAndGet(-j3);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f236169b.isEmpty();
    }

    @Override // dom.a
    public final void onComplete() {
        this.f236171g = true;
        if (this.f236173j) {
            this.f236168a.onComplete();
        } else {
            f();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f236172h = th10;
        this.f236171g = true;
        if (this.f236173j) {
            this.f236168a.onError(th10);
        } else {
            f();
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236169b.offer(obj2)) {
            if (this.f236173j) {
                this.f236168a.onNext(null);
                return;
            } else {
                f();
                return;
            }
        }
        this.e.cancel();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
        try {
            this.f236170c.run();
            this.d.accept(obj2);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            missingBackpressureException.initCause(th10);
        }
        onError(missingBackpressureException);
    }

    @Override // bhm.g
    public final Object poll() {
        return this.f236169b.poll();
    }
}
