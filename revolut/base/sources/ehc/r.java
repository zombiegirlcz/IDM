package ehc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b\u001d\u0010+R\u001c\u00102\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0002038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u00109\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b4\u00107R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010E\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b:\u0010DR\u001c\u0010F\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010C\u001a\u0004\bB\u0010DR\u001c\u0010G\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010C\u001a\u0004\b\u0010\u0010DR\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010L\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010J\u001a\u0004\b\"\u0010KR\u001c\u0010P\u001a\u0004\u0018\u00010M8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\b(\u0010O¨\u0006Q"}, d2 = {"Lehc/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "id", "b", "u", "type", "c", "o", "primaryCategoryId", "Lehc/o;", "d", "Lehc/o;", "e", "()Lehc/o;", "description", "k", "loyaltyDescription", "Lehc/p;", "f", "Lehc/p;", "()Lehc/p;", "details", "Lehc/n;", "g", "Lehc/n;", "()Lehc/n;", "banner", "Lihc/b;", "h", "Lihc/b;", "m", "()Lihc/b;", "merchant", "", "i", "Ljava/lang/Long;", "r", "()Ljava/lang/Long;", "start", "end", "Lahc/e;", "Lahc/e;", "q", "()Lahc/e;", "socialProof", "", "l", "Ljava/util/List;", "s", "()Ljava/util/List;", "steps", "loyaltySteps", "n", "activationState", "", "Ljava/lang/Integer;", "t", "()Ljava/lang/Integer;", "totalOutletsNumber", "", "p", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "onlyManualActivation", "requiresExternalRegistration", "canRedeemViaEmail", "activationButtonText", "Lehc/s;", "Lehc/s;", "()Lehc/s;", "footer", "Lehc/q;", "Lehc/q;", "()Lehc/q;", "header", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

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
    private final o description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("loyaltyDescription")
    private final o loyaltyDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final p details;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("banner")
    private final n banner;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final ihc.b merchant;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("start")
    private final Long start;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    private final Long end;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("socialProof")
    private final ahc.e socialProof;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<String> steps;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("loyaltySteps")
    private final List<String> loyaltySteps;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationState")
    private final String activationState;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("outletsCount")
    private final Integer totalOutletsNumber;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresManualActivation")
    private final Boolean onlyManualActivation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresExternalRegistration")
    private final Boolean requiresExternalRegistration;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("canRedeemViaEmail")
    private final Boolean canRedeemViaEmail;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationButtonText")
    private final String activationButtonText;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("footer")
    private final s footer;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("header")
    private final q header;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivationButtonText() {
        return this.activationButtonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivationState() {
        return this.activationState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n getBanner() {
        return this.banner;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getCanRedeemViaEmail() {
        return this.canRedeemViaEmail;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o getDescription() {
        return this.description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.id, rVar.id) && Intrinsics.f(this.type, rVar.type) && Intrinsics.f(this.primaryCategoryId, rVar.primaryCategoryId) && Intrinsics.f(this.description, rVar.description) && Intrinsics.f(this.loyaltyDescription, rVar.loyaltyDescription) && Intrinsics.f(this.details, rVar.details) && Intrinsics.f(this.banner, rVar.banner) && Intrinsics.f(this.merchant, rVar.merchant) && Intrinsics.f(this.start, rVar.start) && Intrinsics.f(this.end, rVar.end) && Intrinsics.f(this.socialProof, rVar.socialProof) && Intrinsics.f(this.steps, rVar.steps) && Intrinsics.f(this.loyaltySteps, rVar.loyaltySteps) && Intrinsics.f(this.activationState, rVar.activationState) && Intrinsics.f(this.totalOutletsNumber, rVar.totalOutletsNumber) && Intrinsics.f(this.onlyManualActivation, rVar.onlyManualActivation) && Intrinsics.f(this.requiresExternalRegistration, rVar.requiresExternalRegistration) && Intrinsics.f(this.canRedeemViaEmail, rVar.canRedeemViaEmail) && Intrinsics.f(this.activationButtonText, rVar.activationButtonText) && Intrinsics.f(this.footer, rVar.footer) && Intrinsics.f(this.header, rVar.header);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final s getFooter() {
        return this.footer;
    }

    public final int hashCode() {
        int iHashCode = (this.description.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.primaryCategoryId)) * 31;
        o oVar = this.loyaltyDescription;
        int iHashCode2 = (this.details.hashCode() + ((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31;
        n nVar = this.banner;
        int iHashCode3 = (this.merchant.hashCode() + ((iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31)) * 31;
        Long l2 = this.start;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.end;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        ahc.e eVar = this.socialProof;
        int iD = p.a.d((iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.steps);
        List<String> list = this.loyaltySteps;
        int iHashCode6 = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.activationState;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.totalOutletsNumber;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.onlyManualActivation;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.requiresExternalRegistration;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canRedeemViaEmail;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.activationButtonText;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        s sVar = this.footer;
        int iHashCode13 = (iHashCode12 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        q qVar = this.header;
        return iHashCode13 + (qVar != null ? qVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final q getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final o getLoyaltyDescription() {
        return this.loyaltyDescription;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getLoyaltySteps() {
        return this.loyaltySteps;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final ihc.b getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getOnlyManualActivation() {
        return this.onlyManualActivation;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getPrimaryCategoryId() {
        return this.primaryCategoryId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getRequiresExternalRegistration() {
        return this.requiresExternalRegistration;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final ahc.e getSocialProof() {
        return this.socialProof;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getTotalOutletsNumber() {
        return this.totalOutletsNumber;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
