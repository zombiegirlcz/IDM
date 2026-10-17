package swa;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010(\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001a\u00103\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b\f\u00102R\u001c\u00107\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u001a\u00108\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b\t\u00102R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\"\u0010<\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b;\u0010\u001bR\u001c\u0010=\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b)\u0010%R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\b>\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\bA\u0010\u0004R\u001c\u0010G\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\b\u0005\u0010F¨\u0006H"}, d2 = {"Lswa/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "y", "title", "b", "d", "email", "c", "g", "firstName", "h", "id", "e", "o", "revtag", "f", "k", "lastName", "", "Lswa/f;", "Ljava/util/List;", "v", "()Ljava/util/List;", "steps", "faqKey", "i", "m", "phone", "Lswa/c;", "j", "Lswa/c;", "n", "()Lswa/c;", "potentialReward", "q", "rewardEarned", "l", "s", "rewardType", "t", "status", "r", "rewardGifUrl", "", "J", "()J", "deadlineMs", "p", "Ljava/lang/Long;", "()Ljava/lang/Long;", "rewardDeadlineMs", "createdDateMs", "expireReason", "Lswa/h;", "x", "tips", "missedReward", "u", "ineligibilityReason", "inviteeCode", "w", "statusSummary", "termsUrl", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "confettiSeen", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("revtag")
    private final String revtag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<f> steps;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("faqKey")
    private final String faqKey;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("phone")
    private final String phone;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("potentialReward")
    private final c potentialReward;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("rewardEarned")
    private final c rewardEarned;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardType")
    private final String rewardType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardGifUrl")
    private final String rewardGifUrl;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("deadline")
    private final long deadlineMs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardDeadline")
    private final Long rewardDeadlineMs;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDateMs;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("expireReason")
    private final String expireReason;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("tips")
    private final List<h> tips;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("missedReward")
    private final c missedReward;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("ineligibilityReason")
    private final String ineligibilityReason;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("inviteeCode")
    private final String inviteeCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("statusSummary")
    private final String statusSummary;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsUrl")
    private final String termsUrl;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("confettiSeen")
    private final Boolean confettiSeen;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getConfettiSeen() {
        return this.confettiSeen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedDateMs() {
        return this.createdDateMs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDeadlineMs() {
        return this.deadlineMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExpireReason() {
        return this.expireReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.email, aVar.email) && Intrinsics.f(this.firstName, aVar.firstName) && Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.revtag, aVar.revtag) && Intrinsics.f(this.lastName, aVar.lastName) && Intrinsics.f(this.steps, aVar.steps) && Intrinsics.f(this.faqKey, aVar.faqKey) && Intrinsics.f(this.phone, aVar.phone) && Intrinsics.f(this.potentialReward, aVar.potentialReward) && Intrinsics.f(this.rewardEarned, aVar.rewardEarned) && Intrinsics.f(this.rewardType, aVar.rewardType) && Intrinsics.f(this.status, aVar.status) && Intrinsics.f(this.rewardGifUrl, aVar.rewardGifUrl) && this.deadlineMs == aVar.deadlineMs && Intrinsics.f(this.rewardDeadlineMs, aVar.rewardDeadlineMs) && this.createdDateMs == aVar.createdDateMs && Intrinsics.f(this.expireReason, aVar.expireReason) && Intrinsics.f(this.tips, aVar.tips) && Intrinsics.f(this.missedReward, aVar.missedReward) && Intrinsics.f(this.ineligibilityReason, aVar.ineligibilityReason) && Intrinsics.f(this.inviteeCode, aVar.inviteeCode) && Intrinsics.f(this.statusSummary, aVar.statusSummary) && Intrinsics.f(this.termsUrl, aVar.termsUrl) && Intrinsics.f(this.confettiSeen, aVar.confettiSeen);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFaqKey() {
        return this.faqKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iC = p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.firstName), 31, this.id);
        String str3 = this.revtag;
        int iD = p.a.d(p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.lastName), 31, this.steps);
        String str4 = this.faqKey;
        int iHashCode2 = (iD + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phone;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        c cVar = this.potentialReward;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.rewardEarned;
        int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str6 = this.rewardType;
        int iC2 = p.a.c((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.status);
        String str7 = this.rewardGifUrl;
        int iC3 = a0.d.c((iC2 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.deadlineMs);
        Long l2 = this.rewardDeadlineMs;
        int iC4 = a0.d.c((iC3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.createdDateMs);
        String str8 = this.expireReason;
        int iHashCode6 = (iC4 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<h> list = this.tips;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar3 = this.missedReward;
        int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        String str9 = this.ineligibilityReason;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.inviteeCode;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.statusSummary;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.termsUrl;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.confettiSeen;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getIneligibilityReason() {
        return this.ineligibilityReason;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getInviteeCode() {
        return this.inviteeCode;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final c getMissedReward() {
        return this.missedReward;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final c getPotentialReward() {
        return this.potentialReward;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRevtag() {
        return this.revtag;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Long getRewardDeadlineMs() {
        return this.rewardDeadlineMs;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final c getRewardEarned() {
        return this.rewardEarned;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getRewardGifUrl() {
        return this.rewardGifUrl;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getStatusSummary() {
        return this.statusSummary;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final List getTips() {
        return this.tips;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
