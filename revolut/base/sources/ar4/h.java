package ar4;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.i;
import jki.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xq4.j;
import xq4.k;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends k {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        xq4.f domainState = (xq4.f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xq4.i iVarC = k.c(new TextLocalisedClause(R$string.credit_management_account_spending_limit_info_title, null, null, 14));
        domainState.getClass();
        CreditCardDescriptionDestination.DescriptionConfig.Local local = ((xq4.d) domainState).f308106a;
        Intrinsics.i(local, "null cannot be cast to non-null type com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination.DescriptionConfig.Local.SpendingLimit");
        CreditCardDescriptionDestination.DescriptionConfig.Local.SpendingLimit spendingLimit = (CreditCardDescriptionDestination.DescriptionConfig.Local.SpendingLimit) local;
        j8 j8VarB = k.b(R$drawable.uikit_icn_24_data_limit_half);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_management_account_spending_limit_info_spending_limit_title, null, null, 14);
        int i = R$string.credit_management_account_spending_limit_info_spending_limit_subtitle;
        xi0.a aVar = xi0.b.Companion;
        wi0.b bVar = spendingLimit.f68917a;
        aVar.getClass();
        ListCellDelegate.Model model = new ListCellDelegate.Model("id_what_is_spending_limit", j8VarB, textLocalisedClause, new TextLocalisedClause(i, v.k(new MoneyClause(new dj0.d(60000L, xi0.a.b(bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(new dj0.d(60000L, xi0.a.b(bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), false, null, null, 0, 0, 0, 0, 4080);
        j8 j8VarB2 = k.b(R$drawable.uikit_icn_24_umbrella);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_management_account_spending_limit_info_security_deposit_title, null, null, 14);
        int i2 = R$string.credit_management_account_spending_limit_info_security_deposit_subtitle_template;
        int i3 = spendingLimit.f68918b;
        ListCellDelegate.Model[] elements = {model, new ListCellDelegate.Model("id_security_deposit", j8VarB2, textLocalisedClause2, new TextLocalisedClause(i2, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, i3 / 30, i3 % 30, 0, 0, 0, 57), null)), null, 12), false, null, null, 0, 0, 0, 0, 4080), new ListCellDelegate.Model("id_increase_limit", k.b(R$drawable.uikit_icn_24_plus), new TextLocalisedClause(R$string.credit_management_account_spending_limit_info_limit_increase_title, null, null, 14), new TextLocalisedClause(R$string.credit_management_account_spending_limit_info_limit_increase_subtitle, u.c(new MoneyClause(new dj0.d(100000L, xi0.a.b(bVar)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), false, null, null, 0, 0, 0, 0, 4080)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new j(iVarC, listL, new xq4.h(), null);
    }
}
