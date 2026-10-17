package com.revolut.feature.staking.impl.confirmation;

import ang.f;
import be5.e;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.staking.api.R$string;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$ModalStep;
import com.revolut.feature.staking.impl.warmup.WarmupBottomSheetProvider$WarmupGotItParcel;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import cwd.b;
import hu1.h0;
import hud.m;
import hud.o;
import ip0.v7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mre.c;
import od0.i;
import oki.h;
import rp0.t;
import tga.k;
import u2i.d;
import vkm.q;
import vkm.t0;
import wsg.n;
import yji.l;
import yud.g;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements hud.h {
    public final k A;
    public final b B;
    public final e C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final StakingConfirmationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f88115p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.b f88116q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f88117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final exd.a f88118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sud.b f88119t;
    public final f u;
    public final rud.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f88120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f88121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sh5.d f88122y;
    public final j60.a z;

    public a(StakingConfirmationControllerContract$InputData inputData, i90.b uuidUtils, cli.n stateMapper, g stakingInteractor, o7.b orderQuoteInteractor, n walletInteractor, exd.a warmupBottomSheetProvider, sud.b earnRateBottomSheetResolver, f userInteractor, rud.a statusDialogModelProvider, d cryptoOrderPriceDialogFactory, c termsNavigationFactory, sh5.d cryptoFcaDisclaimerWidget, j60.a bottomExpandableDialogControllerExtension, k upgradeEntryPointItemProvider, b stakingScreenRepository, e cryptoConvertFooterDisclaimerDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(warmupBottomSheetProvider, "warmupBottomSheetProvider");
        Intrinsics.checkNotNullParameter(earnRateBottomSheetResolver, "earnRateBottomSheetResolver");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(statusDialogModelProvider, "statusDialogModelProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(stakingScreenRepository, "stakingScreenRepository");
        Intrinsics.checkNotNullParameter(cryptoConvertFooterDisclaimerDelegate, "cryptoConvertFooterDisclaimerDelegate");
        this.o = inputData;
        this.f88115p = stakingInteractor;
        this.f88116q = orderQuoteInteractor;
        this.f88117r = walletInteractor;
        this.f88118s = warmupBottomSheetProvider;
        this.f88119t = earnRateBottomSheetResolver;
        this.u = userInteractor;
        this.v = statusDialogModelProvider;
        this.f88120w = cryptoOrderPriceDialogFactory;
        this.f88121x = termsNavigationFactory;
        this.f88122y = cryptoFcaDisclaimerWidget;
        this.z = bottomExpandableDialogControllerExtension;
        this.A = upgradeEntryPointItemProvider;
        this.B = stakingScreenRepository;
        this.C = cryptoConvertFooterDisclaimerDelegate;
        String strU = wp5.y.u(uuidUtils, "toString(...)");
        dj0.d dVar = inputData.f88106a;
        StakingPocket stakingPocket = inputData.f88108c;
        StakingProduct stakingProduct = inputData.d;
        f0 f0Var = f0.f322471a;
        i.Companion.getClass();
        this.D = mra.d.b(this, new hud.i(strU, dVar, null, null, stakingPocket, stakingProduct, null, null, null, f0Var, zi0.c.P(i.f224256b, false, null, 3)), stateMapper, null, false, 12);
        this.E = hx7.e.a(this, new hfb.d(this, 25));
    }

    public final void I2(Object parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof StakingConfirmationControllerContract$Parcel$Fee) {
            StakingConfirmationControllerContract$Parcel$Fee stakingConfirmationControllerContract$Parcel$Fee = (StakingConfirmationControllerContract$Parcel$Fee) parcel;
            C1(new BridgeDestination(new FeatureCommand(new FeeBreakdownFeatureConfig(stakingConfirmationControllerContract$Parcel$Fee.f88110a, stakingConfirmationControllerContract$Parcel$Fee.f88111b, c4i.a.EXCHANGE, (AnalyticsProduct.Retail) null, false, (xi0.b) null, false, false, 2024))));
            return;
        }
        boolean z = parcel instanceof TiersRateItemMapper$Parcel;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            l.j2(this, this.f88119t.a((TiersRateItemMapper$Parcel) parcel), bottom_dialog, null, 2);
            return;
        }
        boolean z3 = parcel instanceof StakingConfirmationControllerContract$Parcel$Warmup;
        j60.a aVar = this.z;
        if (z3) {
            int i = ((StakingConfirmationControllerContract$Parcel$Warmup) parcel).f88114a;
            ((exd.b) this.f88118s).getClass();
            t tVar = new t(new TextLocalisedClause(R$string.crypto_staking_review_screen_warm_up_period, null, null, 14), new TextLocalisedClause(R$string.crypto_staking_review_screen_warm_up_period_dialog_description, u.c(Integer.valueOf(i)), null, 12), null, 28);
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BUTTON_LIST_ITEM", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.crypto_staking_review_screen_dialog_got_it, null, null, 14), false, null, null, WarmupBottomSheetProvider$WarmupGotItParcel.f88170a, null, 744);
            int i2 = R$attr.uikit_dp16;
            int i3 = R$attr.uikit_dp24;
            yp0.b.p(model, i3, i3, i2, i2);
            aVar.x(new rp0.y(u.c(model), tVar, null, null, null, null, 1020));
            return;
        }
        if (parcel instanceof StakingConfirmationControllerContract$Parcel$Unstaking) {
            h.v2(this.E, new StakingConfirmationControllerContract$ModalStep.UnstakingPeriodDisclaimerDialog(((StakingConfirmationControllerContract$Parcel$Unstaking) parcel).f88113a), bottom_dialog);
        } else if (Intrinsics.f(parcel, StakingConfirmationControllerContract$Parcel$Price.f88112a)) {
            rp0.y yVarB = this.f88120w.b(new n0i.a(wd6.h.MARKET, wd6.e.BUY, false, null));
            if (yVarB != null) {
                aVar.x(yVarB);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    @Override // yji.l
    public final void T1(long j2) {
        h0 h0Var = new h0(4);
        y yVar = this.D;
        Continuation continuation = null;
        l.b1(this, new t0(q.q(yVar.B(h0Var)), 1), null, new hud.n(this, continuation, 1), 3);
        l.b1(this, v7.w(yVar.B(new h0(5))), null, new hud.n(this, continuation, 0), 3);
        n2(new m(this, continuation, 1), new whi.b(6));
        n2(new m(this, continuation, 2), new whi.b(6));
        n2(new m(this, continuation, 3), new whi.b(6));
        n2(new o(this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
