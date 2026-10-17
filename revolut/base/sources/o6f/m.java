package o6f;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.chart.ManagedPortfolioDetailsChartContract$InputData;
import i6f.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends u0 implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ManagedPortfolioDetailsChartContract$InputData f222590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final utk.f f222591n;
    public final x5f.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qmc.h f222592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f222593q;

    public m(ManagedPortfolioDetailsChartContract$InputData inputData, utk.f chartInteractor, x5f.k referenceInteractor, qmc.h roboPortfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chartInteractor, "chartInteractor");
        Intrinsics.checkNotNullParameter(referenceInteractor, "referenceInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        this.f222590m = inputData;
        this.f222591n = chartInteractor;
        this.o = referenceInteractor;
        this.f222592p = roboPortfolioInfoProvider;
        this.f222593q = pyd.c.a(this, new a(pdh.c.FIVE_YEARS, new Data(null, null, true, 3, null), inputData.f91308b, 48));
    }

    @Override // yji.n
    public final void H2() {
        Flow flowB = this.f222593q.B(new o69.b(5));
        ManagedPortfolioDetailsChartContract$InputData managedPortfolioDetailsChartContract$InputData = this.f222590m;
        wkm.l lVarA = this.o.a(managedPortfolioDetailsChartContract$InputData.f91307a);
        Flow flowD = this.f222592p.d(managedPortfolioDetailsChartContract$InputData.f91307a, w4l.h.f294642c);
        Continuation continuation = null;
        n.l2(this, Z2(q.Q(yh5.b.e(flowB, lVarA, mo3.a.g(flowD, null, null, 3)), new ns9.h(continuation, this, 14))), null, new nwc.f(this, continuation, 26), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f222593q;
    }
}
