package x8h;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 implements tzg.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f303394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj3.a f303395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.k f303396c;
    public final ybl.l d;

    public v0(xoj.a featuresInteractor, tj3.a commoditiesFeatureEnabledInteractor, ybl.k tradingAccountsInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(commoditiesFeatureEnabledInteractor, "commoditiesFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f303394a = featuresInteractor;
        this.f303395b = commoditiesFeatureEnabledInteractor;
        this.f303396c = tradingAccountsInteractor;
        this.d = tradingConfigInteractor;
    }

    public final akg.n e(w4l.k loadingStrategy, cfl.n accountHolderTypeFilter) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountHolderTypeFilter, "accountHolderTypeFilter");
        return nim.a.v(zh9.u0.m(boh.f.e(rd0.e.b(((cpj.b) this.f303394a).f107969a.b(false)), new wtl.f(this, 14, loadingStrategy, accountHolderTypeFilter)), f()), new h(this, 25));
    }

    public final vkm.d f() {
        return rd0.e.b(zi0.c.G(nim.a.w(((zj3.a) this.f303395b).b(), new h(this, 26)), new WealthAccount.Commodities(xzg.o0.UNAVAILABLE)));
    }
}
