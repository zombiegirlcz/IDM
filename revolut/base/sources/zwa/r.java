package zwa;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b)\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u0004R\u001a\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u0004R\u001a\u00103\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u0004R\u001a\u00104\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b\u0006\u0010\u0015R\u001a\u00106\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b5\u0010\u0015R\u001c\u00108\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b7\u0010\u000fR\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b9\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u001b\u001a\u0004\b@\u0010\u0004R \u0010G\u001a\b\u0012\u0004\u0012\u00020C0B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u001b\u001a\u0004\bH\u0010\u0004R(\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010K\u001a\u0004\b\f\u0010LR\u001a\u0010O\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\bN\u0010\u0004R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u001b\u001a\u0004\bP\u0010\u0004R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u001b\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010W\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010U\u001a\u0004\b\u001a\u0010VR\"\u0010Z\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\bY\u0010FR\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u001b\u001a\u0004\b+\u0010\u0004R\"\u0010]\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\b1\u0010FR\"\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010D\u001a\u0004\b\u001f\u0010FR\u001c\u0010b\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010`\u001a\u0004\b.\u0010a¨\u0006c"}, d2 = {"Lzwa/r;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "deadline", "", "b", "Ljava/lang/Integer;", "p", "()Ljava/lang/Integer;", "inviteeChallengePeriod", "Lswa/b;", "c", "Lswa/b;", "u", "()Lswa/b;", "recentInvites", "d", "w", "referrerTotalInvites", "e", "Ljava/lang/String;", "h", "description", "Lzwa/l;", "f", "Lzwa/l;", "r", "()Lzwa/l;", "multiLevelDetails", "", "Z", "D", "()Z", "isDefaultCampaign", "l", "imageUrl", "i", "n", "inviteSuccessMessage", "j", "o", "inviteText", "k", "m", "inviteLink", "activeInvites", "t", "pastInvites", "q", "maxReferrerRewards", "s", "participationId", "Lzwa/u;", "Lzwa/u;", "x", "()Lzwa/u;", "rewardInfo", "y", "rewardType", "", "Lzwa/w;", "Ljava/util/List;", "z", "()Ljava/util/List;", "steps", "A", "termsUrl", "", "Ljava/util/Map;", "()Ljava/util/Map;", "additionalTerms", "B", "title", "v", "referralCode", "campaignCode", "campaignType", "Lzwa/e;", "Lzwa/e;", "()Lzwa/e;", "cashbackInfo", "Lzwa/y;", "C", "upsells", "disclaimer", "Lzwa/h;", "howItWorks", "Lzwa/g;", "conditions", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasCompletedInviteRewards", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("howItWorks")
    private final List<h> howItWorks;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("conditions")
    private final List<g> conditions;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("hasCompletedInviteRewards")
    private final Boolean hasCompletedInviteRewards;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("deadline")
    private final Long deadline;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inviteeChallengePeriod")
    private final Integer inviteeChallengePeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("recentInvites")
    private final swa.b recentInvites;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("referrerTotalInvites")
    private final Integer referrerTotalInvites;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("multiLevelDetails")
    private final l multiLevelDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("isDefaultCampaign")
    private final boolean isDefaultCampaign;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("imageUrl")
    @NotNull
    private final String imageUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("inviteSuccessMessage")
    @NotNull
    private final String inviteSuccessMessage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("inviteText")
    @NotNull
    private final String inviteText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("inviteLink")
    @NotNull
    private final String inviteLink;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("activeInvites")
    @NotNull
    private final swa.b activeInvites;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("pastInvites")
    @NotNull
    private final swa.b pastInvites;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxReferrerRewards")
    private final Integer maxReferrerRewards;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("participationId")
    private final String participationId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardInfo")
    private final u rewardInfo;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardType")
    private final String rewardType;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<w> steps;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsUrl")
    private final String termsUrl;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalTerms")
    private final Map<String, String> additionalTerms;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("referralCode")
    private final String referralCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignCode")
    private final String campaignCode;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignType")
    private final String campaignType;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackInfo")
    private final e cashbackInfo;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("upsells")
    private final List<y> upsells;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final List getUpsells() {
        return this.upsells;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsDefaultCampaign() {
        return this.isDefaultCampaign;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final swa.b getActiveInvites() {
        return this.activeInvites;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getAdditionalTerms() {
        return this.additionalTerms;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCampaignType() {
        return this.campaignType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getCashbackInfo() {
        return this.cashbackInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.deadline, rVar.deadline) && Intrinsics.f(this.inviteeChallengePeriod, rVar.inviteeChallengePeriod) && Intrinsics.f(this.recentInvites, rVar.recentInvites) && Intrinsics.f(this.referrerTotalInvites, rVar.referrerTotalInvites) && Intrinsics.f(this.description, rVar.description) && Intrinsics.f(this.multiLevelDetails, rVar.multiLevelDetails) && this.isDefaultCampaign == rVar.isDefaultCampaign && Intrinsics.f(this.imageUrl, rVar.imageUrl) && Intrinsics.f(this.inviteSuccessMessage, rVar.inviteSuccessMessage) && Intrinsics.f(this.inviteText, rVar.inviteText) && Intrinsics.f(this.inviteLink, rVar.inviteLink) && Intrinsics.f(this.activeInvites, rVar.activeInvites) && Intrinsics.f(this.pastInvites, rVar.pastInvites) && Intrinsics.f(this.maxReferrerRewards, rVar.maxReferrerRewards) && Intrinsics.f(this.participationId, rVar.participationId) && Intrinsics.f(this.rewardInfo, rVar.rewardInfo) && Intrinsics.f(this.rewardType, rVar.rewardType) && Intrinsics.f(this.steps, rVar.steps) && Intrinsics.f(this.termsUrl, rVar.termsUrl) && Intrinsics.f(this.additionalTerms, rVar.additionalTerms) && Intrinsics.f(this.title, rVar.title) && Intrinsics.f(this.referralCode, rVar.referralCode) && Intrinsics.f(this.campaignCode, rVar.campaignCode) && Intrinsics.f(this.campaignType, rVar.campaignType) && Intrinsics.f(this.cashbackInfo, rVar.cashbackInfo) && Intrinsics.f(this.upsells, rVar.upsells) && Intrinsics.f(this.disclaimer, rVar.disclaimer) && Intrinsics.f(this.howItWorks, rVar.howItWorks) && Intrinsics.f(this.conditions, rVar.conditions) && Intrinsics.f(this.hasCompletedInviteRewards, rVar.hasCompletedInviteRewards);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getConditions() {
        return this.conditions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getDeadline() {
        return this.deadline;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        Long l2 = this.deadline;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Integer num = this.inviteeChallengePeriod;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        swa.b bVar = this.recentInvites;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num2 = this.referrerTotalInvites;
        int iC = p.a.c((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.description);
        l lVar = this.multiLevelDetails;
        int iHashCode4 = (this.pastInvites.hashCode() + ((this.activeInvites.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c((iC + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.isDefaultCampaign), 31, this.imageUrl), 31, this.inviteSuccessMessage), 31, this.inviteText), 31, this.inviteLink)) * 31)) * 31;
        Integer num3 = this.maxReferrerRewards;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.participationId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.rewardInfo;
        int iHashCode7 = (iHashCode6 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str2 = this.rewardType;
        int iD = p.a.d((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.steps);
        String str3 = this.termsUrl;
        int iHashCode8 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.additionalTerms;
        int iC2 = p.a.c((iHashCode8 + (map == null ? 0 : map.hashCode())) * 31, 31, this.title);
        String str4 = this.referralCode;
        int iHashCode9 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.campaignCode;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.campaignType;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        e eVar = this.cashbackInfo;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<y> list = this.upsells;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.disclaimer;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<h> list2 = this.howItWorks;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<g> list3 = this.conditions;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.hasCompletedInviteRewards;
        return iHashCode16 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getHasCompletedInviteRewards() {
        return this.hasCompletedInviteRewards;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getHowItWorks() {
        return this.howItWorks;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getInviteLink() {
        return this.inviteLink;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInviteSuccessMessage() {
        return this.inviteSuccessMessage;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getInviteText() {
        return this.inviteText;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Integer getInviteeChallengePeriod() {
        return this.inviteeChallengePeriod;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getMaxReferrerRewards() {
        return this.maxReferrerRewards;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final l getMultiLevelDetails() {
        return this.multiLevelDetails;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getParticipationId() {
        return this.participationId;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final swa.b getPastInvites() {
        return this.pastInvites;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final swa.b getRecentInvites() {
        return this.recentInvites;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Integer getReferrerTotalInvites() {
        return this.referrerTotalInvites;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final u getRewardInfo() {
        return this.rewardInfo;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }
}
