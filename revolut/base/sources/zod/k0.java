package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324004b;

    public k0(String juniorId, String firstName) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f324003a = juniorId;
        this.f324004b = firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f324003a, k0Var.f324003a) && Intrinsics.f(this.f324004b, k0Var.f324004b);
    }

    public final int hashCode() {
        return this.f324004b.hashCode() + (this.f324003a.hashCode() * 31);
    }
}
