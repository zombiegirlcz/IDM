package qfm;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends yfm.a implements efm.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfm.i f245493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.a f245494c;
    public dom.b d;
    public volatile boolean e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f245495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f245496h = new AtomicLong();
    public boolean i;

    public o1(dom.a aVar, int i, boolean z, en.a aVar2) {
        this.f245492a = aVar;
        this.f245494c = aVar2;
        this.f245493b = z ? new vfm.c(i) : new vfm.b(i);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (this.i || !yfm.g.f(j2)) {
            return;
        }
        com.bumptech.glide.d.a(this.f245496h, j2);
        f();
    }

    @Override // nfm.f
    public final int b(int i) {
        this.i = true;
        return 2;
    }

    public final boolean c(boolean z, boolean z3, dom.a aVar) {
        if (this.e) {
            this.f245493b.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th10 = this.f245495g;
        if (th10 != null) {
            this.f245493b.clear();
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
        if (this.e) {
            return;
        }
        this.e = true;
        this.d.cancel();
        if (this.i || getAndIncrement() != 0) {
            return;
        }
        this.f245493b.clear();
    }

    @Override // nfm.j
    public final void clear() {
        this.f245493b.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.d, bVar)) {
            this.d = bVar;
            this.f245492a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            nfm.i iVar = this.f245493b;
            dom.a aVar = this.f245492a;
            int iAddAndGet = 1;
            while (!c(this.f, iVar.isEmpty(), aVar)) {
                long j2 = this.f245496h.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z = this.f;
                    Object objPoll = iVar.poll();
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
                if (j3 == j2 && c(this.f, iVar.isEmpty(), aVar)) {
                    return;
                }
                if (j3 != 0 && j2 != Long.MAX_VALUE) {
                    this.f245496h.addAndGet(-j3);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f245493b.isEmpty();
    }

    @Override // dom.a
    public final void onComplete() {
        this.f = true;
        if (this.i) {
            this.f245492a.onComplete();
        } else {
            f();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f245495g = th10;
        this.f = true;
        if (this.i) {
            this.f245492a.onError(th10);
        } else {
            f();
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245493b.offer(obj2)) {
            if (this.i) {
                this.f245492a.onNext(null);
                return;
            } else {
                f();
                return;
            }
        }
        this.d.cancel();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
        try {
            this.f245494c.run();
        } catch (Throwable th10) {
            m70.a.u(th10);
            missingBackpressureException.initCause(th10);
        }
        onError(missingBackpressureException);
    }

    @Override // nfm.j
    public final Object poll() {
        return this.f245493b.poll();
    }
}
