package oq4;

import aw0.n6;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u80.m;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f227734a;

    public b(m moneyFormatter) {
        Intrinsics.checkNotNullParameter(moneyFormatter, "moneyFormatter");
        this.f227734a = moneyFormatter;
    }

    public final aw0.e a(boolean z, com.revolut.feature.credit.card.api.navigation.a screenMode, CreditCardSecurityDeposit creditCardSecurityDeposit) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        int[] iArr = a.f227733a;
        int i = iArr[screenMode.ordinal()];
        HtmlLocalisedClause htmlLocalisedClause = null;
        if (i == 1 || i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_action_footer_button, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_action_footer_button, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        if (creditCardSecurityDeposit == null) {
            return new aw0.e(false, null, null, new n6(textLocalisedClause2, LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, 988), null, null, 53);
        }
        boolean z3 = creditCardSecurityDeposit.f68757g;
        int i2 = iArr[screenMode.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (z3) {
                int i3 = R$string.credit_security_deposit_collateral_move_money_add_money_action_footer_spending_description_with_link;
                dj0.d money = new dj0.d(100L, creditCardSecurityDeposit.f68756c);
                Intrinsics.checkNotNullParameter(money, "money");
                htmlLocalisedClause = new HtmlLocalisedClause(i3, u.c(this.f227734a.a(new u80.f(money, null, true, true, new ScaleMode.SimpleLen(4, 2), true, false, false, null, 3590))), (Integer) null, (Object) null, 28);
            } else {
                htmlLocalisedClause = new HtmlLocalisedClause(R$string.credit_security_deposit_collateral_move_money_add_money_action_footer_description_with_link, (List) null, (Integer) null, (Object) null, 30);
            }
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z3) {
                htmlLocalisedClause = new HtmlLocalisedClause(R$string.credit_security_deposit_collateral_move_money_withdraw_action_footer_description_with_link, (List) null, (Integer) null, (Object) null, 30);
            }
        }
        return new aw0.e(false, htmlLocalisedClause, null, new n6(textLocalisedClause2, LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, 988), null, null, 53);
    }
}
