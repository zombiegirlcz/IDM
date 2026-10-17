package vph;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Clause a(zel.f group, Integer num, boolean z) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(group, "group");
        if ((num != null && num.intValue() == -1) || num == null) {
            int i3 = i.f291213a[group.ordinal()];
            if (i3 == 1) {
                i2 = R$string.screener_action_stocks_submit_no_count;
            } else if (i3 == 2) {
                i2 = z ? R$string.screener_action_etp_submit_no_count : R$string.screener_action_etf_submit_no_count;
            } else if (i3 == 3) {
                i2 = R$string.screener_action_bonds_submit_no_count;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.screener_action_cfd_submit_no_count;
            }
            return new TextLocalisedClause(i2, null, null, 14);
        }
        int i5 = i.f291213a[group.ordinal()];
        if (i5 == 1) {
            i = R$plurals.screener_action_stocks_submit_str;
        } else if (i5 == 2) {
            i = z ? R$plurals.trading_etp_filters_view_str : R$plurals.trading_etf_filters_view_str;
        } else if (i5 == 3) {
            i = R$plurals.trading_bonds_filters_view_str;
        } else {
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$plurals.trading_cfd_filters_view_str;
        }
        return new TextLocalisedQuantityClause(i, num, u.c(new NumberClause(num.intValue(), (NumberClause.Format.Compact) null, (Custom) null, 6)), (Style) null, 24);
    }
}
