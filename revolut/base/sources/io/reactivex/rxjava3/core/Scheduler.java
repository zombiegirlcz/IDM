package io.reactivex.rxjava3.core;

import egm.d;
import fgm.m;
import fgm.o;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import jgm.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Scheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f163114a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f163115b;

    static {
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        f163115b = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(jLongValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
    }

    public static long a(TimeUnit timeUnit) {
        return !f163114a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract o b();

    public Disposable c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public Disposable d(Runnable runnable, long j2, TimeUnit timeUnit) {
        o oVarB = b();
        Objects.requireNonNull(runnable, "run is null");
        m mVar = new m(runnable, oVarB);
        oVarB.a(mVar, j2, timeUnit);
        return mVar;
    }

    public Disposable e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        o oVarB = b();
        d dVar = new d(runnable, oVarB);
        Disposable disposableC = oVarB.c(dVar, j2, j3, timeUnit);
        return disposableC == c.INSTANCE ? disposableC : dVar;
    }
}
