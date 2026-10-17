package pkf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import ip0.c50;
import ip0.f50;
import ip0.h50;
import ip0.j50;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class q2 {

    @NotNull
    public static final o2 Companion = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6k.a f237119a;

    public q2(c6k.a paymentTrackingDateFormatter, hk5.c transactionStateChecker) {
        Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
        Intrinsics.checkNotNullParameter(transactionStateChecker, "transactionStateChecker");
        this.f237119a = paymentTrackingDateFormatter;
    }

    public static CompositeClause b(int i) {
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.transactionUI_transaction_pending_learn_more, null, new Click(30, (Integer) null, (Object) null, "WITHDRAW_REVOLUT_PENDING_LEARN_MORE_CLICK_ID", false), 10)));
    }

    public static ProgressStepVerticalV2Delegate.Model d(Clause clause, TextLocalisedClause textLocalisedClause, Clause clause2, j50 j50Var) {
        Clause[] elements = {clause, clause2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ProgressStepVerticalV2Delegate.Model("WITHDRAW_TRACKING_SECOND_STEP_ID", textLocalisedClause, v1.c.f(kotlin.collections.d.L(elements), null), new f50(j50Var, c50.LAST, false), false, null, 0, 0, 0, null, false, false, 32752);
    }

    public final Clause a(a3 a3Var) {
        DateTime dateTime = a3Var.f272596j;
        DateTime dateTime2 = a3Var.i;
        DateTime dateTime3 = dateTime == null ? dateTime2 : dateTime;
        if (dateTime == null) {
            dateTime = dateTime2;
        }
        LocalTime localTime = dateTime.toDateTime(DateTimeZone.getDefault()).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        return this.f237119a.a(dateTime3, localTime);
    }

    public final ProgressStepVerticalV2Delegate.Model c(a3 a3Var, j50 j50Var) {
        DateTime dateTime = a3Var.f272591g;
        LocalTime localTime = dateTime.toDateTime(DateTimeZone.getDefault()).toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        return new ProgressStepVerticalV2Delegate.Model("WITHDRAW_TRACKING_FIRST_STEP_ID", new TextLocalisedClause(R$string.transaction_details_cryptowithdrawal_timeline_first_step, null, null, 14), this.f237119a.a(dateTime, localTime), new h50(j50Var, c50.FIRST), false, null, 0, 0, 0, null, false, false, 32752);
    }
}
