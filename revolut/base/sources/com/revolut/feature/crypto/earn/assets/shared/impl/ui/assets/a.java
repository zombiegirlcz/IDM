package com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets;

import au6.a3;
import cli.y;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.assets.EarnAssetsScreenContract$ModalStep;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.navigation.destination.StakeFeatureDestination;
import com.revolut.kompot.common.ModalDestination;
import df5.b;
import e54.r;
import ef5.k;
import ef5.m;
import gud.c;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import mu5.f;
import oki.h;
import sh5.d;
import vkm.q;
import w4l.i;
import yji.l;
import yud.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements ef5.a {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f70795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f70796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f70797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gud.b f70798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gud.a f70799t;
    public final c u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final bvd.a f70800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f70801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70802y;

    public a(k stateMapper, p stakeableAssetsProvider, f cryptoInvestmentsInteractor, g stakingInteractor, b disclaimerClauseProvider, gud.b buyDestinationProvider, gud.a autoStakingControlScreenProvider, c earnDetailsScreenProvider, d cryptoFcaDisclaimerWidget, bvd.a stakingRewardsSummaryInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(stakeableAssetsProvider, "stakeableAssetsProvider");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(disclaimerClauseProvider, "disclaimerClauseProvider");
        Intrinsics.checkNotNullParameter(buyDestinationProvider, "buyDestinationProvider");
        Intrinsics.checkNotNullParameter(autoStakingControlScreenProvider, "autoStakingControlScreenProvider");
        Intrinsics.checkNotNullParameter(earnDetailsScreenProvider, "earnDetailsScreenProvider");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(stakingRewardsSummaryInteractor, "stakingRewardsSummaryInteractor");
        this.o = stakeableAssetsProvider;
        this.f70795p = cryptoInvestmentsInteractor;
        this.f70796q = stakingInteractor;
        this.f70797r = disclaimerClauseProvider;
        this.f70798s = buyDestinationProvider;
        this.f70799t = autoStakingControlScreenProvider;
        this.u = earnDetailsScreenProvider;
        this.v = cryptoFcaDisclaimerWidget;
        this.f70800w = stakingRewardsSummaryInteractor;
        this.f70801x = mra.d.b(this, new ef5.b(0), stateMapper, null, false, 12);
        this.f70802y = e.a(this, new r(this, 26));
    }

    public final void I2(we5.b bVar) {
        we5.a aVar = bVar.f296625a;
        StakingProduct stakingProduct = aVar.f296622a;
        StakingPocket stakingPocket = aVar.f296623b;
        io3.d dVar = aVar.f296624c;
        vtd.b bVar2 = stakingProduct.f88087b.k;
        vtd.b bVar3 = vtd.b.AUTO;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = this.f70802y;
        if (bVar2 == bVar3) {
            if (dVar == null) {
                return;
            }
            h.v2(aVar2, new EarnAssetsScreenContract$ModalStep.AutoStakingControl(dVar, stakingProduct), popup);
        } else if (aVar.b().k()) {
            C1(new StakeFeatureDestination(dVar != null ? dVar.f163145a : null, stakingProduct, stakingPocket));
        } else {
            if (stakingPocket == null) {
                return;
            }
            h.v2(aVar2, new EarnAssetsScreenContract$ModalStep.EarnAssetDetails(stakingPocket), popup);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70802y;
    }

    @Override // yji.l
    public final void T1(long j2) {
        bvd.a aVar = this.f70800w;
        Continuation continuation = null;
        l.b1(this, q.Q(rd0.e.b(xv5.c.b(aVar.f19019a)), new a3(continuation, aVar, 29)), null, new ef5.l(this, null, 3), 3);
        l.b1(this, this.o.q(), null, new ef5.l(this, null, 0), 3);
        l.b1(this, rd0.e.b(gt5.a.a(this.f70795p, null, false, 7)), null, new ef5.l(this, null, 1), 3);
        l.b1(this, this.f70796q.e(i.f294643c), null, new ef5.l(this, null, 2), 3);
        n2(new m(this, continuation, 0), new whi.b(6));
        n2(new m(this, continuation, 1), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70801x;
    }
}
