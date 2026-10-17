package mwk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import z0h.s1;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallActionButtonDelegate f209495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate f209496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StockDetailsOverviewController f209497c;

    public g(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f209497c = stockDetailsOverviewController;
        this.f209495a = stockDetailsOverviewController.f104048b0;
        this.f209496b = stockDetailsOverviewController.f104050e0;
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.f209497c.c0.d);
    }
}
