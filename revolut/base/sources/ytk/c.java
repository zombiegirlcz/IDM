package ytk;

import aw0.wa;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PercentageClause.Format.Custom f316835a;

    public static final class a {
        private a() {
        }
    }

    static {
        int i = 3;
        f316835a = new PercentageClause.Format.Custom(i, 4, null, wa.STRIP_ONE_TRAILING_ZERO, RoundingMode.HALF_UP);
    }

    public static PercentageClause a(BigDecimal ratioValue, Style style, d decimalPlaces) {
        Intrinsics.checkNotNullParameter(ratioValue, "ratioValue");
        Intrinsics.checkNotNullParameter(decimalPlaces, "decimalPlaces");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = ratioValue.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        int i = e.f316836a[decimalPlaces.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(i2, 12, null, null, RoundingMode.HALF_UP), style);
    }

    public static /* synthetic */ PercentageClause b(c cVar, BigDecimal bigDecimal, Custom custom, d dVar, int i) {
        if ((i & 2) != 0) {
            custom = null;
        }
        if ((i & 4) != 0) {
            dVar = d.TWO;
        }
        cVar.getClass();
        return a(bigDecimal, custom, dVar);
    }
}
