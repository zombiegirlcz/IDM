package xt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lxt6/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAutomaticAllocation", "automaticAllocation", "", "b", "Ljava/lang/Float;", "getFixedAllocationRate", "()Ljava/lang/Float;", "fixedAllocationRate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("automaticAllocation")
    private final String automaticAllocation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fixedAllocationRate")
    private final Float fixedAllocationRate;

    public d(String str, Float f) {
        this.automaticAllocation = str;
        this.fixedAllocationRate = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.automaticAllocation, dVar.automaticAllocation) && Intrinsics.f(this.fixedAllocationRate, dVar.fixedAllocationRate);
    }

    public final int hashCode() {
        String str = this.automaticAllocation;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.fixedAllocationRate;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }
}
