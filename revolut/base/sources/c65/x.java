package c65;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.text.d0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements v {
    public static CellDetailsDelegate.Model a(int i, Clause clause, String str) {
        return new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), clause, 0, null, null, null, null, null, false, 0, 0, 32504);
    }

    public static aim.e b(LoanDetails loanDetails, String str, String str2, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        aim.e eVarB = zhm.u.b();
        String str3 = loanDetails.o;
        aim.e eVarB2 = zhm.u.b();
        if (str != null && !d0.W(str)) {
            eVarB2.add(a(R$string.loan_management_cancellation_details_customer_name, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "CUSTOMER_NAME_LIST_ID"));
        }
        if (str3 != null && !d0.W(str3)) {
            eVarB2.add(a(R$string.loan_management_cancellation_details_credit_agreement, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "CREDIT_AGREEMENT_LIST_ID"));
        }
        eVarB2.add(a(R$string.loan_management_cancellation_details_total_credit_amount, new MoneyClause(loanDetails.f70144a.f70113j, new MoneyClause.Format.Asset(0), null, null, 12), "TOTAL_CREDIT_AMOUNT_LIST_ID"));
        if (str2 != null && !d0.W(str2)) {
            eVarB2.add(a(R$string.loan_management_cancellation_details_confirmation_sent_to, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "CONFIRMATION_SENT_TO_LIST_ID"));
        }
        aim.e eVarA = zhm.u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LOAN_CANCEL_CONFIRM_ID", LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp8, 0, 0, 0, 14);
        eVarB.add(model);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("LOAN_CANCELLATION_DECLINE_ID", LargeActionButton.ButtonStyle.f58726b, null, textLocalisedClause2, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 7152);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        eVarB.add(model2);
        return zhm.u.a(eVarB);
    }

    public static y0 c(TextLocalisedClause textLocalisedClause, Clause clause, Clause clause2, TextLocalisedClause textLocalisedClause2) {
        return new y0("LOAN_CANCELLATION_SUCCESS_DIALOG_ID", new j0((Clause) textLocalisedClause, clause, (StatusDialogDescriptionProgress) null, (Parcelable) null, clause2 == null ? u1.b.f216225a : new w1(2, clause2, textLocalisedClause2), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4);
    }
}
