package wq4;

import aw0.ka;
import cm4.p;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public abstract class h implements i {
    public static qv0.i b(String listId, TextLocalisedClause cellTitle, MoneyClause endText) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Intrinsics.checkNotNullParameter(endText, "endText");
        return new CellDetailsActionDelegate.Model(listId, cellTitle, 0, null, endText, null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public static qv0.i c(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        long j2 = paymentData.f25138l;
        long j3 = paymentData.k;
        if (j2 > j3) {
            return b("id_cc_limit_exceeded", new TextLocalisedClause(R$string.credit_account_info_limit_exceeded_title, null, null, 14), sx4.f.b(3, null, null, new dj0.d(Math.max(0L, j2 - j3), paymentData.f25135g)));
        }
        return null;
    }

    public static qv0.i d(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_management_minimum, null, null, 14);
        xi0.b currency = paymentData.f25135g;
        long j2 = paymentData.e;
        Intrinsics.checkNotNullParameter(currency, "currency");
        return b("id_cc_minimum", textLocalisedClause, sx4.f.b(3, null, null, new dj0.d(j2, currency)));
    }

    public static CellDetailsDelegate.Model e(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new CellDetailsDelegate.Model("cc_payment_due", new TextLocalisedClause(R$string.credit_management_overview_payment_due, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), g(paymentData.f), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static qv0.i f(p paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Long l2 = paymentData.d;
        TimeClause timeClauseH = h(Instant.ofEpochMilli(l2 != null ? l2.longValue() : paymentData.f25132a).minus((TemporalAmount) Duration.ofDays(1L)).toEpochMilli());
        long j2 = paymentData.f25134c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(j2 == paymentData.f25136h ? R$string.credit_management_statement_dot_value : R$string.credit_management_remaining_dot_value, u.c(timeClauseH), null, 12);
        xi0.b currency = paymentData.f25135g;
        Intrinsics.checkNotNullParameter(currency, "currency");
        return b("id_cc_statement", textLocalisedClause, sx4.f.b(3, null, null, new dj0.d(j2, currency)));
    }

    public static TimeClause g(long j2) {
        return new TimeClause(j2, new TimeClause.Format.DayAndMonth(ka.SHORT), null, g0m.a.f139502a, 4);
    }

    public static TimeClause h(long j2) {
        return new TimeClause(j2, new TimeClause.Format.Month(ka.SHORT), null, g0m.a.f139502a, 4);
    }
}
