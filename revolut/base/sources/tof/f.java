package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272743b;

    public f(String transactionGroupId, String categoryId) {
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f272742a = transactionGroupId;
        this.f272743b = categoryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f272742a, fVar.f272742a) && Intrinsics.f(this.f272743b, fVar.f272743b);
    }

    public final int hashCode() {
        return this.f272743b.hashCode() + (this.f272742a.hashCode() * 31);
    }
}
