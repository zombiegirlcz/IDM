package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201009b;

    public x(String allocationId, String categoryId) {
        Intrinsics.checkNotNullParameter(allocationId, "allocationId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f201008a = allocationId;
        this.f201009b = categoryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f201008a, xVar.f201008a) && Intrinsics.f(this.f201009b, xVar.f201009b);
    }

    public final int hashCode() {
        return this.f201009b.hashCode() + (this.f201008a.hashCode() * 31);
    }
}
