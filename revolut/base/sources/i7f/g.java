package i7f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$InputData;
import i6f.u0;
import i6j.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qmc.h;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends u0 implements a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f159285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1h.b f159286n;
    public final bbh.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManagedPortfolioDetailsControllerContract$InputData f159287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f159288q;

    public g(h portfolioInfoProvider, h1h.b transactionsWidgetControllerModelExtension, bbh.c transactionsListDisclaimersResolver, ManagedPortfolioDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionsListDisclaimersResolver, "transactionsListDisclaimersResolver");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f159285m = portfolioInfoProvider;
        this.f159286n = transactionsWidgetControllerModelExtension;
        this.o = transactionsListDisclaimersResolver;
        this.f159287p = inputData;
        this.f159288q = pyd.c.a(this, new b(null));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, this.f159286n.d3(Z2(c6d.b.i(q.q(nim.a.v(this.f159285m.e(this.f159287p.f91277a, w4l.h.f294642c), new p(5))), new i30.a(this, 26))), false), null, new i13.d(this, (Continuation) null, 21), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f159288q;
    }
}
