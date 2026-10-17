package com.revolut.feature.business.referrals.ui.screens.referral_campaign_state;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreenContract$InputData;
import dob.c;
import dt2.e;
import dt2.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vu.d;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements g {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReferralCampaignStateScreenContract$InputData f64358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f64359q;

    public a(d referralWithIncentiveCampaignRepository, ReferralCampaignStateScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(referralWithIncentiveCampaignRepository, "referralWithIncentiveCampaignRepository");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = referralWithIncentiveCampaignRepository;
        this.f64358p = inputData;
        this.f64359q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2() {
        vkm.d dVarC;
        ReferralCampaignStateScreenContract$InputData.Active active = ReferralCampaignStateScreenContract$InputData.Active.f64356a;
        ReferralCampaignStateScreenContract$InputData referralCampaignStateScreenContract$InputData = this.f64358p;
        boolean zF = Intrinsics.f(referralCampaignStateScreenContract$InputData, active);
        d dVar = this.o;
        if (zF) {
            dVarC = ((rs2.n) dVar).e.c(Unit.f186387a, true);
        } else {
            if (!Intrinsics.f(referralCampaignStateScreenContract$InputData, ReferralCampaignStateScreenContract$InputData.Inactive.f64357a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVarC = ((rs2.n) dVar).f.c(Unit.f186387a, true);
        }
        l.b1(this, dVarC, null, new c(this, null, 13), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        I2();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f64359q;
    }
}
