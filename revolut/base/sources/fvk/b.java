package fvk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements m1d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f138428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EtfDetailsOverviewController f138429b;

    public b(EtfDetailsOverviewController etfDetailsOverviewController) {
        this.f138429b = etfDetailsOverviewController;
        this.f138428a = etfDetailsOverviewController.f103935e0;
    }

    @Override // m1d.b
    public final RowDelegate c() {
        return this.f138428a;
    }

    @Override // m1d.b
    public final Flow c1() {
        return rd0.e.b(this.f138429b.W.d.f121375b);
    }

    @Override // m1d.b
    public final vkm.d d0() {
        return rd0.e.b(this.f138429b.Y.f52707c);
    }

    @Override // m1d.b
    public final Flow x() {
        return vkm.i.f290039a;
    }
}
