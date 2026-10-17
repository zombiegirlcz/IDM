package l4b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.R$string;
import d9.t0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements b0 {
    public final CellDetailsActionDelegate.Model a(MarginQuote marginQuote, nel.n instrument, boolean z) {
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(z ? R$string.wealth_cfd_order_confirmation_opening_spread_title : R$string.wealth_cfd_order_confirmation_closing_spread_title, null, null, 14);
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28);
        ej0.b bVar = marginQuote.k;
        BigDecimal bigDecimalDivide = bVar.f126703a.divide(new BigDecimal(2));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return new CellDetailsActionDelegate.Model("CFD_SPREAD_ID", textLocalisedClause, 0, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(imageClause, new MoneyClause(t0.D(ej0.b.b(bVar, bigDecimalDivide, null, 2), instrument), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12))), false, false, null, null, 0, 0, 32736);
    }
}
