package f95;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f132832a;

    public f(dj0.d remainingAmount) {
        Intrinsics.checkNotNullParameter(remainingAmount, "remainingAmount");
        this.f132832a = remainingAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f132832a, ((f) obj2).f132832a);
    }

    public final int hashCode() {
        return this.f132832a.hashCode();
    }
}
