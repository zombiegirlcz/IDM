package swa;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, d2 = {"Lswa/b;", "", "", "toString", "()Ljava/lang/String;", "", "Lswa/a;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "invites", "", "I", "()I", "count", "Lswa/c;", "c", "Lswa/c;", "d", "()Lswa/c;", "totalRewardEarned", "Lswa/j;", "Lswa/j;", "()Lswa/j;", "maxRewardInfo", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("invites")
    @NotNull
    private final List<a> invites;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalInvites")
    private final int count;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalRewardEarned")
    private final c totalRewardEarned;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxRewardInfo")
    private final j maxRewardInfo;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getInvites() {
        return this.invites;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getMaxRewardInfo() {
        return this.maxRewardInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getTotalRewardEarned() {
        return this.totalRewardEarned;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.invites, bVar.invites) && this.count == bVar.count && Intrinsics.f(this.totalRewardEarned, bVar.totalRewardEarned) && Intrinsics.f(this.maxRewardInfo, bVar.maxRewardInfo);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.count, this.invites.hashCode() * 31, 31);
        c cVar = this.totalRewardEarned;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        j jVar = this.maxRewardInfo;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }
}
