package od3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cashback.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class t0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static rp0.y a(String activeCurrencyCode, boolean z) {
        Intrinsics.checkNotNullParameter(activeCurrencyCode, "activeCurrencyCode");
        rp0.t tVar = new rp0.t(z ? new TextLocalisedClause(R$string.cashback_change_currency_plan_sheet_title, null, null, 14) : new TextLocalisedClause(R$string.cashback_change_currency_sheet_title, null, null, 14), new TextLocalisedClause(R$string.cashback_change_currency_sheet_subtitle_default, null, null, 14), null, 28);
        rp0.l lVar = rp0.l.WINDOW;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_SELECT_CURRENCY", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.cashback_change_currency_sheet_action_select_currency, null, null, 14), false, null, activeCurrencyCode, 0, R$attr.uikit_dp24, 0, 0, 7024);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new rp0.y(zhm.u.c(model), tVar, lVar, null, null, null, 1016);
    }
}
