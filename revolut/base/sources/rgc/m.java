package rgc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u0018\u0010$R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b&\u00101R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b8\u00109R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b.\u0010=R\u001c\u0010?\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010<\u001a\u0004\b4\u0010=R\u001c\u0010@\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b\f\u0010=R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006B"}, d2 = {"Lrgc/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "id", "b", "r", "type", "c", "l", "primaryCategoryId", "Lrgc/f;", "d", "Lrgc/f;", "()Lrgc/f;", "description", "e", "h", "loyaltyDescription", "Lrgc/h;", "f", "Lrgc/h;", "()Lrgc/h;", "details", "Lrgc/o;", "Lrgc/o;", "j", "()Lrgc/o;", "merchant", "", "J", "o", "()J", "start", "i", "end", "Lrgc/c;", "Lrgc/c;", "n", "()Lrgc/c;", "socialProof", "", "k", "Ljava/util/List;", "p", "()Ljava/util/List;", "steps", "loyaltySteps", "m", "activationState", "", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "totalOutletsNumber", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "onlyManualActivation", "requiresExternalRegistration", "canRedeemViaEmail", "activationButtonText", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryCategoryId")
    @NotNull
    private final String primaryCategoryId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final f description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("loyaltyDescription")
    private final f loyaltyDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final h details;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final o merchant;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    private final long start;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("end")
    private final long end;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("socialProof")
    private final c socialProof;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<String> steps;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("loyaltySteps")
    private final List<String> loyaltySteps;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationState")
    private final String activationState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("outletsCount")
    private final Integer totalOutletsNumber;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("requiresManualActivation")
    private final Boolean onlyManualActivation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresExternalRegistration")
    private final Boolean requiresExternalRegistration;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("canRedeemViaEmail")
    private final Boolean canRedeemViaEmail;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationButtonText")
    private final String activationButtonText;

    public m(String id10, String type, String primaryCategoryId, f description, f fVar, h details, o merchant, long j2, long j3, c cVar, List steps, List list, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(primaryCategoryId, "primaryCategoryId");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.id = id10;
        this.type = type;
        this.primaryCategoryId = primaryCategoryId;
        this.description = description;
        this.loyaltyDescription = fVar;
        this.details = details;
        this.merchant = merchant;
        this.start = j2;
        this.end = j3;
        this.socialProof = cVar;
        this.steps = steps;
        this.loyaltySteps = list;
        this.activationState = str;
        this.totalOutletsNumber = num;
        this.onlyManualActivation = bool;
        this.requiresExternalRegistration = bool2;
        this.canRedeemViaEmail = bool3;
        this.activationButtonText = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivationButtonText() {
        return this.activationButtonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivationState() {
        return this.activationState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCanRedeemViaEmail() {
        return this.canRedeemViaEmail;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getDetails() {
        return this.details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.type, mVar.type) && Intrinsics.f(this.primaryCategoryId, mVar.primaryCategoryId) && Intrinsics.f(this.description, mVar.description) && Intrinsics.f(this.loyaltyDescription, mVar.loyaltyDescription) && Intrinsics.f(this.details, mVar.details) && Intrinsics.f(this.merchant, mVar.merchant) && this.start == mVar.start && this.end == mVar.end && Intrinsics.f(this.socialProof, mVar.socialProof) && Intrinsics.f(this.steps, mVar.steps) && Intrinsics.f(this.loyaltySteps, mVar.loyaltySteps) && Intrinsics.f(this.activationState, mVar.activationState) && Intrinsics.f(this.totalOutletsNumber, mVar.totalOutletsNumber) && Intrinsics.f(this.onlyManualActivation, mVar.onlyManualActivation) && Intrinsics.f(this.requiresExternalRegistration, mVar.requiresExternalRegistration) && Intrinsics.f(this.canRedeemViaEmail, mVar.canRedeemViaEmail) && Intrinsics.f(this.activationButtonText, mVar.activationButtonText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getLoyaltyDescription() {
        return this.loyaltyDescription;
    }

    public final int hashCode() {
        int iHashCode = (this.description.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.primaryCategoryId)) * 31;
        f fVar = this.loyaltyDescription;
        int iC = a0.d.c(a0.d.c((this.merchant.hashCode() + ((this.details.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31)) * 31, 31, this.start), 31, this.end);
        c cVar = this.socialProof;
        int iD = p.a.d((iC + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.steps);
        List<String> list = this.loyaltySteps;
        int iHashCode2 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.activationState;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalOutletsNumber;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.onlyManualActivation;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.requiresExternalRegistration;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canRedeemViaEmail;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.activationButtonText;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getLoyaltySteps() {
        return this.loyaltySteps;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final o getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getOnlyManualActivation() {
        return this.onlyManualActivation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPrimaryCategoryId() {
        return this.primaryCategoryId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getRequiresExternalRegistration() {
        return this.requiresExternalRegistration;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final c getSocialProof() {
        return this.socialProof;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getTotalOutletsNumber() {
        return this.totalOutletsNumber;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
