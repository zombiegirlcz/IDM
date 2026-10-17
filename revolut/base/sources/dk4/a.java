package dk4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$UiConfig;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit_card.autopay.api.models_v3.AmountSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements vj4.a {
    public final SetAmountFlowContract$UiConfig a(wi0.b countryCode, AmountSelection amountSelection) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (amountSelection == null) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(countryCode, wi0.b.f297756l)) {
                return new SetAmountFlowContract$UiConfig(new SetAmountFlowContract$UiConfig.SelectAmount(new SetAmountFlowContract$UiConfig.SelectAmountItem(null, new TextLocalisedClause(R$string.credit_card_auto_pay_amount_minimum_subtitle_au, null, null, 14)), null, null), new SetAmountFlowContract$UiConfig.InputAmount(new TextLocalisedClause(R$string.credit_card_auto_pay_custom_amount_note_au, null, null, 14)));
            }
            return null;
        }
        String str = amountSelection.f70687a;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str2 = amountSelection.f70688b;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem = new SetAmountFlowContract$UiConfig.SelectAmountItem(textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
        String str3 = amountSelection.d;
        TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str4 = amountSelection.e;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem2 = new SetAmountFlowContract$UiConfig.SelectAmountItem(textClause2, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
        String str5 = amountSelection.f;
        TextClause textClause3 = str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str6 = amountSelection.f70690g;
        SetAmountFlowContract$UiConfig.SelectAmount selectAmount = new SetAmountFlowContract$UiConfig.SelectAmount(selectAmountItem2, selectAmountItem, new SetAmountFlowContract$UiConfig.SelectAmountItem(textClause3, str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null));
        String str7 = amountSelection.f70689c;
        return new SetAmountFlowContract$UiConfig(selectAmount, new SetAmountFlowContract$UiConfig.InputAmount(str7 != null ? new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null));
    }
}
