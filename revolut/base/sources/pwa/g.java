package pwa;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxRewardInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaxRewardInfo f240358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActiveOrPastInvitesRewardInfo f240359b;

    public g(MaxRewardInfo maxRewardInfo, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo) {
        this.f240358a = maxRewardInfo;
        this.f240359b = activeOrPastInvitesRewardInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f240358a, gVar.f240358a) && Intrinsics.f(this.f240359b, gVar.f240359b);
    }

    public final int hashCode() {
        MaxRewardInfo maxRewardInfo = this.f240358a;
        int iHashCode = (maxRewardInfo == null ? 0 : maxRewardInfo.hashCode()) * 31;
        ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo = this.f240359b;
        return iHashCode + (activeOrPastInvitesRewardInfo != null ? activeOrPastInvitesRewardInfo.hashCode() : 0);
    }
}
