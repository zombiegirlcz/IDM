package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f272636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f272637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f272638c;
    public final String d;
    public final String e;

    public b0(n0 distributionInfo, a0 insuranceType, z creditProduct, String facilityId, String policyId) {
        Intrinsics.checkNotNullParameter(distributionInfo, "distributionInfo");
        Intrinsics.checkNotNullParameter(insuranceType, "insuranceType");
        Intrinsics.checkNotNullParameter(creditProduct, "creditProduct");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f272636a = distributionInfo;
        this.f272637b = insuranceType;
        this.f272638c = creditProduct;
        this.d = facilityId;
        this.e = policyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f272636a, b0Var.f272636a) && this.f272637b == b0Var.f272637b && this.f272638c == b0Var.f272638c && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f272638c.hashCode() + ((this.f272637b.hashCode() + (this.f272636a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
