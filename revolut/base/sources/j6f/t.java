package j6f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import i6f.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends u0 implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x5f.q f171758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x5f.c f171759n;
    public final h7f.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManagedPortfolioDetailsAllocationContract$InputData f171760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1h.e f171761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f171762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f171763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vki.a f171764t;

    public t(x5f.q managedPortfoliosInteractor, x5f.c statusInteractor, h7f.f statusDialogProvider, ManagedPortfolioDetailsAllocationContract$InputData inputData, d1h.e remoteDisclaimersExtension) {
        Intrinsics.checkNotNullParameter(managedPortfoliosInteractor, "managedPortfoliosInteractor");
        Intrinsics.checkNotNullParameter(statusInteractor, "statusInteractor");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(remoteDisclaimersExtension, "remoteDisclaimersExtension");
        this.f171758m = managedPortfoliosInteractor;
        this.f171759n = statusInteractor;
        this.o = statusDialogProvider;
        this.f171760p = inputData;
        this.f171761q = remoteDisclaimersExtension;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.f171762r = vkm.q.b(1, 1, fVar);
        this.f171763s = vkm.q.b(1, 1, fVar);
        this.f171764t = pyd.c.a(this, new a(0));
    }

    @Override // yji.n
    public final void H2() {
        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = this.f171760p;
        Continuation continuation = null;
        yji.n.l2(this, Z2(this.f171758m.b(managedPortfolioDetailsAllocationContract$InputData.f91284a, managedPortfolioDetailsAllocationContract$InputData.f91285b)), null, new s(this, continuation, 0), 3);
        yji.n.l2(this, ((gah.e) this.f171761q).Z2(u.c(rdh.b.STRATEGIES_ALLOCATION_WIDGET_DISCLAIMER)), null, new s(this, continuation, 1), 3);
        String templateId = managedPortfolioDetailsAllocationContract$InputData.f91284a;
        x5f.c cVar = this.f171759n;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        yji.n.l2(this, vkm.q.q(vkm.q.Q(cVar.f302949a.e(templateId, w4l.h.f294642c), new x18.e(continuation, cVar, 2))), null, new s(this, continuation, 2), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f171764t;
    }
}
