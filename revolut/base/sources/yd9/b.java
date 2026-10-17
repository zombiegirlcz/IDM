package yd9;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import hx7.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public final qv0.i a(ExchangeOrder.Active order, String listIdPrefix) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        return b(order, listIdPrefix, true, false, order);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qv0.i b(ExchangeOrder.Active order, String listIdPrefix, boolean z, boolean z3, Object obj2) {
        LayeredImage layeredImageF;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        ExchangeOrderInfo exchangeOrderInfo = order.f72129a;
        ExchangeOrderInfo exchangeOrderInfo2 = order.f72129a;
        String strR = a0.d.r(listIdPrefix, exchangeOrderInfo.f72137a);
        TextLocalisedClause textLocalisedClauseC = d.c(order);
        CompositeClause compositeClauseB = d.b(order);
        dj0.d dVarK = (!Intrinsics.f(order.getF72134a().f72140g.f115083b, order.getF72134a().e) || q.P(order)) ? exchangeOrderInfo2.f72140g : pyd.c.K(exchangeOrderInfo2.f72140g, exchangeOrderInfo2.f72141h, exchangeOrderInfo2.f);
        wd6.e eVar = exchangeOrderInfo2.d;
        wd6.e eVar2 = wd6.e.BUY;
        if (eVar == eVar2 || q.P(order)) {
            dVarK = dVarK.l();
        }
        RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(dVarK, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.SENSITIVE, 4), null, null, false, 126);
        CurrencyImage currencyImage = new CurrencyImage(exchangeOrderInfo2.e.f306286a, (ImageTransformations) null, (TextLocalisedClause) (0 == true ? 1 : 0), 14);
        Intrinsics.checkNotNullParameter(order, "order");
        xi0.b bVar2 = exchangeOrderInfo2.e;
        wd6.h hVar = exchangeOrderInfo2.f72139c;
        wd6.e eVar3 = exchangeOrderInfo2.d;
        if (cp5.d.z(bVar2)) {
            if (q.P(order)) {
                i2 = R$drawable.uikit_icn_24_credit;
            } else {
                int i3 = a.f312655a[hVar.ordinal()];
                i2 = i3 != 1 ? i3 != 2 ? R$drawable.uikit_icn_16_arrow_recurring : eVar3 == eVar2 ? R$drawable.uikit_icn_24_order_upwards : R$drawable.uikit_icn_24_order_downwards : eVar3 == wd6.e.SELL ? R$drawable.uikit_icn_24_order_upwards : R$drawable.uikit_icn_24_order_downwards;
            }
            layeredImageF = LayeredImage.Companion.f(LayeredImage.INSTANCE, i2, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorBackground, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), 2.0f, 2.0f, null, 64);
        } else if (z3) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i5 = a.f312655a[hVar.ordinal()];
            if (i5 == 1) {
                int i6 = a.f312656b[eVar3.ordinal()];
                if (i6 == 1) {
                    i = R$drawable.uikit_icn_24_order_downwards;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_order_upwards;
                }
            } else if (i5 != 2) {
                i = i5 != 3 ? R$drawable.uikit_icn_16_status_clock_arrows : R$drawable.uikit_icn_16_arrow_recurring;
            } else {
                int i21 = a.f312656b[eVar3.ordinal()];
                if (i21 == 1) {
                    i = R$drawable.uikit_icn_24_order_upwards;
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_order_downwards;
                }
            }
            int i22 = i;
            int i32 = R$attr.uikit_colorAccentNeutral;
            int i33 = R$attr.uikit_colorPopoverBackground;
            layeredImageF = companion.d(i22, i32, i33, Integer.valueOf(i33), 2.0f, 2.0f, Float.valueOf(12.0f));
        } else {
            layeredImageF = LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_status_clock_arrows, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorWhite, null, 2.0f, 2.0f, null, 72);
        }
        RowDelegate.Model modelX = RowDelegate.Model.x(new RowDelegate.Model(strR, currencyImage, null, null, textLocalisedClauseC, compositeClauseB, null, null, 0, bVar, true, false, layeredImageF, null, null, null, null, obj2, null, 0, 0, 0, 0, 1056941932), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, new py0.a(j6.a.q("Transaction_id_", exchangeOrderInfo2.f72137a)), -1, 13);
        return z ? (wh) w.y0(new r5.c(listIdPrefix, order, modelX, obj2, 11)).getValue() : modelX;
    }
}
