package us2;

import com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.ReferralCampaignStateScreenContract$InputData;
import java.util.Collections;
import java.util.Set;
import ufg.k0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralCampaignStateScreenContract$InputData f282396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282398c;

    public f(j jVar, h hVar, ReferralCampaignStateScreenContract$InputData referralCampaignStateScreenContract$InputData) {
        this.f282396a = referralCampaignStateScreenContract$InputData;
        int i = 14;
        this.f282397b = e4m.b.b(new k0(jVar, this, 1, i));
        this.f282398c = e4m.b.b(new k0(jVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
