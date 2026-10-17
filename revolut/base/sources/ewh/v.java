package ewh;

import ble.c1;
import com.revolut.data.model.Data;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nyb.i0;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class v extends oki.h implements i {
    public final AutoInvestMoveScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nyb.k f130284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f130285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aa6.c f130286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sl5.h f130287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ppg.b f130288t;
    public final qmc.h u;
    public final qmc.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ybl.l f130289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f130290x;

    public v(cli.n stateMapper, AutoInvestMoveScreenContract$InputData inputData, nyb.k revPointsInteractor, i0 revPointsEligibilityInteractor, aa6.c donationsInteractor, sl5.h cryptoPocketInteractor, ppg.b vaultsInteractor, qmc.h roboPortfolioInfoProvider, qmc.d roboPortfolioBalanceProvider, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsEligibilityInteractor, "revPointsEligibilityInteractor");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(cryptoPocketInteractor, "cryptoPocketInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioBalanceProvider, "roboPortfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = inputData;
        this.f130284p = revPointsInteractor;
        this.f130285q = revPointsEligibilityInteractor;
        this.f130286r = donationsInteractor;
        this.f130287s = cryptoPocketInteractor;
        this.f130288t = vaultsInteractor;
        this.u = roboPortfolioInfoProvider;
        this.v = roboPortfolioBalanceProvider;
        this.f130289w = tradingConfigInteractor;
        this.f130290x = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow flowB;
        AutoInvestMoveScreenContract$InputData autoInvestMoveScreenContract$InputData = this.o;
        yvh.b bVar = autoInvestMoveScreenContract$InputData.f96624a;
        String str = bVar.f317178c;
        yvh.h hVar = bVar.e;
        if (str == null || hVar == null) {
            return;
        }
        Continuation continuation = null;
        switch (q.f130280a[hVar.ordinal()]) {
            case 1:
                flowB = rd0.e.b(nim.a.w(aa6.c.a(this.f130286r, false), new e2j.i(str, 22)));
                break;
            case 2:
                flowB = new v1(new etj.l(this, str, continuation, 6));
                break;
            case 3:
                flowB = new c1(new v1(new dp4.p(22, this, str, continuation)), 7);
                break;
            case 4:
                flowB = rd0.e.b(nim.a.w(this.f130284p.b(), new eul.d(27)));
                break;
            case 5:
                flowB = nim.a.v(u0.m(glc.a.a(this.u, str), this.v.b(str)), new eul.d(28));
                break;
            case 6:
            case 7:
                flowB = new go.g(new Data(null, null, false, 7, null), 2);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        yji.l.a1(this, flowB, null, null, new u(this, null, 0), 3);
        if (autoInvestMoveScreenContract$InputData.f96625b == yvh.h.WEALTH_PORTFOLIO) {
            yji.l.a1(this, rd0.e.b(nim.a.w(ybl.l.c(this.f130289w, false, 3), new eul.d(29))), null, null, new u(this, null, 1), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f130290x;
    }
}
