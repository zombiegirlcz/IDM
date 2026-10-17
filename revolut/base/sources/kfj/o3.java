package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkfj/o3;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/v3;", "a", "Lkfj/v3;", "c", "()Lkfj/v3;", "overview", "Lkfj/n3;", "b", "Lkfj/n3;", "()Lkfj/n3;", "details", "Lkfj/t3;", "Lkfj/t3;", "()Lkfj/t3;", "list", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("overview")
    private final v3 overview;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final n3 details;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("list")
    private final t3 list;

    public o3(v3 v3Var, n3 n3Var, t3 t3Var) {
        this.overview = v3Var;
        this.details = n3Var;
        this.list = t3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n3 getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t3 getList() {
        return this.list;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v3 getOverview() {
        return this.overview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Intrinsics.f(this.overview, o3Var.overview) && Intrinsics.f(this.details, o3Var.details) && Intrinsics.f(this.list, o3Var.list);
    }

    public final int hashCode() {
        v3 v3Var = this.overview;
        int iHashCode = (v3Var == null ? 0 : v3Var.hashCode()) * 31;
        n3 n3Var = this.details;
        int iHashCode2 = (iHashCode + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        t3 t3Var = this.list;
        return iHashCode2 + (t3Var != null ? t3Var.hashCode() : 0);
    }
}
