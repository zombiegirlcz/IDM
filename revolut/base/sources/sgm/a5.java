package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class a5 extends c5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f262701h;

    public a5(ahm.c cVar, long j2, TimeUnit timeUnit, Scheduler scheduler, igm.g gVar) {
        super(cVar, j2, timeUnit, scheduler, gVar);
        this.f262701h = new AtomicInteger(1);
    }

    @Override // sgm.c5
    public final void a() {
        Object andSet = getAndSet(null);
        ahm.c cVar = this.f262742a;
        if (andSet != null) {
            cVar.onNext(andSet);
        }
        if (this.f262701h.decrementAndGet() == 0) {
            cVar.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f262701h;
        if (atomicInteger.incrementAndGet() == 2) {
            Object andSet = getAndSet(null);
            ahm.c cVar = this.f262742a;
            if (andSet != null) {
                cVar.onNext(andSet);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                cVar.onComplete();
            }
        }
    }
}
