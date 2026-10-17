package ynj;

import aw0.wa;
import com.revolut.core.ui_kit.models.NumberClause;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements gej.a {

    @NotNull
    public static final C1759a Companion = new C1759a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NumberClause.Format.FixedDigitsAfterDot f315478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NumberClause.Format.FixedDigitsAfterDot f315479b;

    /* JADX INFO: renamed from: ynj.a$a, reason: collision with other inner class name */
    public static final class C1759a {
        private C1759a() {
        }
    }

    static {
        NumberClause.Format.FixedDigitsAfterDot fixedDigitsAfterDot = new NumberClause.Format.FixedDigitsAfterDot(2, 8, null, wa.STRIP_ALL_TRAILING_ZEROES, RoundingMode.DOWN);
        f315478a = fixedDigitsAfterDot;
        f315479b = NumberClause.Format.FixedDigitsAfterDot.a(fixedDigitsAfterDot, null, 14);
    }

    public static BigDecimal b(long j2, long j3) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }
}
