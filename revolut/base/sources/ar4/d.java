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
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends k {
    @Override // jki.p
    public final m a(i iVar) {
        xq4.f domainState = (xq4.f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xq4.i iVarC = k.c(new TextLocalisedClause(R$string.credit_limit_explainer_title, null, null, 14));
        domainState.getClass();
        CreditCardDescriptionDestination.DescriptionConfig.Local local = ((xq4.d) domainState).f308106a;
        Intrinsics.i(local, "null cannot be cast to non-null type com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit");
        j8 j8VarB = k.b(R$drawable.uikit_icn_24_credit_bag);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_what_is_limit_title, null, null, 14);
        wi0.b countryCode = ((CreditCardDescriptionDestination.DescriptionConfig.Local.TotalLimit) local).f68919a;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.f297756l;
        ListCellDelegate.Model model = new ListCellDelegate.Model("id_what_is_limit", j8VarB, textLocalisedClause, Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_what_is_limit_subtitle_au, null, null, 14) : new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_what_is_limit_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
        j8 j8VarB2 = k.b(R$drawable.uikit_icn_24_arrow_exchange);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_limit_renew_title, null, null, 14);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ListCellDelegate.Model model2 = new ListCellDelegate.Model("id_limit_renew", j8VarB2, textLocalisedClause2, Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_limit_renew_subtitle_au, null, null, 14) : new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_limit_renew_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
        j8 j8VarB3 = k.b(R$drawable.uikit_icn_24_warning);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_run_over_title, null, null, 14);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ListCellDelegate.Model model3 = new ListCellDelegate.Model("id_limit_run_over", j8VarB3, textLocalisedClause3, Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_run_over_subtitle_au, null, null, 14) : new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_run_over_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
        ListCellDelegate.Model model4 = new ListCellDelegate.Model("id_limit_increase", k.b(R$drawable.uikit_icn_24_plus), new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_increase_title, null, null, 14), new TextLocalisedClause(R$string.credit_management_account_credit_limit_info_increase_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
        if (v.k(wi0.b.L0, bVar).contains(countryCode)) {
            model4 = null;
        }
        ListCellDelegate.Model[] elements = {model, model2, model3, model4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new j(iVarC, listL, new xq4.h(), null);
    }
}
