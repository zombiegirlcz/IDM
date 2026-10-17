package b7f;

import an9.i;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$InputData;
import i6f.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends t0 {
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ManagedPortfolioPerformanceExtensionContract$InputData f13034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f view, ManagedPortfolioPerformanceExtensionContract$InputData inputData, h model) {
        super(view, model, "ManagedPortfolioPerformanceExtensionContract");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f = view;
        this.f13034g = inputData;
    }

    @Override // i6f.t0, yji.d
    public final void M() {
        super.M();
        yji.d.H(this, new i(rd0.e.b(this.f.q().f53336c.f121375b), 21), new az.i(this, null, 14), 3);
    }
}
