package xyh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_crypto_order_flow.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.n {
    public static AccountCellItemDelegate.Model a(String str, int i, int i2, int i3, boolean z) {
        return new AccountCellItemDelegate.Model(str, z, (Image) LayeredImage.Companion.b(LayeredImage.INSTANCE, i3, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 12.0f, Float.valueOf(40.0f), null, 32), (Clause) new TextLocalisedClause(i, null, null, 14), (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) new TextLocalisedClause(i2, null, null, 14), (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) null, (Parcelable) null, 130992);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        AccountCellItemDelegate.Model modelA;
        AccountCellItemDelegate.Model modelA2;
        boolean z;
        AccountCellItemDelegate.Model model;
        AccountCellItemDelegate.Model model2;
        AccountCellItemDelegate.Model modelA3;
        AccountCellItemDelegate.Model modelA4;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wd6.h hVar = domainState.f309725a;
        boolean z3 = domainState.f309726b;
        boolean z4 = domainState.f309727c;
        boolean z6 = domainState.d;
        boolean z11 = domainState.e;
        boolean z12 = domainState.f;
        boolean z29 = domainState.f309728g;
        CellDetailsSwitcherDelegate.Model model3 = null;
        if (z29) {
            modelA = a("STOP_ORDER_DIALOG_ITEM_ID", R$string.cryptobuysell_orders_stop_order, z4 ? R$string.cryptobuysell_orders_stop_order_description_buy : R$string.cryptobuysell_orders_stop_order_description_sell, z4 ? R$drawable.uikit_icn_24_order_upwards : R$drawable.uikit_icn_24_order_downwards, hVar == wd6.h.STOP);
        } else {
            modelA = null;
        }
        if (z29) {
            modelA2 = a("LIMIT_ORDER_DIALOG_ITEM_ID", R$string.cryptobuysell_orders_limit_order, z4 ? R$string.cryptobuysell_orders_limit_order_description_buy : R$string.cryptobuysell_orders_limit_order_description_sell, z4 ? R$drawable.uikit_icn_24_order_downwards : R$drawable.uikit_icn_24_order_upwards, hVar == wd6.h.LIMIT);
        } else {
            modelA2 = null;
        }
        if (z4) {
            model = null;
            z = z3;
            model2 = modelA;
            model3 = new CellDetailsSwitcherDelegate.Model("BUY_TAKE_PROFIT_STOP_LOSS_ITEM_ID", new TextLocalisedClause(R$string.cryptobuysell_orders_tpsl_buy, null, null, 14), z12, z11, R$drawable.uikit_icn_16_info_outline, "TPSLSwitcher", null, null, 4032);
        } else {
            z = z3;
            model = null;
            model2 = modelA;
        }
        AccountCellItemDelegate.Model modelA5 = a("MARKET_ORDER_DIALOG_ITEM_ID", R$string.cryptobuysell_orders_market_order, R$string.cryptobuysell_orders_market_order_description, R$drawable.uikit_icn_24_market_order, hVar == wd6.h.MARKET);
        if (z6 || hVar == wd6.h.RECURRING) {
            modelA3 = a("RECURRING_ORDER_DIALOG_ITEM_ID", R$string.cryptobuysell_orders_recurring_buy, R$string.cryptobuysell_orders_recurring_buy_description, R$drawable.uikit_icn_24_calendar_recurring, hVar == wd6.h.RECURRING);
        } else {
            modelA3 = model;
        }
        if (!z || z4) {
            modelA4 = model;
        } else {
            modelA4 = a("TAKE_PROFIT_STOP_LOSS_ITEM_ID", R$string.cryptobuysell_orders_tpsl_buy, R$string.cryptobuysell_orders_tpsl_description, R$drawable.uikit_icn_24_credit, hVar == wd6.h.TAKE_PROFIT_STOP_LOSS);
        }
        AccountCellItemDelegate.Model[] elements = {modelA5, modelA3, modelA2, model2, modelA4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        List listL2 = v.l(model3);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        return new f(d0.E0(listL2, listL));
    }
}
