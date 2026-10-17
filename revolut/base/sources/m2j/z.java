package m2j;

import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf8.k f202097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f202098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f202099c;
    public final zf8.n d;
    public final te8.v e;
    public final djb.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te8.r f202100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ppg.b f202101h;
    public final jla.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gte.a f202102j;

    public z(zf8.k juniorAccountInfoProvider, hj8.a juniorProfileInteractor, wsg.n walletInteractor, zf8.n juniorAccountStatesProvider, te8.v juniorPocketsProductInteractor, djb.n savingsInteractor, te8.r coreSavingsProductInteractor, ppg.b vaultsInteractor, jla.h productCatalogueInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsInteractor, "savingsInteractor");
        Intrinsics.checkNotNullParameter(coreSavingsProductInteractor, "coreSavingsProductInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f202097a = juniorAccountInfoProvider;
        this.f202098b = juniorProfileInteractor;
        this.f202099c = walletInteractor;
        this.d = juniorAccountStatesProvider;
        this.e = juniorPocketsProductInteractor;
        this.f = savingsInteractor;
        this.f202100g = coreSavingsProductInteractor;
        this.f202101h = vaultsInteractor;
        this.i = productCatalogueInteractor;
        this.f202102j = featureToggleInteractor;
    }

    public static String c(BalancesInteractor$InputData.RegisteredIdentity registeredIdentity) {
        if (registeredIdentity instanceof BalancesInteractor$InputData.RegisteredIdentity.Custom) {
            return ((BalancesInteractor$InputData.RegisteredIdentity.Custom) registeredIdentity).f99400a;
        }
        if (registeredIdentity instanceof BalancesInteractor$InputData.RegisteredIdentity.Selected) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final efm.r a(String str) {
        return pd.b.t(rd0.e.c(((nj8.n) this.f202098b).k(str, w4l.j.f294644c), kotlin.coroutines.g.f186406a), new w(this, str, 0));
    }

    public final efm.r b() {
        efm.r map = rd0.e.c(bla.b.b(this.i, ne8.a.f214420c.a()), kotlin.coroutines.g.f186406a).map(new m1i.j0(new m2g.c(22), 27));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
