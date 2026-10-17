package mmm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static final void a(c cVar, f fVar) {
        cVar.getClass();
        if (f.i == null) {
            f.i = new f();
            h8.a aVar = new h8.a("Okio Watchdog");
            aVar.setDaemon(true);
            aVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j2 = fVar.f207311c;
        boolean z = fVar.f207309a;
        if (j2 != 0 && z) {
            fVar.f207262g = Math.min(j2, fVar.c() - jNanoTime) + jNanoTime;
        } else if (j2 != 0) {
            fVar.f207262g = jNanoTime + j2;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            fVar.f207262g = fVar.c();
        }
        f.f207258h.b(fVar);
        if (fVar.f == 1) {
            f.k.signal();
        }
    }

    public static f b() throws InterruptedException {
        a80.e eVar = f.f207258h;
        f fVarE = eVar.e();
        if (fVarE == null) {
            long jNanoTime = System.nanoTime();
            f.k.await(f.f207260l, TimeUnit.MILLISECONDS);
            if (eVar.e() != null || System.nanoTime() - jNanoTime < f.f207261m) {
                return null;
            }
            return f.i;
        }
        long jNanoTime2 = fVarE.f207262g - System.nanoTime();
        if (jNanoTime2 > 0) {
            f.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        eVar.o(fVarE);
        fVarE.e = 2;
        return fVarE;
    }
}
