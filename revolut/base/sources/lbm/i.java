package lbm;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import java.io.Serializable;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193721a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f193722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f193723c;
    public final AtomicBoolean d;
    public final ScheduledFuture e;
    public final /* synthetic */ j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Serializable f193724g;

    public i(j jVar, int i, b bVar) {
        this.f = jVar;
        this.f193722b = i;
        this.f193724g = jVar.f.instant().plus(((Long) jVar.f193727c.f172679l.apply(Integer.valueOf(i))).longValue(), (TemporalUnit) ChronoUnit.MILLIS);
        this.f193723c = bVar;
        jVar.f193727c.getClass();
        this.e = null;
        this.d = new AtomicBoolean(true);
    }

    private final void j() {
    }

    @Override // lbm.f
    public final int a() {
        switch (this.f193721a) {
        }
        return this.f193722b;
    }

    @Override // lbm.f
    public final void b() {
        switch (this.f193721a) {
            case 0:
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(true);
                    break;
                }
                break;
            default:
                ScheduledFuture scheduledFuture2 = this.e;
                if (scheduledFuture2 != null && !scheduledFuture2.isDone()) {
                    scheduledFuture2.cancel(true);
                    break;
                }
                break;
        }
    }

    @Override // lbm.f
    public final void c(long j2) {
        switch (this.f193721a) {
            case 0:
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                i(this.f193723c.b(j2));
                break;
            default:
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                this.f193723c.b(j2);
                break;
        }
    }

    @Override // lbm.f
    public final b d() {
        switch (this.f193721a) {
        }
        return this.f193723c;
    }

    @Override // lbm.f
    public final void e() {
        switch (this.f193721a) {
            case 0:
                if (!f()) {
                    throw CallNotPermittedException.a(this.f);
                }
                return;
            default:
                if (!f()) {
                    throw CallNotPermittedException.a(this.f);
                }
                return;
        }
    }

    @Override // lbm.f
    public final boolean f() {
        switch (this.f193721a) {
            case 0:
                if (((AtomicInteger) this.f193724g).getAndUpdate(new h()) > 0) {
                    return true;
                }
                this.f193723c.e.incrementAndGet();
                return false;
            default:
                b bVar = this.f193723c;
                j jVar = this.f;
                if (!jVar.f.instant().isAfter((Instant) this.f193724g)) {
                    bVar.e.incrementAndGet();
                    return false;
                }
                synchronized (this) {
                    if (this.d.compareAndSet(true, false)) {
                        j jVar2 = this.f;
                        jVar2.getClass();
                        jVar2.f(jbm.a.HALF_OPEN, new c(jVar2, 1));
                    }
                    break;
                }
                boolean zF = ((f) jVar.f193726b.get()).f();
                if (zF) {
                    return zF;
                }
                jVar.e(new kbm.d(jVar.f193725a));
                bVar.e.incrementAndGet();
                return zF;
        }
    }

    @Override // lbm.f
    public final void g() {
        switch (this.f193721a) {
            case 0:
                ((AtomicInteger) this.f193724g).incrementAndGet();
                break;
        }
    }

    @Override // lbm.f
    public final jbm.a getState() {
        switch (this.f193721a) {
            case 0:
                return jbm.a.HALF_OPEN;
            default:
                return jbm.a.OPEN;
        }
    }

    @Override // lbm.f
    public final void h(long j2) {
        switch (this.f193721a) {
            case 0:
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                i(this.f193723c.c(j2));
                break;
            default:
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                this.f193723c.c(j2);
                break;
        }
    }

    public void i(a aVar) {
        a aVar2 = a.ABOVE_THRESHOLDS;
        j jVar = this.f;
        AtomicBoolean atomicBoolean = this.d;
        if ((aVar == aVar2 || aVar == a.FAILURE_RATE_ABOVE_THRESHOLDS || aVar == aVar2 || aVar == a.SLOW_CALL_RATE_ABOVE_THRESHOLDS) && atomicBoolean.compareAndSet(true, false)) {
            jVar.getClass();
            jVar.f(jbm.a.OPEN, new c(jVar, 0));
        }
        if (aVar == a.BELOW_THRESHOLDS && atomicBoolean.compareAndSet(true, false)) {
            jVar.getClass();
            jVar.f(jbm.a.CLOSED, new c(jVar, 2));
        }
    }

    public i(j jVar, int i) {
        this.f = jVar;
        jbm.h hVar = jVar.f193727c;
        int i2 = hVar.f172676g;
        this.f193723c = new b(i2, jbm.g.COUNT_BASED, hVar, jVar.f);
        this.f193724g = new AtomicInteger(i2);
        this.d = new AtomicBoolean(true);
        this.f193722b = i;
        long millis = jVar.f193727c.o.toMillis();
        if (millis >= 1) {
            this.e = ((ScheduledExecutorService) jVar.f193728g.f193736a.get()).schedule(new kt0.d(this, 4), millis, TimeUnit.MILLISECONDS);
        } else {
            this.e = null;
        }
    }
}
