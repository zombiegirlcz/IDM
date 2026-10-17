package c6k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.payments.core.R$plurals;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.core.transfertracker.PaymentTrackingHtmlClauseParcel;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.h2;
import tof.j4;
import tof.v2;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21819b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(a aVar, int i) {
        super(aVar);
        this.f21819b = i;
    }

    public static Pair i(h2 h2Var, int i) {
        String strF = h2Var.f();
        String strE = h2Var.e();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        return new Pair((strF == null || strF.length() == 0) ? new TextLocalisedClause(i, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : null);
    }

    public static Pair j(h2 h2Var, int i) {
        String strF = h2Var.f();
        String strE = h2Var.e();
        PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
        return new Pair((strF == null || strF.length() == 0) ? new TextLocalisedClause(i, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : null);
    }

    @Override // c6k.g
    public r40 a(h2 step, v2 v2Var) {
        switch (this.f21819b) {
            case 0:
                Intrinsics.checkNotNullParameter(step, "step");
                Clause clauseC = c(step, false);
                String strF = step.f();
                String strE = step.e();
                PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
                return new r40("VIEW_ID_TRACKER_ROW_4", clauseC, (strF == null || strF.length() == 0) ? step.a() != null ? new TextLocalisedClause(R$string.bank_transfer_tracker_credit_completed_confirmed_title, null, null, 14) : new TextLocalisedClause(R$string.bank_transfer_tracker_credit_completed_not_confirmed_title, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : step.a() != null ? new TextLocalisedClause(R$string.bank_transfer_tracker_credit_completed_title, null, null, 14) : new TextLocalisedClause(R$string.bank_transfer_tracker_credit_completed_not_confirmed_subtitle, null, null, 14), null, null, R$attr.uikit_colorGreen, false, g.h(step), 0, 0, 0, null, 16048);
            default:
                return super.a(step, v2Var);
        }
    }

    @Override // c6k.g
    public final r40 b(h2 step, j4 j4Var, v2 v2Var, z61.a aVar) {
        switch (this.f21819b) {
            case 0:
                Intrinsics.checkNotNullParameter(step, "step");
                Clause clauseC = c(step, false);
                String strF = step.f();
                String strE = step.e();
                PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
                return new r40("VIEW_ID_TRACKER_ROW_4", clauseC, (strF == null || strF.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_credit_failed_title, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : j4Var != null ? g.f(j4Var.f272847b) : new TextLocalisedClause(R$string.bank_transfer_tracker_credit_failed_subtitle, null, null, 14), null, null, R$attr.uikit_colorRed, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
            case 1:
                Intrinsics.checkNotNullParameter(step, "step");
                Clause clauseC2 = c(step, false);
                String strF2 = step.f();
                String strE2 = step.e();
                PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel2 = PaymentTrackingHtmlClauseParcel.f102138a;
                return new r40("VIEW_ID_TRACKER_ROW_3", clauseC2, (strF2 == null || strF2.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_delivery_failed_title, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel2, strF2), strE2 != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel2, strE2) : j4Var != null ? g.f(j4Var.f272847b) : new TextLocalisedClause(R$string.bank_transfer_tracker_delivery_failed_subtitle, null, null, 14), null, null, R$attr.uikit_colorRed, false, new o40(n40.PAST), 0, 0, 0, null, 16048);
            case 2:
                Intrinsics.checkNotNullParameter(step, "step");
                Pair pairI = i(step, R$string.bank_transfer_tracker_funds_received_pending_title);
                return new r40("VIEW_ID_TRACKER_ROW_1", c(step, false), (Clause) pairI.f186385a, (Clause) pairI.f186386b, null, null, R$attr.uikit_colorRed, false, new o40(n40.PAST), 0, 0, 0, null, 16048);
            case 3:
                Intrinsics.checkNotNullParameter(step, "step");
                Pair pairJ = j(step, R$string.bank_transfer_tracker_funds_returned_failed_title);
                return new r40("VIEW_ID_TRACKER_ROW_3", c(step, false), (Clause) pairJ.f186385a, (Clause) pairJ.f186386b, null, null, R$attr.uikit_colorRed, false, new o40(n40.PAST), 0, 0, 0, null, 16048);
            default:
                Intrinsics.checkNotNullParameter(step, "step");
                return new r40("VIEW_ID_TRACKER_ROW_2", null, new TextLocalisedClause(R$string.payment_link_tracker_title_claimed, null, null, 14), null, null, null, R$attr.uikit_colorRed, false, new o40(n40.PAST), 0, 0, 0, null, 16048);
        }
    }

    @Override // c6k.g
    public final r40 d(h2 step, int i, v2 v2Var) {
        switch (this.f21819b) {
            case 0:
                Intrinsics.checkNotNullParameter(step, "step");
                Clause clauseC = c(step, false);
                String strE = step.e();
                String strF = step.f();
                PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
                return new r40("VIEW_ID_TRACKER_ROW_4", clauseC, (strF == null || strF.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_credit_completed_title, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF), strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : null, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
            case 1:
                Intrinsics.checkNotNullParameter(step, "step");
                Clause clauseC2 = c(step, false);
                String strF2 = step.f();
                String strE2 = step.e();
                PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel2 = PaymentTrackingHtmlClauseParcel.f102138a;
                return new r40("VIEW_ID_TRACKER_ROW_3", clauseC2, (strF2 == null || strF2.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_delivery_title_simplified, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel2, strF2), strE2 != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel2, strE2) : null, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
            case 2:
                Intrinsics.checkNotNullParameter(step, "step");
                Pair pairI = i(step, R$string.bank_transfer_tracker_funds_received_completed_title);
                return new r40("VIEW_ID_TRACKER_ROW_1", c(step, false), (Clause) pairI.f186385a, (Clause) pairI.f186386b, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
            case 3:
                Intrinsics.checkNotNullParameter(step, "step");
                Clause clauseC3 = c(step, true);
                Pair pairJ = j(step, R$string.bank_transfer_tracker_funds_returned_completed_title);
                return new r40("VIEW_ID_TRACKER_ROW_3", clauseC3, (Clause) pairJ.f186385a, (Clause) pairJ.f186386b, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
            default:
                Intrinsics.checkNotNullParameter(step, "step");
                return new r40("VIEW_ID_TRACKER_ROW_2", c(step, true), new TextLocalisedClause(R$string.payment_link_tracker_title_claimed, null, null, 14), null, null, null, i, false, g.h(step), 0, 0, 0, null, 16048);
        }
    }

    @Override // c6k.g
    public final r40 e(h2 step, h2 h2Var, int i, v2 v2Var) {
        switch (this.f21819b) {
            case 0:
                Intrinsics.checkNotNullParameter(step, "step");
                DateTime dateTimeB = step.b();
                Clause textLocalisedQuantityClause = null;
                DateTime dateTimeB2 = h2Var != null ? h2Var.b() : null;
                Integer numValueOf = (dateTimeB == null || dateTimeB2 == null) ? null : Integer.valueOf(jli.b.a(dateTimeB2, dateTimeB));
                String strF = step.f();
                String strE = step.e();
                PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel = PaymentTrackingHtmlClauseParcel.f102138a;
                Clause htmlClause = strE != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strE) : null;
                Clause textLocalisedClause = (strF == null || strF.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_credit_pending_delay_title, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel, strF);
                if (numValueOf != null) {
                    textLocalisedQuantityClause = numValueOf.intValue() > 0 ? new TextLocalisedQuantityClause(R$plurals.bank_transfer_tracker_credit_pending_delay_another_day_subtitle, numValueOf, (List) null, (Style) null, 28) : new TextLocalisedClause(R$string.bank_transfer_tracker_credit_pending_delay_same_day_subtitle, null, null, 14);
                }
                Clause clauseC = c(step, false);
                if (htmlClause == null) {
                    htmlClause = textLocalisedQuantityClause;
                }
                return new r40("VIEW_ID_TRACKER_ROW_4", clauseC, textLocalisedClause, htmlClause, null, null, i, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
            case 1:
                Intrinsics.checkNotNullParameter(step, "step");
                Clause clauseC2 = c(step, false);
                String strF2 = step.f();
                PaymentTrackingHtmlClauseParcel paymentTrackingHtmlClauseParcel2 = PaymentTrackingHtmlClauseParcel.f102138a;
                Clause textLocalisedClause2 = (strF2 == null || strF2.length() == 0) ? new TextLocalisedClause(R$string.bank_transfer_tracker_delivery_pending_title, null, null, 14) : new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel2, strF2);
                String strE2 = step.e();
                return new r40("VIEW_ID_TRACKER_ROW_3", clauseC2, textLocalisedClause2, strE2 != null ? new HtmlClause(0, 14, (Integer) null, paymentTrackingHtmlClauseParcel2, strE2) : null, null, null, i, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
            case 2:
                Intrinsics.checkNotNullParameter(step, "step");
                Pair pairI = i(step, R$string.bank_transfer_tracker_funds_received_pending_title);
                return new r40("VIEW_ID_TRACKER_ROW_1", c(step, false), (Clause) pairI.f186385a, (Clause) pairI.f186386b, null, null, i, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
            case 3:
                Intrinsics.checkNotNullParameter(step, "step");
                Pair pairJ = j(step, R$string.bank_transfer_tracker_funds_returned_pending_title);
                return new r40("VIEW_ID_TRACKER_ROW_3", c(step, false), (Clause) pairJ.f186385a, (Clause) pairJ.f186386b, null, null, i, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
            default:
                Intrinsics.checkNotNullParameter(step, "step");
                return new r40("VIEW_ID_TRACKER_ROW_2", null, new TextLocalisedClause(R$string.payment_link_tracker_title_claimed, null, null, 14), null, null, null, i, false, new o40(n40.CURRENT), 0, 0, 0, null, 16048);
        }
    }
}
