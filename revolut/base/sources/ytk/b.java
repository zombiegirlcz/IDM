package ytk;

import aw0.wa;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static NumberClause a(BigDecimal number, Custom custom) {
        Intrinsics.checkNotNullParameter(number, "number");
        return new NumberClause(number, new NumberClause.Format.FixedDigitsAfterDot(2, 8, null, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_UP), custom, null, 8);
    }
}
