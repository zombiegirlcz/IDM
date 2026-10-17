package tfm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class j5 extends l5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f270568g;

    public j5(bgm.d dVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        super(dVar, j2, timeUnit, c0Var);
        this.f270568g = new AtomicInteger(1);
    }

    @Override // tfm.l5
    public final void a() {
        Object andSet = getAndSet(null);
        bgm.d dVar = this.f270615a;
        if (andSet != null) {
            dVar.onNext(andSet);
        }
        if (this.f270568g.decrementAndGet() == 0) {
            dVar.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f270568g;
        if (atomicInteger.incrementAndGet() == 2) {
            Object andSet = getAndSet(null);
            bgm.d dVar = this.f270615a;
            if (andSet != null) {
                dVar.onNext(andSet);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                dVar.onComplete();
            }
        }
    }
}
