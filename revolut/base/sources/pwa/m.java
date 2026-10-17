package pwa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralCampaignV4 f240371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f240372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f240373c;

    public m(ReferralCampaignV4 referralCampaign, List list, c infoSectionTypeDomain) {
        Intrinsics.checkNotNullParameter(referralCampaign, "referralCampaign");
        Intrinsics.checkNotNullParameter(infoSectionTypeDomain, "infoSectionTypeDomain");
        this.f240371a = referralCampaign;
        this.f240372b = list;
        this.f240373c = infoSectionTypeDomain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f240371a, mVar.f240371a) && Intrinsics.f(this.f240372b, mVar.f240372b) && this.f240373c == mVar.f240373c;
    }

    public final int hashCode() {
        int iHashCode = this.f240371a.hashCode() * 31;
        List list = this.f240372b;
        return this.f240373c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }
}
