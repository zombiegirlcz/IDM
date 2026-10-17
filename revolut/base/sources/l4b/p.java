package l4b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xul.l f192085a;

    public p(l4i.a amountConverter, xul.l stockOrderUnifiedInfoGroupMapper) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(stockOrderUnifiedInfoGroupMapper, "stockOrderUnifiedInfoGroupMapper");
        this.f192085a = stockOrderUnifiedInfoGroupMapper;
    }

    public final qv0.i a(MarginQuote marginQuote) {
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        if (marginQuote.f82116l.f82104b.isEmpty()) {
            return ((wul.m) this.f192085a).g();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_cfd_fees, null, null, 14);
        Clause[] elements = {new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new MoneyClause(l4i.a.b(marginQuote.f82116l.f82103a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CellDetailsActionDelegate.Model("CFD_FEE_ID", textLocalisedClause, 0, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), false, true, null, null, 0, 0, 32672);
    }
}
