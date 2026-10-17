package m4h;

import jel.c3;
import kotlin.jvm.internal.Intrinsics;
import nel.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static g3h.a a(v stateDetails, c3 c3Var) {
        int i;
        Intrinsics.checkNotNullParameter(stateDetails, "stateDetails");
        String str = stateDetails.f214629a;
        if (Intrinsics.f(str, "SELL_ONLY")) {
            i = c3Var != null ? c.f202730a[c3Var.ordinal()] : -1;
            if (i == 1) {
                return g3h.a.SELL_ONLY_RISK_APPETITE;
            }
            if (i == 2) {
                return g3h.a.SELL_ONLY_LIQUIDITY_CONSTRAINTS;
            }
            if (i == 3) {
                return g3h.a.SELL_ONLY_GOING_OTC;
            }
            if (i == 4) {
                return g3h.a.SELL_ONLY_SANCTIONS_ON_BUY;
            }
            if (i != 5) {
                return null;
            }
            return g3h.a.SELL_ONLY_PENNY_STOCK;
        }
        if (!Intrinsics.f(str, "SUSPENDED")) {
            return null;
        }
        i = c3Var != null ? c.f202730a[c3Var.ordinal()] : -1;
        if (i == 3) {
            return g3h.a.SUSPENDED_GOING_OTC;
        }
        switch (i) {
            case 6:
                return g3h.a.SUSPENDED_MERGERS_AND_ACQUISITIONS;
            case 7:
                return g3h.a.SUSPENDED_STOCK_SPLIT;
            case 8:
                return g3h.a.SUSPENDED_SANCTIONS_SUSPEND;
            case 9:
                return g3h.a.SUSPENDED_BANKRUPTCY;
            case 10:
                return g3h.a.SUSPENDED_GOING_PRIVATE;
            default:
                return null;
        }
    }
}
