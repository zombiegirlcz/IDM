package rgc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u001f"}, d2 = {"Lrgc/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "perkId", "b", "f", "planId", "c", "description", "briefDescription", "e", "h", "verboseDescription", "", "Z", "()Z", "availableToClaim", "g", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "isWarning", "picture", "i", "isPhysical", "subscriberAccountType", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("perkId")
    @NotNull
    private final String perkId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("normalDescription")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("briefDescription")
    private final String briefDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("verboseDescription")
    private final String verboseDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("availableToClaim")
    private final boolean availableToClaim;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("isWarning")
    private final Boolean isWarning;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("picture")
    private final String picture;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("isPhysical")
    private final Boolean isPhysical;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriberAccountType")
    private final String subscriberAccountType;

    public q(String perkId, String planId, String str, String str2, String str3, boolean z, Boolean bool, String str4, Boolean bool2, String str5) {
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.perkId = perkId;
        this.planId = planId;
        this.description = str;
        this.briefDescription = str2;
        this.verboseDescription = str3;
        this.availableToClaim = z;
        this.isWarning = bool;
        this.picture = str4;
        this.isPhysical = bool2;
        this.subscriberAccountType = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAvailableToClaim() {
        return this.availableToClaim;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBriefDescription() {
        return this.briefDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPerkId() {
        return this.perkId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.perkId, qVar.perkId) && Intrinsics.f(this.planId, qVar.planId) && Intrinsics.f(this.description, qVar.description) && Intrinsics.f(this.briefDescription, qVar.briefDescription) && Intrinsics.f(this.verboseDescription, qVar.verboseDescription) && this.availableToClaim == qVar.availableToClaim && Intrinsics.f(this.isWarning, qVar.isWarning) && Intrinsics.f(this.picture, qVar.picture) && Intrinsics.f(this.isPhysical, qVar.isPhysical) && Intrinsics.f(this.subscriberAccountType, qVar.subscriberAccountType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubscriberAccountType() {
        return this.subscriberAccountType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVerboseDescription() {
        return this.verboseDescription;
    }

    public final int hashCode() {
        int iC = p.a.c(this.perkId.hashCode() * 31, 31, this.planId);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.briefDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verboseDescription;
        int iC2 = j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.availableToClaim);
        Boolean bool = this.isWarning;
        int iHashCode3 = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.picture;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isPhysical;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.subscriberAccountType;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsPhysical() {
        return this.isPhysical;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getIsWarning() {
        return this.isWarning;
    }
}
