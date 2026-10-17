package l5i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;

/* JADX INFO: loaded from: classes10.dex */
public interface h extends d4i.i {
    default Clause a(g gVar) {
        return null;
    }

    TextLocalisedClause n(OrderQuote orderQuote);
}
