package m4h;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final TextLocalisedClause a(g3h.a type, n instrument) {
        TimeClause timeClause;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        TextClause textClause = new TextClause(instrument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Long l2 = instrument.u;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            TimeClause.Format.INSTANCE.getClass();
            timeClause = new TimeClause(jLongValue, TimeClause.Format.f57959a, null, null, 12);
        } else {
            timeClause = null;
        }
        switch (a.f202729a[type.ordinal()]) {
            case 1:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_risk_appetite_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_risk_appetite_description_with_date, v.k(textClause, timeClause), null, 12);
            case 2:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_liquidity_constraints_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_liquidity_constraints_description_with_date, v.k(textClause, timeClause), null, 12);
            case 3:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_going_otc_sell_only_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_going_otc_sell_only_description_with_date, v.k(textClause, timeClause), null, 12);
            case 4:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_sanctioned_sell_only_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_sanctioned_sell_only_description_with_date, v.k(textClause, timeClause), null, 12);
            case 5:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_penny_stock_sell_only_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_penny_stock_sell_only_description_with_date, v.k(textClause, timeClause), null, 12);
            case 6:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_mergers_and_acquisitions_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_mergers_and_acquisitions_description_with_date, v.k(textClause, timeClause), null, 12);
            case 7:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_stock_split_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_stock_split_description_with_date, v.k(textClause, timeClause), null, 12);
            case 8:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_going_otc_description, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_going_otc_description_with_date, v.k(textClause, timeClause), null, 12);
            case 9:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_suspended_sanctioned_description, v.k(textClause, textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_suspended_sanctioned_description_with_date, v.k(textClause, timeClause, textClause), null, 12);
            case 10:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_going_private_description_no_date, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_going_private_description_with_date, v.k(textClause, timeClause), null, 12);
            case 11:
                return timeClause == null ? new TextLocalisedClause(R$string.instrument_restricted_delisted_bankruptcy_description_no_date, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.instrument_restricted_delisted_bankruptcy_description_with_date, v.k(textClause, timeClause), null, 12);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final TextLocalisedClause b(g3h.a type, n instrument) {
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        switch (a.f202729a[type.ordinal()]) {
            case 1:
                i = R$string.instrument_restricted_risk_appetite_subtitle;
                break;
            case 2:
                i = R$string.instrument_restricted_liquidity_constraints_subtitle;
                break;
            case 3:
                i = R$string.instrument_restricted_going_otc_sell_only_subtitle;
                break;
            case 4:
                i = R$string.instrument_restricted_sanctioned_sell_only_subtitle;
                break;
            case 5:
                i = R$string.instrument_restricted_penny_stock_subtitle;
                break;
            case 6:
                i = R$string.instrument_restricted_mergers_and_acquisitions_subtitle;
                break;
            case 7:
                i = R$string.instrument_restricted_stock_split_subtitle;
                break;
            case 8:
                i = R$string.instrument_restricted_delisted_otc_subtitle;
                break;
            case 9:
                i = R$string.instrument_restricted_sanctioned_suspended_subtitle;
                break;
            case 10:
                i = R$string.instrument_restricted_private_subtitle;
                break;
            case 11:
                i = R$string.instrument_restricted_delisted_subtitle;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public final TextLocalisedClause c(g3h.a type, n instrument, Integer num) {
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        TextClause textClause = new TextClause(instrument.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        switch (a.f202729a[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i = R$string.instrument_restricted_sell_only_common_title;
                break;
            case 4:
                i = R$string.instrument_restricted_sanctioned_sell_only_title;
                break;
            case 5:
                i = R$string.instrument_restricted_penny_stock_title;
                break;
            case 6:
            case 7:
                i = R$string.instrument_restricted_suspended_title;
                break;
            case 8:
                i = R$string.instrument_restricted_delisted_otc_title;
                break;
            case 9:
                i = R$string.instrument_restricted_sanctioned_suspended_title;
                break;
            case 10:
                i = R$string.instrument_restricted_private_title;
                break;
            case 11:
                i = R$string.instrument_restricted_delisted_title;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, u.c(textClause), num != null ? new Custom(num, false, null, false, null, 254) : null, 8);
    }
}
