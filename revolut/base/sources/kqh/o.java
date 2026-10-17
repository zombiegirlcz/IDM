package kqh;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static int a(zel.f group) {
        Intrinsics.checkNotNullParameter(group, "group");
        int i = n.f188418a[group.ordinal()];
        if (i == 1) {
            return R$drawable.uikit_icn_24_arrow_rates;
        }
        if (i == 2) {
            return R$drawable.uikit_icn_24_pie_chart;
        }
        if (i == 3) {
            return R$drawable.uikit_icn_24_bank;
        }
        if (i == 4) {
            return R$drawable.uikit_icn_24_cfd;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int b(zel.f group, boolean z) {
        Intrinsics.checkNotNullParameter(group, "group");
        int i = n.f188418a[group.ordinal()];
        if (i == 1) {
            return R$string.screener_picker_product_stocks_title;
        }
        if (i == 2) {
            return z ? R$string.screener_picker_product_etps_title : R$string.screener_picker_product_etfs_title;
        }
        if (i == 3) {
            return R$string.screener_picker_product_bonds_title;
        }
        if (i == 4) {
            return R$string.screener_picker_product_cfds_title;
        }
        throw new NoWhenBranchMatchedException();
    }
}
