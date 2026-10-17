package pvl;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import vrl.a0;
import vrl.u;
import vrl.w;
import vrl.x;
import vrl.z;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements pvl.a {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static LargeActionButtonDelegate.Model a() {
        return d(new TextLocalisedClause(R$string.trading_orders_limit_price_edit, null, null, 14));
    }

    public static LargeActionButtonDelegate.Model b() {
        return d(new TextLocalisedClause(R$string.trading_orders_stop_price_edit, null, null, 14));
    }

    public static y c(t tVar, List list) {
        return new y(list, tVar, l.WINDOW, null, null, null, 1016);
    }

    public static LargeActionButtonDelegate.Model d(TextLocalisedClause textLocalisedClause) {
        return esl.a.a(new LargeActionButtonDelegate.Model("EXPANDABLE_DIALOG_LARGE_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, false, null, null, b.DISMISS_DIALOG, null, 744), 0, 0, 15);
    }

    public static List e() {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        b bVar = b.PROCEED_LIMIT_WARNING;
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("continue.lab", defaultFilledButton, null, textLocalisedClause, false, null, bVar, R$attr.uikit_dp24, R$attr.uikit_dp8, i, i, 368);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_limit_price_edit, null, null, 14);
        b bVar2 = b.DISMISS_DIALOG;
        int i2 = R$attr.uikit_dp16;
        return v.k(model, new LargeActionButtonDelegate.Model("edit_limit.lab", defaultFilledButton2, null, textLocalisedClause2, false, null, bVar2, R$attr.uikit_dp8, R$attr.uikit_dp24, i2, i2, 368));
    }

    public static AssetClause f(Amount amount) {
        return e4i.c.a(amount, null, null, null, null, o9.NON_SENSITIVE, 31);
    }

    public final TextLocalisedClause g(a0 validation) {
        Intrinsics.checkNotNullParameter(validation, "validation");
        if (!Intrinsics.f(validation, vrl.t.f291679b) && !Intrinsics.f(validation, u.f291680b)) {
            if (validation instanceof vrl.y) {
                return new TextLocalisedClause(R$string.trading_orders_target_price_stop_price_too_close, null, null, 14);
            }
            if (validation instanceof vrl.v) {
                int i = d.f240310a[((vrl.v) validation).f291682b.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        return new TextLocalisedClause(R$string.trading_orders_target_price_limit_price_too_high, null, null, 14);
                    }
                    if (i == 4) {
                        return new TextLocalisedClause(R$string.trading_orders_target_price_stop_price_too_high, null, null, 14);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!(validation instanceof w)) {
                    if (Intrinsics.f(validation, x.f291686b)) {
                        return new TextLocalisedClause(R$string.trading_orders_target_price_stop_price_below_current, null, null, 14);
                    }
                    if (Intrinsics.f(validation, z.f291693b)) {
                        return new TextLocalisedClause(R$string.trading_orders_target_price_stop_price_above_current, null, null, 14);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = d.f240310a[((w) validation).f291685b.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return new TextLocalisedClause(R$string.trading_orders_target_price_limit_price_too_low, null, null, 14);
                    }
                    if (i2 == 4) {
                        return new TextLocalisedClause(R$string.trading_orders_target_price_stop_price_too_low, null, null, 14);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }
}
