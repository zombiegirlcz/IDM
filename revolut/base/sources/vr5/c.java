package vr5;

import aw0.r2;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto_feed.dependencies.R$string;
import tx0.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static HeaderDelegate.Model a(Clause clause) {
        HeaderDelegate.Model model = new HeaderDelegate.Model("STATS_HEADER_ID", null, new r2(clause, null), null, new TextLocalisedClause(R$string.crypto_revx_fiat_pocket_details_stats_value_title, null, null, 14), null, null, null, null, k0.SMALL, HeaderDelegate.Model.b.a.f52415a, 31704);
        int i = R$attr.uikit_dp8;
        model.f52411w = i;
        model.f52412x = i;
        return model;
    }

    public static CellDetailsDelegate.Model b(Clause clause) {
        return new CellDetailsDelegate.Model("PRICE_LIST_ID", new TextLocalisedClause(R$string.crypto_revx_fiat_pocket_details_stats_price_title, null, null, 14), clause, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
