package pm4;

import android.os.Parcelable;
import bp4.i;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    public e(i localizationProvider) {
        Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
    }

    public static ActionsBottomSheetController e(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, dj0.d dVar, boolean z) {
        List listC = u.c(new BottomSheet.ItemSection(u.c(new BottomSheet.Item.CellItem("id_cc_details_dialog_item_amount", textLocalisedClause3, new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12), null, false, null, 0, SyslogConstants.LOG_CLOCK))));
        BottomSheet.ActionBlockItem actionBlockItem = new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_go_to_payment, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a);
        BottomSheet.ActionBlock dualAction = z ? new BottomSheet.ActionBlock.DualAction(actionBlockItem, new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_contact_support, null, null, 14), BottomSheet.ActionStyle.SemiAccent.f69825a), null) : new BottomSheet.ActionBlock.SingleAction(actionBlockItem, null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, listC, dualAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 68);
    }

    public static ActionsBottomSheetController g(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, dj0.d dVar) {
        List listC = u.c(new BottomSheet.ItemSection(u.c(new BottomSheet.Item.CellItem("id_cc_details_dialog_item_amount", new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_amount, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, null, 12), null, false, null, 0, SyslogConstants.LOG_CLOCK))));
        BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_go_to_payment, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, listC, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 64);
    }

    public final ActionsBottomSheetController a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_account_actions_statement_info_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_account_actions_statement_info_description, null, null, 14);
        BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, null, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 76);
    }

    public final ActionsBottomSheetController b(int i, dj0.d amount, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TextLocalisedClause textLocalisedClauseA = i.a(countryCode);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return g(textLocalisedClauseA, countryCode.equals(wi0.b.O) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_disabled_co, u.c(String.valueOf(i)), null, 12) : new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_disabled, u.c(String.valueOf(i)), null, 12), amount);
    }

    public final ActionsBottomSheetController c(dj0.d amount, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TextLocalisedClause textLocalisedClauseA = i.a(countryCode);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return g(textLocalisedClauseA, countryCode.equals(wi0.b.D2) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_may_reported_ro, null, null, 14) : countryCode.equals(wi0.b.W) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_may_reported_de, null, null, 14) : countryCode.equals(wi0.b.f297756l) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_may_reported_au, null, null, 14) : countryCode.equals(wi0.b.O) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_may_reported_co, null, null, 14) : new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_may_reported, null, null, 14), amount);
    }

    public final ActionsBottomSheetController d(dj0.d amount, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TextLocalisedClause textLocalisedClauseA = i.a(countryCode);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return g(textLocalisedClauseA, countryCode.equals(wi0.b.W) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_reported_de, null, null, 14) : countryCode.equals(wi0.b.D2) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_reported_ro, null, null, 14) : countryCode.equals(wi0.b.f297756l) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_reported_au, null, null, 14) : countryCode.equals(wi0.b.O) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_reported_co, null, null, 14) : new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_description_reported, null, null, 14), amount);
    }

    public final ActionsBottomSheetController f(dj0.d amount, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.O;
        TextLocalisedClause textLocalisedClause = Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_card_details_dialog_terminated_title_co, null, null, 14) : new TextLocalisedClause(R$string.credit_card_details_dialog_terminated_title, null, null, 14);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return e(textLocalisedClause, Intrinsics.f(countryCode, wi0.b.f297756l) ? new TextLocalisedClause(R$string.credit_card_details_dialog_terminated_description_au, null, null, 14) : Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_card_details_dialog_terminated_description_co, null, null, 14) : new TextLocalisedClause(R$string.credit_card_details_dialog_terminated_description, null, null, 14), new TextLocalisedClause(R$string.credit_card_details_dialog_terminated_total_to_pay, null, null, 14), amount, true);
    }
}
