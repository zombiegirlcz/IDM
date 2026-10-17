package wul;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ak0;
import ip0.ck0;
import ip0.yj0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class q {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final TextDelegate.Model a(hel.b bVar, r0 orderType, bfl.g tradeSide) {
        int i;
        Integer numValueOf;
        Integer numValueOf2;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        switch (bVar == null ? -1 : p.f300250a[bVar.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int i2 = p.f300252c[orderType.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    int i3 = p.f300251b[tradeSide.ordinal()];
                    if (i3 == 1) {
                        i = R$string.wealth_trade_us_footer_buy;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.wealth_trade_us_footer_sell;
                    }
                    numValueOf = Integer.valueOf(i);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return new TextDelegate.Model("US_DISCLAIMER_LIST_ID", new HtmlLocalisedClause(numValueOf.intValue(), u.c(""), (Integer) null, "US_DISCLOSURES_PARCEL", 12), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
                }
                return null;
            case 2:
                int i5 = p.f300252c[orderType.ordinal()];
                if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = p.f300251b[tradeSide.ordinal()];
                if (i6 == 1) {
                    numValueOf2 = Integer.valueOf(com.revolut.trading.orders.R$string.wealth_trade_disclaimer_br_risk_disclosure);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    return new TextDelegate.Model("BR_DISCLAIMER_LIST_ID", new TextLocalisedClause(numValueOf2.intValue(), null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                }
                return null;
        }
    }
}
