package ht2;

import com.revolut.business.feature.referrals.model.ReferralWithIncentiveCampaign$CampaignType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferralWithIncentiveCampaign$CampaignType f155232c;

    public l(String referralUrl, String str, ReferralWithIncentiveCampaign$CampaignType campaignType) {
        Intrinsics.checkNotNullParameter(referralUrl, "referralUrl");
        Intrinsics.checkNotNullParameter(campaignType, "campaignType");
        this.f155230a = referralUrl;
        this.f155231b = str;
        this.f155232c = campaignType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f155230a, lVar.f155230a) && Intrinsics.f(this.f155231b, lVar.f155231b) && Intrinsics.f(this.f155232c, lVar.f155232c);
    }

    public final int hashCode() {
        int iHashCode = this.f155230a.hashCode() * 31;
        String str = this.f155231b;
        return this.f155232c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
