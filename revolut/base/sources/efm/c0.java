package efm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f125383a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f125384b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static abstract class a implements ifm.c {
        public ifm.c a(Runnable runnable) {
            return b(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit);

        public final ifm.c c(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            lfm.b bVar = new lfm.b(1);
            lfm.b bVar2 = new lfm.b(bVar);
            long nanos = timeUnit.toNanos(j3);
            long jA = c0.a(TimeUnit.NANOSECONDS);
            ifm.c cVarB = b(new b0(this, timeUnit.toNanos(j2) + jA, runnable, jA, bVar2, nanos), j2, timeUnit);
            if (cVarB == lfm.e.INSTANCE) {
                return cVarB;
            }
            lfm.d.c(bVar, cVarB);
            return bVar2;
        }
    }

    public static long a(TimeUnit timeUnit) {
        return !f125383a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract a b();

    public ifm.c c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public ifm.c d(Runnable runnable, long j2, TimeUnit timeUnit) {
        a aVarB = b();
        mfm.f.b(runnable, "run is null");
        z zVar = new z(runnable, aVarB);
        aVarB.b(zVar, j2, timeUnit);
        return zVar;
    }

    public ifm.c e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        a aVarB = b();
        a0 a0Var = new a0(runnable, aVarB);
        ifm.c cVarC = aVarB.c(a0Var, j2, j3, timeUnit);
        return cVarC == lfm.e.INSTANCE ? cVarC : a0Var;
    }
}
