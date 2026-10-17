package fvk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements q2h.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f138430a;

    public d(EtfDetailsOverviewController etfDetailsOverviewController) {
        this.f138430a = etfDetailsOverviewController.f103935e0;
    }

    @Override // q2h.k
    public RowDelegate c() {
        return this.f138430a;
    }

    public d(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f138430a = stockDetailsOverviewController.V;
    }
}
