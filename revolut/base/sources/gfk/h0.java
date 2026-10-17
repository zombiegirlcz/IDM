package gfk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgfk/h0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "planId", "", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "recommended", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "suggestedFeatures", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recommended")
    private final Boolean recommended;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestedFeatures")
    @NotNull
    private final List<String> suggestedFeatures;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getRecommended() {
        return this.recommended;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSuggestedFeatures() {
        return this.suggestedFeatures;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.planId, h0Var.planId) && Intrinsics.f(this.recommended, h0Var.recommended) && Intrinsics.f(this.suggestedFeatures, h0Var.suggestedFeatures);
    }

    public final int hashCode() {
        int iHashCode = this.planId.hashCode() * 31;
        Boolean bool = this.recommended;
        return this.suggestedFeatures.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }
}
