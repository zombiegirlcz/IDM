package zwa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lzwa/e;", "", "", "toString", "()Ljava/lang/String;", "Lzwa/f;", "a", "Lzwa/f;", "b", "()Lzwa/f;", "referrerReward", "inviteeReward", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("referrerReward")
    @NotNull
    private final f referrerReward;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inviteeReward")
    @NotNull
    private final f inviteeReward;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getInviteeReward() {
        return this.inviteeReward;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getReferrerReward() {
        return this.referrerReward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.referrerReward, eVar.referrerReward) && Intrinsics.f(this.inviteeReward, eVar.inviteeReward);
    }

    public final int hashCode() {
        return this.inviteeReward.hashCode() + (this.referrerReward.hashCode() * 31);
    }
}
