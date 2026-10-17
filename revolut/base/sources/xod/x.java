package xod;

import aw0.l2;
import com.revolut.core.ui_kit.delegates.widgets.j0;
import com.revolut.core.ui_kit.delegates.widgets.k0;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x {
    public static j0 a(MoneyClause text, dj0.d difference, l2 performanceStyle, v iconStyle) {
        k0 k0Var;
        int i;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(difference, "difference");
        Intrinsics.checkNotNullParameter(performanceStyle, "performanceStyle");
        Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
        if (difference.k()) {
            return null;
        }
        boolean zF = difference.f(dj0.d.e);
        int i2 = w.f307827a[performanceStyle.ordinal()];
        if (i2 == 1) {
            k0Var = zF ? k0.POSITIVE : k0.NEGATIVE;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            k0Var = zF ? k0.NEGATIVE : k0.POSITIVE;
        }
        int i3 = w.f307828b[iconStyle.ordinal()];
        if (i3 == 1) {
            i = zF ? R$drawable.uikit_icn_10_stocks_arrow_up : R$drawable.uikit_icn_10_stocks_arrow_down;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = zF ? R$drawable.uikit_icn_10_stocks_arrow_down : R$drawable.uikit_icn_10_stocks_arrow_up;
        }
        return new j0(text, k0Var, Integer.valueOf(i));
    }
}
