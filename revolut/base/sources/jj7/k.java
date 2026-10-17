package jj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0014"}, d2 = {"Ljj7/k;", "", "", "toString", "()Ljava/lang/String;", "Ljj7/r;", "a", "Ljj7/r;", "()Ljj7/r;", "claimIds", "", "b", "J", "c", "()J", "createdDate", "Ljava/lang/String;", "d", "status", "claimName", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ids")
    @NotNull
    private final r claimIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    private final String claimName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r getClaimIds() {
        return this.claimIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getClaimName() {
        return this.claimName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.claimIds, kVar.claimIds) && this.createdDate == kVar.createdDate && Intrinsics.f(this.status, kVar.status) && Intrinsics.f(this.claimName, kVar.claimName);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.claimIds.hashCode() * 31, 31, this.createdDate), 31, this.status);
        String str = this.claimName;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
