package zq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f324374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.k f324375b;

    public e0(f5j.a beneficiary, jq9.m mVar) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f324374a = beneficiary;
        this.f324375b = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f324374a, e0Var.f324374a) && Intrinsics.f(this.f324375b, e0Var.f324375b);
    }

    public final int hashCode() {
        int iHashCode = this.f324374a.hashCode() * 31;
        jq9.k kVar = this.f324375b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
