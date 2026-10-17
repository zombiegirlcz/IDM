package tfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class x6 extends AtomicReference implements efm.y, ifm.c, z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270941c;
    public final c0.a d;
    public final lfm.b e = new lfm.b(1);
    public final AtomicLong f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f270942g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public efm.w f270943h;

    public x6(efm.y yVar, long j2, TimeUnit timeUnit, c0.a aVar, efm.w wVar) {
        this.f270939a = yVar;
        this.f270940b = j2;
        this.f270941c = timeUnit;
        this.d = aVar;
        this.f270943h = wVar;
    }

    @Override // tfm.z6
    public final void b(long j2) {
        if (this.f.compareAndSet(j2, Long.MAX_VALUE)) {
            lfm.d.a(this.f270942g);
            efm.w wVar = this.f270943h;
            this.f270943h = null;
            wVar.subscribe(new g4(this.f270939a, this, 1));
            this.d.dispose();
        }
    }

    public final void c(long j2) {
        ifm.c cVarB = this.d.b(new a7(j2, this), this.f270940b, this.f270941c);
        lfm.b bVar = this.e;
        bVar.getClass();
        lfm.d.c(bVar, cVarB);
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f270942g);
        lfm.d.a(this);
        this.d.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            lfm.b bVar = this.e;
            bVar.getClass();
            lfm.d.a(bVar);
            this.f270939a.onComplete();
            this.d.dispose();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mo3.a.m(th10);
            return;
        }
        lfm.b bVar = this.e;
        bVar.getClass();
        lfm.d.a(bVar);
        this.f270939a.onError(th10);
        this.d.dispose();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        AtomicLong atomicLong = this.f;
        long j2 = atomicLong.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (atomicLong.compareAndSet(j2, j3)) {
                ((ifm.c) this.e.get()).dispose();
                this.f270939a.onNext(obj2);
                c(j3);
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f270942g, cVar);
    }
}
