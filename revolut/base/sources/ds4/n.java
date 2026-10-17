package ds4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117217a;

    public n(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f117217a = planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f117217a, ((n) obj2).f117217a);
    }

    public final int hashCode() {
        return this.f117217a.hashCode();
    }
}
