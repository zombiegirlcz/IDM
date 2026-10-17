package r8f;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.target_allocations.TargetAllocationsController;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements j6f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate f252422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FixedTabsDelegate f252423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextDelegate f252424c;
    public final /* synthetic */ TargetAllocationsController d;

    public b(TargetAllocationsController targetAllocationsController) {
        this.d = targetAllocationsController;
        this.f252422a = targetAllocationsController.P;
        this.f252423b = targetAllocationsController.S;
        this.f252424c = targetAllocationsController.T;
    }

    @Override // j6f.d
    public final TextDelegate A() {
        return this.f252424c;
    }

    @Override // i6f.w0
    public final vkm.d L0() {
        return rd0.e.b(this.d.R.f52371h.f121375b);
    }

    @Override // j6f.d
    public final RowDelegate c() {
        return this.f252422a;
    }

    @Override // j6f.d
    public final FixedTabsDelegate p() {
        return this.f252423b;
    }
}
