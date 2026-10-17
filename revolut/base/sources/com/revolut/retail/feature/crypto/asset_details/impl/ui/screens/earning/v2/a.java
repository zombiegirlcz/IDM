package com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2;

import aii.q;
import aii.w;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.asset.details.api.dialog.StakingRewardsDialogDescriptor$Type;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreenContract$ModalStep;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l0c.s;
import l0c.v;
import l5a.u;
import l9j.j;
import l9j.m;
import mra.d;
import oki.h;
import ppk.f;
import sud.b;
import w4l.i;
import x8j.j0;
import x8j.k0;
import x8j.n;
import xv5.c;
import yji.l;
import yud.g;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements l9j.h {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f99990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mu5.f f99991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f99992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f99993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f99994t;
    public final ang.f u;
    public final CryptoEarningScreenContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f99995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f99996x;

    public a(f ratesInteractor, g stakingInteractor, mu5.f cryptoInvestmentsInteractor, b earnRateBottomSheetResolver, n actionsModelExtension, c baseCurrencyInteractor, ang.f userInteractor, CryptoEarningScreenContract$InputData inputData, l9j.n stateMapper) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(earnRateBottomSheetResolver, "earnRateBottomSheetResolver");
        Intrinsics.checkNotNullParameter(actionsModelExtension, "actionsModelExtension");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = ratesInteractor;
        this.f99990p = stakingInteractor;
        this.f99991q = cryptoInvestmentsInteractor;
        this.f99992r = earnRateBottomSheetResolver;
        this.f99993s = actionsModelExtension;
        this.f99994t = baseCurrencyInteractor;
        this.u = userInteractor;
        this.v = inputData;
        this.f99995w = e.a(this, new v(this, 19));
        this.f99996x = d.b(this, new l9j.f(inputData.f99983a, new Data(null, null, true, 3, null), null, null), stateMapper, null, false, 12);
    }

    public final void I2(oc5.e eVar) {
        StakingRewardsDialogDescriptor$Type inPeriod;
        if (eVar instanceof oc5.d) {
            inPeriod = StakingRewardsDialogDescriptor$Type.Overdue.f70776a;
        } else {
            if (!(eVar instanceof oc5.c)) {
                throw new NoWhenBranchMatchedException();
            }
            inPeriod = new StakingRewardsDialogDescriptor$Type.InPeriod(((oc5.c) eVar).f224103a);
        }
        h.v2(this.f99995w, new CryptoEarningScreenContract$ModalStep.StakingRewardsDialog(inPeriod), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f99995w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        CryptoEarningScreenContract$InputData cryptoEarningScreenContract$InputData = this.v;
        l.b1(this, mo3.a.g(this.f99990p.c(cryptoEarningScreenContract$InputData.f99983a.f88082b.d, i.f294643c), null, new j(0), 1), null, new m(this, null, 0), 3);
        l.b1(this, rd0.e.b(nim.a.w(pd.b.r(this.f99994t.a(), new s(this, 25)), new u(26))), null, new m(this, null, 1), 3);
        l.b1(this, this.f99993s.k3(cryptoEarningScreenContract$InputData.f99983a.f88082b.d), null, new m(this, null, 2), 3);
        n2(new kze.h(this, null, 5), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f99996x;
    }

    @Override // yji.l
    public final aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j0;
        w wVar = w.f5295a;
        if (z) {
            return wVar;
        }
        if (!(event instanceof k0)) {
            return super.o2(event);
        }
        StakingPocket stakingPocket = ((k0) event).f303457b.f316701a;
        if (stakingPocket != null && stakingPocket.f88084g.k()) {
            C2(q.f5292a);
        }
        return wVar;
    }
}
