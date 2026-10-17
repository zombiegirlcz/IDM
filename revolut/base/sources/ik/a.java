package ik;

import android.os.SystemClock;
import cpi.g;
import jk.d;
import jk.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f161863a;

    public a(f ntpService, dfm.c fallbackClock) {
        Intrinsics.checkNotNullParameter(ntpService, "ntpService");
        Intrinsics.checkNotNullParameter(fallbackClock, "fallbackClock");
        this.f161863a = ntpService;
    }

    public final long a() {
        hk.b bVar;
        f fVar = this.f161863a;
        fVar.a();
        g gVar = fVar.e;
        c cVar = (c) gVar.f107954b;
        long j2 = cVar.f161864a.getLong("com.lyft.kronos.cached_current_time", 0L);
        long j3 = cVar.f161864a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
        jk.c cVar2 = j3 == 0 ? null : new jk.c(j2, j3, cVar.f161864a.getLong("com.lyft.kronos.cached_offset", 0L), (dfm.c) gVar.f107955c);
        if (((d) fVar.f175024a.get()) == d.IDLE && cVar2 != null && Math.abs((cVar2.f175020a - cVar2.f175021b) - (System.currentTimeMillis() - SystemClock.elapsedRealtime())) >= 1000) {
            g gVar2 = fVar.e;
            synchronized (gVar2) {
                ((c) gVar2.f107954b).f161864a.edit().clear().apply();
                Unit unit = Unit.f186387a;
            }
            cVar2 = null;
        }
        if (cVar2 == null) {
            if (SystemClock.elapsedRealtime() - fVar.f175025b.get() >= fVar.i) {
                fVar.b();
            }
            bVar = null;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - cVar2.f175021b;
            if (jElapsedRealtime >= fVar.f175029j && SystemClock.elapsedRealtime() - fVar.f175025b.get() >= fVar.i) {
                fVar.b();
            }
            bVar = new hk.b(Long.valueOf(jElapsedRealtime), (SystemClock.elapsedRealtime() - cVar2.f175021b) + cVar2.f175020a + cVar2.f175022c);
        }
        if (bVar == null) {
            bVar = new hk.b(null, System.currentTimeMillis());
        }
        return bVar.f152840a;
    }
}
