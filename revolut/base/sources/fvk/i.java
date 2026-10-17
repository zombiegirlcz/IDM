package fvk;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements atk.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138437a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDelegate f138438b;

    public i(EtfDetailsOverviewController etfDetailsOverviewController) {
        this.f138438b = etfDetailsOverviewController.j0;
    }

    @Override // atk.f
    public final TextDelegate d() {
        switch (this.f138437a) {
        }
        return this.f138438b;
    }

    public i(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f138438b = stockDetailsOverviewController.c0;
    }
}
