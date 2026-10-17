package dvk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class n {
    public static TextLocalisedClause a(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        switch (m.f118161a[instrument.f214597c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return new TextLocalisedClause(R$string.wealth_stock_details_stats_subtitle, null, null, 14);
            case 15:
                return new TextLocalisedClause(R$string.trading_bonds_stats_screen_subtitle, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TextLocalisedClause b(String ticker, nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        switch (m.f118161a[instrument.f214597c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return new TextLocalisedClause(R$string.wealth_stock_details_stats_title, u.c(ticker), null, 12);
            case 15:
                return new TextLocalisedClause(R$string.trading_stats_screen_title_plain, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
