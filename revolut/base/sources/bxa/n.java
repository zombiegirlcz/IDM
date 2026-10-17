package bxa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lbxa/n;", "", "", "toString", "()Ljava/lang/String;", "Lbxa/r;", "a", "Lbxa/r;", "()Lbxa/r;", "maxRewardInfo", "Lbxa/d;", "b", "Lbxa/d;", "()Lbxa/d;", "totalRewardEarned", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxRewardInfo")
    private final r maxRewardInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalRewardEarned")
    private final d totalRewardEarned;

    public n(r rVar, d dVar) {
        this.maxRewardInfo = rVar;
        this.totalRewardEarned = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r getMaxRewardInfo() {
        return this.maxRewardInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getTotalRewardEarned() {
        return this.totalRewardEarned;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.maxRewardInfo, nVar.maxRewardInfo) && Intrinsics.f(this.totalRewardEarned, nVar.totalRewardEarned);
    }

    public final int hashCode() {
        r rVar = this.maxRewardInfo;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        d dVar = this.totalRewardEarned;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
