package pgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class k1 extends AtomicReference implements fgm.d, dom.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghm.a f236093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f236094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f236095c;
    public final Scheduler d;
    public final AtomicLong e = new AtomicLong();
    public final ggm.b f = new ggm.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dom.b f236096g;

    public k1(ghm.a aVar, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f236093a = aVar;
        this.f236094b = j2;
        this.f236095c = timeUnit;
        this.d = scheduler;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this.e, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        jgm.b.a(this.f);
        this.f236096g.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f236096g, bVar)) {
            this.f236096g = bVar;
            this.f236093a.e(this);
            long j2 = this.f236094b;
            Disposable disposableE = this.d.e(this, j2, j2, this.f236095c);
            ggm.b bVar2 = this.f;
            bVar2.getClass();
            jgm.b.c(bVar2, disposableE);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        jgm.b.a(this.f);
        this.f236093a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        jgm.b.a(this.f);
        this.f236093a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        getAndSet(obj2);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            AtomicLong atomicLong = this.e;
            long j2 = atomicLong.get();
            ghm.a aVar = this.f236093a;
            if (j2 != 0) {
                aVar.onNext(andSet);
                xam.a.m(atomicLong, 1L);
            } else {
                cancel();
                aVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }
    }
}
