package a7f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$InputData;
import i6f.u0;
import jlc.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends u0 implements vki.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qmc.h f1868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ManagedPortfolioDetailsControllerContract$InputData f1869n;
    public final tpc.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rul.e f1870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f1871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vki.a f1872r;

    public k(qmc.h portfolioInfoProvider, ManagedPortfolioDetailsControllerContract$InputData inputData, tpc.i recurringDepositWidgetProvider, rul.e spareChangeWidgetProvider, x recurringDepositWidgetParcelHandler) {
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringDepositWidgetProvider, "recurringDepositWidgetProvider");
        Intrinsics.checkNotNullParameter(spareChangeWidgetProvider, "spareChangeWidgetProvider");
        Intrinsics.checkNotNullParameter(recurringDepositWidgetParcelHandler, "recurringDepositWidgetParcelHandler");
        this.f1868m = portfolioInfoProvider;
        this.f1869n = inputData;
        this.o = recurringDepositWidgetProvider;
        this.f1870p = spareChangeWidgetProvider;
        this.f1871q = recurringDepositWidgetParcelHandler;
        this.f1872r = pyd.c.a(this, new c(null, null));
    }

    @Override // yji.n
    public final void H2() {
        ManagedPortfolioDetailsControllerContract$InputData managedPortfolioDetailsControllerContract$InputData = this.f1869n;
        String str = managedPortfolioDetailsControllerContract$InputData.f91277a;
        qmc.h hVar = this.f1868m;
        w4l.h hVar2 = w4l.h.f294642c;
        final int i = 0;
        n.l2(this, Z2(boh.f.e(q.q(nim.a.v(hVar.e(str, hVar2), new a5g.h(15))), new Function1(this) { // from class: a7f.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1866b;

            {
                this.f1866b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return this.f1866b.o.a(portfolioId);
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return this.f1866b.f1870p.k(portfolioId);
                }
            }
        })), null, new j(this, null, 0), 3);
        Flow flowQ = q.q(nim.a.v(hVar.e(managedPortfolioDetailsControllerContract$InputData.f91277a, hVar2), new a5g.h(16)));
        final int i2 = 1;
        n.l2(this, Z2(boh.f.e(flowQ, new Function1(this) { // from class: a7f.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f1866b;

            {
                this.f1866b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return this.f1866b.o.a(portfolioId);
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return this.f1866b.f1870p.k(portfolioId);
                }
            }
        })), null, new j(this, null, 1), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f1872r;
    }
}
