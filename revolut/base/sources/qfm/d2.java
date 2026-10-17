package qfm;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 extends AtomicReference implements efm.j, dom.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhm.a f245390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f245392c;
    public final efm.c0 d;
    public final AtomicLong e = new AtomicLong();
    public final lfm.b f = new lfm.b(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public dom.b f245393g;

    public d2(jhm.a aVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f245390a = aVar;
        this.f245391b = j2;
        this.f245392c = timeUnit;
        this.d = c0Var;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this.e, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        lfm.d.a(this.f);
        this.f245393g.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245393g, bVar)) {
            this.f245393g = bVar;
            this.f245390a.e(this);
            long j2 = this.f245391b;
            ifm.c cVarE = this.d.e(this, j2, j2, this.f245392c);
            lfm.b bVar2 = this.f;
            bVar2.getClass();
            lfm.d.c(bVar2, cVarE);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        lfm.d.a(this.f);
        this.f245390a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        lfm.d.a(this.f);
        this.f245390a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        lazySet(obj2);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            AtomicLong atomicLong = this.e;
            long j2 = atomicLong.get();
            jhm.a aVar = this.f245390a;
            if (j2 != 0) {
                aVar.onNext(andSet);
                com.bumptech.glide.d.A(atomicLong, 1L);
            } else {
                cancel();
                aVar.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }
    }
}
