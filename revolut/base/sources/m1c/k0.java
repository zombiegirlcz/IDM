package m1c;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f201382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f201383b;

    public k0(int i, LocalDate claimBy) {
        Intrinsics.checkNotNullParameter(claimBy, "claimBy");
        this.f201382a = i;
        this.f201383b = claimBy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f201382a == k0Var.f201382a && Intrinsics.f(this.f201383b, k0Var.f201383b);
    }

    public final int hashCode() {
        return this.f201383b.hashCode() + (Integer.hashCode(this.f201382a) * 31);
    }
}
