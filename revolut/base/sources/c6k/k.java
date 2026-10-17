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
import tof.h2;
import tof.j4;
import tof.v2;
import z61.a;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends g {
    @Override // c6k.g
    public final r40 b(h2 step, j4 j4Var, v2 v2Var, z61.a aVar) {
        Clause clauseG;
        Intrinsics.checkNotNullParameter(step, "step");
        Clause clauseC = c(step, true);
        String strE = step.e();
        boolean zF = true ^ Intrinsics.f(aVar, a.C1773a.f319652a);
        String strF = step.f();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        Clause htmlClause = strF != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF) : null;
        if (strE != null) {
            if (htmlClause == null) {
                htmlClause = new TextLocalisedClause(R$string.bank_transfer_tracker_title_failed, null, null, 14);
            }
            clauseG = new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE);
        } else if (v2Var == v2.DECLINED) {
            if (htmlClause == null) {
                htmlClause = new TextLocalisedClause(R$string.bank_transfer_tracker_title_declined, null, null, 14);
            }
            clauseG = new TextLocalisedClause(R$string.bank_transfer_tracker_verification_declined_subtitle, null, null, 14);
        } else if (v2Var == v2.TIMEOUT) {
            if (htmlClause == null) {
                htmlClause = new TextLocalisedClause(R$string.bank_transfer_tracker_title_declined, null, null, 14);
            }
            clauseG = g.g(R$string.bank_transfer_tracker_failed_refunded_subtitle_no_resend, zF);
        } else {
            if (htmlClause == null) {
                htmlClause = new TextLocalisedClause(R$string.bank_transfer_tracker_title_failed, null, null, 14);
            }
            clauseG = g.g(R$string.bank_transfer_tracker_failed_refunded_subtitle_no_resend, zF);
        }
        return new r40("VIEW_ID_TRACKER_ROW_1", clauseC, htmlClause, clauseG, null, null, R$attr.uikit_colorRed, false, new o40(n40.PAST), 0, 0, 0, null, 16048);
    }

    @Override // c6k.g
    public final r40 d(h2 step, int i, v2 v2Var) {
        Intrinsics.checkNotNullParameter(step, "step");
        Clause clauseC = c(step, true);
        String strF = step.f();
        String strE = step.e();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        return new r40("VIEW_ID_TRACKER_ROW_1", clauseC, (strF == null || strF.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_verification_completed_title_simplified, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : v2Var != null ? new TextLocalisedClause(R$string.bank_transfer_tracker_verification_accepted_by_user_title, null, null, 14) : null, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
    }

    @Override // c6k.g
    public final r40 e(h2 step, h2 h2Var, int i, v2 v2Var) {
        int i2;
        Clause htmlClause;
        String strL;
        Intrinsics.checkNotNullParameter(step, "step");
        Clause clauseC = c(step, true);
        String strE = step.e();
        String strF = step.f();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        Clause htmlClause2 = (strF == null || (strL = m70.a.l(strF)) == null) ? null : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strL);
        if (strE != null) {
            if (htmlClause2 == null) {
                htmlClause2 = new TextLocalisedClause(R$string.bank_transfer_tracker_verification_pending_title_simplified, null, null, 14);
            }
            i2 = i;
            htmlClause = new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE);
        } else if (v2Var != null) {
            if (htmlClause2 == null) {
                htmlClause2 = new TextLocalisedClause(R$string.bank_transfer_tracker_verification_actionRequired_title, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bank_transfer_tracker_verification_actionRequired_subtitle, null, null, 14);
            i2 = R$attr.uikit_colorOrange;
            htmlClause = textLocalisedClause;
        } else {
            if (htmlClause2 == null) {
                htmlClause2 = new TextLocalisedClause(R$string.bank_transfer_tracker_verification_pending_title_simplified, null, null, 14);
            }
            i2 = i;
            htmlClause = null;
        }
        return new r40("VIEW_ID_TRACKER_ROW_1", clauseC, htmlClause2, htmlClause, null, null, i2, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
    }
}
