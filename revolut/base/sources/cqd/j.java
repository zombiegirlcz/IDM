package cqd;

import aqd.i0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(boolean z, SelectableDelegate.b bVar, String str) {
        RowDelegate.Model model = new RowDelegate.Model("ASK_EACH_TIME_ITEM_INNER_ID", null, new TextLocalisedClause(R$string.analytics_income_sorter_details_how_to_sort_manual_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.analytics_income_sorter_details_how_to_sort_manual_description, null, null, 14), null, null, 0, null, z, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
        vd0 vd0Var = vd0.RADIO;
        return v.k(new SelectableDelegate.Model("ASK_EACH_TIME_ITEM_ID", model, str.equals("ASK_EACH_TIME_ITEM_ID") ? qd0.SELECTED : qd0.UNSELECTED, bVar, vd0Var, false, null, i0.MANUAL, null, false, 32480), new SelectableDelegate.Model("SORT_AUTOMATICALLY_ITEM_ID", new RowDelegate.Model("SORT_AUTOMATICALLY_ITEM_INNER_ID", null, new TextLocalisedClause(R$string.analytics_income_sorter_details_how_to_sort_automatically_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.analytics_income_sorter_details_how_to_sort_automatically_description, null, null, 14), null, null, 0, null, z, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826), str.equals("SORT_AUTOMATICALLY_ITEM_ID") ? qd0.SELECTED : qd0.UNSELECTED, bVar, vd0Var, false, null, i0.AUTOMATICALLY, null, false, 32480));
    }

    public static SelectableDelegate.Model b(boolean z, boolean z3, SelectableDelegate.b bVar, TextLocalisedClause textLocalisedClause) {
        return new SelectableDelegate.Model("ONE_IFF_ITEM_ID", new RowDelegate.Model("ONE_IFF_ITEM_INNER_ID", null, new TextLocalisedClause(R$string.analytics_income_sorter_details_sort_title, null, null, 14), null, 0, textLocalisedClause, null, null, 0, null, z, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826), z3 ? qd0.SELECTED : qd0.UNSELECTED, bVar, vd0.RADIO, false, null, i0.ONE_OFF, null, false, 32480);
    }
}
