package op0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f227512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227513b;

    public z3(w basePayload, boolean z) {
        Intrinsics.checkNotNullParameter(basePayload, "basePayload");
        this.f227512a = basePayload;
        this.f227513b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f227512a, z3Var.f227512a) && this.f227513b == z3Var.f227513b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227513b) + (this.f227512a.hashCode() * 31);
    }
}
