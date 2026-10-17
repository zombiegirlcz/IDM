package k6f;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m6f.p;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final int a(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof m6f.o) {
            return R$attr.uikit_colorTeal;
        }
        if (pVar instanceof m6f.k) {
            return R$attr.uikit_colorLightBlue;
        }
        if (pVar instanceof m6f.m) {
            return R$attr.uikit_colorIndigo;
        }
        if (pVar instanceof m6f.l) {
            return R$attr.uikit_colorPurple;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof m6f.o) {
            return R$drawable.uikit_icn_24_wealth;
        }
        if (pVar instanceof m6f.k) {
            return R$drawable.uikit_icn_24_bank;
        }
        if (pVar instanceof m6f.m) {
            return R$drawable.uikit_icn_24_commodities;
        }
        if (pVar instanceof m6f.l) {
            return R$drawable.uikit_icn_24_cash;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String c(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof m6f.o) {
            return "STOCKS";
        }
        if (pVar instanceof m6f.k) {
            return "BONDS";
        }
        if (pVar instanceof m6f.m) {
            return "COMMODITIES";
        }
        if (pVar instanceof m6f.l) {
            return "CASH";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int d(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (pVar instanceof m6f.o) {
            return R$string.managed_portfolios_details_allocation_assets_stocks;
        }
        if (pVar instanceof m6f.k) {
            return R$string.managed_portfolios_details_allocation_assets_bonds;
        }
        if (pVar instanceof m6f.m) {
            return R$string.managed_portfolios_details_allocation_assets_commodities;
        }
        if (pVar instanceof m6f.l) {
            return R$string.managed_portfolios_details_allocation_assets_cash;
        }
        throw new NoWhenBranchMatchedException();
    }
}
