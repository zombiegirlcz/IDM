package zdc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.shared.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static CellDetailsDelegate.Model a(dj0.d split, boolean z) {
        Intrinsics.checkNotNullParameter(split, "split");
        int i = R$string.revolut_pay_order_summary_details_amounts_split_payment;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        if (!z) {
            custom = null;
        }
        return new CellDetailsDelegate.Model("ID_SPLIT_PAYMENT_CELL", new TextLocalisedClause(i, null, custom, 10), new MoneyClause(split, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4), null, null, false, 0, null, null, z ? j2.H3 : j2.CAPTION, null, 0, null, false, null, 0, 0, 0, 0, 1047528);
    }
}
