package fid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lfid/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRewardType", "rewardType", "b", "getAdSetId", "adSetId", "c", "getAdId", "adId", "d", "getPlacementId", "placementId", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardType")
    private final String rewardType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("adSetId")
    private final String adSetId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("adId")
    private final String adId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("placementId")
    private final String placementId;

    public b() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.rewardType, bVar.rewardType) && Intrinsics.f(this.adSetId, bVar.adSetId) && Intrinsics.f(this.adId, bVar.adId) && Intrinsics.f(this.placementId, bVar.placementId);
    }

    public final int hashCode() {
        String str = this.rewardType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adSetId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placementId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public b(String str, String str2, String str3, String str4) {
        this.rewardType = str;
        this.adSetId = str2;
        this.adId = str3;
        this.placementId = str4;
    }
}
