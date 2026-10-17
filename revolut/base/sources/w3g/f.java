package w3g;

import aw0.wa;
import com.revolut.core.ui_kit.models.NumberClause;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public static final NumberClause a(double d) {
        return new NumberClause(new BigDecimal(String.valueOf(d)), new NumberClause.Format.FixedDigitsAfterDot(1, 8, null, wa.SHOW_ALL_ZEROES, RoundingMode.DOWN), null, null, 12);
    }
}
