package ar4;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.m;
import xq4.j;
import xq4.k;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends k {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f8518a;

    public g(m moneyFormatter) {
        Intrinsics.checkNotNullParameter(moneyFormatter, "moneyFormatter");
        this.f8518a = moneyFormatter;
    }

    @Override // jki.p
    public final jki.m a(i iVar) {
        xq4.f domainState = (xq4.f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xq4.i iVarC = k.c(new TextLocalisedClause(R$string.credit_limit_explainer_title, null, null, 14));
        domainState.getClass();
        CreditCardDescriptionDestination.DescriptionConfig.Local local = ((xq4.d) domainState).f308106a;
        Intrinsics.i(local, "null cannot be cast to non-null type com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit");
        CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit securedTotalLimit = (CreditCardDescriptionDestination.DescriptionConfig.Local.SecuredTotalLimit) local;
        ListCellDelegate.Model model = new ListCellDelegate.Model("id_what_is_limit", k.b(R$drawable.uikit_icn_24_credit_bag), new TextLocalisedClause(R$string.credit_management_account_secured_credit_limit_info_what_is_limit_title, null, null, 14), new TextLocalisedClause(R$string.credit_management_account_secured_credit_limit_info_what_is_limit_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
        j8 j8VarB = k.b(R$drawable.uikit_icn_24_umbrella);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_management_account_secured_credit_limit_info_security_deposit_title, null, null, 14);
        int i = R$string.credit_management_account_secured_credit_limit_info_security_deposit_subtitle_template;
        int i2 = securedTotalLimit.f68915b;
        ListCellDelegate.Model[] elements = {model, new ListCellDelegate.Model("id_security_deposit", j8VarB, textLocalisedClause, new TextLocalisedClause(i, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, i2 / 30, i2 % 30, 0, 0, 0, 57), null)), null, 12), false, null, null, 0, 0, 0, 0, 4080), new ListCellDelegate.Model("id_increase_limit", k.b(R$drawable.uikit_icn_24_plus), new TextLocalisedClause(R$string.credit_management_account_secured_credit_limit_info_limit_increase_title, null, null, 14), new HtmlLocalisedClause(R$string.credit_management_account_secured_credit_limit_info_limit_increase_subtitle_with_link, u.c(this.f8518a.a(new u80.f(securedTotalLimit.f68916c, null, false, false, null, false, false, false, null, 4062))), (Integer) null, (Object) null, 28), false, null, null, 0, 0, 0, 0, 4064)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new j(iVarC, listL, new xq4.h(), null);
    }
}
