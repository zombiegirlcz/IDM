package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhcl/d2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "groupEntity", "b", "c", "issuingEntity", "Lhcl/f2;", "Lhcl/f2;", "d", "()Lhcl/f2;", "ratings", "Lhcl/e2;", "Lhcl/e2;", "()Lhcl/e2;", "id", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("group_entity")
    @NotNull
    private final String groupEntity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("issuing_entity")
    @NotNull
    private final String issuingEntity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ratings")
    private final f2 ratings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("id")
    private final e2 id;

    public d2(String groupEntity, String issuingEntity, f2 f2Var, e2 e2Var) {
        Intrinsics.checkNotNullParameter(groupEntity, "groupEntity");
        Intrinsics.checkNotNullParameter(issuingEntity, "issuingEntity");
        this.groupEntity = groupEntity;
        this.issuingEntity = issuingEntity;
        this.ratings = f2Var;
        this.id = e2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGroupEntity() {
        return this.groupEntity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e2 getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIssuingEntity() {
        return this.issuingEntity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f2 getRatings() {
        return this.ratings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.groupEntity, d2Var.groupEntity) && Intrinsics.f(this.issuingEntity, d2Var.issuingEntity) && Intrinsics.f(this.ratings, d2Var.ratings) && Intrinsics.f(this.id, d2Var.id);
    }

    public final int hashCode() {
        int iC = p.a.c(this.groupEntity.hashCode() * 31, 31, this.issuingEntity);
        f2 f2Var = this.ratings;
        int iHashCode = (iC + (f2Var == null ? 0 : f2Var.hashCode())) * 31;
        e2 e2Var = this.id;
        return iHashCode + (e2Var != null ? e2Var.hashCode() : 0);
    }
}
