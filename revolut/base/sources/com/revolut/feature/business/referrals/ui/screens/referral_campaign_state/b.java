package com.revolut.feature.business.referrals.ui.screens.referral_campaign_state;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreenContract$InputData;
import d9.t0;
import dmb.m;
import dmj.e0;
import dt2.e;
import dt2.h;
import dt2.i;
import iii.c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vu.f;
import vu.g;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralCampaignStateScreenContract$InputData f64360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ws2.a f64361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f64362c;

    public b(ReferralCampaignStateScreenContract$InputData inputData, ws2.a inviteeStateMapper, g resourceProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inviteeStateMapper, "inviteeStateMapper");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f64360a = inputData;
        this.f64361b = inviteeStateMapper;
        this.f64362c = resourceProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int iB;
        int iB2;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) c.f(domainState.f117347a, new e0(this, 24), new m(24), new dbg.b(this, 10));
        ReferralCampaignStateScreenContract$InputData referralCampaignStateScreenContract$InputData = this.f64360a;
        ReferralCampaignStateScreenContract$InputData.Active active = ReferralCampaignStateScreenContract$InputData.Active.f64356a;
        boolean zF = Intrinsics.f(referralCampaignStateScreenContract$InputData, active);
        ReferralCampaignStateScreenContract$InputData.Inactive inactive = ReferralCampaignStateScreenContract$InputData.Inactive.f64357a;
        g gVar = this.f64362c;
        if (zF) {
            iB = ((n5j.b) gVar).b(f.business_referrals_invitees_active_title);
        } else {
            if (!Intrinsics.f(referralCampaignStateScreenContract$InputData, inactive)) {
                throw new NoWhenBranchMatchedException();
            }
            iB = ((n5j.b) gVar).b(f.business_referrals_invitees_past_title);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(iB, null, null, 14);
        if (Intrinsics.f(referralCampaignStateScreenContract$InputData, active)) {
            iB2 = ((n5j.b) gVar).b(f.referrals_active_screen);
        } else {
            if (!Intrinsics.f(referralCampaignStateScreenContract$InputData, inactive)) {
                throw new NoWhenBranchMatchedException();
            }
            iB2 = ((n5j.b) gVar).b(f.referrals_past_screen);
        }
        return new h(t0.G(textLocalisedClause, iB2), list);
    }
}
