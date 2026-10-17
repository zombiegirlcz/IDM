package g7f;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$InputData;
import i6f.u0;
import kotlin.jvm.internal.Intrinsics;
import x5f.k;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends u0 implements vki.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f141200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ManagedPortfolioDetailsControllerContract$InputData f141201n;
    public final vki.a o;

    public h(k referenceInteractor, ManagedPortfolioDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(referenceInteractor, "referenceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f141200m = referenceInteractor;
        this.f141201n = inputData;
        this.o = pyd.c.a(this, new c(new Data(null, null, true, 3, null)));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, Z2(this.f141200m.a(this.f141201n.f91277a)), null, new g06.k(this, null, 25), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
