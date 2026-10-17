package t4e;

import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.structured_note.details.impl.R$string;
import d9.e1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import jel.e2;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static final PercentageClause a(a aVar, BigDecimal bigDecimal) {
            aVar.getClass();
            return new PercentageClause(e1.Z(bigDecimal), (PercentageClause.Format) null, (Style) null, 6);
        }

        public static final TextLocalisedClause b(a aVar, BigDecimal bigDecimal) {
            aVar.getClass();
            return new TextLocalisedClause(R$string.trading_structured_notes_attributes_dictionary_final_payout_multiplier_value_template, u.c(new NumberClause(bigDecimal, new NumberClause.Format.FixedDigitsAfterDot(2, 12, null, null, RoundingMode.HALF_DOWN), null, null, 12)), null, 12);
        }

        public static final TextLocalisedClause c(a aVar, e2 e2Var) {
            int i;
            aVar.getClass();
            int i2 = k.f267985a[e2Var.ordinal()];
            if (i2 == 1) {
                i = R$string.trading_structured_notes_performance_basis_average;
            } else if (i2 == 2) {
                i = R$string.trading_structured_notes_performance_basis_worst_performing;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_structured_notes_performance_basis_single_asset;
            }
            return new TextLocalisedClause(i, null, null, 14);
        }
    }
}
