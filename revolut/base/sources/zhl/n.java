package zhl;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(long j2, boolean z, long j3, long j5, long j16, Function3 function3) {
        aim.e eVarB = u.b();
        for (long j22 = 0; j22 < j2; j22++) {
            eVarB.add(function3.invoke(Long.valueOf((j22 * j5) + j3), Boolean.FALSE, Long.valueOf(j16)));
        }
        if (z) {
            eVarB.add(function3.invoke(Long.valueOf((j2 * j5) + j3), Boolean.TRUE, Long.valueOf(j16)));
        }
        return u.a(eVarB);
    }

    public static Pair b(long j2, long j3) {
        long j5 = j2 / j3;
        if (j5 > 10000) {
            return null;
        }
        return new Pair(Long.valueOf(j5), Boolean.valueOf(j2 % j3 != 0));
    }

    public static Long c(eel.c cVar, long j2) {
        Instant instantMinus;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        switch (o.f322460a[cVar.ordinal()]) {
            case 1:
            case 2:
                instantMinus = null;
                break;
            case 3:
                instantMinus = instantOfEpochMilli.minus(7L, (TemporalUnit) ChronoUnit.DAYS);
                break;
            case 4:
                instantMinus = instantOfEpochMilli.minus(30L, (TemporalUnit) ChronoUnit.DAYS);
                break;
            case 5:
                instantMinus = instantOfEpochMilli.minus(180L, (TemporalUnit) ChronoUnit.DAYS);
                break;
            case 6:
                instantMinus = instantOfEpochMilli.minus(360L, (TemporalUnit) ChronoUnit.DAYS);
                break;
            case 7:
                instantMinus = instantOfEpochMilli.minus(1800L, (TemporalUnit) ChronoUnit.DAYS);
                break;
            case 8:
                instantMinus = instantOfEpochMilli.minus(3600L, (TemporalUnit) ChronoUnit.DAYS);
                break;
            case 9:
                instantMinus = instantOfEpochMilli.minus(3600L, (TemporalUnit) ChronoUnit.DAYS);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (instantMinus != null) {
            return Long.valueOf(instantMinus.toEpochMilli());
        }
        return null;
    }
}
