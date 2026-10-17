package t6f;

import a83.o0;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$InputData;
import i6f.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q0;
import vkm.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends u0 implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qmc.b f268338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final emc.e f268339n;
    public final t1j.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManagedPortfolioDetailsAboutInfoExtensionContract$InputData f268340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f268341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vki.a f268342r;

    public o(qmc.b productInteractor, emc.e templatesInteractor, t1j.b investorUpdateInteractor, ManagedPortfolioDetailsAboutInfoExtensionContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(productInteractor, "productInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(investorUpdateInteractor, "investorUpdateInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f268338m = productInteractor;
        this.f268339n = templatesInteractor;
        this.o = investorUpdateInteractor;
        this.f268340p = inputData;
        this.f268341q = featureToggleInteractor;
        this.f268342r = pyd.c.a(this, new h(new Data(null, null, true, 3, null), 2));
    }

    @Override // yji.n
    public final void H2() {
        ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData = this.f268340p;
        Continuation continuation = null;
        int i = 3;
        yji.n.l2(this, Z2(new t0(this.f268339n.a(managedPortfolioDetailsAboutInfoExtensionContract$InputData.f91319a), 1)), null, new n(this, continuation, 1), 3);
        if (this.f268341q.a(ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow.f91227c)) {
            return;
        }
        q0 q0VarA = this.f268338m.a();
        String str = managedPortfolioDetailsAboutInfoExtensionContract$InputData.f91319a;
        kgm.i iVar = (kgm.i) this.o.f267380b;
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.n.l2(this, Z2(new t38.e(q0VarA, 24, ((x4l.c) iVar.f184024c).b(new p5f.f(str), loadingStrategy), new o0(i, 18, continuation))), null, new n(this, continuation, 0), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f268342r;
    }
}
