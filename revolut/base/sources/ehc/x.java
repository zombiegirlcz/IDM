package ehc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\f\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\u0017\u0010)¨\u0006+"}, d2 = {"Lehc/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "perkId", "c", "k", "type", "", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "start", "e", "end", "Lihc/b;", "f", "Lihc/b;", "()Lihc/b;", "merchant", "Lehc/o;", "Lehc/o;", "()Lehc/o;", "description", "h", "primaryCategory", "Lahc/e;", "i", "Lahc/e;", "()Lahc/e;", "socialProof", "activationState", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "onlyManualActivation", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("perkId")
    @NotNull
    private final String perkId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("start")
    private final Long start;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("end")
    private final Long end;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final ihc.b merchant;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final o description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryCategoryId")
    @NotNull
    private final String primaryCategory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("socialProof")
    private final ahc.e socialProof;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationState")
    private final String activationState;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("requiresManualActivation")
    private final Boolean onlyManualActivation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivationState() {
        return this.activationState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ihc.b getMerchant() {
        return this.merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.id, xVar.id) && Intrinsics.f(this.perkId, xVar.perkId) && Intrinsics.f(this.type, xVar.type) && Intrinsics.f(this.start, xVar.start) && Intrinsics.f(this.end, xVar.end) && Intrinsics.f(this.merchant, xVar.merchant) && Intrinsics.f(this.description, xVar.description) && Intrinsics.f(this.primaryCategory, xVar.primaryCategory) && Intrinsics.f(this.socialProof, xVar.socialProof) && Intrinsics.f(this.activationState, xVar.activationState) && Intrinsics.f(this.onlyManualActivation, xVar.onlyManualActivation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getOnlyManualActivation() {
        return this.onlyManualActivation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPerkId() {
        return this.perkId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPrimaryCategory() {
        return this.primaryCategory;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.perkId), 31, this.type);
        Long l2 = this.start;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.end;
        int iC2 = p.a.c((this.description.hashCode() + ((this.merchant.hashCode() + ((iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31)) * 31)) * 31, 31, this.primaryCategory);
        ahc.e eVar = this.socialProof;
        int iHashCode2 = (iC2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.activationState;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.onlyManualActivation;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ahc.e getSocialProof() {
        return this.socialProof;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
