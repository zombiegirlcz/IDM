package qfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 extends AtomicLong implements efm.j, dom.b, s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f245527c;
    public final c0.a d;
    public final lfm.b e = new lfm.b(1);
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicLong f245528g = new AtomicLong();

    public r2(dom.a aVar, long j2, TimeUnit timeUnit, c0.a aVar2) {
        this.f245525a = aVar;
        this.f245526b = j2;
        this.f245527c = timeUnit;
        this.d = aVar2;
    }

    @Override // dom.b
    public final void a(long j2) {
        yfm.g.c(this.f, this.f245528g, j2);
    }

    @Override // qfm.s2
    public final void b(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            yfm.g.b(this.f);
            this.f245525a.onError(new TimeoutException(zfm.h.c(this.f245526b, this.f245527c)));
            this.d.dispose();
        }
    }

    @Override // dom.b
    public final void cancel() {
        yfm.g.b(this.f);
        this.d.dispose();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        yfm.g.d(this.f, this.f245528g, bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            lfm.b bVar = this.e;
            bVar.getClass();
            lfm.d.a(bVar);
            this.f245525a.onComplete();
            this.d.dispose();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mo3.a.m(th10);
            return;
        }
        lfm.b bVar = this.e;
        bVar.getClass();
        lfm.d.a(bVar);
        this.f245525a.onError(th10);
        this.d.dispose();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                lfm.b bVar = this.e;
                ((ifm.c) bVar.get()).dispose();
                this.f245525a.onNext(obj2);
                ifm.c cVarB = this.d.b(new t2(j3, this), this.f245526b, this.f245527c);
                bVar.getClass();
                lfm.d.c(bVar, cVarB);
            }
        }
    }
}
