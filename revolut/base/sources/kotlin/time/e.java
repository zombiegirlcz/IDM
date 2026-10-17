package kotlin.time;

import kotlin.time.b;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {
    public static final long a(long j2) {
        if (j2 < 0) {
            b.INSTANCE.getClass();
            return b.f187923c;
        }
        b.INSTANCE.getClass();
        return b.f187922b;
    }

    public static final long b(long j2, long j3, pkm.e eVar) {
        long j5 = j2 - j3;
        if (((j5 ^ j2) & (~(j5 ^ j3))) >= 0) {
            return c.h(j5, eVar);
        }
        pkm.e eVar2 = pkm.e.MILLISECONDS;
        if (eVar.compareTo(eVar2) >= 0) {
            return b.p(a(j5));
        }
        long jB = pkm.f.b(1L, eVar2, eVar);
        long j16 = (j2 / jB) - (j3 / jB);
        long j22 = (j2 % jB) - (j3 % jB);
        b.Companion companion = b.INSTANCE;
        return b.l(c.h(j16, eVar2), c.h(j22, eVar));
    }
}
