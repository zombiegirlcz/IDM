package c8b;

import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.models.NumberClause;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final NumberClause a(int i) {
        BigDecimal bigDecimalMovePointLeft = new BigDecimal(i).movePointLeft(2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMovePointLeft, "movePointLeft(...)");
        return new NumberClause(bigDecimalMovePointLeft, new NumberClause.Format.FixedDigitsAfterDot(2, 2, p9.ALWAYS, wa.STRIP_ALL_TRAILING_ZEROES, null), null, null, 12);
    }
}
