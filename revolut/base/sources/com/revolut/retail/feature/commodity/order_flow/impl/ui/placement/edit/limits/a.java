package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import dj0.d;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f99870a;

    public a(l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f99870a = amountConverter;
    }

    public static dii.a a(int i, int i2, d dVar) {
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(R$string.fx_orders_fee_alert_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, u.c(new MoneyClause(dVar, new MoneyClause.Format.Asset(0), null, null, 12)), null, 12), null, null, false, 28);
        k9 value = k9.Commodities;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new dii.a(aVar, eVar, new AnalyticsProduct.Retail(value), null, null, 24);
    }
}
