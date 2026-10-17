package icc;

import com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles;
import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$Store;
import com.revolut.feature.store.api.navigation.StoreDestination;
import com.revolut.feature.store.api.navigation.StoreTab;
import efm.d0;
import i9g.e0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.h;
import skm.p0;
import sri.m;
import t1e.s;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements acc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f160242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f160243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eub.a f160244c;

    public e(m navigator, gte.a featureToggleInteractor, eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f160242a = navigator;
        this.f160243b = featureToggleInteractor;
        this.f160244c = revPointsAvailabilityInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return Intrinsics.f(deeplink.e(1) + "/" + deeplink.e(2), "revolut-pay/featured-merchants");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        StoreApi$Toggles$Store storeApi$Toggles$Store = StoreApi$Toggles$Store.f88419c;
        gte.a aVar = this.f160243b;
        if (((jte.d) aVar).c(storeApi$Toggles$Store) && ((nyb.b) this.f160244c).f()) {
            if (((jte.d) aVar).c(RevolutPayApi$Toggles.RevolutPayPromotedMerchantsMigration.f84297c)) {
                return new h(new StoreDestination(new StoreDestination.StartType.OpenStoreHome(StoreTab.Brands.f88622a, s.REVPAY.c()), 2), null);
            }
        }
        return new h(new PromotedMerchantsDestination(new PromotedMerchantsDestination.InputData(true, true, true, Boolean.parseBoolean((String) cVar.d.get("show_rev_points_opt_in")))), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(w.o0(p0.f264003c, new d(this, deeplink, null)), new c(new e0(21), 0), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
