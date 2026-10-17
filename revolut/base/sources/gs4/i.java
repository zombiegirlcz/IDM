package gs4;

import android.os.Parcelable;
import aw0.n6;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import grl.k9;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class i {
    public i(bp4.g localizationProvider) {
        Intrinsics.checkNotNullParameter(localizationProvider, "localizationProvider");
    }

    public static ActionsBottomSheetController c(Clause clause, BigDecimal bigDecimal) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_instalment_sheet_estimated_interest_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_instalment_sheet_estimated_interest_description, null, null, 14);
        BottomSheet.Item.CellItem[] elements = {new BottomSheet.Item.CellItem("id_credit_card_instalment_estimated_daily_interest", new TextLocalisedClause(R$string.credit_card_statement_details_info_interest, null, null, 14), clause, null, false, null, 0, SyslogConstants.LOG_CLOCK), bigDecimal != null ? new BottomSheet.Item.CellItem("id_credit_card_instalment_rate", new TextLocalisedClause(R$string.credit_card_instalment_sheet_estimated_interest_usury_rate, null, null, 14), new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6), null, false, null, 0, SyslogConstants.LOG_CLOCK) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listC = u.c(new BottomSheet.ItemSection(kotlin.collections.d.L(elements)));
        BottomSheet.ActionBlock.SingleAction singleAction = new BottomSheet.ActionBlock.SingleAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), null);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, listC, singleAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 68);
    }

    public final com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        bp4.d dVar = Intrinsics.f(countryCode, wi0.b.A) ? new bp4.d(new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_section_summary_total_cost, null, null, 14), new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_dialog_total_cost_description, null, null, 14), new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14)) : new bp4.d(new TextLocalisedClause(R$string.credit_card_instalment_management_dialog_apr_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_instalment_management_dialog_apr_description, null, null, 14), new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14));
        lw0.a aVar = new lw0.a(dVar.f17555a, dVar.f17556b, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(dVar.f17557c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    public final com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController b(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        bp4.d dVar = Intrinsics.f(countryCode, wi0.b.A) ? new bp4.d(new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_section_summary_interest_rate, null, null, 14), new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_dialog_interest_rate_description, null, null, 14), new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14)) : new bp4.d(new TextLocalisedClause(R$string.credit_card_instalment_term_sheet_interest_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_instalment_term_sheet_interest_description, null, null, 14), new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14));
        lw0.a aVar = new lw0.a(dVar.f17555a, dVar.f17556b, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(dVar.f17557c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
