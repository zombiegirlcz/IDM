package lk4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$UiConfig;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import ip0.vd0;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAmountTypeScreenContract$InputData f196217a;

    public j(SelectAmountTypeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f196217a = inputData;
    }

    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // jki.p
    public final m a(jki.i iVar) {
        Clause textLocalisedClause;
        Clause textLocalisedClause2;
        Clause textLocalisedClause3;
        Clause textLocalisedClause4;
        Clause textLocalisedClause5;
        ?? r112;
        Clause textLocalisedClause6;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem2;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem3;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem4;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem5;
        SetAmountFlowContract$UiConfig.SelectAmountItem selectAmountItem6;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ak4.a aVar = domainState.f196209a;
        ak4.a aVar2 = ak4.a.MINIMUM;
        ak4.a aVar3 = ak4.a.STATEMENT;
        ak4.a aVar4 = ak4.a.FIXED;
        vd0 vd0Var = vd0.RADIO;
        SelectAmountTypeScreenContract$InputData selectAmountTypeScreenContract$InputData = this.f196217a;
        SetAmountFlowContract$UiConfig.SelectAmount selectAmount = selectAmountTypeScreenContract$InputData.f68618c;
        if (selectAmount == null || (selectAmountItem6 = selectAmount.f68599c) == null || (textLocalisedClause = selectAmountItem6.f68600a) == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_auto_pay_amount_statement_title, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        if (selectAmount == null || (selectAmountItem5 = selectAmount.f68599c) == null || (textLocalisedClause2 = selectAmountItem5.f68601b) == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_auto_pay_amount_statement_subtitle, null, null, 14);
        }
        RowDelegate.Model model = new RowDelegate.Model("id_selectable_statement-row", null, clause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar3, null, 0, 0, 0, 0, 532674522);
        boolean z = aVar == aVar3;
        SelectableDelegate.b.C0424b c0424b = SelectableDelegate.b.C0424b.f53319a;
        SelectableDelegate.Model model2 = new SelectableDelegate.Model("id_selectable_statement", model, z, c0424b, vd0Var, 131040);
        if (selectAmount == null || (selectAmountItem4 = selectAmount.f68597a) == null || (textLocalisedClause3 = selectAmountItem4.f68600a) == null) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_auto_pay_amount_minimum_title, null, null, 14);
        }
        Clause clause2 = textLocalisedClause3;
        if (selectAmount == null || (selectAmountItem3 = selectAmount.f68597a) == null || (textLocalisedClause4 = selectAmountItem3.f68601b) == null) {
            textLocalisedClause4 = new TextLocalisedClause(R$string.credit_card_auto_pay_amount_minimum_subtitle, null, null, 14);
        }
        SelectableDelegate.Model model3 = new SelectableDelegate.Model("id_selectable_minimum", new RowDelegate.Model("id_selectable_minimum-row", null, clause2, null, 0, textLocalisedClause4, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar2, null, 0, 0, 0, 0, 532674522), aVar == aVar2, c0424b, vd0Var, 131040);
        if (selectAmount == null || (selectAmountItem2 = selectAmount.f68598b) == null || (textLocalisedClause5 = selectAmountItem2.f68600a) == null) {
            r112 = 0;
            textLocalisedClause5 = new TextLocalisedClause(R$string.credit_card_auto_pay_amount_custom_title, null, null, 14);
        } else {
            r112 = 0;
        }
        Clause clause3 = textLocalisedClause5;
        if (selectAmount == null || (selectAmountItem = selectAmount.f68598b) == null || (textLocalisedClause6 = selectAmountItem.f68601b) == null) {
            textLocalisedClause6 = new TextLocalisedClause(R$string.credit_card_auto_pay_amount_custom_subtitle, r112, r112, 14);
        }
        List listK = v.k(model2, model3, new SelectableDelegate.Model("id_selectable_fixed", new RowDelegate.Model("id_selectable_fixed-row", null, clause3, null, 0, textLocalisedClause6, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar4, null, 0, 0, 0, 0, 532674522), aVar == aVar4, c0424b, vd0Var, 131040));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        ak4.a aVar5 = domainState.f196209a;
        return new f((selectAmountTypeScreenContract$InputData.f68617b || aVar5 == aVar4) ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, r112, r112, 14) : new TextLocalisedClause(R$string.credit_common_confirm, r112, r112, 14), listK, aVar5 != null);
    }
}
