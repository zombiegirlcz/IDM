package xx5;

import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tv5.a;
import vx5.e;
import xv5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f309402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv5.b f309403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.b f309404c;
    public final tj3.a d;

    public c(a state, tv5.b currencyDiscoveryInteractor, t70.b currenciesLocalization, tj3.a commodityFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        this.f309402a = state;
        this.f309403b = currencyDiscoveryInteractor;
        this.f309404c = currenciesLocalization;
        this.d = commodityFeatureEnabledInteractor;
    }

    public final r a(zx5.a currencyMode) {
        tv5.a aVar;
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        int i = b.f309401a[currencyMode.ordinal()];
        if (i == 1) {
            aVar = a.b.f274717a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = a.C1526a.f274716a;
        }
        return ((h) this.f309403b).a(aVar);
    }
}
