package r6f;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.fees.ManagedPortfolioDetailsFeesExtensionContract$InputData;
import i6f.u0;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends u0 implements d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qmc.b f251835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final emc.e f251836n;
    public final ManagedPortfolioDetailsFeesExtensionContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f251837p;

    public l(qmc.b productInteractor, emc.e templatesInteractor, ManagedPortfolioDetailsFeesExtensionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(productInteractor, "productInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f251835m = productInteractor;
        this.f251836n = templatesInteractor;
        this.o = inputData;
        this.f251837p = pyd.c.a(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, Z2(this.f251835m.b(false)), null, new k(this, null), 3);
        n.l2(this, Z2(this.f251836n.d(this.o.f91310a)), null, new r5e.e(this, null, 4), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f251837p;
    }
}
