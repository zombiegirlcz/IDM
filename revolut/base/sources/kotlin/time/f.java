package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import pkm.j;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements pkm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187928a;

    public static long b(long j2) {
        j.f237218a.getClass();
        long jA = j.a();
        pkm.e unit = pkm.e.NANOSECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? b.p(e.a(j2)) : e.b(jA, j2, unit);
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        return b(this.f187928a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        pkm.c other = (pkm.c) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        long jH7 = h7(other);
        b.INSTANCE.getClass();
        return b.c(jH7, 0L);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return this.f187928a == ((f) obj2).f187928a;
        }
        return false;
    }

    @Override // pkm.c
    public final long h7(pkm.c other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z = other instanceof f;
        long j2 = this.f187928a;
        if (!z) {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j2 + CoreConstants.RIGHT_PARENTHESIS_CHAR)) + " and " + other);
        }
        long j3 = ((f) other).f187928a;
        j.f237218a.getClass();
        pkm.e unit = pkm.e.NANOSECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j3 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j2 - 1)) == Long.MAX_VALUE ? e.a(j2) : e.b(j2, j3, unit);
        }
        if (j2 != j3) {
            return b.p(e.a(j3));
        }
        b.INSTANCE.getClass();
        return 0L;
    }

    public final int hashCode() {
        return Long.hashCode(this.f187928a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f187928a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
