package ar4;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.i;
import jki.m;
import kotlin.jvm.internal.Intrinsics;
import xq4.j;
import xq4.k;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends k {
    @Override // jki.p
    public final m a(i iVar) {
        xq4.f domainState = (xq4.f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xq4.i iVarC = k.c(new TextLocalisedClause(R$string.credit_interest_explainer_title, null, null, 14));
        domainState.getClass();
        CreditCardDescriptionDestination.DescriptionConfig.Local local = ((xq4.d) domainState).f308106a;
        Intrinsics.i(local, "null cannot be cast to non-null type com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination.DescriptionConfig.Local.Apr");
        wi0.b bVar = ((CreditCardDescriptionDestination.DescriptionConfig.Local.Apr) local).f68908a;
        ListCellDelegate.Model model = new ListCellDelegate.Model("id_interest_rate", k.b(R$drawable.uikit_icn_24_credit), new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_interest_calculated_title, null, null, 14), new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_interest_calculated_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model2 = new ListCellDelegate.Model("id_grace_period", k.b(R$drawable.uikit_icn_24_arrow_exchange), new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_grace_period_title, null, null, 14), new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_grace_period_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        j8 j8VarB = k.b(R$drawable.uikit_icn_24_exclamation_triangle);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_charged_interest_title, null, null, 14);
        wi0.b.Companion.getClass();
        wi0.b bVar2 = wi0.b.W;
        ListCellDelegate.Model[] elements = {model, model2, new ListCellDelegate.Model("id_rate_info", j8VarB, textLocalisedClause, Intrinsics.f(bVar, bVar2) ? new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_charged_interest_subtitle_de, null, null, 14) : new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_charged_interest_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("id_less_interest", k.b(R$drawable.uikit_icn_24_plus), new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_pay_less_interest_title, null, null, 14), Intrinsics.f(bVar, bVar2) ? new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_pay_less_interest_subtitle_de, null, null, 14) : new TextLocalisedClause(R$string.credit_management_account_interest_rate_info_pay_less_interest_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new j(iVarC, listL, new xq4.h(), null);
    }
}
