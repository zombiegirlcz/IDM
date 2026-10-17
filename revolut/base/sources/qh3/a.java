package qh3;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.retail.core.navigation.NaviCommand;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a extends n {
    public static /* synthetic */ void b3(a aVar, CheckoutParams checkoutParams, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, boolean z, int i) {
        if ((i & 32) != 0) {
            z = false;
        }
        aVar.Z2(checkoutParams, analyticsProduct, naviCommand, z);
    }

    public abstract void Z2(CheckoutParams checkoutParams, AnalyticsProduct analyticsProduct, NaviCommand naviCommand, boolean z);
}
