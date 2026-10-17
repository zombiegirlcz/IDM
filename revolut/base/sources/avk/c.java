package avk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements m1d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f10072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CfdDetailsController f10073b;

    public c(CfdDetailsController cfdDetailsController) {
        this.f10073b = cfdDetailsController;
        this.f10072a = cfdDetailsController.X;
    }

    @Override // m1d.b
    public final RowDelegate c() {
        return this.f10072a;
    }

    @Override // m1d.b
    public final Flow c1() {
        return vkm.i.f290039a;
    }

    @Override // m1d.b
    public final vkm.d d0() {
        return rd0.e.b(this.f10073b.S.f52707c);
    }

    @Override // m1d.b
    public final Flow x() {
        return vkm.i.f290039a;
    }
}
