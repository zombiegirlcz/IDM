package tu;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006\""}, d2 = {"Ltu/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "type", "b", "d", "referralCode", "c", "campaignCode", "e", "referralUrl", "h", "termsAndConditionsLink", "", "Ltu/e;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "steps", "Ltu/c;", "Ltu/c;", "()Ltu/c;", "reward", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deadlineDate", "daysToDeadline", "feature_business_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("referralCode")
    @NotNull
    private final String referralCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaignCode")
    @NotNull
    private final String campaignCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("referralUrl")
    @NotNull
    private final String referralUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("termsAndConditionsLink")
    private final String termsAndConditionsLink;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<e> steps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("reward")
    private final c reward;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("deadlineDate")
    private final Long deadlineDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("daysToDeadline")
    private final Long daysToDeadline;

    public g(String type, String referralCode, String campaignCode, String referralUrl, String str, ArrayList steps, c cVar, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(referralUrl, "referralUrl");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.type = type;
        this.referralCode = referralCode;
        this.campaignCode = campaignCode;
        this.referralUrl = referralUrl;
        this.termsAndConditionsLink = str;
        this.steps = steps;
        this.reward = cVar;
        this.deadlineDate = l2;
        this.daysToDeadline = l3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDaysToDeadline() {
        return this.daysToDeadline;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getDeadlineDate() {
        return this.deadlineDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReferralUrl() {
        return this.referralUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.type, gVar.type) && Intrinsics.f(this.referralCode, gVar.referralCode) && Intrinsics.f(this.campaignCode, gVar.campaignCode) && Intrinsics.f(this.referralUrl, gVar.referralUrl) && Intrinsics.f(this.termsAndConditionsLink, gVar.termsAndConditionsLink) && Intrinsics.f(this.steps, gVar.steps) && Intrinsics.f(this.reward, gVar.reward) && Intrinsics.f(this.deadlineDate, gVar.deadlineDate) && Intrinsics.f(this.daysToDeadline, gVar.daysToDeadline);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getReward() {
        return this.reward;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTermsAndConditionsLink() {
        return this.termsAndConditionsLink;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.referralCode), 31, this.campaignCode), 31, this.referralUrl);
        String str = this.termsAndConditionsLink;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.steps);
        c cVar = this.reward;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Long l2 = this.deadlineDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.daysToDeadline;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
