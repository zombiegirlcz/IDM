package com.revolut.feature.business.referrals.ui.flow.referral_with_incentive;

import com.revolut.business.feature.referrals.model.ReferralWithIncentiveCampaign$CampaignType;
import com.revolut.feature.business.referrals.ui.flow.referral_with_incentive.ReferralWithIncentiveFlowContract$Step;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreenContract$InputData;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.type.BigTileReferralWithIncentiveOverviewScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.type.HeaderTitleReferralWithIncentiveOverviewScreen;
import com.revolut.kompot.common.ModalDestination;
import cpi.g;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vs2.b;
import vs2.d;
import vu.c;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b, c {

    @NotNull
    public static final d Companion = new d();
    public final /* synthetic */ c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReferralWithIncentiveFlowContract$InputData f64338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vu.d f64339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f64340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f64341s;

    public a(ReferralWithIncentiveFlowContract$InputData inputData, vu.d repository, g storeIntentProvider, c configurationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(storeIntentProvider, "storeIntentProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.o = configurationProvider;
        this.f64338p = inputData;
        this.f64339q = repository;
        this.f64340r = storeIntentProvider;
        String str = inputData.f64332a;
        this.f64341s = cp5.d.a(this, str != null ? new ReferralWithIncentiveFlowContract$Step.InviteeDetails(str) : inputData.f64333b != null ? ReferralWithIncentiveFlowContract$Step.OverviewWithInviteContacts.f64337a : ReferralWithIncentiveFlowContract$Step.Overview.f64336a, f0.f322471a, new vh9.b(this, 21));
    }

    @Override // vu.c
    public final su.a F() {
        return this.o.F();
    }

    @Override // vu.c
    public final Set H0() {
        return this.o.H0();
    }

    public final BaseReferralWithIncentiveOverviewScreen I2() {
        BaseReferralWithIncentiveOverviewScreen headerTitleReferralWithIncentiveOverviewScreen = this.o.F() == su.a.TITLE ? new HeaderTitleReferralWithIncentiveOverviewScreen() : new BigTileReferralWithIncentiveOverviewScreen();
        vs2.c block = new vs2.c(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        headerTitleReferralWithIncentiveOverviewScreen.H = block;
        return headerTitleReferralWithIncentiveOverviewScreen;
    }

    public final void J2(String str, String str2, ReferralWithIncentiveCampaign$CampaignType referralWithIncentiveCampaign$CampaignType) {
        l.j2(this, new InviteContactsScreen(new InviteContactsScreenContract$InputData(str, str2, referralWithIncentiveCampaign$CampaignType)), ModalDestination.Style.POPUP.f98311a, null, 2);
    }

    @Override // vu.c
    public final su.b o0() {
        return this.o.o0();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f64341s;
    }
}
