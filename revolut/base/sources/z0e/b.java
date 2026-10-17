package z0e;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import efm.d0;
import ibb.c;
import jf0.d;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import q06.k;
import sri.m;
import t9f.n;
import ue0.e;
import wp5.y;
import x8h.n0;
import yw9.j;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f318238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1e.a f318239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f318240c;

    public b(n0 stockLendingInteractor, d1e.a stockLendingNaviCommandProvider, m navigator) {
        Intrinsics.checkNotNullParameter(stockLendingInteractor, "stockLendingInteractor");
        Intrinsics.checkNotNullParameter(stockLendingNaviCommandProvider, "stockLendingNaviCommandProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f318238a = stockLendingInteractor;
        this.f318239b = stockLendingNaviCommandProvider;
        this.f318240c = navigator;
    }

    public static FeatureCommand b() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "stock-lending");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0e.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        z zVarD = m70.a.g(mo3.a.n(zi0.c.J(this.f318238a.a(TradingAccountType.Gia.f105270a))), null, new j(28), 1).switchMapCompletable(new yzc.a(15, new n(this, z, 20))).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return e.F(zVarD, Boolean.FALSE);
    }
}
