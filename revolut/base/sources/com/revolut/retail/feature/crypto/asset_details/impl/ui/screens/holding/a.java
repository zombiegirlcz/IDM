package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding;

import aii.q;
import aii.w;
import avd.b;
import cli.y;
import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import com.revolut.feature.crypto.locked.balance.api.CryptoLockedBalanceApi$Toggles$CryptoBalanceBreakdown;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$ModalStep;
import jul.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m9d.l0;
import m9j.k;
import m9j.m;
import m9j.p;
import m9j.r;
import oh5.e;
import oki.h;
import ppk.f;
import r8j.d;
import vkm.j2;
import x8j.h0;
import x8j.i0;
import x8j.j0;
import x8j.k0;
import x8j.n;
import xv5.c;
import yji.l;
import yud.g;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements k {
    public final b A;
    public final CryptoHoldingScreenContract$InputData B;
    public final y C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mu5.f f100010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f100011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f100012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f100013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f100014t;
    public final zud.a u;
    public final n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final dd5.a f100015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sud.b f100016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ang.f f100017y;
    public final e z;

    public a(f ratesInteractor, mu5.f cryptoInvestmentsInteractor, o cryptoPocketBalanceWithMidPriceInteractor, d cryptoAssetDetailsPocketProvider, c baseCurrencyInteractor, g stakingInteractor, zud.a autoStakingConsentInteractor, n actionsModelExtension, dd5.a autoStakingDialogProvider, sud.b earnRateBottomSheetResolver, ang.f userInteractor, gte.a featureToggleInteractor, e cryptoLockedGiftBalanceInteractor, b flexibleStakingConsentInteractor, CryptoHoldingScreenContract$InputData inputData, r stateMapper) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(cryptoPocketBalanceWithMidPriceInteractor, "cryptoPocketBalanceWithMidPriceInteractor");
        Intrinsics.checkNotNullParameter(cryptoAssetDetailsPocketProvider, "cryptoAssetDetailsPocketProvider");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(autoStakingConsentInteractor, "autoStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(actionsModelExtension, "actionsModelExtension");
        Intrinsics.checkNotNullParameter(autoStakingDialogProvider, "autoStakingDialogProvider");
        Intrinsics.checkNotNullParameter(earnRateBottomSheetResolver, "earnRateBottomSheetResolver");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoLockedGiftBalanceInteractor, "cryptoLockedGiftBalanceInteractor");
        Intrinsics.checkNotNullParameter(flexibleStakingConsentInteractor, "flexibleStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = ratesInteractor;
        this.f100010p = cryptoInvestmentsInteractor;
        this.f100011q = cryptoPocketBalanceWithMidPriceInteractor;
        this.f100012r = cryptoAssetDetailsPocketProvider;
        this.f100013s = baseCurrencyInteractor;
        this.f100014t = stakingInteractor;
        this.u = autoStakingConsentInteractor;
        this.v = actionsModelExtension;
        this.f100015w = autoStakingDialogProvider;
        this.f100016x = earnRateBottomSheetResolver;
        this.f100017y = userInteractor;
        this.z = cryptoLockedGiftBalanceInteractor;
        this.A = flexibleStakingConsentInteractor;
        this.B = inputData;
        xi0.a aVar = xi0.b.Companion;
        String str = inputData.f99997a.f163147c;
        aVar.getClass();
        this.C = mra.d.b(this, new m9j.h(xi0.a.a(str), null, null, null, false, null, null, ((jte.d) featureToggleInteractor).c(CryptoLockedBalanceApi$Toggles$CryptoBalanceBreakdown.f70866c), null), stateMapper, null, false, 12);
        this.D = hx7.e.a(this, new m84.e(this, 2));
    }

    public final void I2(StakingPocket stakingPocket) {
        if (stakingPocket == null || stakingPocket.f88084g.k()) {
            return;
        }
        C2(q.f5292a);
        h.v2(this.D, new CryptoHoldingScreenContract$ModalStep.EarningScreen(stakingPocket), ModalDestination.Style.POPUP.f98311a);
    }

    public final void J2(oc5.e eVar) {
        StakingRewardsDialogDescriptor$Type inPeriod;
        if (eVar instanceof oc5.d) {
            inPeriod = StakingRewardsDialogDescriptor$Type.Overdue.f70776a;
        } else {
            if (!(eVar instanceof oc5.c)) {
                throw new NoWhenBranchMatchedException();
            }
            inPeriod = new StakingRewardsDialogDescriptor$Type.InPeriod(((oc5.c) eVar).f224103a);
        }
        h.v2(this.D, new CryptoHoldingScreenContract$ModalStep.StakingRewardsDialog(inPeriod), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    @Override // yji.l
    public final void T1(long j2) {
        xi0.a aVar = xi0.b.Companion;
        String str = this.B.f99997a.f163147c;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        l.b1(this, this.f100014t.d(bVarA, w4l.h.f294642c), null, new p(this, null, 1), 3);
        l.b1(this, rd0.e.b(nim.a.w(pd.b.r(this.f100013s.a(), new m(this, bVarA, 0)), new l0(18))), null, new p(this, null, 2), 3);
        l.b1(this, this.v.Z2(((m9j.h) ((j2) this.C.f22677a).getValue()).f203801a), null, new p(this, null, 3), 3);
        l.b1(this, e.a(this.z, bVarA), null, new p(this, null, 4), 3);
        l.b1(this, this.A.a(), null, new p(this, null, 0), 3);
        n2(new m9j.o(this, null, 2), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof h0;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.D;
        w wVar = w.f5295a;
        if (z) {
            h.v2(aVar, new CryptoHoldingScreenContract$ModalStep.GiftAssetTransferInfo(((h0) event).f303448b, false), bottom_dialog);
            return wVar;
        }
        if (event instanceof i0) {
            h.v2(aVar, new CryptoHoldingScreenContract$ModalStep.GiftAssetTransferInfo(((i0) event).f303451b, true), bottom_dialog);
            return wVar;
        }
        if (event instanceof j0) {
            I2(((j0) event).f303455b.f316699a);
            return wVar;
        }
        if (!(event instanceof k0)) {
            return super.o2(event);
        }
        I2(((k0) event).f303457b.f316701a);
        return wVar;
    }
}
