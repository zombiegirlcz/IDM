package qy6;

import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceRecurringPeriod;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sr6.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static TextLocalisedClause a(l period) {
        int i;
        Intrinsics.checkNotNullParameter(period, "period");
        int i2 = a.f250157a[period.ordinal()];
        if (i2 == 1) {
            i = R$string.freelancer_sale_invoice_schedule_recurring_picker_repeat_every_day;
        } else if (i2 == 2) {
            i = R$string.freelancer_sale_invoice_schedule_recurring_picker_repeat_every_week;
        } else if (i2 == 3) {
            i = R$string.freelancer_sale_invoice_schedule_recurring_picker_repeat_every_month;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.freelancer_sale_invoice_schedule_recurring_picker_repeat_every_year;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static TextLocalisedQuantityClause b(FreelancerInvoiceRecurringPeriod period) {
        int i;
        Intrinsics.checkNotNullParameter(period, "period");
        int i2 = a.f250157a[period.f73401a.ordinal()];
        if (i2 == 1) {
            i = R$plurals.freelancer_sale_invoice_schedule_recurring_period_daily_description;
        } else if (i2 == 2) {
            i = R$plurals.freelancer_sale_invoice_schedule_recurring_period_weekly_description;
        } else if (i2 == 3) {
            i = R$plurals.freelancer_sale_invoice_schedule_recurring_period_monthly_description;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$plurals.freelancer_sale_invoice_schedule_recurring_period_yearly_description;
        }
        return new TextLocalisedQuantityClause(i, Integer.valueOf(period.f73402b), (List) null, (Style) null, 28);
    }
}
