package u6i;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_move_money.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {
    public static AccountCellItemDelegate.Model a(String str, int i, int i2, int i3, boolean z) {
        return new AccountCellItemDelegate.Model(str, z, (Image) LayeredImage.Companion.b(LayeredImage.INSTANCE, i3, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(40.0f), null, 32), (Clause) new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) new TextLocalisedClause(i2, null, null, 14), (RowDelegate.Model.c) null, (CircleIconBadge) (z ? new WhiteCircleBadge(dw0.a.Checked) : null), (Object) null, (AnalyticsContext) null, 130480);
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.move_money_order_options_title, null, null, 14), null, null, null, false, 30);
        c cVar = domainState.f277602a;
        b bVar = domainState.f277603b;
        aim.e eVarB = u.b();
        eVarB.add(a("MARKET_ORDER_CELL_LIST_ID", R$string.move_money_order_options_market_title, R$string.move_money_order_options_market_subtitle, R$drawable.uikit_icn_24_market_order, cVar == c.MARKET_ORDER));
        eVarB.add(a("SCHEDULE_CELL_LIST_ID", R$string.move_money_action_schedule, R$string.fx_orders_scheduled_buy_description, R$drawable.uikit_icn_24_calendar_recurring, cVar == c.SCHEDULING));
        int i = f.f277605a[bVar.ordinal()];
        if (i == 1) {
            eVarB.add(a("LIMIT_ORDER_CELL_LIST_ID", R$string.move_money_order_options_limit_title, R$string.move_money_order_options_limit_buy, R$drawable.uikit_icn_24_order_downwards, cVar == c.LIMIT_ORDER));
            eVarB.add(a("STOP_ORDER_CELL_LIST_ID", R$string.move_money_order_options_stop_title, R$string.move_money_order_options_stop_buy, R$drawable.uikit_icn_24_order_upwards, cVar == c.STOP_ORDER));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eVarB.add(a("LIMIT_ORDER_CELL_LIST_ID", R$string.move_money_order_options_limit_title, R$string.move_money_order_options_limit_sell, R$drawable.uikit_icn_24_order_upwards, cVar == c.LIMIT_ORDER));
            eVarB.add(a("STOP_ORDER_CELL_LIST_ID", R$string.move_money_order_options_stop_title, R$string.move_money_order_options_stop_sell, R$drawable.uikit_icn_24_order_downwards, cVar == c.STOP_ORDER));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new cii.b(null, eVarA, aVar);
    }
}
