package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class o5 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f263051c;
    public final Scheduler d;
    public final bhm.i e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Disposable f263052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f263053h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f263054j;

    public o5(fgm.l lVar, long j2, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        this.f263049a = lVar;
        this.f263050b = j2;
        this.f263051c = timeUnit;
        this.d = scheduler;
        this.e = new bhm.i(i);
        this.f = z;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = this.f263049a;
        bhm.i iVar = this.e;
        boolean z = this.f;
        TimeUnit timeUnit = this.f263051c;
        Scheduler scheduler = this.d;
        long j2 = this.f263050b;
        int iAddAndGet = 1;
        while (!this.f263053h) {
            boolean z3 = this.i;
            Long l2 = (Long) iVar.c();
            boolean z4 = l2 == null;
            scheduler.getClass();
            long jA = Scheduler.a(timeUnit);
            if (!z4 && l2.longValue() > jA - j2) {
                z4 = true;
            }
            if (z3) {
                if (!z) {
                    Throwable th10 = this.f263054j;
                    if (th10 != null) {
                        this.e.clear();
                        lVar.onError(th10);
                        return;
                    } else if (z4) {
                        lVar.onComplete();
                        return;
                    }
                } else if (z4) {
                    Throwable th11 = this.f263054j;
                    if (th11 != null) {
                        lVar.onError(th11);
                        return;
                    } else {
                        lVar.onComplete();
                        return;
                    }
                }
            }
            if (z4) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iVar.poll();
                lVar.onNext(iVar.poll());
            }
        }
        this.e.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263053h) {
            return;
        }
        this.f263053h = true;
        this.f263052g.dispose();
        if (getAndIncrement() == 0) {
            this.e.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263053h;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.i = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263054j = th10;
        this.i = true;
        a();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.d.getClass();
        this.e.a(Long.valueOf(Scheduler.a(this.f263051c)), obj2);
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263052g, disposable)) {
            this.f263052g = disposable;
            this.f263049a.onSubscribe(this);
        }
    }
}
