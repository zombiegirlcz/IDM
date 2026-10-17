package v6f;

import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.ManagedPortfolioDetailsInvestmentsExtensionContract$InputData;
import i6f.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends u0 implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ou5.b f286382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ManagedPortfolioDetailsInvestmentsExtensionContract$InputData f286383n;
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f286384p;

    public l(ou5.b interactor, ManagedPortfolioDetailsInvestmentsExtensionContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f286382m = interactor;
        this.f286383n = inputData;
        this.o = featureToggleInteractor;
        this.f286384p = pyd.c.a(this, new e(0));
    }

    @Override // yji.n
    public final void H2() {
        ManagedPortfolioDetailsInvestmentsExtensionContract$InputData managedPortfolioDetailsInvestmentsExtensionContract$InputData = this.f286383n;
        String templateId = managedPortfolioDetailsInvestmentsExtensionContract$InputData.f91323a;
        ou5.b bVar = this.f286382m;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        qmc.h hVar = (qmc.h) bVar.f229820b;
        w4l.h hVar2 = w4l.h.f294642c;
        Continuation continuation = null;
        n.l2(this, Z2(q.q(xam.a.h(new x5f.a(bVar, continuation, 0), hVar.e(templateId, hVar2)))), null, new k(this, null, 0), 3);
        String templateId2 = managedPortfolioDetailsInvestmentsExtensionContract$InputData.f91323a;
        Intrinsics.checkNotNullParameter(templateId2, "templateId");
        n.l2(this, Z2(q.q(xam.a.h(new x5f.a(bVar, continuation, 1), hVar.e(templateId2, hVar2)))), null, new k(this, null, 1), 3);
        if (((jte.d) this.o).c(RoboApi$Toggles.RoboUkBePerformanceCalculation.f85025c)) {
            Intrinsics.checkNotNullParameter(templateId2, "templateId");
            n.l2(this, Z2(q.q(xam.a.h(new x5f.a(bVar, continuation, 2), hVar.e(templateId2, hVar2)))), null, new k(this, null, 2), 3);
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f286384p;
    }
}
