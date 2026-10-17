package mwk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements m1d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f209490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockDetailsOverviewController f209491b;

    public b(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f209491b = stockDetailsOverviewController;
        this.f209490a = stockDetailsOverviewController.V;
    }

    @Override // m1d.b
    public final RowDelegate c() {
        return this.f209490a;
    }

    @Override // m1d.b
    public final Flow c1() {
        return rd0.e.b(this.f209491b.X.d.f121375b);
    }

    @Override // m1d.b
    public final vkm.d d0() {
        return rd0.e.b(this.f209491b.S.f52707c);
    }

    @Override // m1d.b
    public final Flow x() {
        return vkm.i.f290039a;
    }
}
