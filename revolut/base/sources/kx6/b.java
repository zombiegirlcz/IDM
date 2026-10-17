package kx6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sr6.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f190438a;

    public b(l80.e dateProvider, qy6.b recurringInvoiceClauseFactory) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(recurringInvoiceClauseFactory, "recurringInvoiceClauseFactory");
        this.f190438a = dateProvider;
    }

    public static TextLocalisedClause a(h unit) {
        int i;
        Intrinsics.checkNotNullParameter(unit, "unit");
        int i2 = a.f190437a[unit.ordinal()];
        if (i2 == 1) {
            i = R$string.freelancer_sale_invoice_setup_item_unit_item_title;
        } else if (i2 == 2) {
            i = R$string.freelancer_sale_invoice_setup_item_unit_hour_title;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.freelancer_sale_invoice_setup_item_unit_day_title;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
