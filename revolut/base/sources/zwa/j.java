package zwa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\f\u0010\u0004¨\u0006\u001d"}, d2 = {"Lzwa/j;", "", "", "toString", "()Ljava/lang/String;", "Lzwa/s;", "a", "Lzwa/s;", "d", "()Lzwa/s;", "referrer", "Lzwa/q;", "b", "Lzwa/q;", "c", "()Lzwa/q;", "promoContent", "", "J", "()J", "deadline", "Lzwa/t;", "Lzwa/t;", "e", "()Lzwa/t;", "rewardDetails", "Ljava/lang/String;", "inviteState", "Companion", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("referrer")
    @NotNull
    private final s referrer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("promoContent")
    @NotNull
    private final q promoContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deadline")
    private final long deadline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("rewardDetails")
    @NotNull
    private final t rewardDetails;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("inviteState")
    @NotNull
    private final String inviteState;

    public j(s referrer, q promoContent, long j2, t rewardDetails, String inviteState) {
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(promoContent, "promoContent");
        Intrinsics.checkNotNullParameter(rewardDetails, "rewardDetails");
        Intrinsics.checkNotNullParameter(inviteState, "inviteState");
        this.referrer = referrer;
        this.promoContent = promoContent;
        this.deadline = j2;
        this.rewardDetails = rewardDetails;
        this.inviteState = inviteState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInviteState() {
        return this.inviteState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getPromoContent() {
        return this.promoContent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getReferrer() {
        return this.referrer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t getRewardDetails() {
        return this.rewardDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.referrer, jVar.referrer) && Intrinsics.f(this.promoContent, jVar.promoContent) && this.deadline == jVar.deadline && Intrinsics.f(this.rewardDetails, jVar.rewardDetails) && Intrinsics.f(this.inviteState, jVar.inviteState);
    }

    public final int hashCode() {
        return this.inviteState.hashCode() + ((this.rewardDetails.hashCode() + a0.d.c((this.promoContent.hashCode() + (this.referrer.hashCode() * 31)) * 31, 31, this.deadline)) * 31);
    }
}
