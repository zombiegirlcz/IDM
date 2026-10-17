package g9j;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreenContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import et6.u1;
import g4b.a0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CryptoAssetDetailsScreenContract$InputData f141934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f141935n;
    public final w o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f141936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w0i.a f141937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s8j.c f141938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vh5.a f141939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ow5.b f141940t;
    public final bq6.a u;
    public final c v;

    public t(CryptoAssetDetailsScreenContract$InputData inputData, d view, w presentationModel, h mapper, w0i.a exchangeProhibitedCurrenciesChecker, s8j.c stakingBannerInteractor, vh5.a cryptoPermissionModelExtension, ow5.b cryptoIsraelExpansionChecker, bq6.a flexibleStakingBannerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(exchangeProhibitedCurrenciesChecker, "exchangeProhibitedCurrenciesChecker");
        Intrinsics.checkNotNullParameter(stakingBannerInteractor, "stakingBannerInteractor");
        Intrinsics.checkNotNullParameter(cryptoPermissionModelExtension, "cryptoPermissionModelExtension");
        Intrinsics.checkNotNullParameter(cryptoIsraelExpansionChecker, "cryptoIsraelExpansionChecker");
        Intrinsics.checkNotNullParameter(flexibleStakingBannerExtension, "flexibleStakingBannerExtension");
        this.f141934m = inputData;
        this.f141935n = view;
        this.o = presentationModel;
        this.f141936p = mapper;
        this.f141937q = exchangeProhibitedCurrenciesChecker;
        this.f141938r = stakingBannerInteractor;
        this.f141939s = cryptoPermissionModelExtension;
        this.f141940t = cryptoIsraelExpansionChecker;
        this.u = flexibleStakingBannerExtension;
        this.v = new c(0);
    }

    public static final void f3(t tVar, xi0.b bVar, xi0.b bVar2) {
        tVar.V2(new g0a.e(bVar2, tVar, bVar, (Continuation) null, 5), new yi5.b(29));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        CryptoAssetDetailsScreen cryptoAssetDetailsScreen = (CryptoAssetDetailsScreen) this.f141935n;
        Continuation continuation = null;
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.T(), new g64.c(17))), null, new r(this, continuation, 6), 3);
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.T(), new g64.c(18))), null, new r(this, continuation, 7), 3);
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.T(), new g64.c(19))), null, new r(this, continuation, 8), 3);
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.T(), new g64.c(20))), null, new r(this, continuation, 9), 3);
        int i = 0;
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.c().f53220l, new g64.c(21))), null, new r(this, continuation, i), 3);
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.c().f53220l, new g64.c(22))), null, new r(this, continuation, 1), 3);
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.f99955k0.f52791c, new g64.c(23))), null, new r(this, continuation, 2), 3);
        yji.n.l2(this, rd0.e.b(te0.w.a0(cryptoAssetDetailsScreen.f99955k0.f52791c, new g64.c(24))), null, new r(this, continuation, 3), 3);
        yji.n.l2(this, new fo6.d(rd0.e.b(cryptoAssetDetailsScreen.f99957o0.f51589c.f121375b), 29), null, new s(this, null), 3);
        yji.n.l2(this, vkm.q.J(rd0.e.b(cryptoAssetDetailsScreen.m0.d), rd0.e.b(cryptoAssetDetailsScreen.m0.e)), null, new r(this, continuation, 4), 3);
        yji.n.l2(this, new u1(rd0.e.b(cryptoAssetDetailsScreen.m0.f51654g), this, 28), null, new g1k.i(this, continuation, 22), 3);
        yji.n.l2(this, new q(rd0.e.b(((HeaderDelegate) cryptoAssetDetailsScreen.T.getValue()).f52396l.f121375b), i), null, new r(this, continuation, 5), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.v;
    }

    @Override // g9j.b
    public final vkm.d e3(xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        w wVar = this.o;
        efm.r rVarR = pd.b.r(wVar.f141948g.a(), new u(wVar, 0));
        efm.r rVarA = wVar.a(pocketCurrency);
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        akg.n nVarA = oh5.e.a(wVar.f141949h, pocketCurrency);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC = rd0.e.c(nVarA, gVar);
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        efm.r rVarR2 = pd.b.r(wVar.f141948g.a(), new g48.j(wVar, pocketCurrency, 20));
        Intrinsics.checkNotNullParameter(pocketCurrency, "currency");
        efm.r map = osg.b.g(wVar.f141945a, w4l.h.f294642c, io3.l.VESTING, null, null, null, null, null, 124).map(new v(new dv5.p(26, pocketCurrency), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        xi0.b.Companion.getClass();
        efm.r rVarJ = zi0.c.j(Boolean.valueOf(pocketCurrency.equals(xi0.b.L)));
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        efm.r rVarFlatMap = m70.a.g(rd0.e.c(wVar.d.b(pocketCurrency, w4l.i.f294643c), gVar), null, null, 3).flatMap(new g48.k(27, new j(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        efm.r map2 = te0.w.s(rVarR, rVarA, rVarC, rVarR2, map, rVarJ, rVarFlatMap, rd0.e.c(new a0(this.u.Z2(), 7), gVar), rd0.e.c(new v1(new g23.q(this, (Continuation) null, 11)), gVar)).map(new g48.k(29, new g48.j(this, pocketCurrency, 19)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return rd0.e.b(map2);
    }

    public final void g3(io3.d dVar) {
        yji.n.P2(this, new CryptoHoldingScreen(dVar), ModalDestination.Style.POPUP.f98311a, null, 2);
    }

    public final void h3(StakingProduct stakingProduct, StakingPocket stakingPocket) {
        V2(new g23.q(this, stakingProduct, stakingPocket, null, 10), new yi5.b(29));
    }

    public final void i3(StakingProduct stakingProduct) {
        io3.g gVar;
        io3.d dVar;
        StakingAvailability stakingAvailability;
        f fVar = ((c) b3()).f141907a;
        StakingPocket stakingPocket = null;
        e eVar = fVar instanceof e ? (e) fVar : null;
        if (eVar != null && (stakingAvailability = eVar.d) != null) {
            stakingPocket = stakingAvailability.f88059b;
        }
        if (stakingProduct.c()) {
            h3(stakingProduct, stakingPocket);
        } else {
            if (!stakingProduct.b() || eVar == null || (gVar = eVar.f141909a) == null || (dVar = gVar.f163163a) == null) {
                return;
            }
            g3(dVar);
        }
    }
}
