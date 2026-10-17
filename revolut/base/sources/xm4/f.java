package xm4;

import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f307085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f307086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307087c;

    public f(long j2, z2 z2Var, String str) {
        this.f307085a = j2;
        this.f307086b = z2Var;
        this.f307087c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f307085a == fVar.f307085a && Intrinsics.f(this.f307086b, fVar.f307086b) && Intrinsics.f(this.f307087c, fVar.f307087c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f307085a) * 31;
        z2 z2Var = this.f307086b;
        int iHashCode2 = (iHashCode + (z2Var == null ? 0 : z2Var.hashCode())) * 31;
        String str = this.f307087c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
