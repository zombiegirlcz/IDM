package yd9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f312661a;

    public g(e ordersMapper) {
        Intrinsics.checkNotNullParameter(ordersMapper, "ordersMapper");
        this.f312661a = ordersMapper;
    }

    public static LargeActionButtonDelegate.Model c(OrdersWidgetContract$Config ordersWidgetContract$Config, int i) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ORDERS_SEE_ALL_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), false, null, null, new wd9.e(ordersWidgetContract$Config), null, 744);
        int i2 = ordersWidgetContract$Config.f78610c;
        if (i2 == -1 || i <= i2) {
            return null;
        }
        return model;
    }

    public final qv0.i a(wd9.c order) {
        Intrinsics.checkNotNullParameter(order, "order");
        boolean z = order instanceof wd9.a;
        e eVar = this.f312661a;
        if (z) {
            ExchangeOrder.Active order2 = ((wd9.a) order).f296466a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(order2, "order");
            Intrinsics.checkNotNullParameter("ORDERS_WIDGET_", "listIdPrefix");
            return eVar.f312659a.a(order2, "ORDERS_WIDGET_");
        }
        if (!(order instanceof wd9.b)) {
            throw new NoWhenBranchMatchedException();
        }
        p order3 = ((wd9.b) order).f296467a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(order3, "order");
        Intrinsics.checkNotNullParameter("ORDERS_WIDGET_", "listIdPrefix");
        return eVar.f312660b.b(order3, "ORDERS_WIDGET_");
    }

    public final ListSubheaderDelegate.Model b(OrdersWidgetContract$Config ordersWidgetContract$Config, int i) {
        OrdersWidgetContract$Config.Style style = ordersWidgetContract$Config.f78609b;
        int i2 = ordersWidgetContract$Config.f78610c;
        boolean z = i2 != -1 && i > i2 && (style instanceof OrdersWidgetContract$Config.Style.HeaderUnboxed) && !((OrdersWidgetContract$Config.Style.HeaderUnboxed) style).f78612a;
        return new ListSubheaderDelegate.Model("LIST_ID_ORDERS", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_trading_orders_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.wealth_view_all, null, null, 14) : null), z, (Object) new wd9.e(ordersWidgetContract$Config), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
    }
}
