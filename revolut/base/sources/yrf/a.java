package yrf;

import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.retail.feature.payments.core.R$string;
import dj0.d;
import grl.k9;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sx4.f;
import sx4.g;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static ActionsBottomSheetController a(d monthlyRepayment, LocalDate firstInstalmentDueDate, LocalDate lastInstalmentDueDate) {
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        Intrinsics.checkNotNullParameter(firstInstalmentDueDate, "firstInstalmentDueDate");
        Intrinsics.checkNotNullParameter(lastInstalmentDueDate, "lastInstalmentDueDate");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_instalment_breakdown_sheet_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_instalment_breakdown_sheet_subtitle, null, null, 14);
        List listC = u.c(new BottomSheet.ItemSection(v.k(new BottomSheet.Item.CellItem("id_transfer_instalment_selection_monthly_repayment", new TextLocalisedClause(R$string.payments_instalment_breakdown_sheet_item_monthly_repayment, null, null, 14), f.b(3, null, null, monthlyRepayment), null, false, null, 0, SyslogConstants.LOG_CLOCK), new BottomSheet.Item.CellItem("id_transfer_instalment_selection_first_instalment_due", new TextLocalisedClause(R$string.payments_instalment_breakdown_sheet_item_first_due_date, null, null, 14), g.b(firstInstalmentDueDate, null), null, false, null, 0, SyslogConstants.LOG_CLOCK), new BottomSheet.Item.CellItem("id_transfer_instalment_selection_last_instalment_due", new TextLocalisedClause(R$string.payments_instalment_breakdown_sheet_item_last_due_date, null, null, 14), g.b(lastInstalmentDueDate, null), null, false, null, 0, SyslogConstants.LOG_CLOCK))));
        BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.transfer_overdraft_interest_sheet_gotit, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, listC, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 68);
    }
}
