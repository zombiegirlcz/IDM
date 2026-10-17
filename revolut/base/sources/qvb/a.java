package qvb;

import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final RevPoints a(double d) {
        return e(new BigDecimal(String.valueOf(d)));
    }

    public static final RevPoints b(long j2) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return e(bigDecimalValueOf);
    }

    public static final RevPoints c(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (Intrinsics.f(dVar.f115083b.f306286a, "PTS")) {
            return new RevPoints(dVar);
        }
        throw new IllegalArgumentException(j6.a.q("RevPoints must wrap PTS currency, got: ", dVar.f115083b.f306286a).toString());
    }

    public static final RevPoints d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return e(new BigDecimal(str));
    }

    public static final RevPoints e(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal scale = bigDecimal.movePointRight(6).setScale(0, RoundingMode.HALF_EVEN);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(Long.MIN_VALUE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        if (scale.compareTo(bigDecimalValueOf) >= 0) {
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(Long.MAX_VALUE);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            if (scale.compareTo(bigDecimalValueOf2) <= 0) {
                RevPoints.Companion companion = RevPoints.INSTANCE;
                long jLongValue = scale.longValue();
                companion.getClass();
                return RevPoints.Companion.a(jLongValue);
            }
        }
        throw new IllegalArgumentException(("RevPoints value out of Long range: " + bigDecimal).toString());
    }
}
