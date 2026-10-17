package bxa;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010(\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001a\u00103\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b\f\u00102R\u001c\u00105\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b4\u00102R\u001a\u00106\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b\t\u00102R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R \u0010:\u001a\b\u0012\u0004\u0012\u0002080\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b9\u0010\u001fR\u001c\u0010;\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b)\u0010%R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b<\u0010\u0004R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b?\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\b\u0005\u0010D¨\u0006F"}, d2 = {"Lbxa/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "y", "title", "b", "d", "email", "c", "g", "firstName", "o", "revtag", "e", "h", "id", "f", "k", "lastName", "m", "phone", "faqKey", "", "Lbxa/l;", "i", "Ljava/util/List;", "v", "()Ljava/util/List;", "steps", "Lbxa/d;", "j", "Lbxa/d;", "n", "()Lbxa/d;", "potentialReward", "q", "rewardEarned", "l", "s", "rewardType", "t", "status", "r", "rewardGifUrl", "Ljava/time/Instant;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "deadline", "p", "rewardDeadline", "createdDate", "expireReason", "Lbxa/o;", "x", "tips", "missedReward", "u", "ineligibilityReason", "inviteeCode", "w", "statusSummary", "termsUrl", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "confettiSeen", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

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
    @lg.b("revtag")
    private final String revtag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("phone")
    private final String phone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("faqKey")
    private final String faqKey;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<l> steps;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("potentialReward")
    private final d potentialReward;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("rewardEarned")
    private final d rewardEarned;

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
    @NotNull
    private final Instant deadline;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardDeadline")
    private final Instant rewardDeadline;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final Instant createdDate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("expireReason")
    private final String expireReason;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("tips")
    @NotNull
    private final List<o> tips;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("missedReward")
    private final d missedReward;

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

    public b(String str, String str2, String firstName, String str3, String id10, String lastName, String str4, String str5, ArrayList steps, d dVar, d dVar2, String str6, String status, String str7, Instant deadline, Instant instant, Instant createdDate, String str8, ArrayList tips, d dVar3, String str9, String str10, String str11, String str12, Boolean bool) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(deadline, "deadline");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.title = str;
        this.email = str2;
        this.firstName = firstName;
        this.revtag = str3;
        this.id = id10;
        this.lastName = lastName;
        this.phone = str4;
        this.faqKey = str5;
        this.steps = steps;
        this.potentialReward = dVar;
        this.rewardEarned = dVar2;
        this.rewardType = str6;
        this.status = status;
        this.rewardGifUrl = str7;
        this.deadline = deadline;
        this.rewardDeadline = instant;
        this.createdDate = createdDate;
        this.expireReason = str8;
        this.tips = tips;
        this.missedReward = dVar3;
        this.ineligibilityReason = str9;
        this.inviteeCode = str10;
        this.statusSummary = str11;
        this.termsUrl = str12;
        this.confettiSeen = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getConfettiSeen() {
        return this.confettiSeen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Instant getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getDeadline() {
        return this.deadline;
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
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.email, bVar.email) && Intrinsics.f(this.firstName, bVar.firstName) && Intrinsics.f(this.revtag, bVar.revtag) && Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.lastName, bVar.lastName) && Intrinsics.f(this.phone, bVar.phone) && Intrinsics.f(this.faqKey, bVar.faqKey) && Intrinsics.f(this.steps, bVar.steps) && Intrinsics.f(this.potentialReward, bVar.potentialReward) && Intrinsics.f(this.rewardEarned, bVar.rewardEarned) && Intrinsics.f(this.rewardType, bVar.rewardType) && Intrinsics.f(this.status, bVar.status) && Intrinsics.f(this.rewardGifUrl, bVar.rewardGifUrl) && Intrinsics.f(this.deadline, bVar.deadline) && Intrinsics.f(this.rewardDeadline, bVar.rewardDeadline) && Intrinsics.f(this.createdDate, bVar.createdDate) && Intrinsics.f(this.expireReason, bVar.expireReason) && Intrinsics.f(this.tips, bVar.tips) && Intrinsics.f(this.missedReward, bVar.missedReward) && Intrinsics.f(this.ineligibilityReason, bVar.ineligibilityReason) && Intrinsics.f(this.inviteeCode, bVar.inviteeCode) && Intrinsics.f(this.statusSummary, bVar.statusSummary) && Intrinsics.f(this.termsUrl, bVar.termsUrl) && Intrinsics.f(this.confettiSeen, bVar.confettiSeen);
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
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.firstName);
        String str3 = this.revtag;
        int iC2 = p.a.c(p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.id), 31, this.lastName);
        String str4 = this.phone;
        int iHashCode2 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.faqKey;
        int iD = p.a.d((iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.steps);
        d dVar = this.potentialReward;
        int iHashCode3 = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.rewardEarned;
        int iHashCode4 = (iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str6 = this.rewardType;
        int iC3 = p.a.c((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.status);
        String str7 = this.rewardGifUrl;
        int iC4 = r6.b.c((iC3 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.deadline);
        Instant instant = this.rewardDeadline;
        int iC5 = r6.b.c((iC4 + (instant == null ? 0 : instant.hashCode())) * 31, 31, this.createdDate);
        String str8 = this.expireReason;
        int iD2 = p.a.d((iC5 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.tips);
        d dVar3 = this.missedReward;
        int iHashCode5 = (iD2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        String str9 = this.ineligibilityReason;
        int iHashCode6 = (iHashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.inviteeCode;
        int iHashCode7 = (iHashCode6 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.statusSummary;
        int iHashCode8 = (iHashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.termsUrl;
        int iHashCode9 = (iHashCode8 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.confettiSeen;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
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
    public final d getMissedReward() {
        return this.missedReward;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final d getPotentialReward() {
        return this.potentialReward;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRevtag() {
        return this.revtag;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Instant getRewardDeadline() {
        return this.rewardDeadline;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final d getRewardEarned() {
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
