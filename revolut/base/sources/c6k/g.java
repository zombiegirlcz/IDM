package c6k;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.payments.core.R$string;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import tof.f2;
import tof.h2;
import tof.j4;
import tof.v2;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21818a;

    public g(a paymentTrackingDateFormatter) {
        Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
        this.f21818a = paymentTrackingDateFormatter;
    }

    public static CompositeClause f(String str) {
        Object[] elements = {str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.bank_transfer_tracker_failed_view_refund, null, new Click(30, (Integer) null, (Object) null, "ID_CLICKABLE_REFUND_DETAILS", false), 10)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static CompositeClause g(int i, boolean z) {
        TextLocalisedClause[] elements = {new TextLocalisedClause(i, null, null, 14), z ? new TextLocalisedClause(R$string.bank_transfer_tracker_resend, null, new Click(30, (Integer) null, (Object) null, "ID_CLICKABLE_RESEND", false), 10) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static o40 h(h2 h2Var) {
        n40 n40Var;
        Intrinsics.checkNotNullParameter(h2Var, "<this>");
        int i = f.f21817a[h2Var.h().ordinal()];
        if (i == 1) {
            n40Var = n40.FUTURE;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n40Var = n40.PAST;
        }
        return new o40(n40Var);
    }

    public r40 a(h2 step, v2 v2Var) {
        Intrinsics.checkNotNullParameter(step, "step");
        return d(step, R$attr.uikit_colorGreen, v2Var);
    }

    public abstract r40 b(h2 h2Var, j4 j4Var, v2 v2Var, z61.a aVar);

    public final Clause c(h2 step, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        DateTime dateTimeH = foh.i.h(step, z);
        DateTime dateTime = dateTimeH != null ? dateTimeH.toDateTime(DateTimeZone.getDefault()) : null;
        if (dateTime == null) {
            return null;
        }
        DateTime dateTimeWithTimeAtStartOfDay = dateTime.withTimeAtStartOfDay();
        f2 f2VarH = step.h();
        f2 f2Var = f2.PENDING;
        LocalTime localTime = f2VarH != f2Var ? dateTime.toLocalTime() : null;
        Intrinsics.h(dateTimeWithTimeAtStartOfDay);
        Clause clauseA = this.f21818a.a(dateTimeWithTimeAtStartOfDay, localTime);
        if (step.h() != f2Var) {
            return clauseA;
        }
        List listK = v.k(new TextLocalisedClause(R$string.bank_transfer_tracker_estimated_short_date_title, null, null, 14), clauseA);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public abstract r40 d(h2 h2Var, int i, v2 v2Var);

    public abstract r40 e(h2 h2Var, h2 h2Var2, int i, v2 v2Var);
}
