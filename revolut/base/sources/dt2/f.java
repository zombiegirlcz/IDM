package dt2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117348a;

    public f(String businessId) {
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        this.f117348a = businessId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f117348a, ((f) obj2).f117348a);
    }

    public final int hashCode() {
        return this.f117348a.hashCode();
    }
}
