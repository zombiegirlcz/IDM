package x6h;

import ael.i0;
import cfl.p;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;
import ybl.j;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends y5h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zq.a f303100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j6h.c f303101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y5h.d f303102n;
    public final vki.a o;

    public d(zq.a wealthMarginAvailabilityInteractor, j6h.c giaMarginCommandProvider, y5h.d inputData) {
        Intrinsics.checkNotNullParameter(wealthMarginAvailabilityInteractor, "wealthMarginAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(giaMarginCommandProvider, "giaMarginCommandProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f303100l = wealthMarginAvailabilityInteractor;
        this.f303101m = giaMarginCommandProvider;
        this.f303102n = inputData;
        this.o = pyd.c.a(this, new y5h.c(null));
    }

    @Override // yji.n
    public final void H2() {
        String portfolioId = this.f303102n.f311089a;
        zq.a aVar = this.f303100l;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        n.l2(this, com.revolut.data.database.models.openbanking.d.x("GiaMarginOnboardingWidgetControllerModelExtension", "observeGiaMarginProductOnboardingAvailable", nim.a.v(((i0) ((j) aVar.f324335b)).a(p.MARGIN_TRADING, portfolioId), new h56.a(aVar, 2))), null, new x64.b(this, null, 3), 3);
    }

    @Override // y5h.b
    public final void Z2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.u instanceof e) {
            V2(new c(this, null), new yi5.b(29));
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
