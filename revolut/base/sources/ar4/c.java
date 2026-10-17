package ar4;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.i;
import jki.m;
import kotlin.jvm.internal.Intrinsics;
import xq4.j;
import xq4.k;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends k {
    @Override // jki.p
    public final m a(i iVar) {
        xq4.f domainState = (xq4.f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xq4.i iVarC = k.c(new TextLocalisedClause(R$string.credit_card_transaction_interest_late_title, null, null, 14));
        List listK = v.k(new ListCellDelegate.Model("id_credit_card_info_interest_how_is_calculated", k.b(R$drawable.uikit_icn_24_credit_bag), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_interest_calculated_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_interest_calculated_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4080), new ListCellDelegate.Model("id_credit_card_info_interest_what_is_grace_period", k.b(R$drawable.uikit_icn_24_arrow_exchange), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_grace_period_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_grace_period_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4080), new ListCellDelegate.Model("id_credit_card_info_interest_when_charged", k.b(R$drawable.uikit_icn_24_warning), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_charged_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_charged_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4080), new ListCellDelegate.Model("id_credit_card_info_interest_how_pay_less", k.b(R$drawable.uikit_icn_24_arrow_rates_down), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_pay_less_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_transaction_interest_late_pay_less_description, null, null, 14), false, null, null, 0, 0, 0, 0, 4080));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new j(iVarC, listK, new xq4.h(), null);
    }
}
