package t17;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nr6.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1496a Companion = new C1496a();

    /* JADX INFO: renamed from: t17.a$a, reason: collision with other inner class name */
    public static final class C1496a {
        private C1496a() {
        }
    }

    public static l a(FilteringDateRange filteringDateRange) {
        Clause textLocalisedClause;
        if (filteringDateRange instanceof FilteringDateRange.Custom) {
            FilteringDateRange.Custom custom = (FilteringDateRange.Custom) filteringDateRange;
            LocalDate localDate = custom.f73462a;
            TimeClause.Format.DayAndMonth dayAndMonth = new TimeClause.Format.DayAndMonth(ka.SHORT);
            LocalDate localDate2 = custom.f73463b;
            boolean zF = Intrinsics.f(localDate, localDate2);
            TimeClause timeClause = new TimeClause(ebm.a.P(localDate), dayAndMonth, null, null, 12);
            TextClause textClause = new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (zF) {
                textClause = null;
            }
            TimeClause timeClause2 = new TimeClause(ebm.a.P(localDate2), dayAndMonth, null, null, 12);
            if (zF) {
                timeClause2 = null;
            }
            Object[] elements = {timeClause, textClause, timeClause2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            textLocalisedClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_custom, null, null, 14);
        }
        return new l(textLocalisedClause, null, "ITEM_ID_CUSTOM_DATE_RANGE_CHIP");
    }

    public static l b(FilteringDateRange dateRange) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        String name = dateRange.getClass().getName();
        if (dateRange instanceof FilteringDateRange.Custom) {
            return a(dateRange);
        }
        if (dateRange.equals(FilteringDateRange.Today.f73467a)) {
            return new l(new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_today, null, null, 14), dateRange, name);
        }
        if (dateRange.equals(FilteringDateRange.ThisWeek.f73466a)) {
            return new l(new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_this_week, null, null, 14), dateRange, name);
        }
        if (dateRange.equals(FilteringDateRange.ThisMonth.f73464a)) {
            return new l(new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_this_month, null, null, 14), dateRange, name);
        }
        if (dateRange.equals(FilteringDateRange.ThisQuarter.f73465a)) {
            return new l(new TextLocalisedClause(R$string.freelancer_sales_filters_time_range_kind_this_quarter, null, null, 14), dateRange, name);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static l c(ju6.b chip) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(chip, "chip");
        switch (b.f267198b[chip.ordinal()]) {
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
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_tap_to_pay, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_revolut_terminal, null, null, 14);
                break;
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_payment_methods_kind_ecommerce, null, null, 14);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new l(textLocalisedClause, chip, chip.name());
    }

    public static l d(c0 status) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(status, "status");
        switch (b.f267197a[status.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_paid, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_pending, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_acquiring_order_status_kind_refunded, null, null, 14);
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_state_failed, null, null, 14);
                break;
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_acquiring_order_status_kind_partial_refund, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_state_authorised, null, null, 14);
                break;
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_statuses_kind_cancelled, null, null, 14);
                break;
            case 8:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_acquiring_order_status_kind_partially_paid, null, null, 14);
                break;
            case 9:
            case 10:
                textLocalisedClause = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (textLocalisedClause != null) {
            return new l(textLocalisedClause, status, status.name());
        }
        return null;
    }
}
