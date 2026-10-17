package woc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RoundingMode f298918a = RoundingMode.DOWN;

    public static final class a {
        private a() {
        }
    }

    public static BigDecimal a(BigDecimal bigDecimal) {
        BigDecimal scale = bigDecimal.setScale(8, f298918a);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        BigDecimal bigDecimalDivide = scale.divide(new BigDecimal(12), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }
}
