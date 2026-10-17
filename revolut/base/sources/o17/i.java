package o17;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f221318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f221320c;
    public final wr6.a d;
    public final FreelancerOrder e;

    public i(boolean z, boolean z3, String str, wr6.a refundAvailability, FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(refundAvailability, "refundAvailability");
        Intrinsics.checkNotNullParameter(order, "order");
        this.f221318a = z;
        this.f221319b = z3;
        this.f221320c = str;
        this.d = refundAvailability;
        this.e = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f221318a == iVar.f221318a && this.f221319b == iVar.f221319b && Intrinsics.f(this.f221320c, iVar.f221320c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f221318a) * 31, 31, this.f221319b);
        String str = this.f221320c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
