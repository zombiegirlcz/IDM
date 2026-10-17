package q97;

import com.revolut.feature.crypto.earn.assets.shared.api.navigation.EarnAssetsScreenDestination;
import com.revolut.feature.crypto.strategies.api.navigation.destinations.CryptoStrategiesDestination;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.revolut_x_promo.api.navigation.destinations.RevolutXPromoDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo5.p f243745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f243746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh5.a f243747c;
    public final ai5.b d;
    public final l93.f e;
    public final o5c.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ld5.b f243748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f243749h;
    public final sd5.c i;

    public n0(t97.c productCellProvider, lo5.p cryptoSendNaviCommandProvider, xoj.a featuresInteractor, xh5.a cryptoFeatureEnabledInteractor, ai5.b cryptoNavigationInterceptor, l93.f revolutCardsInteractor, o5c.a cryptoExchangeEligibilityInteractor, ld5.b cryptoCardsAvailabilityInteractor, gte.a featureToggleInteractor, sd5.c cryptoConfigInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cryptoExchangeEligibilityInteractor, "cryptoExchangeEligibilityInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        this.f243745a = cryptoSendNaviCommandProvider;
        this.f243746b = featuresInteractor;
        this.f243747c = cryptoFeatureEnabledInteractor;
        this.d = cryptoNavigationInterceptor;
        this.e = revolutCardsInteractor;
        this.f = cryptoExchangeEligibilityInteractor;
        this.f243748g = cryptoCardsAvailabilityInteractor;
        this.f243749h = featureToggleInteractor;
        this.i = cryptoConfigInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.CRYPTO_TAB || id10 == t97.d.CRYPTO_TRADING || id10 == t97.d.REVOLUT_X || id10 == t97.d.STABLECOINS || id10 == t97.d.CRYPTO_STRATEGIES || id10 == t97.d.STAKING || id10 == t97.d.CRYPTO_CARDS || id10 == t97.d.CRYPTO_DEPOSITS || id10 == t97.d.CRYPTO_WITHDRAWALS;
    }

    @Override // p97.c
    public final efm.r b() {
        yoj.c cVar = yoj.c.CRYPTO;
        xoj.a aVar = this.f243746b;
        efm.r map = ((cpj.b) aVar).j(cVar, w4l.h.f294642c).map(new j0(new h(12), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = ((cpj.b) aVar).j(yoj.c.STAKING, w4l.h.f294642c).map(new j0(new h(14), 7));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r map3 = ((cpj.b) aVar).j(yoj.c.CRYPTO_DEPOSITS, w4l.h.f294642c).map(new j0(new h(15), 8));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r map4 = ((cpj.b) aVar).j(yoj.c.CRYPTO_WITHDRAWALS, w4l.h.f294642c).map(new j0(new h(16), 9));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        efm.r rVarC = rd0.e.c(new n33.r0(mo3.a.g(this.f.a(), null, null, 3), 26), kotlin.coroutines.g.f186406a);
        efm.r map5 = this.f243748g.a().map(new j0(new h(17), 10));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        efm.r map6 = te0.w.p(map, map2, map3, map4, rVarC, map5).map(new j0(new h(this, 13), 5));
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        return map6;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.CRYPTO_TAB) {
            return te0.w.o0(kotlin.coroutines.g.f186406a, new l0(this, null));
        }
        if (bVar == t97.d.CRYPTO_TRADING) {
            ufm.b bVarM = efm.d0.m(new o97.l(new FeatureCommand(CryptoInvestFeatureConfig.Invest.f71500a)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (bVar == t97.d.REVOLUT_X) {
            ufm.b bVarM2 = efm.d0.m(new o97.d(RevolutXPromoDestination.f84265a));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (bVar == t97.d.STABLECOINS) {
            efm.d0 d0VarFirstOrError = m70.a.g(this.i.a(false), null, new q92.f(8), 1).firstOrError();
            j0 j0Var = new j0(new k0(this, 0), 1);
            d0VarFirstOrError.getClass();
            ufm.i iVar = new ufm.i(d0VarFirstOrError, j0Var, 1);
            xi0.b.Companion.getClass();
            ufm.i iVar2 = new ufm.i(iVar.o(xi0.b.O), new j0(new h(this, 10), 2), 1);
            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
            return iVar2;
        }
        if (bVar == t97.d.CRYPTO_STRATEGIES) {
            ufm.b bVarM3 = efm.d0.m(new o97.d(CryptoStrategiesDestination.f70999a));
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        if (bVar == t97.d.STAKING) {
            ufm.b bVarM4 = efm.d0.m(zh9.u0.f(EarnAssetsScreenDestination.f70788b));
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            ufm.i iVar3 = new ufm.i(d(bVarM4), new j0(new h(this, 8), 4), 1);
            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
            return iVar3;
        }
        if (bVar == t97.d.CRYPTO_CARDS) {
            efm.d0 d0VarFirstOrError2 = l93.f.a(this.e).firstOrError();
            j0 j0Var2 = new j0(new k0(this, 2), 12);
            d0VarFirstOrError2.getClass();
            ufm.i iVar4 = new ufm.i(d0VarFirstOrError2, j0Var2, 0);
            Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
            return iVar4;
        }
        if (bVar == t97.d.CRYPTO_DEPOSITS) {
            ufm.b bVarM5 = efm.d0.m(zh9.u0.f(new CryptoDepositDestination(new CryptoDepositInput.Overview((xi0.b) null, (com.revolut.retail.feature.crypto_deposits.api.navigation.a) null, false, (hbj.b) null, (wk5.a) null, 63))));
            Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
            ufm.i iVar5 = new ufm.i(d(bVarM5), new j0(new h(this, 9), 0), 1);
            Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
            return iVar5;
        }
        if (bVar != t97.d.CRYPTO_WITHDRAWALS) {
            throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
        }
        ufm.i iVar6 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new pwb.p(this, null, 19)), new j0(new h(18), 13), 1);
        Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
        ufm.i iVar7 = new ufm.i(d(iVar6), new j0(new h(this, 19), 14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
        return iVar7;
    }

    public final ufm.i d(efm.d0 d0Var) {
        ufm.i iVar = new ufm.i(d0Var, new j0(new k0(this, 1), 11), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
