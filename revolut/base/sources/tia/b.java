package tia;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import ct6.u;
import jia.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public b(u freelancerEcommerceClauseFactory) {
        Intrinsics.checkNotNullParameter(freelancerEcommerceClauseFactory, "freelancerEcommerceClauseFactory");
    }

    public static int a(c saleType) {
        Intrinsics.checkNotNullParameter(saleType, "saleType");
        switch (a.f271472a[saleType.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_link;
            case 2:
                return R$drawable.uikit_icn_24_qr_code;
            case 3:
                return R$drawable.uikit_icn_24_document;
            case 4:
                return R$drawable.uikit_icn_24_card_reader;
            case 5:
                return R$drawable.uikit_icn_24_card_terminal;
            case 6:
                return R$drawable.uikit_icn_24_logo_apple_tap_to_pay_filled;
            case 7:
                return R$drawable.uikit_icn_24_merchant;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static int b(c saleType) {
        Intrinsics.checkNotNullParameter(saleType, "saleType");
        switch (a.f271472a[saleType.ordinal()]) {
            case 1:
                return R$attr.uikit_colorLime;
            case 2:
                return R$attr.uikit_colorTerracotta;
            case 3:
                return R$attr.uikit_colorCyan;
            case 4:
                return R$attr.uikit_colorLightBlue;
            case 5:
                return R$attr.uikit_colorLightBlue;
            case 6:
                return R$attr.uikit_colorGreen;
            case 7:
                return R$attr.uikit_colorDeepGrey;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final TextLocalisedClause c(c saleType) {
        Intrinsics.checkNotNullParameter(saleType, "saleType");
        switch (a.f271472a[saleType.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.freelancer_analytics_sales_breakdown_payment_links, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.freelancer_analytics_sales_breakdown_qr_code, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.freelancer_analytics_sales_breakdown_invoices, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.freelancer_analytics_sales_breakdown_revolut_reader, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.freelancer_analytics_sales_breakdown_revolut_terminal, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.freelancer_analytics_sales_breakdown_tap_to_pay, null, null, 14);
            case 7:
                return new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_analytics_sales_breakdown_ecommerce, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
