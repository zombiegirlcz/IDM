package bsd;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static MoneyClause a(dj0.d value) {
        long j2;
        Intrinsics.checkNotNullParameter(value, "value");
        long j3 = value.f115082a;
        long j5 = 10000000;
        if (j3 <= 100000000) {
            if (j3 > 10000000 || j3 > 1000000) {
                j3 = ((long) (j3 / 100000.0f)) * 100000;
            } else if (j3 > 100000) {
                j2 = (long) (j3 / 10000.0f);
                j5 = 10000;
            }
            return new MoneyClause(dj0.d.c(value, j3, null, 2), new MoneyClause.Format.Shorts(true, 37), null, null, 12);
        }
        j2 = (long) (j3 / 1.0E7f);
        j3 = j2 * j5;
        return new MoneyClause(dj0.d.c(value, j3, null, 2), new MoneyClause.Format.Shorts(true, 37), null, null, 12);
    }
}
