package ehc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\n\u0010\u0018¨\u0006\u001a"}, d2 = {"Lehc/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "type", "", "b", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "isNew", "Lihc/b;", "c", "Lihc/b;", "()Lihc/b;", "merchant", "relevantPlanId", "", "Lehc/a0;", "Ljava/util/List;", "()Ljava/util/List;", "pricingPlans", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isNew")
    private final Boolean isNew;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final ihc.b merchant;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("relevantPlanId")
    @NotNull
    private final String relevantPlanId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pricingPlans")
    @NotNull
    private final List<a0> pricingPlans;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ihc.b getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPricingPlans() {
        return this.pricingPlans;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRelevantPlanId() {
        return this.relevantPlanId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.type, zVar.type) && Intrinsics.f(this.isNew, zVar.isNew) && Intrinsics.f(this.merchant, zVar.merchant) && Intrinsics.f(this.relevantPlanId, zVar.relevantPlanId) && Intrinsics.f(this.pricingPlans, zVar.pricingPlans);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Boolean bool = this.isNew;
        return this.pricingPlans.hashCode() + p.a.c((this.merchant.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31, this.relevantPlanId);
    }
}
