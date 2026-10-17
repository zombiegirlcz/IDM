package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f111039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f111040b;

    public j0(k0 type, long j2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f111039a = type;
        this.f111040b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f111039a == j0Var.f111039a && this.f111040b == j0Var.f111040b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f111040b) + (this.f111039a.hashCode() * 31);
    }
}
