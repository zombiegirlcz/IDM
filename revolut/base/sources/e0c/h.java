package e0c;

import com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles;
import com.revolut.feature.store.api.navigation.StoreDestination;
import com.revolut.feature.store.api.navigation.StoreTab;
import h30.q;
import kotlin.jvm.internal.Intrinsics;
import t1e.s;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends c0c.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b6c.c f121555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f121556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f121557n;

    public h(b6c.c revolutPayInfoInteractor, q storeAvailabilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(revolutPayInfoInteractor, "revolutPayInfoInteractor");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f121555l = revolutPayInfoInteractor;
        this.f121556m = storeAvailabilityInteractor;
        this.f121557n = featureToggleInteractor;
    }

    @Override // c0c.d
    public final void Z2(c0c.c clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (this.f121556m.F0()) {
            if (((jte.d) this.f121557n).c(RevolutPayApi$Toggles.RevolutPayPromotedMerchantsMigration.f84297c)) {
                A2(new StoreDestination(new StoreDestination.StartType.OpenStoreHome(StoreTab.Brands.f88622a, s.REVPAY.c()), 2));
                return;
            }
        }
        T2(new g(this, null), new yi5.b(27));
    }
}
