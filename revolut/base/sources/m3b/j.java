package m3b;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements i {
    public final List a(BigDecimal leverage) {
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        return u.c(new CellDetailsActionDelegate.Model("ID_LEVERAGE", new TextLocalisedClause(R$string.wealth_invest_cfd_leverage_title, null, null, 14), 0, null, new TextLocalisedClause(R$string.wealth_margin_cfd_leverage_string_value, u.c(new NumberClause(leverage, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, false, null, null, 0, 0, 32736));
    }
}
