package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lkfj/v1;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/e0;", "a", "Lkfj/e0;", "b", "()Lkfj/e0;", "powerOfAttorneyContent", "earlyTerminationContent", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("powerOfAttorneyContent")
    private final e0 powerOfAttorneyContent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("earlyTerminationContent")
    private final e0 earlyTerminationContent;

    public v1(e0 e0Var, e0 e0Var2) {
        this.powerOfAttorneyContent = e0Var;
        this.earlyTerminationContent = e0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e0 getEarlyTerminationContent() {
        return this.earlyTerminationContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getPowerOfAttorneyContent() {
        return this.powerOfAttorneyContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.powerOfAttorneyContent, v1Var.powerOfAttorneyContent) && Intrinsics.f(this.earlyTerminationContent, v1Var.earlyTerminationContent);
    }

    public final int hashCode() {
        e0 e0Var = this.powerOfAttorneyContent;
        int iHashCode = (e0Var == null ? 0 : e0Var.hashCode()) * 31;
        e0 e0Var2 = this.earlyTerminationContent;
        return iHashCode + (e0Var2 != null ? e0Var2.hashCode() : 0);
    }
}
