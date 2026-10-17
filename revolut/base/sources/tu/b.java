package tu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\n\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001f"}, d2 = {"Ltu/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "type", "", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "maxInviteesRedeemed", "Ljo3/a;", "Ljo3/a;", "f", "()Ljo3/a;", "reward", "d", "e", "progress", "g", "rewardToReceive", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deadlineDate", "daysToDeadline", "missedReward", "feature_business_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxInviteesRedeemed")
    private final Integer maxInviteesRedeemed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reward")
    private final jo3.a reward;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("progress")
    private final Integer progress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("rewardToReceive")
    private final jo3.a rewardToReceive;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("deadlineDate")
    private final Long deadlineDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("daysToDeadline")
    private final Integer daysToDeadline;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("missedReward")
    private final jo3.a missedReward;

    public b(String type, Integer num, jo3.a aVar, Integer num2, jo3.a aVar2, Long l2, Integer num3, jo3.a aVar3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.maxInviteesRedeemed = num;
        this.reward = aVar;
        this.progress = num2;
        this.rewardToReceive = aVar2;
        this.deadlineDate = l2;
        this.daysToDeadline = num3;
        this.missedReward = aVar3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getDaysToDeadline() {
        return this.daysToDeadline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDeadlineDate() {
        return this.deadlineDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMaxInviteesRedeemed() {
        return this.maxInviteesRedeemed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getMissedReward() {
        return this.missedReward;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getProgress() {
        return this.progress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.maxInviteesRedeemed, bVar.maxInviteesRedeemed) && Intrinsics.f(this.reward, bVar.reward) && Intrinsics.f(this.progress, bVar.progress) && Intrinsics.f(this.rewardToReceive, bVar.rewardToReceive) && Intrinsics.f(this.deadlineDate, bVar.deadlineDate) && Intrinsics.f(this.daysToDeadline, bVar.daysToDeadline) && Intrinsics.f(this.missedReward, bVar.missedReward);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getRewardToReceive() {
        return this.rewardToReceive;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Integer num = this.maxInviteesRedeemed;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        jo3.a aVar = this.reward;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num2 = this.progress;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        jo3.a aVar2 = this.rewardToReceive;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Long l2 = this.deadlineDate;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.daysToDeadline;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        jo3.a aVar3 = this.missedReward;
        return iHashCode7 + (aVar3 != null ? aVar3.hashCode() : 0);
    }
}
