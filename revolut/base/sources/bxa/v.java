package bxa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b\t\u0010#R\u001a\u0010'\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\u0005\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006)"}, d2 = {"Lbxa/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "c", "firstName", "g", "lastName", "l", "type", "e", "j", "status", "f", "i", "rewardType", "ineligibilityReason", "Lbxa/m;", "h", "Lbxa/m;", "k", "()Lbxa/m;", "stepsInfo", "Lbxa/x;", "Lbxa/x;", "()Lbxa/x;", "rewardEarned", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deadline", "J", "()J", "createdDate", "inviteeRevtag", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("rewardType")
    @NotNull
    private final String rewardType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ineligibilityReason")
    private final String ineligibilityReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("stepsInfo")
    private final m stepsInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("rewardEarned")
    private final x rewardEarned;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("deadline")
    private final Long deadline;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("inviteeRevtag")
    private final String inviteeRevtag;

    public v(String id10, String firstName, String lastName, String type, String status, String rewardType, String str, m mVar, x xVar, Long l2, long j2, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.id = id10;
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.status = status;
        this.rewardType = rewardType;
        this.ineligibilityReason = str;
        this.stepsInfo = mVar;
        this.rewardEarned = xVar;
        this.deadline = l2;
        this.createdDate = j2;
        this.inviteeRevtag = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIneligibilityReason() {
        return this.ineligibilityReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.id, vVar.id) && Intrinsics.f(this.firstName, vVar.firstName) && Intrinsics.f(this.lastName, vVar.lastName) && Intrinsics.f(this.type, vVar.type) && Intrinsics.f(this.status, vVar.status) && Intrinsics.f(this.rewardType, vVar.rewardType) && Intrinsics.f(this.ineligibilityReason, vVar.ineligibilityReason) && Intrinsics.f(this.stepsInfo, vVar.stepsInfo) && Intrinsics.f(this.rewardEarned, vVar.rewardEarned) && Intrinsics.f(this.deadline, vVar.deadline) && this.createdDate == vVar.createdDate && Intrinsics.f(this.inviteeRevtag, vVar.inviteeRevtag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInviteeRevtag() {
        return this.inviteeRevtag;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final x getRewardEarned() {
        return this.rewardEarned;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.firstName), 31, this.lastName), 31, this.type), 31, this.status), 31, this.rewardType);
        String str = this.ineligibilityReason;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.stepsInfo;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        x xVar = this.rewardEarned;
        int iHashCode3 = (iHashCode2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Long l2 = this.deadline;
        int iC2 = a0.d.c((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.createdDate);
        String str2 = this.inviteeRevtag;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final m getStepsInfo() {
        return this.stepsInfo;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
