package tfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class y6 extends AtomicLong implements efm.y, ifm.c, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270975c;
    public final c0.a d;
    public final lfm.b e = new lfm.b(1);
    public final AtomicReference f = new AtomicReference();

    public y6(efm.y yVar, long j2, TimeUnit timeUnit, c0.a aVar) {
        this.f270973a = yVar;
        this.f270974b = j2;
        this.f270975c = timeUnit;
        this.d = aVar;
    }

    @Override // tfm.z6
    public final void b(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            lfm.d.a(this.f);
            this.f270973a.onError(new TimeoutException(zfm.h.c(this.f270974b, this.f270975c)));
            this.d.dispose();
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f);
        this.d.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.f.get());
    }

    @Override // efm.y
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            lfm.b bVar = this.e;
            bVar.getClass();
            lfm.d.a(bVar);
            this.f270973a.onComplete();
            this.d.dispose();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mo3.a.m(th10);
            return;
        }
        lfm.b bVar = this.e;
        bVar.getClass();
        lfm.d.a(bVar);
        this.f270973a.onError(th10);
        this.d.dispose();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                lfm.b bVar = this.e;
                ((ifm.c) bVar.get()).dispose();
                this.f270973a.onNext(obj2);
                ifm.c cVarB = this.d.b(new a7(j3, this), this.f270974b, this.f270975c);
                bVar.getClass();
                lfm.d.c(bVar, cVarB);
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f, cVar);
    }
}
