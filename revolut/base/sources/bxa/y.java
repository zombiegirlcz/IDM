package bxa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b)\u0010\u0004R\u001a\u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u0004R\u001a\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u0004R\u001a\u00103\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u0004R\u001a\u00104\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b\u0006\u0010\u0015R\u001a\u00106\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b5\u0010\u0015R\u001c\u00108\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b7\u0010\u000fR\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b9\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\bF\u0010\u0004R(\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010I\u001a\u0004\b\f\u0010JR\u001a\u0010M\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u001b\u001a\u0004\bL\u0010\u0004R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\bN\u0010\u0004R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u001b\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010T\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010R\u001a\u0004\b\u0017\u0010SR\u001c\u0010X\u001a\u0004\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010V\u001a\u0004\b\u001a\u0010WR\"\u0010\\\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010B\u001a\u0004\b[\u0010DR\u001c\u0010]\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u001b\u001a\u0004\bZ\u0010\u0004R\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u001b\u001a\u0004\b+\u0010\u0004R\"\u0010`\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010B\u001a\u0004\b1\u0010DR\"\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010B\u001a\u0004\b\u001f\u0010DR\u001c\u0010e\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010c\u001a\u0004\b.\u0010d¨\u0006f"}, d2 = {"Lbxa/y;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "deadline", "", "b", "Ljava/lang/Integer;", "p", "()Ljava/lang/Integer;", "inviteeChallengePeriod", "Lbxa/c;", "c", "Lbxa/c;", "u", "()Lbxa/c;", "recentInvites", "d", "w", "referrerTotalInvites", "e", "Ljava/lang/String;", "h", "description", "Lbxa/u;", "f", "Lbxa/u;", "r", "()Lbxa/u;", "multiLevelDetails", "", "Z", "D", "()Z", "isDefaultCampaign", "l", "imageUrl", "i", "n", "inviteSuccessMessage", "j", "o", "inviteText", "k", "m", "inviteLink", "activeInvites", "t", "pastInvites", "q", "maxReferrerRewards", "s", "participationId", "Lbxa/z;", "Lbxa/z;", "x", "()Lbxa/z;", "rewardInfo", "", "Lbxa/b0;", "Ljava/util/List;", "z", "()Ljava/util/List;", "steps", "A", "termsUrl", "", "Ljava/util/Map;", "()Ljava/util/Map;", "additionalTerms", "B", "title", "v", "referralCode", "campaignCode", "Lpwa/n;", "Lpwa/n;", "()Lpwa/n;", "campaignType", "Lbxa/h;", "Lbxa/h;", "()Lbxa/h;", "cashbackInfo", "Lbxa/e0;", "y", "C", "upsells", "rewardType", "disclaimer", "Lbxa/k;", "howItWorks", "Lbxa/j;", "conditions", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasCompletedInviteRewards", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("howItWorks")
    private final List<k> howItWorks;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("conditions")
    private final List<j> conditions;

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
    private final c recentInvites;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("referrerTotalInvites")
    private final Integer referrerTotalInvites;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("multiLevelDetails")
    private final u multiLevelDetails;

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
    private final c activeInvites;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("pastInvites")
    @NotNull
    private final c pastInvites;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxReferrerRewards")
    private final Integer maxReferrerRewards;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("participationId")
    private final String participationId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewardInfo")
    private final z rewardInfo;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<b0> steps;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsUrl")
    private final String termsUrl;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalTerms")
    private final Map<String, String> additionalTerms;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("referralCode")
    private final String referralCode;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("campaignCode")
    private final String campaignCode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignType")
    private final pwa.n campaignType;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackInfo")
    private final h cashbackInfo;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("upsells")
    private final List<e0> upsells;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("rewardType")
    private final String rewardType;

    public y(Long l2, Integer num, c cVar, Integer num2, String description, u uVar, boolean z, String imageUrl, String inviteSuccessMessage, String inviteText, String inviteLink, c activeInvites, c pastInvites, Integer num3, String str, z zVar, ArrayList steps, String str2, Map map, String title, String str3, String str4, pwa.n nVar, h hVar, ArrayList arrayList, String str5, String str6, ArrayList arrayList2, ArrayList arrayList3, Boolean bool) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(inviteSuccessMessage, "inviteSuccessMessage");
        Intrinsics.checkNotNullParameter(inviteText, "inviteText");
        Intrinsics.checkNotNullParameter(inviteLink, "inviteLink");
        Intrinsics.checkNotNullParameter(activeInvites, "activeInvites");
        Intrinsics.checkNotNullParameter(pastInvites, "pastInvites");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(title, "title");
        this.deadline = l2;
        this.inviteeChallengePeriod = num;
        this.recentInvites = cVar;
        this.referrerTotalInvites = num2;
        this.description = description;
        this.multiLevelDetails = uVar;
        this.isDefaultCampaign = z;
        this.imageUrl = imageUrl;
        this.inviteSuccessMessage = inviteSuccessMessage;
        this.inviteText = inviteText;
        this.inviteLink = inviteLink;
        this.activeInvites = activeInvites;
        this.pastInvites = pastInvites;
        this.maxReferrerRewards = num3;
        this.participationId = str;
        this.rewardInfo = zVar;
        this.steps = steps;
        this.termsUrl = str2;
        this.additionalTerms = map;
        this.title = title;
        this.referralCode = str3;
        this.campaignCode = str4;
        this.campaignType = nVar;
        this.cashbackInfo = hVar;
        this.upsells = arrayList;
        this.rewardType = str5;
        this.disclaimer = str6;
        this.howItWorks = arrayList2;
        this.conditions = arrayList3;
        this.hasCompletedInviteRewards = bool;
    }

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
    public final c getActiveInvites() {
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
    public final pwa.n getCampaignType() {
        return this.campaignType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getCashbackInfo() {
        return this.cashbackInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.deadline, yVar.deadline) && Intrinsics.f(this.inviteeChallengePeriod, yVar.inviteeChallengePeriod) && Intrinsics.f(this.recentInvites, yVar.recentInvites) && Intrinsics.f(this.referrerTotalInvites, yVar.referrerTotalInvites) && Intrinsics.f(this.description, yVar.description) && Intrinsics.f(this.multiLevelDetails, yVar.multiLevelDetails) && this.isDefaultCampaign == yVar.isDefaultCampaign && Intrinsics.f(this.imageUrl, yVar.imageUrl) && Intrinsics.f(this.inviteSuccessMessage, yVar.inviteSuccessMessage) && Intrinsics.f(this.inviteText, yVar.inviteText) && Intrinsics.f(this.inviteLink, yVar.inviteLink) && Intrinsics.f(this.activeInvites, yVar.activeInvites) && Intrinsics.f(this.pastInvites, yVar.pastInvites) && Intrinsics.f(this.maxReferrerRewards, yVar.maxReferrerRewards) && Intrinsics.f(this.participationId, yVar.participationId) && Intrinsics.f(this.rewardInfo, yVar.rewardInfo) && Intrinsics.f(this.steps, yVar.steps) && Intrinsics.f(this.termsUrl, yVar.termsUrl) && Intrinsics.f(this.additionalTerms, yVar.additionalTerms) && Intrinsics.f(this.title, yVar.title) && Intrinsics.f(this.referralCode, yVar.referralCode) && Intrinsics.f(this.campaignCode, yVar.campaignCode) && this.campaignType == yVar.campaignType && Intrinsics.f(this.cashbackInfo, yVar.cashbackInfo) && Intrinsics.f(this.upsells, yVar.upsells) && Intrinsics.f(this.rewardType, yVar.rewardType) && Intrinsics.f(this.disclaimer, yVar.disclaimer) && Intrinsics.f(this.howItWorks, yVar.howItWorks) && Intrinsics.f(this.conditions, yVar.conditions) && Intrinsics.f(this.hasCompletedInviteRewards, yVar.hasCompletedInviteRewards);
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
        c cVar = this.recentInvites;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num2 = this.referrerTotalInvites;
        int iC = p.a.c((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.description);
        u uVar = this.multiLevelDetails;
        int iHashCode4 = (this.pastInvites.hashCode() + ((this.activeInvites.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c((iC + (uVar == null ? 0 : uVar.hashCode())) * 31, 31, this.isDefaultCampaign), 31, this.imageUrl), 31, this.inviteSuccessMessage), 31, this.inviteText), 31, this.inviteLink)) * 31)) * 31;
        Integer num3 = this.maxReferrerRewards;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.participationId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        z zVar = this.rewardInfo;
        int iD = p.a.d((iHashCode6 + (zVar == null ? 0 : zVar.hashCode())) * 31, 31, this.steps);
        String str2 = this.termsUrl;
        int iHashCode7 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.additionalTerms;
        int iC2 = p.a.c((iHashCode7 + (map == null ? 0 : map.hashCode())) * 31, 31, this.title);
        String str3 = this.referralCode;
        int iHashCode8 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.campaignCode;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        pwa.n nVar = this.campaignType;
        int iHashCode10 = (iHashCode9 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        h hVar = this.cashbackInfo;
        int iHashCode11 = (iHashCode10 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<e0> list = this.upsells;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.rewardType;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.disclaimer;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<k> list2 = this.howItWorks;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<j> list3 = this.conditions;
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
    public final u getMultiLevelDetails() {
        return this.multiLevelDetails;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getParticipationId() {
        return this.participationId;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final c getPastInvites() {
        return this.pastInvites;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final c getRecentInvites() {
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
    public final z getRewardInfo() {
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
