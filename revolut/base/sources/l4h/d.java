package l4h;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final TextLocalisedClause a(eel.c cVar) {
        int i;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (c.f192128a[cVar.ordinal()]) {
            case 1:
                i = R$string.wealth_history_range_1d;
                break;
            case 2:
                i = R$string.wealth_history_range_1w;
                break;
            case 3:
                i = R$string.wealth_history_range_1m;
                break;
            case 4:
                i = R$string.wealth_history_range_6m;
                break;
            case 5:
                i = R$string.wealth_history_range_1y;
                break;
            case 6:
                i = R$string.wealth_history_range_5y;
                break;
            case 7:
                i = R$string.wealth_history_range_all;
                break;
            default:
                throw new IllegalStateException("Can't convert " + cVar + " to historical chart period long name");
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final TextLocalisedClause b(eel.c cVar) {
        int i;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (c.f192128a[cVar.ordinal()]) {
            case 1:
                i = R$string.wealth_trading_instrument_details_history_range_short_one_day;
                break;
            case 2:
                i = R$string.wealth_trading_instrument_details_history_range_short_one_week;
                break;
            case 3:
                i = R$string.wealth_trading_instrument_details_history_range_short_one_month;
                break;
            case 4:
                i = R$string.wealth_trading_instrument_details_history_range_short_half_year;
                break;
            case 5:
                i = R$string.wealth_trading_instrument_details_history_range_short_one_year;
                break;
            case 6:
                i = R$string.wealth_trading_instrument_details_history_range_short_five_years;
                break;
            case 7:
                i = R$string.wealth_trading_instrument_details_history_range_short_all;
                break;
            default:
                throw new IllegalStateException("Can't convert " + cVar + " to historical chart period short name");
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static final ArrayList c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<eel.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (eel.c cVar : list2) {
            arrayList.add(new FixedTabs.Item(cVar.getId(), b(cVar), (AnalyticsContext) null, 12));
        }
        return arrayList;
    }
}
