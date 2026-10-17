package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class z5 extends AtomicBoolean implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f263328c;
    public final TimeUnit d;
    public final Scheduler e;
    public final bhm.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f263329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Disposable f263330h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f263331j;

    public z5(int i, long j2, long j3, fgm.l lVar, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
        this.f263326a = lVar;
        this.f263327b = j2;
        this.f263328c = j3;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = new bhm.i(i);
        this.f263329g = z;
    }

    public final void a() {
        Throwable th10;
        if (compareAndSet(false, true)) {
            fgm.l lVar = this.f263326a;
            bhm.i iVar = this.f;
            boolean z = this.f263329g;
            Scheduler scheduler = this.e;
            TimeUnit timeUnit = this.d;
            scheduler.getClass();
            long jA = Scheduler.a(timeUnit) - this.f263328c;
            while (!this.i) {
                if (!z && (th10 = this.f263331j) != null) {
                    iVar.clear();
                    lVar.onError(th10);
                    return;
                }
                Object objPoll = iVar.poll();
                if (objPoll == null) {
                    Throwable th11 = this.f263331j;
                    if (th11 != null) {
                        lVar.onError(th11);
                        return;
                    } else {
                        lVar.onComplete();
                        return;
                    }
                }
                Object objPoll2 = iVar.poll();
                if (((Long) objPoll).longValue() >= jA) {
                    lVar.onNext(objPoll2);
                }
            }
            iVar.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f263330h.dispose();
        if (compareAndSet(false, true)) {
            this.f.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // fgm.l
    public final void onComplete() {
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263331j = th10;
        a();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        long j2;
        long j3;
        this.e.getClass();
        long jA = Scheduler.a(this.d);
        long j5 = this.f263327b;
        boolean z = j5 == Long.MAX_VALUE;
        Long lValueOf = Long.valueOf(jA);
        bhm.i iVar = this.f;
        iVar.a(lValueOf, obj2);
        while (!iVar.isEmpty()) {
            if (((Long) iVar.c()).longValue() > jA - this.f263328c) {
                if (z) {
                    return;
                }
                AtomicLong atomicLong = iVar.f15339h;
                long j16 = atomicLong.get();
                while (true) {
                    j2 = iVar.f15335a.get();
                    j3 = atomicLong.get();
                    if (j16 == j3) {
                        break;
                    } else {
                        j16 = j3;
                    }
                }
                if ((((int) (j2 - j3)) >> 1) <= j5) {
                    return;
                }
            }
            iVar.poll();
            iVar.poll();
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263330h, disposable)) {
            this.f263330h = disposable;
            this.f263326a.onSubscribe(this);
        }
    }
}
