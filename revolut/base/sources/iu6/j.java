package iu6;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nr6.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {
    public static TextLocalisedClause a(c0 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        switch (i.f168523b[status.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.freelancer_sale_status_kind_paid, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.freelancer_sale_status_kind_pending, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.freelancer_sale_acquiring_order_status_kind_refunded, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.freelancer_sale_acquiring_order_status_kind_partial_refund, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_state_authorised, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.freelancer_sale_acquiring_order_status_kind_partially_paid, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_state_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
            case 8:
                return new TextLocalisedClause(R$string.freelancer_sale_status_kind_cancelled, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
            default:
                return null;
        }
    }
}
