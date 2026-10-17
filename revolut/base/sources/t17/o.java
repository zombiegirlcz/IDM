package t17;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements m {
    public final l a(FilteringDateRange dateRange) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        if (dateRange instanceof FilteringDateRange.Custom) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_custom, null, null, 14);
        } else if (Intrinsics.f(dateRange, FilteringDateRange.Today.f73467a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_today, null, null, 14);
        } else if (Intrinsics.f(dateRange, FilteringDateRange.ThisWeek.f73466a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_this_week, null, null, 14);
        } else if (Intrinsics.f(dateRange, FilteringDateRange.ThisMonth.f73464a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_this_month, null, null, 14);
        } else {
            if (!Intrinsics.f(dateRange, FilteringDateRange.ThisQuarter.f73465a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_this_quarter, null, null, 14);
        }
        String name = dateRange.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new l(textLocalisedClause, dateRange, name);
    }

    public final l b(cs6.e paymentMethod) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        switch (n.f267210c[paymentMethod.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_payment_link, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_qr, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_invoice, null, null, 14);
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_card_reader, null, null, 14);
                break;
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_revolut_terminal, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_tap_to_pay, null, null, 14);
                break;
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_ecommerce, null, null, 14);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new l(textLocalisedClause, paymentMethod, paymentMethod.name());
    }

    public final l c(cs6.f status, cs6.g target) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(target, "target");
        switch (n.f267209b[status.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_draft, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_payment_links_filters_statuses_kind_active, null, null, 14);
                break;
            case 3:
                switch (n.f267208a[target.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_pending, null, null, 14);
                        break;
                    case 5:
                    case 6:
                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_sent, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_payment_links_filters_statuses_kind_suspended, null, null, 14);
                break;
            case 5:
                switch (n.f267208a[target.ordinal()]) {
                    case 1:
                    case 3:
                    case 4:
                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_completed, null, null, 14);
                        break;
                    case 2:
                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_payment_links_filters_statuses_kind_completed, null, null, 14);
                        break;
                    case 5:
                    case 6:
                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_paid, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_overdue, null, null, 14);
                break;
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_expired, null, null, 14);
                break;
            case 8:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_cancelled, null, null, 14);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new l(textLocalisedClause, status, status.name());
    }

    public final l d(cs6.h type) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(type, "type");
        int i = n.d[type.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_types_kind_payment, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_types_kind_refund, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_types_kind_chargeback, null, null, 14);
        }
        return new l(textLocalisedClause, type, type.name());
    }
}
