package mvl;

import a0.d;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements jvl.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y b(t tVar, List list) {
        return new y(list, tVar, l.WINDOW, null, null, null, 1016);
    }

    public static TextLocalisedClause f(int i, Amount amount, float f) {
        return new TextLocalisedClause(i, v.k(e4i.c.a(amount, null, null, null, null, null, 63), d.v(new Object[]{Float.valueOf(f * 100)}, 1, "%.0f", "format(...)")), null, 12);
    }

    public static y g(String str, TextLocalisedClause textLocalisedClause, Amount amount, TextLocalisedClause textLocalisedClause2) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        List listC = u.c(new LargeActionButtonDelegate.Model("BUTTON_ID_FUND", defaultFilledButton, null, textLocalisedClause2, true, null, amount, i, i2, i2, i2, 352));
        int i3 = R$string.wealth_stocks_buy_error_insufficient_funds_title;
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new y(listC, new t(new TextLocalisedClause(i3, u.c(upperCase), null, 12), textLocalisedClause, null, 28), null, null, null, null, 1020);
    }

    public static y h(TextLocalisedClause textLocalisedClause) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trading_dialog_insufficient_funds_button_select_account, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("BUTTON_ID_SWITCH_ACCOUNT", defaultFilledButton, null, textLocalisedClause2, true, null, null, i, i2, i2, i2, 352)), new t(new TextLocalisedClause(R$string.wealth_trading_dialog_insufficient_funds_title_short, null, null, 14), textLocalisedClause, null, 28), null, null, null, null, 1020);
    }

    public final LargeActionButtonDelegate.Model c(int i) {
        return esl.a.a(new LargeActionButtonDelegate.Model("EXPANDABLE_DIALOG_LARGE_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, jvl.b.DISMISS_DIALOG, null, 744), i, 0, 14);
    }

    public final y d(nel.b bVar) {
        int i;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_secondary_input_title, null, null, 14);
        int i2 = bVar == null ? -1 : c.f209275b[bVar.ordinal()];
        if (i2 == -1) {
            i = R$string.wealth_orders_bonds_dialog_secondary_input_description;
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_orders_bonds_dialog_secondary_input_description;
        } else {
            i = R$string.wealth_orders_bonds_dialog_secondary_input_non_fractional_description;
        }
        return b(new t(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, 28), u.c(c(R$attr.uikit_dp8)));
    }

    public final y e() {
        return b(new t(new TextLocalisedClause(R$string.wealth_orders_structured_note_dialog_secondary_input_title, null, null, 14), new TextLocalisedClause(R$string.wealth_orders_structured_note_dialog_secondary_input_description, null, null, 14), null, 28), u.c(c(R$attr.uikit_dp8)));
    }
}
