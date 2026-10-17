package c6k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.core.transfertracker.PaymentTrackingHtmlClauseParcel;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import tof.h2;
import tof.j4;
import tof.v2;
import z61.a;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f21821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l80.e dateProvider, a paymentTrackingDateFormatter) {
        super(paymentTrackingDateFormatter);
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
        this.f21821b = dateProvider;
    }

    @Override // c6k.g
    public final r40 b(h2 step, j4 j4Var, v2 v2Var, z61.a aVar) {
        Intrinsics.checkNotNullParameter(step, "step");
        Clause clauseC = c(step, false);
        boolean z = !Intrinsics.f(aVar, a.C1773a.f319652a);
        String strF = step.f();
        String strE = step.e();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        return new r40("VIEW_ID_TRACKER_ROW_2", clauseC, (strF == null || strF.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_title_failed, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : g.g(R$string.bank_transfer_tracker_failed_refunded_subtitle_no_resend, z), null, null, R$attr.uikit_colorRed, false, new o40(n40.PAST), 0, 0, 0, null, 16048);
    }

    @Override // c6k.g
    public final r40 d(h2 step, int i, v2 v2Var) {
        Intrinsics.checkNotNullParameter(step, "step");
        Clause clauseC = c(step, false);
        String strE = step.e();
        String strF = step.f();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        return new r40("VIEW_ID_TRACKER_ROW_2", clauseC, (strF == null || strF.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_processing_title_simplified, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : null, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
    }

    @Override // c6k.g
    public final r40 e(h2 step, h2 h2Var, int i, v2 v2Var) {
        Clause htmlClause;
        Intrinsics.checkNotNullParameter(step, "step");
        Clause clauseC = c(step, false);
        String strF = step.f();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        Clause textLocalisedClause = (strF == null || strF.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_processing_title_simplified, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF);
        String strE = step.e();
        if (strE != null) {
            htmlClause = new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE);
        } else {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.bank_transfer_tracker_processing_subtitle_delayed, null, null, 14);
            DateTime dateTimeB = step.b();
            htmlClause = ((l80.f) this.f21821b).g().toDateTime(DateTimeZone.UTC).withTimeAtStartOfDay().isAfter(dateTimeB != null ? dateTimeB.withTimeAtStartOfDay() : null) ? textLocalisedClause2 : null;
        }
        return new r40("VIEW_ID_TRACKER_ROW_2", clauseC, textLocalisedClause, htmlClause, null, null, i, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
    }
}
